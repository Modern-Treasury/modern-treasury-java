// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.PaperItemServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** Get a list of all paper items. */
class PaperItemListPageAsync
private constructor(
    private val paperItemsService: PaperItemServiceAsync,
    private val params: PaperItemListParams,
    private val headers: Headers,
    private val items: List<PaperItem>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<PaperItem> = items

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaperItemListPageAsync && paperItemsService == other.paperItemsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(paperItemsService, params, items) /* spotless:on */

    override fun toString() =
        "PaperItemListPageAsync{paperItemsService=$paperItemsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<PaperItemListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<PaperItemListPageAsync>> {
        return getNextPageParams()
            .map { paperItemsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            paperItemsService: PaperItemServiceAsync,
            params: PaperItemListParams,
            headers: Headers,
            items: List<PaperItem>,
        ) = PaperItemListPageAsync(paperItemsService, params, headers, items)
    }

    class AutoPager(private val firstPage: PaperItemListPageAsync) {

        fun forEach(action: Predicate<PaperItem>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<PaperItemListPageAsync>>.forEach(
                action: (PaperItem) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<PaperItem>> {
            val values = mutableListOf<PaperItem>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
