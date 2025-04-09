// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.PaymentFlowServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** list payment_flows */
class PaymentFlowListPageAsync
private constructor(
    private val paymentFlowsService: PaymentFlowServiceAsync,
    private val params: PaymentFlowListParams,
    private val headers: Headers,
    private val items: List<PaymentFlow>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<PaymentFlow> = items

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentFlowListPageAsync && paymentFlowsService == other.paymentFlowsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(paymentFlowsService, params, items) /* spotless:on */

    override fun toString() =
        "PaymentFlowListPageAsync{paymentFlowsService=$paymentFlowsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<PaymentFlowListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<PaymentFlowListPageAsync>> {
        return getNextPageParams()
            .map { paymentFlowsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            paymentFlowsService: PaymentFlowServiceAsync,
            params: PaymentFlowListParams,
            headers: Headers,
            items: List<PaymentFlow>,
        ) = PaymentFlowListPageAsync(paymentFlowsService, params, headers, items)
    }

    class AutoPager(private val firstPage: PaymentFlowListPageAsync) {

        fun forEach(action: Predicate<PaymentFlow>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<PaymentFlowListPageAsync>>.forEach(
                action: (PaymentFlow) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<PaymentFlow>> {
            val values = mutableListOf<PaymentFlow>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
