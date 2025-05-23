// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClientAsync
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.TransactionDirection
import com.moderntreasury.api.models.VirtualAccountCreateParams
import com.moderntreasury.api.models.VirtualAccountUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class VirtualAccountServiceAsyncTest {

    @Test
    fun create() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val virtualAccountServiceAsync = client.virtualAccounts()

        val virtualAccountFuture =
            virtualAccountServiceAsync.create(
                VirtualAccountCreateParams.builder()
                    .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .addAccountDetail(
                        VirtualAccountCreateParams.AccountDetailCreateRequest.builder()
                            .accountNumber("account_number")
                            .accountNumberType(
                                VirtualAccountCreateParams.AccountDetailCreateRequest
                                    .AccountNumberType
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
                                VirtualAccountCreateParams.LedgerAccountCreateRequest.Metadata
                                    .builder()
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
                                VirtualAccountCreateParams.RoutingDetailCreateRequest
                                    .RoutingNumberType
                                    .ABA
                            )
                            .paymentType(
                                VirtualAccountCreateParams.RoutingDetailCreateRequest.PaymentType
                                    .ACH
                            )
                            .build()
                    )
                    .build()
            )

        val virtualAccount = virtualAccountFuture.get()
        virtualAccount.validate()
    }

    @Test
    fun retrieve() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val virtualAccountServiceAsync = client.virtualAccounts()

        val virtualAccountFuture = virtualAccountServiceAsync.retrieve("id")

        val virtualAccount = virtualAccountFuture.get()
        virtualAccount.validate()
    }

    @Test
    fun update() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val virtualAccountServiceAsync = client.virtualAccounts()

        val virtualAccountFuture =
            virtualAccountServiceAsync.update(
                VirtualAccountUpdateParams.builder()
                    .id("id")
                    .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .metadata(
                        VirtualAccountUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("name")
                    .build()
            )

        val virtualAccount = virtualAccountFuture.get()
        virtualAccount.validate()
    }

    @Test
    fun list() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val virtualAccountServiceAsync = client.virtualAccounts()

        val pageFuture = virtualAccountServiceAsync.list()

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }

    @Test
    fun delete() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val virtualAccountServiceAsync = client.virtualAccounts()

        val virtualAccountFuture = virtualAccountServiceAsync.delete("id")

        val virtualAccount = virtualAccountFuture.get()
        virtualAccount.validate()
    }
}
