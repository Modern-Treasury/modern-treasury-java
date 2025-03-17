// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CounterpartyTest {

    @Test
    fun createCounterparty() {
        val counterparty =
            Counterparty.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addAccount(
                    Counterparty.Account.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addAccountDetail(
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
                        .accountType(ExternalAccountType.CASH)
                        .addContactDetail(
                            Counterparty.Account.ContactDetail.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .contactIdentifier("contact_identifier")
                                .contactIdentifierType(
                                    Counterparty.Account.ContactDetail.ContactIdentifierType.EMAIL
                                )
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .liveMode(true)
                                .object_("object")
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .liveMode(true)
                        .metadata(
                            Counterparty.Account.Metadata.builder()
                                .putAdditionalProperty("key", JsonValue.from("value"))
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                .build()
                        )
                        .name("name")
                        .object_("object")
                        .partyAddress(
                            Counterparty.Account.Address.builder()
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
                        .partyType(Counterparty.Account.PartyType.BUSINESS)
                        .addRoutingDetail(
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
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .verificationSource(Counterparty.Account.VerificationSource.ACH_PRENOTE)
                        .verificationStatus(
                            Counterparty.Account.VerificationStatus.PENDING_VERIFICATION
                        )
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .email("dev@stainless.com")
                .legalEntityId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .liveMode(true)
                .metadata(
                    Counterparty.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .name("name")
                .object_("object")
                .sendRemittanceAdvice(true)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .verificationStatus(Counterparty.VerificationStatus.DENIED)
                .build()
        assertThat(counterparty).isNotNull
        assertThat(counterparty.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(counterparty.accounts())
            .containsExactly(
                Counterparty.Account.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addAccountDetail(
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
                    .accountType(ExternalAccountType.CASH)
                    .addContactDetail(
                        Counterparty.Account.ContactDetail.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .contactIdentifier("contact_identifier")
                            .contactIdentifierType(
                                Counterparty.Account.ContactDetail.ContactIdentifierType.EMAIL
                            )
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .liveMode(true)
                            .object_("object")
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .liveMode(true)
                    .metadata(
                        Counterparty.Account.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .name("name")
                    .object_("object")
                    .partyAddress(
                        Counterparty.Account.Address.builder()
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
                    .partyType(Counterparty.Account.PartyType.BUSINESS)
                    .addRoutingDetail(
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
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .verificationSource(Counterparty.Account.VerificationSource.ACH_PRENOTE)
                    .verificationStatus(
                        Counterparty.Account.VerificationStatus.PENDING_VERIFICATION
                    )
                    .build()
            )
        assertThat(counterparty.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(counterparty.discardedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(counterparty.email()).contains("dev@stainless.com")
        assertThat(counterparty.legalEntityId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(counterparty.liveMode()).isEqualTo(true)
        assertThat(counterparty.metadata())
            .isEqualTo(
                Counterparty.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(counterparty.name()).contains("name")
        assertThat(counterparty.object_()).isEqualTo("object")
        assertThat(counterparty.sendRemittanceAdvice()).isEqualTo(true)
        assertThat(counterparty.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(counterparty.verificationStatus())
            .isEqualTo(Counterparty.VerificationStatus.DENIED)
    }
}
