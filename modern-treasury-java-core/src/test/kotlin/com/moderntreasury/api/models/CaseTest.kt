// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CaseTest {

    @Test
    fun create() {
        val case_ =
            Case.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .liveMode(true)
                .object_("object")
                .addRequestedAction(
                    Case.RequestedAction.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .category(
                            Case.RequestedAction.Category
                                .ONBOARDING_ARTICLES_OF_INCORPORATION_FAILURE
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .field(Case.RequestedAction.Field.ARTICLES_OF_INCORPORATION)
                        .instructions("instructions")
                        .liveMode(true)
                        .object_("object")
                        .addReason("string")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .addResolvedAction(
                    Case.RequestedAction.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .category(
                            Case.RequestedAction.Category
                                .ONBOARDING_ARTICLES_OF_INCORPORATION_FAILURE
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .field(Case.RequestedAction.Field.ARTICLES_OF_INCORPORATION)
                        .instructions("instructions")
                        .liveMode(true)
                        .object_("object")
                        .addReason("string")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .status(Case.Status.OPEN)
                .subjectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .subjectType("subject_type")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(case_.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(case_.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(case_.liveMode()).isEqualTo(true)
        assertThat(case_.object_()).isEqualTo("object")
        assertThat(case_.requestedActions())
            .containsExactly(
                Case.RequestedAction.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .category(
                        Case.RequestedAction.Category.ONBOARDING_ARTICLES_OF_INCORPORATION_FAILURE
                    )
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .field(Case.RequestedAction.Field.ARTICLES_OF_INCORPORATION)
                    .instructions("instructions")
                    .liveMode(true)
                    .object_("object")
                    .addReason("string")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(case_.resolvedActions())
            .containsExactly(
                Case.RequestedAction.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .category(
                        Case.RequestedAction.Category.ONBOARDING_ARTICLES_OF_INCORPORATION_FAILURE
                    )
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .field(Case.RequestedAction.Field.ARTICLES_OF_INCORPORATION)
                    .instructions("instructions")
                    .liveMode(true)
                    .object_("object")
                    .addReason("string")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(case_.status()).isEqualTo(Case.Status.OPEN)
        assertThat(case_.subjectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(case_.subjectType()).isEqualTo("subject_type")
        assertThat(case_.updatedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val case_ =
            Case.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .liveMode(true)
                .object_("object")
                .addRequestedAction(
                    Case.RequestedAction.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .category(
                            Case.RequestedAction.Category
                                .ONBOARDING_ARTICLES_OF_INCORPORATION_FAILURE
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .field(Case.RequestedAction.Field.ARTICLES_OF_INCORPORATION)
                        .instructions("instructions")
                        .liveMode(true)
                        .object_("object")
                        .addReason("string")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .addResolvedAction(
                    Case.RequestedAction.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .category(
                            Case.RequestedAction.Category
                                .ONBOARDING_ARTICLES_OF_INCORPORATION_FAILURE
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .field(Case.RequestedAction.Field.ARTICLES_OF_INCORPORATION)
                        .instructions("instructions")
                        .liveMode(true)
                        .object_("object")
                        .addReason("string")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .status(Case.Status.OPEN)
                .subjectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .subjectType("subject_type")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedCase =
            jsonMapper.readValue(jsonMapper.writeValueAsString(case_), jacksonTypeRef<Case>())

        assertThat(roundtrippedCase).isEqualTo(case_)
    }
}
