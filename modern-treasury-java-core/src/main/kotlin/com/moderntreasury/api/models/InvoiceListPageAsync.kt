// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPagerAsync
import com.moderntreasury.api.core.PageAsync
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.InvoiceServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor

/** @see [InvoiceServiceAsync.list] */
class InvoiceListPageAsync
private constructor(
    private val service: InvoiceServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: InvoiceListParams,
    private val headers: Headers,
    private val items: List<Invoice>,
) : PageAsync<Invoice> {

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): InvoiceListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): CompletableFuture<InvoiceListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Invoice> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): InvoiceListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<Invoice> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InvoiceListPageAsync].
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

    /** A builder for [InvoiceListPageAsync]. */
    class Builder internal constructor() {

        private var service: InvoiceServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: InvoiceListParams? = null
        private var headers: Headers? = null
        private var items: List<Invoice>? = null

        @JvmSynthetic
        internal fun from(invoiceListPageAsync: InvoiceListPageAsync) = apply {
            service = invoiceListPageAsync.service
            streamHandlerExecutor = invoiceListPageAsync.streamHandlerExecutor
            params = invoiceListPageAsync.params
            headers = invoiceListPageAsync.headers
            items = invoiceListPageAsync.items
        }

        fun service(service: InvoiceServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: InvoiceListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<Invoice>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [InvoiceListPageAsync].
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
        fun build(): InvoiceListPageAsync =
            InvoiceListPageAsync(
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

        return /* spotless:off */ other is InvoiceListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, headers, items) /* spotless:on */

    override fun toString() =
        "InvoiceListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, headers=$headers, items=$items}"
}
