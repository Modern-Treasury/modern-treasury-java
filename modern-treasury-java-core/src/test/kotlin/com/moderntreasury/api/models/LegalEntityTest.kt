// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LegalEntityTest {

    @Test
    fun createLegalEntity() {
        val legalEntity =
            LegalEntity.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addresses(
                    listOf(
                        LegalEntity.LegalEntityAddress.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .addressTypes(
                                listOf(LegalEntity.LegalEntityAddress.AddressType.BUSINESS)
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
                        LegalEntity.Identification.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .idType(LegalEntity.Identification.IdType.AR_CUIL)
                            .issuingCountry("issuing_country")
                            .liveMode(true)
                            .object_("object")
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                )
                .lastName("last_name")
                .legalEntityAssociations(
                    listOf(
                        LegalEntityAssociation.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .childLegalEntity(
                                LegalEntityAssociation.ChildLegalEntity.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .addresses(
                                        listOf(
                                            LegalEntityAssociation.ChildLegalEntity
                                                .LegalEntityAddress
                                                .builder()
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
                                                .createdAt(
                                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                                )
                                                .discardedAt(
                                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                                )
                                                .line1("line1")
                                                .line2("line2")
                                                .liveMode(true)
                                                .locality("locality")
                                                .object_("object")
                                                .postalCode("postal_code")
                                                .region("region")
                                                .updatedAt(
                                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                                )
                                                .build()
                                        )
                                    )
                                    .bankSettings(
                                        BankSettings.builder()
                                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                            .backupWithholdingPercentage(0L)
                                            .createdAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .discardedAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .enableBackupWithholding(true)
                                            .liveMode(true)
                                            .object_("object")
                                            .privacyOptOut(true)
                                            .regulationO(true)
                                            .updatedAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
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
                                            LegalEntityAssociation.ChildLegalEntity.Identification
                                                .builder()
                                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                                .createdAt(
                                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                                )
                                                .discardedAt(
                                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                                )
                                                .idType(
                                                    LegalEntityAssociation.ChildLegalEntity
                                                        .Identification
                                                        .IdType
                                                        .AR_CUIL
                                                )
                                                .issuingCountry("issuing_country")
                                                .liveMode(true)
                                                .object_("object")
                                                .updatedAt(
                                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                                )
                                                .build()
                                        )
                                    )
                                    .lastName("last_name")
                                    .legalEntityType(
                                        LegalEntityAssociation.ChildLegalEntity.LegalEntityType
                                            .BUSINESS
                                    )
                                    .legalStructure(
                                        LegalEntityAssociation.ChildLegalEntity.LegalStructure
                                            .CORPORATION
                                    )
                                    .liveMode(true)
                                    .metadata(
                                        LegalEntityAssociation.ChildLegalEntity.Metadata.builder()
                                            .build()
                                    )
                                    .middleName("middle_name")
                                    .object_("object")
                                    .phoneNumbers(
                                        listOf(
                                            LegalEntityAssociation.ChildLegalEntity.PhoneNumber
                                                .builder()
                                                .phoneNumber("phone_number")
                                                .build()
                                        )
                                    )
                                    .politicallyExposedPerson(true)
                                    .preferredName("preferred_name")
                                    .prefix("prefix")
                                    .riskRating(
                                        LegalEntityAssociation.ChildLegalEntity.RiskRating.LOW
                                    )
                                    .suffix("suffix")
                                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .wealthAndEmploymentDetails(
                                        WealthAndEmploymentDetails.builder()
                                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                            .annualIncome(0L)
                                            .createdAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .discardedAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .employerCountry("employer_country")
                                            .employerName("employer_name")
                                            .employerState("employer_state")
                                            .employmentStatus(
                                                WealthAndEmploymentDetails.EmploymentStatus.EMPLOYED
                                            )
                                            .incomeCountry("income_country")
                                            .incomeSource(
                                                WealthAndEmploymentDetails.IncomeSource
                                                    .FAMILY_SUPPORT
                                            )
                                            .incomeState("income_state")
                                            .industry(
                                                WealthAndEmploymentDetails.Industry.ACCOUNTING
                                            )
                                            .liveMode(true)
                                            .object_("object")
                                            .occupation(
                                                WealthAndEmploymentDetails.Occupation.CONSULTING
                                            )
                                            .sourceOfFunds(
                                                WealthAndEmploymentDetails.SourceOfFunds.ALIMONY
                                            )
                                            .updatedAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .wealthSource(
                                                WealthAndEmploymentDetails.WealthSource
                                                    .BUSINESS_SALE
                                            )
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
                            .relationshipTypes(
                                listOf(LegalEntityAssociation.RelationshipType.BENEFICIAL_OWNER)
                            )
                            .title("title")
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                )
                .legalEntityType(LegalEntity.LegalEntityType.BUSINESS)
                .legalStructure(LegalEntity.LegalStructure.CORPORATION)
                .liveMode(true)
                .metadata(LegalEntity.Metadata.builder().build())
                .middleName("middle_name")
                .object_("object")
                .phoneNumbers(
                    listOf(LegalEntity.PhoneNumber.builder().phoneNumber("phone_number").build())
                )
                .politicallyExposedPerson(true)
                .preferredName("preferred_name")
                .prefix("prefix")
                .riskRating(LegalEntity.RiskRating.LOW)
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
        assertThat(legalEntity).isNotNull
        assertThat(legalEntity.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(legalEntity.addresses())
            .containsExactly(
                LegalEntity.LegalEntityAddress.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addressTypes(listOf(LegalEntity.LegalEntityAddress.AddressType.BUSINESS))
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
        assertThat(legalEntity.bankSettings())
            .contains(
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
        assertThat(legalEntity.businessName()).contains("business_name")
        assertThat(legalEntity.citizenshipCountry()).contains("citizenship_country")
        assertThat(legalEntity.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(legalEntity.dateFormed()).contains(LocalDate.parse("2019-12-27"))
        assertThat(legalEntity.dateOfBirth()).contains(LocalDate.parse("2019-12-27"))
        assertThat(legalEntity.discardedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(legalEntity.doingBusinessAsNames()).containsExactly("string")
        assertThat(legalEntity.email()).contains("email")
        assertThat(legalEntity.firstName()).contains("first_name")
        assertThat(legalEntity.identifications())
            .containsExactly(
                LegalEntity.Identification.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .idType(LegalEntity.Identification.IdType.AR_CUIL)
                    .issuingCountry("issuing_country")
                    .liveMode(true)
                    .object_("object")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(legalEntity.lastName()).contains("last_name")
        assertThat(legalEntity.legalEntityAssociations().get())
            .containsExactly(
                LegalEntityAssociation.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .childLegalEntity(
                        LegalEntityAssociation.ChildLegalEntity.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .addresses(
                                listOf(
                                    LegalEntityAssociation.ChildLegalEntity.LegalEntityAddress
                                        .builder()
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
                                        .discardedAt(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
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
                                        .discardedAt(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
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
                                    .wealthSource(
                                        WealthAndEmploymentDetails.WealthSource.BUSINESS_SALE
                                    )
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
                    .relationshipTypes(
                        listOf(LegalEntityAssociation.RelationshipType.BENEFICIAL_OWNER)
                    )
                    .title("title")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(legalEntity.legalEntityType()).isEqualTo(LegalEntity.LegalEntityType.BUSINESS)
        assertThat(legalEntity.legalStructure()).contains(LegalEntity.LegalStructure.CORPORATION)
        assertThat(legalEntity.liveMode()).isEqualTo(true)
        assertThat(legalEntity.metadata()).isEqualTo(LegalEntity.Metadata.builder().build())
        assertThat(legalEntity.middleName()).contains("middle_name")
        assertThat(legalEntity.object_()).isEqualTo("object")
        assertThat(legalEntity.phoneNumbers())
            .containsExactly(LegalEntity.PhoneNumber.builder().phoneNumber("phone_number").build())
        assertThat(legalEntity.politicallyExposedPerson()).contains(true)
        assertThat(legalEntity.preferredName()).contains("preferred_name")
        assertThat(legalEntity.prefix()).contains("prefix")
        assertThat(legalEntity.riskRating()).contains(LegalEntity.RiskRating.LOW)
        assertThat(legalEntity.suffix()).contains("suffix")
        assertThat(legalEntity.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(legalEntity.wealthAndEmploymentDetails())
            .contains(
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
        assertThat(legalEntity.website()).contains("website")
    }
}
