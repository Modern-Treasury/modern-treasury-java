// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LegalEntityAssociationCreateParamsTest {

    @Test
    fun createLegalEntityAssociationCreateParams() {
        LegalEntityAssociationCreateParams.builder()
            .parentLegalEntityId("string")
            .relationshipTypes(
                listOf(LegalEntityAssociationCreateParams.RelationshipType.BENEFICIAL_OWNER)
            )
            .childLegalEntity(
                LegalEntityAssociationCreateParams.ChildLegalEntityCreate.builder()
                    .addresses(
                        listOf(
                            LegalEntityAssociationCreateParams.ChildLegalEntityCreate
                                .LegalEntityAddressCreateRequest
                                .builder()
                                .country("string")
                                .line1("string")
                                .locality("string")
                                .postalCode("string")
                                .region("string")
                                .addressTypes(
                                    listOf(
                                        LegalEntityAssociationCreateParams.ChildLegalEntityCreate
                                            .LegalEntityAddressCreateRequest
                                            .AddressType
                                            .BUSINESS
                                    )
                                )
                                .line2("string")
                                .build()
                        )
                    )
                    .businessName("string")
                    .dateFormed(LocalDate.parse("2019-12-27"))
                    .dateOfBirth(LocalDate.parse("2019-12-27"))
                    .doingBusinessAsNames(listOf("string"))
                    .email("string")
                    .firstName("string")
                    .identifications(
                        listOf(
                            LegalEntityAssociationCreateParams.ChildLegalEntityCreate
                                .IdentificationCreateRequest
                                .builder()
                                .idNumber("string")
                                .idType(
                                    LegalEntityAssociationCreateParams.ChildLegalEntityCreate
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
                        LegalEntityAssociationCreateParams.ChildLegalEntityCreate.LegalEntityType
                            .BUSINESS
                    )
                    .legalStructure(
                        LegalEntityAssociationCreateParams.ChildLegalEntityCreate.LegalStructure
                            .CORPORATION
                    )
                    .metadata(
                        LegalEntityAssociationCreateParams.ChildLegalEntityCreate.Metadata.builder()
                            .build()
                    )
                    .phoneNumbers(
                        listOf(
                            LegalEntityAssociationCreateParams.ChildLegalEntityCreate.PhoneNumber
                                .builder()
                                .phoneNumber("string")
                                .build()
                        )
                    )
                    .website("string")
                    .build()
            )
            .childLegalEntityId("string")
            .ownershipPercentage(123L)
            .title("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            LegalEntityAssociationCreateParams.builder()
                .parentLegalEntityId("string")
                .relationshipTypes(
                    listOf(LegalEntityAssociationCreateParams.RelationshipType.BENEFICIAL_OWNER)
                )
                .childLegalEntity(
                    LegalEntityAssociationCreateParams.ChildLegalEntityCreate.builder()
                        .addresses(
                            listOf(
                                LegalEntityAssociationCreateParams.ChildLegalEntityCreate
                                    .LegalEntityAddressCreateRequest
                                    .builder()
                                    .country("string")
                                    .line1("string")
                                    .locality("string")
                                    .postalCode("string")
                                    .region("string")
                                    .addressTypes(
                                        listOf(
                                            LegalEntityAssociationCreateParams
                                                .ChildLegalEntityCreate
                                                .LegalEntityAddressCreateRequest
                                                .AddressType
                                                .BUSINESS
                                        )
                                    )
                                    .line2("string")
                                    .build()
                            )
                        )
                        .businessName("string")
                        .dateFormed(LocalDate.parse("2019-12-27"))
                        .dateOfBirth(LocalDate.parse("2019-12-27"))
                        .doingBusinessAsNames(listOf("string"))
                        .email("string")
                        .firstName("string")
                        .identifications(
                            listOf(
                                LegalEntityAssociationCreateParams.ChildLegalEntityCreate
                                    .IdentificationCreateRequest
                                    .builder()
                                    .idNumber("string")
                                    .idType(
                                        LegalEntityAssociationCreateParams.ChildLegalEntityCreate
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
                            LegalEntityAssociationCreateParams.ChildLegalEntityCreate
                                .LegalEntityType
                                .BUSINESS
                        )
                        .legalStructure(
                            LegalEntityAssociationCreateParams.ChildLegalEntityCreate.LegalStructure
                                .CORPORATION
                        )
                        .metadata(
                            LegalEntityAssociationCreateParams.ChildLegalEntityCreate.Metadata
                                .builder()
                                .build()
                        )
                        .phoneNumbers(
                            listOf(
                                LegalEntityAssociationCreateParams.ChildLegalEntityCreate
                                    .PhoneNumber
                                    .builder()
                                    .phoneNumber("string")
                                    .build()
                            )
                        )
                        .website("string")
                        .build()
                )
                .childLegalEntityId("string")
                .ownershipPercentage(123L)
                .title("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.parentLegalEntityId()).isEqualTo("string")
        assertThat(body.relationshipTypes())
            .isEqualTo(listOf(LegalEntityAssociationCreateParams.RelationshipType.BENEFICIAL_OWNER))
        assertThat(body.childLegalEntity())
            .isEqualTo(
                LegalEntityAssociationCreateParams.ChildLegalEntityCreate.builder()
                    .addresses(
                        listOf(
                            LegalEntityAssociationCreateParams.ChildLegalEntityCreate
                                .LegalEntityAddressCreateRequest
                                .builder()
                                .country("string")
                                .line1("string")
                                .locality("string")
                                .postalCode("string")
                                .region("string")
                                .addressTypes(
                                    listOf(
                                        LegalEntityAssociationCreateParams.ChildLegalEntityCreate
                                            .LegalEntityAddressCreateRequest
                                            .AddressType
                                            .BUSINESS
                                    )
                                )
                                .line2("string")
                                .build()
                        )
                    )
                    .businessName("string")
                    .dateFormed(LocalDate.parse("2019-12-27"))
                    .dateOfBirth(LocalDate.parse("2019-12-27"))
                    .doingBusinessAsNames(listOf("string"))
                    .email("string")
                    .firstName("string")
                    .identifications(
                        listOf(
                            LegalEntityAssociationCreateParams.ChildLegalEntityCreate
                                .IdentificationCreateRequest
                                .builder()
                                .idNumber("string")
                                .idType(
                                    LegalEntityAssociationCreateParams.ChildLegalEntityCreate
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
                        LegalEntityAssociationCreateParams.ChildLegalEntityCreate.LegalEntityType
                            .BUSINESS
                    )
                    .legalStructure(
                        LegalEntityAssociationCreateParams.ChildLegalEntityCreate.LegalStructure
                            .CORPORATION
                    )
                    .metadata(
                        LegalEntityAssociationCreateParams.ChildLegalEntityCreate.Metadata.builder()
                            .build()
                    )
                    .phoneNumbers(
                        listOf(
                            LegalEntityAssociationCreateParams.ChildLegalEntityCreate.PhoneNumber
                                .builder()
                                .phoneNumber("string")
                                .build()
                        )
                    )
                    .website("string")
                    .build()
            )
        assertThat(body.childLegalEntityId()).isEqualTo("string")
        assertThat(body.ownershipPercentage()).isEqualTo(123L)
        assertThat(body.title()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            LegalEntityAssociationCreateParams.builder()
                .parentLegalEntityId("string")
                .relationshipTypes(
                    listOf(LegalEntityAssociationCreateParams.RelationshipType.BENEFICIAL_OWNER)
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.parentLegalEntityId()).isEqualTo("string")
        assertThat(body.relationshipTypes())
            .isEqualTo(listOf(LegalEntityAssociationCreateParams.RelationshipType.BENEFICIAL_OWNER))
    }
}
