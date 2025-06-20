// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPager
import com.moderntreasury.api.core.Page
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.PaperItemService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see [PaperItemService.list] */
class PaperItemListPage
private constructor(
    private val service: PaperItemService,
    private val params: PaperItemListParams,
    private val headers: Headers,
    private val items: List<PaperItem>,
) : Page<PaperItem> {

    fun perPage(): Optional<String> =
        Optional.ofNullable(headers.values("X-Per-Page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("X-After-Cursor").firstOrNull())

    override fun hasNextPage(): Boolean = items().isNotEmpty() && afterCursor().isPresent

    fun nextPageParams(): PaperItemListParams {
        val nextCursor =
            afterCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override fun nextPage(): PaperItemListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PaperItem> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PaperItemListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<PaperItem> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PaperItemListPage].
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

    /** A builder for [PaperItemListPage]. */
    class Builder internal constructor() {

        private var service: PaperItemService? = null
        private var params: PaperItemListParams? = null
        private var headers: Headers? = null
        private var items: List<PaperItem>? = null

        @JvmSynthetic
        internal fun from(paperItemListPage: PaperItemListPage) = apply {
            service = paperItemListPage.service
            params = paperItemListPage.params
            headers = paperItemListPage.headers
            items = paperItemListPage.items
        }

        fun service(service: PaperItemService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PaperItemListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<PaperItem>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [PaperItemListPage].
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
        fun build(): PaperItemListPage =
            PaperItemListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("headers", headers),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaperItemListPage && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "PaperItemListPage{service=$service, params=$params, headers=$headers, items=$items}"
}
