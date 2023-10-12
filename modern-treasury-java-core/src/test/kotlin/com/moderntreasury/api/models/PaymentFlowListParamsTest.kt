// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaymentFlowListParamsTest {

    @Test
    fun createPaymentFlowListParams() {
        PaymentFlowListParams.builder()
            .afterCursor("string")
            .clientToken("string")
            .counterpartyId("string")
            .originatingAccountId("string")
            .paymentOrderId("string")
            .perPage(123L)
            .receivingAccountId("string")
            .status("string")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            PaymentFlowListParams.builder()
                .afterCursor("string")
                .clientToken("string")
                .counterpartyId("string")
                .originatingAccountId("string")
                .paymentOrderId("string")
                .perPage(123L)
                .receivingAccountId("string")
                .status("string")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("after_cursor", listOf("string"))
        expected.put("client_token", listOf("string"))
        expected.put("counterparty_id", listOf("string"))
        expected.put("originating_account_id", listOf("string"))
        expected.put("payment_order_id", listOf("string"))
        expected.put("per_page", listOf("123"))
        expected.put("receiving_account_id", listOf("string"))
        expected.put("status", listOf("string"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = PaymentFlowListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
