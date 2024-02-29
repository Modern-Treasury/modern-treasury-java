// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ConnectionLegalEntityCreateParamsTest {

    @Test
    fun createConnectionLegalEntityCreateParams() {
        ConnectionLegalEntityCreateParams.builder()
            .connectionId("string")
            .legalEntity(
                ConnectionLegalEntityCreateParams.LegalEntity.builder()
                    .addresses(
                        listOf(
                            ConnectionLegalEntityCreateParams.LegalEntity
                                .LegalEntityAddressCreateRequest
                                .builder()
                                .country("string")
                                .line1("string")
                                .locality("string")
                                .postalCode("string")
                                .region("string")
                                .addressTypes(listOf("string"))
                                .line2("string")
                                .build()
                        )
                    )
                    .businessName("string")
                    .dateOfBirth(LocalDate.parse("2019-12-27"))
                    .doingBusinessAsNames(listOf("string"))
                    .email("string")
                    .firstName("string")
                    .identifications(
                        listOf(
                            ConnectionLegalEntityCreateParams.LegalEntity
                                .IdentificationCreateRequest
                                .builder()
                                .idNumber("string")
                                .idType(
                                    ConnectionLegalEntityCreateParams.LegalEntity
                                        .IdentificationCreateRequest
                                        .IdType
                                        .AR_CUIL
                                )
                                .issuingCountry("string")
                                .build()
                        )
                    )
                    .lastName("string")
                    .legalEntityType(
                        ConnectionLegalEntityCreateParams.LegalEntity.LegalEntityType.BUSINESS
                    )
                    .metadata(
                        ConnectionLegalEntityCreateParams.LegalEntity.Metadata.builder().build()
                    )
                    .phoneNumbers(
                        listOf(
                            ConnectionLegalEntityCreateParams.LegalEntity.PhoneNumber.builder()
                                .phoneNumber("string")
                                .build()
                        )
                    )
                    .website("string")
                    .build()
            )
            .legalEntityId("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ConnectionLegalEntityCreateParams.builder()
                .connectionId("string")
                .legalEntity(
                    ConnectionLegalEntityCreateParams.LegalEntity.builder()
                        .addresses(
                            listOf(
                                ConnectionLegalEntityCreateParams.LegalEntity
                                    .LegalEntityAddressCreateRequest
                                    .builder()
                                    .country("string")
                                    .line1("string")
                                    .locality("string")
                                    .postalCode("string")
                                    .region("string")
                                    .addressTypes(listOf("string"))
                                    .line2("string")
                                    .build()
                            )
                        )
                        .businessName("string")
                        .dateOfBirth(LocalDate.parse("2019-12-27"))
                        .doingBusinessAsNames(listOf("string"))
                        .email("string")
                        .firstName("string")
                        .identifications(
                            listOf(
                                ConnectionLegalEntityCreateParams.LegalEntity
                                    .IdentificationCreateRequest
                                    .builder()
                                    .idNumber("string")
                                    .idType(
                                        ConnectionLegalEntityCreateParams.LegalEntity
                                            .IdentificationCreateRequest
                                            .IdType
                                            .AR_CUIL
                                    )
                                    .issuingCountry("string")
                                    .build()
                            )
                        )
                        .lastName("string")
                        .legalEntityType(
                            ConnectionLegalEntityCreateParams.LegalEntity.LegalEntityType.BUSINESS
                        )
                        .metadata(
                            ConnectionLegalEntityCreateParams.LegalEntity.Metadata.builder().build()
                        )
                        .phoneNumbers(
                            listOf(
                                ConnectionLegalEntityCreateParams.LegalEntity.PhoneNumber.builder()
                                    .phoneNumber("string")
                                    .build()
                            )
                        )
                        .website("string")
                        .build()
                )
                .legalEntityId("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.connectionId()).isEqualTo("string")
        assertThat(body.legalEntity())
            .isEqualTo(
                ConnectionLegalEntityCreateParams.LegalEntity.builder()
                    .addresses(
                        listOf(
                            ConnectionLegalEntityCreateParams.LegalEntity
                                .LegalEntityAddressCreateRequest
                                .builder()
                                .country("string")
                                .line1("string")
                                .locality("string")
                                .postalCode("string")
                                .region("string")
                                .addressTypes(listOf("string"))
                                .line2("string")
                                .build()
                        )
                    )
                    .businessName("string")
                    .dateOfBirth(LocalDate.parse("2019-12-27"))
                    .doingBusinessAsNames(listOf("string"))
                    .email("string")
                    .firstName("string")
                    .identifications(
                        listOf(
                            ConnectionLegalEntityCreateParams.LegalEntity
                                .IdentificationCreateRequest
                                .builder()
                                .idNumber("string")
                                .idType(
                                    ConnectionLegalEntityCreateParams.LegalEntity
                                        .IdentificationCreateRequest
                                        .IdType
                                        .AR_CUIL
                                )
                                .issuingCountry("string")
                                .build()
                        )
                    )
                    .lastName("string")
                    .legalEntityType(
                        ConnectionLegalEntityCreateParams.LegalEntity.LegalEntityType.BUSINESS
                    )
                    .metadata(
                        ConnectionLegalEntityCreateParams.LegalEntity.Metadata.builder().build()
                    )
                    .phoneNumbers(
                        listOf(
                            ConnectionLegalEntityCreateParams.LegalEntity.PhoneNumber.builder()
                                .phoneNumber("string")
                                .build()
                        )
                    )
                    .website("string")
                    .build()
            )
        assertThat(body.legalEntityId()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = ConnectionLegalEntityCreateParams.builder().connectionId("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.connectionId()).isEqualTo("string")
    }
}
