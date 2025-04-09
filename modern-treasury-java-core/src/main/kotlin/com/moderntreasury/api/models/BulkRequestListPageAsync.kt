// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.BulkRequestServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** list bulk_requests */
class BulkRequestListPageAsync
private constructor(
    private val bulkRequestsService: BulkRequestServiceAsync,
    private val params: BulkRequestListParams,
    private val headers: Headers,
    private val items: List<BulkRequest>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<BulkRequest> = items

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BulkRequestListPageAsync && bulkRequestsService == other.bulkRequestsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(bulkRequestsService, params, items) /* spotless:on */

    override fun toString() =
        "BulkRequestListPageAsync{bulkRequestsService=$bulkRequestsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<BulkRequestListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<BulkRequestListPageAsync>> {
        return getNextPageParams()
            .map { bulkRequestsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            bulkRequestsService: BulkRequestServiceAsync,
            params: BulkRequestListParams,
            headers: Headers,
            items: List<BulkRequest>,
        ) = BulkRequestListPageAsync(bulkRequestsService, params, headers, items)
    }

    class AutoPager(private val firstPage: BulkRequestListPageAsync) {

        fun forEach(action: Predicate<BulkRequest>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<BulkRequestListPageAsync>>.forEach(
                action: (BulkRequest) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<BulkRequest>> {
            val values = mutableListOf<BulkRequest>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
