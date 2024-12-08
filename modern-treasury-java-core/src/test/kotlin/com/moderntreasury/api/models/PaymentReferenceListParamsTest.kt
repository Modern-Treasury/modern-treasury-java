// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaymentReferenceListParamsTest {

    @Test
    fun createPaymentReferenceListParams() {
        PaymentReferenceListParams.builder()
            .afterCursor("after_cursor")
            .perPage(123L)
            .referenceNumber("reference_number")
            .referenceableId("referenceable_id")
            .referenceableType(PaymentReferenceListParams.ReferenceableType.PAYMENT_ORDER)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            PaymentReferenceListParams.builder()
                .afterCursor("after_cursor")
                .perPage(123L)
                .referenceNumber("reference_number")
                .referenceableId("referenceable_id")
                .referenceableType(PaymentReferenceListParams.ReferenceableType.PAYMENT_ORDER)
                .build()
        val expected = QueryParams.builder()
        expected.put("after_cursor", "after_cursor")
        expected.put("per_page", "123")
        expected.put("reference_number", "reference_number")
        expected.put("referenceable_id", "referenceable_id")
        expected.put(
            "referenceable_type",
            PaymentReferenceListParams.ReferenceableType.PAYMENT_ORDER.toString()
        )
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = PaymentReferenceListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
