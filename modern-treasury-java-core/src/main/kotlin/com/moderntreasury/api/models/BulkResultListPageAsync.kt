// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPagerAsync
import com.moderntreasury.api.core.PageAsync
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.BulkResultServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see BulkResultServiceAsync.list */
class BulkResultListPageAsync
private constructor(
    private val service: BulkResultServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: BulkResultListParams,
    private val headers: Headers,
    private val items: List<BulkResult>,
) : PageAsync<BulkResult> {

    fun perPage(): Optional<String> =
        Optional.ofNullable(headers.values("X-Per-Page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("X-After-Cursor").firstOrNull())

    override fun hasNextPage(): Boolean = afterCursor().isPresent

    fun nextPageParams(): BulkResultListParams {
        val nextCursor =
            afterCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<BulkResultListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<BulkResult> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): BulkResultListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<BulkResult> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BulkResultListPageAsync].
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

    /** A builder for [BulkResultListPageAsync]. */
    class Builder internal constructor() {

        private var service: BulkResultServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: BulkResultListParams? = null
        private var headers: Headers? = null
        private var items: List<BulkResult>? = null

        @JvmSynthetic
        internal fun from(bulkResultListPageAsync: BulkResultListPageAsync) = apply {
            service = bulkResultListPageAsync.service
            streamHandlerExecutor = bulkResultListPageAsync.streamHandlerExecutor
            params = bulkResultListPageAsync.params
            headers = bulkResultListPageAsync.headers
            items = bulkResultListPageAsync.items
        }

        fun service(service: BulkResultServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: BulkResultListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<BulkResult>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [BulkResultListPageAsync].
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
        fun build(): BulkResultListPageAsync =
            BulkResultListPageAsync(
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

        return other is BulkResultListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            headers == other.headers &&
            items == other.items
    }

    override fun hashCode(): Int =
        Objects.hash(service, streamHandlerExecutor, params, headers, items)

    override fun toString() =
        "BulkResultListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, headers=$headers, items=$items}"
}
