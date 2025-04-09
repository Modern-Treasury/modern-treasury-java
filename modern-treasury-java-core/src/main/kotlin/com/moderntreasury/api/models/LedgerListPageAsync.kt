// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.LedgerServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** Get a list of ledgers. */
class LedgerListPageAsync
private constructor(
    private val ledgersService: LedgerServiceAsync,
    private val params: LedgerListParams,
    private val headers: Headers,
    private val items: List<Ledger>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<Ledger> = items

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerListPageAsync && ledgersService == other.ledgersService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(ledgersService, params, items) /* spotless:on */

    override fun toString() =
        "LedgerListPageAsync{ledgersService=$ledgersService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<LedgerListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<LedgerListPageAsync>> {
        return getNextPageParams()
            .map { ledgersService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            ledgersService: LedgerServiceAsync,
            params: LedgerListParams,
            headers: Headers,
            items: List<Ledger>,
        ) = LedgerListPageAsync(ledgersService, params, headers, items)
    }

    class AutoPager(private val firstPage: LedgerListPageAsync) {

        fun forEach(action: Predicate<Ledger>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<LedgerListPageAsync>>.forEach(
                action: (Ledger) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<Ledger>> {
            val values = mutableListOf<Ledger>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
