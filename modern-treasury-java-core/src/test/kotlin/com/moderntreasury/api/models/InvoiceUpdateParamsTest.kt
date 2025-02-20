// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import java.time.LocalDate
import java.time.OffsetDateTime
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InvoiceUpdateParamsTest {

    @Test
    fun create() {
        InvoiceUpdateParams.builder()
            .id("id")
            .addContactDetail(
                InvoiceUpdateParams.ContactDetail.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .contactIdentifier("contact_identifier")
                    .contactIdentifierType(
                        InvoiceUpdateParams.ContactDetail.ContactIdentifierType.EMAIL
                    )
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .liveMode(true)
                    .object_("object")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .counterpartyBillingAddress(
                InvoiceUpdateParams.CounterpartyBillingAddress.builder()
                    .country("country")
                    .line1("line1")
                    .locality("locality")
                    .postalCode("postal_code")
                    .region("region")
                    .line2("line2")
                    .build()
            )
            .counterpartyId("counterparty_id")
            .counterpartyShippingAddress(
                InvoiceUpdateParams.CounterpartyShippingAddress.builder()
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
            .dueDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .fallbackPaymentMethod("fallback_payment_method")
            .ingestLedgerEntries(true)
            .addInvoiceLineItem(
                InvoiceUpdateParams.InvoiceLineItemCreateRequest.builder()
                    .name("name")
                    .unitAmount(0L)
                    .description("description")
                    .direction("direction")
                    .metadata(
                        InvoiceUpdateParams.InvoiceLineItemCreateRequest.Metadata.builder()
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
                InvoiceUpdateParams.InvoicerAddress.builder()
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
                InvoiceUpdateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
            .addNotificationEmailAddress("string")
            .notificationsEnabled(true)
            .originatingAccountId("originating_account_id")
            .paymentEffectiveDate(LocalDate.parse("2019-12-27"))
            .paymentMethod(InvoiceUpdateParams.PaymentMethod.UI)
            .paymentType(PaymentOrderType.ACH)
            .receivingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .recipientEmail("recipient_email")
            .recipientName("recipient_name")
            .addRemindAfterOverdueDay(0L)
            .status("status")
            .virtualAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun body() {
        val params =
            InvoiceUpdateParams.builder()
                .id("id")
                .addContactDetail(
                    InvoiceUpdateParams.ContactDetail.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .contactIdentifier("contact_identifier")
                        .contactIdentifierType(
                            InvoiceUpdateParams.ContactDetail.ContactIdentifierType.EMAIL
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .liveMode(true)
                        .object_("object")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .counterpartyBillingAddress(
                    InvoiceUpdateParams.CounterpartyBillingAddress.builder()
                        .country("country")
                        .line1("line1")
                        .locality("locality")
                        .postalCode("postal_code")
                        .region("region")
                        .line2("line2")
                        .build()
                )
                .counterpartyId("counterparty_id")
                .counterpartyShippingAddress(
                    InvoiceUpdateParams.CounterpartyShippingAddress.builder()
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
                .dueDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .fallbackPaymentMethod("fallback_payment_method")
                .ingestLedgerEntries(true)
                .addInvoiceLineItem(
                    InvoiceUpdateParams.InvoiceLineItemCreateRequest.builder()
                        .name("name")
                        .unitAmount(0L)
                        .description("description")
                        .direction("direction")
                        .metadata(
                            InvoiceUpdateParams.InvoiceLineItemCreateRequest.Metadata.builder()
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
                    InvoiceUpdateParams.InvoicerAddress.builder()
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
                    InvoiceUpdateParams.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .addNotificationEmailAddress("string")
                .notificationsEnabled(true)
                .originatingAccountId("originating_account_id")
                .paymentEffectiveDate(LocalDate.parse("2019-12-27"))
                .paymentMethod(InvoiceUpdateParams.PaymentMethod.UI)
                .paymentType(PaymentOrderType.ACH)
                .receivingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .recipientEmail("recipient_email")
                .recipientName("recipient_name")
                .addRemindAfterOverdueDay(0L)
                .status("status")
                .virtualAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.contactDetails())
            .contains(
                listOf(
                    InvoiceUpdateParams.ContactDetail.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .contactIdentifier("contact_identifier")
                        .contactIdentifierType(
                            InvoiceUpdateParams.ContactDetail.ContactIdentifierType.EMAIL
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
                InvoiceUpdateParams.CounterpartyBillingAddress.builder()
                    .country("country")
                    .line1("line1")
                    .locality("locality")
                    .postalCode("postal_code")
                    .region("region")
                    .line2("line2")
                    .build()
            )
        assertThat(body.counterpartyId()).contains("counterparty_id")
        assertThat(body.counterpartyShippingAddress())
            .contains(
                InvoiceUpdateParams.CounterpartyShippingAddress.builder()
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
        assertThat(body.dueDate()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.fallbackPaymentMethod()).contains("fallback_payment_method")
        assertThat(body.ingestLedgerEntries()).contains(true)
        assertThat(body.invoiceLineItems())
            .contains(
                listOf(
                    InvoiceUpdateParams.InvoiceLineItemCreateRequest.builder()
                        .name("name")
                        .unitAmount(0L)
                        .description("description")
                        .direction("direction")
                        .metadata(
                            InvoiceUpdateParams.InvoiceLineItemCreateRequest.Metadata.builder()
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
                InvoiceUpdateParams.InvoicerAddress.builder()
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
                InvoiceUpdateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(body.notificationEmailAddresses()).contains(listOf("string"))
        assertThat(body.notificationsEnabled()).contains(true)
        assertThat(body.originatingAccountId()).contains("originating_account_id")
        assertThat(body.paymentEffectiveDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(body.paymentMethod()).contains(InvoiceUpdateParams.PaymentMethod.UI)
        assertThat(body.paymentType()).contains(PaymentOrderType.ACH)
        assertThat(body.receivingAccountId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.recipientEmail()).contains("recipient_email")
        assertThat(body.recipientName()).contains("recipient_name")
        assertThat(body.remindAfterOverdueDays()).contains(listOf(0L))
        assertThat(body.status()).contains("status")
        assertThat(body.virtualAccountId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = InvoiceUpdateParams.builder().id("id").build()

        val body = params._body()

        assertNotNull(body)
    }

    @Test
    fun getPathParam() {
        val params = InvoiceUpdateParams.builder().id("id").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
