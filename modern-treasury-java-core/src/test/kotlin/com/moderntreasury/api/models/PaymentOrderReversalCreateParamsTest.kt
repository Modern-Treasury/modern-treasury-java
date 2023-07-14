package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaymentOrderReversalCreateParamsTest {

    @Test
    fun createPaymentOrderReversalCreateParams() {
        PaymentOrderReversalCreateParams.builder()
            .paymentOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .reason(PaymentOrderReversalCreateParams.Reason.DUPLICATE)
            .metadata(PaymentOrderReversalCreateParams.Metadata.builder().build())
            .ledgerTransaction(
                PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest.builder()
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .ledgerEntries(
                        listOf(
                            PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                                .LedgerEntryCreateRequest
                                .builder()
                                .amount(123L)
                                .direction(
                                    PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                                        .LedgerEntryCreateRequest
                                        .Direction
                                        .CREDIT
                                )
                                .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .availableBalanceAmount(
                                    PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                                        .LedgerEntryCreateRequest
                                        .AvailableBalanceAmount
                                        .builder()
                                        .build()
                                )
                                .lockVersion(123L)
                                .pendingBalanceAmount(
                                    PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                                        .LedgerEntryCreateRequest
                                        .PendingBalanceAmount
                                        .builder()
                                        .build()
                                )
                                .postedBalanceAmount(
                                    PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                                        .LedgerEntryCreateRequest
                                        .PostedBalanceAmount
                                        .builder()
                                        .build()
                                )
                                .showResultingLedgerAccountBalances(true)
                                .build()
                        )
                    )
                    .description("string")
                    .externalId("string")
                    .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .ledgerableType(
                        PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                            .LedgerableType
                            .COUNTERPARTY
                    )
                    .metadata(
                        PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest.Metadata
                            .builder()
                            .build()
                    )
                    .status(
                        PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest.Status
                            .ARCHIVED
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            PaymentOrderReversalCreateParams.builder()
                .paymentOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .reason(PaymentOrderReversalCreateParams.Reason.DUPLICATE)
                .metadata(PaymentOrderReversalCreateParams.Metadata.builder().build())
                .ledgerTransaction(
                    PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest.builder()
                        .effectiveDate(LocalDate.parse("2019-12-27"))
                        .ledgerEntries(
                            listOf(
                                PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                                    .LedgerEntryCreateRequest
                                    .builder()
                                    .amount(123L)
                                    .direction(
                                        PaymentOrderReversalCreateParams
                                            .LedgerTransactionCreateRequest
                                            .LedgerEntryCreateRequest
                                            .Direction
                                            .CREDIT
                                    )
                                    .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .availableBalanceAmount(
                                        PaymentOrderReversalCreateParams
                                            .LedgerTransactionCreateRequest
                                            .LedgerEntryCreateRequest
                                            .AvailableBalanceAmount
                                            .builder()
                                            .build()
                                    )
                                    .lockVersion(123L)
                                    .pendingBalanceAmount(
                                        PaymentOrderReversalCreateParams
                                            .LedgerTransactionCreateRequest
                                            .LedgerEntryCreateRequest
                                            .PendingBalanceAmount
                                            .builder()
                                            .build()
                                    )
                                    .postedBalanceAmount(
                                        PaymentOrderReversalCreateParams
                                            .LedgerTransactionCreateRequest
                                            .LedgerEntryCreateRequest
                                            .PostedBalanceAmount
                                            .builder()
                                            .build()
                                    )
                                    .showResultingLedgerAccountBalances(true)
                                    .build()
                            )
                        )
                        .description("string")
                        .externalId("string")
                        .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .ledgerableType(
                            PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                                .LedgerableType
                                .COUNTERPARTY
                        )
                        .metadata(
                            PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest.Metadata
                                .builder()
                                .build()
                        )
                        .status(
                            PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest.Status
                                .ARCHIVED
                        )
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.reason()).isEqualTo(PaymentOrderReversalCreateParams.Reason.DUPLICATE)
        assertThat(body.metadata())
            .isEqualTo(PaymentOrderReversalCreateParams.Metadata.builder().build())
        assertThat(body.ledgerTransaction())
            .isEqualTo(
                PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest.builder()
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .ledgerEntries(
                        listOf(
                            PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                                .LedgerEntryCreateRequest
                                .builder()
                                .amount(123L)
                                .direction(
                                    PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                                        .LedgerEntryCreateRequest
                                        .Direction
                                        .CREDIT
                                )
                                .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .availableBalanceAmount(
                                    PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                                        .LedgerEntryCreateRequest
                                        .AvailableBalanceAmount
                                        .builder()
                                        .build()
                                )
                                .lockVersion(123L)
                                .pendingBalanceAmount(
                                    PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                                        .LedgerEntryCreateRequest
                                        .PendingBalanceAmount
                                        .builder()
                                        .build()
                                )
                                .postedBalanceAmount(
                                    PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                                        .LedgerEntryCreateRequest
                                        .PostedBalanceAmount
                                        .builder()
                                        .build()
                                )
                                .showResultingLedgerAccountBalances(true)
                                .build()
                        )
                    )
                    .description("string")
                    .externalId("string")
                    .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .ledgerableType(
                        PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                            .LedgerableType
                            .COUNTERPARTY
                    )
                    .metadata(
                        PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest.Metadata
                            .builder()
                            .build()
                    )
                    .status(
                        PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest.Status
                            .ARCHIVED
                    )
                    .build()
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            PaymentOrderReversalCreateParams.builder()
                .paymentOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .reason(PaymentOrderReversalCreateParams.Reason.DUPLICATE)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.reason()).isEqualTo(PaymentOrderReversalCreateParams.Reason.DUPLICATE)
    }

    @Test
    fun getPathParam() {
        val params =
            PaymentOrderReversalCreateParams.builder()
                .paymentOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .reason(PaymentOrderReversalCreateParams.Reason.DUPLICATE)
                .build()
        assertThat(params).isNotNull
        // path param "paymentOrderId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
