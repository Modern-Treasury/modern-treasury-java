// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.LedgerAccountBalanceMonitorService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** Get a list of ledger account balance monitors. */
class LedgerAccountBalanceMonitorListPage
private constructor(
    private val ledgerAccountBalanceMonitorsService: LedgerAccountBalanceMonitorService,
    private val params: LedgerAccountBalanceMonitorListParams,
    private val headers: Headers,
    private val items: List<LedgerAccountBalanceMonitor>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<LedgerAccountBalanceMonitor> = items

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerAccountBalanceMonitorListPage && ledgerAccountBalanceMonitorsService == other.ledgerAccountBalanceMonitorsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(ledgerAccountBalanceMonitorsService, params, items) /* spotless:on */

    override fun toString() =
        "LedgerAccountBalanceMonitorListPage{ledgerAccountBalanceMonitorsService=$ledgerAccountBalanceMonitorsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<LedgerAccountBalanceMonitorListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<LedgerAccountBalanceMonitorListPage> {
        return getNextPageParams().map { ledgerAccountBalanceMonitorsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            ledgerAccountBalanceMonitorsService: LedgerAccountBalanceMonitorService,
            params: LedgerAccountBalanceMonitorListParams,
            headers: Headers,
            items: List<LedgerAccountBalanceMonitor>,
        ) =
            LedgerAccountBalanceMonitorListPage(
                ledgerAccountBalanceMonitorsService,
                params,
                headers,
                items,
            )
    }

    class AutoPager(private val firstPage: LedgerAccountBalanceMonitorListPage) :
        Iterable<LedgerAccountBalanceMonitor> {

        override fun iterator(): Iterator<LedgerAccountBalanceMonitor> = iterator {
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

        fun stream(): Stream<LedgerAccountBalanceMonitor> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
