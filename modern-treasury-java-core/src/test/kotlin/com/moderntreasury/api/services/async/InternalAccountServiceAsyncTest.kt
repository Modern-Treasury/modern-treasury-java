// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClientAsync
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.InternalAccountCreateParams
import com.moderntreasury.api.models.InternalAccountUpdateAccountCapabilityParams
import com.moderntreasury.api.models.InternalAccountUpdateParams
import com.moderntreasury.api.models.TransactionDirection
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InternalAccountServiceAsyncTest {

    @Test
    fun create() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val internalAccountServiceAsync = client.internalAccounts()

        val internalAccountFuture =
            internalAccountServiceAsync.create(
                InternalAccountCreateParams.builder()
                    .connectionId("connection_id")
                    .currency(InternalAccountCreateParams.Currency.USD)
                    .name("name")
                    .partyName("party_name")
                    .addAccountCapability(
                        InternalAccountCreateParams.AccountCapability.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .direction(TransactionDirection.CREDIT)
                            .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .identifier("identifier")
                            .liveMode(true)
                            .object_("object")
                            .paymentType(
                                InternalAccountCreateParams.AccountCapability.PaymentType.ACH
                            )
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
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
            )

        val internalAccount = internalAccountFuture.get()
        internalAccount.validate()
    }

    @Test
    fun retrieve() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val internalAccountServiceAsync = client.internalAccounts()

        val internalAccountFuture = internalAccountServiceAsync.retrieve("id")

        val internalAccount = internalAccountFuture.get()
        internalAccount.validate()
    }

    @Test
    fun update() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val internalAccountServiceAsync = client.internalAccounts()

        val internalAccountFuture =
            internalAccountServiceAsync.update(
                InternalAccountUpdateParams.builder()
                    .id("id")
                    .contraLedgerAccountId("contra_ledger_account_id")
                    .counterpartyId("counterparty_id")
                    .ledgerAccountId("ledger_account_id")
                    .metadata(
                        InternalAccountUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("name")
                    .parentAccountId("parent_account_id")
                    .build()
            )

        val internalAccount = internalAccountFuture.get()
        internalAccount.validate()
    }

    @Test
    fun list() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val internalAccountServiceAsync = client.internalAccounts()

        val pageFuture = internalAccountServiceAsync.list()

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }

    @Test
    fun requestClosure() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val internalAccountServiceAsync = client.internalAccounts()

        val internalAccountFuture = internalAccountServiceAsync.requestClosure("id")

        val internalAccount = internalAccountFuture.get()
        internalAccount.validate()
    }

    @Test
    fun updateAccountCapability() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val internalAccountServiceAsync = client.internalAccounts()

        val responseFuture =
            internalAccountServiceAsync.updateAccountCapability(
                InternalAccountUpdateAccountCapabilityParams.builder()
                    .internalAccountId("internal_account_id")
                    .id("id")
                    .identifier("identifier")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
