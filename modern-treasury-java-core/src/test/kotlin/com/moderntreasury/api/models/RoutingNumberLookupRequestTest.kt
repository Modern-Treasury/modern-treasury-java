// File generated from our OpenAPI spec by Stainless.

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
                        .country("country")
                        .line1("line1")
                        .line2("line2")
                        .locality("locality")
                        .postalCode("postal_code")
                        .region("region")
                        .build()
                )
                .bankName("bank_name")
                .routingNumber("routing_number")
                .routingNumberType(RoutingNumberLookupRequest.RoutingNumberType.ABA)
                .sanctions(RoutingNumberLookupRequest.Sanctions.builder().build())
                .supportedPaymentTypes(listOf(RoutingNumberLookupRequest.SupportedPaymentType.ACH))
                .build()
        assertThat(routingNumberLookupRequest).isNotNull
        assertThat(routingNumberLookupRequest.bankAddress())
            .contains(
                RoutingNumberLookupRequest.AddressRequest.builder()
                    .country("country")
                    .line1("line1")
                    .line2("line2")
                    .locality("locality")
                    .postalCode("postal_code")
                    .region("region")
                    .build()
            )
        assertThat(routingNumberLookupRequest.bankName()).contains("bank_name")
        assertThat(routingNumberLookupRequest.routingNumber()).contains("routing_number")
        assertThat(routingNumberLookupRequest.routingNumberType())
            .contains(RoutingNumberLookupRequest.RoutingNumberType.ABA)
        assertThat(routingNumberLookupRequest.sanctions())
            .contains(RoutingNumberLookupRequest.Sanctions.builder().build())
        assertThat(routingNumberLookupRequest.supportedPaymentTypes().get())
            .containsExactly(RoutingNumberLookupRequest.SupportedPaymentType.ACH)
    }
}
