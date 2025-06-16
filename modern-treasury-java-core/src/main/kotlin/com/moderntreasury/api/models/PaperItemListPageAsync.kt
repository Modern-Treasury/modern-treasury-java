// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPagerAsync
import com.moderntreasury.api.core.PageAsync
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.PaperItemServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see [PaperItemServiceAsync.list] */
class PaperItemListPageAsync
private constructor(
    private val service: PaperItemServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PaperItemListParams,
    private val headers: Headers,
    private val items: List<PaperItem>,
) : PageAsync<PaperItem> {

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun hasNextPage(): Boolean = items().isNotEmpty() && afterCursor().isPresent

    fun nextPageParams(): PaperItemListParams {
        val nextCursor =
            afterCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<PaperItemListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PaperItem> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PaperItemListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<PaperItem> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PaperItemListPageAsync].
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

    /** A builder for [PaperItemListPageAsync]. */
    class Builder internal constructor() {

        private var service: PaperItemServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PaperItemListParams? = null
        private var headers: Headers? = null
        private var items: List<PaperItem>? = null

        @JvmSynthetic
        internal fun from(paperItemListPageAsync: PaperItemListPageAsync) = apply {
            service = paperItemListPageAsync.service
            streamHandlerExecutor = paperItemListPageAsync.streamHandlerExecutor
            params = paperItemListPageAsync.params
            headers = paperItemListPageAsync.headers
            items = paperItemListPageAsync.items
        }

        fun service(service: PaperItemServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PaperItemListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<PaperItem>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [PaperItemListPageAsync].
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
        fun build(): PaperItemListPageAsync =
            PaperItemListPageAsync(
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

        return /* spotless:off */ other is PaperItemListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, headers, items) /* spotless:on */

    override fun toString() =
        "PaperItemListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, headers=$headers, items=$items}"
}
