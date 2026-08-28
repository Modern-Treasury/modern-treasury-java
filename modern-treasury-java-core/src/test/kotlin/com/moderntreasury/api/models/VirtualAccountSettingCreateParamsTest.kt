// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VirtualAccountSettingCreateParamsTest {

    @Test
    fun create() {
        VirtualAccountSettingCreateParams.builder()
            .allocationType("allocation_type")
            .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .allocationIdentifier("allocation_identifier")
            .allocationLength(0L)
            .allocationRangeEnd("allocation_range_end")
            .allocationRangeStart("allocation_range_start")
            .externalId("external_id")
            .generatedAllocationIdentifierLength(0L)
            .build()
    }

    @Test
    fun body() {
        val params =
            VirtualAccountSettingCreateParams.builder()
                .allocationType("allocation_type")
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .allocationIdentifier("allocation_identifier")
                .allocationLength(0L)
                .allocationRangeEnd("allocation_range_end")
                .allocationRangeStart("allocation_range_start")
                .externalId("external_id")
                .generatedAllocationIdentifierLength(0L)
                .build()

        val body = params._body()

        assertThat(body.allocationType()).isEqualTo("allocation_type")
        assertThat(body.internalAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.allocationIdentifier()).contains("allocation_identifier")
        assertThat(body.allocationLength()).contains(0L)
        assertThat(body.allocationRangeEnd()).contains("allocation_range_end")
        assertThat(body.allocationRangeStart()).contains("allocation_range_start")
        assertThat(body.externalId()).contains("external_id")
        assertThat(body.generatedAllocationIdentifierLength()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            VirtualAccountSettingCreateParams.builder()
                .allocationType("allocation_type")
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertThat(body.allocationType()).isEqualTo("allocation_type")
        assertThat(body.internalAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
