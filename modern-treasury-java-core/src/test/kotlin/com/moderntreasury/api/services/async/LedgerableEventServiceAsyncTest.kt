// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClientAsync
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.LedgerableEventCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LedgerableEventServiceAsyncTest {

    @Test
    fun create() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerableEventServiceAsync = client.ledgerableEvents()

        val ledgerableEventFuture =
            ledgerableEventServiceAsync.create(
                LedgerableEventCreateParams.builder()
                    .name("name")
                    .customData(JsonValue.from(mapOf<String, Any>()))
                    .description("description")
                    .metadata(
                        LedgerableEventCreateParams.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .build()
            )

        val ledgerableEvent = ledgerableEventFuture.get()
        ledgerableEvent.validate()
    }

    @Test
    fun retrieve() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerableEventServiceAsync = client.ledgerableEvents()

        val ledgerableEventFuture = ledgerableEventServiceAsync.retrieve("id")

        val ledgerableEvent = ledgerableEventFuture.get()
        ledgerableEvent.validate()
    }
}
