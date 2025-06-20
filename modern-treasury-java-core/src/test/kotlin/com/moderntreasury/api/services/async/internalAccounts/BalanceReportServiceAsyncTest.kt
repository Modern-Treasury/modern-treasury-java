// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async.internalAccounts

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClientAsync
import com.moderntreasury.api.models.BalanceReportCreateParams
import com.moderntreasury.api.models.BalanceReportDeleteParams
import com.moderntreasury.api.models.BalanceReportRetrieveParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BalanceReportServiceAsyncTest {

    @Test
    fun create() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val balanceReportServiceAsync = client.internalAccounts().balanceReports()

        val balanceReportFuture =
            balanceReportServiceAsync.create(
                BalanceReportCreateParams.builder()
                    .internalAccountId("internal_account_id")
                    .asOfDate(LocalDate.parse("2019-12-27"))
                    .asOfTime("as_of_time")
                    .balanceReportType(BalanceReportCreateParams.BalanceReportType.INTRADAY)
                    .addBalance(
                        BalanceReportCreateParams.BalanceCreateRequest.builder()
                            .amount(0L)
                            .balanceType(
                                BalanceReportCreateParams.BalanceCreateRequest.BalanceType
                                    .CLOSING_AVAILABLE
                            )
                            .vendorCode("vendor_code")
                            .vendorCodeType("vendor_code_type")
                            .build()
                    )
                    .build()
            )

        val balanceReport = balanceReportFuture.get()
        balanceReport.validate()
    }

    @Test
    fun retrieve() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val balanceReportServiceAsync = client.internalAccounts().balanceReports()

        val balanceReportFuture =
            balanceReportServiceAsync.retrieve(
                BalanceReportRetrieveParams.builder()
                    .internalAccountId("internal_account_id")
                    .id(BalanceReportRetrieveParams.Id.LATEST)
                    .build()
            )

        val balanceReport = balanceReportFuture.get()
        balanceReport.validate()
    }

    @Test
    fun list() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val balanceReportServiceAsync = client.internalAccounts().balanceReports()

        val pageFuture = balanceReportServiceAsync.list("internal_account_id")

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
        val balanceReportServiceAsync = client.internalAccounts().balanceReports()

        val future =
            balanceReportServiceAsync.delete(
                BalanceReportDeleteParams.builder()
                    .internalAccountId("internal_account_id")
                    .id("id")
                    .build()
            )

        val response = future.get()
    }
}
