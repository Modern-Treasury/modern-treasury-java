// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InternalAccountCreateParamsTest {

    @Test
    fun create() {
        InternalAccountCreateParams.builder()
            .connectionId("connection_id")
            .currency(InternalAccountCreateParams.Currency.USD)
            .name("name")
            .partyName("party_name")
            .accountType(InternalAccountCreateParams.AccountType.CHECKING)
            .counterpartyId("counterparty_id")
            .legalEntityId("legal_entity_id")
            .parentAccountId("parent_account_id")
            .partyAddress(
                InternalAccountCreateParams.PartyAddress.builder()
                    .country("country")
                    .line1("line1")
                    .locality("locality")
                    .postalCode("postal_code")
                    .region("region")
                    .line2("line2")
                    .build()
            )
            .vendorAttributes(
                InternalAccountCreateParams.VendorAttributes.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            InternalAccountCreateParams.builder()
                .connectionId("connection_id")
                .currency(InternalAccountCreateParams.Currency.USD)
                .name("name")
                .partyName("party_name")
                .accountType(InternalAccountCreateParams.AccountType.CHECKING)
                .counterpartyId("counterparty_id")
                .legalEntityId("legal_entity_id")
                .parentAccountId("parent_account_id")
                .partyAddress(
                    InternalAccountCreateParams.PartyAddress.builder()
                        .country("country")
                        .line1("line1")
                        .locality("locality")
                        .postalCode("postal_code")
                        .region("region")
                        .line2("line2")
                        .build()
                )
                .vendorAttributes(
                    InternalAccountCreateParams.VendorAttributes.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.connectionId()).isEqualTo("connection_id")
        assertThat(body.currency()).isEqualTo(InternalAccountCreateParams.Currency.USD)
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.partyName()).isEqualTo("party_name")
        assertThat(body.accountType()).contains(InternalAccountCreateParams.AccountType.CHECKING)
        assertThat(body.counterpartyId()).contains("counterparty_id")
        assertThat(body.legalEntityId()).contains("legal_entity_id")
        assertThat(body.parentAccountId()).contains("parent_account_id")
        assertThat(body.partyAddress())
            .contains(
                InternalAccountCreateParams.PartyAddress.builder()
                    .country("country")
                    .line1("line1")
                    .locality("locality")
                    .postalCode("postal_code")
                    .region("region")
                    .line2("line2")
                    .build()
            )
        assertThat(body.vendorAttributes())
            .contains(
                InternalAccountCreateParams.VendorAttributes.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InternalAccountCreateParams.builder()
                .connectionId("connection_id")
                .currency(InternalAccountCreateParams.Currency.USD)
                .name("name")
                .partyName("party_name")
                .build()

        val body = params._body()

        assertThat(body.connectionId()).isEqualTo("connection_id")
        assertThat(body.currency()).isEqualTo(InternalAccountCreateParams.Currency.USD)
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.partyName()).isEqualTo("party_name")
    }
}
