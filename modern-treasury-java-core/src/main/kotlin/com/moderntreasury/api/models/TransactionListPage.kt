// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.TransactionService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** Get a list of all transactions. */
class TransactionListPage
private constructor(
    private val transactionsService: TransactionService,
    private val params: TransactionListParams,
    private val headers: Headers,
    private val items: List<Transaction>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<Transaction> = items

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TransactionListPage && transactionsService == other.transactionsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(transactionsService, params, items) /* spotless:on */

    override fun toString() =
        "TransactionListPage{transactionsService=$transactionsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<TransactionListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<TransactionListPage> {
        return getNextPageParams().map { transactionsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            transactionsService: TransactionService,
            params: TransactionListParams,
            headers: Headers,
            items: List<Transaction>,
        ) = TransactionListPage(transactionsService, params, headers, items)
    }

    class AutoPager(private val firstPage: TransactionListPage) : Iterable<Transaction> {

        override fun iterator(): Iterator<Transaction> = iterator {
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

        fun stream(): Stream<Transaction> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
