// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.PaymentOrderServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** Get a list of all payment orders */
class PaymentOrderListPageAsync
private constructor(
    private val paymentOrdersService: PaymentOrderServiceAsync,
    private val params: PaymentOrderListParams,
    private val headers: Headers,
    private val items: List<PaymentOrder>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<PaymentOrder> = items

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentOrderListPageAsync && paymentOrdersService == other.paymentOrdersService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(paymentOrdersService, params, items) /* spotless:on */

    override fun toString() =
        "PaymentOrderListPageAsync{paymentOrdersService=$paymentOrdersService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<PaymentOrderListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<PaymentOrderListPageAsync>> {
        return getNextPageParams()
            .map { paymentOrdersService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            paymentOrdersService: PaymentOrderServiceAsync,
            params: PaymentOrderListParams,
            headers: Headers,
            items: List<PaymentOrder>,
        ) = PaymentOrderListPageAsync(paymentOrdersService, params, headers, items)
    }

    class AutoPager(private val firstPage: PaymentOrderListPageAsync) {

        fun forEach(action: Predicate<PaymentOrder>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<PaymentOrderListPageAsync>>.forEach(
                action: (PaymentOrder) -> Boolean,
                executor: Executor,
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.items().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor,
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<PaymentOrder>> {
            val values = mutableListOf<PaymentOrder>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
