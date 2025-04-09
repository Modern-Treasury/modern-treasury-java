// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.PaymentFlowService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** list payment_flows */
class PaymentFlowListPage
private constructor(
    private val paymentFlowsService: PaymentFlowService,
    private val params: PaymentFlowListParams,
    private val headers: Headers,
    private val items: List<PaymentFlow>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<PaymentFlow> = items

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentFlowListPage && paymentFlowsService == other.paymentFlowsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(paymentFlowsService, params, items) /* spotless:on */

    override fun toString() =
        "PaymentFlowListPage{paymentFlowsService=$paymentFlowsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<PaymentFlowListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<PaymentFlowListPage> {
        return getNextPageParams().map { paymentFlowsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            paymentFlowsService: PaymentFlowService,
            params: PaymentFlowListParams,
            headers: Headers,
            items: List<PaymentFlow>,
        ) = PaymentFlowListPage(paymentFlowsService, params, headers, items)
    }

    class AutoPager(private val firstPage: PaymentFlowListPage) : Iterable<PaymentFlow> {

        override fun iterator(): Iterator<PaymentFlow> = iterator {
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

        fun stream(): Stream<PaymentFlow> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
