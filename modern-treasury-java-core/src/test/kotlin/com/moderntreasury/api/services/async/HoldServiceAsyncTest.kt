// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClientAsync
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.HoldCreateParams
import com.moderntreasury.api.models.HoldUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class HoldServiceAsyncTest {

    @Test
    fun create() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val holdServiceAsync = client.holds()

        val holdFuture =
            holdServiceAsync.create(
                HoldCreateParams.builder()
                    .status(HoldCreateParams.Status.ACTIVE)
                    .targetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .targetType(HoldCreateParams.TargetType.PAYMENT_ORDER)
                    .metadata(
                        HoldCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .reason("reason")
                    .build()
            )

        val hold = holdFuture.get()
        hold.validate()
    }

    @Test
    fun retrieve() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val holdServiceAsync = client.holds()

        val holdFuture = holdServiceAsync.retrieve("id")

        val hold = holdFuture.get()
        hold.validate()
    }

    @Test
    fun update() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val holdServiceAsync = client.holds()

        val holdFuture =
            holdServiceAsync.update(
                HoldUpdateParams.builder()
                    .id("id")
                    .status(HoldUpdateParams.Status.RESOLVED)
                    .resolution("resolution")
                    .build()
            )

        val hold = holdFuture.get()
        hold.validate()
    }

    @Test
    fun list() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val holdServiceAsync = client.holds()

        val pageFuture = holdServiceAsync.list()

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }
}
