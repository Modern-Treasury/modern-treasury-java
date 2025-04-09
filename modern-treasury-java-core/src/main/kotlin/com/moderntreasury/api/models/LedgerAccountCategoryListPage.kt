// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.LedgerAccountCategoryService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** Get a list of ledger account categories. */
class LedgerAccountCategoryListPage
private constructor(
    private val ledgerAccountCategoriesService: LedgerAccountCategoryService,
    private val params: LedgerAccountCategoryListParams,
    private val headers: Headers,
    private val items: List<LedgerAccountCategory>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<LedgerAccountCategory> = items

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerAccountCategoryListPage && ledgerAccountCategoriesService == other.ledgerAccountCategoriesService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(ledgerAccountCategoriesService, params, items) /* spotless:on */

    override fun toString() =
        "LedgerAccountCategoryListPage{ledgerAccountCategoriesService=$ledgerAccountCategoriesService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<LedgerAccountCategoryListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<LedgerAccountCategoryListPage> {
        return getNextPageParams().map { ledgerAccountCategoriesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            ledgerAccountCategoriesService: LedgerAccountCategoryService,
            params: LedgerAccountCategoryListParams,
            headers: Headers,
            items: List<LedgerAccountCategory>,
        ) = LedgerAccountCategoryListPage(ledgerAccountCategoriesService, params, headers, items)
    }

    class AutoPager(private val firstPage: LedgerAccountCategoryListPage) :
        Iterable<LedgerAccountCategory> {

        override fun iterator(): Iterator<LedgerAccountCategory> = iterator {
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

        fun stream(): Stream<LedgerAccountCategory> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
