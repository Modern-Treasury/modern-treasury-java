// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.LedgerAccountService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** Get a list of ledger accounts. */
class LedgerAccountListPage
private constructor(
    private val ledgerAccountsService: LedgerAccountService,
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

        return /* spotless:off */ other is LedgerAccountListPage && ledgerAccountsService == other.ledgerAccountsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(ledgerAccountsService, params, items) /* spotless:on */

    override fun toString() =
        "LedgerAccountListPage{ledgerAccountsService=$ledgerAccountsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<LedgerAccountListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<LedgerAccountListPage> {
        return getNextPageParams().map { ledgerAccountsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            ledgerAccountsService: LedgerAccountService,
            params: LedgerAccountListParams,
            headers: Headers,
            items: List<LedgerAccount>,
        ) = LedgerAccountListPage(ledgerAccountsService, params, headers, items)
    }

    class AutoPager(private val firstPage: LedgerAccountListPage) : Iterable<LedgerAccount> {

        override fun iterator(): Iterator<LedgerAccount> = iterator {
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

        fun stream(): Stream<LedgerAccount> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
