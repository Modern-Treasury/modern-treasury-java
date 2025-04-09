// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.paymentOrders.ReversalServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** @see [ReversalServiceAsync.list] */
class PaymentOrderReversalListPageAsync
private constructor(
    private val service: ReversalServiceAsync,
    private val params: PaymentOrderReversalListParams,
    private val headers: Headers,
    private val items: List<Reversal>,
) {

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<PaymentOrderReversalListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<PaymentOrderReversalListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): PaymentOrderReversalListParams = params

    /** The response that this page was parsed from. */
    fun items(): List<Reversal> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PaymentOrderReversalListPageAsync].
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

    /** A builder for [PaymentOrderReversalListPageAsync]. */
    class Builder internal constructor() {

        private var service: ReversalServiceAsync? = null
        private var params: PaymentOrderReversalListParams? = null
        private var headers: Headers? = null
        private var items: List<Reversal>? = null

        @JvmSynthetic
        internal fun from(paymentOrderReversalListPageAsync: PaymentOrderReversalListPageAsync) =
            apply {
                service = paymentOrderReversalListPageAsync.service
                params = paymentOrderReversalListPageAsync.params
                headers = paymentOrderReversalListPageAsync.headers
                items = paymentOrderReversalListPageAsync.items
            }

        fun service(service: ReversalServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PaymentOrderReversalListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<Reversal>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [PaymentOrderReversalListPageAsync].
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
        fun build(): PaymentOrderReversalListPageAsync =
            PaymentOrderReversalListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("headers", headers),
                checkRequired("items", items),
            )
    }

    class AutoPager(private val firstPage: PaymentOrderReversalListPageAsync) {

        fun forEach(action: Predicate<Reversal>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<PaymentOrderReversalListPageAsync>>.forEach(
                action: (Reversal) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<Reversal>> {
            val values = mutableListOf<Reversal>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentOrderReversalListPageAsync && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "PaymentOrderReversalListPageAsync{service=$service, params=$params, headers=$headers, items=$items}"
}
