// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPagerAsync
import com.moderntreasury.api.core.PageAsync
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.LedgerTransactionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see LedgerTransactionServiceAsync.list */
class LedgerTransactionListPageAsync
private constructor(
    private val service: LedgerTransactionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: LedgerTransactionListParams,
    private val headers: Headers,
    private val items: List<LedgerTransaction>,
) : PageAsync<LedgerTransaction> {

    fun perPage(): Optional<String> =
        Optional.ofNullable(headers.values("X-Per-Page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("X-After-Cursor").firstOrNull())

    override fun hasNextPage(): Boolean = afterCursor().isPresent

    fun nextPageParams(): LedgerTransactionListParams {
        val nextCursor =
            afterCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<LedgerTransactionListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<LedgerTransaction> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): LedgerTransactionListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<LedgerTransaction> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [LedgerTransactionListPageAsync].
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

    /** A builder for [LedgerTransactionListPageAsync]. */
    class Builder internal constructor() {

        private var service: LedgerTransactionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: LedgerTransactionListParams? = null
        private var headers: Headers? = null
        private var items: List<LedgerTransaction>? = null

        @JvmSynthetic
        internal fun from(ledgerTransactionListPageAsync: LedgerTransactionListPageAsync) = apply {
            service = ledgerTransactionListPageAsync.service
            streamHandlerExecutor = ledgerTransactionListPageAsync.streamHandlerExecutor
            params = ledgerTransactionListPageAsync.params
            headers = ledgerTransactionListPageAsync.headers
            items = ledgerTransactionListPageAsync.items
        }

        fun service(service: LedgerTransactionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: LedgerTransactionListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<LedgerTransaction>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [LedgerTransactionListPageAsync].
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
        fun build(): LedgerTransactionListPageAsync =
            LedgerTransactionListPageAsync(
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

        return other is LedgerTransactionListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            headers == other.headers &&
            items == other.items
    }

    override fun hashCode(): Int =
        Objects.hash(service, streamHandlerExecutor, params, headers, items)

    override fun toString() =
        "LedgerTransactionListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, headers=$headers, items=$items}"
}
