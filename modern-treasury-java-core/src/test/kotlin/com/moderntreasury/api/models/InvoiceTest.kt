package com.moderntreasury.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InvoiceTest {

    @Test
    fun createInvoice() {
        val invoice =
            Invoice.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .contactDetails(
                    listOf(
                        Invoice.ContactDetail.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .contactIdentifier("string")
                            .contactIdentifierType(
                                Invoice.ContactDetail.ContactIdentifierType.EMAIL
                            )
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .liveMode(true)
                            .object_("string")
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                )
                .counterpartyBillingAddress(
                    Invoice.CounterpartyBillingAddress.builder()
                        .country("string")
                        .line1("string")
                        .locality("string")
                        .postalCode("string")
                        .region("string")
                        .line2("string")
                        .build()
                )
                .counterpartyId("string")
                .counterpartyShippingAddress(
                    Invoice.CounterpartyShippingAddress.builder()
                        .country("string")
                        .line1("string")
                        .locality("string")
                        .postalCode("string")
                        .region("string")
                        .line2("string")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Currency.AED)
                .description("string")
                .dueDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .hostedUrl("string")
                .invoicerAddress(
                    Invoice.InvoicerAddress.builder()
                        .country("string")
                        .line1("string")
                        .locality("string")
                        .postalCode("string")
                        .region("string")
                        .line2("string")
                        .build()
                )
                .liveMode(true)
                .number("string")
                .object_("string")
                .originatingAccountId("string")
                .paymentEffectiveDate(LocalDate.parse("2019-12-27"))
                .paymentMethod(Invoice.PaymentMethod.UI)
                .paymentOrders(
                    listOf(
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
                            .complianceRuleMetadata(
                                PaymentOrder.ComplianceRuleMetadata.builder().build()
                            )
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
                                            .createdAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .currency(Currency.AED)
                                            .dateOfDeath(LocalDate.parse("2019-12-27"))
                                            .failureReason("string")
                                            .internalAccountId(
                                                "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"
                                            )
                                            .ledgerTransactionId(
                                                "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"
                                            )
                                            .liveMode(true)
                                            .object_("string")
                                            .reason("string")
                                            .referenceNumbers(
                                                listOf(
                                                    ReturnObject.PaymentReference.builder()
                                                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                                        .createdAt(
                                                            OffsetDateTime.parse(
                                                                "2019-12-27T18:11:19.117Z"
                                                            )
                                                        )
                                                        .liveMode(true)
                                                        .object_("string")
                                                        .referenceNumber("string")
                                                        .referenceNumberType(
                                                            ReturnObject.PaymentReference
                                                                .ReferenceNumberType
                                                                .ACH_ORIGINAL_TRACE_NUMBER
                                                        )
                                                        .updatedAt(
                                                            OffsetDateTime.parse(
                                                                "2019-12-27T18:11:19.117Z"
                                                            )
                                                        )
                                                        .build()
                                                )
                                            )
                                            .returnableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                            .returnableType(
                                                ReturnObject.ReturnableType.INCOMING_PAYMENT_DETAIL
                                            )
                                            .role(ReturnObject.Role.ORIGINATING)
                                            .status(ReturnObject.Status.COMPLETED)
                                            .transactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                            .transactionLineItemId(
                                                "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"
                                            )
                                            .type(ReturnObject.Type.ACH)
                                            .updatedAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
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
                                                .createdAt(
                                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                                )
                                                .liveMode(true)
                                                .object_("string")
                                                .referenceNumber("string")
                                                .referenceNumberType(
                                                    ReturnObject.PaymentReference
                                                        .ReferenceNumberType
                                                        .ACH_ORIGINAL_TRACE_NUMBER
                                                )
                                                .updatedAt(
                                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                                )
                                                .build()
                                        )
                                    )
                                    .returnableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .returnableType(
                                        ReturnObject.ReturnableType.INCOMING_PAYMENT_DETAIL
                                    )
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
                            .foreignExchangeIndicator(
                                PaymentOrder.ForeignExchangeIndicator.FIXED_TO_VARIABLE
                            )
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
                            .receivingAccountType(
                                PaymentOrder.ReceivingAccountType.INTERNAL_ACCOUNT
                            )
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
                    )
                )
                .paymentType(Invoice.PaymentType.EFT)
                .pdfUrl("string")
                .receivingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status(Invoice.Status.DRAFT)
                .totalAmount(123L)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(invoice).isNotNull
        assertThat(invoice.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(invoice.contactDetails())
            .containsExactly(
                Invoice.ContactDetail.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .contactIdentifier("string")
                    .contactIdentifierType(Invoice.ContactDetail.ContactIdentifierType.EMAIL)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .liveMode(true)
                    .object_("string")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(invoice.counterpartyBillingAddress())
            .contains(
                Invoice.CounterpartyBillingAddress.builder()
                    .country("string")
                    .line1("string")
                    .locality("string")
                    .postalCode("string")
                    .region("string")
                    .line2("string")
                    .build()
            )
        assertThat(invoice.counterpartyId()).isEqualTo("string")
        assertThat(invoice.counterpartyShippingAddress())
            .contains(
                Invoice.CounterpartyShippingAddress.builder()
                    .country("string")
                    .line1("string")
                    .locality("string")
                    .postalCode("string")
                    .region("string")
                    .line2("string")
                    .build()
            )
        assertThat(invoice.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invoice.currency()).contains(Currency.AED)
        assertThat(invoice.description()).isEqualTo("string")
        assertThat(invoice.dueDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invoice.hostedUrl()).isEqualTo("string")
        assertThat(invoice.invoicerAddress())
            .contains(
                Invoice.InvoicerAddress.builder()
                    .country("string")
                    .line1("string")
                    .locality("string")
                    .postalCode("string")
                    .region("string")
                    .line2("string")
                    .build()
            )
        assertThat(invoice.liveMode()).isEqualTo(true)
        assertThat(invoice.number()).isEqualTo("string")
        assertThat(invoice.object_()).isEqualTo("string")
        assertThat(invoice.originatingAccountId()).isEqualTo("string")
        assertThat(invoice.paymentEffectiveDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(invoice.paymentMethod()).contains(Invoice.PaymentMethod.UI)
        assertThat(invoice.paymentOrders())
            .containsExactly(
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
                                                    ReturnObject.PaymentReference
                                                        .ReferenceNumberType
                                                        .ACH_ORIGINAL_TRACE_NUMBER
                                                )
                                                .updatedAt(
                                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                                )
                                                .build()
                                        )
                                    )
                                    .returnableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .returnableType(
                                        ReturnObject.ReturnableType.INCOMING_PAYMENT_DETAIL
                                    )
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
                    .foreignExchangeIndicator(
                        PaymentOrder.ForeignExchangeIndicator.FIXED_TO_VARIABLE
                    )
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
            )
        assertThat(invoice.paymentType()).contains(Invoice.PaymentType.EFT)
        assertThat(invoice.pdfUrl()).contains("string")
        assertThat(invoice.receivingAccountId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(invoice.status()).isEqualTo(Invoice.Status.DRAFT)
        assertThat(invoice.totalAmount()).isEqualTo(123L)
        assertThat(invoice.updatedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
