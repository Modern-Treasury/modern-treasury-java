// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClientAsync
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.LedgerAccountCreateRequest
import com.moderntreasury.api.models.LedgerAccountRetrieveParams
import com.moderntreasury.api.models.LedgerAccountUpdateParams
import com.moderntreasury.api.models.TransactionDirection
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LedgerAccountServiceAsyncTest {

    @Test
    fun create() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountServiceAsync = client.ledgerAccounts()

        val ledgerAccountFuture =
            ledgerAccountServiceAsync.create(
                LedgerAccountCreateRequest.builder()
                    .currency("currency")
                    .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .normalBalance(TransactionDirection.CREDIT)
                    .currencyExponent(0L)
                    .description("description")
                    .addLedgerAccountCategoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .ledgerableType(LedgerAccountCreateRequest.LedgerableType.COUNTERPARTY)
                    .metadata(
                        LedgerAccountCreateRequest.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .build()
            )

        val ledgerAccount = ledgerAccountFuture.get()
        ledgerAccount.validate()
    }

    @Test
    fun retrieve() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountServiceAsync = client.ledgerAccounts()

        val ledgerAccountFuture =
            ledgerAccountServiceAsync.retrieve(
                LedgerAccountRetrieveParams.builder()
                    .id("id")
                    .balances(
                        LedgerAccountRetrieveParams.Balances.builder()
                            .asOfDate(LocalDate.parse("2019-12-27"))
                            .asOfLockVersion(0L)
                            .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .effectiveAtLowerBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .effectiveAtUpperBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )

        val ledgerAccount = ledgerAccountFuture.get()
        ledgerAccount.validate()
    }

    @Test
    fun update() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountServiceAsync = client.ledgerAccounts()

        val ledgerAccountFuture =
            ledgerAccountServiceAsync.update(
                LedgerAccountUpdateParams.builder()
                    .id("id")
                    .description("description")
                    .metadata(
                        LedgerAccountUpdateParams.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .name("name")
                    .build()
            )

        val ledgerAccount = ledgerAccountFuture.get()
        ledgerAccount.validate()
    }

    @Test
    fun list() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerAccountServiceAsync = client.ledgerAccounts()

        val pageFuture = ledgerAccountServiceAsync.list()

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
        val ledgerAccountServiceAsync = client.ledgerAccounts()

        val ledgerAccountFuture = ledgerAccountServiceAsync.delete("id")

        val ledgerAccount = ledgerAccountFuture.get()
        ledgerAccount.validate()
    }
}
