// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPagerAsync
import com.moderntreasury.api.core.PageAsync
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.LedgerAccountBalanceMonitorServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor

/** @see [LedgerAccountBalanceMonitorServiceAsync.list] */
class LedgerAccountBalanceMonitorListPageAsync
private constructor(
    private val service: LedgerAccountBalanceMonitorServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: LedgerAccountBalanceMonitorListParams,
    private val headers: Headers,
    private val items: List<LedgerAccountBalanceMonitor>,
) : PageAsync<LedgerAccountBalanceMonitor> {

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): LedgerAccountBalanceMonitorListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): CompletableFuture<LedgerAccountBalanceMonitorListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<LedgerAccountBalanceMonitor> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): LedgerAccountBalanceMonitorListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<LedgerAccountBalanceMonitor> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [LedgerAccountBalanceMonitorListPageAsync].
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

    /** A builder for [LedgerAccountBalanceMonitorListPageAsync]. */
    class Builder internal constructor() {

        private var service: LedgerAccountBalanceMonitorServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: LedgerAccountBalanceMonitorListParams? = null
        private var headers: Headers? = null
        private var items: List<LedgerAccountBalanceMonitor>? = null

        @JvmSynthetic
        internal fun from(
            ledgerAccountBalanceMonitorListPageAsync: LedgerAccountBalanceMonitorListPageAsync
        ) = apply {
            service = ledgerAccountBalanceMonitorListPageAsync.service
            streamHandlerExecutor = ledgerAccountBalanceMonitorListPageAsync.streamHandlerExecutor
            params = ledgerAccountBalanceMonitorListPageAsync.params
            headers = ledgerAccountBalanceMonitorListPageAsync.headers
            items = ledgerAccountBalanceMonitorListPageAsync.items
        }

        fun service(service: LedgerAccountBalanceMonitorServiceAsync) = apply {
            this.service = service
        }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: LedgerAccountBalanceMonitorListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<LedgerAccountBalanceMonitor>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [LedgerAccountBalanceMonitorListPageAsync].
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
        fun build(): LedgerAccountBalanceMonitorListPageAsync =
            LedgerAccountBalanceMonitorListPageAsync(
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

        return /* spotless:off */ other is LedgerAccountBalanceMonitorListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, headers, items) /* spotless:on */

    override fun toString() =
        "LedgerAccountBalanceMonitorListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, headers=$headers, items=$items}"
}
