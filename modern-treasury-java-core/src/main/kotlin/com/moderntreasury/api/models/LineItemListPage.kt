// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.LineItemService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** Get a list of line items */
class LineItemListPage
private constructor(
    private val lineItemsService: LineItemService,
    private val params: LineItemListParams,
    private val headers: Headers,
    private val items: List<LineItem>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<LineItem> = items

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LineItemListPage && lineItemsService == other.lineItemsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(lineItemsService, params, items) /* spotless:on */

    override fun toString() =
        "LineItemListPage{lineItemsService=$lineItemsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<LineItemListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<LineItemListPage> {
        return getNextPageParams().map { lineItemsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            lineItemsService: LineItemService,
            params: LineItemListParams,
            headers: Headers,
            items: List<LineItem>,
        ) = LineItemListPage(lineItemsService, params, headers, items)
    }

    class AutoPager(private val firstPage: LineItemListPage) : Iterable<LineItem> {

        override fun iterator(): Iterator<LineItem> = iterator {
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

        fun stream(): Stream<LineItem> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
