// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonNull
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
                .amountLowerBound(0L)
                .amountUpperBound(0L)
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Currency.AED)
                .dateLowerBound(LocalDate.parse("2019-12-27"))
                .dateUpperBound(LocalDate.parse("2019-12-27"))
                .description("description")
                .direction(ExpectedPayment.Direction.CREDIT)
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .liveMode(true)
                .metadata(ExpectedPayment.Metadata.builder().build())
                .object_("object")
                .reconciliationFilters(JsonNull.of())
                .reconciliationGroups(JsonNull.of())
                .reconciliationMethod(ExpectedPayment.ReconciliationMethod.AUTOMATIC)
                .reconciliationRuleVariables(
                    listOf(
                        ReconciliationRule.builder()
                            .amountLowerBound(0L)
                            .amountUpperBound(0L)
                            .direction(ReconciliationRule.Direction.CREDIT)
                            .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .currency(Currency.AED)
                            .customIdentifiers(
                                ReconciliationRule.CustomIdentifiers.builder().build()
                            )
                            .dateLowerBound(LocalDate.parse("2019-12-27"))
                            .dateUpperBound(LocalDate.parse("2019-12-27"))
                            .type(ReconciliationRule.Type.ACH)
                            .build()
                    )
                )
                .remittanceInformation("remittance_information")
                .statementDescriptor("statement_descriptor")
                .status(ExpectedPayment.Status.ARCHIVED)
                .transactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .transactionLineItemId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .type(ExpectedPaymentType.ACH)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(expectedPayment).isNotNull
        assertThat(expectedPayment.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(expectedPayment.amountLowerBound()).contains(0L)
        assertThat(expectedPayment.amountUpperBound()).contains(0L)
        assertThat(expectedPayment.counterpartyId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(expectedPayment.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(expectedPayment.currency()).contains(Currency.AED)
        assertThat(expectedPayment.dateLowerBound()).contains(LocalDate.parse("2019-12-27"))
        assertThat(expectedPayment.dateUpperBound()).contains(LocalDate.parse("2019-12-27"))
        assertThat(expectedPayment.description()).contains("description")
        assertThat(expectedPayment.direction()).contains(ExpectedPayment.Direction.CREDIT)
        assertThat(expectedPayment.internalAccountId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(expectedPayment.ledgerTransactionId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(expectedPayment.liveMode()).isEqualTo(true)
        assertThat(expectedPayment.metadata()).isEqualTo(ExpectedPayment.Metadata.builder().build())
        assertThat(expectedPayment.object_()).isEqualTo("object")
        assertThat(expectedPayment._reconciliationFilters()).isEqualTo(JsonNull.of())
        assertThat(expectedPayment._reconciliationGroups()).isEqualTo(JsonNull.of())
        assertThat(expectedPayment.reconciliationMethod())
            .contains(ExpectedPayment.ReconciliationMethod.AUTOMATIC)
        assertThat(expectedPayment.reconciliationRuleVariables().get())
            .containsExactly(
                ReconciliationRule.builder()
                    .amountLowerBound(0L)
                    .amountUpperBound(0L)
                    .direction(ReconciliationRule.Direction.CREDIT)
                    .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .currency(Currency.AED)
                    .customIdentifiers(ReconciliationRule.CustomIdentifiers.builder().build())
                    .dateLowerBound(LocalDate.parse("2019-12-27"))
                    .dateUpperBound(LocalDate.parse("2019-12-27"))
                    .type(ReconciliationRule.Type.ACH)
                    .build()
            )
        assertThat(expectedPayment.remittanceInformation()).contains("remittance_information")
        assertThat(expectedPayment.statementDescriptor()).contains("statement_descriptor")
        assertThat(expectedPayment.status()).isEqualTo(ExpectedPayment.Status.ARCHIVED)
        assertThat(expectedPayment.transactionId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(expectedPayment.transactionLineItemId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(expectedPayment.type()).contains(ExpectedPaymentType.ACH)
        assertThat(expectedPayment.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
