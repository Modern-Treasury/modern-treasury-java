// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerAccountSettlementCreateParamsTest {

    @Test
    fun create() {
        LedgerAccountSettlementCreateParams.builder()
            .contraLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .settledLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .allowEitherDirection(true)
            .description("description")
            .effectiveAtUpperBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .metadata(
                LedgerAccountSettlementCreateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
            .skipSettlementLedgerTransaction(true)
            .status(LedgerAccountSettlementCreateParams.Status.PENDING)
            .build()
    }

    @Test
    fun body() {
        val params =
            LedgerAccountSettlementCreateParams.builder()
                .contraLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .settledLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .allowEitherDirection(true)
                .description("description")
                .effectiveAtUpperBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .metadata(
                    LedgerAccountSettlementCreateParams.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .skipSettlementLedgerTransaction(true)
                .status(LedgerAccountSettlementCreateParams.Status.PENDING)
                .build()

        val body = params._body()

        assertThat(body.contraLedgerAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.settledLedgerAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.allowEitherDirection()).contains(true)
        assertThat(body.description()).contains("description")
        assertThat(body.effectiveAtUpperBound())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.metadata())
            .contains(
                LedgerAccountSettlementCreateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(body.skipSettlementLedgerTransaction()).contains(true)
        assertThat(body.status()).contains(LedgerAccountSettlementCreateParams.Status.PENDING)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            LedgerAccountSettlementCreateParams.builder()
                .contraLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .settledLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertThat(body.contraLedgerAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.settledLedgerAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
