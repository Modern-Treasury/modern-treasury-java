// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.LedgerEntryServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** Get a list of all ledger entries. */
class LedgerEntryListPageAsync
private constructor(
    private val ledgerEntriesService: LedgerEntryServiceAsync,
    private val params: LedgerEntryListParams,
    private val headers: Headers,
    private val items: List<LedgerEntry>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<LedgerEntry> = items

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerEntryListPageAsync && ledgerEntriesService == other.ledgerEntriesService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(ledgerEntriesService, params, items) /* spotless:on */

    override fun toString() =
        "LedgerEntryListPageAsync{ledgerEntriesService=$ledgerEntriesService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<LedgerEntryListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<LedgerEntryListPageAsync>> {
        return getNextPageParams()
            .map { ledgerEntriesService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            ledgerEntriesService: LedgerEntryServiceAsync,
            params: LedgerEntryListParams,
            headers: Headers,
            items: List<LedgerEntry>,
        ) = LedgerEntryListPageAsync(ledgerEntriesService, params, headers, items)
    }

    class AutoPager(private val firstPage: LedgerEntryListPageAsync) {

        fun forEach(action: Predicate<LedgerEntry>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<LedgerEntryListPageAsync>>.forEach(
                action: (LedgerEntry) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<LedgerEntry>> {
            val values = mutableListOf<LedgerEntry>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
