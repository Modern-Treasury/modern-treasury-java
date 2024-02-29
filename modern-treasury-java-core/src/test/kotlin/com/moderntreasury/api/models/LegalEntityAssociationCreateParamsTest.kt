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
            .relationshipTypes(
                listOf(LegalEntityAssociationCreateParams.RelationshipType.BENEFICIAL_OWNER)
            )
            .associatedLegalEntity(
                LegalEntityAssociationCreateParams.AssociatedLegalEntityCreate.builder()
                    .addresses(
                        listOf(
                            LegalEntityAssociationCreateParams.AssociatedLegalEntityCreate
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
                            LegalEntityAssociationCreateParams.AssociatedLegalEntityCreate
                                .IdentificationCreateRequest
                                .builder()
                                .idNumber("string")
                                .idType(
                                    LegalEntityAssociationCreateParams.AssociatedLegalEntityCreate
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
                        LegalEntityAssociationCreateParams.AssociatedLegalEntityCreate
                            .LegalEntityType
                            .BUSINESS
                    )
                    .metadata(
                        LegalEntityAssociationCreateParams.AssociatedLegalEntityCreate.Metadata
                            .builder()
                            .build()
                    )
                    .phoneNumbers(
                        listOf(
                            LegalEntityAssociationCreateParams.AssociatedLegalEntityCreate
                                .PhoneNumber
                                .builder()
                                .phoneNumber("string")
                                .build()
                        )
                    )
                    .website("string")
                    .build()
            )
            .associatedLegalEntityId("string")
            .associatorLegalEntityId("string")
            .ownershipPercentage(123L)
            .title("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            LegalEntityAssociationCreateParams.builder()
                .relationshipTypes(
                    listOf(LegalEntityAssociationCreateParams.RelationshipType.BENEFICIAL_OWNER)
                )
                .associatedLegalEntity(
                    LegalEntityAssociationCreateParams.AssociatedLegalEntityCreate.builder()
                        .addresses(
                            listOf(
                                LegalEntityAssociationCreateParams.AssociatedLegalEntityCreate
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
                                LegalEntityAssociationCreateParams.AssociatedLegalEntityCreate
                                    .IdentificationCreateRequest
                                    .builder()
                                    .idNumber("string")
                                    .idType(
                                        LegalEntityAssociationCreateParams
                                            .AssociatedLegalEntityCreate
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
                            LegalEntityAssociationCreateParams.AssociatedLegalEntityCreate
                                .LegalEntityType
                                .BUSINESS
                        )
                        .metadata(
                            LegalEntityAssociationCreateParams.AssociatedLegalEntityCreate.Metadata
                                .builder()
                                .build()
                        )
                        .phoneNumbers(
                            listOf(
                                LegalEntityAssociationCreateParams.AssociatedLegalEntityCreate
                                    .PhoneNumber
                                    .builder()
                                    .phoneNumber("string")
                                    .build()
                            )
                        )
                        .website("string")
                        .build()
                )
                .associatedLegalEntityId("string")
                .associatorLegalEntityId("string")
                .ownershipPercentage(123L)
                .title("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.relationshipTypes())
            .isEqualTo(listOf(LegalEntityAssociationCreateParams.RelationshipType.BENEFICIAL_OWNER))
        assertThat(body.associatedLegalEntity())
            .isEqualTo(
                LegalEntityAssociationCreateParams.AssociatedLegalEntityCreate.builder()
                    .addresses(
                        listOf(
                            LegalEntityAssociationCreateParams.AssociatedLegalEntityCreate
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
                            LegalEntityAssociationCreateParams.AssociatedLegalEntityCreate
                                .IdentificationCreateRequest
                                .builder()
                                .idNumber("string")
                                .idType(
                                    LegalEntityAssociationCreateParams.AssociatedLegalEntityCreate
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
                        LegalEntityAssociationCreateParams.AssociatedLegalEntityCreate
                            .LegalEntityType
                            .BUSINESS
                    )
                    .metadata(
                        LegalEntityAssociationCreateParams.AssociatedLegalEntityCreate.Metadata
                            .builder()
                            .build()
                    )
                    .phoneNumbers(
                        listOf(
                            LegalEntityAssociationCreateParams.AssociatedLegalEntityCreate
                                .PhoneNumber
                                .builder()
                                .phoneNumber("string")
                                .build()
                        )
                    )
                    .website("string")
                    .build()
            )
        assertThat(body.associatedLegalEntityId()).isEqualTo("string")
        assertThat(body.associatorLegalEntityId()).isEqualTo("string")
        assertThat(body.ownershipPercentage()).isEqualTo(123L)
        assertThat(body.title()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            LegalEntityAssociationCreateParams.builder()
                .relationshipTypes(
                    listOf(LegalEntityAssociationCreateParams.RelationshipType.BENEFICIAL_OWNER)
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.relationshipTypes())
            .isEqualTo(listOf(LegalEntityAssociationCreateParams.RelationshipType.BENEFICIAL_OWNER))
    }
}
