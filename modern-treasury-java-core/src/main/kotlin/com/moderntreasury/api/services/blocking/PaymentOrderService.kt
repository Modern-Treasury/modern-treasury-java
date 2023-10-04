// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.AsyncResponse
import com.moderntreasury.api.models.PaymentOrder
import com.moderntreasury.api.models.PaymentOrderCreateAsyncParams
import com.moderntreasury.api.models.PaymentOrderCreateParams
import com.moderntreasury.api.models.PaymentOrderListPage
import com.moderntreasury.api.models.PaymentOrderListParams
import com.moderntreasury.api.models.PaymentOrderRetrieveParams
import com.moderntreasury.api.models.PaymentOrderUpdateParams
import com.moderntreasury.api.services.blocking.paymentOrders.ReversalService

interface PaymentOrderService {

    fun reversals(): ReversalService

    /** Create a new Payment Order */
    @JvmOverloads
    fun create(
        params: PaymentOrderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PaymentOrder

    /** Get details on a single payment order */
    @JvmOverloads
    fun retrieve(
        params: PaymentOrderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PaymentOrder

    /** Update a payment order */
    @JvmOverloads
    fun update(
        params: PaymentOrderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PaymentOrder

    /** Get a list of all payment orders */
    @JvmOverloads
    fun list(
        params: PaymentOrderListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PaymentOrderListPage

    /** Create a new payment order asynchronously */
    @JvmOverloads
    fun createAsync(
        params: PaymentOrderCreateAsyncParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AsyncResponse
}
