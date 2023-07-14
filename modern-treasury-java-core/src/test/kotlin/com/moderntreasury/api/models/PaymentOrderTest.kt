package com.moderntreasury.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaymentOrderTest {

    @Test
    fun createPaymentOrder() {
        val paymentOrder =
            PaymentOrder.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accounting(
                    PaymentOrder.Accounting.builder()
                        .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .classId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .accountingCategoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountingLedgerClassId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(123L)
                .chargeBearer(PaymentOrder.ChargeBearer.SHARED)
                .complianceRuleMetadata(PaymentOrder.ComplianceRuleMetadata.builder().build())
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Currency.AED)
                .currentReturn(
                    ReturnObject.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .additionalInformation("string")
                        .amount(123L)
                        .code(ReturnObject.Code._901)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(Currency.AED)
                        .currentReturn(
                            ReturnObject.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .additionalInformation("string")
                                .amount(123L)
                                .code(ReturnObject.Code._901)
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .currency(Currency.AED)
                                .dateOfDeath(LocalDate.parse("2019-12-27"))
                                .failureReason("string")
                                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .liveMode(true)
                                .object_("string")
                                .reason("string")
                                .referenceNumbers(
                                    listOf(
                                        ReturnObject.PaymentReference.builder()
                                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                            .createdAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .liveMode(true)
                                            .object_("string")
                                            .referenceNumber("string")
                                            .referenceNumberType(
                                                ReturnObject.PaymentReference.ReferenceNumberType
                                                    .ACH_ORIGINAL_TRACE_NUMBER
                                            )
                                            .updatedAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .build()
                                    )
                                )
                                .returnableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .returnableType(ReturnObject.ReturnableType.INCOMING_PAYMENT_DETAIL)
                                .role(ReturnObject.Role.ORIGINATING)
                                .status(ReturnObject.Status.COMPLETED)
                                .transactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .transactionLineItemId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .type(ReturnObject.Type.ACH)
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .dateOfDeath(LocalDate.parse("2019-12-27"))
                        .failureReason("string")
                        .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .liveMode(true)
                        .object_("string")
                        .reason("string")
                        .referenceNumbers(
                            listOf(
                                ReturnObject.PaymentReference.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .liveMode(true)
                                    .object_("string")
                                    .referenceNumber("string")
                                    .referenceNumberType(
                                        ReturnObject.PaymentReference.ReferenceNumberType
                                            .ACH_ORIGINAL_TRACE_NUMBER
                                    )
                                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                        )
                        .returnableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .returnableType(ReturnObject.ReturnableType.INCOMING_PAYMENT_DETAIL)
                        .role(ReturnObject.Role.ORIGINATING)
                        .status(ReturnObject.Status.COMPLETED)
                        .transactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .transactionLineItemId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .type(ReturnObject.Type.ACH)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .decisionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("string")
                .direction(PaymentOrder.Direction.CREDIT)
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .foreignExchangeContract("string")
                .foreignExchangeIndicator(PaymentOrder.ForeignExchangeIndicator.FIXED_TO_VARIABLE)
                .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .liveMode(true)
                .metadata(PaymentOrder.Metadata.builder().build())
                .nsfProtected(true)
                .object_("string")
                .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .originatingPartyName("string")
                .priority(PaymentOrder.Priority.HIGH)
                .purpose("string")
                .receivingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .receivingAccountType(PaymentOrder.ReceivingAccountType.INTERNAL_ACCOUNT)
                .referenceNumbers(
                    listOf(
                        PaymentOrder.PaymentReference.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .liveMode(true)
                            .object_("string")
                            .referenceNumber("string")
                            .referenceNumberType(
                                PaymentOrder.PaymentReference.ReferenceNumberType
                                    .ACH_ORIGINAL_TRACE_NUMBER
                            )
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                )
                .remittanceInformation("string")
                .sendRemittanceAdvice(true)
                .statementDescriptor("string")
                .status(PaymentOrder.Status.APPROVED)
                .subtype(PaymentOrderSubtype.BACS_NEW_INSTRUCTION)
                .transactionIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .transactionMonitoringEnabled(true)
                .type(PaymentOrderType.ACH)
                .ultimateOriginatingPartyIdentifier("string")
                .ultimateOriginatingPartyName("string")
                .ultimateReceivingPartyIdentifier("string")
                .ultimateReceivingPartyName("string")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .vendorFailureReason("string")
                .build()
        assertThat(paymentOrder).isNotNull
        assertThat(paymentOrder.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentOrder.object_()).isEqualTo("string")
        assertThat(paymentOrder.liveMode()).isEqualTo(true)
        assertThat(paymentOrder.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(paymentOrder.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(paymentOrder.type()).isEqualTo(PaymentOrderType.ACH)
        assertThat(paymentOrder.subtype()).contains(PaymentOrderSubtype.BACS_NEW_INSTRUCTION)
        assertThat(paymentOrder.amount()).isEqualTo(123L)
        assertThat(paymentOrder.direction()).isEqualTo(PaymentOrder.Direction.CREDIT)
        assertThat(paymentOrder.priority()).isEqualTo(PaymentOrder.Priority.HIGH)
        assertThat(paymentOrder.originatingAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentOrder.receivingAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentOrder.accounting())
            .isEqualTo(
                PaymentOrder.Accounting.builder()
                    .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .classId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(paymentOrder.accountingCategoryId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentOrder.accountingLedgerClassId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentOrder.currency()).contains(Currency.AED)
        assertThat(paymentOrder.effectiveDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(paymentOrder.description()).contains("string")
        assertThat(paymentOrder.statementDescriptor()).contains("string")
        assertThat(paymentOrder.remittanceInformation()).contains("string")
        assertThat(paymentOrder.purpose()).contains("string")
        assertThat(paymentOrder.metadata()).isEqualTo(PaymentOrder.Metadata.builder().build())
        assertThat(paymentOrder.chargeBearer()).contains(PaymentOrder.ChargeBearer.SHARED)
        assertThat(paymentOrder.foreignExchangeIndicator())
            .contains(PaymentOrder.ForeignExchangeIndicator.FIXED_TO_VARIABLE)
        assertThat(paymentOrder.foreignExchangeContract()).contains("string")
        assertThat(paymentOrder.nsfProtected()).isEqualTo(true)
        assertThat(paymentOrder.originatingPartyName()).contains("string")
        assertThat(paymentOrder.ultimateOriginatingPartyName()).contains("string")
        assertThat(paymentOrder.ultimateOriginatingPartyIdentifier()).contains("string")
        assertThat(paymentOrder.ultimateReceivingPartyName()).contains("string")
        assertThat(paymentOrder.ultimateReceivingPartyIdentifier()).contains("string")
        assertThat(paymentOrder.sendRemittanceAdvice()).contains(true)
        assertThat(paymentOrder.expiresAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(paymentOrder.status()).isEqualTo(PaymentOrder.Status.APPROVED)
        assertThat(paymentOrder.receivingAccountType())
            .isEqualTo(PaymentOrder.ReceivingAccountType.INTERNAL_ACCOUNT)
        assertThat(paymentOrder.counterpartyId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentOrder.transactionIds())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentOrder.ledgerTransactionId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentOrder.currentReturn())
            .contains(
                ReturnObject.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .additionalInformation("string")
                    .amount(123L)
                    .code(ReturnObject.Code._901)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currency(Currency.AED)
                    .currentReturn(
                        ReturnObject.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .additionalInformation("string")
                            .amount(123L)
                            .code(ReturnObject.Code._901)
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currency(Currency.AED)
                            .dateOfDeath(LocalDate.parse("2019-12-27"))
                            .failureReason("string")
                            .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .liveMode(true)
                            .object_("string")
                            .reason("string")
                            .referenceNumbers(
                                listOf(
                                    ReturnObject.PaymentReference.builder()
                                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .liveMode(true)
                                        .object_("string")
                                        .referenceNumber("string")
                                        .referenceNumberType(
                                            ReturnObject.PaymentReference.ReferenceNumberType
                                                .ACH_ORIGINAL_TRACE_NUMBER
                                        )
                                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .build()
                                )
                            )
                            .returnableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .returnableType(ReturnObject.ReturnableType.INCOMING_PAYMENT_DETAIL)
                            .role(ReturnObject.Role.ORIGINATING)
                            .status(ReturnObject.Status.COMPLETED)
                            .transactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .transactionLineItemId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .type(ReturnObject.Type.ACH)
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .dateOfDeath(LocalDate.parse("2019-12-27"))
                    .failureReason("string")
                    .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .liveMode(true)
                    .object_("string")
                    .reason("string")
                    .referenceNumbers(
                        listOf(
                            ReturnObject.PaymentReference.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .liveMode(true)
                                .object_("string")
                                .referenceNumber("string")
                                .referenceNumberType(
                                    ReturnObject.PaymentReference.ReferenceNumberType
                                        .ACH_ORIGINAL_TRACE_NUMBER
                                )
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                    )
                    .returnableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .returnableType(ReturnObject.ReturnableType.INCOMING_PAYMENT_DETAIL)
                    .role(ReturnObject.Role.ORIGINATING)
                    .status(ReturnObject.Status.COMPLETED)
                    .transactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .transactionLineItemId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .type(ReturnObject.Type.ACH)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(paymentOrder.transactionMonitoringEnabled()).isEqualTo(true)
        assertThat(paymentOrder.complianceRuleMetadata())
            .contains(PaymentOrder.ComplianceRuleMetadata.builder().build())
        assertThat(paymentOrder.referenceNumbers())
            .containsExactly(
                PaymentOrder.PaymentReference.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .liveMode(true)
                    .object_("string")
                    .referenceNumber("string")
                    .referenceNumberType(
                        PaymentOrder.PaymentReference.ReferenceNumberType.ACH_ORIGINAL_TRACE_NUMBER
                    )
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(paymentOrder.vendorFailureReason()).contains("string")
        assertThat(paymentOrder.decisionId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
