// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.DocumentServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** Get a list of documents. */
class DocumentListPageAsync
private constructor(
    private val documentsService: DocumentServiceAsync,
    private val params: DocumentListParams,
    private val headers: Headers,
    private val items: List<Document>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<Document> = items

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DocumentListPageAsync && documentsService == other.documentsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(documentsService, params, items) /* spotless:on */

    override fun toString() =
        "DocumentListPageAsync{documentsService=$documentsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<DocumentListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<DocumentListPageAsync>> {
        return getNextPageParams()
            .map { documentsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            documentsService: DocumentServiceAsync,
            params: DocumentListParams,
            headers: Headers,
            items: List<Document>,
        ) = DocumentListPageAsync(documentsService, params, headers, items)
    }

    class AutoPager(private val firstPage: DocumentListPageAsync) {

        fun forEach(action: Predicate<Document>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<DocumentListPageAsync>>.forEach(
                action: (Document) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<Document>> {
            val values = mutableListOf<Document>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
