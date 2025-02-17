// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerableEventCreateParamsTest {

    @Test
    fun create() {
        LedgerableEventCreateParams.builder()
            .name("name")
            .customData(JsonValue.from(mapOf<String, Any>()))
            .description("description")
            .metadata(
                LedgerableEventCreateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            LedgerableEventCreateParams.builder()
                .name("name")
                .customData(JsonValue.from(mapOf<String, Any>()))
                .description("description")
                .metadata(
                    LedgerableEventCreateParams.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("name")
        assertThat(body._customData()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.description()).contains("description")
        assertThat(body.metadata())
            .contains(
                LedgerableEventCreateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = LedgerableEventCreateParams.builder().name("name").build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("name")
    }
}
