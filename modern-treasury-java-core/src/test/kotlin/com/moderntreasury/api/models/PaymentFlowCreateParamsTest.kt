// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentFlowCreateParamsTest {

    @Test
    fun create() {
        PaymentFlowCreateParams.builder()
            .amount(0L)
            .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .currency("currency")
            .direction(PaymentFlowCreateParams.Direction.CREDIT)
            .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .dueDate(LocalDate.parse("2019-12-27"))
            .build()
    }

    @Test
    fun body() {
        val params =
            PaymentFlowCreateParams.builder()
                .amount(0L)
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .currency("currency")
                .direction(PaymentFlowCreateParams.Direction.CREDIT)
                .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .dueDate(LocalDate.parse("2019-12-27"))
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(0L)
        assertThat(body.counterpartyId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.currency()).isEqualTo("currency")
        assertThat(body.direction()).isEqualTo(PaymentFlowCreateParams.Direction.CREDIT)
        assertThat(body.originatingAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.dueDate()).contains(LocalDate.parse("2019-12-27"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PaymentFlowCreateParams.builder()
                .amount(0L)
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .currency("currency")
                .direction(PaymentFlowCreateParams.Direction.CREDIT)
                .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(0L)
        assertThat(body.counterpartyId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.currency()).isEqualTo("currency")
        assertThat(body.direction()).isEqualTo(PaymentFlowCreateParams.Direction.CREDIT)
        assertThat(body.originatingAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
