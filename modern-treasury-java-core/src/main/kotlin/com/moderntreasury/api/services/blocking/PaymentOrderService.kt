// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
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
import java.util.function.Consumer

interface PaymentOrderService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PaymentOrderService

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
    fun retrieve(id: String): PaymentOrder = retrieve(id, PaymentOrderRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: PaymentOrderRetrieveParams = PaymentOrderRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentOrder = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: PaymentOrderRetrieveParams = PaymentOrderRetrieveParams.none(),
    ): PaymentOrder = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: PaymentOrderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentOrder

    /** @see [retrieve] */
    fun retrieve(params: PaymentOrderRetrieveParams): PaymentOrder =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): PaymentOrder =
        retrieve(id, PaymentOrderRetrieveParams.none(), requestOptions)

    /** Update a payment order */
    fun update(id: String): PaymentOrder = update(id, PaymentOrderUpdateParams.none())

    /** @see [update] */
    fun update(
        id: String,
        params: PaymentOrderUpdateParams = PaymentOrderUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentOrder = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(
        id: String,
        params: PaymentOrderUpdateParams = PaymentOrderUpdateParams.none(),
    ): PaymentOrder = update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: PaymentOrderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentOrder

    /** @see [update] */
    fun update(params: PaymentOrderUpdateParams): PaymentOrder =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(id: String, requestOptions: RequestOptions): PaymentOrder =
        update(id, PaymentOrderUpdateParams.none(), requestOptions)

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

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PaymentOrderService.WithRawResponse

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
        fun retrieve(id: String): HttpResponseFor<PaymentOrder> =
            retrieve(id, PaymentOrderRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PaymentOrderRetrieveParams = PaymentOrderRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentOrder> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PaymentOrderRetrieveParams = PaymentOrderRetrieveParams.none(),
        ): HttpResponseFor<PaymentOrder> = retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: PaymentOrderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentOrder>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: PaymentOrderRetrieveParams): HttpResponseFor<PaymentOrder> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<PaymentOrder> =
            retrieve(id, PaymentOrderRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/payment_orders/{id}`, but is otherwise the
         * same as [PaymentOrderService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<PaymentOrder> =
            update(id, PaymentOrderUpdateParams.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            params: PaymentOrderUpdateParams = PaymentOrderUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentOrder> = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            params: PaymentOrderUpdateParams = PaymentOrderUpdateParams.none(),
        ): HttpResponseFor<PaymentOrder> = update(id, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: PaymentOrderUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentOrder>

        /** @see [update] */
        @MustBeClosed
        fun update(params: PaymentOrderUpdateParams): HttpResponseFor<PaymentOrder> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(id: String, requestOptions: RequestOptions): HttpResponseFor<PaymentOrder> =
            update(id, PaymentOrderUpdateParams.none(), requestOptions)

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
