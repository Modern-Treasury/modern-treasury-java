// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CounterpartyCollectAccountParamsTest {

    @Test
    fun createCounterpartyCollectAccountParams() {
        CounterpartyCollectAccountParams.builder()
            .id("id")
            .direction(TransactionDirection.CREDIT)
            .customRedirect("https://example.com")
            .addField(CounterpartyCollectAccountParams.Field.NAME)
            .sendEmail(true)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CounterpartyCollectAccountParams.builder()
                .id("id")
                .direction(TransactionDirection.CREDIT)
                .customRedirect("https://example.com")
                .addField(CounterpartyCollectAccountParams.Field.NAME)
                .sendEmail(true)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.direction()).isEqualTo(TransactionDirection.CREDIT)
        assertThat(body.customRedirect()).contains("https://example.com")
        assertThat(body.fields()).contains(listOf(CounterpartyCollectAccountParams.Field.NAME))
        assertThat(body.sendEmail()).contains(true)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            CounterpartyCollectAccountParams.builder()
                .id("id")
                .direction(TransactionDirection.CREDIT)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.direction()).isEqualTo(TransactionDirection.CREDIT)
    }

    @Test
    fun getPathParam() {
        val params =
            CounterpartyCollectAccountParams.builder()
                .id("id")
                .direction(TransactionDirection.CREDIT)
                .build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
