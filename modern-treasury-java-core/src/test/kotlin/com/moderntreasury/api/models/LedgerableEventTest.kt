// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerableEventTest {

    @Test
    fun create() {
        val ledgerableEvent =
            LedgerableEvent.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customData(JsonValue.from(mapOf<String, Any>()))
                .description("description")
                .ledgerEventHandlerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .liveMode(true)
                .metadata(
                    LedgerableEvent.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .name("name")
                .object_("object")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(ledgerableEvent.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerableEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerableEvent._customData()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(ledgerableEvent.description()).contains("description")
        assertThat(ledgerableEvent.ledgerEventHandlerId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerableEvent.liveMode()).isEqualTo(true)
        assertThat(ledgerableEvent.metadata())
            .contains(
                LedgerableEvent.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(ledgerableEvent.name()).isEqualTo("name")
        assertThat(ledgerableEvent.object_()).isEqualTo("object")
        assertThat(ledgerableEvent.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ledgerableEvent =
            LedgerableEvent.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customData(JsonValue.from(mapOf<String, Any>()))
                .description("description")
                .ledgerEventHandlerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .liveMode(true)
                .metadata(
                    LedgerableEvent.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .name("name")
                .object_("object")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedLedgerableEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ledgerableEvent),
                jacksonTypeRef<LedgerableEvent>(),
            )

        assertThat(roundtrippedLedgerableEvent).isEqualTo(ledgerableEvent)
    }
}
