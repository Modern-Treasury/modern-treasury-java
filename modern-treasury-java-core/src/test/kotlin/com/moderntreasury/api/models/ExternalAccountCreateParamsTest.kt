// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalAccountCreateParamsTest {

    @Test
    fun create() {
        ExternalAccountCreateParams.builder()
            .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addAccountDetail(
                ExternalAccountCreateParams.AccountDetail.builder()
                    .accountNumber("account_number")
                    .accountNumberType(
                        ExternalAccountCreateParams.AccountDetail.AccountNumberType.AU_NUMBER
                    )
                    .build()
            )
            .accountType(ExternalAccountType.BASE_WALLET)
            .addContactDetail(
                ExternalAccountCreateParams.ContactDetailCreateRequest.builder()
                    .contactIdentifier("contact_identifier")
                    .contactIdentifierType(
                        ExternalAccountCreateParams.ContactDetailCreateRequest.ContactIdentifierType
                            .EMAIL
                    )
                    .build()
            )
            .ledgerAccount(
                ExternalAccountCreateParams.LedgerAccountCreateRequest.builder()
                    .currency("currency")
                    .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .normalBalance(TransactionDirection.CREDIT)
                    .currencyExponent(0L)
                    .description("description")
                    .addLedgerAccountCategoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .ledgerableType(
                        ExternalAccountCreateParams.LedgerAccountCreateRequest.LedgerableType
                            .COUNTERPARTY
                    )
                    .metadata(
                        ExternalAccountCreateParams.LedgerAccountCreateRequest.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .build()
            )
            .metadata(
                ExternalAccountCreateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
            .name("name")
            .partyAddress(
                ExternalAccountCreateParams.AddressRequest.builder()
                    .country("country")
                    .line1("line1")
                    .line2("line2")
                    .locality("locality")
                    .postalCode("postal_code")
                    .region("region")
                    .build()
            )
            .partyIdentifier("party_identifier")
            .partyName("party_name")
            .partyType(ExternalAccountCreateParams.PartyType.BUSINESS)
            .plaidProcessorToken("plaid_processor_token")
            .addRoutingDetail(
                ExternalAccountCreateParams.RoutingDetail.builder()
                    .routingNumber("routing_number")
                    .routingNumberType(
                        ExternalAccountCreateParams.RoutingDetail.RoutingNumberType.ABA
                    )
                    .paymentType(ExternalAccountCreateParams.RoutingDetail.PaymentType.ACH)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            ExternalAccountCreateParams.builder()
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addAccountDetail(
                    ExternalAccountCreateParams.AccountDetail.builder()
                        .accountNumber("account_number")
                        .accountNumberType(
                            ExternalAccountCreateParams.AccountDetail.AccountNumberType.AU_NUMBER
                        )
                        .build()
                )
                .accountType(ExternalAccountType.BASE_WALLET)
                .addContactDetail(
                    ExternalAccountCreateParams.ContactDetailCreateRequest.builder()
                        .contactIdentifier("contact_identifier")
                        .contactIdentifierType(
                            ExternalAccountCreateParams.ContactDetailCreateRequest
                                .ContactIdentifierType
                                .EMAIL
                        )
                        .build()
                )
                .ledgerAccount(
                    ExternalAccountCreateParams.LedgerAccountCreateRequest.builder()
                        .currency("currency")
                        .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .normalBalance(TransactionDirection.CREDIT)
                        .currencyExponent(0L)
                        .description("description")
                        .addLedgerAccountCategoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .ledgerableType(
                            ExternalAccountCreateParams.LedgerAccountCreateRequest.LedgerableType
                                .COUNTERPARTY
                        )
                        .metadata(
                            ExternalAccountCreateParams.LedgerAccountCreateRequest.Metadata
                                .builder()
                                .putAdditionalProperty("key", JsonValue.from("value"))
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                .build()
                        )
                        .build()
                )
                .metadata(
                    ExternalAccountCreateParams.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .name("name")
                .partyAddress(
                    ExternalAccountCreateParams.AddressRequest.builder()
                        .country("country")
                        .line1("line1")
                        .line2("line2")
                        .locality("locality")
                        .postalCode("postal_code")
                        .region("region")
                        .build()
                )
                .partyIdentifier("party_identifier")
                .partyName("party_name")
                .partyType(ExternalAccountCreateParams.PartyType.BUSINESS)
                .plaidProcessorToken("plaid_processor_token")
                .addRoutingDetail(
                    ExternalAccountCreateParams.RoutingDetail.builder()
                        .routingNumber("routing_number")
                        .routingNumberType(
                            ExternalAccountCreateParams.RoutingDetail.RoutingNumberType.ABA
                        )
                        .paymentType(ExternalAccountCreateParams.RoutingDetail.PaymentType.ACH)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.counterpartyId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.accountDetails().getOrNull())
            .containsExactly(
                ExternalAccountCreateParams.AccountDetail.builder()
                    .accountNumber("account_number")
                    .accountNumberType(
                        ExternalAccountCreateParams.AccountDetail.AccountNumberType.AU_NUMBER
                    )
                    .build()
            )
        assertThat(body.accountType()).contains(ExternalAccountType.BASE_WALLET)
        assertThat(body.contactDetails().getOrNull())
            .containsExactly(
                ExternalAccountCreateParams.ContactDetailCreateRequest.builder()
                    .contactIdentifier("contact_identifier")
                    .contactIdentifierType(
                        ExternalAccountCreateParams.ContactDetailCreateRequest.ContactIdentifierType
                            .EMAIL
                    )
                    .build()
            )
        assertThat(body.ledgerAccount())
            .contains(
                ExternalAccountCreateParams.LedgerAccountCreateRequest.builder()
                    .currency("currency")
                    .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .normalBalance(TransactionDirection.CREDIT)
                    .currencyExponent(0L)
                    .description("description")
                    .addLedgerAccountCategoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .ledgerableType(
                        ExternalAccountCreateParams.LedgerAccountCreateRequest.LedgerableType
                            .COUNTERPARTY
                    )
                    .metadata(
                        ExternalAccountCreateParams.LedgerAccountCreateRequest.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .build()
            )
        assertThat(body.metadata())
            .contains(
                ExternalAccountCreateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(body.name()).contains("name")
        assertThat(body.partyAddress())
            .contains(
                ExternalAccountCreateParams.AddressRequest.builder()
                    .country("country")
                    .line1("line1")
                    .line2("line2")
                    .locality("locality")
                    .postalCode("postal_code")
                    .region("region")
                    .build()
            )
        assertThat(body.partyIdentifier()).contains("party_identifier")
        assertThat(body.partyName()).contains("party_name")
        assertThat(body.partyType()).contains(ExternalAccountCreateParams.PartyType.BUSINESS)
        assertThat(body.plaidProcessorToken()).contains("plaid_processor_token")
        assertThat(body.routingDetails().getOrNull())
            .containsExactly(
                ExternalAccountCreateParams.RoutingDetail.builder()
                    .routingNumber("routing_number")
                    .routingNumberType(
                        ExternalAccountCreateParams.RoutingDetail.RoutingNumberType.ABA
                    )
                    .paymentType(ExternalAccountCreateParams.RoutingDetail.PaymentType.ACH)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExternalAccountCreateParams.builder()
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertThat(body.counterpartyId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
