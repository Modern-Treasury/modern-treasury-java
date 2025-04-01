// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerAccountStatementRetrieveResponseTest {

    @Test
    fun create() {
        val ledgerAccountStatementRetrieveResponse =
            LedgerAccountStatementRetrieveResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .effectiveAtLowerBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .effectiveAtUpperBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .endingBalance(
                    LedgerAccountStatementRetrieveResponse.LedgerBalances.builder()
                        .availableBalance(
                            LedgerAccountStatementRetrieveResponse.LedgerBalances.LedgerBalance
                                .builder()
                                .amount(0L)
                                .credits(0L)
                                .currency("currency")
                                .currencyExponent(0L)
                                .debits(0L)
                                .build()
                        )
                        .pendingBalance(
                            LedgerAccountStatementRetrieveResponse.LedgerBalances.LedgerBalance
                                .builder()
                                .amount(0L)
                                .credits(0L)
                                .currency("currency")
                                .currencyExponent(0L)
                                .debits(0L)
                                .build()
                        )
                        .postedBalance(
                            LedgerAccountStatementRetrieveResponse.LedgerBalances.LedgerBalance
                                .builder()
                                .amount(0L)
                                .credits(0L)
                                .currency("currency")
                                .currencyExponent(0L)
                                .debits(0L)
                                .build()
                        )
                        .build()
                )
                .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ledgerAccountLockVersion(0L)
                .ledgerAccountNormalBalance(TransactionDirection.CREDIT)
                .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .liveMode(true)
                .metadata(
                    LedgerAccountStatementRetrieveResponse.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .object_("object")
                .startingBalance(
                    LedgerAccountStatementRetrieveResponse.LedgerBalances.builder()
                        .availableBalance(
                            LedgerAccountStatementRetrieveResponse.LedgerBalances.LedgerBalance
                                .builder()
                                .amount(0L)
                                .credits(0L)
                                .currency("currency")
                                .currencyExponent(0L)
                                .debits(0L)
                                .build()
                        )
                        .pendingBalance(
                            LedgerAccountStatementRetrieveResponse.LedgerBalances.LedgerBalance
                                .builder()
                                .amount(0L)
                                .credits(0L)
                                .currency("currency")
                                .currencyExponent(0L)
                                .debits(0L)
                                .build()
                        )
                        .postedBalance(
                            LedgerAccountStatementRetrieveResponse.LedgerBalances.LedgerBalance
                                .builder()
                                .amount(0L)
                                .credits(0L)
                                .currency("currency")
                                .currencyExponent(0L)
                                .debits(0L)
                                .build()
                        )
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(ledgerAccountStatementRetrieveResponse.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerAccountStatementRetrieveResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerAccountStatementRetrieveResponse.description()).contains("description")
        assertThat(ledgerAccountStatementRetrieveResponse.effectiveAtLowerBound())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerAccountStatementRetrieveResponse.effectiveAtUpperBound())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerAccountStatementRetrieveResponse.endingBalance())
            .isEqualTo(
                LedgerAccountStatementRetrieveResponse.LedgerBalances.builder()
                    .availableBalance(
                        LedgerAccountStatementRetrieveResponse.LedgerBalances.LedgerBalance
                            .builder()
                            .amount(0L)
                            .credits(0L)
                            .currency("currency")
                            .currencyExponent(0L)
                            .debits(0L)
                            .build()
                    )
                    .pendingBalance(
                        LedgerAccountStatementRetrieveResponse.LedgerBalances.LedgerBalance
                            .builder()
                            .amount(0L)
                            .credits(0L)
                            .currency("currency")
                            .currencyExponent(0L)
                            .debits(0L)
                            .build()
                    )
                    .postedBalance(
                        LedgerAccountStatementRetrieveResponse.LedgerBalances.LedgerBalance
                            .builder()
                            .amount(0L)
                            .credits(0L)
                            .currency("currency")
                            .currencyExponent(0L)
                            .debits(0L)
                            .build()
                    )
                    .build()
            )
        assertThat(ledgerAccountStatementRetrieveResponse.ledgerAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerAccountStatementRetrieveResponse.ledgerAccountLockVersion()).isEqualTo(0L)
        assertThat(ledgerAccountStatementRetrieveResponse.ledgerAccountNormalBalance())
            .isEqualTo(TransactionDirection.CREDIT)
        assertThat(ledgerAccountStatementRetrieveResponse.ledgerId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerAccountStatementRetrieveResponse.liveMode()).isEqualTo(true)
        assertThat(ledgerAccountStatementRetrieveResponse.metadata())
            .isEqualTo(
                LedgerAccountStatementRetrieveResponse.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(ledgerAccountStatementRetrieveResponse.object_()).isEqualTo("object")
        assertThat(ledgerAccountStatementRetrieveResponse.startingBalance())
            .isEqualTo(
                LedgerAccountStatementRetrieveResponse.LedgerBalances.builder()
                    .availableBalance(
                        LedgerAccountStatementRetrieveResponse.LedgerBalances.LedgerBalance
                            .builder()
                            .amount(0L)
                            .credits(0L)
                            .currency("currency")
                            .currencyExponent(0L)
                            .debits(0L)
                            .build()
                    )
                    .pendingBalance(
                        LedgerAccountStatementRetrieveResponse.LedgerBalances.LedgerBalance
                            .builder()
                            .amount(0L)
                            .credits(0L)
                            .currency("currency")
                            .currencyExponent(0L)
                            .debits(0L)
                            .build()
                    )
                    .postedBalance(
                        LedgerAccountStatementRetrieveResponse.LedgerBalances.LedgerBalance
                            .builder()
                            .amount(0L)
                            .credits(0L)
                            .currency("currency")
                            .currencyExponent(0L)
                            .debits(0L)
                            .build()
                    )
                    .build()
            )
        assertThat(ledgerAccountStatementRetrieveResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ledgerAccountStatementRetrieveResponse =
            LedgerAccountStatementRetrieveResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .effectiveAtLowerBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .effectiveAtUpperBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .endingBalance(
                    LedgerAccountStatementRetrieveResponse.LedgerBalances.builder()
                        .availableBalance(
                            LedgerAccountStatementRetrieveResponse.LedgerBalances.LedgerBalance
                                .builder()
                                .amount(0L)
                                .credits(0L)
                                .currency("currency")
                                .currencyExponent(0L)
                                .debits(0L)
                                .build()
                        )
                        .pendingBalance(
                            LedgerAccountStatementRetrieveResponse.LedgerBalances.LedgerBalance
                                .builder()
                                .amount(0L)
                                .credits(0L)
                                .currency("currency")
                                .currencyExponent(0L)
                                .debits(0L)
                                .build()
                        )
                        .postedBalance(
                            LedgerAccountStatementRetrieveResponse.LedgerBalances.LedgerBalance
                                .builder()
                                .amount(0L)
                                .credits(0L)
                                .currency("currency")
                                .currencyExponent(0L)
                                .debits(0L)
                                .build()
                        )
                        .build()
                )
                .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ledgerAccountLockVersion(0L)
                .ledgerAccountNormalBalance(TransactionDirection.CREDIT)
                .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .liveMode(true)
                .metadata(
                    LedgerAccountStatementRetrieveResponse.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .object_("object")
                .startingBalance(
                    LedgerAccountStatementRetrieveResponse.LedgerBalances.builder()
                        .availableBalance(
                            LedgerAccountStatementRetrieveResponse.LedgerBalances.LedgerBalance
                                .builder()
                                .amount(0L)
                                .credits(0L)
                                .currency("currency")
                                .currencyExponent(0L)
                                .debits(0L)
                                .build()
                        )
                        .pendingBalance(
                            LedgerAccountStatementRetrieveResponse.LedgerBalances.LedgerBalance
                                .builder()
                                .amount(0L)
                                .credits(0L)
                                .currency("currency")
                                .currencyExponent(0L)
                                .debits(0L)
                                .build()
                        )
                        .postedBalance(
                            LedgerAccountStatementRetrieveResponse.LedgerBalances.LedgerBalance
                                .builder()
                                .amount(0L)
                                .credits(0L)
                                .currency("currency")
                                .currencyExponent(0L)
                                .debits(0L)
                                .build()
                        )
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedLedgerAccountStatementRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ledgerAccountStatementRetrieveResponse),
                jacksonTypeRef<LedgerAccountStatementRetrieveResponse>(),
            )

        assertThat(roundtrippedLedgerAccountStatementRetrieveResponse)
            .isEqualTo(ledgerAccountStatementRetrieveResponse)
    }
}
