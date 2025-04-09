// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.LedgerAccountCategoryServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** Get a list of ledger account categories. */
class LedgerAccountCategoryListPageAsync
private constructor(
    private val ledgerAccountCategoriesService: LedgerAccountCategoryServiceAsync,
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

        return /* spotless:off */ other is LedgerAccountCategoryListPageAsync && ledgerAccountCategoriesService == other.ledgerAccountCategoriesService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(ledgerAccountCategoriesService, params, items) /* spotless:on */

    override fun toString() =
        "LedgerAccountCategoryListPageAsync{ledgerAccountCategoriesService=$ledgerAccountCategoriesService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<LedgerAccountCategoryListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<LedgerAccountCategoryListPageAsync>> {
        return getNextPageParams()
            .map { ledgerAccountCategoriesService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            ledgerAccountCategoriesService: LedgerAccountCategoryServiceAsync,
            params: LedgerAccountCategoryListParams,
            headers: Headers,
            items: List<LedgerAccountCategory>,
        ) =
            LedgerAccountCategoryListPageAsync(
                ledgerAccountCategoriesService,
                params,
                headers,
                items,
            )
    }

    class AutoPager(private val firstPage: LedgerAccountCategoryListPageAsync) {

        fun forEach(
            action: Predicate<LedgerAccountCategory>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<LedgerAccountCategoryListPageAsync>>.forEach(
                action: (LedgerAccountCategory) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<LedgerAccountCategory>> {
            val values = mutableListOf<LedgerAccountCategory>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
