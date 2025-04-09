// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.LegalEntityService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** Get a list of all legal entities. */
class LegalEntityListPage
private constructor(
    private val legalEntitiesService: LegalEntityService,
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

        return /* spotless:off */ other is LegalEntityListPage && legalEntitiesService == other.legalEntitiesService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(legalEntitiesService, params, items) /* spotless:on */

    override fun toString() =
        "LegalEntityListPage{legalEntitiesService=$legalEntitiesService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<LegalEntityListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<LegalEntityListPage> {
        return getNextPageParams().map { legalEntitiesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            legalEntitiesService: LegalEntityService,
            params: LegalEntityListParams,
            headers: Headers,
            items: List<LegalEntity>,
        ) = LegalEntityListPage(legalEntitiesService, params, headers, items)
    }

    class AutoPager(private val firstPage: LegalEntityListPage) : Iterable<LegalEntity> {

        override fun iterator(): Iterator<LegalEntity> = iterator {
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

        fun stream(): Stream<LegalEntity> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
