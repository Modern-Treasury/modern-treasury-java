// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerAccountBalanceMonitorTest {

    @Test
    fun createLedgerAccountBalanceMonitor() {
        val ledgerAccountBalanceMonitor =
            LedgerAccountBalanceMonitor.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .alertCondition(
                    LedgerAccountBalanceMonitor.AlertCondition.builder()
                        .field("field")
                        .operator("operator")
                        .value(123L)
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currentLedgerAccountBalanceState(
                    LedgerAccountBalanceMonitor.CurrentLedgerAccountBalanceState.builder()
                        .balances(
                            LedgerAccountBalanceMonitor.CurrentLedgerAccountBalanceState
                                .LedgerBalances
                                .builder()
                                .availableBalance(
                                    LedgerAccountBalanceMonitor.CurrentLedgerAccountBalanceState
                                        .LedgerBalances
                                        .LedgerBalance
                                        .builder()
                                        .amount(123L)
                                        .credits(123L)
                                        .currency("currency")
                                        .currencyExponent(123L)
                                        .debits(123L)
                                        .build()
                                )
                                .pendingBalance(
                                    LedgerAccountBalanceMonitor.CurrentLedgerAccountBalanceState
                                        .LedgerBalances
                                        .LedgerBalance
                                        .builder()
                                        .amount(123L)
                                        .credits(123L)
                                        .currency("currency")
                                        .currencyExponent(123L)
                                        .debits(123L)
                                        .build()
                                )
                                .postedBalance(
                                    LedgerAccountBalanceMonitor.CurrentLedgerAccountBalanceState
                                        .LedgerBalances
                                        .LedgerBalance
                                        .builder()
                                        .amount(123L)
                                        .credits(123L)
                                        .currency("currency")
                                        .currencyExponent(123L)
                                        .debits(123L)
                                        .build()
                                )
                                .build()
                        )
                        .ledgerAccountLockVersion(123L)
                        .triggered(true)
                        .build()
                )
                .description("description")
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .ledgerAccountId("ledger_account_id")
                .liveMode(true)
                .metadata(LedgerAccountBalanceMonitor.Metadata.builder().build())
                .object_("object")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(ledgerAccountBalanceMonitor).isNotNull
        assertThat(ledgerAccountBalanceMonitor.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerAccountBalanceMonitor.alertCondition())
            .isEqualTo(
                LedgerAccountBalanceMonitor.AlertCondition.builder()
                    .field("field")
                    .operator("operator")
                    .value(123L)
                    .build()
            )
        assertThat(ledgerAccountBalanceMonitor.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerAccountBalanceMonitor.currentLedgerAccountBalanceState())
            .isEqualTo(
                LedgerAccountBalanceMonitor.CurrentLedgerAccountBalanceState.builder()
                    .balances(
                        LedgerAccountBalanceMonitor.CurrentLedgerAccountBalanceState.LedgerBalances
                            .builder()
                            .availableBalance(
                                LedgerAccountBalanceMonitor.CurrentLedgerAccountBalanceState
                                    .LedgerBalances
                                    .LedgerBalance
                                    .builder()
                                    .amount(123L)
                                    .credits(123L)
                                    .currency("currency")
                                    .currencyExponent(123L)
                                    .debits(123L)
                                    .build()
                            )
                            .pendingBalance(
                                LedgerAccountBalanceMonitor.CurrentLedgerAccountBalanceState
                                    .LedgerBalances
                                    .LedgerBalance
                                    .builder()
                                    .amount(123L)
                                    .credits(123L)
                                    .currency("currency")
                                    .currencyExponent(123L)
                                    .debits(123L)
                                    .build()
                            )
                            .postedBalance(
                                LedgerAccountBalanceMonitor.CurrentLedgerAccountBalanceState
                                    .LedgerBalances
                                    .LedgerBalance
                                    .builder()
                                    .amount(123L)
                                    .credits(123L)
                                    .currency("currency")
                                    .currencyExponent(123L)
                                    .debits(123L)
                                    .build()
                            )
                            .build()
                    )
                    .ledgerAccountLockVersion(123L)
                    .triggered(true)
                    .build()
            )
        assertThat(ledgerAccountBalanceMonitor.description()).contains("description")
        assertThat(ledgerAccountBalanceMonitor.discardedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerAccountBalanceMonitor.ledgerAccountId()).isEqualTo("ledger_account_id")
        assertThat(ledgerAccountBalanceMonitor.liveMode()).isEqualTo(true)
        assertThat(ledgerAccountBalanceMonitor.metadata())
            .isEqualTo(LedgerAccountBalanceMonitor.Metadata.builder().build())
        assertThat(ledgerAccountBalanceMonitor.object_()).isEqualTo("object")
        assertThat(ledgerAccountBalanceMonitor.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
