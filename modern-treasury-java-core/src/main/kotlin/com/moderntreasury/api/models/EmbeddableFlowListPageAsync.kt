// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPagerAsync
import com.moderntreasury.api.core.PageAsync
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.EmbeddableFlowServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see EmbeddableFlowServiceAsync.list */
class EmbeddableFlowListPageAsync
private constructor(
    private val service: EmbeddableFlowServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: EmbeddableFlowListParams,
    private val headers: Headers,
    private val items: List<EmbeddableFlow>,
) : PageAsync<EmbeddableFlow> {

    fun perPage(): Optional<String> =
        Optional.ofNullable(headers.values("X-Per-Page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("X-After-Cursor").firstOrNull())

    override fun hasNextPage(): Boolean = afterCursor().isPresent

    fun nextPageParams(): EmbeddableFlowListParams {
        val nextCursor =
            afterCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<EmbeddableFlowListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<EmbeddableFlow> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): EmbeddableFlowListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<EmbeddableFlow> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EmbeddableFlowListPageAsync].
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

    /** A builder for [EmbeddableFlowListPageAsync]. */
    class Builder internal constructor() {

        private var service: EmbeddableFlowServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: EmbeddableFlowListParams? = null
        private var headers: Headers? = null
        private var items: List<EmbeddableFlow>? = null

        @JvmSynthetic
        internal fun from(embeddableFlowListPageAsync: EmbeddableFlowListPageAsync) = apply {
            service = embeddableFlowListPageAsync.service
            streamHandlerExecutor = embeddableFlowListPageAsync.streamHandlerExecutor
            params = embeddableFlowListPageAsync.params
            headers = embeddableFlowListPageAsync.headers
            items = embeddableFlowListPageAsync.items
        }

        fun service(service: EmbeddableFlowServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: EmbeddableFlowListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<EmbeddableFlow>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [EmbeddableFlowListPageAsync].
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
        fun build(): EmbeddableFlowListPageAsync =
            EmbeddableFlowListPageAsync(
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

        return other is EmbeddableFlowListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            headers == other.headers &&
            items == other.items
    }

    override fun hashCode(): Int =
        Objects.hash(service, streamHandlerExecutor, params, headers, items)

    override fun toString() =
        "EmbeddableFlowListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, headers=$headers, items=$items}"
}
