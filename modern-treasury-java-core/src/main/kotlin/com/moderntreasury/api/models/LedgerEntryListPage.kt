// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.LedgerEntryService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** Get a list of all ledger entries. */
class LedgerEntryListPage
private constructor(
    private val ledgerEntriesService: LedgerEntryService,
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

        return /* spotless:off */ other is LedgerEntryListPage && ledgerEntriesService == other.ledgerEntriesService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(ledgerEntriesService, params, items) /* spotless:on */

    override fun toString() =
        "LedgerEntryListPage{ledgerEntriesService=$ledgerEntriesService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<LedgerEntryListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<LedgerEntryListPage> {
        return getNextPageParams().map { ledgerEntriesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            ledgerEntriesService: LedgerEntryService,
            params: LedgerEntryListParams,
            headers: Headers,
            items: List<LedgerEntry>,
        ) = LedgerEntryListPage(ledgerEntriesService, params, headers, items)
    }

    class AutoPager(private val firstPage: LedgerEntryListPage) : Iterable<LedgerEntry> {

        override fun iterator(): Iterator<LedgerEntry> = iterator {
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

        fun stream(): Stream<LedgerEntry> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
