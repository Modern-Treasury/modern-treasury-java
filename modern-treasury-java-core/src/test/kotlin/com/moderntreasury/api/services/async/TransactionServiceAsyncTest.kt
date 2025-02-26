// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClientAsync
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.TransactionCreateParams
import com.moderntreasury.api.models.TransactionDeleteParams
import com.moderntreasury.api.models.TransactionRetrieveParams
import com.moderntreasury.api.models.TransactionUpdateParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class TransactionServiceAsyncTest {

    @Test
    fun create() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val transactionServiceAsync = client.transactions()

        val transactionFuture =
            transactionServiceAsync.create(
                TransactionCreateParams.builder()
                    .amount(0L)
                    .asOfDate(LocalDate.parse("2019-12-27"))
                    .direction("direction")
                    .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .vendorCode("vendor_code")
                    .vendorCodeType("vendor_code_type")
                    .metadata(
                        TransactionCreateParams.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .posted(true)
                    .type(TransactionCreateParams.Type.ACH)
                    .vendorDescription("vendor_description")
                    .build()
            )

        val transaction = transactionFuture.get()
        transaction.validate()
    }

    @Test
    fun retrieve() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val transactionServiceAsync = client.transactions()

        val transactionFuture =
            transactionServiceAsync.retrieve(TransactionRetrieveParams.builder().id("id").build())

        val transaction = transactionFuture.get()
        transaction.validate()
    }

    @Test
    fun update() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val transactionServiceAsync = client.transactions()

        val transactionFuture =
            transactionServiceAsync.update(
                TransactionUpdateParams.builder()
                    .id("id")
                    .metadata(
                        TransactionUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )

        val transaction = transactionFuture.get()
        transaction.validate()
    }

    @Test
    fun list() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val transactionServiceAsync = client.transactions()

        val pageFuture = transactionServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val transactionServiceAsync = client.transactions()

        val future =
            transactionServiceAsync.delete(TransactionDeleteParams.builder().id("id").build())

        val response = future.get()
    }
}
