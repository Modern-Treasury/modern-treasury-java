package com.moderntreasury.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RoutingDetailTest {

    @Test
    fun createRoutingDetail() {
        val routingDetail =
            RoutingDetail.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .object_("string")
                .liveMode(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .routingNumber("string")
                .routingNumberType(RoutingDetail.RoutingNumberType.ABA)
                .paymentType(RoutingDetail.PaymentType.ACH)
                .bankName("string")
                .bankAddress(
                    RoutingDetail.Address.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .object_("string")
                        .liveMode(true)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .line1("string")
                        .line2("string")
                        .locality("string")
                        .region("string")
                        .postalCode("string")
                        .country("string")
                        .build()
                )
                .build()
        assertThat(routingDetail).isNotNull
        assertThat(routingDetail.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(routingDetail.object_()).isEqualTo("string")
        assertThat(routingDetail.liveMode()).isEqualTo(true)
        assertThat(routingDetail.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(routingDetail.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(routingDetail.discardedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(routingDetail.routingNumber()).isEqualTo("string")
        assertThat(routingDetail.routingNumberType()).isEqualTo(RoutingDetail.RoutingNumberType.ABA)
        assertThat(routingDetail.paymentType()).contains(RoutingDetail.PaymentType.ACH)
        assertThat(routingDetail.bankName()).isEqualTo("string")
        assertThat(routingDetail.bankAddress())
            .contains(
                RoutingDetail.Address.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .object_("string")
                    .liveMode(true)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .line1("string")
                    .line2("string")
                    .locality("string")
                    .region("string")
                    .postalCode("string")
                    .country("string")
                    .build()
            )
    }
}
