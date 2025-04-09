// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.AccountCollectionFlowService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** list account_collection_flows */
class AccountCollectionFlowListPage
private constructor(
    private val accountCollectionFlowsService: AccountCollectionFlowService,
    private val params: AccountCollectionFlowListParams,
    private val headers: Headers,
    private val items: List<AccountCollectionFlow>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<AccountCollectionFlow> = items

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountCollectionFlowListPage && accountCollectionFlowsService == other.accountCollectionFlowsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountCollectionFlowsService, params, items) /* spotless:on */

    override fun toString() =
        "AccountCollectionFlowListPage{accountCollectionFlowsService=$accountCollectionFlowsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<AccountCollectionFlowListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<AccountCollectionFlowListPage> {
        return getNextPageParams().map { accountCollectionFlowsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            accountCollectionFlowsService: AccountCollectionFlowService,
            params: AccountCollectionFlowListParams,
            headers: Headers,
            items: List<AccountCollectionFlow>,
        ) = AccountCollectionFlowListPage(accountCollectionFlowsService, params, headers, items)
    }

    class AutoPager(private val firstPage: AccountCollectionFlowListPage) :
        Iterable<AccountCollectionFlow> {

        override fun iterator(): Iterator<AccountCollectionFlow> = iterator {
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

        fun stream(): Stream<AccountCollectionFlow> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
