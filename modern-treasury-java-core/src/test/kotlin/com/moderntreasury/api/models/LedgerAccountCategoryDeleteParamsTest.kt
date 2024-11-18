// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerAccountCategoryDeleteParamsTest {

    @Test
    fun createLedgerAccountCategoryDeleteParams() {
        LedgerAccountCategoryDeleteParams.builder().id("id").build()
    }

    @Test
    fun getPathParam() {
        val params = LedgerAccountCategoryDeleteParams.builder().id("id").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}