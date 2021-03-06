// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TransactionListParamsTest {

    @Test
    fun createTransactionListParams() {
        TransactionListParams.builder()
            .afterCursor("string")
            .asOfDateEnd(LocalDate.parse("2019-12-27"))
            .asOfDateStart(LocalDate.parse("2019-12-27"))
            .counterpartyId("string")
            .description("string")
            .direction("string")
            .internalAccountId("string")
            .metadata(TransactionListParams.Metadata.builder().build())
            .paymentType("string")
            .perPage(123L)
            .posted(true)
            .transactableType("string")
            .vendorId("string")
            .virtualAccountId("string")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            TransactionListParams.builder()
                .afterCursor("string")
                .asOfDateEnd(LocalDate.parse("2019-12-27"))
                .asOfDateStart(LocalDate.parse("2019-12-27"))
                .counterpartyId("string")
                .description("string")
                .direction("string")
                .internalAccountId("string")
                .metadata(TransactionListParams.Metadata.builder().build())
                .paymentType("string")
                .perPage(123L)
                .posted(true)
                .transactableType("string")
                .vendorId("string")
                .virtualAccountId("string")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("after_cursor", listOf("string"))
        expected.put("as_of_date_end", listOf("2019-12-27"))
        expected.put("as_of_date_start", listOf("2019-12-27"))
        expected.put("counterparty_id", listOf("string"))
        expected.put("description", listOf("string"))
        expected.put("direction", listOf("string"))
        expected.put("internal_account_id", listOf("string"))
        TransactionListParams.Metadata.builder().build().forEachQueryParam { key, values ->
            expected.put("metadata[$key]", values)
        }
        expected.put("payment_type", listOf("string"))
        expected.put("per_page", listOf("123"))
        expected.put("posted", listOf("true"))
        expected.put("transactable_type", listOf("string"))
        expected.put("vendor_id", listOf("string"))
        expected.put("virtual_account_id", listOf("string"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = TransactionListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
