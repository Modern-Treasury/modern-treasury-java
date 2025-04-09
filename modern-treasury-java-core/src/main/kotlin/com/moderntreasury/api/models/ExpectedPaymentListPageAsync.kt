// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.ExpectedPaymentServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** list expected_payments */
class ExpectedPaymentListPageAsync
private constructor(
    private val expectedPaymentsService: ExpectedPaymentServiceAsync,
    private val params: ExpectedPaymentListParams,
    private val headers: Headers,
    private val items: List<ExpectedPayment>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<ExpectedPayment> = items

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExpectedPaymentListPageAsync && expectedPaymentsService == other.expectedPaymentsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(expectedPaymentsService, params, items) /* spotless:on */

    override fun toString() =
        "ExpectedPaymentListPageAsync{expectedPaymentsService=$expectedPaymentsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<ExpectedPaymentListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<ExpectedPaymentListPageAsync>> {
        return getNextPageParams()
            .map { expectedPaymentsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            expectedPaymentsService: ExpectedPaymentServiceAsync,
            params: ExpectedPaymentListParams,
            headers: Headers,
            items: List<ExpectedPayment>,
        ) = ExpectedPaymentListPageAsync(expectedPaymentsService, params, headers, items)
    }

    class AutoPager(private val firstPage: ExpectedPaymentListPageAsync) {

        fun forEach(
            action: Predicate<ExpectedPayment>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<ExpectedPaymentListPageAsync>>.forEach(
                action: (ExpectedPayment) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<ExpectedPayment>> {
            val values = mutableListOf<ExpectedPayment>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
