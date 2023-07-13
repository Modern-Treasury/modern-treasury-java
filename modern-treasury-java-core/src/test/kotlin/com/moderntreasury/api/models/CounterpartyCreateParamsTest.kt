package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CounterpartyCreateParamsTest {

    @Test
    fun createCounterpartyCreateParams() {
        CounterpartyCreateParams.builder()
            .name("string")
            .accounts(
                listOf(
                    CounterpartyCreateParams.Account.builder()
                        .accountType(ExternalAccountType.CASH)
                        .partyType(CounterpartyCreateParams.Account.PartyType.BUSINESS)
                        .partyAddress(
                            CounterpartyCreateParams.Account.AddressRequest.builder()
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
                                CounterpartyCreateParams.Account.AccountDetail.builder()
                                    .accountNumber("string")
                                    .accountNumberType(
                                        CounterpartyCreateParams.Account.AccountDetail
                                            .AccountNumberType
                                            .IBAN
                                    )
                                    .build()
                            )
                        )
                        .routingDetails(
                            listOf(
                                CounterpartyCreateParams.Account.RoutingDetail.builder()
                                    .routingNumber("string")
                                    .routingNumberType(
                                        CounterpartyCreateParams.Account.RoutingDetail
                                            .RoutingNumberType
                                            .ABA
                                    )
                                    .paymentType(
                                        CounterpartyCreateParams.Account.RoutingDetail.PaymentType
                                            .ACH
                                    )
                                    .build()
                            )
                        )
                        .metadata(CounterpartyCreateParams.Account.Metadata.builder().build())
                        .partyName("string")
                        .partyIdentifier("string")
                        .ledgerAccount(
                            CounterpartyCreateParams.Account.LedgerAccountCreateRequest.builder()
                                .name("string")
                                .description("string")
                                .normalBalance(
                                    CounterpartyCreateParams.Account.LedgerAccountCreateRequest
                                        .NormalBalance
                                        .CREDIT
                                )
                                .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .currency("string")
                                .currencyExponent(123L)
                                .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .ledgerableType(
                                    CounterpartyCreateParams.Account.LedgerAccountCreateRequest
                                        .LedgerableType
                                        .EXTERNAL_ACCOUNT
                                )
                                .metadata(
                                    CounterpartyCreateParams.Account.LedgerAccountCreateRequest
                                        .Metadata
                                        .builder()
                                        .build()
                                )
                                .build()
                        )
                        .plaidProcessorToken("string")
                        .contactDetails(
                            listOf(
                                CounterpartyCreateParams.Account.ContactDetailCreateRequest
                                    .builder()
                                    .contactIdentifier("string")
                                    .contactIdentifierType(
                                        CounterpartyCreateParams.Account.ContactDetailCreateRequest
                                            .ContactIdentifierType
                                            .EMAIL
                                    )
                                    .build()
                            )
                        )
                        .build()
                )
            )
            .email("dev@stainlessapi.com")
            .metadata(CounterpartyCreateParams.Metadata.builder().build())
            .sendRemittanceAdvice(true)
            .verificationStatus(CounterpartyCreateParams.VerificationStatus.DENIED)
            .accounting(
                CounterpartyCreateParams.Accounting.builder()
                    .type(CounterpartyCreateParams.Accounting.Type.CUSTOMER)
                    .build()
            )
            .ledgerType(CounterpartyCreateParams.LedgerType.CUSTOMER)
            .taxpayerIdentifier("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CounterpartyCreateParams.builder()
                .name("string")
                .accounts(
                    listOf(
                        CounterpartyCreateParams.Account.builder()
                            .accountType(ExternalAccountType.CASH)
                            .partyType(CounterpartyCreateParams.Account.PartyType.BUSINESS)
                            .partyAddress(
                                CounterpartyCreateParams.Account.AddressRequest.builder()
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
                                    CounterpartyCreateParams.Account.AccountDetail.builder()
                                        .accountNumber("string")
                                        .accountNumberType(
                                            CounterpartyCreateParams.Account.AccountDetail
                                                .AccountNumberType
                                                .IBAN
                                        )
                                        .build()
                                )
                            )
                            .routingDetails(
                                listOf(
                                    CounterpartyCreateParams.Account.RoutingDetail.builder()
                                        .routingNumber("string")
                                        .routingNumberType(
                                            CounterpartyCreateParams.Account.RoutingDetail
                                                .RoutingNumberType
                                                .ABA
                                        )
                                        .paymentType(
                                            CounterpartyCreateParams.Account.RoutingDetail
                                                .PaymentType
                                                .ACH
                                        )
                                        .build()
                                )
                            )
                            .metadata(CounterpartyCreateParams.Account.Metadata.builder().build())
                            .partyName("string")
                            .partyIdentifier("string")
                            .ledgerAccount(
                                CounterpartyCreateParams.Account.LedgerAccountCreateRequest
                                    .builder()
                                    .name("string")
                                    .description("string")
                                    .normalBalance(
                                        CounterpartyCreateParams.Account.LedgerAccountCreateRequest
                                            .NormalBalance
                                            .CREDIT
                                    )
                                    .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .currency("string")
                                    .currencyExponent(123L)
                                    .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .ledgerableType(
                                        CounterpartyCreateParams.Account.LedgerAccountCreateRequest
                                            .LedgerableType
                                            .EXTERNAL_ACCOUNT
                                    )
                                    .metadata(
                                        CounterpartyCreateParams.Account.LedgerAccountCreateRequest
                                            .Metadata
                                            .builder()
                                            .build()
                                    )
                                    .build()
                            )
                            .plaidProcessorToken("string")
                            .contactDetails(
                                listOf(
                                    CounterpartyCreateParams.Account.ContactDetailCreateRequest
                                        .builder()
                                        .contactIdentifier("string")
                                        .contactIdentifierType(
                                            CounterpartyCreateParams.Account
                                                .ContactDetailCreateRequest
                                                .ContactIdentifierType
                                                .EMAIL
                                        )
                                        .build()
                                )
                            )
                            .build()
                    )
                )
                .email("dev@stainlessapi.com")
                .metadata(CounterpartyCreateParams.Metadata.builder().build())
                .sendRemittanceAdvice(true)
                .verificationStatus(CounterpartyCreateParams.VerificationStatus.DENIED)
                .accounting(
                    CounterpartyCreateParams.Accounting.builder()
                        .type(CounterpartyCreateParams.Accounting.Type.CUSTOMER)
                        .build()
                )
                .ledgerType(CounterpartyCreateParams.LedgerType.CUSTOMER)
                .taxpayerIdentifier("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("string")
        assertThat(body.accounts())
            .isEqualTo(
                listOf(
                    CounterpartyCreateParams.Account.builder()
                        .accountType(ExternalAccountType.CASH)
                        .partyType(CounterpartyCreateParams.Account.PartyType.BUSINESS)
                        .partyAddress(
                            CounterpartyCreateParams.Account.AddressRequest.builder()
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
                                CounterpartyCreateParams.Account.AccountDetail.builder()
                                    .accountNumber("string")
                                    .accountNumberType(
                                        CounterpartyCreateParams.Account.AccountDetail
                                            .AccountNumberType
                                            .IBAN
                                    )
                                    .build()
                            )
                        )
                        .routingDetails(
                            listOf(
                                CounterpartyCreateParams.Account.RoutingDetail.builder()
                                    .routingNumber("string")
                                    .routingNumberType(
                                        CounterpartyCreateParams.Account.RoutingDetail
                                            .RoutingNumberType
                                            .ABA
                                    )
                                    .paymentType(
                                        CounterpartyCreateParams.Account.RoutingDetail.PaymentType
                                            .ACH
                                    )
                                    .build()
                            )
                        )
                        .metadata(CounterpartyCreateParams.Account.Metadata.builder().build())
                        .partyName("string")
                        .partyIdentifier("string")
                        .ledgerAccount(
                            CounterpartyCreateParams.Account.LedgerAccountCreateRequest.builder()
                                .name("string")
                                .description("string")
                                .normalBalance(
                                    CounterpartyCreateParams.Account.LedgerAccountCreateRequest
                                        .NormalBalance
                                        .CREDIT
                                )
                                .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .currency("string")
                                .currencyExponent(123L)
                                .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .ledgerableType(
                                    CounterpartyCreateParams.Account.LedgerAccountCreateRequest
                                        .LedgerableType
                                        .EXTERNAL_ACCOUNT
                                )
                                .metadata(
                                    CounterpartyCreateParams.Account.LedgerAccountCreateRequest
                                        .Metadata
                                        .builder()
                                        .build()
                                )
                                .build()
                        )
                        .plaidProcessorToken("string")
                        .contactDetails(
                            listOf(
                                CounterpartyCreateParams.Account.ContactDetailCreateRequest
                                    .builder()
                                    .contactIdentifier("string")
                                    .contactIdentifierType(
                                        CounterpartyCreateParams.Account.ContactDetailCreateRequest
                                            .ContactIdentifierType
                                            .EMAIL
                                    )
                                    .build()
                            )
                        )
                        .build()
                )
            )
        assertThat(body.email()).isEqualTo("dev@stainlessapi.com")
        assertThat(body.metadata()).isEqualTo(CounterpartyCreateParams.Metadata.builder().build())
        assertThat(body.sendRemittanceAdvice()).isEqualTo(true)
        assertThat(body.verificationStatus())
            .isEqualTo(CounterpartyCreateParams.VerificationStatus.DENIED)
        assertThat(body.accounting())
            .isEqualTo(
                CounterpartyCreateParams.Accounting.builder()
                    .type(CounterpartyCreateParams.Accounting.Type.CUSTOMER)
                    .build()
            )
        assertThat(body.ledgerType()).isEqualTo(CounterpartyCreateParams.LedgerType.CUSTOMER)
        assertThat(body.taxpayerIdentifier()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = CounterpartyCreateParams.builder().build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }
}
