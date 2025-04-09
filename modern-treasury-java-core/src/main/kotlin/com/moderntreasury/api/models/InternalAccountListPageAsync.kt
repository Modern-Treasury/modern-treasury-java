// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.InternalAccountServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** list internal accounts */
class InternalAccountListPageAsync
private constructor(
    private val internalAccountsService: InternalAccountServiceAsync,
    private val params: InternalAccountListParams,
    private val headers: Headers,
    private val items: List<InternalAccount>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<InternalAccount> = items

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InternalAccountListPageAsync && internalAccountsService == other.internalAccountsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(internalAccountsService, params, items) /* spotless:on */

    override fun toString() =
        "InternalAccountListPageAsync{internalAccountsService=$internalAccountsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<InternalAccountListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<InternalAccountListPageAsync>> {
        return getNextPageParams()
            .map { internalAccountsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            internalAccountsService: InternalAccountServiceAsync,
            params: InternalAccountListParams,
            headers: Headers,
            items: List<InternalAccount>,
        ) = InternalAccountListPageAsync(internalAccountsService, params, headers, items)
    }

    class AutoPager(private val firstPage: InternalAccountListPageAsync) {

        fun forEach(
            action: Predicate<InternalAccount>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<InternalAccountListPageAsync>>.forEach(
                action: (InternalAccount) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<InternalAccount>> {
            val values = mutableListOf<InternalAccount>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
