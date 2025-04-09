// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.ExternalAccountService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** list external accounts */
class ExternalAccountListPage
private constructor(
    private val externalAccountsService: ExternalAccountService,
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

        return /* spotless:off */ other is ExternalAccountListPage && externalAccountsService == other.externalAccountsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(externalAccountsService, params, items) /* spotless:on */

    override fun toString() =
        "ExternalAccountListPage{externalAccountsService=$externalAccountsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<ExternalAccountListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<ExternalAccountListPage> {
        return getNextPageParams().map { externalAccountsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            externalAccountsService: ExternalAccountService,
            params: ExternalAccountListParams,
            headers: Headers,
            items: List<ExternalAccount>,
        ) = ExternalAccountListPage(externalAccountsService, params, headers, items)
    }

    class AutoPager(private val firstPage: ExternalAccountListPage) : Iterable<ExternalAccount> {

        override fun iterator(): Iterator<ExternalAccount> = iterator {
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

        fun stream(): Stream<ExternalAccount> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
