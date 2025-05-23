// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClientAsync
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.ReturnCreateParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ReturnServiceAsyncTest {

    @Test
    fun create() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val returnServiceAsync = client.returns()

        val returnObjectFuture =
            returnServiceAsync.create(
                ReturnCreateParams.builder()
                    .returnableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .returnableType(ReturnCreateParams.ReturnableType.INCOMING_PAYMENT_DETAIL)
                    .additionalInformation("additional_information")
                    .code(ReturnCreateParams.Code._901)
                    .data(JsonValue.from(mapOf<String, Any>()))
                    .dateOfDeath(LocalDate.parse("2019-12-27"))
                    .reason("reason")
                    .build()
            )

        val returnObject = returnObjectFuture.get()
        returnObject.validate()
    }

    @Test
    fun retrieve() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val returnServiceAsync = client.returns()

        val returnObjectFuture = returnServiceAsync.retrieve("id")

        val returnObject = returnObjectFuture.get()
        returnObject.validate()
    }

    @Test
    fun list() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val returnServiceAsync = client.returns()

        val pageFuture = returnServiceAsync.list()

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }
}
