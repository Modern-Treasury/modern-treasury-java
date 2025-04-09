// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.InvoiceServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** list invoices */
class InvoiceListPageAsync
private constructor(
    private val invoicesService: InvoiceServiceAsync,
    private val params: InvoiceListParams,
    private val headers: Headers,
    private val items: List<Invoice>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<Invoice> = items

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InvoiceListPageAsync && invoicesService == other.invoicesService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(invoicesService, params, items) /* spotless:on */

    override fun toString() =
        "InvoiceListPageAsync{invoicesService=$invoicesService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<InvoiceListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<InvoiceListPageAsync>> {
        return getNextPageParams()
            .map { invoicesService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            invoicesService: InvoiceServiceAsync,
            params: InvoiceListParams,
            headers: Headers,
            items: List<Invoice>,
        ) = InvoiceListPageAsync(invoicesService, params, headers, items)
    }

    class AutoPager(private val firstPage: InvoiceListPageAsync) {

        fun forEach(action: Predicate<Invoice>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<InvoiceListPageAsync>>.forEach(
                action: (Invoice) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<Invoice>> {
            val values = mutableListOf<Invoice>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
