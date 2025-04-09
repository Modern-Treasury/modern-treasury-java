// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.BulkResultServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** list bulk_results */
class BulkResultListPageAsync
private constructor(
    private val bulkResultsService: BulkResultServiceAsync,
    private val params: BulkResultListParams,
    private val headers: Headers,
    private val items: List<BulkResult>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<BulkResult> = items

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BulkResultListPageAsync && bulkResultsService == other.bulkResultsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(bulkResultsService, params, items) /* spotless:on */

    override fun toString() =
        "BulkResultListPageAsync{bulkResultsService=$bulkResultsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<BulkResultListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<BulkResultListPageAsync>> {
        return getNextPageParams()
            .map { bulkResultsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            bulkResultsService: BulkResultServiceAsync,
            params: BulkResultListParams,
            headers: Headers,
            items: List<BulkResult>,
        ) = BulkResultListPageAsync(bulkResultsService, params, headers, items)
    }

    class AutoPager(private val firstPage: BulkResultListPageAsync) {

        fun forEach(action: Predicate<BulkResult>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<BulkResultListPageAsync>>.forEach(
                action: (BulkResult) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<BulkResult>> {
            val values = mutableListOf<BulkResult>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
