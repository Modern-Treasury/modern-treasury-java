// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.VirtualAccountServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** Get a list of virtual accounts. */
class VirtualAccountListPageAsync
private constructor(
    private val virtualAccountsService: VirtualAccountServiceAsync,
    private val params: VirtualAccountListParams,
    private val headers: Headers,
    private val items: List<VirtualAccount>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<VirtualAccount> = items

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is VirtualAccountListPageAsync && virtualAccountsService == other.virtualAccountsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(virtualAccountsService, params, items) /* spotless:on */

    override fun toString() =
        "VirtualAccountListPageAsync{virtualAccountsService=$virtualAccountsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<VirtualAccountListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<VirtualAccountListPageAsync>> {
        return getNextPageParams()
            .map { virtualAccountsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            virtualAccountsService: VirtualAccountServiceAsync,
            params: VirtualAccountListParams,
            headers: Headers,
            items: List<VirtualAccount>,
        ) = VirtualAccountListPageAsync(virtualAccountsService, params, headers, items)
    }

    class AutoPager(private val firstPage: VirtualAccountListPageAsync) {

        fun forEach(
            action: Predicate<VirtualAccount>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<VirtualAccountListPageAsync>>.forEach(
                action: (VirtualAccount) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<VirtualAccount>> {
            val values = mutableListOf<VirtualAccount>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
