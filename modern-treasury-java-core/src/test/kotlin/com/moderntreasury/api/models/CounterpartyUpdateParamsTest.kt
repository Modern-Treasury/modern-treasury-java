// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CounterpartyUpdateParamsTest {

    @Test
    fun create() {
        CounterpartyUpdateParams.builder()
            .id("id")
            .email("dev@stainless.com")
            .legalEntityId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .metadata(
                CounterpartyUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .name("name")
            .sendRemittanceAdvice(true)
            .taxpayerIdentifier("taxpayer_identifier")
            .build()
    }

    @Test
    fun pathParams() {
        val params = CounterpartyUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CounterpartyUpdateParams.builder()
                .id("id")
                .email("dev@stainless.com")
                .legalEntityId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .metadata(
                    CounterpartyUpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .name("name")
                .sendRemittanceAdvice(true)
                .taxpayerIdentifier("taxpayer_identifier")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.email()).contains("dev@stainless.com")
        assertThat(body.legalEntityId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.metadata())
            .contains(
                CounterpartyUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.name()).contains("name")
        assertThat(body.sendRemittanceAdvice()).contains(true)
        assertThat(body.taxpayerIdentifier()).contains("taxpayer_identifier")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CounterpartyUpdateParams.builder().id("id").build()

        val body = params._body()

        assertNotNull(body)
    }
}
