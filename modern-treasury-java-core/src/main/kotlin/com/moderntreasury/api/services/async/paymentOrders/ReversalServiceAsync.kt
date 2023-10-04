// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async.paymentOrders

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.PaymentOrderReversalCreateParams
import com.moderntreasury.api.models.PaymentOrderReversalListPageAsync
import com.moderntreasury.api.models.PaymentOrderReversalListParams
import com.moderntreasury.api.models.PaymentOrderReversalRetrieveParams
import com.moderntreasury.api.models.Reversal
import java.util.concurrent.CompletableFuture

interface ReversalServiceAsync {

    /** Create a reversal for a payment order. */
    @JvmOverloads
    fun create(
        params: PaymentOrderReversalCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Reversal>

    /** Get details on a single reversal of a payment order. */
    @JvmOverloads
    fun retrieve(
        params: PaymentOrderReversalRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Reversal>

    /** Get a list of all reversals of a payment order. */
    @JvmOverloads
    fun list(
        params: PaymentOrderReversalListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<PaymentOrderReversalListPageAsync>
}
