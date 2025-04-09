// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.internalAccounts.BalanceReportServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** Get all balance reports for a given internal account. */
class BalanceReportListPageAsync
private constructor(
    private val balanceReportsService: BalanceReportServiceAsync,
    private val params: BalanceReportListParams,
    private val headers: Headers,
    private val items: List<BalanceReport>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<BalanceReport> = items

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BalanceReportListPageAsync && balanceReportsService == other.balanceReportsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(balanceReportsService, params, items) /* spotless:on */

    override fun toString() =
        "BalanceReportListPageAsync{balanceReportsService=$balanceReportsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<BalanceReportListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<BalanceReportListPageAsync>> {
        return getNextPageParams()
            .map { balanceReportsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            balanceReportsService: BalanceReportServiceAsync,
            params: BalanceReportListParams,
            headers: Headers,
            items: List<BalanceReport>,
        ) = BalanceReportListPageAsync(balanceReportsService, params, headers, items)
    }

    class AutoPager(private val firstPage: BalanceReportListPageAsync) {

        fun forEach(action: Predicate<BalanceReport>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<BalanceReportListPageAsync>>.forEach(
                action: (BalanceReport) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<BalanceReport>> {
            val values = mutableListOf<BalanceReport>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
