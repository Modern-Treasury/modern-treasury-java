// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import java.time.LocalDate
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExpectedPaymentUpdateParamsTest {

    @Test
    fun create() {
        ExpectedPaymentUpdateParams.builder()
            .id("id")
            .amountLowerBound(0L)
            .amountUpperBound(0L)
            .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .currency(Currency.AED)
            .dateLowerBound(LocalDate.parse("2019-12-27"))
            .dateUpperBound(LocalDate.parse("2019-12-27"))
            .description("description")
            .direction(ExpectedPaymentUpdateParams.Direction.CREDIT)
            .externalId("external_id")
            .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .metadata(
                ExpectedPaymentUpdateParams.Metadata.builder()
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
            .status(ExpectedPaymentUpdateParams.Status.RECONCILED)
            .type(ExpectedPaymentType.ACH)
            .build()
    }

    @Test
    fun pathParams() {
        val params = ExpectedPaymentUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ExpectedPaymentUpdateParams.builder()
                .id("id")
                .amountLowerBound(0L)
                .amountUpperBound(0L)
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .currency(Currency.AED)
                .dateLowerBound(LocalDate.parse("2019-12-27"))
                .dateUpperBound(LocalDate.parse("2019-12-27"))
                .description("description")
                .direction(ExpectedPaymentUpdateParams.Direction.CREDIT)
                .externalId("external_id")
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .metadata(
                    ExpectedPaymentUpdateParams.Metadata.builder()
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
                .status(ExpectedPaymentUpdateParams.Status.RECONCILED)
                .type(ExpectedPaymentType.ACH)
                .build()

        val body = params._body()

        assertThat(body.amountLowerBound()).contains(0L)
        assertThat(body.amountUpperBound()).contains(0L)
        assertThat(body.counterpartyId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.currency()).contains(Currency.AED)
        assertThat(body.dateLowerBound()).contains(LocalDate.parse("2019-12-27"))
        assertThat(body.dateUpperBound()).contains(LocalDate.parse("2019-12-27"))
        assertThat(body.description()).contains("description")
        assertThat(body.direction()).contains(ExpectedPaymentUpdateParams.Direction.CREDIT)
        assertThat(body.externalId()).contains("external_id")
        assertThat(body.internalAccountId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.metadata())
            .contains(
                ExpectedPaymentUpdateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(body._reconciliationFilters()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body._reconciliationGroups()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.reconciliationRuleVariables().getOrNull())
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
        assertThat(body.remittanceInformation()).contains("remittance_information")
        assertThat(body.statementDescriptor()).contains("statement_descriptor")
        assertThat(body.status()).contains(ExpectedPaymentUpdateParams.Status.RECONCILED)
        assertThat(body.type()).contains(ExpectedPaymentType.ACH)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ExpectedPaymentUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
