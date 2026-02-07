// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerAccountCreateRequestTest {

    @Test
    fun create() {
        val ledgerAccountCreateRequest =
            LedgerAccountCreateRequest.builder()
                .currency("currency")
                .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .normalBalance(TransactionDirection.CREDIT)
                .currencyExponent(0L)
                .description("description")
                .externalId("external_id")
                .addLedgerAccountCategoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ledgerableType(LedgerAccountCreateRequest.LedgerableType.COUNTERPARTY)
                .metadata(
                    LedgerAccountCreateRequest.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .build()

        assertThat(ledgerAccountCreateRequest.currency()).isEqualTo("currency")
        assertThat(ledgerAccountCreateRequest.ledgerId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerAccountCreateRequest.name()).isEqualTo("name")
        assertThat(ledgerAccountCreateRequest.normalBalance())
            .isEqualTo(TransactionDirection.CREDIT)
        assertThat(ledgerAccountCreateRequest.currencyExponent()).contains(0L)
        assertThat(ledgerAccountCreateRequest.description()).contains("description")
        assertThat(ledgerAccountCreateRequest.externalId()).contains("external_id")
        assertThat(ledgerAccountCreateRequest.ledgerAccountCategoryIds().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerAccountCreateRequest.ledgerableId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerAccountCreateRequest.ledgerableType())
            .contains(LedgerAccountCreateRequest.LedgerableType.COUNTERPARTY)
        assertThat(ledgerAccountCreateRequest.metadata())
            .contains(
                LedgerAccountCreateRequest.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ledgerAccountCreateRequest =
            LedgerAccountCreateRequest.builder()
                .currency("currency")
                .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .normalBalance(TransactionDirection.CREDIT)
                .currencyExponent(0L)
                .description("description")
                .externalId("external_id")
                .addLedgerAccountCategoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ledgerableType(LedgerAccountCreateRequest.LedgerableType.COUNTERPARTY)
                .metadata(
                    LedgerAccountCreateRequest.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .build()

        val roundtrippedLedgerAccountCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ledgerAccountCreateRequest),
                jacksonTypeRef<LedgerAccountCreateRequest>(),
            )

        assertThat(roundtrippedLedgerAccountCreateRequest).isEqualTo(ledgerAccountCreateRequest)
    }
}
