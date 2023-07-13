package com.moderntreasury.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaymentFlowTest {

    @Test
    fun createPaymentFlow() {
        val paymentFlow =
            PaymentFlow.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .object_("string")
                .liveMode(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .clientToken("string")
                .status(PaymentFlow.Status.CANCELLED)
                .amount(123L)
                .currency("string")
                .direction(PaymentFlow.Direction.CREDIT)
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .receivingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .paymentOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(paymentFlow).isNotNull
        assertThat(paymentFlow.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentFlow.object_()).contains("string")
        assertThat(paymentFlow.liveMode()).contains(true)
        assertThat(paymentFlow.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(paymentFlow.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(paymentFlow.clientToken()).contains("string")
        assertThat(paymentFlow.status()).contains(PaymentFlow.Status.CANCELLED)
        assertThat(paymentFlow.amount()).contains(123L)
        assertThat(paymentFlow.currency()).contains("string")
        assertThat(paymentFlow.direction()).contains(PaymentFlow.Direction.CREDIT)
        assertThat(paymentFlow.counterpartyId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentFlow.receivingAccountId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentFlow.originatingAccountId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentFlow.paymentOrderId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
