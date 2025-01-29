// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RoutingDetailCreateParamsTest {

    @Test
    fun createRoutingDetailCreateParams() {
        RoutingDetailCreateParams.builder()
            .accountsType(RoutingDetailCreateParams.AccountsType.EXTERNAL_ACCOUNTS)
            .accountId("account_id")
            .routingNumber("routing_number")
            .routingNumberType(RoutingDetailCreateParams.RoutingNumberType.ABA)
            .paymentType(RoutingDetailCreateParams.PaymentType.ACH)
            .build()
    }

    @Test
    fun body() {
        val params =
            RoutingDetailCreateParams.builder()
                .accountsType(RoutingDetailCreateParams.AccountsType.EXTERNAL_ACCOUNTS)
                .accountId("account_id")
                .routingNumber("routing_number")
                .routingNumberType(RoutingDetailCreateParams.RoutingNumberType.ABA)
                .paymentType(RoutingDetailCreateParams.PaymentType.ACH)
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.routingNumber()).isEqualTo("routing_number")
        assertThat(body.routingNumberType())
            .isEqualTo(RoutingDetailCreateParams.RoutingNumberType.ABA)
        assertThat(body.paymentType()).contains(RoutingDetailCreateParams.PaymentType.ACH)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RoutingDetailCreateParams.builder()
                .accountsType(RoutingDetailCreateParams.AccountsType.EXTERNAL_ACCOUNTS)
                .accountId("account_id")
                .routingNumber("routing_number")
                .routingNumberType(RoutingDetailCreateParams.RoutingNumberType.ABA)
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.routingNumber()).isEqualTo("routing_number")
        assertThat(body.routingNumberType())
            .isEqualTo(RoutingDetailCreateParams.RoutingNumberType.ABA)
    }

    @Test
    fun getPathParam() {
        val params =
            RoutingDetailCreateParams.builder()
                .accountsType(RoutingDetailCreateParams.AccountsType.EXTERNAL_ACCOUNTS)
                .accountId("account_id")
                .routingNumber("routing_number")
                .routingNumberType(RoutingDetailCreateParams.RoutingNumberType.ABA)
                .build()
        assertThat(params).isNotNull
        // path param "accountsType"
        assertThat(params.getPathParam(0))
            .isEqualTo(RoutingDetailCreateParams.AccountsType.EXTERNAL_ACCOUNTS.toString())
        // path param "accountId"
        assertThat(params.getPathParam(1)).isEqualTo("account_id")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
