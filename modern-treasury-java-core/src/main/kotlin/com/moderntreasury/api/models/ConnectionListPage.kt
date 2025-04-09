// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.ConnectionService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** Get a list of all connections. */
class ConnectionListPage
private constructor(
    private val connectionsService: ConnectionService,
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

        return /* spotless:off */ other is ConnectionListPage && connectionsService == other.connectionsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(connectionsService, params, items) /* spotless:on */

    override fun toString() =
        "ConnectionListPage{connectionsService=$connectionsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<ConnectionListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<ConnectionListPage> {
        return getNextPageParams().map { connectionsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            connectionsService: ConnectionService,
            params: ConnectionListParams,
            headers: Headers,
            items: List<Connection>,
        ) = ConnectionListPage(connectionsService, params, headers, items)
    }

    class AutoPager(private val firstPage: ConnectionListPage) : Iterable<Connection> {

        override fun iterator(): Iterator<Connection> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.items().size) {
                    yield(page.items()[index++])
                }
                page = page.getNextPage().getOrNull() ?: break
                index = 0
            }
        }

        fun stream(): Stream<Connection> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
