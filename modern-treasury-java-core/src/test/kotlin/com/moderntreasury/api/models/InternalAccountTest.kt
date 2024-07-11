// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InternalAccountTest {

    @Test
    fun createInternalAccount() {
        val internalAccount =
            InternalAccount.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountDetails(
                    listOf(
                        AccountDetail.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .accountNumberSafe("account_number_safe")
                            .accountNumberType(AccountDetail.AccountNumberType.AU_NUMBER)
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .liveMode(true)
                            .object_("object")
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .accountNumber("account_number")
                            .build()
                    )
                )
                .accountType(InternalAccount.AccountType.CASH)
                .connection(
                    Connection.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .liveMode(true)
                        .object_("object")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .vendorCustomerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .vendorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .vendorName("vendor_name")
                        .build()
                )
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Currency.AED)
                .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .legalEntityId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .liveMode(true)
                .metadata(InternalAccount.Metadata.builder().build())
                .name("name")
                .object_("object")
                .parentAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .partyAddress(
                    InternalAccount.Address.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .country("country")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .line1("line1")
                        .line2("line2")
                        .liveMode(true)
                        .locality("locality")
                        .object_("object")
                        .postalCode("postal_code")
                        .region("region")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .partyName("party_name")
                .partyType(InternalAccount.PartyType.BUSINESS)
                .routingDetails(
                    listOf(
                        RoutingDetail.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .bankAddress(
                                RoutingDetail.Address.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .country("country")
                                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .line1("line1")
                                    .line2("line2")
                                    .liveMode(true)
                                    .locality("locality")
                                    .object_("object")
                                    .postalCode("postal_code")
                                    .region("region")
                                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                            .bankName("bank_name")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .liveMode(true)
                            .object_("object")
                            .paymentType(RoutingDetail.PaymentType.ACH)
                            .routingNumber("routing_number")
                            .routingNumberType(RoutingDetail.RoutingNumberType.ABA)
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(internalAccount).isNotNull
        assertThat(internalAccount.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(internalAccount.accountDetails())
            .containsExactly(
                AccountDetail.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountNumberSafe("account_number_safe")
                    .accountNumberType(AccountDetail.AccountNumberType.AU_NUMBER)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .liveMode(true)
                    .object_("object")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .accountNumber("account_number")
                    .build()
            )
        assertThat(internalAccount.accountType()).contains(InternalAccount.AccountType.CASH)
        assertThat(internalAccount.connection())
            .isEqualTo(
                Connection.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .liveMode(true)
                    .object_("object")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .vendorCustomerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .vendorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .vendorName("vendor_name")
                    .build()
            )
        assertThat(internalAccount.counterpartyId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(internalAccount.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(internalAccount.currency()).isEqualTo(Currency.AED)
        assertThat(internalAccount.ledgerAccountId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(internalAccount.legalEntityId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(internalAccount.liveMode()).isEqualTo(true)
        assertThat(internalAccount.metadata()).isEqualTo(InternalAccount.Metadata.builder().build())
        assertThat(internalAccount.name()).contains("name")
        assertThat(internalAccount.object_()).isEqualTo("object")
        assertThat(internalAccount.parentAccountId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(internalAccount.partyAddress())
            .contains(
                InternalAccount.Address.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .country("country")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .line1("line1")
                    .line2("line2")
                    .liveMode(true)
                    .locality("locality")
                    .object_("object")
                    .postalCode("postal_code")
                    .region("region")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(internalAccount.partyName()).isEqualTo("party_name")
        assertThat(internalAccount.partyType()).contains(InternalAccount.PartyType.BUSINESS)
        assertThat(internalAccount.routingDetails())
            .containsExactly(
                RoutingDetail.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .bankAddress(
                        RoutingDetail.Address.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .country("country")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .line1("line1")
                            .line2("line2")
                            .liveMode(true)
                            .locality("locality")
                            .object_("object")
                            .postalCode("postal_code")
                            .region("region")
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .bankName("bank_name")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .liveMode(true)
                    .object_("object")
                    .paymentType(RoutingDetail.PaymentType.ACH)
                    .routingNumber("routing_number")
                    .routingNumberType(RoutingDetail.RoutingNumberType.ABA)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(internalAccount.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
