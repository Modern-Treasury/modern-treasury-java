// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.jsonMapper
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionCreateTest {

    @Test
    fun create() {
        val transactionCreate =
            TransactionCreate.builder()
                .amount(0L)
                .asOfDate(LocalDate.parse("2019-12-27"))
                .direction("direction")
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .vendorCode("vendor_code")
                .vendorCodeType("vendor_code_type")
                .metadata(
                    TransactionCreate.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .posted(true)
                .type(TransactionCreate.Type.ACH)
                .vendorCustomerId("vendor_customer_id")
                .vendorDescription("vendor_description")
                .build()

        assertThat(transactionCreate.amount()).isEqualTo(0L)
        assertThat(transactionCreate.asOfDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(transactionCreate.direction()).isEqualTo("direction")
        assertThat(transactionCreate.internalAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(transactionCreate.vendorCode()).contains("vendor_code")
        assertThat(transactionCreate.vendorCodeType()).contains("vendor_code_type")
        assertThat(transactionCreate.metadata())
            .contains(
                TransactionCreate.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(transactionCreate.posted()).contains(true)
        assertThat(transactionCreate.type()).contains(TransactionCreate.Type.ACH)
        assertThat(transactionCreate.vendorCustomerId()).contains("vendor_customer_id")
        assertThat(transactionCreate.vendorDescription()).contains("vendor_description")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transactionCreate =
            TransactionCreate.builder()
                .amount(0L)
                .asOfDate(LocalDate.parse("2019-12-27"))
                .direction("direction")
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .vendorCode("vendor_code")
                .vendorCodeType("vendor_code_type")
                .metadata(
                    TransactionCreate.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .posted(true)
                .type(TransactionCreate.Type.ACH)
                .vendorCustomerId("vendor_customer_id")
                .vendorDescription("vendor_description")
                .build()

        val roundtrippedTransactionCreate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transactionCreate),
                jacksonTypeRef<TransactionCreate>(),
            )

        assertThat(roundtrippedTransactionCreate).isEqualTo(transactionCreate)
    }
}
