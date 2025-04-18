// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalAccountVerifyParamsTest {

    @Test
    fun create() {
        ExternalAccountVerifyParams.builder()
            .id("id")
            .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .paymentType(ExternalAccountVerifyParams.PaymentType.ACH)
            .currency(Currency.AED)
            .fallbackType(ExternalAccountVerifyParams.FallbackType.ACH)
            .priority(ExternalAccountVerifyParams.Priority.HIGH)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ExternalAccountVerifyParams.builder()
                .id("id")
                .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .paymentType(ExternalAccountVerifyParams.PaymentType.ACH)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ExternalAccountVerifyParams.builder()
                .id("id")
                .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .paymentType(ExternalAccountVerifyParams.PaymentType.ACH)
                .currency(Currency.AED)
                .fallbackType(ExternalAccountVerifyParams.FallbackType.ACH)
                .priority(ExternalAccountVerifyParams.Priority.HIGH)
                .build()

        val body = params._body()

        assertThat(body.originatingAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.paymentType()).isEqualTo(ExternalAccountVerifyParams.PaymentType.ACH)
        assertThat(body.currency()).contains(Currency.AED)
        assertThat(body.fallbackType()).contains(ExternalAccountVerifyParams.FallbackType.ACH)
        assertThat(body.priority()).contains(ExternalAccountVerifyParams.Priority.HIGH)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExternalAccountVerifyParams.builder()
                .id("id")
                .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .paymentType(ExternalAccountVerifyParams.PaymentType.ACH)
                .build()

        val body = params._body()

        assertThat(body.originatingAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.paymentType()).isEqualTo(ExternalAccountVerifyParams.PaymentType.ACH)
    }
}
