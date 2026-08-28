// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPagerAsync
import com.moderntreasury.api.core.PageAsync
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.VirtualAccountSettingServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see VirtualAccountSettingServiceAsync.list */
class VirtualAccountSettingListPageAsync
private constructor(
    private val service: VirtualAccountSettingServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: VirtualAccountSettingListParams,
    private val headers: Headers,
    private val items: List<VirtualAccountSetting>,
) : PageAsync<VirtualAccountSetting> {

    fun perPage(): Optional<String> =
        Optional.ofNullable(headers.values("X-Per-Page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("X-After-Cursor").firstOrNull())

    override fun hasNextPage(): Boolean = afterCursor().isPresent

    fun nextPageParams(): VirtualAccountSettingListParams {
        val nextCursor =
            afterCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<VirtualAccountSettingListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<VirtualAccountSetting> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): VirtualAccountSettingListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<VirtualAccountSetting> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [VirtualAccountSettingListPageAsync].
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

    /** A builder for [VirtualAccountSettingListPageAsync]. */
    class Builder internal constructor() {

        private var service: VirtualAccountSettingServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: VirtualAccountSettingListParams? = null
        private var headers: Headers? = null
        private var items: List<VirtualAccountSetting>? = null

        @JvmSynthetic
        internal fun from(virtualAccountSettingListPageAsync: VirtualAccountSettingListPageAsync) =
            apply {
                service = virtualAccountSettingListPageAsync.service
                streamHandlerExecutor = virtualAccountSettingListPageAsync.streamHandlerExecutor
                params = virtualAccountSettingListPageAsync.params
                headers = virtualAccountSettingListPageAsync.headers
                items = virtualAccountSettingListPageAsync.items
            }

        fun service(service: VirtualAccountSettingServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: VirtualAccountSettingListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<VirtualAccountSetting>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [VirtualAccountSettingListPageAsync].
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
        fun build(): VirtualAccountSettingListPageAsync =
            VirtualAccountSettingListPageAsync(
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

        return other is VirtualAccountSettingListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            headers == other.headers &&
            items == other.items
    }

    override fun hashCode(): Int =
        Objects.hash(service, streamHandlerExecutor, params, headers, items)

    override fun toString() =
        "VirtualAccountSettingListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, headers=$headers, items=$items}"
}
