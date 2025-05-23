// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClientAsync
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.LedgerEntryRetrieveParams
import com.moderntreasury.api.models.LedgerEntryUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LedgerEntryServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerEntryServiceAsync = client.ledgerEntries()

        val ledgerEntryFuture =
            ledgerEntryServiceAsync.retrieve(
                LedgerEntryRetrieveParams.builder().id("id").showBalances(true).build()
            )

        val ledgerEntry = ledgerEntryFuture.get()
        ledgerEntry.validate()
    }

    @Test
    fun update() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerEntryServiceAsync = client.ledgerEntries()

        val ledgerEntryFuture =
            ledgerEntryServiceAsync.update(
                LedgerEntryUpdateParams.builder()
                    .id("id")
                    .metadata(
                        LedgerEntryUpdateParams.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .build()
            )

        val ledgerEntry = ledgerEntryFuture.get()
        ledgerEntry.validate()
    }

    @Test
    fun list() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerEntryServiceAsync = client.ledgerEntries()

        val pageFuture = ledgerEntryServiceAsync.list()

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }
}
