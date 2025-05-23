// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LegalEntityComplianceDetailTest {

    @Test
    fun create() {
        val legalEntityComplianceDetail =
            LegalEntityComplianceDetail.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .issuer("issuer")
                .liveMode(true)
                .object_("object")
                .tokenExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .tokenIssuedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .tokenUrl("token_url")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .entityValidated(true)
                .validatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(legalEntityComplianceDetail.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(legalEntityComplianceDetail.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(legalEntityComplianceDetail.discardedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(legalEntityComplianceDetail.issuer()).isEqualTo("issuer")
        assertThat(legalEntityComplianceDetail.liveMode()).isEqualTo(true)
        assertThat(legalEntityComplianceDetail.object_()).isEqualTo("object")
        assertThat(legalEntityComplianceDetail.tokenExpiresAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(legalEntityComplianceDetail.tokenIssuedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(legalEntityComplianceDetail.tokenUrl()).contains("token_url")
        assertThat(legalEntityComplianceDetail.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(legalEntityComplianceDetail.entityValidated()).isEqualTo(true)
        assertThat(legalEntityComplianceDetail.validatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val legalEntityComplianceDetail =
            LegalEntityComplianceDetail.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .issuer("issuer")
                .liveMode(true)
                .object_("object")
                .tokenExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .tokenIssuedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .tokenUrl("token_url")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .entityValidated(true)
                .validatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedLegalEntityComplianceDetail =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(legalEntityComplianceDetail),
                jacksonTypeRef<LegalEntityComplianceDetail>(),
            )

        assertThat(roundtrippedLegalEntityComplianceDetail).isEqualTo(legalEntityComplianceDetail)
    }
}
