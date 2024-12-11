// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TransactionTest {

    @Test
    fun createTransaction() {
        val transaction =
            Transaction.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(0L)
                .asOfDate(LocalDate.parse("2019-12-27"))
                .asOfTime("as_of_time")
                .asOfTimezone("as_of_timezone")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Currency.AED)
                .customIdentifiers(
                    Transaction.CustomIdentifiers.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .direction("direction")
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .foreignExchangeRate(
                    Transaction.ForeignExchangeRate.builder()
                        .baseAmount(0L)
                        .baseCurrency(Currency.AED)
                        .exponent(0L)
                        .rateString("rate_string")
                        .targetAmount(0L)
                        .targetCurrency(Currency.AED)
                        .value(0L)
                        .build()
                )
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .liveMode(true)
                .metadata(
                    Transaction.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .object_("object")
                .posted(true)
                .reconciled(true)
                .type(Transaction.Type.ACH)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .vendorCode("vendor_code")
                .vendorCodeType(Transaction.VendorCodeType.BAI2)
                .vendorCustomerId("vendor_customer_id")
                .vendorId("vendor_id")
                .details(
                    Transaction.Details.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .vendorDescription("vendor_description")
                .build()
        assertThat(transaction).isNotNull
        assertThat(transaction.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(transaction.amount()).isEqualTo(0L)
        assertThat(transaction.asOfDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(transaction.asOfTime()).contains("as_of_time")
        assertThat(transaction.asOfTimezone()).contains("as_of_timezone")
        assertThat(transaction.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transaction.currency()).isEqualTo(Currency.AED)
        assertThat(transaction.customIdentifiers())
            .isEqualTo(
                Transaction.CustomIdentifiers.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(transaction.direction()).isEqualTo("direction")
        assertThat(transaction.discardedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transaction.foreignExchangeRate())
            .contains(
                Transaction.ForeignExchangeRate.builder()
                    .baseAmount(0L)
                    .baseCurrency(Currency.AED)
                    .exponent(0L)
                    .rateString("rate_string")
                    .targetAmount(0L)
                    .targetCurrency(Currency.AED)
                    .value(0L)
                    .build()
            )
        assertThat(transaction.internalAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(transaction.liveMode()).isEqualTo(true)
        assertThat(transaction.metadata())
            .isEqualTo(
                Transaction.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(transaction.object_()).isEqualTo("object")
        assertThat(transaction.posted()).isEqualTo(true)
        assertThat(transaction.reconciled()).isEqualTo(true)
        assertThat(transaction.type()).isEqualTo(Transaction.Type.ACH)
        assertThat(transaction.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transaction.vendorCode()).contains("vendor_code")
        assertThat(transaction.vendorCodeType()).contains(Transaction.VendorCodeType.BAI2)
        assertThat(transaction.vendorCustomerId()).contains("vendor_customer_id")
        assertThat(transaction.vendorId()).contains("vendor_id")
        assertThat(transaction.details())
            .contains(
                Transaction.Details.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(transaction.vendorDescription()).contains("vendor_description")
    }
}
