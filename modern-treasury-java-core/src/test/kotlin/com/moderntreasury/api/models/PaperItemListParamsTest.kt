// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaperItemListParamsTest {

    @Test
    fun create() {
        PaperItemListParams.builder()
            .afterCursor("after_cursor")
            .depositDateEnd(LocalDate.parse("2019-12-27"))
            .depositDateStart(LocalDate.parse("2019-12-27"))
            .lockboxNumber("lockbox_number")
            .perPage(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            PaperItemListParams.builder()
                .afterCursor("after_cursor")
                .depositDateEnd(LocalDate.parse("2019-12-27"))
                .depositDateStart(LocalDate.parse("2019-12-27"))
                .lockboxNumber("lockbox_number")
                .perPage(0L)
                .build()
        val expected = QueryParams.builder()
        expected.put("after_cursor", "after_cursor")
        expected.put("deposit_date_end", "2019-12-27")
        expected.put("deposit_date_start", "2019-12-27")
        expected.put("lockbox_number", "lockbox_number")
        expected.put("per_page", "0")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PaperItemListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
