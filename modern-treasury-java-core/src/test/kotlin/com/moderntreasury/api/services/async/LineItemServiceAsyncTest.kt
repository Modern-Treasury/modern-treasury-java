// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClientAsync
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.LineItemListParams
import com.moderntreasury.api.models.LineItemRetrieveParams
import com.moderntreasury.api.models.LineItemUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LineItemServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val lineItemServiceAsync = client.lineItems()

        val lineItemFuture =
            lineItemServiceAsync.retrieve(
                LineItemRetrieveParams.builder()
                    .itemizableType(LineItemRetrieveParams.ItemizableType.EXPECTED_PAYMENTS)
                    .itemizableId("itemizable_id")
                    .id("id")
                    .build()
            )

        val lineItem = lineItemFuture.get()
        lineItem.validate()
    }

    @Test
    fun update() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val lineItemServiceAsync = client.lineItems()

        val lineItemFuture =
            lineItemServiceAsync.update(
                LineItemUpdateParams.builder()
                    .itemizableType(LineItemUpdateParams.ItemizableType.EXPECTED_PAYMENTS)
                    .itemizableId("itemizable_id")
                    .id("id")
                    .metadata(
                        LineItemUpdateParams.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .build()
            )

        val lineItem = lineItemFuture.get()
        lineItem.validate()
    }

    @Disabled("Prism is broken in this case")
    @Test
    fun list() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val lineItemServiceAsync = client.lineItems()

        val pageFuture =
            lineItemServiceAsync.list(
                LineItemListParams.builder()
                    .itemizableType(LineItemListParams.ItemizableType.EXPECTED_PAYMENTS)
                    .itemizableId("itemizable_id")
                    .build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }
}
