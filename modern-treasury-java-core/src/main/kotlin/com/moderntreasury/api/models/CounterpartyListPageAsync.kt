// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.CounterpartyServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** @see [CounterpartyServiceAsync.list] */
class CounterpartyListPageAsync
private constructor(
    private val service: CounterpartyServiceAsync,
    private val params: CounterpartyListParams,
    private val headers: Headers,
    private val items: List<Counterparty>,
) {

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<CounterpartyListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<CounterpartyListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): CounterpartyListParams = params

    /** The response that this page was parsed from. */
    fun items(): List<Counterparty> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CounterpartyListPageAsync].
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

    /** A builder for [CounterpartyListPageAsync]. */
    class Builder internal constructor() {

        private var service: CounterpartyServiceAsync? = null
        private var params: CounterpartyListParams? = null
        private var headers: Headers? = null
        private var items: List<Counterparty>? = null

        @JvmSynthetic
        internal fun from(counterpartyListPageAsync: CounterpartyListPageAsync) = apply {
            service = counterpartyListPageAsync.service
            params = counterpartyListPageAsync.params
            headers = counterpartyListPageAsync.headers
            items = counterpartyListPageAsync.items
        }

        fun service(service: CounterpartyServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CounterpartyListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<Counterparty>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [CounterpartyListPageAsync].
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
        fun build(): CounterpartyListPageAsync =
            CounterpartyListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("headers", headers),
                checkRequired("items", items),
            )
    }

    class AutoPager(private val firstPage: CounterpartyListPageAsync) {

        fun forEach(action: Predicate<Counterparty>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<CounterpartyListPageAsync>>.forEach(
                action: (Counterparty) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<Counterparty>> {
            val values = mutableListOf<Counterparty>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CounterpartyListPageAsync && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "CounterpartyListPageAsync{service=$service, params=$params, headers=$headers, items=$items}"
}
