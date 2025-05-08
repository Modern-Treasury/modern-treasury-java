// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClientAsync
import com.moderntreasury.api.models.AccountCollectionFlowCreateParams
import com.moderntreasury.api.models.AccountCollectionFlowUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AccountCollectionFlowServiceAsyncTest {

    @Test
    fun create() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val accountCollectionFlowServiceAsync = client.accountCollectionFlows()

        val accountCollectionFlowFuture =
            accountCollectionFlowServiceAsync.create(
                AccountCollectionFlowCreateParams.builder()
                    .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addPaymentType("string")
                    .addReceivingCountry(AccountCollectionFlowCreateParams.ReceivingCountry.USA)
                    .build()
            )

        val accountCollectionFlow = accountCollectionFlowFuture.get()
        accountCollectionFlow.validate()
    }

    @Test
    fun retrieve() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val accountCollectionFlowServiceAsync = client.accountCollectionFlows()

        val accountCollectionFlowFuture = accountCollectionFlowServiceAsync.retrieve("id")

        val accountCollectionFlow = accountCollectionFlowFuture.get()
        accountCollectionFlow.validate()
    }

    @Test
    fun update() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val accountCollectionFlowServiceAsync = client.accountCollectionFlows()

        val accountCollectionFlowFuture =
            accountCollectionFlowServiceAsync.update(
                AccountCollectionFlowUpdateParams.builder()
                    .id("id")
                    .status(AccountCollectionFlowUpdateParams.Status.CANCELLED)
                    .build()
            )

        val accountCollectionFlow = accountCollectionFlowFuture.get()
        accountCollectionFlow.validate()
    }

    @Test
    fun list() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val accountCollectionFlowServiceAsync = client.accountCollectionFlows()

        val pageFuture = accountCollectionFlowServiceAsync.list()

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }
}
