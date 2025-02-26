// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.PaymentFlow
import com.moderntreasury.api.models.PaymentFlowCreateParams
import com.moderntreasury.api.models.PaymentFlowListPage
import com.moderntreasury.api.models.PaymentFlowListParams
import com.moderntreasury.api.models.PaymentFlowRetrieveParams
import com.moderntreasury.api.models.PaymentFlowUpdateParams

interface PaymentFlowService {

    /** create payment_flow */
    @JvmOverloads
    fun create(
        params: PaymentFlowCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentFlow

    /** get payment_flow */
    @JvmOverloads
    fun retrieve(
        params: PaymentFlowRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentFlow

    /** update payment_flow */
    @JvmOverloads
    fun update(
        params: PaymentFlowUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentFlow

    /** list payment_flows */
    @JvmOverloads
    fun list(
        params: PaymentFlowListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentFlowListPage
}
