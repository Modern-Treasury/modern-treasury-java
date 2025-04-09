// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.LedgerEventHandlerService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** Get a list of ledger event handlers. */
class LedgerEventHandlerListPage
private constructor(
    private val ledgerEventHandlersService: LedgerEventHandlerService,
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

        return /* spotless:off */ other is LedgerEventHandlerListPage && ledgerEventHandlersService == other.ledgerEventHandlersService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(ledgerEventHandlersService, params, items) /* spotless:on */

    override fun toString() =
        "LedgerEventHandlerListPage{ledgerEventHandlersService=$ledgerEventHandlersService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<LedgerEventHandlerListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<LedgerEventHandlerListPage> {
        return getNextPageParams().map { ledgerEventHandlersService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            ledgerEventHandlersService: LedgerEventHandlerService,
            params: LedgerEventHandlerListParams,
            headers: Headers,
            items: List<LedgerEventHandler>,
        ) = LedgerEventHandlerListPage(ledgerEventHandlersService, params, headers, items)
    }

    class AutoPager(private val firstPage: LedgerEventHandlerListPage) :
        Iterable<LedgerEventHandler> {

        override fun iterator(): Iterator<LedgerEventHandler> = iterator {
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

        fun stream(): Stream<LedgerEventHandler> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
