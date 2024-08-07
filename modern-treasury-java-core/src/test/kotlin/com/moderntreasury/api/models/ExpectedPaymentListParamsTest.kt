// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExpectedPaymentListParamsTest {

    @Test
    fun createExpectedPaymentListParams() {
        ExpectedPaymentListParams.builder()
            .afterCursor("after_cursor")
            .counterpartyId("counterparty_id")
            .createdAtLowerBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .createdAtUpperBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .direction(TransactionDirection.CREDIT)
            .internalAccountId("internal_account_id")
            .metadata(ExpectedPaymentListParams.Metadata.builder().build())
            .perPage(123L)
            .status(ExpectedPaymentListParams.Status.ARCHIVED)
            .type(ExpectedPaymentListParams.Type.ACH)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            ExpectedPaymentListParams.builder()
                .afterCursor("after_cursor")
                .counterpartyId("counterparty_id")
                .createdAtLowerBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAtUpperBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .direction(TransactionDirection.CREDIT)
                .internalAccountId("internal_account_id")
                .metadata(ExpectedPaymentListParams.Metadata.builder().build())
                .perPage(123L)
                .status(ExpectedPaymentListParams.Status.ARCHIVED)
                .type(ExpectedPaymentListParams.Type.ACH)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("after_cursor", listOf("after_cursor"))
        expected.put("counterparty_id", listOf("counterparty_id"))
        expected.put("created_at_lower_bound", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("created_at_upper_bound", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("direction", listOf(TransactionDirection.CREDIT.toString()))
        expected.put("internal_account_id", listOf("internal_account_id"))
        ExpectedPaymentListParams.Metadata.builder().build().forEachQueryParam { key, values ->
            expected.put("metadata[$key]", values)
        }
        expected.put("per_page", listOf("123"))
        expected.put("status", listOf(ExpectedPaymentListParams.Status.ARCHIVED.toString()))
        expected.put("type", listOf(ExpectedPaymentListParams.Type.ACH.toString()))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = ExpectedPaymentListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
