// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InternalAccountUpdateParamsTest {

    @Test
    fun create() {
        InternalAccountUpdateParams.builder()
            .id("id")
            .contraLedgerAccountId("contra_ledger_account_id")
            .counterpartyId("counterparty_id")
            .externalId("external_id")
            .ledgerAccountId("ledger_account_id")
            .metadata(
                InternalAccountUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .name("name")
            .parentAccountId("parent_account_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params = InternalAccountUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            InternalAccountUpdateParams.builder()
                .id("id")
                .contraLedgerAccountId("contra_ledger_account_id")
                .counterpartyId("counterparty_id")
                .externalId("external_id")
                .ledgerAccountId("ledger_account_id")
                .metadata(
                    InternalAccountUpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .name("name")
                .parentAccountId("parent_account_id")
                .build()

        val body = params._body()

        assertThat(body.contraLedgerAccountId()).contains("contra_ledger_account_id")
        assertThat(body.counterpartyId()).contains("counterparty_id")
        assertThat(body.externalId()).contains("external_id")
        assertThat(body.ledgerAccountId()).contains("ledger_account_id")
        assertThat(body.metadata())
            .contains(
                InternalAccountUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.name()).contains("name")
        assertThat(body.parentAccountId()).contains("parent_account_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = InternalAccountUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
