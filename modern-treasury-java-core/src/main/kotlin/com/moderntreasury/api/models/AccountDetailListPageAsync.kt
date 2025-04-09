// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.AccountDetailServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** Get a list of account details for a single internal or external account. */
class AccountDetailListPageAsync
private constructor(
    private val accountDetailsService: AccountDetailServiceAsync,
    private val params: AccountDetailListParams,
    private val headers: Headers,
    private val items: List<AccountDetail>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<AccountDetail> = items

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountDetailListPageAsync && accountDetailsService == other.accountDetailsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountDetailsService, params, items) /* spotless:on */

    override fun toString() =
        "AccountDetailListPageAsync{accountDetailsService=$accountDetailsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<AccountDetailListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<AccountDetailListPageAsync>> {
        return getNextPageParams()
            .map { accountDetailsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            accountDetailsService: AccountDetailServiceAsync,
            params: AccountDetailListParams,
            headers: Headers,
            items: List<AccountDetail>,
        ) = AccountDetailListPageAsync(accountDetailsService, params, headers, items)
    }

    class AutoPager(private val firstPage: AccountDetailListPageAsync) {

        fun forEach(action: Predicate<AccountDetail>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<AccountDetailListPageAsync>>.forEach(
                action: (AccountDetail) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<AccountDetail>> {
            val values = mutableListOf<AccountDetail>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
