// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ConnectionLegalEntityTest {

    @Test
    fun createConnectionLegalEntity() {
        val connectionLegalEntity =
            ConnectionLegalEntity.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .connectionId("string")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .legalEntityId("string")
                .liveMode(true)
                .object_("string")
                .status(ConnectionLegalEntity.Status.COMPLETED)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(connectionLegalEntity).isNotNull
        assertThat(connectionLegalEntity.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(connectionLegalEntity.connectionId()).contains("string")
        assertThat(connectionLegalEntity.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(connectionLegalEntity.discardedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(connectionLegalEntity.legalEntityId()).contains("string")
        assertThat(connectionLegalEntity.liveMode()).contains(true)
        assertThat(connectionLegalEntity.object_()).contains("string")
        assertThat(connectionLegalEntity.status()).contains(ConnectionLegalEntity.Status.COMPLETED)
        assertThat(connectionLegalEntity.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
