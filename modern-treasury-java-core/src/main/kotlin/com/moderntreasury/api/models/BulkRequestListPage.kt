// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.BulkRequestService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** list bulk_requests */
class BulkRequestListPage
private constructor(
    private val bulkRequestsService: BulkRequestService,
    private val params: BulkRequestListParams,
    private val headers: Headers,
    private val items: List<BulkRequest>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<BulkRequest> = items

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BulkRequestListPage && bulkRequestsService == other.bulkRequestsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(bulkRequestsService, params, items) /* spotless:on */

    override fun toString() =
        "BulkRequestListPage{bulkRequestsService=$bulkRequestsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<BulkRequestListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<BulkRequestListPage> {
        return getNextPageParams().map { bulkRequestsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            bulkRequestsService: BulkRequestService,
            params: BulkRequestListParams,
            headers: Headers,
            items: List<BulkRequest>,
        ) = BulkRequestListPage(bulkRequestsService, params, headers, items)
    }

    class AutoPager(private val firstPage: BulkRequestListPage) : Iterable<BulkRequest> {

        override fun iterator(): Iterator<BulkRequest> = iterator {
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

        fun stream(): Stream<BulkRequest> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
