// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.*
import com.moderntreasury.api.models.BulkRequestListParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class BulkRequestServiceTest {

    @Test
    fun callCreate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val bulkRequestService = client.bulkRequests()
        val bulkRequest =
            bulkRequestService.create(
                BulkRequestCreateParams.builder()
                    .actionType(BulkRequestCreateParams.ActionType.CREATE)
                    .resourceType(BulkRequestCreateParams.ResourceType.PAYMENT_ORDER)
                    .resources(
                        listOf(
                            BulkRequestCreateParams.Resource.ofPaymentOrderCreateRequest(
                                BulkRequestCreateParams.Resource.PaymentOrderCreateRequest.builder()
                                    .amount(123L)
                                    .direction(
                                        BulkRequestCreateParams.Resource.PaymentOrderCreateRequest
                                            .Direction
                                            .CREDIT
                                    )
                                    .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .type(PaymentOrderType.ACH)
                                    .accounting(
                                        BulkRequestCreateParams.Resource.PaymentOrderCreateRequest
                                            .Accounting
                                            .builder()
                                            .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                            .classId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                            .build()
                                    )
                                    .accountingCategoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .accountingLedgerClassId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .chargeBearer(
                                        BulkRequestCreateParams.Resource.PaymentOrderCreateRequest
                                            .ChargeBearer
                                            .SHARED
                                    )
                                    .currency(Currency.AED)
                                    .description("string")
                                    .documents(
                                        listOf(
                                            BulkRequestCreateParams.Resource
                                                .PaymentOrderCreateRequest
                                                .DocumentCreateRequest
                                                .builder()
                                                .documentableId("string")
                                                .documentableType(
                                                    BulkRequestCreateParams.Resource
                                                        .PaymentOrderCreateRequest
                                                        .DocumentCreateRequest
                                                        .DocumentableType
                                                        .CASES
                                                )
                                                .file("file.txt")
                                                .documentType("string")
                                                .build()
                                        )
                                    )
                                    .effectiveDate(LocalDate.parse("2019-12-27"))
                                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .fallbackType(
                                        BulkRequestCreateParams.Resource.PaymentOrderCreateRequest
                                            .FallbackType
                                            .ACH
                                    )
                                    .foreignExchangeContract("string")
                                    .foreignExchangeIndicator(
                                        BulkRequestCreateParams.Resource.PaymentOrderCreateRequest
                                            .ForeignExchangeIndicator
                                            .FIXED_TO_VARIABLE
                                    )
                                    .ledgerTransaction(
                                        BulkRequestCreateParams.Resource.PaymentOrderCreateRequest
                                            .LedgerTransactionCreateRequest
                                            .builder()
                                            .ledgerEntries(
                                                listOf(
                                                    BulkRequestCreateParams.Resource
                                                        .PaymentOrderCreateRequest
                                                        .LedgerTransactionCreateRequest
                                                        .LedgerEntryCreateRequest
                                                        .builder()
                                                        .amount(123L)
                                                        .direction(TransactionDirection.CREDIT)
                                                        .ledgerAccountId(
                                                            "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"
                                                        )
                                                        .availableBalanceAmount(
                                                            BulkRequestCreateParams.Resource
                                                                .PaymentOrderCreateRequest
                                                                .LedgerTransactionCreateRequest
                                                                .LedgerEntryCreateRequest
                                                                .AvailableBalanceAmount
                                                                .builder()
                                                                .build()
                                                        )
                                                        .lockVersion(123L)
                                                        .metadata(
                                                            BulkRequestCreateParams.Resource
                                                                .PaymentOrderCreateRequest
                                                                .LedgerTransactionCreateRequest
                                                                .LedgerEntryCreateRequest
                                                                .Metadata
                                                                .builder()
                                                                .build()
                                                        )
                                                        .pendingBalanceAmount(
                                                            BulkRequestCreateParams.Resource
                                                                .PaymentOrderCreateRequest
                                                                .LedgerTransactionCreateRequest
                                                                .LedgerEntryCreateRequest
                                                                .PendingBalanceAmount
                                                                .builder()
                                                                .build()
                                                        )
                                                        .postedBalanceAmount(
                                                            BulkRequestCreateParams.Resource
                                                                .PaymentOrderCreateRequest
                                                                .LedgerTransactionCreateRequest
                                                                .LedgerEntryCreateRequest
                                                                .PostedBalanceAmount
                                                                .builder()
                                                                .build()
                                                        )
                                                        .showResultingLedgerAccountBalances(true)
                                                        .build()
                                                )
                                            )
                                            .description("string")
                                            .effectiveAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .effectiveDate(LocalDate.parse("2019-12-27"))
                                            .externalId("string")
                                            .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                            .ledgerableType(
                                                BulkRequestCreateParams.Resource
                                                    .PaymentOrderCreateRequest
                                                    .LedgerTransactionCreateRequest
                                                    .LedgerableType
                                                    .COUNTERPARTY
                                            )
                                            .metadata(
                                                BulkRequestCreateParams.Resource
                                                    .PaymentOrderCreateRequest
                                                    .LedgerTransactionCreateRequest
                                                    .Metadata
                                                    .builder()
                                                    .build()
                                            )
                                            .status(
                                                BulkRequestCreateParams.Resource
                                                    .PaymentOrderCreateRequest
                                                    .LedgerTransactionCreateRequest
                                                    .Status
                                                    .ARCHIVED
                                            )
                                            .build()
                                    )
                                    .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .lineItems(
                                        listOf(
                                            BulkRequestCreateParams.Resource
                                                .PaymentOrderCreateRequest
                                                .LineItemRequest
                                                .builder()
                                                .amount(123L)
                                                .accountingCategoryId("string")
                                                .description("string")
                                                .metadata(
                                                    BulkRequestCreateParams.Resource
                                                        .PaymentOrderCreateRequest
                                                        .LineItemRequest
                                                        .Metadata
                                                        .builder()
                                                        .build()
                                                )
                                                .build()
                                        )
                                    )
                                    .metadata(
                                        BulkRequestCreateParams.Resource.PaymentOrderCreateRequest
                                            .Metadata
                                            .builder()
                                            .build()
                                    )
                                    .nsfProtected(true)
                                    .originatingPartyName("string")
                                    .priority(
                                        BulkRequestCreateParams.Resource.PaymentOrderCreateRequest
                                            .Priority
                                            .HIGH
                                    )
                                    .purpose("string")
                                    .receivingAccount(
                                        BulkRequestCreateParams.Resource.PaymentOrderCreateRequest
                                            .ReceivingAccount
                                            .builder()
                                            .accountDetails(
                                                listOf(
                                                    BulkRequestCreateParams.Resource
                                                        .PaymentOrderCreateRequest
                                                        .ReceivingAccount
                                                        .AccountDetail
                                                        .builder()
                                                        .accountNumber("string")
                                                        .accountNumberType(
                                                            BulkRequestCreateParams.Resource
                                                                .PaymentOrderCreateRequest
                                                                .ReceivingAccount
                                                                .AccountDetail
                                                                .AccountNumberType
                                                                .IBAN
                                                        )
                                                        .build()
                                                )
                                            )
                                            .accountType(ExternalAccountType.CASH)
                                            .contactDetails(
                                                listOf(
                                                    BulkRequestCreateParams.Resource
                                                        .PaymentOrderCreateRequest
                                                        .ReceivingAccount
                                                        .ContactDetailCreateRequest
                                                        .builder()
                                                        .contactIdentifier("string")
                                                        .contactIdentifierType(
                                                            BulkRequestCreateParams.Resource
                                                                .PaymentOrderCreateRequest
                                                                .ReceivingAccount
                                                                .ContactDetailCreateRequest
                                                                .ContactIdentifierType
                                                                .EMAIL
                                                        )
                                                        .build()
                                                )
                                            )
                                            .ledgerAccount(
                                                BulkRequestCreateParams.Resource
                                                    .PaymentOrderCreateRequest
                                                    .ReceivingAccount
                                                    .LedgerAccountCreateRequest
                                                    .builder()
                                                    .currency("string")
                                                    .ledgerId(
                                                        "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"
                                                    )
                                                    .name("string")
                                                    .normalBalance(TransactionDirection.CREDIT)
                                                    .currencyExponent(123L)
                                                    .description("string")
                                                    .ledgerableId(
                                                        "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"
                                                    )
                                                    .ledgerableType(
                                                        BulkRequestCreateParams.Resource
                                                            .PaymentOrderCreateRequest
                                                            .ReceivingAccount
                                                            .LedgerAccountCreateRequest
                                                            .LedgerableType
                                                            .EXTERNAL_ACCOUNT
                                                    )
                                                    .metadata(
                                                        BulkRequestCreateParams.Resource
                                                            .PaymentOrderCreateRequest
                                                            .ReceivingAccount
                                                            .LedgerAccountCreateRequest
                                                            .Metadata
                                                            .builder()
                                                            .build()
                                                    )
                                                    .build()
                                            )
                                            .metadata(
                                                BulkRequestCreateParams.Resource
                                                    .PaymentOrderCreateRequest
                                                    .ReceivingAccount
                                                    .Metadata
                                                    .builder()
                                                    .build()
                                            )
                                            .name("string")
                                            .partyAddress(
                                                BulkRequestCreateParams.Resource
                                                    .PaymentOrderCreateRequest
                                                    .ReceivingAccount
                                                    .AddressRequest
                                                    .builder()
                                                    .country("string")
                                                    .line1("string")
                                                    .line2("string")
                                                    .locality("string")
                                                    .postalCode("string")
                                                    .region("string")
                                                    .build()
                                            )
                                            .partyIdentifier("string")
                                            .partyName("string")
                                            .partyType(
                                                BulkRequestCreateParams.Resource
                                                    .PaymentOrderCreateRequest
                                                    .ReceivingAccount
                                                    .PartyType
                                                    .BUSINESS
                                            )
                                            .plaidProcessorToken("string")
                                            .routingDetails(
                                                listOf(
                                                    BulkRequestCreateParams.Resource
                                                        .PaymentOrderCreateRequest
                                                        .ReceivingAccount
                                                        .RoutingDetail
                                                        .builder()
                                                        .routingNumber("string")
                                                        .routingNumberType(
                                                            BulkRequestCreateParams.Resource
                                                                .PaymentOrderCreateRequest
                                                                .ReceivingAccount
                                                                .RoutingDetail
                                                                .RoutingNumberType
                                                                .ABA
                                                        )
                                                        .paymentType(
                                                            BulkRequestCreateParams.Resource
                                                                .PaymentOrderCreateRequest
                                                                .ReceivingAccount
                                                                .RoutingDetail
                                                                .PaymentType
                                                                .ACH
                                                        )
                                                        .build()
                                                )
                                            )
                                            .build()
                                    )
                                    .receivingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .remittanceInformation("string")
                                    .sendRemittanceAdvice(true)
                                    .statementDescriptor("string")
                                    .subtype(PaymentOrderSubtype.BACS_NEW_INSTRUCTION)
                                    .transactionMonitoringEnabled(true)
                                    .ultimateOriginatingPartyIdentifier("string")
                                    .ultimateOriginatingPartyName("string")
                                    .ultimateReceivingPartyIdentifier("string")
                                    .ultimateReceivingPartyName("string")
                                    .build()
                            )
                        )
                    )
                    .metadata(BulkRequestCreateParams.Metadata.builder().build())
                    .build()
            )
        println(bulkRequest)
        bulkRequest.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val bulkRequestService = client.bulkRequests()
        val bulkRequest =
            bulkRequestService.retrieve(BulkRequestRetrieveParams.builder().id("string").build())
        println(bulkRequest)
        bulkRequest.validate()
    }

    @Test
    fun callList() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val bulkRequestService = client.bulkRequests()
        val response = bulkRequestService.list(BulkRequestListParams.builder().build())
        println(response)
        response.items().forEach { it.validate() }
    }
}
