// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.LedgerAccountSettlementService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** @see [LedgerAccountSettlementService.list] */
class LedgerAccountSettlementListPage
private constructor(
    private val service: LedgerAccountSettlementService,
    private val params: LedgerAccountSettlementListParams,
    private val headers: Headers,
    private val items: List<LedgerAccountSettlement>,
) {

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<LedgerAccountSettlementListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<LedgerAccountSettlementListPage> =
        getNextPageParams().map { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): LedgerAccountSettlementListParams = params

    /** The response that this page was parsed from. */
    fun items(): List<LedgerAccountSettlement> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [LedgerAccountSettlementListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .headers()
         * .items()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LedgerAccountSettlementListPage]. */
    class Builder internal constructor() {

        private var service: LedgerAccountSettlementService? = null
        private var params: LedgerAccountSettlementListParams? = null
        private var headers: Headers? = null
        private var items: List<LedgerAccountSettlement>? = null

        @JvmSynthetic
        internal fun from(ledgerAccountSettlementListPage: LedgerAccountSettlementListPage) =
            apply {
                service = ledgerAccountSettlementListPage.service
                params = ledgerAccountSettlementListPage.params
                headers = ledgerAccountSettlementListPage.headers
                items = ledgerAccountSettlementListPage.items
            }

        fun service(service: LedgerAccountSettlementService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LedgerAccountSettlementListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<LedgerAccountSettlement>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [LedgerAccountSettlementListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .headers()
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LedgerAccountSettlementListPage =
            LedgerAccountSettlementListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("headers", headers),
                checkRequired("items", items),
            )
    }

    class AutoPager(private val firstPage: LedgerAccountSettlementListPage) :
        Iterable<LedgerAccountSettlement> {

        override fun iterator(): Iterator<LedgerAccountSettlement> = iterator {
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

        fun stream(): Stream<LedgerAccountSettlement> {
            return StreamSupport.stream(spliterator(), false)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerAccountSettlementListPage && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "LedgerAccountSettlementListPage{service=$service, params=$params, headers=$headers, items=$items}"
}
