// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerAccountUpdateParamsTest {

    @Test
    fun create() {
        LedgerAccountUpdateParams.builder()
            .id("id")
            .description("description")
            .metadata(
                LedgerAccountUpdateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
            .name("name")
            .build()
    }

    @Test
    fun body() {
        val params =
            LedgerAccountUpdateParams.builder()
                .id("id")
                .description("description")
                .metadata(
                    LedgerAccountUpdateParams.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .name("name")
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.description()).contains("description")
        assertThat(body.metadata())
            .contains(
                LedgerAccountUpdateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(body.name()).contains("name")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = LedgerAccountUpdateParams.builder().id("id").build()

        val body = params._body()

        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = LedgerAccountUpdateParams.builder().id("id").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
