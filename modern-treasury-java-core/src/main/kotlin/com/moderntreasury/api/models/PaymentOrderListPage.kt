// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.PaymentOrderService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** Get a list of all payment orders */
class PaymentOrderListPage
private constructor(
    private val paymentOrdersService: PaymentOrderService,
    private val params: PaymentOrderListParams,
    private val headers: Headers,
    private val items: List<PaymentOrder>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<PaymentOrder> = items

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentOrderListPage && paymentOrdersService == other.paymentOrdersService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(paymentOrdersService, params, items) /* spotless:on */

    override fun toString() =
        "PaymentOrderListPage{paymentOrdersService=$paymentOrdersService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<PaymentOrderListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<PaymentOrderListPage> {
        return getNextPageParams().map { paymentOrdersService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            paymentOrdersService: PaymentOrderService,
            params: PaymentOrderListParams,
            headers: Headers,
            items: List<PaymentOrder>,
        ) = PaymentOrderListPage(paymentOrdersService, params, headers, items)
    }

    class AutoPager(private val firstPage: PaymentOrderListPage) : Iterable<PaymentOrder> {

        override fun iterator(): Iterator<PaymentOrder> = iterator {
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

        fun stream(): Stream<PaymentOrder> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
