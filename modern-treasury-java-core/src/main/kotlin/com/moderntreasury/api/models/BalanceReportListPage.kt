// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.internalAccounts.BalanceReportService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** Get all balance reports for a given internal account. */
class BalanceReportListPage
private constructor(
    private val balanceReportsService: BalanceReportService,
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

        return /* spotless:off */ other is BalanceReportListPage && balanceReportsService == other.balanceReportsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(balanceReportsService, params, items) /* spotless:on */

    override fun toString() =
        "BalanceReportListPage{balanceReportsService=$balanceReportsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<BalanceReportListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<BalanceReportListPage> {
        return getNextPageParams().map { balanceReportsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            balanceReportsService: BalanceReportService,
            params: BalanceReportListParams,
            headers: Headers,
            items: List<BalanceReport>,
        ) = BalanceReportListPage(balanceReportsService, params, headers, items)
    }

    class AutoPager(private val firstPage: BalanceReportListPage) : Iterable<BalanceReport> {

        override fun iterator(): Iterator<BalanceReport> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.items().size) {
                    yield(page.items()[index++])
                }
                page = page.getNextPage().getOrNull() ?: break
                index = 0
            }
        }

        fun stream(): Stream<BalanceReport> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
