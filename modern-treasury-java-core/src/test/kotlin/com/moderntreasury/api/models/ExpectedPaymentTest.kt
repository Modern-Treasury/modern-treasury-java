// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonNull
import com.moderntreasury.api.core.JsonValue
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExpectedPaymentTest {

    @Test
    fun createExpectedPayment() {
        val expectedPayment =
            ExpectedPayment.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amountLowerBound(123L)
                .amountUpperBound(123L)
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Currency.AED)
                .dateLowerBound(LocalDate.parse("2019-12-27"))
                .dateUpperBound(LocalDate.parse("2019-12-27"))
                .description("string")
                .direction(TransactionDirection.CREDIT)
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .liveMode(true)
                .metadata(ExpectedPayment.Metadata.builder().build())
                .object_("string")
                .reconciliationFilters(JsonNull.of())
                .reconciliationGroups(JsonNull.of())
                .reconciliationMethod(ExpectedPayment.ReconciliationMethod.AUTOMATIC)
                .reconciliationRuleVariables(listOf(JsonValue.from(mapOf<String, Any>())))
                .remittanceInformation("string")
                .statementDescriptor("string")
                .status(ExpectedPayment.Status.ARCHIVED)
                .transactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .transactionLineItemId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .type(ExpectedPaymentType.ACH)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(expectedPayment).isNotNull
        assertThat(expectedPayment.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(expectedPayment.amountLowerBound()).isEqualTo(123L)
        assertThat(expectedPayment.amountUpperBound()).isEqualTo(123L)
        assertThat(expectedPayment.counterpartyId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(expectedPayment.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(expectedPayment.currency()).contains(Currency.AED)
        assertThat(expectedPayment.dateLowerBound()).contains(LocalDate.parse("2019-12-27"))
        assertThat(expectedPayment.dateUpperBound()).contains(LocalDate.parse("2019-12-27"))
        assertThat(expectedPayment.description()).contains("string")
        assertThat(expectedPayment.direction()).isEqualTo(TransactionDirection.CREDIT)
        assertThat(expectedPayment.internalAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(expectedPayment.ledgerTransactionId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(expectedPayment.liveMode()).isEqualTo(true)
        assertThat(expectedPayment.metadata()).isEqualTo(ExpectedPayment.Metadata.builder().build())
        assertThat(expectedPayment.object_()).isEqualTo("string")
        assertThat(expectedPayment._reconciliationFilters()).isEqualTo(JsonNull.of())
        assertThat(expectedPayment._reconciliationGroups()).isEqualTo(JsonNull.of())
        assertThat(expectedPayment.reconciliationMethod())
            .contains(ExpectedPayment.ReconciliationMethod.AUTOMATIC)
        assertThat(expectedPayment.reconciliationRuleVariables().get())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(expectedPayment.remittanceInformation()).contains("string")
        assertThat(expectedPayment.statementDescriptor()).contains("string")
        assertThat(expectedPayment.status()).isEqualTo(ExpectedPayment.Status.ARCHIVED)
        assertThat(expectedPayment.transactionId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(expectedPayment.transactionLineItemId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(expectedPayment.type()).contains(ExpectedPaymentType.ACH)
        assertThat(expectedPayment.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
