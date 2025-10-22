// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPagerAsync
import com.moderntreasury.api.core.PageAsync
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.AccountDetailServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see AccountDetailServiceAsync.list */
class AccountDetailListPageAsync
private constructor(
    private val service: AccountDetailServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AccountDetailListParams,
    private val headers: Headers,
    private val items: List<AccountDetail>,
) : PageAsync<AccountDetail> {

    fun perPage(): Optional<String> =
        Optional.ofNullable(headers.values("X-Per-Page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("X-After-Cursor").firstOrNull())

    override fun hasNextPage(): Boolean = afterCursor().isPresent

    fun nextPageParams(): AccountDetailListParams {
        val nextCursor =
            afterCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<AccountDetailListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AccountDetail> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AccountDetailListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AccountDetail> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AccountDetailListPageAsync].
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

    /** A builder for [AccountDetailListPageAsync]. */
    class Builder internal constructor() {

        private var service: AccountDetailServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AccountDetailListParams? = null
        private var headers: Headers? = null
        private var items: List<AccountDetail>? = null

        @JvmSynthetic
        internal fun from(accountDetailListPageAsync: AccountDetailListPageAsync) = apply {
            service = accountDetailListPageAsync.service
            streamHandlerExecutor = accountDetailListPageAsync.streamHandlerExecutor
            params = accountDetailListPageAsync.params
            headers = accountDetailListPageAsync.headers
            items = accountDetailListPageAsync.items
        }

        fun service(service: AccountDetailServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AccountDetailListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<AccountDetail>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [AccountDetailListPageAsync].
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
        fun build(): AccountDetailListPageAsync =
            AccountDetailListPageAsync(
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

        return other is AccountDetailListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            headers == other.headers &&
            items == other.items
    }

    override fun hashCode(): Int =
        Objects.hash(service, streamHandlerExecutor, params, headers, items)

    override fun toString() =
        "AccountDetailListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, headers=$headers, items=$items}"
}
