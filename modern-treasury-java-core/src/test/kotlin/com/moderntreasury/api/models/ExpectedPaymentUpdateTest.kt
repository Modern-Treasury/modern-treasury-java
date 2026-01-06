// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.jsonMapper
import java.time.LocalDate
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExpectedPaymentUpdateTest {

    @Test
    fun create() {
        val expectedPaymentUpdate =
            ExpectedPaymentUpdate.builder()
                .amountLowerBound(0L)
                .amountReconciled(0L)
                .amountReconciledDirection(ExpectedPaymentUpdate.AmountReconciledDirection.CREDIT)
                .amountUnreconciled(0L)
                .amountUnreconciledDirection(
                    ExpectedPaymentUpdate.AmountUnreconciledDirection.CREDIT
                )
                .amountUpperBound(0L)
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .currency(Currency.AED)
                .dateLowerBound(LocalDate.parse("2019-12-27"))
                .dateUpperBound(LocalDate.parse("2019-12-27"))
                .description("description")
                .direction(ExpectedPaymentUpdate.Direction.CREDIT)
                .externalId("external_id")
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .metadata(
                    ExpectedPaymentUpdate.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .reconciliationFilters(JsonValue.from(mapOf<String, Any>()))
                .reconciliationGroups(JsonValue.from(mapOf<String, Any>()))
                .addReconciliationRuleVariable(
                    ReconciliationRule.builder()
                        .amountLowerBound(0L)
                        .amountUpperBound(0L)
                        .direction(ReconciliationRule.Direction.CREDIT)
                        .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .currency(Currency.AED)
                        .customIdentifiers(
                            ReconciliationRule.CustomIdentifiers.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .dateLowerBound(LocalDate.parse("2019-12-27"))
                        .dateUpperBound(LocalDate.parse("2019-12-27"))
                        .type(ReconciliationRule.Type.ACH)
                        .build()
                )
                .remittanceInformation("remittance_information")
                .statementDescriptor("statement_descriptor")
                .status(ExpectedPaymentUpdate.Status.RECONCILED)
                .type(ExpectedPaymentType.ACH)
                .build()

        assertThat(expectedPaymentUpdate.amountLowerBound()).contains(0L)
        assertThat(expectedPaymentUpdate.amountReconciled()).contains(0L)
        assertThat(expectedPaymentUpdate.amountReconciledDirection())
            .contains(ExpectedPaymentUpdate.AmountReconciledDirection.CREDIT)
        assertThat(expectedPaymentUpdate.amountUnreconciled()).contains(0L)
        assertThat(expectedPaymentUpdate.amountUnreconciledDirection())
            .contains(ExpectedPaymentUpdate.AmountUnreconciledDirection.CREDIT)
        assertThat(expectedPaymentUpdate.amountUpperBound()).contains(0L)
        assertThat(expectedPaymentUpdate.counterpartyId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(expectedPaymentUpdate.currency()).contains(Currency.AED)
        assertThat(expectedPaymentUpdate.dateLowerBound()).contains(LocalDate.parse("2019-12-27"))
        assertThat(expectedPaymentUpdate.dateUpperBound()).contains(LocalDate.parse("2019-12-27"))
        assertThat(expectedPaymentUpdate.description()).contains("description")
        assertThat(expectedPaymentUpdate.direction())
            .contains(ExpectedPaymentUpdate.Direction.CREDIT)
        assertThat(expectedPaymentUpdate.externalId()).contains("external_id")
        assertThat(expectedPaymentUpdate.internalAccountId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(expectedPaymentUpdate.metadata())
            .contains(
                ExpectedPaymentUpdate.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(expectedPaymentUpdate._reconciliationFilters())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(expectedPaymentUpdate._reconciliationGroups())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(expectedPaymentUpdate.reconciliationRuleVariables().getOrNull())
            .containsExactly(
                ReconciliationRule.builder()
                    .amountLowerBound(0L)
                    .amountUpperBound(0L)
                    .direction(ReconciliationRule.Direction.CREDIT)
                    .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .currency(Currency.AED)
                    .customIdentifiers(
                        ReconciliationRule.CustomIdentifiers.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .dateLowerBound(LocalDate.parse("2019-12-27"))
                    .dateUpperBound(LocalDate.parse("2019-12-27"))
                    .type(ReconciliationRule.Type.ACH)
                    .build()
            )
        assertThat(expectedPaymentUpdate.remittanceInformation()).contains("remittance_information")
        assertThat(expectedPaymentUpdate.statementDescriptor()).contains("statement_descriptor")
        assertThat(expectedPaymentUpdate.status()).contains(ExpectedPaymentUpdate.Status.RECONCILED)
        assertThat(expectedPaymentUpdate.type()).contains(ExpectedPaymentType.ACH)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val expectedPaymentUpdate =
            ExpectedPaymentUpdate.builder()
                .amountLowerBound(0L)
                .amountReconciled(0L)
                .amountReconciledDirection(ExpectedPaymentUpdate.AmountReconciledDirection.CREDIT)
                .amountUnreconciled(0L)
                .amountUnreconciledDirection(
                    ExpectedPaymentUpdate.AmountUnreconciledDirection.CREDIT
                )
                .amountUpperBound(0L)
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .currency(Currency.AED)
                .dateLowerBound(LocalDate.parse("2019-12-27"))
                .dateUpperBound(LocalDate.parse("2019-12-27"))
                .description("description")
                .direction(ExpectedPaymentUpdate.Direction.CREDIT)
                .externalId("external_id")
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .metadata(
                    ExpectedPaymentUpdate.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .reconciliationFilters(JsonValue.from(mapOf<String, Any>()))
                .reconciliationGroups(JsonValue.from(mapOf<String, Any>()))
                .addReconciliationRuleVariable(
                    ReconciliationRule.builder()
                        .amountLowerBound(0L)
                        .amountUpperBound(0L)
                        .direction(ReconciliationRule.Direction.CREDIT)
                        .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .currency(Currency.AED)
                        .customIdentifiers(
                            ReconciliationRule.CustomIdentifiers.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .dateLowerBound(LocalDate.parse("2019-12-27"))
                        .dateUpperBound(LocalDate.parse("2019-12-27"))
                        .type(ReconciliationRule.Type.ACH)
                        .build()
                )
                .remittanceInformation("remittance_information")
                .statementDescriptor("statement_descriptor")
                .status(ExpectedPaymentUpdate.Status.RECONCILED)
                .type(ExpectedPaymentType.ACH)
                .build()

        val roundtrippedExpectedPaymentUpdate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expectedPaymentUpdate),
                jacksonTypeRef<ExpectedPaymentUpdate>(),
            )

        assertThat(roundtrippedExpectedPaymentUpdate).isEqualTo(expectedPaymentUpdate)
    }
}
