package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.*
import com.moderntreasury.api.models.PaymentOrderListParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PaymentOrderServiceTest {

    @Disabled("skipped: prism mock server is broken for file uploads")
    @Test
    fun callCreate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .webhookKey("string")
                .build()
        val paymentOrderService = client.paymentOrders()
        val paymentOrder =
            paymentOrderService.create(
                PaymentOrderCreateParams.builder()
                    .type(PaymentOrderType.ACH)
                    .subtype(PaymentOrderSubtype.BACS_NEW_INSTRUCTION)
                    .amount(123L)
                    .direction(PaymentOrderCreateParams.Direction.CREDIT)
                    .priority(PaymentOrderCreateParams.Priority.HIGH)
                    .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .receivingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accounting(
                        PaymentOrderCreateParams.Accounting.builder()
                            .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .classId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .accountingCategoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountingLedgerClassId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .currency(Currency.AED)
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .description("string")
                    .statementDescriptor("string")
                    .remittanceInformation("string")
                    .purpose("string")
                    .metadata(PaymentOrderCreateParams.Metadata.builder().build())
                    .chargeBearer(PaymentOrderCreateParams.ChargeBearer.SHARED)
                    .foreignExchangeIndicator(
                        PaymentOrderCreateParams.ForeignExchangeIndicator.FIXED_TO_VARIABLE
                    )
                    .foreignExchangeContract("string")
                    .nsfProtected(true)
                    .originatingPartyName("string")
                    .ultimateOriginatingPartyName("string")
                    .ultimateOriginatingPartyIdentifier("string")
                    .ultimateReceivingPartyName("string")
                    .ultimateReceivingPartyIdentifier("string")
                    .sendRemittanceAdvice(true)
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .fallbackType(PaymentOrderCreateParams.FallbackType.ACH)
                    .receivingAccount(
                        PaymentOrderCreateParams.ReceivingAccount.builder()
                            .accountType(ExternalAccountType.CASH)
                            .partyType(PaymentOrderCreateParams.ReceivingAccount.PartyType.BUSINESS)
                            .partyAddress(
                                PaymentOrderCreateParams.ReceivingAccount.AddressRequest.builder()
                                    .line1("string")
                                    .line2("string")
                                    .locality("string")
                                    .region("string")
                                    .postalCode("string")
                                    .country("string")
                                    .build()
                            )
                            .name("string")
                            .accountDetails(
                                listOf(
                                    PaymentOrderCreateParams.ReceivingAccount.AccountDetail
                                        .builder()
                                        .accountNumber("string")
                                        .accountNumberType(
                                            PaymentOrderCreateParams.ReceivingAccount.AccountDetail
                                                .AccountNumberType
                                                .IBAN
                                        )
                                        .build()
                                )
                            )
                            .routingDetails(
                                listOf(
                                    PaymentOrderCreateParams.ReceivingAccount.RoutingDetail
                                        .builder()
                                        .routingNumber("string")
                                        .routingNumberType(
                                            PaymentOrderCreateParams.ReceivingAccount.RoutingDetail
                                                .RoutingNumberType
                                                .ABA
                                        )
                                        .paymentType(
                                            PaymentOrderCreateParams.ReceivingAccount.RoutingDetail
                                                .PaymentType
                                                .ACH
                                        )
                                        .build()
                                )
                            )
                            .metadata(
                                PaymentOrderCreateParams.ReceivingAccount.Metadata.builder().build()
                            )
                            .partyName("string")
                            .partyIdentifier("string")
                            .ledgerAccount(
                                PaymentOrderCreateParams.ReceivingAccount.LedgerAccountCreateRequest
                                    .builder()
                                    .name("string")
                                    .description("string")
                                    .normalBalance(
                                        PaymentOrderCreateParams.ReceivingAccount
                                            .LedgerAccountCreateRequest
                                            .NormalBalance
                                            .CREDIT
                                    )
                                    .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .currency("string")
                                    .currencyExponent(123L)
                                    .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .ledgerableType(
                                        PaymentOrderCreateParams.ReceivingAccount
                                            .LedgerAccountCreateRequest
                                            .LedgerableType
                                            .EXTERNAL_ACCOUNT
                                    )
                                    .metadata(
                                        PaymentOrderCreateParams.ReceivingAccount
                                            .LedgerAccountCreateRequest
                                            .Metadata
                                            .builder()
                                            .build()
                                    )
                                    .build()
                            )
                            .plaidProcessorToken("string")
                            .contactDetails(
                                listOf(
                                    PaymentOrderCreateParams.ReceivingAccount
                                        .ContactDetailCreateRequest
                                        .builder()
                                        .contactIdentifier("string")
                                        .contactIdentifierType(
                                            PaymentOrderCreateParams.ReceivingAccount
                                                .ContactDetailCreateRequest
                                                .ContactIdentifierType
                                                .EMAIL
                                        )
                                        .build()
                                )
                            )
                            .build()
                    )
                    .ledgerTransaction(
                        PaymentOrderCreateParams.LedgerTransactionCreateRequest.builder()
                            .description("string")
                            .status(
                                PaymentOrderCreateParams.LedgerTransactionCreateRequest.Status
                                    .ARCHIVED
                            )
                            .metadata(
                                PaymentOrderCreateParams.LedgerTransactionCreateRequest.Metadata
                                    .builder()
                                    .build()
                            )
                            .effectiveDate(LocalDate.parse("2019-12-27"))
                            .ledgerEntries(
                                listOf(
                                    PaymentOrderCreateParams.LedgerTransactionCreateRequest
                                        .LedgerEntryCreateRequest
                                        .builder()
                                        .amount(123L)
                                        .direction(
                                            PaymentOrderCreateParams.LedgerTransactionCreateRequest
                                                .LedgerEntryCreateRequest
                                                .Direction
                                                .CREDIT
                                        )
                                        .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .lockVersion(123L)
                                        .pendingBalanceAmount(
                                            PaymentOrderCreateParams.LedgerTransactionCreateRequest
                                                .LedgerEntryCreateRequest
                                                .PendingBalanceAmount
                                                .builder()
                                                .build()
                                        )
                                        .postedBalanceAmount(
                                            PaymentOrderCreateParams.LedgerTransactionCreateRequest
                                                .LedgerEntryCreateRequest
                                                .PostedBalanceAmount
                                                .builder()
                                                .build()
                                        )
                                        .availableBalanceAmount(
                                            PaymentOrderCreateParams.LedgerTransactionCreateRequest
                                                .LedgerEntryCreateRequest
                                                .AvailableBalanceAmount
                                                .builder()
                                                .build()
                                        )
                                        .showResultingLedgerAccountBalances(true)
                                        .build()
                                )
                            )
                            .externalId("string")
                            .ledgerableType(
                                PaymentOrderCreateParams.LedgerTransactionCreateRequest
                                    .LedgerableType
                                    .COUNTERPARTY
                            )
                            .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .lineItems(
                        listOf(
                            PaymentOrderCreateParams.LineItemRequest.builder()
                                .amount(123L)
                                .metadata(
                                    PaymentOrderCreateParams.LineItemRequest.Metadata.builder()
                                        .build()
                                )
                                .description("string")
                                .accountingCategoryId("string")
                                .build()
                        )
                    )
                    .transactionMonitoringEnabled(true)
                    .documents(
                        listOf(
                            PaymentOrderCreateParams.DocumentCreateRequest.builder()
                                .documentType("string")
                                .file("file.txt")
                                .build()
                        )
                    )
                    .build()
            )
        println(paymentOrder)
        paymentOrder.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .webhookKey("string")
                .build()
        val paymentOrderService = client.paymentOrders()
        val paymentOrder =
            paymentOrderService.retrieve(PaymentOrderRetrieveParams.builder().id("string").build())
        println(paymentOrder)
        paymentOrder.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .webhookKey("string")
                .build()
        val paymentOrderService = client.paymentOrders()
        val paymentOrder =
            paymentOrderService.update(
                PaymentOrderUpdateParams.builder()
                    .id("string")
                    .type(PaymentOrderType.ACH)
                    .subtype(PaymentOrderSubtype.BACS_NEW_INSTRUCTION)
                    .amount(123L)
                    .direction(PaymentOrderUpdateParams.Direction.CREDIT)
                    .priority(PaymentOrderUpdateParams.Priority.HIGH)
                    .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .receivingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accounting(
                        PaymentOrderUpdateParams.Accounting.builder()
                            .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .classId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .accountingCategoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountingLedgerClassId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .currency(Currency.AED)
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .description("string")
                    .statementDescriptor("string")
                    .remittanceInformation("string")
                    .purpose("string")
                    .metadata(PaymentOrderUpdateParams.Metadata.builder().build())
                    .chargeBearer(PaymentOrderUpdateParams.ChargeBearer.SHARED)
                    .foreignExchangeIndicator(
                        PaymentOrderUpdateParams.ForeignExchangeIndicator.FIXED_TO_VARIABLE
                    )
                    .foreignExchangeContract("string")
                    .nsfProtected(true)
                    .originatingPartyName("string")
                    .ultimateOriginatingPartyName("string")
                    .ultimateOriginatingPartyIdentifier("string")
                    .ultimateReceivingPartyName("string")
                    .ultimateReceivingPartyIdentifier("string")
                    .sendRemittanceAdvice(true)
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(PaymentOrderUpdateParams.Status.APPROVED)
                    .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .fallbackType(PaymentOrderUpdateParams.FallbackType.ACH)
                    .receivingAccount(
                        PaymentOrderUpdateParams.ReceivingAccount.builder()
                            .accountType(ExternalAccountType.CASH)
                            .partyType(PaymentOrderUpdateParams.ReceivingAccount.PartyType.BUSINESS)
                            .partyAddress(
                                PaymentOrderUpdateParams.ReceivingAccount.AddressRequest.builder()
                                    .line1("string")
                                    .line2("string")
                                    .locality("string")
                                    .region("string")
                                    .postalCode("string")
                                    .country("string")
                                    .build()
                            )
                            .name("string")
                            .accountDetails(
                                listOf(
                                    PaymentOrderUpdateParams.ReceivingAccount.AccountDetail
                                        .builder()
                                        .accountNumber("string")
                                        .accountNumberType(
                                            PaymentOrderUpdateParams.ReceivingAccount.AccountDetail
                                                .AccountNumberType
                                                .IBAN
                                        )
                                        .build()
                                )
                            )
                            .routingDetails(
                                listOf(
                                    PaymentOrderUpdateParams.ReceivingAccount.RoutingDetail
                                        .builder()
                                        .routingNumber("string")
                                        .routingNumberType(
                                            PaymentOrderUpdateParams.ReceivingAccount.RoutingDetail
                                                .RoutingNumberType
                                                .ABA
                                        )
                                        .paymentType(
                                            PaymentOrderUpdateParams.ReceivingAccount.RoutingDetail
                                                .PaymentType
                                                .ACH
                                        )
                                        .build()
                                )
                            )
                            .metadata(
                                PaymentOrderUpdateParams.ReceivingAccount.Metadata.builder().build()
                            )
                            .partyName("string")
                            .partyIdentifier("string")
                            .ledgerAccount(
                                PaymentOrderUpdateParams.ReceivingAccount.LedgerAccountCreateRequest
                                    .builder()
                                    .name("string")
                                    .description("string")
                                    .normalBalance(
                                        PaymentOrderUpdateParams.ReceivingAccount
                                            .LedgerAccountCreateRequest
                                            .NormalBalance
                                            .CREDIT
                                    )
                                    .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .currency("string")
                                    .currencyExponent(123L)
                                    .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .ledgerableType(
                                        PaymentOrderUpdateParams.ReceivingAccount
                                            .LedgerAccountCreateRequest
                                            .LedgerableType
                                            .EXTERNAL_ACCOUNT
                                    )
                                    .metadata(
                                        PaymentOrderUpdateParams.ReceivingAccount
                                            .LedgerAccountCreateRequest
                                            .Metadata
                                            .builder()
                                            .build()
                                    )
                                    .build()
                            )
                            .plaidProcessorToken("string")
                            .contactDetails(
                                listOf(
                                    PaymentOrderUpdateParams.ReceivingAccount
                                        .ContactDetailCreateRequest
                                        .builder()
                                        .contactIdentifier("string")
                                        .contactIdentifierType(
                                            PaymentOrderUpdateParams.ReceivingAccount
                                                .ContactDetailCreateRequest
                                                .ContactIdentifierType
                                                .EMAIL
                                        )
                                        .build()
                                )
                            )
                            .build()
                    )
                    .lineItems(
                        listOf(
                            PaymentOrderUpdateParams.LineItemRequest.builder()
                                .amount(123L)
                                .metadata(
                                    PaymentOrderUpdateParams.LineItemRequest.Metadata.builder()
                                        .build()
                                )
                                .description("string")
                                .accountingCategoryId("string")
                                .build()
                        )
                    )
                    .build()
            )
        println(paymentOrder)
        paymentOrder.validate()
    }

    @Test
    fun callList() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .webhookKey("string")
                .build()
        val paymentOrderService = client.paymentOrders()
        val response = paymentOrderService.list(PaymentOrderListParams.builder().build())
        println(response)
        response.items().forEach { it.validate() }
    }

    @Test
    fun callCreateAsync() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .webhookKey("string")
                .build()
        val paymentOrderService = client.paymentOrders()
        val asyncResponse =
            paymentOrderService.createAsync(
                PaymentOrderCreateAsyncParams.builder()
                    .type(PaymentOrderType.ACH)
                    .subtype(PaymentOrderSubtype.BACS_NEW_INSTRUCTION)
                    .amount(123L)
                    .direction(PaymentOrderCreateAsyncParams.Direction.CREDIT)
                    .priority(PaymentOrderCreateAsyncParams.Priority.HIGH)
                    .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .receivingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accounting(
                        PaymentOrderCreateAsyncParams.Accounting.builder()
                            .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .classId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .accountingCategoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountingLedgerClassId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .currency(Currency.AED)
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .description("string")
                    .statementDescriptor("string")
                    .remittanceInformation("string")
                    .purpose("string")
                    .metadata(PaymentOrderCreateAsyncParams.Metadata.builder().build())
                    .chargeBearer(PaymentOrderCreateAsyncParams.ChargeBearer.SHARED)
                    .foreignExchangeIndicator(
                        PaymentOrderCreateAsyncParams.ForeignExchangeIndicator.FIXED_TO_VARIABLE
                    )
                    .foreignExchangeContract("string")
                    .nsfProtected(true)
                    .originatingPartyName("string")
                    .ultimateOriginatingPartyName("string")
                    .ultimateOriginatingPartyIdentifier("string")
                    .ultimateReceivingPartyName("string")
                    .ultimateReceivingPartyIdentifier("string")
                    .sendRemittanceAdvice(true)
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .fallbackType(PaymentOrderCreateAsyncParams.FallbackType.ACH)
                    .receivingAccount(
                        PaymentOrderCreateAsyncParams.ReceivingAccount.builder()
                            .accountType(ExternalAccountType.CASH)
                            .partyType(
                                PaymentOrderCreateAsyncParams.ReceivingAccount.PartyType.BUSINESS
                            )
                            .partyAddress(
                                PaymentOrderCreateAsyncParams.ReceivingAccount.AddressRequest
                                    .builder()
                                    .line1("string")
                                    .line2("string")
                                    .locality("string")
                                    .region("string")
                                    .postalCode("string")
                                    .country("string")
                                    .build()
                            )
                            .name("string")
                            .accountDetails(
                                listOf(
                                    PaymentOrderCreateAsyncParams.ReceivingAccount.AccountDetail
                                        .builder()
                                        .accountNumber("string")
                                        .accountNumberType(
                                            PaymentOrderCreateAsyncParams.ReceivingAccount
                                                .AccountDetail
                                                .AccountNumberType
                                                .IBAN
                                        )
                                        .build()
                                )
                            )
                            .routingDetails(
                                listOf(
                                    PaymentOrderCreateAsyncParams.ReceivingAccount.RoutingDetail
                                        .builder()
                                        .routingNumber("string")
                                        .routingNumberType(
                                            PaymentOrderCreateAsyncParams.ReceivingAccount
                                                .RoutingDetail
                                                .RoutingNumberType
                                                .ABA
                                        )
                                        .paymentType(
                                            PaymentOrderCreateAsyncParams.ReceivingAccount
                                                .RoutingDetail
                                                .PaymentType
                                                .ACH
                                        )
                                        .build()
                                )
                            )
                            .metadata(
                                PaymentOrderCreateAsyncParams.ReceivingAccount.Metadata.builder()
                                    .build()
                            )
                            .partyName("string")
                            .partyIdentifier("string")
                            .ledgerAccount(
                                PaymentOrderCreateAsyncParams.ReceivingAccount
                                    .LedgerAccountCreateRequest
                                    .builder()
                                    .name("string")
                                    .description("string")
                                    .normalBalance(
                                        PaymentOrderCreateAsyncParams.ReceivingAccount
                                            .LedgerAccountCreateRequest
                                            .NormalBalance
                                            .CREDIT
                                    )
                                    .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .currency("string")
                                    .currencyExponent(123L)
                                    .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .ledgerableType(
                                        PaymentOrderCreateAsyncParams.ReceivingAccount
                                            .LedgerAccountCreateRequest
                                            .LedgerableType
                                            .EXTERNAL_ACCOUNT
                                    )
                                    .metadata(
                                        PaymentOrderCreateAsyncParams.ReceivingAccount
                                            .LedgerAccountCreateRequest
                                            .Metadata
                                            .builder()
                                            .build()
                                    )
                                    .build()
                            )
                            .plaidProcessorToken("string")
                            .contactDetails(
                                listOf(
                                    PaymentOrderCreateAsyncParams.ReceivingAccount
                                        .ContactDetailCreateRequest
                                        .builder()
                                        .contactIdentifier("string")
                                        .contactIdentifierType(
                                            PaymentOrderCreateAsyncParams.ReceivingAccount
                                                .ContactDetailCreateRequest
                                                .ContactIdentifierType
                                                .EMAIL
                                        )
                                        .build()
                                )
                            )
                            .build()
                    )
                    .ledgerTransaction(
                        PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest.builder()
                            .description("string")
                            .status(
                                PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest.Status
                                    .ARCHIVED
                            )
                            .metadata(
                                PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest
                                    .Metadata
                                    .builder()
                                    .build()
                            )
                            .effectiveDate(LocalDate.parse("2019-12-27"))
                            .ledgerEntries(
                                listOf(
                                    PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest
                                        .LedgerEntryCreateRequest
                                        .builder()
                                        .amount(123L)
                                        .direction(
                                            PaymentOrderCreateAsyncParams
                                                .LedgerTransactionCreateRequest
                                                .LedgerEntryCreateRequest
                                                .Direction
                                                .CREDIT
                                        )
                                        .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .lockVersion(123L)
                                        .pendingBalanceAmount(
                                            PaymentOrderCreateAsyncParams
                                                .LedgerTransactionCreateRequest
                                                .LedgerEntryCreateRequest
                                                .PendingBalanceAmount
                                                .builder()
                                                .build()
                                        )
                                        .postedBalanceAmount(
                                            PaymentOrderCreateAsyncParams
                                                .LedgerTransactionCreateRequest
                                                .LedgerEntryCreateRequest
                                                .PostedBalanceAmount
                                                .builder()
                                                .build()
                                        )
                                        .availableBalanceAmount(
                                            PaymentOrderCreateAsyncParams
                                                .LedgerTransactionCreateRequest
                                                .LedgerEntryCreateRequest
                                                .AvailableBalanceAmount
                                                .builder()
                                                .build()
                                        )
                                        .showResultingLedgerAccountBalances(true)
                                        .build()
                                )
                            )
                            .externalId("string")
                            .ledgerableType(
                                PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest
                                    .LedgerableType
                                    .COUNTERPARTY
                            )
                            .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .lineItems(
                        listOf(
                            PaymentOrderCreateAsyncParams.LineItemRequest.builder()
                                .amount(123L)
                                .metadata(
                                    PaymentOrderCreateAsyncParams.LineItemRequest.Metadata.builder()
                                        .build()
                                )
                                .description("string")
                                .accountingCategoryId("string")
                                .build()
                        )
                    )
                    .transactionMonitoringEnabled(true)
                    .build()
            )
        println(asyncResponse)
        asyncResponse.validate()
    }
}
