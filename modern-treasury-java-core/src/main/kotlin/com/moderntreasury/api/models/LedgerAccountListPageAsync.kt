// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.LedgerAccountServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** Get a list of ledger accounts. */
class LedgerAccountListPageAsync
private constructor(
    private val ledgerAccountsService: LedgerAccountServiceAsync,
    private val params: LedgerAccountListParams,
    private val headers: Headers,
    private val items: List<LedgerAccount>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<LedgerAccount> = items

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerAccountListPageAsync && ledgerAccountsService == other.ledgerAccountsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(ledgerAccountsService, params, items) /* spotless:on */

    override fun toString() =
        "LedgerAccountListPageAsync{ledgerAccountsService=$ledgerAccountsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<LedgerAccountListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<LedgerAccountListPageAsync>> {
        return getNextPageParams()
            .map { ledgerAccountsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            ledgerAccountsService: LedgerAccountServiceAsync,
            params: LedgerAccountListParams,
            headers: Headers,
            items: List<LedgerAccount>,
        ) = LedgerAccountListPageAsync(ledgerAccountsService, params, headers, items)
    }

    class AutoPager(private val firstPage: LedgerAccountListPageAsync) {

        fun forEach(action: Predicate<LedgerAccount>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<LedgerAccountListPageAsync>>.forEach(
                action: (LedgerAccount) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<LedgerAccount>> {
            val values = mutableListOf<LedgerAccount>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
