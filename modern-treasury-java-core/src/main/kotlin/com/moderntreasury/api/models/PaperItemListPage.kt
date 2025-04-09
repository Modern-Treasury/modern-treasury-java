// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.PaperItemService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** Get a list of all paper items. */
class PaperItemListPage
private constructor(
    private val paperItemsService: PaperItemService,
    private val params: PaperItemListParams,
    private val headers: Headers,
    private val items: List<PaperItem>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<PaperItem> = items

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaperItemListPage && paperItemsService == other.paperItemsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(paperItemsService, params, items) /* spotless:on */

    override fun toString() =
        "PaperItemListPage{paperItemsService=$paperItemsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<PaperItemListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<PaperItemListPage> {
        return getNextPageParams().map { paperItemsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            paperItemsService: PaperItemService,
            params: PaperItemListParams,
            headers: Headers,
            items: List<PaperItem>,
        ) = PaperItemListPage(paperItemsService, params, headers, items)
    }

    class AutoPager(private val firstPage: PaperItemListPage) : Iterable<PaperItem> {

        override fun iterator(): Iterator<PaperItem> = iterator {
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

        fun stream(): Stream<PaperItem> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
