// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.AccountDetailCreateParams
import com.moderntreasury.api.models.AccountDetailDeleteParams
import com.moderntreasury.api.models.AccountDetailListParams
import com.moderntreasury.api.models.AccountDetailRetrieveParams
import com.moderntreasury.api.models.AccountsType
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AccountDetailServiceTest {

    @Test
    fun callCreate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val accountDetailService = client.accountDetails()
        val accountDetail =
            accountDetailService.create(
                AccountDetailCreateParams.builder()
                    .accountsType(AccountDetailCreateParams.AccountsType.EXTERNAL_ACCOUNTS)
                    .accountId("account_id")
                    .accountNumber("account_number")
                    .accountNumberType(AccountDetailCreateParams.AccountNumberType.AU_NUMBER)
                    .build()
            )
        println(accountDetail)
        accountDetail.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val accountDetailService = client.accountDetails()
        val accountDetail =
            accountDetailService.retrieve(
                AccountDetailRetrieveParams.builder()
                    .accountsType(AccountsType.EXTERNAL_ACCOUNTS)
                    .accountId("account_id")
                    .id("id")
                    .build()
            )
        println(accountDetail)
        accountDetail.validate()
    }

    @Test
    fun callList() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val accountDetailService = client.accountDetails()
        val response =
            accountDetailService.list(
                AccountDetailListParams.builder()
                    .accountsType(AccountsType.EXTERNAL_ACCOUNTS)
                    .accountId("account_id")
                    .build()
            )
        println(response)
        response.items().forEach { it.validate() }
    }

    @Test
    fun callDelete() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val accountDetailService = client.accountDetails()
        accountDetailService.delete(
            AccountDetailDeleteParams.builder()
                .accountsType(AccountDetailDeleteParams.AccountsType.EXTERNAL_ACCOUNTS)
                .accountId("account_id")
                .id("id")
                .build()
        )
    }
}
