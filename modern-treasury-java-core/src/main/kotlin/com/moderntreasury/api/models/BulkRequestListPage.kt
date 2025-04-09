// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.BulkRequestService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** @see [BulkRequestService.list] */
class BulkRequestListPage
private constructor(
    private val service: BulkRequestService,
    private val params: BulkRequestListParams,
    private val headers: Headers,
    private val items: List<BulkRequest>,
) {

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<BulkRequestListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<BulkRequestListPage> = getNextPageParams().map { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): BulkRequestListParams = params

    /** The response that this page was parsed from. */
    fun items(): List<BulkRequest> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BulkRequestListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .headers()
         * .items()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BulkRequestListPage]. */
    class Builder internal constructor() {

        private var service: BulkRequestService? = null
        private var params: BulkRequestListParams? = null
        private var headers: Headers? = null
        private var items: List<BulkRequest>? = null

        @JvmSynthetic
        internal fun from(bulkRequestListPage: BulkRequestListPage) = apply {
            service = bulkRequestListPage.service
            params = bulkRequestListPage.params
            headers = bulkRequestListPage.headers
            items = bulkRequestListPage.items
        }

        fun service(service: BulkRequestService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BulkRequestListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<BulkRequest>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [BulkRequestListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .headers()
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BulkRequestListPage =
            BulkRequestListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("headers", headers),
                checkRequired("items", items),
            )
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BulkRequestListPage && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "BulkRequestListPage{service=$service, params=$params, headers=$headers, items=$items}"
}
