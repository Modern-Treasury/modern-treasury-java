// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClientAsync
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.LedgerAccountCategoryAddLedgerAccountParams
import com.moderntreasury.api.models.LedgerAccountCategoryAddNestedCategoryParams
import com.moderntreasury.api.models.LedgerAccountCategoryCreateParams
import com.moderntreasury.api.models.LedgerAccountCategoryDeleteParams
import com.moderntreasury.api.models.LedgerAccountCategoryRemoveLedgerAccountParams
import com.moderntreasury.api.models.LedgerAccountCategoryRemoveNestedCategoryParams
import com.moderntreasury.api.models.LedgerAccountCategoryRetrieveParams
import com.moderntreasury.api.models.LedgerAccountCategoryUpdateParams
import com.moderntreasury.api.models.TransactionDirection
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LedgerAccountCategoryServiceAsyncTest {

    @Test
    fun create() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountCategoryServiceAsync = client.ledgerAccountCategories()

        val ledgerAccountCategoryFuture =
            ledgerAccountCategoryServiceAsync.create(
                LedgerAccountCategoryCreateParams.builder()
                    .currency("currency")
                    .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .normalBalance(TransactionDirection.CREDIT)
                    .currencyExponent(0L)
                    .description("description")
                    .addLedgerAccountCategoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .metadata(
                        LedgerAccountCategoryCreateParams.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .build()
            )

        val ledgerAccountCategory = ledgerAccountCategoryFuture.get()
        ledgerAccountCategory.validate()
    }

    @Test
    fun retrieve() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountCategoryServiceAsync = client.ledgerAccountCategories()

        val ledgerAccountCategoryFuture =
            ledgerAccountCategoryServiceAsync.retrieve(
                LedgerAccountCategoryRetrieveParams.builder()
                    .id("id")
                    .balances(
                        LedgerAccountCategoryRetrieveParams.Balances.builder()
                            .asOfDate(LocalDate.parse("2019-12-27"))
                            .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )

        val ledgerAccountCategory = ledgerAccountCategoryFuture.get()
        ledgerAccountCategory.validate()
    }

    @Test
    fun update() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountCategoryServiceAsync = client.ledgerAccountCategories()

        val ledgerAccountCategoryFuture =
            ledgerAccountCategoryServiceAsync.update(
                LedgerAccountCategoryUpdateParams.builder()
                    .id("id")
                    .description("description")
                    .metadata(
                        LedgerAccountCategoryUpdateParams.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .name("name")
                    .build()
            )

        val ledgerAccountCategory = ledgerAccountCategoryFuture.get()
        ledgerAccountCategory.validate()
    }

    @Test
    fun list() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountCategoryServiceAsync = client.ledgerAccountCategories()

        val pageFuture = ledgerAccountCategoryServiceAsync.list()

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
        val ledgerAccountCategoryServiceAsync = client.ledgerAccountCategories()

        val ledgerAccountCategoryFuture =
            ledgerAccountCategoryServiceAsync.delete(
                LedgerAccountCategoryDeleteParams.builder().id("id").build()
            )

        val ledgerAccountCategory = ledgerAccountCategoryFuture.get()
        ledgerAccountCategory.validate()
    }

    @Test
    fun addLedgerAccount() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountCategoryServiceAsync = client.ledgerAccountCategories()

        val future =
            ledgerAccountCategoryServiceAsync.addLedgerAccount(
                LedgerAccountCategoryAddLedgerAccountParams.builder()
                    .id("id")
                    .ledgerAccountId("ledger_account_id")
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun addNestedCategory() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountCategoryServiceAsync = client.ledgerAccountCategories()

        val future =
            ledgerAccountCategoryServiceAsync.addNestedCategory(
                LedgerAccountCategoryAddNestedCategoryParams.builder()
                    .id("id")
                    .subCategoryId("sub_category_id")
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun removeLedgerAccount() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountCategoryServiceAsync = client.ledgerAccountCategories()

        val future =
            ledgerAccountCategoryServiceAsync.removeLedgerAccount(
                LedgerAccountCategoryRemoveLedgerAccountParams.builder()
                    .id("id")
                    .ledgerAccountId("ledger_account_id")
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun removeNestedCategory() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountCategoryServiceAsync = client.ledgerAccountCategories()

        val future =
            ledgerAccountCategoryServiceAsync.removeNestedCategory(
                LedgerAccountCategoryRemoveNestedCategoryParams.builder()
                    .id("id")
                    .subCategoryId("sub_category_id")
                    .build()
            )

        val response = future.get()
    }
}
