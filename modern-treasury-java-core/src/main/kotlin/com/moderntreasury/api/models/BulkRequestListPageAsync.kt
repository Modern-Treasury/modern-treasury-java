// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPagerAsync
import com.moderntreasury.api.core.PageAsync
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.BulkRequestServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see [BulkRequestServiceAsync.list] */
class BulkRequestListPageAsync
private constructor(
    private val service: BulkRequestServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: BulkRequestListParams,
    private val headers: Headers,
    private val items: List<BulkRequest>,
) : PageAsync<BulkRequest> {

    fun perPage(): Optional<String> =
        Optional.ofNullable(headers.values("X-Per-Page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("X-After-Cursor").firstOrNull())

    override fun hasNextPage(): Boolean = items().isNotEmpty() && afterCursor().isPresent

    fun nextPageParams(): BulkRequestListParams {
        val nextCursor =
            afterCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<BulkRequestListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<BulkRequest> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): BulkRequestListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<BulkRequest> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BulkRequestListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .headers()
         * .items()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BulkRequestListPageAsync]. */
    class Builder internal constructor() {

        private var service: BulkRequestServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: BulkRequestListParams? = null
        private var headers: Headers? = null
        private var items: List<BulkRequest>? = null

        @JvmSynthetic
        internal fun from(bulkRequestListPageAsync: BulkRequestListPageAsync) = apply {
            service = bulkRequestListPageAsync.service
            streamHandlerExecutor = bulkRequestListPageAsync.streamHandlerExecutor
            params = bulkRequestListPageAsync.params
            headers = bulkRequestListPageAsync.headers
            items = bulkRequestListPageAsync.items
        }

        fun service(service: BulkRequestServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: BulkRequestListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<BulkRequest>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [BulkRequestListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .headers()
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BulkRequestListPageAsync =
            BulkRequestListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("headers", headers),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BulkRequestListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, headers, items) /* spotless:on */

    override fun toString() =
        "BulkRequestListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, headers=$headers, items=$items}"
}
