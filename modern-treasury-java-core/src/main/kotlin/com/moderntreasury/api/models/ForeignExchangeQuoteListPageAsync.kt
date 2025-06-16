// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPagerAsync
import com.moderntreasury.api.core.PageAsync
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.ForeignExchangeQuoteServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see [ForeignExchangeQuoteServiceAsync.list] */
class ForeignExchangeQuoteListPageAsync
private constructor(
    private val service: ForeignExchangeQuoteServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ForeignExchangeQuoteListParams,
    private val headers: Headers,
    private val items: List<ForeignExchangeQuote>,
) : PageAsync<ForeignExchangeQuote> {

    fun perPage(): Optional<String> =
        Optional.ofNullable(headers.values("X-Per-Page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("X-After-Cursor").firstOrNull())

    override fun hasNextPage(): Boolean = items().isNotEmpty() && afterCursor().isPresent

    fun nextPageParams(): ForeignExchangeQuoteListParams {
        val nextCursor =
            afterCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<ForeignExchangeQuoteListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ForeignExchangeQuote> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ForeignExchangeQuoteListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<ForeignExchangeQuote> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ForeignExchangeQuoteListPageAsync].
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

    /** A builder for [ForeignExchangeQuoteListPageAsync]. */
    class Builder internal constructor() {

        private var service: ForeignExchangeQuoteServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ForeignExchangeQuoteListParams? = null
        private var headers: Headers? = null
        private var items: List<ForeignExchangeQuote>? = null

        @JvmSynthetic
        internal fun from(foreignExchangeQuoteListPageAsync: ForeignExchangeQuoteListPageAsync) =
            apply {
                service = foreignExchangeQuoteListPageAsync.service
                streamHandlerExecutor = foreignExchangeQuoteListPageAsync.streamHandlerExecutor
                params = foreignExchangeQuoteListPageAsync.params
                headers = foreignExchangeQuoteListPageAsync.headers
                items = foreignExchangeQuoteListPageAsync.items
            }

        fun service(service: ForeignExchangeQuoteServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ForeignExchangeQuoteListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<ForeignExchangeQuote>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [ForeignExchangeQuoteListPageAsync].
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
        fun build(): ForeignExchangeQuoteListPageAsync =
            ForeignExchangeQuoteListPageAsync(
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

        return /* spotless:off */ other is ForeignExchangeQuoteListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, headers, items) /* spotless:on */

    override fun toString() =
        "ForeignExchangeQuoteListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, headers=$headers, items=$items}"
}
