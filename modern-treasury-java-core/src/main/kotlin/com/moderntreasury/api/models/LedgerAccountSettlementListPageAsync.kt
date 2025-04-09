// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.LedgerAccountSettlementServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** Get a list of ledger account settlements. */
class LedgerAccountSettlementListPageAsync
private constructor(
    private val ledgerAccountSettlementsService: LedgerAccountSettlementServiceAsync,
    private val params: LedgerAccountSettlementListParams,
    private val headers: Headers,
    private val items: List<LedgerAccountSettlement>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<LedgerAccountSettlement> = items

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerAccountSettlementListPageAsync && ledgerAccountSettlementsService == other.ledgerAccountSettlementsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(ledgerAccountSettlementsService, params, items) /* spotless:on */

    override fun toString() =
        "LedgerAccountSettlementListPageAsync{ledgerAccountSettlementsService=$ledgerAccountSettlementsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<LedgerAccountSettlementListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<LedgerAccountSettlementListPageAsync>> {
        return getNextPageParams()
            .map { ledgerAccountSettlementsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            ledgerAccountSettlementsService: LedgerAccountSettlementServiceAsync,
            params: LedgerAccountSettlementListParams,
            headers: Headers,
            items: List<LedgerAccountSettlement>,
        ) =
            LedgerAccountSettlementListPageAsync(
                ledgerAccountSettlementsService,
                params,
                headers,
                items,
            )
    }

    class AutoPager(private val firstPage: LedgerAccountSettlementListPageAsync) {

        fun forEach(
            action: Predicate<LedgerAccountSettlement>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<LedgerAccountSettlementListPageAsync>>.forEach(
                action: (LedgerAccountSettlement) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<LedgerAccountSettlement>> {
            val values = mutableListOf<LedgerAccountSettlement>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
