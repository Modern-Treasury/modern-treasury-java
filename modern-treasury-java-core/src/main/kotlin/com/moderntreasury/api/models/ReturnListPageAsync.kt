// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.ReturnServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** @see [ReturnServiceAsync.list] */
class ReturnListPageAsync
private constructor(
    private val service: ReturnServiceAsync,
    private val params: ReturnListParams,
    private val headers: Headers,
    private val items: List<ReturnObject>,
) {

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<ReturnListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<ReturnListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): ReturnListParams = params

    /** The response that this page was parsed from. */
    fun items(): List<ReturnObject> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ReturnListPageAsync].
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

    /** A builder for [ReturnListPageAsync]. */
    class Builder internal constructor() {

        private var service: ReturnServiceAsync? = null
        private var params: ReturnListParams? = null
        private var headers: Headers? = null
        private var items: List<ReturnObject>? = null

        @JvmSynthetic
        internal fun from(returnListPageAsync: ReturnListPageAsync) = apply {
            service = returnListPageAsync.service
            params = returnListPageAsync.params
            headers = returnListPageAsync.headers
            items = returnListPageAsync.items
        }

        fun service(service: ReturnServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ReturnListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<ReturnObject>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [ReturnListPageAsync].
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
        fun build(): ReturnListPageAsync =
            ReturnListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("headers", headers),
                checkRequired("items", items),
            )
    }

    class AutoPager(private val firstPage: ReturnListPageAsync) {

        fun forEach(action: Predicate<ReturnObject>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<ReturnListPageAsync>>.forEach(
                action: (ReturnObject) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<ReturnObject>> {
            val values = mutableListOf<ReturnObject>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ReturnListPageAsync && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "ReturnListPageAsync{service=$service, params=$params, headers=$headers, items=$items}"
}
