// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerEntryTest {

    @Test
    fun createLedgerEntry() {
        val ledgerEntry =
            LedgerEntry.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(0L)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .direction(TransactionDirection.CREDIT)
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .ledgerAccountCurrency("ledger_account_currency")
                .ledgerAccountCurrencyExponent(0L)
                .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ledgerAccountLockVersion(0L)
                .ledgerTransactionId("ledger_transaction_id")
                .liveMode(true)
                .metadata(LedgerEntry.Metadata.builder().build())
                .object_("object")
                .resultingLedgerAccountBalances(
                    LedgerEntry.LedgerBalances.builder()
                        .availableBalance(
                            LedgerEntry.LedgerBalances.LedgerBalance.builder()
                                .amount(0L)
                                .credits(0L)
                                .currency("currency")
                                .currencyExponent(0L)
                                .debits(0L)
                                .build()
                        )
                        .pendingBalance(
                            LedgerEntry.LedgerBalances.LedgerBalance.builder()
                                .amount(0L)
                                .credits(0L)
                                .currency("currency")
                                .currencyExponent(0L)
                                .debits(0L)
                                .build()
                        )
                        .postedBalance(
                            LedgerEntry.LedgerBalances.LedgerBalance.builder()
                                .amount(0L)
                                .credits(0L)
                                .currency("currency")
                                .currencyExponent(0L)
                                .debits(0L)
                                .build()
                        )
                        .build()
                )
                .status(LedgerEntry.Status.ARCHIVED)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(ledgerEntry).isNotNull
        assertThat(ledgerEntry.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerEntry.amount()).isEqualTo(0L)
        assertThat(ledgerEntry.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerEntry.direction()).isEqualTo(TransactionDirection.CREDIT)
        assertThat(ledgerEntry.discardedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerEntry.ledgerAccountCurrency()).isEqualTo("ledger_account_currency")
        assertThat(ledgerEntry.ledgerAccountCurrencyExponent()).isEqualTo(0L)
        assertThat(ledgerEntry.ledgerAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerEntry.ledgerAccountLockVersion()).contains(0L)
        assertThat(ledgerEntry.ledgerTransactionId()).isEqualTo("ledger_transaction_id")
        assertThat(ledgerEntry.liveMode()).isEqualTo(true)
        assertThat(ledgerEntry.metadata()).isEqualTo(LedgerEntry.Metadata.builder().build())
        assertThat(ledgerEntry.object_()).isEqualTo("object")
        assertThat(ledgerEntry.resultingLedgerAccountBalances())
            .contains(
                LedgerEntry.LedgerBalances.builder()
                    .availableBalance(
                        LedgerEntry.LedgerBalances.LedgerBalance.builder()
                            .amount(0L)
                            .credits(0L)
                            .currency("currency")
                            .currencyExponent(0L)
                            .debits(0L)
                            .build()
                    )
                    .pendingBalance(
                        LedgerEntry.LedgerBalances.LedgerBalance.builder()
                            .amount(0L)
                            .credits(0L)
                            .currency("currency")
                            .currencyExponent(0L)
                            .debits(0L)
                            .build()
                    )
                    .postedBalance(
                        LedgerEntry.LedgerBalances.LedgerBalance.builder()
                            .amount(0L)
                            .credits(0L)
                            .currency("currency")
                            .currencyExponent(0L)
                            .debits(0L)
                            .build()
                    )
                    .build()
            )
        assertThat(ledgerEntry.status()).isEqualTo(LedgerEntry.Status.ARCHIVED)
        assertThat(ledgerEntry.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
