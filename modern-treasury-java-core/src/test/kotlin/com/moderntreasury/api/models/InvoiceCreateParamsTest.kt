// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InvoiceCreateParamsTest {

    @Test
    fun createInvoiceCreateParams() {
        InvoiceCreateParams.builder()
            .counterpartyId("string")
            .dueDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .originatingAccountId("string")
            .contactDetails(
                listOf(
                    InvoiceCreateParams.ContactDetail.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .contactIdentifier("string")
                        .contactIdentifierType(
                            InvoiceCreateParams.ContactDetail.ContactIdentifierType.EMAIL
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
                InvoiceCreateParams.CounterpartyBillingAddress.builder()
                    .country("string")
                    .line1("string")
                    .locality("string")
                    .postalCode("string")
                    .region("string")
                    .line2("string")
                    .build()
            )
            .counterpartyShippingAddress(
                InvoiceCreateParams.CounterpartyShippingAddress.builder()
                    .country("string")
                    .line1("string")
                    .locality("string")
                    .postalCode("string")
                    .region("string")
                    .line2("string")
                    .build()
            )
            .currency(Currency.AED)
            .description("string")
            .fallbackPaymentMethod("string")
            .ingestLedgerEntries(true)
            .invoiceLineItems(
                listOf(
                    InvoiceCreateParams.InvoiceLineItemCreateRequest.builder()
                        .name("string")
                        .unitAmount(123L)
                        .description("string")
                        .direction("string")
                        .metadata(
                            InvoiceCreateParams.InvoiceLineItemCreateRequest.Metadata.builder()
                                .build()
                        )
                        .quantity(123L)
                        .unitAmountDecimal("string")
                        .build()
                )
            )
            .invoicerAddress(
                InvoiceCreateParams.InvoicerAddress.builder()
                    .country("string")
                    .line1("string")
                    .locality("string")
                    .postalCode("string")
                    .region("string")
                    .line2("string")
                    .build()
            )
            .ledgerAccountSettlementId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .notificationEmailAddresses(listOf("string"))
            .notificationsEnabled(true)
            .paymentEffectiveDate(LocalDate.parse("2019-12-27"))
            .paymentMethod(InvoiceCreateParams.PaymentMethod.UI)
            .paymentType(InvoiceCreateParams.PaymentType.ACH)
            .receivingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .recipientEmail("string")
            .recipientName("string")
            .remindAfterOverdueDays(listOf(123L))
            .virtualAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            InvoiceCreateParams.builder()
                .counterpartyId("string")
                .dueDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .originatingAccountId("string")
                .contactDetails(
                    listOf(
                        InvoiceCreateParams.ContactDetail.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .contactIdentifier("string")
                            .contactIdentifierType(
                                InvoiceCreateParams.ContactDetail.ContactIdentifierType.EMAIL
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
                    InvoiceCreateParams.CounterpartyBillingAddress.builder()
                        .country("string")
                        .line1("string")
                        .locality("string")
                        .postalCode("string")
                        .region("string")
                        .line2("string")
                        .build()
                )
                .counterpartyShippingAddress(
                    InvoiceCreateParams.CounterpartyShippingAddress.builder()
                        .country("string")
                        .line1("string")
                        .locality("string")
                        .postalCode("string")
                        .region("string")
                        .line2("string")
                        .build()
                )
                .currency(Currency.AED)
                .description("string")
                .fallbackPaymentMethod("string")
                .ingestLedgerEntries(true)
                .invoiceLineItems(
                    listOf(
                        InvoiceCreateParams.InvoiceLineItemCreateRequest.builder()
                            .name("string")
                            .unitAmount(123L)
                            .description("string")
                            .direction("string")
                            .metadata(
                                InvoiceCreateParams.InvoiceLineItemCreateRequest.Metadata.builder()
                                    .build()
                            )
                            .quantity(123L)
                            .unitAmountDecimal("string")
                            .build()
                    )
                )
                .invoicerAddress(
                    InvoiceCreateParams.InvoicerAddress.builder()
                        .country("string")
                        .line1("string")
                        .locality("string")
                        .postalCode("string")
                        .region("string")
                        .line2("string")
                        .build()
                )
                .ledgerAccountSettlementId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .notificationEmailAddresses(listOf("string"))
                .notificationsEnabled(true)
                .paymentEffectiveDate(LocalDate.parse("2019-12-27"))
                .paymentMethod(InvoiceCreateParams.PaymentMethod.UI)
                .paymentType(InvoiceCreateParams.PaymentType.ACH)
                .receivingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .recipientEmail("string")
                .recipientName("string")
                .remindAfterOverdueDays(listOf(123L))
                .virtualAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.counterpartyId()).isEqualTo("string")
        assertThat(body.dueDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.originatingAccountId()).isEqualTo("string")
        assertThat(body.contactDetails())
            .isEqualTo(
                listOf(
                    InvoiceCreateParams.ContactDetail.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .contactIdentifier("string")
                        .contactIdentifierType(
                            InvoiceCreateParams.ContactDetail.ContactIdentifierType.EMAIL
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .liveMode(true)
                        .object_("string")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
            )
        assertThat(body.counterpartyBillingAddress())
            .isEqualTo(
                InvoiceCreateParams.CounterpartyBillingAddress.builder()
                    .country("string")
                    .line1("string")
                    .locality("string")
                    .postalCode("string")
                    .region("string")
                    .line2("string")
                    .build()
            )
        assertThat(body.counterpartyShippingAddress())
            .isEqualTo(
                InvoiceCreateParams.CounterpartyShippingAddress.builder()
                    .country("string")
                    .line1("string")
                    .locality("string")
                    .postalCode("string")
                    .region("string")
                    .line2("string")
                    .build()
            )
        assertThat(body.currency()).isEqualTo(Currency.AED)
        assertThat(body.description()).isEqualTo("string")
        assertThat(body.fallbackPaymentMethod()).isEqualTo("string")
        assertThat(body.ingestLedgerEntries()).isEqualTo(true)
        assertThat(body.invoiceLineItems())
            .isEqualTo(
                listOf(
                    InvoiceCreateParams.InvoiceLineItemCreateRequest.builder()
                        .name("string")
                        .unitAmount(123L)
                        .description("string")
                        .direction("string")
                        .metadata(
                            InvoiceCreateParams.InvoiceLineItemCreateRequest.Metadata.builder()
                                .build()
                        )
                        .quantity(123L)
                        .unitAmountDecimal("string")
                        .build()
                )
            )
        assertThat(body.invoicerAddress())
            .isEqualTo(
                InvoiceCreateParams.InvoicerAddress.builder()
                    .country("string")
                    .line1("string")
                    .locality("string")
                    .postalCode("string")
                    .region("string")
                    .line2("string")
                    .build()
            )
        assertThat(body.ledgerAccountSettlementId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.notificationEmailAddresses()).isEqualTo(listOf("string"))
        assertThat(body.notificationsEnabled()).isEqualTo(true)
        assertThat(body.paymentEffectiveDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.paymentMethod()).isEqualTo(InvoiceCreateParams.PaymentMethod.UI)
        assertThat(body.paymentType()).isEqualTo(InvoiceCreateParams.PaymentType.ACH)
        assertThat(body.receivingAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.recipientEmail()).isEqualTo("string")
        assertThat(body.recipientName()).isEqualTo("string")
        assertThat(body.remindAfterOverdueDays()).isEqualTo(listOf(123L))
        assertThat(body.virtualAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            InvoiceCreateParams.builder()
                .counterpartyId("string")
                .dueDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .originatingAccountId("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.counterpartyId()).isEqualTo("string")
        assertThat(body.dueDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.originatingAccountId()).isEqualTo("string")
    }
}
