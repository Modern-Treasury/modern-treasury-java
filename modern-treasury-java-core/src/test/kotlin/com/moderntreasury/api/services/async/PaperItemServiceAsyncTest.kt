// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClientAsync
import com.moderntreasury.api.models.PaperItemRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PaperItemServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val paperItemServiceAsync = client.paperItems()

        val paperItemFuture =
            paperItemServiceAsync.retrieve(PaperItemRetrieveParams.builder().id("id").build())

        val paperItem = paperItemFuture.get()
        paperItem.validate()
    }

    @Test
    fun list() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val paperItemServiceAsync = client.paperItems()

        val pageFuture = paperItemServiceAsync.list()

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }
}
