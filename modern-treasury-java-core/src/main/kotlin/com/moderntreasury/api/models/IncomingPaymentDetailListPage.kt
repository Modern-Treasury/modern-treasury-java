// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPager
import com.moderntreasury.api.core.Page
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.IncomingPaymentDetailService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see [IncomingPaymentDetailService.list] */
class IncomingPaymentDetailListPage
private constructor(
    private val service: IncomingPaymentDetailService,
    private val params: IncomingPaymentDetailListParams,
    private val headers: Headers,
    private val items: List<IncomingPaymentDetail>,
) : Page<IncomingPaymentDetail> {

    fun perPage(): Optional<String> =
        Optional.ofNullable(headers.values("X-Per-Page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("X-After-Cursor").firstOrNull())

    override fun hasNextPage(): Boolean = items().isNotEmpty() && afterCursor().isPresent

    fun nextPageParams(): IncomingPaymentDetailListParams {
        val nextCursor =
            afterCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override fun nextPage(): IncomingPaymentDetailListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<IncomingPaymentDetail> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): IncomingPaymentDetailListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<IncomingPaymentDetail> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [IncomingPaymentDetailListPage].
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

    /** A builder for [IncomingPaymentDetailListPage]. */
    class Builder internal constructor() {

        private var service: IncomingPaymentDetailService? = null
        private var params: IncomingPaymentDetailListParams? = null
        private var headers: Headers? = null
        private var items: List<IncomingPaymentDetail>? = null

        @JvmSynthetic
        internal fun from(incomingPaymentDetailListPage: IncomingPaymentDetailListPage) = apply {
            service = incomingPaymentDetailListPage.service
            params = incomingPaymentDetailListPage.params
            headers = incomingPaymentDetailListPage.headers
            items = incomingPaymentDetailListPage.items
        }

        fun service(service: IncomingPaymentDetailService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: IncomingPaymentDetailListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<IncomingPaymentDetail>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [IncomingPaymentDetailListPage].
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
        fun build(): IncomingPaymentDetailListPage =
            IncomingPaymentDetailListPage(
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

        return /* spotless:off */ other is IncomingPaymentDetailListPage && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "IncomingPaymentDetailListPage{service=$service, params=$params, headers=$headers, items=$items}"
}
