// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClientAsync
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.Currency
import com.moderntreasury.api.models.IncomingPaymentDetailCreateAsyncParams
import com.moderntreasury.api.models.IncomingPaymentDetailRetrieveParams
import com.moderntreasury.api.models.IncomingPaymentDetailUpdateParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class IncomingPaymentDetailServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val incomingPaymentDetailServiceAsync = client.incomingPaymentDetails()

        val incomingPaymentDetailFuture =
            incomingPaymentDetailServiceAsync.retrieve(
                IncomingPaymentDetailRetrieveParams.builder().id("id").build()
            )

        val incomingPaymentDetail = incomingPaymentDetailFuture.get()
        incomingPaymentDetail.validate()
    }

    @Test
    fun update() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val incomingPaymentDetailServiceAsync = client.incomingPaymentDetails()

        val incomingPaymentDetailFuture =
            incomingPaymentDetailServiceAsync.update(
                IncomingPaymentDetailUpdateParams.builder()
                    .id("id")
                    .metadata(
                        IncomingPaymentDetailUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )

        val incomingPaymentDetail = incomingPaymentDetailFuture.get()
        incomingPaymentDetail.validate()
    }

    @Test
    fun list() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val incomingPaymentDetailServiceAsync = client.incomingPaymentDetails()

        val pageFuture = incomingPaymentDetailServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun createAsync() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val incomingPaymentDetailServiceAsync = client.incomingPaymentDetails()

        val asyncResponseFuture =
            incomingPaymentDetailServiceAsync.createAsync(
                IncomingPaymentDetailCreateAsyncParams.builder()
                    .amount(0L)
                    .asOfDate(LocalDate.parse("2019-12-27"))
                    .currency(Currency.AED)
                    .data(JsonValue.from(mapOf<String, Any>()))
                    .description("description")
                    .direction(IncomingPaymentDetailCreateAsyncParams.Direction.CREDIT)
                    .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .type(IncomingPaymentDetailCreateAsyncParams.Type.ACH)
                    .virtualAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val asyncResponse = asyncResponseFuture.get()
        asyncResponse.validate()
    }
}
