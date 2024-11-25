// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.*
import com.moderntreasury.api.models.IncomingPaymentDetailListParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class IncomingPaymentDetailServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val incomingPaymentDetailService = client.incomingPaymentDetails()
        val incomingPaymentDetail =
            incomingPaymentDetailService.retrieve(
                IncomingPaymentDetailRetrieveParams.builder().id("id").build()
            )
        println(incomingPaymentDetail)
        incomingPaymentDetail.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val incomingPaymentDetailService = client.incomingPaymentDetails()
        val incomingPaymentDetail =
            incomingPaymentDetailService.update(
                IncomingPaymentDetailUpdateParams.builder()
                    .id("id")
                    .metadata(IncomingPaymentDetailUpdateParams.Metadata.builder().build())
                    .build()
            )
        println(incomingPaymentDetail)
        incomingPaymentDetail.validate()
    }

    @Test
    fun callList() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val incomingPaymentDetailService = client.incomingPaymentDetails()
        val response =
            incomingPaymentDetailService.list(IncomingPaymentDetailListParams.builder().build())
        println(response)
        response.items().forEach { it.validate() }
    }

    @Test
    fun callCreateAsync() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val incomingPaymentDetailService = client.incomingPaymentDetails()
        val asyncResponse =
            incomingPaymentDetailService.createAsync(
                IncomingPaymentDetailCreateAsyncParams.builder()
                    .amount(0L)
                    .asOfDate(LocalDate.parse("2019-12-27"))
                    .currency(Currency.AED)
                    .description("description")
                    .direction(IncomingPaymentDetailCreateAsyncParams.Direction.CREDIT)
                    .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .type(IncomingPaymentDetailCreateAsyncParams.Type.ACH)
                    .virtualAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(asyncResponse)
        asyncResponse.validate()
    }
}
