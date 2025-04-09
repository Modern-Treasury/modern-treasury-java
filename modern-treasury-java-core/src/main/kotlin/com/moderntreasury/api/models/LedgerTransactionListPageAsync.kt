// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.LedgerTransactionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** Get a list of ledger transactions. */
class LedgerTransactionListPageAsync
private constructor(
    private val ledgerTransactionsService: LedgerTransactionServiceAsync,
    private val params: LedgerTransactionListParams,
    private val headers: Headers,
    private val items: List<LedgerTransaction>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<LedgerTransaction> = items

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerTransactionListPageAsync && ledgerTransactionsService == other.ledgerTransactionsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(ledgerTransactionsService, params, items) /* spotless:on */

    override fun toString() =
        "LedgerTransactionListPageAsync{ledgerTransactionsService=$ledgerTransactionsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<LedgerTransactionListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<LedgerTransactionListPageAsync>> {
        return getNextPageParams()
            .map { ledgerTransactionsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            ledgerTransactionsService: LedgerTransactionServiceAsync,
            params: LedgerTransactionListParams,
            headers: Headers,
            items: List<LedgerTransaction>,
        ) = LedgerTransactionListPageAsync(ledgerTransactionsService, params, headers, items)
    }

    class AutoPager(private val firstPage: LedgerTransactionListPageAsync) {

        fun forEach(
            action: Predicate<LedgerTransaction>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<LedgerTransactionListPageAsync>>.forEach(
                action: (LedgerTransaction) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<LedgerTransaction>> {
            val values = mutableListOf<LedgerTransaction>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
