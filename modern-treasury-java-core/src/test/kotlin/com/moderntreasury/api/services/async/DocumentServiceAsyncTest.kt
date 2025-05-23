// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClientAsync
import com.moderntreasury.api.models.DocumentCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DocumentServiceAsyncTest {

    @Disabled("multipart/form-data not yet supported")
    @Test
    fun create() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val documentServiceAsync = client.documents()

        val documentFuture =
            documentServiceAsync.create(
                DocumentCreateParams.builder()
                    .documentableId("documentable_id")
                    .documentableType(DocumentCreateParams.DocumentableType.COUNTERPARTIES)
                    .file("some content".byteInputStream())
                    .documentType("document_type")
                    .build()
            )

        val document = documentFuture.get()
        document.validate()
    }

    @Test
    fun retrieve() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val documentServiceAsync = client.documents()

        val documentFuture = documentServiceAsync.retrieve("id")

        val document = documentFuture.get()
        document.validate()
    }

    @Test
    fun list() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val documentServiceAsync = client.documents()

        val pageFuture = documentServiceAsync.list()

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }
}
