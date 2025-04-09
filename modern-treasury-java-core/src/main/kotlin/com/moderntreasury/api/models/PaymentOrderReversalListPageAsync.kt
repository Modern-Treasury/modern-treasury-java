// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.paymentOrders.ReversalServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** Get a list of all reversals of a payment order. */
class PaymentOrderReversalListPageAsync
private constructor(
    private val reversalsService: ReversalServiceAsync,
    private val params: PaymentOrderReversalListParams,
    private val headers: Headers,
    private val items: List<Reversal>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<Reversal> = items

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentOrderReversalListPageAsync && reversalsService == other.reversalsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(reversalsService, params, items) /* spotless:on */

    override fun toString() =
        "PaymentOrderReversalListPageAsync{reversalsService=$reversalsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<PaymentOrderReversalListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<PaymentOrderReversalListPageAsync>> {
        return getNextPageParams()
            .map { reversalsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            reversalsService: ReversalServiceAsync,
            params: PaymentOrderReversalListParams,
            headers: Headers,
            items: List<Reversal>,
        ) = PaymentOrderReversalListPageAsync(reversalsService, params, headers, items)
    }

    class AutoPager(private val firstPage: PaymentOrderReversalListPageAsync) {

        fun forEach(action: Predicate<Reversal>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<PaymentOrderReversalListPageAsync>>.forEach(
                action: (Reversal) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<Reversal>> {
            val values = mutableListOf<Reversal>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
