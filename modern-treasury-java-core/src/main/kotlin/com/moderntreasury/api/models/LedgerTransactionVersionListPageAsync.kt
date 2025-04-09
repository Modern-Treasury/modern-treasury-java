// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.ledgerTransactions.VersionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** Get a list of ledger transaction versions. */
class LedgerTransactionVersionListPageAsync
private constructor(
    private val versionsService: VersionServiceAsync,
    private val params: LedgerTransactionVersionListParams,
    private val headers: Headers,
    private val items: List<LedgerTransactionVersion>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<LedgerTransactionVersion> = items

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerTransactionVersionListPageAsync && versionsService == other.versionsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(versionsService, params, items) /* spotless:on */

    override fun toString() =
        "LedgerTransactionVersionListPageAsync{versionsService=$versionsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<LedgerTransactionVersionListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<LedgerTransactionVersionListPageAsync>> {
        return getNextPageParams()
            .map { versionsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            versionsService: VersionServiceAsync,
            params: LedgerTransactionVersionListParams,
            headers: Headers,
            items: List<LedgerTransactionVersion>,
        ) = LedgerTransactionVersionListPageAsync(versionsService, params, headers, items)
    }

    class AutoPager(private val firstPage: LedgerTransactionVersionListPageAsync) {

        fun forEach(
            action: Predicate<LedgerTransactionVersion>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<LedgerTransactionVersionListPageAsync>>.forEach(
                action: (LedgerTransactionVersion) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<LedgerTransactionVersion>> {
            val values = mutableListOf<LedgerTransactionVersion>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
