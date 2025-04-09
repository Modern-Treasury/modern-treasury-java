// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.ledgerTransactions.VersionService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** @see [VersionService.list] */
class LedgerTransactionVersionListPage
private constructor(
    private val service: VersionService,
    private val params: LedgerTransactionVersionListParams,
    private val headers: Headers,
    private val items: List<LedgerTransactionVersion>,
) {

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<LedgerTransactionVersionListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<LedgerTransactionVersionListPage> =
        getNextPageParams().map { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): LedgerTransactionVersionListParams = params

    /** The response that this page was parsed from. */
    fun items(): List<LedgerTransactionVersion> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [LedgerTransactionVersionListPage].
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

    /** A builder for [LedgerTransactionVersionListPage]. */
    class Builder internal constructor() {

        private var service: VersionService? = null
        private var params: LedgerTransactionVersionListParams? = null
        private var headers: Headers? = null
        private var items: List<LedgerTransactionVersion>? = null

        @JvmSynthetic
        internal fun from(ledgerTransactionVersionListPage: LedgerTransactionVersionListPage) =
            apply {
                service = ledgerTransactionVersionListPage.service
                params = ledgerTransactionVersionListPage.params
                headers = ledgerTransactionVersionListPage.headers
                items = ledgerTransactionVersionListPage.items
            }

        fun service(service: VersionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LedgerTransactionVersionListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<LedgerTransactionVersion>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [LedgerTransactionVersionListPage].
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
        fun build(): LedgerTransactionVersionListPage =
            LedgerTransactionVersionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("headers", headers),
                checkRequired("items", items),
            )
    }

    class AutoPager(private val firstPage: LedgerTransactionVersionListPage) :
        Iterable<LedgerTransactionVersion> {

        override fun iterator(): Iterator<LedgerTransactionVersion> = iterator {
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

        fun stream(): Stream<LedgerTransactionVersion> {
            return StreamSupport.stream(spliterator(), false)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerTransactionVersionListPage && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "LedgerTransactionVersionListPage{service=$service, params=$params, headers=$headers, items=$items}"
}
