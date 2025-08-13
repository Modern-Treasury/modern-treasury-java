// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPagerAsync
import com.moderntreasury.api.core.PageAsync
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.IncomingPaymentDetailServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see IncomingPaymentDetailServiceAsync.list */
class IncomingPaymentDetailListPageAsync
private constructor(
    private val service: IncomingPaymentDetailServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: IncomingPaymentDetailListParams,
    private val headers: Headers,
    private val items: List<IncomingPaymentDetail>,
) : PageAsync<IncomingPaymentDetail> {

    fun perPage(): Optional<String> =
        Optional.ofNullable(headers.values("X-Per-Page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("X-After-Cursor").firstOrNull())

    override fun hasNextPage(): Boolean = items().isNotEmpty() && afterCursor().isPresent

    fun nextPageParams(): IncomingPaymentDetailListParams {
        val nextCursor =
            afterCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<IncomingPaymentDetailListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<IncomingPaymentDetail> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): IncomingPaymentDetailListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<IncomingPaymentDetail> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [IncomingPaymentDetailListPageAsync].
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

    /** A builder for [IncomingPaymentDetailListPageAsync]. */
    class Builder internal constructor() {

        private var service: IncomingPaymentDetailServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: IncomingPaymentDetailListParams? = null
        private var headers: Headers? = null
        private var items: List<IncomingPaymentDetail>? = null

        @JvmSynthetic
        internal fun from(incomingPaymentDetailListPageAsync: IncomingPaymentDetailListPageAsync) =
            apply {
                service = incomingPaymentDetailListPageAsync.service
                streamHandlerExecutor = incomingPaymentDetailListPageAsync.streamHandlerExecutor
                params = incomingPaymentDetailListPageAsync.params
                headers = incomingPaymentDetailListPageAsync.headers
                items = incomingPaymentDetailListPageAsync.items
            }

        fun service(service: IncomingPaymentDetailServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: IncomingPaymentDetailListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<IncomingPaymentDetail>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [IncomingPaymentDetailListPageAsync].
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
        fun build(): IncomingPaymentDetailListPageAsync =
            IncomingPaymentDetailListPageAsync(
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

        return other is IncomingPaymentDetailListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            headers == other.headers &&
            items == other.items
    }

    override fun hashCode(): Int =
        Objects.hash(service, streamHandlerExecutor, params, headers, items)

    override fun toString() =
        "IncomingPaymentDetailListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, headers=$headers, items=$items}"
}
