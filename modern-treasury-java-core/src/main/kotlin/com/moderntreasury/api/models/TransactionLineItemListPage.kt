// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.transactions.LineItemService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** list transaction_line_items */
class TransactionLineItemListPage
private constructor(
    private val lineItemsService: LineItemService,
    private val params: TransactionLineItemListParams,
    private val headers: Headers,
    private val items: List<TransactionLineItem>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<TransactionLineItem> = items

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TransactionLineItemListPage && lineItemsService == other.lineItemsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(lineItemsService, params, items) /* spotless:on */

    override fun toString() =
        "TransactionLineItemListPage{lineItemsService=$lineItemsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<TransactionLineItemListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<TransactionLineItemListPage> {
        return getNextPageParams().map { lineItemsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            lineItemsService: LineItemService,
            params: TransactionLineItemListParams,
            headers: Headers,
            items: List<TransactionLineItem>,
        ) = TransactionLineItemListPage(lineItemsService, params, headers, items)
    }

    class AutoPager(private val firstPage: TransactionLineItemListPage) :
        Iterable<TransactionLineItem> {

        override fun iterator(): Iterator<TransactionLineItem> = iterator {
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

        fun stream(): Stream<TransactionLineItem> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
