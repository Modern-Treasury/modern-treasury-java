// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.jsonMapper
import java.time.LocalDate
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExpectedPaymentUpdateRequestTest {

    @Test
    fun create() {
        val expectedPaymentUpdateRequest =
            ExpectedPaymentUpdateRequest.builder()
                .amountLowerBound(0L)
                .amountReconciled(0L)
                .amountReconciledDirection(
                    ExpectedPaymentUpdateRequest.AmountReconciledDirection.CREDIT
                )
                .amountUnreconciled(0L)
                .amountUnreconciledDirection(
                    ExpectedPaymentUpdateRequest.AmountUnreconciledDirection.CREDIT
                )
                .amountUpperBound(0L)
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .currency(Currency.AED)
                .dateLowerBound(LocalDate.parse("2019-12-27"))
                .dateUpperBound(LocalDate.parse("2019-12-27"))
                .description("description")
                .direction(ExpectedPaymentUpdateRequest.Direction.CREDIT)
                .externalId("external_id")
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .metadata(
                    ExpectedPaymentUpdateRequest.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("key", JsonValue.from("value"))
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
                .status(ExpectedPaymentUpdateRequest.Status.RECONCILED)
                .type(ExpectedPaymentType.ACH)
                .build()

        assertThat(expectedPaymentUpdateRequest.amountLowerBound()).contains(0L)
        assertThat(expectedPaymentUpdateRequest.amountReconciled()).contains(0L)
        assertThat(expectedPaymentUpdateRequest.amountReconciledDirection())
            .contains(ExpectedPaymentUpdateRequest.AmountReconciledDirection.CREDIT)
        assertThat(expectedPaymentUpdateRequest.amountUnreconciled()).contains(0L)
        assertThat(expectedPaymentUpdateRequest.amountUnreconciledDirection())
            .contains(ExpectedPaymentUpdateRequest.AmountUnreconciledDirection.CREDIT)
        assertThat(expectedPaymentUpdateRequest.amountUpperBound()).contains(0L)
        assertThat(expectedPaymentUpdateRequest.counterpartyId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(expectedPaymentUpdateRequest.currency()).contains(Currency.AED)
        assertThat(expectedPaymentUpdateRequest.dateLowerBound())
            .contains(LocalDate.parse("2019-12-27"))
        assertThat(expectedPaymentUpdateRequest.dateUpperBound())
            .contains(LocalDate.parse("2019-12-27"))
        assertThat(expectedPaymentUpdateRequest.description()).contains("description")
        assertThat(expectedPaymentUpdateRequest.direction())
            .contains(ExpectedPaymentUpdateRequest.Direction.CREDIT)
        assertThat(expectedPaymentUpdateRequest.externalId()).contains("external_id")
        assertThat(expectedPaymentUpdateRequest.internalAccountId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(expectedPaymentUpdateRequest.metadata())
            .contains(
                ExpectedPaymentUpdateRequest.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(expectedPaymentUpdateRequest._reconciliationFilters())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(expectedPaymentUpdateRequest._reconciliationGroups())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(expectedPaymentUpdateRequest.reconciliationRuleVariables().getOrNull())
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
        assertThat(expectedPaymentUpdateRequest.remittanceInformation())
            .contains("remittance_information")
        assertThat(expectedPaymentUpdateRequest.statementDescriptor())
            .contains("statement_descriptor")
        assertThat(expectedPaymentUpdateRequest.status())
            .contains(ExpectedPaymentUpdateRequest.Status.RECONCILED)
        assertThat(expectedPaymentUpdateRequest.type()).contains(ExpectedPaymentType.ACH)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val expectedPaymentUpdateRequest =
            ExpectedPaymentUpdateRequest.builder()
                .amountLowerBound(0L)
                .amountReconciled(0L)
                .amountReconciledDirection(
                    ExpectedPaymentUpdateRequest.AmountReconciledDirection.CREDIT
                )
                .amountUnreconciled(0L)
                .amountUnreconciledDirection(
                    ExpectedPaymentUpdateRequest.AmountUnreconciledDirection.CREDIT
                )
                .amountUpperBound(0L)
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .currency(Currency.AED)
                .dateLowerBound(LocalDate.parse("2019-12-27"))
                .dateUpperBound(LocalDate.parse("2019-12-27"))
                .description("description")
                .direction(ExpectedPaymentUpdateRequest.Direction.CREDIT)
                .externalId("external_id")
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .metadata(
                    ExpectedPaymentUpdateRequest.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("key", JsonValue.from("value"))
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
                .status(ExpectedPaymentUpdateRequest.Status.RECONCILED)
                .type(ExpectedPaymentType.ACH)
                .build()

        val roundtrippedExpectedPaymentUpdateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expectedPaymentUpdateRequest),
                jacksonTypeRef<ExpectedPaymentUpdateRequest>(),
            )

        assertThat(roundtrippedExpectedPaymentUpdateRequest).isEqualTo(expectedPaymentUpdateRequest)
    }
}
