// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PaymentReferenceServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val paymentReferenceServiceAsync = client.paymentReferences()

        val paymentReferenceFuture = paymentReferenceServiceAsync.retrieve("id")

        val paymentReference = paymentReferenceFuture.get()
        paymentReference.validate()
    }

    @Test
    fun list() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val paymentReferenceServiceAsync = client.paymentReferences()

        val pageFuture = paymentReferenceServiceAsync.list()

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }

    @Test
    fun retireve() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val paymentReferenceServiceAsync = client.paymentReferences()

        val paymentReferenceFuture = paymentReferenceServiceAsync.retireve("id")

        val paymentReference = paymentReferenceFuture.get()
        paymentReference.validate()
    }
}
