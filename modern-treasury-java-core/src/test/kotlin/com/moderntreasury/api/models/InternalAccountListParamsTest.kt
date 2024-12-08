// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InternalAccountListParamsTest {

    @Test
    fun createInternalAccountListParams() {
        InternalAccountListParams.builder()
            .afterCursor("after_cursor")
            .counterpartyId("counterparty_id")
            .currency(Currency.AED)
            .legalEntityId("legal_entity_id")
            .metadata(InternalAccountListParams.Metadata.builder().build())
            .paymentDirection(TransactionDirection.CREDIT)
            .paymentType(InternalAccountListParams.PaymentType.ACH)
            .perPage(123L)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            InternalAccountListParams.builder()
                .afterCursor("after_cursor")
                .counterpartyId("counterparty_id")
                .currency(Currency.AED)
                .legalEntityId("legal_entity_id")
                .metadata(InternalAccountListParams.Metadata.builder().build())
                .paymentDirection(TransactionDirection.CREDIT)
                .paymentType(InternalAccountListParams.PaymentType.ACH)
                .perPage(123L)
                .build()
        val expected = QueryParams.builder()
        expected.put("after_cursor", "after_cursor")
        expected.put("counterparty_id", "counterparty_id")
        expected.put("currency", Currency.AED.toString())
        expected.put("legal_entity_id", "legal_entity_id")
        InternalAccountListParams.Metadata.builder().build().forEachQueryParam { key, values ->
            expected.put("metadata[$key]", values)
        }
        expected.put("payment_direction", TransactionDirection.CREDIT.toString())
        expected.put("payment_type", InternalAccountListParams.PaymentType.ACH.toString())
        expected.put("per_page", "123")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = InternalAccountListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
