// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LegalEntityAddressCreateRequestTest {

    @Test
    fun create() {
        val legalEntityAddressCreateRequest =
            LegalEntityAddressCreateRequest.builder()
                .country("country")
                .line1("line1")
                .locality("locality")
                .addAddressType(LegalEntityAddressCreateRequest.AddressType.BUSINESS)
                .line2("line2")
                .postalCode("postal_code")
                .primary(true)
                .region("region")
                .build()

        assertThat(legalEntityAddressCreateRequest.country()).contains("country")
        assertThat(legalEntityAddressCreateRequest.line1()).contains("line1")
        assertThat(legalEntityAddressCreateRequest.locality()).contains("locality")
        assertThat(legalEntityAddressCreateRequest.addressTypes().getOrNull())
            .containsExactly(LegalEntityAddressCreateRequest.AddressType.BUSINESS)
        assertThat(legalEntityAddressCreateRequest.line2()).contains("line2")
        assertThat(legalEntityAddressCreateRequest.postalCode()).contains("postal_code")
        assertThat(legalEntityAddressCreateRequest.primary()).contains(true)
        assertThat(legalEntityAddressCreateRequest.region()).contains("region")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val legalEntityAddressCreateRequest =
            LegalEntityAddressCreateRequest.builder()
                .country("country")
                .line1("line1")
                .locality("locality")
                .addAddressType(LegalEntityAddressCreateRequest.AddressType.BUSINESS)
                .line2("line2")
                .postalCode("postal_code")
                .primary(true)
                .region("region")
                .build()

        val roundtrippedLegalEntityAddressCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(legalEntityAddressCreateRequest),
                jacksonTypeRef<LegalEntityAddressCreateRequest>(),
            )

        assertThat(roundtrippedLegalEntityAddressCreateRequest)
            .isEqualTo(legalEntityAddressCreateRequest)
    }
}
