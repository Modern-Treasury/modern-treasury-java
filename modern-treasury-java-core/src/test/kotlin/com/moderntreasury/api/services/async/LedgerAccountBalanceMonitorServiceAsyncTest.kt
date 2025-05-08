// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClientAsync
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorCreateParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LedgerAccountBalanceMonitorServiceAsyncTest {

    @Test
    fun create() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountBalanceMonitorServiceAsync = client.ledgerAccountBalanceMonitors()

        val ledgerAccountBalanceMonitorFuture =
            ledgerAccountBalanceMonitorServiceAsync.create(
                LedgerAccountBalanceMonitorCreateParams.builder()
                    .alertCondition(
                        LedgerAccountBalanceMonitorCreateParams.AlertConditionCreateRequest
                            .builder()
                            .field("field")
                            .operator("operator")
                            .value(0L)
                            .build()
                    )
                    .ledgerAccountId("ledger_account_id")
                    .description("description")
                    .metadata(
                        LedgerAccountBalanceMonitorCreateParams.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .build()
            )

        val ledgerAccountBalanceMonitor = ledgerAccountBalanceMonitorFuture.get()
        ledgerAccountBalanceMonitor.validate()
    }

    @Test
    fun retrieve() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountBalanceMonitorServiceAsync = client.ledgerAccountBalanceMonitors()

        val ledgerAccountBalanceMonitorFuture =
            ledgerAccountBalanceMonitorServiceAsync.retrieve("id")

        val ledgerAccountBalanceMonitor = ledgerAccountBalanceMonitorFuture.get()
        ledgerAccountBalanceMonitor.validate()
    }

    @Test
    fun update() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountBalanceMonitorServiceAsync = client.ledgerAccountBalanceMonitors()

        val ledgerAccountBalanceMonitorFuture =
            ledgerAccountBalanceMonitorServiceAsync.update(
                LedgerAccountBalanceMonitorUpdateParams.builder()
                    .id("id")
                    .description("description")
                    .metadata(
                        LedgerAccountBalanceMonitorUpdateParams.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .build()
            )

        val ledgerAccountBalanceMonitor = ledgerAccountBalanceMonitorFuture.get()
        ledgerAccountBalanceMonitor.validate()
    }

    @Test
    fun list() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountBalanceMonitorServiceAsync = client.ledgerAccountBalanceMonitors()

        val pageFuture = ledgerAccountBalanceMonitorServiceAsync.list()

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }

    @Test
    fun delete() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountBalanceMonitorServiceAsync = client.ledgerAccountBalanceMonitors()

        val ledgerAccountBalanceMonitorFuture = ledgerAccountBalanceMonitorServiceAsync.delete("id")

        val ledgerAccountBalanceMonitor = ledgerAccountBalanceMonitorFuture.get()
        ledgerAccountBalanceMonitor.validate()
    }
}
