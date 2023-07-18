package com.moderntreasury.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaperItemTest {

    @Test
    fun createPaperItem() {
        val paperItem =
            PaperItem.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountNumber("string")
                .accountNumberSafe("string")
                .amount(123L)
                .checkNumber("string")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Currency.AED)
                .depositDate(LocalDate.parse("2019-12-27"))
                .liveMode(true)
                .lockboxNumber("string")
                .memoField("string")
                .object_("string")
                .remitterName("string")
                .routingNumber("string")
                .status(PaperItem.Status.COMPLETED)
                .transactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .transactionLineItemId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(paperItem).isNotNull
        assertThat(paperItem.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paperItem.accountNumber()).contains("string")
        assertThat(paperItem.accountNumberSafe()).contains("string")
        assertThat(paperItem.amount()).isEqualTo(123L)
        assertThat(paperItem.checkNumber()).contains("string")
        assertThat(paperItem.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(paperItem.currency()).contains(Currency.AED)
        assertThat(paperItem.depositDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(paperItem.liveMode()).isEqualTo(true)
        assertThat(paperItem.lockboxNumber()).isEqualTo("string")
        assertThat(paperItem.memoField()).contains("string")
        assertThat(paperItem.object_()).isEqualTo("string")
        assertThat(paperItem.remitterName()).contains("string")
        assertThat(paperItem.routingNumber()).contains("string")
        assertThat(paperItem.status()).isEqualTo(PaperItem.Status.COMPLETED)
        assertThat(paperItem.transactionId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paperItem.transactionLineItemId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paperItem.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
