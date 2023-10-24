// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

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
                .amount(123L)
                .asOfDate(LocalDate.parse("2019-12-27"))
                .asOfTime("string")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Currency.AED)
                .direction("string")
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .liveMode(true)
                .metadata(Transaction.Metadata.builder().build())
                .object_("string")
                .posted(true)
                .reconciled(true)
                .type(Transaction.Type.ACH)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .vendorCode("string")
                .vendorCodeType(Transaction.VendorCodeType.BAI2)
                .vendorCustomerId("string")
                .vendorId("string")
                .details(Transaction.Details.builder().build())
                .vendorDescription("string")
                .build()
        assertThat(transaction).isNotNull
        assertThat(transaction.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(transaction.amount()).isEqualTo(123L)
        assertThat(transaction.asOfDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(transaction.asOfTime()).contains("string")
        assertThat(transaction.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transaction.currency()).contains(Currency.AED)
        assertThat(transaction.direction()).isEqualTo("string")
        assertThat(transaction.discardedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transaction.internalAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(transaction.liveMode()).isEqualTo(true)
        assertThat(transaction.metadata()).isEqualTo(Transaction.Metadata.builder().build())
        assertThat(transaction.object_()).isEqualTo("string")
        assertThat(transaction.posted()).isEqualTo(true)
        assertThat(transaction.reconciled()).isEqualTo(true)
        assertThat(transaction.type()).isEqualTo(Transaction.Type.ACH)
        assertThat(transaction.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transaction.vendorCode()).contains("string")
        assertThat(transaction.vendorCodeType()).contains(Transaction.VendorCodeType.BAI2)
        assertThat(transaction.vendorCustomerId()).contains("string")
        assertThat(transaction.vendorId()).contains("string")
        assertThat(transaction.details()).contains(Transaction.Details.builder().build())
        assertThat(transaction.vendorDescription()).contains("string")
    }
}
