// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerAccountSettlementUpdateParamsTest {

    @Test
    fun create() {
        LedgerAccountSettlementUpdateParams.builder()
            .id("id")
            .description("description")
            .metadata(
                LedgerAccountSettlementUpdateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
            .status(LedgerAccountSettlementUpdateParams.Status.POSTED)
            .build()
    }

    @Test
    fun pathParams() {
        val params = LedgerAccountSettlementUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            LedgerAccountSettlementUpdateParams.builder()
                .id("id")
                .description("description")
                .metadata(
                    LedgerAccountSettlementUpdateParams.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .status(LedgerAccountSettlementUpdateParams.Status.POSTED)
                .build()

        val body = params._body()

        assertThat(body.description()).contains("description")
        assertThat(body.metadata())
            .contains(
                LedgerAccountSettlementUpdateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(body.status()).contains(LedgerAccountSettlementUpdateParams.Status.POSTED)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = LedgerAccountSettlementUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
