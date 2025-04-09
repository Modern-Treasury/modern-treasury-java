// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.LedgerEventHandlerServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** Get a list of ledger event handlers. */
class LedgerEventHandlerListPageAsync
private constructor(
    private val ledgerEventHandlersService: LedgerEventHandlerServiceAsync,
    private val params: LedgerEventHandlerListParams,
    private val headers: Headers,
    private val items: List<LedgerEventHandler>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<LedgerEventHandler> = items

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerEventHandlerListPageAsync && ledgerEventHandlersService == other.ledgerEventHandlersService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(ledgerEventHandlersService, params, items) /* spotless:on */

    override fun toString() =
        "LedgerEventHandlerListPageAsync{ledgerEventHandlersService=$ledgerEventHandlersService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<LedgerEventHandlerListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<LedgerEventHandlerListPageAsync>> {
        return getNextPageParams()
            .map { ledgerEventHandlersService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            ledgerEventHandlersService: LedgerEventHandlerServiceAsync,
            params: LedgerEventHandlerListParams,
            headers: Headers,
            items: List<LedgerEventHandler>,
        ) = LedgerEventHandlerListPageAsync(ledgerEventHandlersService, params, headers, items)
    }

    class AutoPager(private val firstPage: LedgerEventHandlerListPageAsync) {

        fun forEach(
            action: Predicate<LedgerEventHandler>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<LedgerEventHandlerListPageAsync>>.forEach(
                action: (LedgerEventHandler) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<LedgerEventHandler>> {
            val values = mutableListOf<LedgerEventHandler>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
