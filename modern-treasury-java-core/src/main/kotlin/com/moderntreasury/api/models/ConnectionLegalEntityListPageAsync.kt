// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.ConnectionLegalEntityServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** Get a list of all connection legal entities. */
class ConnectionLegalEntityListPageAsync
private constructor(
    private val connectionLegalEntitiesService: ConnectionLegalEntityServiceAsync,
    private val params: ConnectionLegalEntityListParams,
    private val headers: Headers,
    private val items: List<ConnectionLegalEntity>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<ConnectionLegalEntity> = items

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ConnectionLegalEntityListPageAsync && connectionLegalEntitiesService == other.connectionLegalEntitiesService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(connectionLegalEntitiesService, params, items) /* spotless:on */

    override fun toString() =
        "ConnectionLegalEntityListPageAsync{connectionLegalEntitiesService=$connectionLegalEntitiesService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<ConnectionLegalEntityListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<ConnectionLegalEntityListPageAsync>> {
        return getNextPageParams()
            .map { connectionLegalEntitiesService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            connectionLegalEntitiesService: ConnectionLegalEntityServiceAsync,
            params: ConnectionLegalEntityListParams,
            headers: Headers,
            items: List<ConnectionLegalEntity>,
        ) =
            ConnectionLegalEntityListPageAsync(
                connectionLegalEntitiesService,
                params,
                headers,
                items,
            )
    }

    class AutoPager(private val firstPage: ConnectionLegalEntityListPageAsync) {

        fun forEach(
            action: Predicate<ConnectionLegalEntity>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<ConnectionLegalEntityListPageAsync>>.forEach(
                action: (ConnectionLegalEntity) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<ConnectionLegalEntity>> {
            val values = mutableListOf<ConnectionLegalEntity>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
