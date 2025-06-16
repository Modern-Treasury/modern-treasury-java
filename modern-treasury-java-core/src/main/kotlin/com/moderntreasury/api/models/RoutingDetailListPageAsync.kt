// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPagerAsync
import com.moderntreasury.api.core.PageAsync
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.RoutingDetailServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see [RoutingDetailServiceAsync.list] */
class RoutingDetailListPageAsync
private constructor(
    private val service: RoutingDetailServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: RoutingDetailListParams,
    private val headers: Headers,
    private val items: List<RoutingDetail>,
) : PageAsync<RoutingDetail> {

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun hasNextPage(): Boolean = items().isNotEmpty() && afterCursor().isPresent

    fun nextPageParams(): RoutingDetailListParams {
        val nextCursor =
            afterCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<RoutingDetailListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<RoutingDetail> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): RoutingDetailListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<RoutingDetail> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RoutingDetailListPageAsync].
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

    /** A builder for [RoutingDetailListPageAsync]. */
    class Builder internal constructor() {

        private var service: RoutingDetailServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: RoutingDetailListParams? = null
        private var headers: Headers? = null
        private var items: List<RoutingDetail>? = null

        @JvmSynthetic
        internal fun from(routingDetailListPageAsync: RoutingDetailListPageAsync) = apply {
            service = routingDetailListPageAsync.service
            streamHandlerExecutor = routingDetailListPageAsync.streamHandlerExecutor
            params = routingDetailListPageAsync.params
            headers = routingDetailListPageAsync.headers
            items = routingDetailListPageAsync.items
        }

        fun service(service: RoutingDetailServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: RoutingDetailListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<RoutingDetail>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [RoutingDetailListPageAsync].
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
        fun build(): RoutingDetailListPageAsync =
            RoutingDetailListPageAsync(
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

        return /* spotless:off */ other is RoutingDetailListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, headers, items) /* spotless:on */

    override fun toString() =
        "RoutingDetailListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, headers=$headers, items=$items}"
}
