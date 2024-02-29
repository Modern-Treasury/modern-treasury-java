// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LegalEntityAssociationTest {

    @Test
    fun createLegalEntityAssociation() {
        val legalEntityAssociation =
            LegalEntityAssociation.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .associatedLegalEntity(
                    LegalEntityAssociation.AssociatedLegalEntity.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addresses(
                            listOf(
                                LegalEntityAssociation.AssociatedLegalEntity.LegalEntityAddress
                                    .builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .addressTypes(listOf("string"))
                                    .country("string")
                                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .line1("string")
                                    .line2("string")
                                    .liveMode(true)
                                    .locality("string")
                                    .object_("string")
                                    .postalCode("string")
                                    .region("string")
                                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                        )
                        .businessName("string")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dateOfBirth(LocalDate.parse("2019-12-27"))
                        .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .doingBusinessAsNames(listOf("string"))
                        .email("string")
                        .firstName("string")
                        .identifications(
                            listOf(
                                LegalEntityAssociation.AssociatedLegalEntity.Identification
                                    .builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .idType(
                                        LegalEntityAssociation.AssociatedLegalEntity.Identification
                                            .IdType
                                            .AR_CUIL
                                    )
                                    .issuingCountry("string")
                                    .liveMode(true)
                                    .object_("string")
                                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                        )
                        .lastName("string")
                        .legalEntityType(
                            LegalEntityAssociation.AssociatedLegalEntity.LegalEntityType.BUSINESS
                        )
                        .liveMode(true)
                        .metadata(
                            LegalEntityAssociation.AssociatedLegalEntity.Metadata.builder().build()
                        )
                        .object_("string")
                        .phoneNumbers(
                            listOf(
                                LegalEntityAssociation.AssociatedLegalEntity.PhoneNumber.builder()
                                    .phoneNumber("string")
                                    .build()
                            )
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .website("string")
                        .build()
                )
                .associatorLegalEntityId("string")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .liveMode(true)
                .object_("string")
                .ownershipPercentage(123L)
                .relationshipTypes(listOf(LegalEntityAssociation.RelationshipType.BENEFICIAL_OWNER))
                .title("string")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(legalEntityAssociation).isNotNull
        assertThat(legalEntityAssociation.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(legalEntityAssociation.associatedLegalEntity())
            .contains(
                LegalEntityAssociation.AssociatedLegalEntity.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addresses(
                        listOf(
                            LegalEntityAssociation.AssociatedLegalEntity.LegalEntityAddress
                                .builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .addressTypes(listOf("string"))
                                .country("string")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .line1("string")
                                .line2("string")
                                .liveMode(true)
                                .locality("string")
                                .object_("string")
                                .postalCode("string")
                                .region("string")
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                    )
                    .businessName("string")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dateOfBirth(LocalDate.parse("2019-12-27"))
                    .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .doingBusinessAsNames(listOf("string"))
                    .email("string")
                    .firstName("string")
                    .identifications(
                        listOf(
                            LegalEntityAssociation.AssociatedLegalEntity.Identification.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .idType(
                                    LegalEntityAssociation.AssociatedLegalEntity.Identification
                                        .IdType
                                        .AR_CUIL
                                )
                                .issuingCountry("string")
                                .liveMode(true)
                                .object_("string")
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                    )
                    .lastName("string")
                    .legalEntityType(
                        LegalEntityAssociation.AssociatedLegalEntity.LegalEntityType.BUSINESS
                    )
                    .liveMode(true)
                    .metadata(
                        LegalEntityAssociation.AssociatedLegalEntity.Metadata.builder().build()
                    )
                    .object_("string")
                    .phoneNumbers(
                        listOf(
                            LegalEntityAssociation.AssociatedLegalEntity.PhoneNumber.builder()
                                .phoneNumber("string")
                                .build()
                        )
                    )
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .website("string")
                    .build()
            )
        assertThat(legalEntityAssociation.associatorLegalEntityId()).contains("string")
        assertThat(legalEntityAssociation.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(legalEntityAssociation.discardedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(legalEntityAssociation.liveMode()).contains(true)
        assertThat(legalEntityAssociation.object_()).contains("string")
        assertThat(legalEntityAssociation.ownershipPercentage()).contains(123L)
        assertThat(legalEntityAssociation.relationshipTypes().get())
            .containsExactly(LegalEntityAssociation.RelationshipType.BENEFICIAL_OWNER)
        assertThat(legalEntityAssociation.title()).contains("string")
        assertThat(legalEntityAssociation.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
