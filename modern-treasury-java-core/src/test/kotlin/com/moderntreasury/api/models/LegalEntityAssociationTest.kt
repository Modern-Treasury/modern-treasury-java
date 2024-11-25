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
                .childLegalEntity(
                    LegalEntityAssociation.ChildLegalEntity.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addresses(
                            listOf(
                                LegalEntityAssociation.ChildLegalEntity.LegalEntityAddress.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .addressTypes(
                                        listOf(
                                            LegalEntityAssociation.ChildLegalEntity
                                                .LegalEntityAddress
                                                .AddressType
                                                .BUSINESS
                                        )
                                    )
                                    .country("country")
                                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .line1("line1")
                                    .line2("line2")
                                    .liveMode(true)
                                    .locality("locality")
                                    .object_("object")
                                    .postalCode("postal_code")
                                    .region("region")
                                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                        )
                        .bankSettings(
                            BankSettings.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .backupWithholdingPercentage(0L)
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .enableBackupWithholding(true)
                                .liveMode(true)
                                .object_("object")
                                .privacyOptOut(true)
                                .regulationO(true)
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .businessName("business_name")
                        .citizenshipCountry("citizenship_country")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dateFormed(LocalDate.parse("2019-12-27"))
                        .dateOfBirth(LocalDate.parse("2019-12-27"))
                        .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .doingBusinessAsNames(listOf("string"))
                        .email("email")
                        .firstName("first_name")
                        .identifications(
                            listOf(
                                LegalEntityAssociation.ChildLegalEntity.Identification.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .idType(
                                        LegalEntityAssociation.ChildLegalEntity.Identification
                                            .IdType
                                            .AR_CUIL
                                    )
                                    .issuingCountry("issuing_country")
                                    .liveMode(true)
                                    .object_("object")
                                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                        )
                        .lastName("last_name")
                        .legalEntityType(
                            LegalEntityAssociation.ChildLegalEntity.LegalEntityType.BUSINESS
                        )
                        .legalStructure(
                            LegalEntityAssociation.ChildLegalEntity.LegalStructure.CORPORATION
                        )
                        .liveMode(true)
                        .metadata(
                            LegalEntityAssociation.ChildLegalEntity.Metadata.builder().build()
                        )
                        .middleName("middle_name")
                        .object_("object")
                        .phoneNumbers(
                            listOf(
                                LegalEntityAssociation.ChildLegalEntity.PhoneNumber.builder()
                                    .phoneNumber("phone_number")
                                    .build()
                            )
                        )
                        .politicallyExposedPerson(true)
                        .preferredName("preferred_name")
                        .prefix("prefix")
                        .riskRating(LegalEntityAssociation.ChildLegalEntity.RiskRating.LOW)
                        .suffix("suffix")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .wealthAndEmploymentDetails(
                            WealthAndEmploymentDetails.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .annualIncome(0L)
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .employerCountry("employer_country")
                                .employerName("employer_name")
                                .employerState("employer_state")
                                .employmentStatus(
                                    WealthAndEmploymentDetails.EmploymentStatus.EMPLOYED
                                )
                                .incomeCountry("income_country")
                                .incomeSource(
                                    WealthAndEmploymentDetails.IncomeSource.FAMILY_SUPPORT
                                )
                                .incomeState("income_state")
                                .industry(WealthAndEmploymentDetails.Industry.ACCOUNTING)
                                .liveMode(true)
                                .object_("object")
                                .occupation(WealthAndEmploymentDetails.Occupation.CONSULTING)
                                .sourceOfFunds(WealthAndEmploymentDetails.SourceOfFunds.ALIMONY)
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .wealthSource(WealthAndEmploymentDetails.WealthSource.BUSINESS_SALE)
                                .build()
                        )
                        .website("website")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .liveMode(true)
                .object_("object")
                .ownershipPercentage(0L)
                .parentLegalEntityId("parent_legal_entity_id")
                .relationshipTypes(listOf(LegalEntityAssociation.RelationshipType.BENEFICIAL_OWNER))
                .title("title")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(legalEntityAssociation).isNotNull
        assertThat(legalEntityAssociation.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(legalEntityAssociation.childLegalEntity())
            .isEqualTo(
                LegalEntityAssociation.ChildLegalEntity.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addresses(
                        listOf(
                            LegalEntityAssociation.ChildLegalEntity.LegalEntityAddress.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .addressTypes(
                                    listOf(
                                        LegalEntityAssociation.ChildLegalEntity.LegalEntityAddress
                                            .AddressType
                                            .BUSINESS
                                    )
                                )
                                .country("country")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .line1("line1")
                                .line2("line2")
                                .liveMode(true)
                                .locality("locality")
                                .object_("object")
                                .postalCode("postal_code")
                                .region("region")
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                    )
                    .bankSettings(
                        BankSettings.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .backupWithholdingPercentage(0L)
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .enableBackupWithholding(true)
                            .liveMode(true)
                            .object_("object")
                            .privacyOptOut(true)
                            .regulationO(true)
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .businessName("business_name")
                    .citizenshipCountry("citizenship_country")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dateFormed(LocalDate.parse("2019-12-27"))
                    .dateOfBirth(LocalDate.parse("2019-12-27"))
                    .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .doingBusinessAsNames(listOf("string"))
                    .email("email")
                    .firstName("first_name")
                    .identifications(
                        listOf(
                            LegalEntityAssociation.ChildLegalEntity.Identification.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .idType(
                                    LegalEntityAssociation.ChildLegalEntity.Identification.IdType
                                        .AR_CUIL
                                )
                                .issuingCountry("issuing_country")
                                .liveMode(true)
                                .object_("object")
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                    )
                    .lastName("last_name")
                    .legalEntityType(
                        LegalEntityAssociation.ChildLegalEntity.LegalEntityType.BUSINESS
                    )
                    .legalStructure(
                        LegalEntityAssociation.ChildLegalEntity.LegalStructure.CORPORATION
                    )
                    .liveMode(true)
                    .metadata(LegalEntityAssociation.ChildLegalEntity.Metadata.builder().build())
                    .middleName("middle_name")
                    .object_("object")
                    .phoneNumbers(
                        listOf(
                            LegalEntityAssociation.ChildLegalEntity.PhoneNumber.builder()
                                .phoneNumber("phone_number")
                                .build()
                        )
                    )
                    .politicallyExposedPerson(true)
                    .preferredName("preferred_name")
                    .prefix("prefix")
                    .riskRating(LegalEntityAssociation.ChildLegalEntity.RiskRating.LOW)
                    .suffix("suffix")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .wealthAndEmploymentDetails(
                        WealthAndEmploymentDetails.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .annualIncome(0L)
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .employerCountry("employer_country")
                            .employerName("employer_name")
                            .employerState("employer_state")
                            .employmentStatus(WealthAndEmploymentDetails.EmploymentStatus.EMPLOYED)
                            .incomeCountry("income_country")
                            .incomeSource(WealthAndEmploymentDetails.IncomeSource.FAMILY_SUPPORT)
                            .incomeState("income_state")
                            .industry(WealthAndEmploymentDetails.Industry.ACCOUNTING)
                            .liveMode(true)
                            .object_("object")
                            .occupation(WealthAndEmploymentDetails.Occupation.CONSULTING)
                            .sourceOfFunds(WealthAndEmploymentDetails.SourceOfFunds.ALIMONY)
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .wealthSource(WealthAndEmploymentDetails.WealthSource.BUSINESS_SALE)
                            .build()
                    )
                    .website("website")
                    .build()
            )
        assertThat(legalEntityAssociation.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(legalEntityAssociation.discardedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(legalEntityAssociation.liveMode()).isEqualTo(true)
        assertThat(legalEntityAssociation.object_()).isEqualTo("object")
        assertThat(legalEntityAssociation.ownershipPercentage()).contains(0L)
        assertThat(legalEntityAssociation.parentLegalEntityId()).isEqualTo("parent_legal_entity_id")
        assertThat(legalEntityAssociation.relationshipTypes())
            .containsExactly(LegalEntityAssociation.RelationshipType.BENEFICIAL_OWNER)
        assertThat(legalEntityAssociation.title()).contains("title")
        assertThat(legalEntityAssociation.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
