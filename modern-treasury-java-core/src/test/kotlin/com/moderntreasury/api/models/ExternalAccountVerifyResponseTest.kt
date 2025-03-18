// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalAccountVerifyResponseTest {

    @Test
    fun ofExternalAccount() {
        val externalAccount =
            ExternalAccount.builder()
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
                        .build()
                )
                .accountType(ExternalAccountType.CASH)
                .addContactDetail(
                    ExternalAccount.ContactDetail.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .contactIdentifier("contact_identifier")
                        .contactIdentifierType(
                            ExternalAccount.ContactDetail.ContactIdentifierType.EMAIL
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .liveMode(true)
                        .object_("object")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .liveMode(true)
                .metadata(
                    ExternalAccount.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .name("name")
                .object_("object")
                .partyAddress(
                    ExternalAccount.Address.builder()
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
                .partyType(ExternalAccount.PartyType.BUSINESS)
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
                .verificationSource(ExternalAccount.VerificationSource.ACH_PRENOTE)
                .verificationStatus(ExternalAccount.VerificationStatus.PENDING_VERIFICATION)
                .build()

        val externalAccountVerifyResponse =
            ExternalAccountVerifyResponse.ofExternalAccount(externalAccount)

        assertThat(externalAccountVerifyResponse.externalAccount()).contains(externalAccount)
        assertThat(externalAccountVerifyResponse.verificationAttempt()).isEmpty
    }

    @Test
    fun ofVerificationAttempt() {
        val verificationAttempt =
            ExternalAccountVerifyResponse.ExternalAccountVerificationAttempt.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .liveMode(true)
                .object_("object")
                .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .paymentType(
                    ExternalAccountVerifyResponse.ExternalAccountVerificationAttempt.PaymentType.ACH
                )
                .priority(
                    ExternalAccountVerifyResponse.ExternalAccountVerificationAttempt.Priority.HIGH
                )
                .status(
                    ExternalAccountVerifyResponse.ExternalAccountVerificationAttempt.Status
                        .CANCELLED
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val externalAccountVerifyResponse =
            ExternalAccountVerifyResponse.ofVerificationAttempt(verificationAttempt)

        assertThat(externalAccountVerifyResponse.externalAccount()).isEmpty
        assertThat(externalAccountVerifyResponse.verificationAttempt())
            .contains(verificationAttempt)
    }
}
