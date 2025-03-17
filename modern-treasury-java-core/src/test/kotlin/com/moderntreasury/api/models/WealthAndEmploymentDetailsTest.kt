// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WealthAndEmploymentDetailsTest {

    @Test
    fun createWealthAndEmploymentDetails() {
        val wealthAndEmploymentDetails =
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
        assertThat(wealthAndEmploymentDetails).isNotNull
        assertThat(wealthAndEmploymentDetails.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(wealthAndEmploymentDetails.annualIncome()).contains(0L)
        assertThat(wealthAndEmploymentDetails.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(wealthAndEmploymentDetails.discardedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(wealthAndEmploymentDetails.employerCountry()).contains("employer_country")
        assertThat(wealthAndEmploymentDetails.employerName()).contains("employer_name")
        assertThat(wealthAndEmploymentDetails.employerState()).contains("employer_state")
        assertThat(wealthAndEmploymentDetails.employmentStatus())
            .contains(WealthAndEmploymentDetails.EmploymentStatus.EMPLOYED)
        assertThat(wealthAndEmploymentDetails.incomeCountry()).contains("income_country")
        assertThat(wealthAndEmploymentDetails.incomeSource())
            .contains(WealthAndEmploymentDetails.IncomeSource.FAMILY_SUPPORT)
        assertThat(wealthAndEmploymentDetails.incomeState()).contains("income_state")
        assertThat(wealthAndEmploymentDetails.industry())
            .contains(WealthAndEmploymentDetails.Industry.ACCOUNTING)
        assertThat(wealthAndEmploymentDetails.liveMode()).isEqualTo(true)
        assertThat(wealthAndEmploymentDetails.object_()).isEqualTo("object")
        assertThat(wealthAndEmploymentDetails.occupation())
            .contains(WealthAndEmploymentDetails.Occupation.CONSULTING)
        assertThat(wealthAndEmploymentDetails.sourceOfFunds())
            .contains(WealthAndEmploymentDetails.SourceOfFunds.ALIMONY)
        assertThat(wealthAndEmploymentDetails.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(wealthAndEmploymentDetails.wealthSource())
            .contains(WealthAndEmploymentDetails.WealthSource.BUSINESS_SALE)
    }
}
