// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LegalEntityUpdateParamsTest {

    @Test
    fun createLegalEntityUpdateParams() {
        LegalEntityUpdateParams.builder()
            .id("id")
            .addAddress(
                LegalEntityUpdateParams.LegalEntityAddressCreateRequest.builder()
                    .country("country")
                    .line1("line1")
                    .locality("locality")
                    .postalCode("postal_code")
                    .region("region")
                    .addAddressType(
                        LegalEntityUpdateParams.LegalEntityAddressCreateRequest.AddressType.BUSINESS
                    )
                    .line2("line2")
                    .build()
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
            .dateFormed(LocalDate.parse("2019-12-27"))
            .dateOfBirth(LocalDate.parse("2019-12-27"))
            .addDoingBusinessAsName("string")
            .email("email")
            .firstName("first_name")
            .addIdentification(
                LegalEntityUpdateParams.IdentificationCreateRequest.builder()
                    .idNumber("id_number")
                    .idType(LegalEntityUpdateParams.IdentificationCreateRequest.IdType.AR_CUIL)
                    .issuingCountry("issuing_country")
                    .build()
            )
            .lastName("last_name")
            .legalStructure(LegalEntityUpdateParams.LegalStructure.CORPORATION)
            .metadata(
                LegalEntityUpdateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
            .middleName("middle_name")
            .addPhoneNumber(
                LegalEntityUpdateParams.PhoneNumber.builder().phoneNumber("phone_number").build()
            )
            .politicallyExposedPerson(true)
            .preferredName("preferred_name")
            .prefix("prefix")
            .riskRating(LegalEntityUpdateParams.RiskRating.LOW)
            .suffix("suffix")
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
    }

    @Test
    fun body() {
        val params =
            LegalEntityUpdateParams.builder()
                .id("id")
                .addAddress(
                    LegalEntityUpdateParams.LegalEntityAddressCreateRequest.builder()
                        .country("country")
                        .line1("line1")
                        .locality("locality")
                        .postalCode("postal_code")
                        .region("region")
                        .addAddressType(
                            LegalEntityUpdateParams.LegalEntityAddressCreateRequest.AddressType
                                .BUSINESS
                        )
                        .line2("line2")
                        .build()
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
                .dateFormed(LocalDate.parse("2019-12-27"))
                .dateOfBirth(LocalDate.parse("2019-12-27"))
                .addDoingBusinessAsName("string")
                .email("email")
                .firstName("first_name")
                .addIdentification(
                    LegalEntityUpdateParams.IdentificationCreateRequest.builder()
                        .idNumber("id_number")
                        .idType(LegalEntityUpdateParams.IdentificationCreateRequest.IdType.AR_CUIL)
                        .issuingCountry("issuing_country")
                        .build()
                )
                .lastName("last_name")
                .legalStructure(LegalEntityUpdateParams.LegalStructure.CORPORATION)
                .metadata(
                    LegalEntityUpdateParams.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .middleName("middle_name")
                .addPhoneNumber(
                    LegalEntityUpdateParams.PhoneNumber.builder()
                        .phoneNumber("phone_number")
                        .build()
                )
                .politicallyExposedPerson(true)
                .preferredName("preferred_name")
                .prefix("prefix")
                .riskRating(LegalEntityUpdateParams.RiskRating.LOW)
                .suffix("suffix")
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
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.addresses())
            .contains(
                listOf(
                    LegalEntityUpdateParams.LegalEntityAddressCreateRequest.builder()
                        .country("country")
                        .line1("line1")
                        .locality("locality")
                        .postalCode("postal_code")
                        .region("region")
                        .addAddressType(
                            LegalEntityUpdateParams.LegalEntityAddressCreateRequest.AddressType
                                .BUSINESS
                        )
                        .line2("line2")
                        .build()
                )
            )
        assertThat(body.bankSettings())
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
        assertThat(body.businessName()).contains("business_name")
        assertThat(body.citizenshipCountry()).contains("citizenship_country")
        assertThat(body.dateFormed()).contains(LocalDate.parse("2019-12-27"))
        assertThat(body.dateOfBirth()).contains(LocalDate.parse("2019-12-27"))
        assertThat(body.doingBusinessAsNames()).contains(listOf("string"))
        assertThat(body.email()).contains("email")
        assertThat(body.firstName()).contains("first_name")
        assertThat(body.identifications())
            .contains(
                listOf(
                    LegalEntityUpdateParams.IdentificationCreateRequest.builder()
                        .idNumber("id_number")
                        .idType(LegalEntityUpdateParams.IdentificationCreateRequest.IdType.AR_CUIL)
                        .issuingCountry("issuing_country")
                        .build()
                )
            )
        assertThat(body.lastName()).contains("last_name")
        assertThat(body.legalStructure())
            .contains(LegalEntityUpdateParams.LegalStructure.CORPORATION)
        assertThat(body.metadata())
            .contains(
                LegalEntityUpdateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(body.middleName()).contains("middle_name")
        assertThat(body.phoneNumbers())
            .contains(
                listOf(
                    LegalEntityUpdateParams.PhoneNumber.builder()
                        .phoneNumber("phone_number")
                        .build()
                )
            )
        assertThat(body.politicallyExposedPerson()).contains(true)
        assertThat(body.preferredName()).contains("preferred_name")
        assertThat(body.prefix()).contains("prefix")
        assertThat(body.riskRating()).contains(LegalEntityUpdateParams.RiskRating.LOW)
        assertThat(body.suffix()).contains("suffix")
        assertThat(body.wealthAndEmploymentDetails())
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
        assertThat(body.website()).contains("website")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = LegalEntityUpdateParams.builder().id("id").build()
        val body = params._body()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = LegalEntityUpdateParams.builder().id("id").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
