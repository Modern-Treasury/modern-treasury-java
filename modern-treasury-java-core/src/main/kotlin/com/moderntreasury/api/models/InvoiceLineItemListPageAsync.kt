// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.invoices.LineItemServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** list invoice_line_items */
class InvoiceLineItemListPageAsync
private constructor(
    private val lineItemsService: LineItemServiceAsync,
    private val params: InvoiceLineItemListParams,
    private val headers: Headers,
    private val items: List<InvoiceLineItem>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<InvoiceLineItem> = items

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InvoiceLineItemListPageAsync && lineItemsService == other.lineItemsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(lineItemsService, params, items) /* spotless:on */

    override fun toString() =
        "InvoiceLineItemListPageAsync{lineItemsService=$lineItemsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<InvoiceLineItemListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<InvoiceLineItemListPageAsync>> {
        return getNextPageParams()
            .map { lineItemsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            lineItemsService: LineItemServiceAsync,
            params: InvoiceLineItemListParams,
            headers: Headers,
            items: List<InvoiceLineItem>,
        ) = InvoiceLineItemListPageAsync(lineItemsService, params, headers, items)
    }

    class AutoPager(private val firstPage: InvoiceLineItemListPageAsync) {

        fun forEach(
            action: Predicate<InvoiceLineItem>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<InvoiceLineItemListPageAsync>>.forEach(
                action: (InvoiceLineItem) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<InvoiceLineItem>> {
            val values = mutableListOf<InvoiceLineItem>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
