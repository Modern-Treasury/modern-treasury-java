// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerAccountSettlementListParamsTest {

    @Test
    fun createLedgerAccountSettlementListParams() {
        LedgerAccountSettlementListParams.builder()
            .id(listOf("string"))
            .afterCursor("after_cursor")
            .createdAt(LedgerAccountSettlementListParams.CreatedAt.builder().build())
            .ledgerId("ledger_id")
            .ledgerTransactionId("ledger_transaction_id")
            .metadata(LedgerAccountSettlementListParams.Metadata.builder().build())
            .perPage(123L)
            .settledLedgerAccountId("settled_ledger_account_id")
            .settlementEntryDirection("settlement_entry_direction")
            .updatedAt(LedgerAccountSettlementListParams.UpdatedAt.builder().build())
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            LedgerAccountSettlementListParams.builder()
                .id(listOf("string"))
                .afterCursor("after_cursor")
                .createdAt(LedgerAccountSettlementListParams.CreatedAt.builder().build())
                .ledgerId("ledger_id")
                .ledgerTransactionId("ledger_transaction_id")
                .metadata(LedgerAccountSettlementListParams.Metadata.builder().build())
                .perPage(123L)
                .settledLedgerAccountId("settled_ledger_account_id")
                .settlementEntryDirection("settlement_entry_direction")
                .updatedAt(LedgerAccountSettlementListParams.UpdatedAt.builder().build())
                .build()
        val expected = QueryParams.builder()
        expected.put("id[]", "string")
        expected.put("after_cursor", "after_cursor")
        LedgerAccountSettlementListParams.CreatedAt.builder().build().forEachQueryParam {
            key,
            values ->
            expected.put("created_at[$key]", values)
        }
        expected.put("ledger_id", "ledger_id")
        expected.put("ledger_transaction_id", "ledger_transaction_id")
        LedgerAccountSettlementListParams.Metadata.builder().build().forEachQueryParam { key, values
            ->
            expected.put("metadata[$key]", values)
        }
        expected.put("per_page", "123")
        expected.put("settled_ledger_account_id", "settled_ledger_account_id")
        expected.put("settlement_entry_direction", "settlement_entry_direction")
        LedgerAccountSettlementListParams.UpdatedAt.builder().build().forEachQueryParam {
            key,
            values ->
            expected.put("updated_at[$key]", values)
        }
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = LedgerAccountSettlementListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
