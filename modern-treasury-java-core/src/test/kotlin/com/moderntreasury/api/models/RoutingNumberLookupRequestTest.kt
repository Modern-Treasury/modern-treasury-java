package com.moderntreasury.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RoutingNumberLookupRequestTest {

    @Test
    fun createRoutingNumberLookupRequest() {
        val routingNumberLookupRequest =
            RoutingNumberLookupRequest.builder()
                .bankAddress(
                    RoutingNumberLookupRequest.AddressRequest.builder()
                        .country("string")
                        .line1("string")
                        .line2("string")
                        .locality("string")
                        .postalCode("string")
                        .region("string")
                        .build()
                )
                .bankName("string")
                .routingNumber("string")
                .routingNumberType(RoutingNumberLookupRequest.RoutingNumberType.ABA)
                .sanctions(RoutingNumberLookupRequest.Sanctions.builder().build())
                .supportedPaymentTypes(listOf(RoutingNumberLookupRequest.SupportedPaymentType.ACH))
                .build()
        assertThat(routingNumberLookupRequest).isNotNull
        assertThat(routingNumberLookupRequest.routingNumber()).contains("string")
        assertThat(routingNumberLookupRequest.routingNumberType())
            .contains(RoutingNumberLookupRequest.RoutingNumberType.ABA)
        assertThat(routingNumberLookupRequest.supportedPaymentTypes().get())
            .containsExactly(RoutingNumberLookupRequest.SupportedPaymentType.ACH)
        assertThat(routingNumberLookupRequest.bankName()).contains("string")
        assertThat(routingNumberLookupRequest.bankAddress())
            .contains(
                RoutingNumberLookupRequest.AddressRequest.builder()
                    .country("string")
                    .line1("string")
                    .line2("string")
                    .locality("string")
                    .postalCode("string")
                    .region("string")
                    .build()
            )
        assertThat(routingNumberLookupRequest.sanctions())
            .contains(RoutingNumberLookupRequest.Sanctions.builder().build())
    }
}
