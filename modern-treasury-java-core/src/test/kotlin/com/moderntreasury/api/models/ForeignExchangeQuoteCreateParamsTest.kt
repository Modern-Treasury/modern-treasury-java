// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import java.time.OffsetDateTime
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ForeignExchangeQuoteCreateParamsTest {

    @Test
    fun create() {
        ForeignExchangeQuoteCreateParams.builder()
            .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .targetCurrency(Currency.AED)
            .baseAmount(0L)
            .baseCurrency(Currency.AED)
            .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .targetAmount(0L)
            .build()
    }

    @Test
    fun body() {
        val params =
            ForeignExchangeQuoteCreateParams.builder()
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .targetCurrency(Currency.AED)
                .baseAmount(0L)
                .baseCurrency(Currency.AED)
                .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .targetAmount(0L)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.internalAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.targetCurrency()).isEqualTo(Currency.AED)
        assertThat(body.baseAmount()).contains(0L)
        assertThat(body.baseCurrency()).contains(Currency.AED)
        assertThat(body.effectiveAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.targetAmount()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ForeignExchangeQuoteCreateParams.builder()
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .targetCurrency(Currency.AED)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.internalAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.targetCurrency()).isEqualTo(Currency.AED)
    }
}
