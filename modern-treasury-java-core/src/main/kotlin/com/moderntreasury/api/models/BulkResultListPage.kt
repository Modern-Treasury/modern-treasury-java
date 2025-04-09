// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.BulkResultService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** list bulk_results */
class BulkResultListPage
private constructor(
    private val bulkResultsService: BulkResultService,
    private val params: BulkResultListParams,
    private val headers: Headers,
    private val items: List<BulkResult>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<BulkResult> = items

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BulkResultListPage && bulkResultsService == other.bulkResultsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(bulkResultsService, params, items) /* spotless:on */

    override fun toString() =
        "BulkResultListPage{bulkResultsService=$bulkResultsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<BulkResultListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<BulkResultListPage> {
        return getNextPageParams().map { bulkResultsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            bulkResultsService: BulkResultService,
            params: BulkResultListParams,
            headers: Headers,
            items: List<BulkResult>,
        ) = BulkResultListPage(bulkResultsService, params, headers, items)
    }

    class AutoPager(private val firstPage: BulkResultListPage) : Iterable<BulkResult> {

        override fun iterator(): Iterator<BulkResult> = iterator {
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

        fun stream(): Stream<BulkResult> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
