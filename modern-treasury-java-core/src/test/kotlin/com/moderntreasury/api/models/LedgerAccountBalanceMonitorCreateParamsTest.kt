// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerAccountBalanceMonitorCreateParamsTest {

    @Test
    fun createLedgerAccountBalanceMonitorCreateParams() {
        LedgerAccountBalanceMonitorCreateParams.builder()
            .alertCondition(
                LedgerAccountBalanceMonitorCreateParams.AlertConditionCreateRequest.builder()
                    .field("field")
                    .operator("operator")
                    .value(123L)
                    .build()
            )
            .ledgerAccountId("ledger_account_id")
            .description("description")
            .metadata(LedgerAccountBalanceMonitorCreateParams.Metadata.builder().build())
            .build()
    }

    @Test
    fun getBody() {
        val params =
            LedgerAccountBalanceMonitorCreateParams.builder()
                .alertCondition(
                    LedgerAccountBalanceMonitorCreateParams.AlertConditionCreateRequest.builder()
                        .field("field")
                        .operator("operator")
                        .value(123L)
                        .build()
                )
                .ledgerAccountId("ledger_account_id")
                .description("description")
                .metadata(LedgerAccountBalanceMonitorCreateParams.Metadata.builder().build())
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.alertCondition())
            .isEqualTo(
                LedgerAccountBalanceMonitorCreateParams.AlertConditionCreateRequest.builder()
                    .field("field")
                    .operator("operator")
                    .value(123L)
                    .build()
            )
        assertThat(body.ledgerAccountId()).isEqualTo("ledger_account_id")
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.metadata())
            .isEqualTo(LedgerAccountBalanceMonitorCreateParams.Metadata.builder().build())
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            LedgerAccountBalanceMonitorCreateParams.builder()
                .alertCondition(
                    LedgerAccountBalanceMonitorCreateParams.AlertConditionCreateRequest.builder()
                        .field("field")
                        .operator("operator")
                        .value(123L)
                        .build()
                )
                .ledgerAccountId("ledger_account_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.alertCondition())
            .isEqualTo(
                LedgerAccountBalanceMonitorCreateParams.AlertConditionCreateRequest.builder()
                    .field("field")
                    .operator("operator")
                    .value(123L)
                    .build()
            )
        assertThat(body.ledgerAccountId()).isEqualTo("ledger_account_id")
    }
}
