// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.LedgerAccountCategoryService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** @see [LedgerAccountCategoryService.list] */
class LedgerAccountCategoryListPage
private constructor(
    private val service: LedgerAccountCategoryService,
    private val params: LedgerAccountCategoryListParams,
    private val headers: Headers,
    private val items: List<LedgerAccountCategory>,
) {

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<LedgerAccountCategoryListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<LedgerAccountCategoryListPage> =
        getNextPageParams().map { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): LedgerAccountCategoryListParams = params

    /** The response that this page was parsed from. */
    fun items(): List<LedgerAccountCategory> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [LedgerAccountCategoryListPage].
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

    /** A builder for [LedgerAccountCategoryListPage]. */
    class Builder internal constructor() {

        private var service: LedgerAccountCategoryService? = null
        private var params: LedgerAccountCategoryListParams? = null
        private var headers: Headers? = null
        private var items: List<LedgerAccountCategory>? = null

        @JvmSynthetic
        internal fun from(ledgerAccountCategoryListPage: LedgerAccountCategoryListPage) = apply {
            service = ledgerAccountCategoryListPage.service
            params = ledgerAccountCategoryListPage.params
            headers = ledgerAccountCategoryListPage.headers
            items = ledgerAccountCategoryListPage.items
        }

        fun service(service: LedgerAccountCategoryService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LedgerAccountCategoryListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<LedgerAccountCategory>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [LedgerAccountCategoryListPage].
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
        fun build(): LedgerAccountCategoryListPage =
            LedgerAccountCategoryListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("headers", headers),
                checkRequired("items", items),
            )
    }

    class AutoPager(private val firstPage: LedgerAccountCategoryListPage) :
        Iterable<LedgerAccountCategory> {

        override fun iterator(): Iterator<LedgerAccountCategory> = iterator {
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

        fun stream(): Stream<LedgerAccountCategory> {
            return StreamSupport.stream(spliterator(), false)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerAccountCategoryListPage && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "LedgerAccountCategoryListPage{service=$service, params=$params, headers=$headers, items=$items}"
}
