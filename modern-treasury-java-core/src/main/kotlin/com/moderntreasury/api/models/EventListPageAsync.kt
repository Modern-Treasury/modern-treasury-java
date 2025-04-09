// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.EventServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** list events */
class EventListPageAsync
private constructor(
    private val eventsService: EventServiceAsync,
    private val params: EventListParams,
    private val headers: Headers,
    private val items: List<Event>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<Event> = items

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventListPageAsync && eventsService == other.eventsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(eventsService, params, items) /* spotless:on */

    override fun toString() =
        "EventListPageAsync{eventsService=$eventsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<EventListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<EventListPageAsync>> {
        return getNextPageParams()
            .map { eventsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            eventsService: EventServiceAsync,
            params: EventListParams,
            headers: Headers,
            items: List<Event>,
        ) = EventListPageAsync(eventsService, params, headers, items)
    }

    class AutoPager(private val firstPage: EventListPageAsync) {

        fun forEach(action: Predicate<Event>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<EventListPageAsync>>.forEach(
                action: (Event) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<Event>> {
            val values = mutableListOf<Event>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
