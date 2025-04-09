// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.ExternalAccountServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** list external accounts */
class ExternalAccountListPageAsync
private constructor(
    private val externalAccountsService: ExternalAccountServiceAsync,
    private val params: ExternalAccountListParams,
    private val headers: Headers,
    private val items: List<ExternalAccount>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<ExternalAccount> = items

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalAccountListPageAsync && externalAccountsService == other.externalAccountsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(externalAccountsService, params, items) /* spotless:on */

    override fun toString() =
        "ExternalAccountListPageAsync{externalAccountsService=$externalAccountsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<ExternalAccountListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<ExternalAccountListPageAsync>> {
        return getNextPageParams()
            .map { externalAccountsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            externalAccountsService: ExternalAccountServiceAsync,
            params: ExternalAccountListParams,
            headers: Headers,
            items: List<ExternalAccount>,
        ) = ExternalAccountListPageAsync(externalAccountsService, params, headers, items)
    }

    class AutoPager(private val firstPage: ExternalAccountListPageAsync) {

        fun forEach(
            action: Predicate<ExternalAccount>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<ExternalAccountListPageAsync>>.forEach(
                action: (ExternalAccount) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<ExternalAccount>> {
            val values = mutableListOf<ExternalAccount>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
