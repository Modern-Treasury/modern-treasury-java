// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async.paymentOrders

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.PaymentOrderReversalCreateParams
import com.moderntreasury.api.models.PaymentOrderReversalListPageAsync
import com.moderntreasury.api.models.PaymentOrderReversalListParams
import com.moderntreasury.api.models.PaymentOrderReversalRetrieveParams
import com.moderntreasury.api.models.Reversal
import java.util.concurrent.CompletableFuture

interface ReversalServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a reversal for a payment order. */
    fun create(params: PaymentOrderReversalCreateParams): CompletableFuture<Reversal> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: PaymentOrderReversalCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Reversal>

    /** Get details on a single reversal of a payment order. */
    fun retrieve(params: PaymentOrderReversalRetrieveParams): CompletableFuture<Reversal> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: PaymentOrderReversalRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Reversal>

    /** Get a list of all reversals of a payment order. */
    fun list(
        params: PaymentOrderReversalListParams
    ): CompletableFuture<PaymentOrderReversalListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: PaymentOrderReversalListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentOrderReversalListPageAsync>

    /**
     * A view of [ReversalServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/payment_orders/{payment_order_id}/reversals`,
         * but is otherwise the same as [ReversalServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: PaymentOrderReversalCreateParams
        ): CompletableFuture<HttpResponseFor<Reversal>> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: PaymentOrderReversalCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Reversal>>

        /**
         * Returns a raw HTTP response for `get
         * /api/payment_orders/{payment_order_id}/reversals/{reversal_id}`, but is otherwise the
         * same as [ReversalServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: PaymentOrderReversalRetrieveParams
        ): CompletableFuture<HttpResponseFor<Reversal>> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: PaymentOrderReversalRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Reversal>>

        /**
         * Returns a raw HTTP response for `get /api/payment_orders/{payment_order_id}/reversals`,
         * but is otherwise the same as [ReversalServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            params: PaymentOrderReversalListParams
        ): CompletableFuture<HttpResponseFor<PaymentOrderReversalListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PaymentOrderReversalListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentOrderReversalListPageAsync>>
    }
}
