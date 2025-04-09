// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.CounterpartyServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** Get a paginated list of all counterparties. */
class CounterpartyListPageAsync
private constructor(
    private val counterpartiesService: CounterpartyServiceAsync,
    private val params: CounterpartyListParams,
    private val headers: Headers,
    private val items: List<Counterparty>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<Counterparty> = items

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CounterpartyListPageAsync && counterpartiesService == other.counterpartiesService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(counterpartiesService, params, items) /* spotless:on */

    override fun toString() =
        "CounterpartyListPageAsync{counterpartiesService=$counterpartiesService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<CounterpartyListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<CounterpartyListPageAsync>> {
        return getNextPageParams()
            .map { counterpartiesService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            counterpartiesService: CounterpartyServiceAsync,
            params: CounterpartyListParams,
            headers: Headers,
            items: List<Counterparty>,
        ) = CounterpartyListPageAsync(counterpartiesService, params, headers, items)
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
}
