// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.ForeignExchangeQuoteServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** list foreign_exchange_quotes */
class ForeignExchangeQuoteListPageAsync
private constructor(
    private val foreignExchangeQuotesService: ForeignExchangeQuoteServiceAsync,
    private val params: ForeignExchangeQuoteListParams,
    private val headers: Headers,
    private val items: List<ForeignExchangeQuote>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<ForeignExchangeQuote> = items

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ForeignExchangeQuoteListPageAsync && foreignExchangeQuotesService == other.foreignExchangeQuotesService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(foreignExchangeQuotesService, params, items) /* spotless:on */

    override fun toString() =
        "ForeignExchangeQuoteListPageAsync{foreignExchangeQuotesService=$foreignExchangeQuotesService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<ForeignExchangeQuoteListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<ForeignExchangeQuoteListPageAsync>> {
        return getNextPageParams()
            .map { foreignExchangeQuotesService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            foreignExchangeQuotesService: ForeignExchangeQuoteServiceAsync,
            params: ForeignExchangeQuoteListParams,
            headers: Headers,
            items: List<ForeignExchangeQuote>,
        ) = ForeignExchangeQuoteListPageAsync(foreignExchangeQuotesService, params, headers, items)
    }

    class AutoPager(private val firstPage: ForeignExchangeQuoteListPageAsync) {

        fun forEach(
            action: Predicate<ForeignExchangeQuote>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<ForeignExchangeQuoteListPageAsync>>.forEach(
                action: (ForeignExchangeQuote) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<ForeignExchangeQuote>> {
            val values = mutableListOf<ForeignExchangeQuote>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
