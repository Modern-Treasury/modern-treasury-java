// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class VirtualAccountListParamsTest {

    @Test
    fun createVirtualAccountListParams() {
        VirtualAccountListParams.builder()
            .afterCursor("string")
            .counterpartyId("string")
            .internalAccountId("string")
            .metadata(VirtualAccountListParams.Metadata.builder().build())
            .perPage(123L)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            VirtualAccountListParams.builder()
                .afterCursor("string")
                .counterpartyId("string")
                .internalAccountId("string")
                .metadata(VirtualAccountListParams.Metadata.builder().build())
                .perPage(123L)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("after_cursor", listOf("string"))
        expected.put("counterparty_id", listOf("string"))
        expected.put("internal_account_id", listOf("string"))
        VirtualAccountListParams.Metadata.builder().build().forEachQueryParam { key, values ->
            expected.put("metadata[$key]", values)
        }
        expected.put("per_page", listOf("123"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = VirtualAccountListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
