// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.ExpectedPaymentService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** list expected_payments */
class ExpectedPaymentListPage
private constructor(
    private val expectedPaymentsService: ExpectedPaymentService,
    private val params: ExpectedPaymentListParams,
    private val headers: Headers,
    private val items: List<ExpectedPayment>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<ExpectedPayment> = items

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExpectedPaymentListPage && expectedPaymentsService == other.expectedPaymentsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(expectedPaymentsService, params, items) /* spotless:on */

    override fun toString() =
        "ExpectedPaymentListPage{expectedPaymentsService=$expectedPaymentsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<ExpectedPaymentListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<ExpectedPaymentListPage> {
        return getNextPageParams().map { expectedPaymentsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            expectedPaymentsService: ExpectedPaymentService,
            params: ExpectedPaymentListParams,
            headers: Headers,
            items: List<ExpectedPayment>,
        ) = ExpectedPaymentListPage(expectedPaymentsService, params, headers, items)
    }

    class AutoPager(private val firstPage: ExpectedPaymentListPage) : Iterable<ExpectedPayment> {

        override fun iterator(): Iterator<ExpectedPayment> = iterator {
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

        fun stream(): Stream<ExpectedPayment> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
