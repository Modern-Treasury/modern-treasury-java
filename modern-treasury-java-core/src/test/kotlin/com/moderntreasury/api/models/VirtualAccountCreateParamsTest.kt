// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VirtualAccountCreateParamsTest {

    @Test
    fun create() {
        VirtualAccountCreateParams.builder()
            .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .name("name")
            .addAccountDetail(
                VirtualAccountCreateParams.AccountDetailCreateRequest.builder()
                    .accountNumber("account_number")
                    .accountNumberType(
                        VirtualAccountCreateParams.AccountDetailCreateRequest.AccountNumberType
                            .AU_NUMBER
                    )
                    .build()
            )
            .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .creditLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .debitLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .description("description")
            .ledgerAccount(
                VirtualAccountCreateParams.LedgerAccountCreateRequest.builder()
                    .currency("currency")
                    .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .normalBalance(TransactionDirection.CREDIT)
                    .currencyExponent(0L)
                    .description("description")
                    .addLedgerAccountCategoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .ledgerableType(
                        VirtualAccountCreateParams.LedgerAccountCreateRequest.LedgerableType
                            .COUNTERPARTY
                    )
                    .metadata(
                        VirtualAccountCreateParams.LedgerAccountCreateRequest.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .build()
            )
            .metadata(
                VirtualAccountCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .addRoutingDetail(
                VirtualAccountCreateParams.RoutingDetailCreateRequest.builder()
                    .routingNumber("routing_number")
                    .routingNumberType(
                        VirtualAccountCreateParams.RoutingDetailCreateRequest.RoutingNumberType.ABA
                    )
                    .paymentType(
                        VirtualAccountCreateParams.RoutingDetailCreateRequest.PaymentType.ACH
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            VirtualAccountCreateParams.builder()
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .addAccountDetail(
                    VirtualAccountCreateParams.AccountDetailCreateRequest.builder()
                        .accountNumber("account_number")
                        .accountNumberType(
                            VirtualAccountCreateParams.AccountDetailCreateRequest.AccountNumberType
                                .AU_NUMBER
                        )
                        .build()
                )
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .creditLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .debitLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .ledgerAccount(
                    VirtualAccountCreateParams.LedgerAccountCreateRequest.builder()
                        .currency("currency")
                        .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .normalBalance(TransactionDirection.CREDIT)
                        .currencyExponent(0L)
                        .description("description")
                        .addLedgerAccountCategoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .ledgerableType(
                            VirtualAccountCreateParams.LedgerAccountCreateRequest.LedgerableType
                                .COUNTERPARTY
                        )
                        .metadata(
                            VirtualAccountCreateParams.LedgerAccountCreateRequest.Metadata.builder()
                                .putAdditionalProperty("key", JsonValue.from("value"))
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                .build()
                        )
                        .build()
                )
                .metadata(
                    VirtualAccountCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .addRoutingDetail(
                    VirtualAccountCreateParams.RoutingDetailCreateRequest.builder()
                        .routingNumber("routing_number")
                        .routingNumberType(
                            VirtualAccountCreateParams.RoutingDetailCreateRequest.RoutingNumberType
                                .ABA
                        )
                        .paymentType(
                            VirtualAccountCreateParams.RoutingDetailCreateRequest.PaymentType.ACH
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.internalAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.accountDetails().getOrNull())
            .containsExactly(
                VirtualAccountCreateParams.AccountDetailCreateRequest.builder()
                    .accountNumber("account_number")
                    .accountNumberType(
                        VirtualAccountCreateParams.AccountDetailCreateRequest.AccountNumberType
                            .AU_NUMBER
                    )
                    .build()
            )
        assertThat(body.counterpartyId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.creditLedgerAccountId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.debitLedgerAccountId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.description()).contains("description")
        assertThat(body.ledgerAccount())
            .contains(
                VirtualAccountCreateParams.LedgerAccountCreateRequest.builder()
                    .currency("currency")
                    .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .normalBalance(TransactionDirection.CREDIT)
                    .currencyExponent(0L)
                    .description("description")
                    .addLedgerAccountCategoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .ledgerableType(
                        VirtualAccountCreateParams.LedgerAccountCreateRequest.LedgerableType
                            .COUNTERPARTY
                    )
                    .metadata(
                        VirtualAccountCreateParams.LedgerAccountCreateRequest.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .build()
            )
        assertThat(body.metadata())
            .contains(
                VirtualAccountCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.routingDetails().getOrNull())
            .containsExactly(
                VirtualAccountCreateParams.RoutingDetailCreateRequest.builder()
                    .routingNumber("routing_number")
                    .routingNumberType(
                        VirtualAccountCreateParams.RoutingDetailCreateRequest.RoutingNumberType.ABA
                    )
                    .paymentType(
                        VirtualAccountCreateParams.RoutingDetailCreateRequest.PaymentType.ACH
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            VirtualAccountCreateParams.builder()
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .build()

        val body = params._body()

        assertThat(body.internalAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.name()).isEqualTo("name")
    }
}
