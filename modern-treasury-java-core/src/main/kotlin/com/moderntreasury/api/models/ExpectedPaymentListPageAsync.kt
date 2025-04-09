// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.ExpectedPaymentServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** @see [ExpectedPaymentServiceAsync.list] */
class ExpectedPaymentListPageAsync
private constructor(
    private val service: ExpectedPaymentServiceAsync,
    private val params: ExpectedPaymentListParams,
    private val headers: Headers,
    private val items: List<ExpectedPayment>,
) {

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<ExpectedPaymentListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<ExpectedPaymentListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): ExpectedPaymentListParams = params

    /** The response that this page was parsed from. */
    fun items(): List<ExpectedPayment> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExpectedPaymentListPageAsync].
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

    /** A builder for [ExpectedPaymentListPageAsync]. */
    class Builder internal constructor() {

        private var service: ExpectedPaymentServiceAsync? = null
        private var params: ExpectedPaymentListParams? = null
        private var headers: Headers? = null
        private var items: List<ExpectedPayment>? = null

        @JvmSynthetic
        internal fun from(expectedPaymentListPageAsync: ExpectedPaymentListPageAsync) = apply {
            service = expectedPaymentListPageAsync.service
            params = expectedPaymentListPageAsync.params
            headers = expectedPaymentListPageAsync.headers
            items = expectedPaymentListPageAsync.items
        }

        fun service(service: ExpectedPaymentServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ExpectedPaymentListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<ExpectedPayment>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [ExpectedPaymentListPageAsync].
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
        fun build(): ExpectedPaymentListPageAsync =
            ExpectedPaymentListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("headers", headers),
                checkRequired("items", items),
            )
    }

    class AutoPager(private val firstPage: ExpectedPaymentListPageAsync) {

        fun forEach(
            action: Predicate<ExpectedPayment>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<ExpectedPaymentListPageAsync>>.forEach(
                action: (ExpectedPayment) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<ExpectedPayment>> {
            val values = mutableListOf<ExpectedPayment>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExpectedPaymentListPageAsync && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "ExpectedPaymentListPageAsync{service=$service, params=$params, headers=$headers, items=$items}"
}
