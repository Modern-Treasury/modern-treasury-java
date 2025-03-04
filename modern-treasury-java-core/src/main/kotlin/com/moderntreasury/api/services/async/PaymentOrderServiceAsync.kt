// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
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

interface PaymentOrderServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun reversals(): ReversalServiceAsync

    /** Create a new Payment Order */
    @JvmOverloads
    fun create(
        params: PaymentOrderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentOrder>

    /** Get details on a single payment order */
    @JvmOverloads
    fun retrieve(
        params: PaymentOrderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentOrder>

    /** Update a payment order */
    @JvmOverloads
    fun update(
        params: PaymentOrderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentOrder>

    /** Get a list of all payment orders */
    @JvmOverloads
    fun list(
        params: PaymentOrderListParams = PaymentOrderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentOrderListPageAsync>

    /** Get a list of all payment orders */
    fun list(requestOptions: RequestOptions): CompletableFuture<PaymentOrderListPageAsync> =
        list(PaymentOrderListParams.none(), requestOptions)

    /** Create a new payment order asynchronously */
    @JvmOverloads
    fun createAsync(
        params: PaymentOrderCreateAsyncParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AsyncResponse>

    /**
     * A view of [PaymentOrderServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        fun reversals(): ReversalServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/payment_orders`, but is otherwise the same as
         * [PaymentOrderServiceAsync.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: PaymentOrderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentOrder>>

        /**
         * Returns a raw HTTP response for `get /api/payment_orders/{id}`, but is otherwise the same
         * as [PaymentOrderServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: PaymentOrderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentOrder>>

        /**
         * Returns a raw HTTP response for `patch /api/payment_orders/{id}`, but is otherwise the
         * same as [PaymentOrderServiceAsync.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: PaymentOrderUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentOrder>>

        /**
         * Returns a raw HTTP response for `get /api/payment_orders`, but is otherwise the same as
         * [PaymentOrderServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: PaymentOrderListParams = PaymentOrderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentOrderListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /api/payment_orders`, but is otherwise the same as
         * [PaymentOrderServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PaymentOrderListPageAsync>> =
            list(PaymentOrderListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/payment_orders/create_async`, but is otherwise
         * the same as [PaymentOrderServiceAsync.createAsync].
         */
        @JvmOverloads
        @MustBeClosed
        fun createAsync(
            params: PaymentOrderCreateAsyncParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AsyncResponse>>
    }
}
