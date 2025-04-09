// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.RoutingDetailServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** Get a list of routing details for a single internal or external account. */
class RoutingDetailListPageAsync
private constructor(
    private val routingDetailsService: RoutingDetailServiceAsync,
    private val params: RoutingDetailListParams,
    private val headers: Headers,
    private val items: List<RoutingDetail>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<RoutingDetail> = items

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RoutingDetailListPageAsync && routingDetailsService == other.routingDetailsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(routingDetailsService, params, items) /* spotless:on */

    override fun toString() =
        "RoutingDetailListPageAsync{routingDetailsService=$routingDetailsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<RoutingDetailListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<RoutingDetailListPageAsync>> {
        return getNextPageParams()
            .map { routingDetailsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            routingDetailsService: RoutingDetailServiceAsync,
            params: RoutingDetailListParams,
            headers: Headers,
            items: List<RoutingDetail>,
        ) = RoutingDetailListPageAsync(routingDetailsService, params, headers, items)
    }

    class AutoPager(private val firstPage: RoutingDetailListPageAsync) {

        fun forEach(action: Predicate<RoutingDetail>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<RoutingDetailListPageAsync>>.forEach(
                action: (RoutingDetail) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<RoutingDetail>> {
            val values = mutableListOf<RoutingDetail>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
