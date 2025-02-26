// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClientAsync
import com.moderntreasury.api.models.AccountDetailCreateParams
import com.moderntreasury.api.models.AccountDetailDeleteParams
import com.moderntreasury.api.models.AccountDetailListParams
import com.moderntreasury.api.models.AccountDetailRetrieveParams
import com.moderntreasury.api.models.AccountsType
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AccountDetailServiceAsyncTest {

    @Test
    fun create() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val accountDetailServiceAsync = client.accountDetails()

        val accountDetailFuture =
            accountDetailServiceAsync.create(
                AccountDetailCreateParams.builder()
                    .accountsType(AccountDetailCreateParams.AccountsType.EXTERNAL_ACCOUNTS)
                    .accountId("account_id")
                    .accountNumber("account_number")
                    .accountNumberType(AccountDetailCreateParams.AccountNumberType.AU_NUMBER)
                    .build()
            )

        val accountDetail = accountDetailFuture.get()
        accountDetail.validate()
    }

    @Test
    fun retrieve() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val accountDetailServiceAsync = client.accountDetails()

        val accountDetailFuture =
            accountDetailServiceAsync.retrieve(
                AccountDetailRetrieveParams.builder()
                    .accountsType(AccountsType.EXTERNAL_ACCOUNTS)
                    .accountId("account_id")
                    .id("id")
                    .build()
            )

        val accountDetail = accountDetailFuture.get()
        accountDetail.validate()
    }

    @Test
    fun list() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val accountDetailServiceAsync = client.accountDetails()

        val pageFuture =
            accountDetailServiceAsync.list(
                AccountDetailListParams.builder()
                    .accountsType(AccountsType.EXTERNAL_ACCOUNTS)
                    .accountId("account_id")
                    .build()
            )

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
        val accountDetailServiceAsync = client.accountDetails()

        val future =
            accountDetailServiceAsync.delete(
                AccountDetailDeleteParams.builder()
                    .accountsType(AccountDetailDeleteParams.AccountsType.EXTERNAL_ACCOUNTS)
                    .accountId("account_id")
                    .id("id")
                    .build()
            )

        val response = future.get()
    }
}
