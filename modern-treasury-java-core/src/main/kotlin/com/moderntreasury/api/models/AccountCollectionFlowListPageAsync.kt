// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.AccountCollectionFlowServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** list account_collection_flows */
class AccountCollectionFlowListPageAsync
private constructor(
    private val accountCollectionFlowsService: AccountCollectionFlowServiceAsync,
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

        return /* spotless:off */ other is AccountCollectionFlowListPageAsync && accountCollectionFlowsService == other.accountCollectionFlowsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountCollectionFlowsService, params, items) /* spotless:on */

    override fun toString() =
        "AccountCollectionFlowListPageAsync{accountCollectionFlowsService=$accountCollectionFlowsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<AccountCollectionFlowListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<AccountCollectionFlowListPageAsync>> {
        return getNextPageParams()
            .map { accountCollectionFlowsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            accountCollectionFlowsService: AccountCollectionFlowServiceAsync,
            params: AccountCollectionFlowListParams,
            headers: Headers,
            items: List<AccountCollectionFlow>,
        ) =
            AccountCollectionFlowListPageAsync(
                accountCollectionFlowsService,
                params,
                headers,
                items,
            )
    }

    class AutoPager(private val firstPage: AccountCollectionFlowListPageAsync) {

        fun forEach(
            action: Predicate<AccountCollectionFlow>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<AccountCollectionFlowListPageAsync>>.forEach(
                action: (AccountCollectionFlow) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<AccountCollectionFlow>> {
            val values = mutableListOf<AccountCollectionFlow>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
