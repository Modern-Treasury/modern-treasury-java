// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.CounterpartyService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** Get a paginated list of all counterparties. */
class CounterpartyListPage
private constructor(
    private val counterpartiesService: CounterpartyService,
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

        return /* spotless:off */ other is CounterpartyListPage && counterpartiesService == other.counterpartiesService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(counterpartiesService, params, items) /* spotless:on */

    override fun toString() =
        "CounterpartyListPage{counterpartiesService=$counterpartiesService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<CounterpartyListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<CounterpartyListPage> {
        return getNextPageParams().map { counterpartiesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            counterpartiesService: CounterpartyService,
            params: CounterpartyListParams,
            headers: Headers,
            items: List<Counterparty>,
        ) = CounterpartyListPage(counterpartiesService, params, headers, items)
    }

    class AutoPager(private val firstPage: CounterpartyListPage) : Iterable<Counterparty> {

        override fun iterator(): Iterator<Counterparty> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.items().size) {
                    yield(page.items()[index++])
                }
                page = page.getNextPage().getOrNull() ?: break
                index = 0
            }
        }

        fun stream(): Stream<Counterparty> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
