// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerTest {

    @Test
    fun createLedger() {
        val ledger =
            Ledger.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .liveMode(true)
                .metadata(Ledger.Metadata.builder().build())
                .name("name")
                .object_("object")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(ledger).isNotNull
        assertThat(ledger.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledger.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledger.description()).contains("description")
        assertThat(ledger.discardedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledger.liveMode()).isEqualTo(true)
        assertThat(ledger.metadata()).isEqualTo(Ledger.Metadata.builder().build())
        assertThat(ledger.name()).isEqualTo("name")
        assertThat(ledger.object_()).isEqualTo("object")
        assertThat(ledger.updatedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
