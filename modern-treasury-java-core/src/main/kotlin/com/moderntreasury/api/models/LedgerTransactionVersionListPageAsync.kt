// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPagerAsync
import com.moderntreasury.api.core.PageAsync
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.ledgerTransactions.VersionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see VersionServiceAsync.list */
class LedgerTransactionVersionListPageAsync
private constructor(
    private val service: VersionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: LedgerTransactionVersionListParams,
    private val headers: Headers,
    private val items: List<LedgerTransactionVersion>,
) : PageAsync<LedgerTransactionVersion> {

    fun perPage(): Optional<String> =
        Optional.ofNullable(headers.values("X-Per-Page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("X-After-Cursor").firstOrNull())

    override fun hasNextPage(): Boolean = items().isNotEmpty() && afterCursor().isPresent

    fun nextPageParams(): LedgerTransactionVersionListParams {
        val nextCursor =
            afterCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<LedgerTransactionVersionListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<LedgerTransactionVersion> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): LedgerTransactionVersionListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<LedgerTransactionVersion> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [LedgerTransactionVersionListPageAsync].
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

    /** A builder for [LedgerTransactionVersionListPageAsync]. */
    class Builder internal constructor() {

        private var service: VersionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: LedgerTransactionVersionListParams? = null
        private var headers: Headers? = null
        private var items: List<LedgerTransactionVersion>? = null

        @JvmSynthetic
        internal fun from(
            ledgerTransactionVersionListPageAsync: LedgerTransactionVersionListPageAsync
        ) = apply {
            service = ledgerTransactionVersionListPageAsync.service
            streamHandlerExecutor = ledgerTransactionVersionListPageAsync.streamHandlerExecutor
            params = ledgerTransactionVersionListPageAsync.params
            headers = ledgerTransactionVersionListPageAsync.headers
            items = ledgerTransactionVersionListPageAsync.items
        }

        fun service(service: VersionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: LedgerTransactionVersionListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<LedgerTransactionVersion>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [LedgerTransactionVersionListPageAsync].
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
        fun build(): LedgerTransactionVersionListPageAsync =
            LedgerTransactionVersionListPageAsync(
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

        return other is LedgerTransactionVersionListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            headers == other.headers &&
            items == other.items
    }

    override fun hashCode(): Int =
        Objects.hash(service, streamHandlerExecutor, params, headers, items)

    override fun toString() =
        "LedgerTransactionVersionListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, headers=$headers, items=$items}"
}
