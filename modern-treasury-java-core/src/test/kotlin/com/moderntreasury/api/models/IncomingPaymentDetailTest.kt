// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IncomingPaymentDetailTest {

    @Test
    fun createIncomingPaymentDetail() {
        val incomingPaymentDetail =
            IncomingPaymentDetail.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(123L)
                .asOfDate(LocalDate.parse("2019-12-27"))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Currency.AED)
                .data(IncomingPaymentDetail.Data.builder().build())
                .direction(TransactionDirection.CREDIT)
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .liveMode(true)
                .metadata(IncomingPaymentDetail.Metadata.builder().build())
                .object_("string")
                .originatingAccountNumberSafe("string")
                .originatingAccountNumberType(
                    IncomingPaymentDetail.OriginatingAccountNumberType.CLABE
                )
                .originatingRoutingNumber("string")
                .originatingRoutingNumberType(
                    IncomingPaymentDetail.OriginatingRoutingNumberType.ABA
                )
                .status(IncomingPaymentDetail.Status.COMPLETED)
                .transactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .transactionLineItemId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .type(IncomingPaymentDetail.Type.ACH)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .vendorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .virtualAccount(
                    VirtualAccount.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .accountDetails(
                            listOf(
                                AccountDetail.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .accountNumberSafe("string")
                                    .accountNumberType(AccountDetail.AccountNumberType.CLABE)
                                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .liveMode(true)
                                    .object_("string")
                                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .accountNumber("string")
                                    .build()
                            )
                        )
                        .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .creditLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .debitLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .description("string")
                        .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .liveMode(true)
                        .metadata(VirtualAccount.Metadata.builder().build())
                        .name("string")
                        .object_("string")
                        .routingDetails(
                            listOf(
                                RoutingDetail.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .bankAddress(
                                        RoutingDetail.Address.builder()
                                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                            .country("string")
                                            .createdAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .line1("string")
                                            .line2("string")
                                            .liveMode(true)
                                            .locality("string")
                                            .object_("string")
                                            .postalCode("string")
                                            .region("string")
                                            .updatedAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .build()
                                    )
                                    .bankName("string")
                                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .liveMode(true)
                                    .object_("string")
                                    .paymentType(RoutingDetail.PaymentType.ACH)
                                    .routingNumber("string")
                                    .routingNumberType(RoutingDetail.RoutingNumberType.ABA)
                                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .virtualAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .originatingAccountNumber("string")
                .build()
        assertThat(incomingPaymentDetail).isNotNull
        assertThat(incomingPaymentDetail.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(incomingPaymentDetail.amount()).isEqualTo(123L)
        assertThat(incomingPaymentDetail.asOfDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(incomingPaymentDetail.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(incomingPaymentDetail.currency()).isEqualTo(Currency.AED)
        assertThat(incomingPaymentDetail.data())
            .isEqualTo(IncomingPaymentDetail.Data.builder().build())
        assertThat(incomingPaymentDetail.direction()).isEqualTo(TransactionDirection.CREDIT)
        assertThat(incomingPaymentDetail.internalAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(incomingPaymentDetail.ledgerTransactionId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(incomingPaymentDetail.liveMode()).isEqualTo(true)
        assertThat(incomingPaymentDetail.metadata())
            .isEqualTo(IncomingPaymentDetail.Metadata.builder().build())
        assertThat(incomingPaymentDetail.object_()).isEqualTo("string")
        assertThat(incomingPaymentDetail.originatingAccountNumberSafe()).contains("string")
        assertThat(incomingPaymentDetail.originatingAccountNumberType())
            .contains(IncomingPaymentDetail.OriginatingAccountNumberType.CLABE)
        assertThat(incomingPaymentDetail.originatingRoutingNumber()).contains("string")
        assertThat(incomingPaymentDetail.originatingRoutingNumberType())
            .contains(IncomingPaymentDetail.OriginatingRoutingNumberType.ABA)
        assertThat(incomingPaymentDetail.status()).isEqualTo(IncomingPaymentDetail.Status.COMPLETED)
        assertThat(incomingPaymentDetail.transactionId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(incomingPaymentDetail.transactionLineItemId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(incomingPaymentDetail.type()).isEqualTo(IncomingPaymentDetail.Type.ACH)
        assertThat(incomingPaymentDetail.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(incomingPaymentDetail.vendorId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(incomingPaymentDetail.virtualAccount())
            .contains(
                VirtualAccount.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountDetails(
                        listOf(
                            AccountDetail.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .accountNumberSafe("string")
                                .accountNumberType(AccountDetail.AccountNumberType.CLABE)
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .liveMode(true)
                                .object_("string")
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .accountNumber("string")
                                .build()
                        )
                    )
                    .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .debitLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("string")
                    .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .liveMode(true)
                    .metadata(VirtualAccount.Metadata.builder().build())
                    .name("string")
                    .object_("string")
                    .routingDetails(
                        listOf(
                            RoutingDetail.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .bankAddress(
                                    RoutingDetail.Address.builder()
                                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .country("string")
                                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .line1("string")
                                        .line2("string")
                                        .liveMode(true)
                                        .locality("string")
                                        .object_("string")
                                        .postalCode("string")
                                        .region("string")
                                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .build()
                                )
                                .bankName("string")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .liveMode(true)
                                .object_("string")
                                .paymentType(RoutingDetail.PaymentType.ACH)
                                .routingNumber("string")
                                .routingNumberType(RoutingDetail.RoutingNumberType.ABA)
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                    )
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(incomingPaymentDetail.virtualAccountId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(incomingPaymentDetail.originatingAccountNumber()).contains("string")
    }
}
