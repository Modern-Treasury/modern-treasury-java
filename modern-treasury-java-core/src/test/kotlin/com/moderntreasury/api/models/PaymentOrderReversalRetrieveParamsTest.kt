// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaymentOrderReversalRetrieveParamsTest {

    @Test
    fun createPaymentOrderReversalRetrieveParams() {
        PaymentOrderReversalRetrieveParams.builder()
            .paymentOrderId("string")
            .reversalId("string")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            PaymentOrderReversalRetrieveParams.builder()
                .paymentOrderId("string")
                .reversalId("string")
                .build()
        assertThat(params).isNotNull
        // path param "paymentOrderId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // path param "reversalId"
        assertThat(params.getPathParam(1)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
