// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPagerAsync
import com.moderntreasury.api.core.PageAsync
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.internalAccounts.BalanceReportServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see BalanceReportServiceAsync.list */
class BalanceReportListPageAsync
private constructor(
    private val service: BalanceReportServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: BalanceReportListParams,
    private val headers: Headers,
    private val items: List<BalanceReport>,
) : PageAsync<BalanceReport> {

    fun perPage(): Optional<String> =
        Optional.ofNullable(headers.values("X-Per-Page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("X-After-Cursor").firstOrNull())

    override fun hasNextPage(): Boolean = items().isNotEmpty() && afterCursor().isPresent

    fun nextPageParams(): BalanceReportListParams {
        val nextCursor =
            afterCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<BalanceReportListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<BalanceReport> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): BalanceReportListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<BalanceReport> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BalanceReportListPageAsync].
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

    /** A builder for [BalanceReportListPageAsync]. */
    class Builder internal constructor() {

        private var service: BalanceReportServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: BalanceReportListParams? = null
        private var headers: Headers? = null
        private var items: List<BalanceReport>? = null

        @JvmSynthetic
        internal fun from(balanceReportListPageAsync: BalanceReportListPageAsync) = apply {
            service = balanceReportListPageAsync.service
            streamHandlerExecutor = balanceReportListPageAsync.streamHandlerExecutor
            params = balanceReportListPageAsync.params
            headers = balanceReportListPageAsync.headers
            items = balanceReportListPageAsync.items
        }

        fun service(service: BalanceReportServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: BalanceReportListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<BalanceReport>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [BalanceReportListPageAsync].
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
        fun build(): BalanceReportListPageAsync =
            BalanceReportListPageAsync(
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

        return /* spotless:off */ other is BalanceReportListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, headers, items) /* spotless:on */

    override fun toString() =
        "BalanceReportListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, headers=$headers, items=$items}"
}
