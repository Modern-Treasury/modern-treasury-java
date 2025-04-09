// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.TransactionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** Get a list of all transactions. */
class TransactionListPageAsync
private constructor(
    private val transactionsService: TransactionServiceAsync,
    private val params: TransactionListParams,
    private val headers: Headers,
    private val items: List<Transaction>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<Transaction> = items

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TransactionListPageAsync && transactionsService == other.transactionsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(transactionsService, params, items) /* spotless:on */

    override fun toString() =
        "TransactionListPageAsync{transactionsService=$transactionsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<TransactionListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<TransactionListPageAsync>> {
        return getNextPageParams()
            .map { transactionsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            transactionsService: TransactionServiceAsync,
            params: TransactionListParams,
            headers: Headers,
            items: List<Transaction>,
        ) = TransactionListPageAsync(transactionsService, params, headers, items)
    }

    class AutoPager(private val firstPage: TransactionListPageAsync) {

        fun forEach(action: Predicate<Transaction>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<TransactionListPageAsync>>.forEach(
                action: (Transaction) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<Transaction>> {
            val values = mutableListOf<Transaction>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
