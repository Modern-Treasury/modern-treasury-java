// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.AsyncResponse
import com.moderntreasury.api.models.PaymentOrder
import com.moderntreasury.api.models.PaymentOrderCreateAsyncParams
import com.moderntreasury.api.models.PaymentOrderCreateParams
import com.moderntreasury.api.models.PaymentOrderListPageAsync
import com.moderntreasury.api.models.PaymentOrderListParams
import com.moderntreasury.api.models.PaymentOrderRetrieveParams
import com.moderntreasury.api.models.PaymentOrderUpdateParams
import com.moderntreasury.api.services.async.paymentOrders.ReversalServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PaymentOrderServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PaymentOrderServiceAsync

    fun reversals(): ReversalServiceAsync

    /** Create a new Payment Order */
    fun create(params: PaymentOrderCreateParams): CompletableFuture<PaymentOrder> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: PaymentOrderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentOrder>

    /** Get details on a single payment order */
    fun retrieve(id: String): CompletableFuture<PaymentOrder> =
        retrieve(id, PaymentOrderRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: PaymentOrderRetrieveParams = PaymentOrderRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentOrder> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: PaymentOrderRetrieveParams = PaymentOrderRetrieveParams.none(),
    ): CompletableFuture<PaymentOrder> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: PaymentOrderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentOrder>

    /** @see [retrieve] */
    fun retrieve(params: PaymentOrderRetrieveParams): CompletableFuture<PaymentOrder> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<PaymentOrder> =
        retrieve(id, PaymentOrderRetrieveParams.none(), requestOptions)

    /** Update a payment order */
    fun update(id: String): CompletableFuture<PaymentOrder> =
        update(id, PaymentOrderUpdateParams.none())

    /** @see [update] */
    fun update(
        id: String,
        params: PaymentOrderUpdateParams = PaymentOrderUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentOrder> = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(
        id: String,
        params: PaymentOrderUpdateParams = PaymentOrderUpdateParams.none(),
    ): CompletableFuture<PaymentOrder> = update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: PaymentOrderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentOrder>

    /** @see [update] */
    fun update(params: PaymentOrderUpdateParams): CompletableFuture<PaymentOrder> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(id: String, requestOptions: RequestOptions): CompletableFuture<PaymentOrder> =
        update(id, PaymentOrderUpdateParams.none(), requestOptions)

    /** Get a list of all payment orders */
    fun list(): CompletableFuture<PaymentOrderListPageAsync> = list(PaymentOrderListParams.none())

    /** @see [list] */
    fun list(
        params: PaymentOrderListParams = PaymentOrderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentOrderListPageAsync>

    /** @see [list] */
    fun list(
        params: PaymentOrderListParams = PaymentOrderListParams.none()
    ): CompletableFuture<PaymentOrderListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<PaymentOrderListPageAsync> =
        list(PaymentOrderListParams.none(), requestOptions)

    /** Create a new payment order asynchronously */
    fun createAsync(params: PaymentOrderCreateAsyncParams): CompletableFuture<AsyncResponse> =
        createAsync(params, RequestOptions.none())

    /** @see [createAsync] */
    fun createAsync(
        params: PaymentOrderCreateAsyncParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AsyncResponse>

    /**
     * A view of [PaymentOrderServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PaymentOrderServiceAsync.WithRawResponse

        fun reversals(): ReversalServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/payment_orders`, but is otherwise the same as
         * [PaymentOrderServiceAsync.create].
         */
        fun create(
            params: PaymentOrderCreateParams
        ): CompletableFuture<HttpResponseFor<PaymentOrder>> = create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: PaymentOrderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentOrder>>

        /**
         * Returns a raw HTTP response for `get /api/payment_orders/{id}`, but is otherwise the same
         * as [PaymentOrderServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<PaymentOrder>> =
            retrieve(id, PaymentOrderRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: PaymentOrderRetrieveParams = PaymentOrderRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentOrder>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: PaymentOrderRetrieveParams = PaymentOrderRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<PaymentOrder>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: PaymentOrderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentOrder>>

        /** @see [retrieve] */
        fun retrieve(
            params: PaymentOrderRetrieveParams
        ): CompletableFuture<HttpResponseFor<PaymentOrder>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PaymentOrder>> =
            retrieve(id, PaymentOrderRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/payment_orders/{id}`, but is otherwise the
         * same as [PaymentOrderServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<PaymentOrder>> =
            update(id, PaymentOrderUpdateParams.none())

        /** @see [update] */
        fun update(
            id: String,
            params: PaymentOrderUpdateParams = PaymentOrderUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentOrder>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        fun update(
            id: String,
            params: PaymentOrderUpdateParams = PaymentOrderUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<PaymentOrder>> =
            update(id, params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: PaymentOrderUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentOrder>>

        /** @see [update] */
        fun update(
            params: PaymentOrderUpdateParams
        ): CompletableFuture<HttpResponseFor<PaymentOrder>> = update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PaymentOrder>> =
            update(id, PaymentOrderUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/payment_orders`, but is otherwise the same as
         * [PaymentOrderServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<PaymentOrderListPageAsync>> =
            list(PaymentOrderListParams.none())

        /** @see [list] */
        fun list(
            params: PaymentOrderListParams = PaymentOrderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentOrderListPageAsync>>

        /** @see [list] */
        fun list(
            params: PaymentOrderListParams = PaymentOrderListParams.none()
        ): CompletableFuture<HttpResponseFor<PaymentOrderListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PaymentOrderListPageAsync>> =
            list(PaymentOrderListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/payment_orders/create_async`, but is otherwise
         * the same as [PaymentOrderServiceAsync.createAsync].
         */
        fun createAsync(
            params: PaymentOrderCreateAsyncParams
        ): CompletableFuture<HttpResponseFor<AsyncResponse>> =
            createAsync(params, RequestOptions.none())

        /** @see [createAsync] */
        fun createAsync(
            params: PaymentOrderCreateAsyncParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AsyncResponse>>
    }
}
