// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPagerAsync
import com.moderntreasury.api.core.PageAsync
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.PaymentReferenceServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see [PaymentReferenceServiceAsync.list] */
class PaymentReferenceListPageAsync
private constructor(
    private val service: PaymentReferenceServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PaymentReferenceListParams,
    private val headers: Headers,
    private val items: List<PaymentReference>,
) : PageAsync<PaymentReference> {

    fun perPage(): Optional<String> =
        Optional.ofNullable(headers.values("X-Per-Page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("X-After-Cursor").firstOrNull())

    override fun hasNextPage(): Boolean = items().isNotEmpty() && afterCursor().isPresent

    fun nextPageParams(): PaymentReferenceListParams {
        val nextCursor =
            afterCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<PaymentReferenceListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PaymentReference> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PaymentReferenceListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<PaymentReference> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PaymentReferenceListPageAsync].
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

    /** A builder for [PaymentReferenceListPageAsync]. */
    class Builder internal constructor() {

        private var service: PaymentReferenceServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PaymentReferenceListParams? = null
        private var headers: Headers? = null
        private var items: List<PaymentReference>? = null

        @JvmSynthetic
        internal fun from(paymentReferenceListPageAsync: PaymentReferenceListPageAsync) = apply {
            service = paymentReferenceListPageAsync.service
            streamHandlerExecutor = paymentReferenceListPageAsync.streamHandlerExecutor
            params = paymentReferenceListPageAsync.params
            headers = paymentReferenceListPageAsync.headers
            items = paymentReferenceListPageAsync.items
        }

        fun service(service: PaymentReferenceServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PaymentReferenceListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<PaymentReference>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [PaymentReferenceListPageAsync].
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
        fun build(): PaymentReferenceListPageAsync =
            PaymentReferenceListPageAsync(
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

        return /* spotless:off */ other is PaymentReferenceListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, headers, items) /* spotless:on */

    override fun toString() =
        "PaymentReferenceListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, headers=$headers, items=$items}"
}
