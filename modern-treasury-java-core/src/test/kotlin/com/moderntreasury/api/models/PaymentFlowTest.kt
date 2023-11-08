// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaymentFlowTest {

    @Test
    fun createPaymentFlow() {
        val paymentFlow =
            PaymentFlow.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(123L)
                .clientToken("string")
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("string")
                .direction(PaymentFlow.Direction.CREDIT)
                .dueDate(LocalDate.parse("2019-12-27"))
                .effectiveDateSelectionEnabled(true)
                .existingExternalAccountsFilter(PaymentFlow.ExistingExternalAccountsFilter.VERIFIED)
                .externalAccountCollection(PaymentFlow.ExternalAccountCollection.DISABLED)
                .liveMode(true)
                .object_("string")
                .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .paymentOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .receivingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .selectedEffectiveDate(LocalDate.parse("2019-12-27"))
                .status(PaymentFlow.Status.CANCELLED)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(paymentFlow).isNotNull
        assertThat(paymentFlow.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentFlow.amount()).contains(123L)
        assertThat(paymentFlow.clientToken()).contains("string")
        assertThat(paymentFlow.counterpartyId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentFlow.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(paymentFlow.currency()).contains("string")
        assertThat(paymentFlow.direction()).contains(PaymentFlow.Direction.CREDIT)
        assertThat(paymentFlow.dueDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(paymentFlow.effectiveDateSelectionEnabled()).contains(true)
        assertThat(paymentFlow.existingExternalAccountsFilter())
            .contains(PaymentFlow.ExistingExternalAccountsFilter.VERIFIED)
        assertThat(paymentFlow.externalAccountCollection())
            .contains(PaymentFlow.ExternalAccountCollection.DISABLED)
        assertThat(paymentFlow.liveMode()).contains(true)
        assertThat(paymentFlow.object_()).contains("string")
        assertThat(paymentFlow.originatingAccountId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentFlow.paymentOrderId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentFlow.receivingAccountId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentFlow.selectedEffectiveDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(paymentFlow.status()).contains(PaymentFlow.Status.CANCELLED)
        assertThat(paymentFlow.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
