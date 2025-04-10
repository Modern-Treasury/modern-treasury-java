// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerTransactionUpdateParamsTest {

    @Test
    fun create() {
        LedgerTransactionUpdateParams.builder()
            .id("id")
            .description("description")
            .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .addLedgerEntry(
                LedgerTransactionUpdateParams.LedgerEntryCreateRequest.builder()
                    .amount(0L)
                    .direction(TransactionDirection.CREDIT)
                    .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .availableBalanceAmount(
                        LedgerTransactionUpdateParams.LedgerEntryCreateRequest
                            .AvailableBalanceAmount
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .lockVersion(0L)
                    .metadata(
                        LedgerTransactionUpdateParams.LedgerEntryCreateRequest.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .pendingBalanceAmount(
                        LedgerTransactionUpdateParams.LedgerEntryCreateRequest.PendingBalanceAmount
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .postedBalanceAmount(
                        LedgerTransactionUpdateParams.LedgerEntryCreateRequest.PostedBalanceAmount
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .showResultingLedgerAccountBalances(true)
                    .build()
            )
            .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .ledgerableType(LedgerTransactionUpdateParams.LedgerableType.EXPECTED_PAYMENT)
            .metadata(
                LedgerTransactionUpdateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
            .status(LedgerTransactionUpdateParams.Status.ARCHIVED)
            .build()
    }

    @Test
    fun pathParams() {
        val params = LedgerTransactionUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            LedgerTransactionUpdateParams.builder()
                .id("id")
                .description("description")
                .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addLedgerEntry(
                    LedgerTransactionUpdateParams.LedgerEntryCreateRequest.builder()
                        .amount(0L)
                        .direction(TransactionDirection.CREDIT)
                        .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .availableBalanceAmount(
                            LedgerTransactionUpdateParams.LedgerEntryCreateRequest
                                .AvailableBalanceAmount
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .lockVersion(0L)
                        .metadata(
                            LedgerTransactionUpdateParams.LedgerEntryCreateRequest.Metadata
                                .builder()
                                .putAdditionalProperty("key", JsonValue.from("value"))
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                .build()
                        )
                        .pendingBalanceAmount(
                            LedgerTransactionUpdateParams.LedgerEntryCreateRequest
                                .PendingBalanceAmount
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .postedBalanceAmount(
                            LedgerTransactionUpdateParams.LedgerEntryCreateRequest
                                .PostedBalanceAmount
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .showResultingLedgerAccountBalances(true)
                        .build()
                )
                .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ledgerableType(LedgerTransactionUpdateParams.LedgerableType.EXPECTED_PAYMENT)
                .metadata(
                    LedgerTransactionUpdateParams.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .status(LedgerTransactionUpdateParams.Status.ARCHIVED)
                .build()

        val body = params._body()

        assertThat(body.description()).contains("description")
        assertThat(body.effectiveAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.ledgerEntries().getOrNull())
            .containsExactly(
                LedgerTransactionUpdateParams.LedgerEntryCreateRequest.builder()
                    .amount(0L)
                    .direction(TransactionDirection.CREDIT)
                    .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .availableBalanceAmount(
                        LedgerTransactionUpdateParams.LedgerEntryCreateRequest
                            .AvailableBalanceAmount
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .lockVersion(0L)
                    .metadata(
                        LedgerTransactionUpdateParams.LedgerEntryCreateRequest.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .pendingBalanceAmount(
                        LedgerTransactionUpdateParams.LedgerEntryCreateRequest.PendingBalanceAmount
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .postedBalanceAmount(
                        LedgerTransactionUpdateParams.LedgerEntryCreateRequest.PostedBalanceAmount
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .showResultingLedgerAccountBalances(true)
                    .build()
            )
        assertThat(body.ledgerableId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.ledgerableType())
            .contains(LedgerTransactionUpdateParams.LedgerableType.EXPECTED_PAYMENT)
        assertThat(body.metadata())
            .contains(
                LedgerTransactionUpdateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(body.status()).contains(LedgerTransactionUpdateParams.Status.ARCHIVED)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = LedgerTransactionUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
