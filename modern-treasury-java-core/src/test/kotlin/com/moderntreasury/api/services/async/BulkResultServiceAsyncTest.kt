// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BulkResultServiceAsyncTest {

    @Disabled("Mock server doesn't generate valid example responses for recursive schemas")
    @Test
    fun retrieve() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val bulkResultServiceAsync = client.bulkResults()

        val bulkResultFuture = bulkResultServiceAsync.retrieve("id")

        val bulkResult = bulkResultFuture.get()
        bulkResult.validate()
    }

    @Disabled("Mock server doesn't generate valid example responses for recursive schemas")
    @Test
    fun list() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val bulkResultServiceAsync = client.bulkResults()

        val pageFuture = bulkResultServiceAsync.list()

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }
}
