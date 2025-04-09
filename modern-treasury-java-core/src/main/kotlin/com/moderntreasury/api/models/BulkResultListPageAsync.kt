// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.BulkResultServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** @see [BulkResultServiceAsync.list] */
class BulkResultListPageAsync
private constructor(
    private val service: BulkResultServiceAsync,
    private val params: BulkResultListParams,
    private val headers: Headers,
    private val items: List<BulkResult>,
) {

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<BulkResultListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<BulkResultListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): BulkResultListParams = params

    /** The response that this page was parsed from. */
    fun items(): List<BulkResult> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BulkResultListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .headers()
         * .items()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BulkResultListPageAsync]. */
    class Builder internal constructor() {

        private var service: BulkResultServiceAsync? = null
        private var params: BulkResultListParams? = null
        private var headers: Headers? = null
        private var items: List<BulkResult>? = null

        @JvmSynthetic
        internal fun from(bulkResultListPageAsync: BulkResultListPageAsync) = apply {
            service = bulkResultListPageAsync.service
            params = bulkResultListPageAsync.params
            headers = bulkResultListPageAsync.headers
            items = bulkResultListPageAsync.items
        }

        fun service(service: BulkResultServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BulkResultListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<BulkResult>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [BulkResultListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .headers()
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BulkResultListPageAsync =
            BulkResultListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("headers", headers),
                checkRequired("items", items),
            )
    }

    class AutoPager(private val firstPage: BulkResultListPageAsync) {

        fun forEach(action: Predicate<BulkResult>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<BulkResultListPageAsync>>.forEach(
                action: (BulkResult) -> Boolean,
                executor: Executor,
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.items().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor,
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<BulkResult>> {
            val values = mutableListOf<BulkResult>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BulkResultListPageAsync && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "BulkResultListPageAsync{service=$service, params=$params, headers=$headers, items=$items}"
}
