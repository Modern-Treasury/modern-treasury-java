// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
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

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun reversals(): ReversalService

    /** Create a new Payment Order */
    @JvmOverloads
    fun create(
        params: PaymentOrderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentOrder

    /** Get details on a single payment order */
    @JvmOverloads
    fun retrieve(
        params: PaymentOrderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentOrder

    /** Update a payment order */
    @JvmOverloads
    fun update(
        params: PaymentOrderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentOrder

    /** Get a list of all payment orders */
    @JvmOverloads
    fun list(
        params: PaymentOrderListParams = PaymentOrderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentOrderListPage

    /** Get a list of all payment orders */
    fun list(requestOptions: RequestOptions): PaymentOrderListPage =
        list(PaymentOrderListParams.none(), requestOptions)

    /** Create a new payment order asynchronously */
    @JvmOverloads
    fun createAsync(
        params: PaymentOrderCreateAsyncParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AsyncResponse

    /**
     * A view of [PaymentOrderService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        fun reversals(): ReversalService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/payment_orders`, but is otherwise the same as
         * [PaymentOrderService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: PaymentOrderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentOrder>

        /**
         * Returns a raw HTTP response for `get /api/payment_orders/{id}`, but is otherwise the same
         * as [PaymentOrderService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: PaymentOrderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentOrder>

        /**
         * Returns a raw HTTP response for `patch /api/payment_orders/{id}`, but is otherwise the
         * same as [PaymentOrderService.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: PaymentOrderUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentOrder>

        /**
         * Returns a raw HTTP response for `get /api/payment_orders`, but is otherwise the same as
         * [PaymentOrderService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: PaymentOrderListParams = PaymentOrderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentOrderListPage>

        /**
         * Returns a raw HTTP response for `get /api/payment_orders`, but is otherwise the same as
         * [PaymentOrderService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PaymentOrderListPage> =
            list(PaymentOrderListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/payment_orders/create_async`, but is otherwise
         * the same as [PaymentOrderService.createAsync].
         */
        @JvmOverloads
        @MustBeClosed
        fun createAsync(
            params: PaymentOrderCreateAsyncParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AsyncResponse>
    }
}
