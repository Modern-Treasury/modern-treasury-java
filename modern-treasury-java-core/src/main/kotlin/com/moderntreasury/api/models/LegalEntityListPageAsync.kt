// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.LegalEntityServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** Get a list of all legal entities. */
class LegalEntityListPageAsync
private constructor(
    private val legalEntitiesService: LegalEntityServiceAsync,
    private val params: LegalEntityListParams,
    private val headers: Headers,
    private val items: List<LegalEntity>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<LegalEntity> = items

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LegalEntityListPageAsync && legalEntitiesService == other.legalEntitiesService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(legalEntitiesService, params, items) /* spotless:on */

    override fun toString() =
        "LegalEntityListPageAsync{legalEntitiesService=$legalEntitiesService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<LegalEntityListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<LegalEntityListPageAsync>> {
        return getNextPageParams()
            .map { legalEntitiesService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            legalEntitiesService: LegalEntityServiceAsync,
            params: LegalEntityListParams,
            headers: Headers,
            items: List<LegalEntity>,
        ) = LegalEntityListPageAsync(legalEntitiesService, params, headers, items)
    }

    class AutoPager(private val firstPage: LegalEntityListPageAsync) {

        fun forEach(action: Predicate<LegalEntity>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<LegalEntityListPageAsync>>.forEach(
                action: (LegalEntity) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<LegalEntity>> {
            val values = mutableListOf<LegalEntity>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
