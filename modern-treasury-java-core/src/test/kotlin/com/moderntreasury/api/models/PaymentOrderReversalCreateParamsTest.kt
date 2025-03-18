// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import java.time.LocalDate
import java.time.OffsetDateTime
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentOrderReversalCreateParamsTest {

    @Test
    fun create() {
        PaymentOrderReversalCreateParams.builder()
            .paymentOrderId("payment_order_id")
            .reason(PaymentOrderReversalCreateParams.Reason.DUPLICATE)
            .ledgerTransaction(
                PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest.builder()
                    .addLedgerEntry(
                        PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                            .LedgerEntryCreateRequest
                            .builder()
                            .amount(0L)
                            .direction(TransactionDirection.CREDIT)
                            .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .availableBalanceAmount(
                                PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                                    .LedgerEntryCreateRequest
                                    .AvailableBalanceAmount
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from(0))
                                    .build()
                            )
                            .lockVersion(0L)
                            .metadata(
                                PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                                    .LedgerEntryCreateRequest
                                    .Metadata
                                    .builder()
                                    .putAdditionalProperty("key", JsonValue.from("value"))
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                    .build()
                            )
                            .pendingBalanceAmount(
                                PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                                    .LedgerEntryCreateRequest
                                    .PendingBalanceAmount
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from(0))
                                    .build()
                            )
                            .postedBalanceAmount(
                                PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                                    .LedgerEntryCreateRequest
                                    .PostedBalanceAmount
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from(0))
                                    .build()
                            )
                            .showResultingLedgerAccountBalances(true)
                            .build()
                    )
                    .description("description")
                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .externalId("external_id")
                    .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .ledgerableType(
                        PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                            .LedgerableType
                            .EXPECTED_PAYMENT
                    )
                    .metadata(
                        PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest.Metadata
                            .builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .status(
                        PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest.Status
                            .ARCHIVED
                    )
                    .build()
            )
            .metadata(
                PaymentOrderReversalCreateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PaymentOrderReversalCreateParams.builder()
                .paymentOrderId("payment_order_id")
                .reason(PaymentOrderReversalCreateParams.Reason.DUPLICATE)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("payment_order_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PaymentOrderReversalCreateParams.builder()
                .paymentOrderId("payment_order_id")
                .reason(PaymentOrderReversalCreateParams.Reason.DUPLICATE)
                .ledgerTransaction(
                    PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest.builder()
                        .addLedgerEntry(
                            PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                                .LedgerEntryCreateRequest
                                .builder()
                                .amount(0L)
                                .direction(TransactionDirection.CREDIT)
                                .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .availableBalanceAmount(
                                    PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                                        .LedgerEntryCreateRequest
                                        .AvailableBalanceAmount
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from(0))
                                        .build()
                                )
                                .lockVersion(0L)
                                .metadata(
                                    PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                                        .LedgerEntryCreateRequest
                                        .Metadata
                                        .builder()
                                        .putAdditionalProperty("key", JsonValue.from("value"))
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                        .build()
                                )
                                .pendingBalanceAmount(
                                    PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                                        .LedgerEntryCreateRequest
                                        .PendingBalanceAmount
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from(0))
                                        .build()
                                )
                                .postedBalanceAmount(
                                    PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                                        .LedgerEntryCreateRequest
                                        .PostedBalanceAmount
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from(0))
                                        .build()
                                )
                                .showResultingLedgerAccountBalances(true)
                                .build()
                        )
                        .description("description")
                        .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .effectiveDate(LocalDate.parse("2019-12-27"))
                        .externalId("external_id")
                        .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .ledgerableType(
                            PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                                .LedgerableType
                                .EXPECTED_PAYMENT
                        )
                        .metadata(
                            PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest.Metadata
                                .builder()
                                .putAdditionalProperty("key", JsonValue.from("value"))
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                .build()
                        )
                        .status(
                            PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest.Status
                                .ARCHIVED
                        )
                        .build()
                )
                .metadata(
                    PaymentOrderReversalCreateParams.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.reason()).isEqualTo(PaymentOrderReversalCreateParams.Reason.DUPLICATE)
        assertThat(body.ledgerTransaction())
            .contains(
                PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest.builder()
                    .addLedgerEntry(
                        PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                            .LedgerEntryCreateRequest
                            .builder()
                            .amount(0L)
                            .direction(TransactionDirection.CREDIT)
                            .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .availableBalanceAmount(
                                PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                                    .LedgerEntryCreateRequest
                                    .AvailableBalanceAmount
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from(0))
                                    .build()
                            )
                            .lockVersion(0L)
                            .metadata(
                                PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                                    .LedgerEntryCreateRequest
                                    .Metadata
                                    .builder()
                                    .putAdditionalProperty("key", JsonValue.from("value"))
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                    .build()
                            )
                            .pendingBalanceAmount(
                                PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                                    .LedgerEntryCreateRequest
                                    .PendingBalanceAmount
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from(0))
                                    .build()
                            )
                            .postedBalanceAmount(
                                PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                                    .LedgerEntryCreateRequest
                                    .PostedBalanceAmount
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from(0))
                                    .build()
                            )
                            .showResultingLedgerAccountBalances(true)
                            .build()
                    )
                    .description("description")
                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .externalId("external_id")
                    .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .ledgerableType(
                        PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                            .LedgerableType
                            .EXPECTED_PAYMENT
                    )
                    .metadata(
                        PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest.Metadata
                            .builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .status(
                        PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest.Status
                            .ARCHIVED
                    )
                    .build()
            )
        assertThat(body.metadata())
            .contains(
                PaymentOrderReversalCreateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PaymentOrderReversalCreateParams.builder()
                .paymentOrderId("payment_order_id")
                .reason(PaymentOrderReversalCreateParams.Reason.DUPLICATE)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.reason()).isEqualTo(PaymentOrderReversalCreateParams.Reason.DUPLICATE)
    }
}
