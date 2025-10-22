// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPagerAsync
import com.moderntreasury.api.core.PageAsync
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.LedgerAccountServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see LedgerAccountServiceAsync.list */
class LedgerAccountListPageAsync
private constructor(
    private val service: LedgerAccountServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: LedgerAccountListParams,
    private val headers: Headers,
    private val items: List<LedgerAccount>,
) : PageAsync<LedgerAccount> {

    fun perPage(): Optional<String> =
        Optional.ofNullable(headers.values("X-Per-Page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("X-After-Cursor").firstOrNull())

    override fun hasNextPage(): Boolean = afterCursor().isPresent

    fun nextPageParams(): LedgerAccountListParams {
        val nextCursor =
            afterCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<LedgerAccountListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<LedgerAccount> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): LedgerAccountListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<LedgerAccount> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LedgerAccountListPageAsync].
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

    /** A builder for [LedgerAccountListPageAsync]. */
    class Builder internal constructor() {

        private var service: LedgerAccountServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: LedgerAccountListParams? = null
        private var headers: Headers? = null
        private var items: List<LedgerAccount>? = null

        @JvmSynthetic
        internal fun from(ledgerAccountListPageAsync: LedgerAccountListPageAsync) = apply {
            service = ledgerAccountListPageAsync.service
            streamHandlerExecutor = ledgerAccountListPageAsync.streamHandlerExecutor
            params = ledgerAccountListPageAsync.params
            headers = ledgerAccountListPageAsync.headers
            items = ledgerAccountListPageAsync.items
        }

        fun service(service: LedgerAccountServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: LedgerAccountListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<LedgerAccount>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [LedgerAccountListPageAsync].
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
        fun build(): LedgerAccountListPageAsync =
            LedgerAccountListPageAsync(
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

        return other is LedgerAccountListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            headers == other.headers &&
            items == other.items
    }

    override fun hashCode(): Int =
        Objects.hash(service, streamHandlerExecutor, params, headers, items)

    override fun toString() =
        "LedgerAccountListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, headers=$headers, items=$items}"
}
