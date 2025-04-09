// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.transactions.LineItemServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** list transaction_line_items */
class TransactionLineItemListPageAsync
private constructor(
    private val lineItemsService: LineItemServiceAsync,
    private val params: TransactionLineItemListParams,
    private val headers: Headers,
    private val items: List<TransactionLineItem>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<TransactionLineItem> = items

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TransactionLineItemListPageAsync && lineItemsService == other.lineItemsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(lineItemsService, params, items) /* spotless:on */

    override fun toString() =
        "TransactionLineItemListPageAsync{lineItemsService=$lineItemsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<TransactionLineItemListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<TransactionLineItemListPageAsync>> {
        return getNextPageParams()
            .map { lineItemsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            lineItemsService: LineItemServiceAsync,
            params: TransactionLineItemListParams,
            headers: Headers,
            items: List<TransactionLineItem>,
        ) = TransactionLineItemListPageAsync(lineItemsService, params, headers, items)
    }

    class AutoPager(private val firstPage: TransactionLineItemListPageAsync) {

        fun forEach(
            action: Predicate<TransactionLineItem>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<TransactionLineItemListPageAsync>>.forEach(
                action: (TransactionLineItem) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<TransactionLineItem>> {
            val values = mutableListOf<TransactionLineItem>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
