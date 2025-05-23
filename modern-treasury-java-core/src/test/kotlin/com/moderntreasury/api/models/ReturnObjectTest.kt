// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReturnObjectTest {

    @Test
    fun create() {
        val returnObject =
            ReturnObject.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(0L)
                .code(ReturnObject.Code._901)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Currency.AED)
                .currentReturn(null)
                .dateOfDeath(LocalDate.parse("2019-12-27"))
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .failureReason("failure_reason")
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .liveMode(true)
                .object_("object")
                .reason("reason")
                .addReferenceNumber(
                    ReturnObject.PaymentReference.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .liveMode(true)
                        .object_("object")
                        .referenceNumber("reference_number")
                        .referenceNumberType(
                            ReturnObject.PaymentReference.ReferenceNumberType
                                .ACH_ORIGINAL_TRACE_NUMBER
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .returnableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .returnableType(ReturnObject.ReturnableType.INCOMING_PAYMENT_DETAIL)
                .role(ReturnObject.Role.ORIGINATING)
                .status(ReturnObject.Status.COMPLETED)
                .transactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .transactionLineItemId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .type(ReturnObject.Type.ACH)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .additionalInformation("additional_information")
                .data(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(returnObject.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(returnObject.amount()).isEqualTo(0L)
        assertThat(returnObject.code()).contains(ReturnObject.Code._901)
        assertThat(returnObject.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(returnObject.currency()).isEqualTo(Currency.AED)
        assertThat(returnObject.currentReturn()).isEmpty
        assertThat(returnObject.dateOfDeath()).contains(LocalDate.parse("2019-12-27"))
        assertThat(returnObject.discardedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(returnObject.failureReason()).contains("failure_reason")
        assertThat(returnObject.internalAccountId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(returnObject.ledgerTransactionId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(returnObject.liveMode()).isEqualTo(true)
        assertThat(returnObject.object_()).isEqualTo("object")
        assertThat(returnObject.reason()).contains("reason")
        assertThat(returnObject.referenceNumbers())
            .containsExactly(
                ReturnObject.PaymentReference.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .liveMode(true)
                    .object_("object")
                    .referenceNumber("reference_number")
                    .referenceNumberType(
                        ReturnObject.PaymentReference.ReferenceNumberType.ACH_ORIGINAL_TRACE_NUMBER
                    )
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(returnObject.returnableId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(returnObject.returnableType())
            .contains(ReturnObject.ReturnableType.INCOMING_PAYMENT_DETAIL)
        assertThat(returnObject.role()).isEqualTo(ReturnObject.Role.ORIGINATING)
        assertThat(returnObject.status()).isEqualTo(ReturnObject.Status.COMPLETED)
        assertThat(returnObject.transactionId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(returnObject.transactionLineItemId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(returnObject.type()).isEqualTo(ReturnObject.Type.ACH)
        assertThat(returnObject.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(returnObject.additionalInformation()).contains("additional_information")
        assertThat(returnObject._data()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val returnObject =
            ReturnObject.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(0L)
                .code(ReturnObject.Code._901)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Currency.AED)
                .currentReturn(null)
                .dateOfDeath(LocalDate.parse("2019-12-27"))
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .failureReason("failure_reason")
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .liveMode(true)
                .object_("object")
                .reason("reason")
                .addReferenceNumber(
                    ReturnObject.PaymentReference.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .liveMode(true)
                        .object_("object")
                        .referenceNumber("reference_number")
                        .referenceNumberType(
                            ReturnObject.PaymentReference.ReferenceNumberType
                                .ACH_ORIGINAL_TRACE_NUMBER
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .returnableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .returnableType(ReturnObject.ReturnableType.INCOMING_PAYMENT_DETAIL)
                .role(ReturnObject.Role.ORIGINATING)
                .status(ReturnObject.Status.COMPLETED)
                .transactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .transactionLineItemId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .type(ReturnObject.Type.ACH)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .additionalInformation("additional_information")
                .data(JsonValue.from(mapOf<String, Any>()))
                .build()

        val roundtrippedReturnObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(returnObject),
                jacksonTypeRef<ReturnObject>(),
            )

        assertThat(roundtrippedReturnObject).isEqualTo(returnObject)
    }
}
