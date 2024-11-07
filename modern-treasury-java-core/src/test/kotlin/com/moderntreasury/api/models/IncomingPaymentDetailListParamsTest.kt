// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.models.*
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IncomingPaymentDetailListParamsTest {

    @Test
    fun createIncomingPaymentDetailListParams() {
        IncomingPaymentDetailListParams.builder()
            .afterCursor("after_cursor")
            .asOfDateEnd(LocalDate.parse("2019-12-27"))
            .asOfDateStart(LocalDate.parse("2019-12-27"))
            .direction(TransactionDirection.CREDIT)
            .metadata(IncomingPaymentDetailListParams.Metadata.builder().build())
            .perPage(123L)
            .status(IncomingPaymentDetailListParams.Status.COMPLETED)
            .type(IncomingPaymentDetailListParams.Type.ACH)
            .virtualAccountId("virtual_account_id")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            IncomingPaymentDetailListParams.builder()
                .afterCursor("after_cursor")
                .asOfDateEnd(LocalDate.parse("2019-12-27"))
                .asOfDateStart(LocalDate.parse("2019-12-27"))
                .direction(TransactionDirection.CREDIT)
                .metadata(IncomingPaymentDetailListParams.Metadata.builder().build())
                .perPage(123L)
                .status(IncomingPaymentDetailListParams.Status.COMPLETED)
                .type(IncomingPaymentDetailListParams.Type.ACH)
                .virtualAccountId("virtual_account_id")
                .build()
        val expected = QueryParams.builder()
        expected.put("after_cursor", "after_cursor")
        expected.put("as_of_date_end", "2019-12-27")
        expected.put("as_of_date_start", "2019-12-27")
        expected.put("direction", TransactionDirection.CREDIT.toString())
        IncomingPaymentDetailListParams.Metadata.builder().build().forEachQueryParam { key, values
            ->
            expected.put("metadata[$key]", values)
        }
        expected.put("per_page", "123")
        expected.put("status", IncomingPaymentDetailListParams.Status.COMPLETED.toString())
        expected.put("type", IncomingPaymentDetailListParams.Type.ACH.toString())
        expected.put("virtual_account_id", "virtual_account_id")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = IncomingPaymentDetailListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
