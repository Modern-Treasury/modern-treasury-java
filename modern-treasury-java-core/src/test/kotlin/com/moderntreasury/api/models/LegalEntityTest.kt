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
                            .addressTypes(listOf("string"))
                            .country("string")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .line1("string")
                            .line2("string")
                            .liveMode(true)
                            .locality("string")
                            .object_("string")
                            .postalCode("string")
                            .region("string")
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                )
                .businessName("string")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateOfBirth(LocalDate.parse("2019-12-27"))
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .doingBusinessAsNames(listOf("string"))
                .email("string")
                .firstName("string")
                .identifications(
                    listOf(
                        LegalEntity.Identification.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .idType(LegalEntity.Identification.IdType.AR_CUIL)
                            .issuingCountry("string")
                            .liveMode(true)
                            .object_("string")
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                )
                .lastName("string")
                .legalEntityType(LegalEntity.LegalEntityType.BUSINESS)
                .liveMode(true)
                .metadata(LegalEntity.Metadata.builder().build())
                .object_("string")
                .phoneNumbers(
                    listOf(LegalEntity.PhoneNumber.builder().phoneNumber("string").build())
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .website("string")
                .build()
        assertThat(legalEntity).isNotNull
        assertThat(legalEntity.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(legalEntity.addresses().get())
            .containsExactly(
                LegalEntity.LegalEntityAddress.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addressTypes(listOf("string"))
                    .country("string")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .line1("string")
                    .line2("string")
                    .liveMode(true)
                    .locality("string")
                    .object_("string")
                    .postalCode("string")
                    .region("string")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(legalEntity.businessName()).contains("string")
        assertThat(legalEntity.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(legalEntity.dateOfBirth()).contains(LocalDate.parse("2019-12-27"))
        assertThat(legalEntity.discardedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(legalEntity.doingBusinessAsNames().get()).containsExactly("string")
        assertThat(legalEntity.email()).contains("string")
        assertThat(legalEntity.firstName()).contains("string")
        assertThat(legalEntity.identifications().get())
            .containsExactly(
                LegalEntity.Identification.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .idType(LegalEntity.Identification.IdType.AR_CUIL)
                    .issuingCountry("string")
                    .liveMode(true)
                    .object_("string")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(legalEntity.lastName()).contains("string")
        assertThat(legalEntity.legalEntityType()).contains(LegalEntity.LegalEntityType.BUSINESS)
        assertThat(legalEntity.liveMode()).contains(true)
        assertThat(legalEntity.metadata()).contains(LegalEntity.Metadata.builder().build())
        assertThat(legalEntity.object_()).contains("string")
        assertThat(legalEntity.phoneNumbers().get())
            .containsExactly(LegalEntity.PhoneNumber.builder().phoneNumber("string").build())
        assertThat(legalEntity.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(legalEntity.website()).contains("string")
    }
}
