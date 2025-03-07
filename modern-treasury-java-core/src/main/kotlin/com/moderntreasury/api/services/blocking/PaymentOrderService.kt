// File generated from our OpenAPI spec by Stainless.

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
    fun create(params: PaymentOrderCreateParams): PaymentOrder =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: PaymentOrderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentOrder

    /** Get details on a single payment order */
    fun retrieve(params: PaymentOrderRetrieveParams): PaymentOrder =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: PaymentOrderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentOrder

    /** Update a payment order */
    fun update(params: PaymentOrderUpdateParams): PaymentOrder =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: PaymentOrderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentOrder

    /** Get a list of all payment orders */
    fun list(): PaymentOrderListPage = list(PaymentOrderListParams.none())

    /** @see [list] */
    fun list(
        params: PaymentOrderListParams = PaymentOrderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentOrderListPage

    /** @see [list] */
    fun list(params: PaymentOrderListParams = PaymentOrderListParams.none()): PaymentOrderListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): PaymentOrderListPage =
        list(PaymentOrderListParams.none(), requestOptions)

    /** Create a new payment order asynchronously */
    fun createAsync(params: PaymentOrderCreateAsyncParams): AsyncResponse =
        createAsync(params, RequestOptions.none())

    /** @see [createAsync] */
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
        @MustBeClosed
        fun create(params: PaymentOrderCreateParams): HttpResponseFor<PaymentOrder> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: PaymentOrderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentOrder>

        /**
         * Returns a raw HTTP response for `get /api/payment_orders/{id}`, but is otherwise the same
         * as [PaymentOrderService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: PaymentOrderRetrieveParams): HttpResponseFor<PaymentOrder> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: PaymentOrderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentOrder>

        /**
         * Returns a raw HTTP response for `patch /api/payment_orders/{id}`, but is otherwise the
         * same as [PaymentOrderService.update].
         */
        @MustBeClosed
        fun update(params: PaymentOrderUpdateParams): HttpResponseFor<PaymentOrder> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: PaymentOrderUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentOrder>

        /**
         * Returns a raw HTTP response for `get /api/payment_orders`, but is otherwise the same as
         * [PaymentOrderService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<PaymentOrderListPage> = list(PaymentOrderListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PaymentOrderListParams = PaymentOrderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentOrderListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PaymentOrderListParams = PaymentOrderListParams.none()
        ): HttpResponseFor<PaymentOrderListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PaymentOrderListPage> =
            list(PaymentOrderListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/payment_orders/create_async`, but is otherwise
         * the same as [PaymentOrderService.createAsync].
         */
        @MustBeClosed
        fun createAsync(params: PaymentOrderCreateAsyncParams): HttpResponseFor<AsyncResponse> =
            createAsync(params, RequestOptions.none())

        /** @see [createAsync] */
        @MustBeClosed
        fun createAsync(
            params: PaymentOrderCreateAsyncParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AsyncResponse>
    }
}
