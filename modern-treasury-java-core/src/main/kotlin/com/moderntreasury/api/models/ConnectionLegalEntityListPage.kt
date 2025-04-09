// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.ConnectionLegalEntityService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** Get a list of all connection legal entities. */
class ConnectionLegalEntityListPage
private constructor(
    private val connectionLegalEntitiesService: ConnectionLegalEntityService,
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

        return /* spotless:off */ other is ConnectionLegalEntityListPage && connectionLegalEntitiesService == other.connectionLegalEntitiesService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(connectionLegalEntitiesService, params, items) /* spotless:on */

    override fun toString() =
        "ConnectionLegalEntityListPage{connectionLegalEntitiesService=$connectionLegalEntitiesService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<ConnectionLegalEntityListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<ConnectionLegalEntityListPage> {
        return getNextPageParams().map { connectionLegalEntitiesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            connectionLegalEntitiesService: ConnectionLegalEntityService,
            params: ConnectionLegalEntityListParams,
            headers: Headers,
            items: List<ConnectionLegalEntity>,
        ) = ConnectionLegalEntityListPage(connectionLegalEntitiesService, params, headers, items)
    }

    class AutoPager(private val firstPage: ConnectionLegalEntityListPage) :
        Iterable<ConnectionLegalEntity> {

        override fun iterator(): Iterator<ConnectionLegalEntity> = iterator {
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

        fun stream(): Stream<ConnectionLegalEntity> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
