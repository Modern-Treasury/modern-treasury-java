// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.IncomingPaymentDetailServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** Get a list of Incoming Payment Details. */
class IncomingPaymentDetailListPageAsync
private constructor(
    private val incomingPaymentDetailsService: IncomingPaymentDetailServiceAsync,
    private val params: IncomingPaymentDetailListParams,
    private val headers: Headers,
    private val items: List<IncomingPaymentDetail>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<IncomingPaymentDetail> = items

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is IncomingPaymentDetailListPageAsync && incomingPaymentDetailsService == other.incomingPaymentDetailsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(incomingPaymentDetailsService, params, items) /* spotless:on */

    override fun toString() =
        "IncomingPaymentDetailListPageAsync{incomingPaymentDetailsService=$incomingPaymentDetailsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<IncomingPaymentDetailListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<IncomingPaymentDetailListPageAsync>> {
        return getNextPageParams()
            .map { incomingPaymentDetailsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            incomingPaymentDetailsService: IncomingPaymentDetailServiceAsync,
            params: IncomingPaymentDetailListParams,
            headers: Headers,
            items: List<IncomingPaymentDetail>,
        ) =
            IncomingPaymentDetailListPageAsync(
                incomingPaymentDetailsService,
                params,
                headers,
                items,
            )
    }

    class AutoPager(private val firstPage: IncomingPaymentDetailListPageAsync) {

        fun forEach(
            action: Predicate<IncomingPaymentDetail>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<IncomingPaymentDetailListPageAsync>>.forEach(
                action: (IncomingPaymentDetail) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<IncomingPaymentDetail>> {
            val values = mutableListOf<IncomingPaymentDetail>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
