// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.ConnectionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** Get a list of all connections. */
class ConnectionListPageAsync
private constructor(
    private val connectionsService: ConnectionServiceAsync,
    private val params: ConnectionListParams,
    private val headers: Headers,
    private val items: List<Connection>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<Connection> = items

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ConnectionListPageAsync && connectionsService == other.connectionsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(connectionsService, params, items) /* spotless:on */

    override fun toString() =
        "ConnectionListPageAsync{connectionsService=$connectionsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<ConnectionListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<ConnectionListPageAsync>> {
        return getNextPageParams()
            .map { connectionsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            connectionsService: ConnectionServiceAsync,
            params: ConnectionListParams,
            headers: Headers,
            items: List<Connection>,
        ) = ConnectionListPageAsync(connectionsService, params, headers, items)
    }

    class AutoPager(private val firstPage: ConnectionListPageAsync) {

        fun forEach(action: Predicate<Connection>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<ConnectionListPageAsync>>.forEach(
                action: (Connection) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<Connection>> {
            val values = mutableListOf<Connection>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
