// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPagerAsync
import com.moderntreasury.api.core.PageAsync
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.paymentOrders.ReversalServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see [ReversalServiceAsync.list] */
class PaymentOrderReversalListPageAsync
private constructor(
    private val service: ReversalServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PaymentOrderReversalListParams,
    private val headers: Headers,
    private val items: List<Reversal>,
) : PageAsync<Reversal> {

    fun perPage(): Optional<String> =
        Optional.ofNullable(headers.values("X-Per-Page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("X-After-Cursor").firstOrNull())

    override fun hasNextPage(): Boolean = items().isNotEmpty() && afterCursor().isPresent

    fun nextPageParams(): PaymentOrderReversalListParams {
        val nextCursor =
            afterCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<PaymentOrderReversalListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Reversal> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PaymentOrderReversalListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<Reversal> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PaymentOrderReversalListPageAsync].
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

    /** A builder for [PaymentOrderReversalListPageAsync]. */
    class Builder internal constructor() {

        private var service: ReversalServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PaymentOrderReversalListParams? = null
        private var headers: Headers? = null
        private var items: List<Reversal>? = null

        @JvmSynthetic
        internal fun from(paymentOrderReversalListPageAsync: PaymentOrderReversalListPageAsync) =
            apply {
                service = paymentOrderReversalListPageAsync.service
                streamHandlerExecutor = paymentOrderReversalListPageAsync.streamHandlerExecutor
                params = paymentOrderReversalListPageAsync.params
                headers = paymentOrderReversalListPageAsync.headers
                items = paymentOrderReversalListPageAsync.items
            }

        fun service(service: ReversalServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PaymentOrderReversalListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<Reversal>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [PaymentOrderReversalListPageAsync].
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
        fun build(): PaymentOrderReversalListPageAsync =
            PaymentOrderReversalListPageAsync(
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

        return /* spotless:off */ other is PaymentOrderReversalListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, headers, items) /* spotless:on */

    override fun toString() =
        "PaymentOrderReversalListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, headers=$headers, items=$items}"
}
