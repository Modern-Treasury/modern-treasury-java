// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceLineItemCreateParamsTest {

    @Test
    fun create() {
        InvoiceLineItemCreateParams.builder()
            .invoiceId("invoice_id")
            .name("name")
            .unitAmount(0L)
            .description("description")
            .direction("direction")
            .metadata(
                InvoiceLineItemCreateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
            .quantity(0L)
            .unitAmountDecimal("unit_amount_decimal")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            InvoiceLineItemCreateParams.builder()
                .invoiceId("invoice_id")
                .name("name")
                .unitAmount(0L)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("invoice_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            InvoiceLineItemCreateParams.builder()
                .invoiceId("invoice_id")
                .name("name")
                .unitAmount(0L)
                .description("description")
                .direction("direction")
                .metadata(
                    InvoiceLineItemCreateParams.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .quantity(0L)
                .unitAmountDecimal("unit_amount_decimal")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.unitAmount()).isEqualTo(0L)
        assertThat(body.description()).contains("description")
        assertThat(body.direction()).contains("direction")
        assertThat(body.metadata())
            .contains(
                InvoiceLineItemCreateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(body.quantity()).contains(0L)
        assertThat(body.unitAmountDecimal()).contains("unit_amount_decimal")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InvoiceLineItemCreateParams.builder()
                .invoiceId("invoice_id")
                .name("name")
                .unitAmount(0L)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.unitAmount()).isEqualTo(0L)
    }
}
