// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerTransactionCreateParamsTest {

    @Test
    fun create() {
        LedgerTransactionCreateParams.builder()
            .addLedgerEntry(
                LedgerTransactionCreateParams.LedgerEntryCreateRequest.builder()
                    .amount(0L)
                    .direction(TransactionDirection.CREDIT)
                    .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .availableBalanceAmount(
                        LedgerTransactionCreateParams.LedgerEntryCreateRequest
                            .AvailableBalanceAmount
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .lockVersion(0L)
                    .metadata(
                        LedgerTransactionCreateParams.LedgerEntryCreateRequest.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .pendingBalanceAmount(
                        LedgerTransactionCreateParams.LedgerEntryCreateRequest.PendingBalanceAmount
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .postedBalanceAmount(
                        LedgerTransactionCreateParams.LedgerEntryCreateRequest.PostedBalanceAmount
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .showResultingLedgerAccountBalances(true)
                    .build()
            )
            .description("description")
            .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .effectiveDate(LocalDate.parse("2019-12-27"))
            .externalId("external_id")
            .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .ledgerableType(LedgerTransactionCreateParams.LedgerableType.EXPECTED_PAYMENT)
            .metadata(
                LedgerTransactionCreateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
            .status(LedgerTransactionCreateParams.Status.ARCHIVED)
            .build()
    }

    @Test
    fun body() {
        val params =
            LedgerTransactionCreateParams.builder()
                .addLedgerEntry(
                    LedgerTransactionCreateParams.LedgerEntryCreateRequest.builder()
                        .amount(0L)
                        .direction(TransactionDirection.CREDIT)
                        .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .availableBalanceAmount(
                            LedgerTransactionCreateParams.LedgerEntryCreateRequest
                                .AvailableBalanceAmount
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .lockVersion(0L)
                        .metadata(
                            LedgerTransactionCreateParams.LedgerEntryCreateRequest.Metadata
                                .builder()
                                .putAdditionalProperty("key", JsonValue.from("value"))
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                .build()
                        )
                        .pendingBalanceAmount(
                            LedgerTransactionCreateParams.LedgerEntryCreateRequest
                                .PendingBalanceAmount
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .postedBalanceAmount(
                            LedgerTransactionCreateParams.LedgerEntryCreateRequest
                                .PostedBalanceAmount
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .showResultingLedgerAccountBalances(true)
                        .build()
                )
                .description("description")
                .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .externalId("external_id")
                .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ledgerableType(LedgerTransactionCreateParams.LedgerableType.EXPECTED_PAYMENT)
                .metadata(
                    LedgerTransactionCreateParams.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .status(LedgerTransactionCreateParams.Status.ARCHIVED)
                .build()

        val body = params._body()

        assertThat(body.ledgerEntries())
            .containsExactly(
                LedgerTransactionCreateParams.LedgerEntryCreateRequest.builder()
                    .amount(0L)
                    .direction(TransactionDirection.CREDIT)
                    .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .availableBalanceAmount(
                        LedgerTransactionCreateParams.LedgerEntryCreateRequest
                            .AvailableBalanceAmount
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .lockVersion(0L)
                    .metadata(
                        LedgerTransactionCreateParams.LedgerEntryCreateRequest.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .pendingBalanceAmount(
                        LedgerTransactionCreateParams.LedgerEntryCreateRequest.PendingBalanceAmount
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .postedBalanceAmount(
                        LedgerTransactionCreateParams.LedgerEntryCreateRequest.PostedBalanceAmount
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .showResultingLedgerAccountBalances(true)
                    .build()
            )
        assertThat(body.description()).contains("description")
        assertThat(body.effectiveAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.effectiveDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(body.externalId()).contains("external_id")
        assertThat(body.ledgerableId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.ledgerableType())
            .contains(LedgerTransactionCreateParams.LedgerableType.EXPECTED_PAYMENT)
        assertThat(body.metadata())
            .contains(
                LedgerTransactionCreateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(body.status()).contains(LedgerTransactionCreateParams.Status.ARCHIVED)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            LedgerTransactionCreateParams.builder()
                .addLedgerEntry(
                    LedgerTransactionCreateParams.LedgerEntryCreateRequest.builder()
                        .amount(0L)
                        .direction(TransactionDirection.CREDIT)
                        .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.ledgerEntries())
            .containsExactly(
                LedgerTransactionCreateParams.LedgerEntryCreateRequest.builder()
                    .amount(0L)
                    .direction(TransactionDirection.CREDIT)
                    .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }
}
