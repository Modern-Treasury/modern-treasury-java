// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InvoiceCreateParamsTest {

    @Test
    fun create() {
        InvoiceCreateParams.builder()
            .counterpartyId("counterparty_id")
            .dueDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .originatingAccountId("originating_account_id")
            .autoAdvance(true)
            .addContactDetail(
                InvoiceCreateParams.ContactDetail.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .contactIdentifier("contact_identifier")
                    .contactIdentifierType(
                        InvoiceCreateParams.ContactDetail.ContactIdentifierType.EMAIL
                    )
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .liveMode(true)
                    .object_("object")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .counterpartyBillingAddress(
                InvoiceCreateParams.CounterpartyBillingAddress.builder()
                    .country("country")
                    .line1("line1")
                    .locality("locality")
                    .postalCode("postal_code")
                    .region("region")
                    .line2("line2")
                    .build()
            )
            .counterpartyShippingAddress(
                InvoiceCreateParams.CounterpartyShippingAddress.builder()
                    .country("country")
                    .line1("line1")
                    .locality("locality")
                    .postalCode("postal_code")
                    .region("region")
                    .line2("line2")
                    .build()
            )
            .currency(Currency.AED)
            .description("description")
            .fallbackPaymentMethod("fallback_payment_method")
            .ingestLedgerEntries(true)
            .addInvoiceLineItem(
                InvoiceCreateParams.InvoiceLineItemCreateRequest.builder()
                    .name("name")
                    .unitAmount(0L)
                    .description("description")
                    .direction("direction")
                    .metadata(
                        InvoiceCreateParams.InvoiceLineItemCreateRequest.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .quantity(0L)
                    .unitAmountDecimal("unit_amount_decimal")
                    .build()
            )
            .invoicerAddress(
                InvoiceCreateParams.InvoicerAddress.builder()
                    .country("country")
                    .line1("line1")
                    .locality("locality")
                    .postalCode("postal_code")
                    .region("region")
                    .line2("line2")
                    .build()
            )
            .ledgerAccountSettlementId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .metadata(
                InvoiceCreateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
            .addNotificationEmailAddress("string")
            .notificationsEnabled(true)
            .paymentEffectiveDate(LocalDate.parse("2019-12-27"))
            .paymentMethod(InvoiceCreateParams.PaymentMethod.UI)
            .paymentType(PaymentOrderType.ACH)
            .receivingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .recipientEmail("recipient_email")
            .recipientName("recipient_name")
            .addRemindAfterOverdueDay(0L)
            .virtualAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun body() {
        val params =
            InvoiceCreateParams.builder()
                .counterpartyId("counterparty_id")
                .dueDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .originatingAccountId("originating_account_id")
                .autoAdvance(true)
                .addContactDetail(
                    InvoiceCreateParams.ContactDetail.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .contactIdentifier("contact_identifier")
                        .contactIdentifierType(
                            InvoiceCreateParams.ContactDetail.ContactIdentifierType.EMAIL
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .liveMode(true)
                        .object_("object")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .counterpartyBillingAddress(
                    InvoiceCreateParams.CounterpartyBillingAddress.builder()
                        .country("country")
                        .line1("line1")
                        .locality("locality")
                        .postalCode("postal_code")
                        .region("region")
                        .line2("line2")
                        .build()
                )
                .counterpartyShippingAddress(
                    InvoiceCreateParams.CounterpartyShippingAddress.builder()
                        .country("country")
                        .line1("line1")
                        .locality("locality")
                        .postalCode("postal_code")
                        .region("region")
                        .line2("line2")
                        .build()
                )
                .currency(Currency.AED)
                .description("description")
                .fallbackPaymentMethod("fallback_payment_method")
                .ingestLedgerEntries(true)
                .addInvoiceLineItem(
                    InvoiceCreateParams.InvoiceLineItemCreateRequest.builder()
                        .name("name")
                        .unitAmount(0L)
                        .description("description")
                        .direction("direction")
                        .metadata(
                            InvoiceCreateParams.InvoiceLineItemCreateRequest.Metadata.builder()
                                .putAdditionalProperty("key", JsonValue.from("value"))
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                .build()
                        )
                        .quantity(0L)
                        .unitAmountDecimal("unit_amount_decimal")
                        .build()
                )
                .invoicerAddress(
                    InvoiceCreateParams.InvoicerAddress.builder()
                        .country("country")
                        .line1("line1")
                        .locality("locality")
                        .postalCode("postal_code")
                        .region("region")
                        .line2("line2")
                        .build()
                )
                .ledgerAccountSettlementId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .metadata(
                    InvoiceCreateParams.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .addNotificationEmailAddress("string")
                .notificationsEnabled(true)
                .paymentEffectiveDate(LocalDate.parse("2019-12-27"))
                .paymentMethod(InvoiceCreateParams.PaymentMethod.UI)
                .paymentType(PaymentOrderType.ACH)
                .receivingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .recipientEmail("recipient_email")
                .recipientName("recipient_name")
                .addRemindAfterOverdueDay(0L)
                .virtualAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.counterpartyId()).isEqualTo("counterparty_id")
        assertThat(body.dueDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.originatingAccountId()).isEqualTo("originating_account_id")
        assertThat(body.autoAdvance()).contains(true)
        assertThat(body.contactDetails())
            .contains(
                listOf(
                    InvoiceCreateParams.ContactDetail.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .contactIdentifier("contact_identifier")
                        .contactIdentifierType(
                            InvoiceCreateParams.ContactDetail.ContactIdentifierType.EMAIL
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .liveMode(true)
                        .object_("object")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
            )
        assertThat(body.counterpartyBillingAddress())
            .contains(
                InvoiceCreateParams.CounterpartyBillingAddress.builder()
                    .country("country")
                    .line1("line1")
                    .locality("locality")
                    .postalCode("postal_code")
                    .region("region")
                    .line2("line2")
                    .build()
            )
        assertThat(body.counterpartyShippingAddress())
            .contains(
                InvoiceCreateParams.CounterpartyShippingAddress.builder()
                    .country("country")
                    .line1("line1")
                    .locality("locality")
                    .postalCode("postal_code")
                    .region("region")
                    .line2("line2")
                    .build()
            )
        assertThat(body.currency()).contains(Currency.AED)
        assertThat(body.description()).contains("description")
        assertThat(body.fallbackPaymentMethod()).contains("fallback_payment_method")
        assertThat(body.ingestLedgerEntries()).contains(true)
        assertThat(body.invoiceLineItems())
            .contains(
                listOf(
                    InvoiceCreateParams.InvoiceLineItemCreateRequest.builder()
                        .name("name")
                        .unitAmount(0L)
                        .description("description")
                        .direction("direction")
                        .metadata(
                            InvoiceCreateParams.InvoiceLineItemCreateRequest.Metadata.builder()
                                .putAdditionalProperty("key", JsonValue.from("value"))
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                .build()
                        )
                        .quantity(0L)
                        .unitAmountDecimal("unit_amount_decimal")
                        .build()
                )
            )
        assertThat(body.invoicerAddress())
            .contains(
                InvoiceCreateParams.InvoicerAddress.builder()
                    .country("country")
                    .line1("line1")
                    .locality("locality")
                    .postalCode("postal_code")
                    .region("region")
                    .line2("line2")
                    .build()
            )
        assertThat(body.ledgerAccountSettlementId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.metadata())
            .contains(
                InvoiceCreateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(body.notificationEmailAddresses()).contains(listOf("string"))
        assertThat(body.notificationsEnabled()).contains(true)
        assertThat(body.paymentEffectiveDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(body.paymentMethod()).contains(InvoiceCreateParams.PaymentMethod.UI)
        assertThat(body.paymentType()).contains(PaymentOrderType.ACH)
        assertThat(body.receivingAccountId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.recipientEmail()).contains("recipient_email")
        assertThat(body.recipientName()).contains("recipient_name")
        assertThat(body.remindAfterOverdueDays()).contains(listOf(0L))
        assertThat(body.virtualAccountId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InvoiceCreateParams.builder()
                .counterpartyId("counterparty_id")
                .dueDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .originatingAccountId("originating_account_id")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.counterpartyId()).isEqualTo("counterparty_id")
        assertThat(body.dueDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.originatingAccountId()).isEqualTo("originating_account_id")
    }
}
