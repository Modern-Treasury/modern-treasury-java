// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LegalEntityListParamsTest {

    @Test
    fun createLegalEntityListParams() {
        LegalEntityListParams.builder()
            .afterCursor("after_cursor")
            .legalEntityType(LegalEntityListParams.LegalEntityType.BUSINESS)
            .metadata(LegalEntityListParams.Metadata.builder().build())
            .perPage(123L)
            .showDeleted("show_deleted")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            LegalEntityListParams.builder()
                .afterCursor("after_cursor")
                .legalEntityType(LegalEntityListParams.LegalEntityType.BUSINESS)
                .metadata(LegalEntityListParams.Metadata.builder().build())
                .perPage(123L)
                .showDeleted("show_deleted")
                .build()
        val expected = QueryParams.builder()
        expected.put("after_cursor", "after_cursor")
        expected.put("legal_entity_type", LegalEntityListParams.LegalEntityType.BUSINESS.toString())
        LegalEntityListParams.Metadata.builder().build().forEachQueryParam { key, values ->
            expected.put("metadata[$key]", values)
        }
        expected.put("per_page", "123")
        expected.put("show_deleted", "show_deleted")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = LegalEntityListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
