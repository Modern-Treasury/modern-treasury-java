// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPagerAsync
import com.moderntreasury.api.core.PageAsync
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.LedgerEventHandlerServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor

/** @see [LedgerEventHandlerServiceAsync.list] */
class LedgerEventHandlerListPageAsync
private constructor(
    private val service: LedgerEventHandlerServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: LedgerEventHandlerListParams,
    private val headers: Headers,
    private val items: List<LedgerEventHandler>,
) : PageAsync<LedgerEventHandler> {

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): LedgerEventHandlerListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): CompletableFuture<LedgerEventHandlerListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<LedgerEventHandler> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): LedgerEventHandlerListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<LedgerEventHandler> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [LedgerEventHandlerListPageAsync].
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

    /** A builder for [LedgerEventHandlerListPageAsync]. */
    class Builder internal constructor() {

        private var service: LedgerEventHandlerServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: LedgerEventHandlerListParams? = null
        private var headers: Headers? = null
        private var items: List<LedgerEventHandler>? = null

        @JvmSynthetic
        internal fun from(ledgerEventHandlerListPageAsync: LedgerEventHandlerListPageAsync) =
            apply {
                service = ledgerEventHandlerListPageAsync.service
                streamHandlerExecutor = ledgerEventHandlerListPageAsync.streamHandlerExecutor
                params = ledgerEventHandlerListPageAsync.params
                headers = ledgerEventHandlerListPageAsync.headers
                items = ledgerEventHandlerListPageAsync.items
            }

        fun service(service: LedgerEventHandlerServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: LedgerEventHandlerListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<LedgerEventHandler>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [LedgerEventHandlerListPageAsync].
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
        fun build(): LedgerEventHandlerListPageAsync =
            LedgerEventHandlerListPageAsync(
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

        return /* spotless:off */ other is LedgerEventHandlerListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, headers, items) /* spotless:on */

    override fun toString() =
        "LedgerEventHandlerListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, headers=$headers, items=$items}"
}
