// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClientAsync
import com.moderntreasury.api.models.AccountCollectionFlowCreateRequest
import com.moderntreasury.api.models.EmbeddableFlowCreateParams
import com.moderntreasury.api.models.EmbeddableFlowUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EmbeddableFlowServiceAsyncTest {

    @Test
    fun create() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val embeddableFlowServiceAsync = client.embeddableFlows()

        val embeddableFlowFuture =
            embeddableFlowServiceAsync.create(
                EmbeddableFlowCreateParams.builder()
                    .options(
                        AccountCollectionFlowCreateRequest.builder()
                            .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .addPaymentType("string")
                            .addReceivingCountry(
                                AccountCollectionFlowCreateRequest.ReceivingCountry.USA
                            )
                            .build()
                    )
                    .template(EmbeddableFlowCreateParams.Template.LEGAL_ENTITY_ONBOARDING)
                    .build()
            )

        val embeddableFlow = embeddableFlowFuture.get()
        embeddableFlow.validate()
    }

    @Test
    fun retrieve() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val embeddableFlowServiceAsync = client.embeddableFlows()

        val embeddableFlowFuture = embeddableFlowServiceAsync.retrieve("id")

        val embeddableFlow = embeddableFlowFuture.get()
        embeddableFlow.validate()
    }

    @Test
    fun update() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val embeddableFlowServiceAsync = client.embeddableFlows()

        val embeddableFlowFuture =
            embeddableFlowServiceAsync.update(
                EmbeddableFlowUpdateParams.builder()
                    .id("id")
                    .status(EmbeddableFlowUpdateParams.Status.CANCELLED)
                    .build()
            )

        val embeddableFlow = embeddableFlowFuture.get()
        embeddableFlow.validate()
    }

    @Test
    fun list() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val embeddableFlowServiceAsync = client.embeddableFlows()

        val pageFuture = embeddableFlowServiceAsync.list()

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }
}
