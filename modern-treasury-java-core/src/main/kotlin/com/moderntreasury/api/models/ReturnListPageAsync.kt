// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPagerAsync
import com.moderntreasury.api.core.PageAsync
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.ReturnServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see ReturnServiceAsync.list */
class ReturnListPageAsync
private constructor(
    private val service: ReturnServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ReturnListParams,
    private val headers: Headers,
    private val items: List<ReturnObject>,
) : PageAsync<ReturnObject> {

    fun perPage(): Optional<String> =
        Optional.ofNullable(headers.values("X-Per-Page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("X-After-Cursor").firstOrNull())

    override fun hasNextPage(): Boolean = afterCursor().isPresent

    fun nextPageParams(): ReturnListParams {
        val nextCursor =
            afterCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<ReturnListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ReturnObject> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ReturnListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<ReturnObject> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ReturnListPageAsync].
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

    /** A builder for [ReturnListPageAsync]. */
    class Builder internal constructor() {

        private var service: ReturnServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ReturnListParams? = null
        private var headers: Headers? = null
        private var items: List<ReturnObject>? = null

        @JvmSynthetic
        internal fun from(returnListPageAsync: ReturnListPageAsync) = apply {
            service = returnListPageAsync.service
            streamHandlerExecutor = returnListPageAsync.streamHandlerExecutor
            params = returnListPageAsync.params
            headers = returnListPageAsync.headers
            items = returnListPageAsync.items
        }

        fun service(service: ReturnServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ReturnListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<ReturnObject>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [ReturnListPageAsync].
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
        fun build(): ReturnListPageAsync =
            ReturnListPageAsync(
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

        return other is ReturnListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            headers == other.headers &&
            items == other.items
    }

    override fun hashCode(): Int =
        Objects.hash(service, streamHandlerExecutor, params, headers, items)

    override fun toString() =
        "ReturnListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, headers=$headers, items=$items}"
}
