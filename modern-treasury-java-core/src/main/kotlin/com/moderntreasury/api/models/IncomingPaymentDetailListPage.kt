// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.IncomingPaymentDetailService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** Get a list of Incoming Payment Details. */
class IncomingPaymentDetailListPage
private constructor(
    private val incomingPaymentDetailsService: IncomingPaymentDetailService,
    private val params: IncomingPaymentDetailListParams,
    private val headers: Headers,
    private val items: List<IncomingPaymentDetail>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<IncomingPaymentDetail> = items

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is IncomingPaymentDetailListPage && incomingPaymentDetailsService == other.incomingPaymentDetailsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(incomingPaymentDetailsService, params, items) /* spotless:on */

    override fun toString() =
        "IncomingPaymentDetailListPage{incomingPaymentDetailsService=$incomingPaymentDetailsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<IncomingPaymentDetailListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<IncomingPaymentDetailListPage> {
        return getNextPageParams().map { incomingPaymentDetailsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            incomingPaymentDetailsService: IncomingPaymentDetailService,
            params: IncomingPaymentDetailListParams,
            headers: Headers,
            items: List<IncomingPaymentDetail>,
        ) = IncomingPaymentDetailListPage(incomingPaymentDetailsService, params, headers, items)
    }

    class AutoPager(private val firstPage: IncomingPaymentDetailListPage) :
        Iterable<IncomingPaymentDetail> {

        override fun iterator(): Iterator<IncomingPaymentDetail> = iterator {
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

        fun stream(): Stream<IncomingPaymentDetail> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
