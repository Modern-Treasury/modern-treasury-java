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
    fun create(
        paymentOrderId: String,
        params: PaymentOrderReversalCreateParams,
    ): CompletableFuture<Reversal> = create(paymentOrderId, params, RequestOptions.none())

    /** @see [create] */
    fun create(
        paymentOrderId: String,
        params: PaymentOrderReversalCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Reversal> =
        create(params.toBuilder().paymentOrderId(paymentOrderId).build(), requestOptions)

    /** @see [create] */
    fun create(params: PaymentOrderReversalCreateParams): CompletableFuture<Reversal> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: PaymentOrderReversalCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Reversal>

    /** Get details on a single reversal of a payment order. */
    fun retrieve(
        reversalId: String,
        params: PaymentOrderReversalRetrieveParams,
    ): CompletableFuture<Reversal> = retrieve(reversalId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        reversalId: String,
        params: PaymentOrderReversalRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Reversal> =
        retrieve(params.toBuilder().reversalId(reversalId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(params: PaymentOrderReversalRetrieveParams): CompletableFuture<Reversal> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: PaymentOrderReversalRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Reversal>

    /** Get a list of all reversals of a payment order. */
    fun list(paymentOrderId: String): CompletableFuture<PaymentOrderReversalListPageAsync> =
        list(paymentOrderId, PaymentOrderReversalListParams.none())

    /** @see [list] */
    fun list(
        paymentOrderId: String,
        params: PaymentOrderReversalListParams = PaymentOrderReversalListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentOrderReversalListPageAsync> =
        list(params.toBuilder().paymentOrderId(paymentOrderId).build(), requestOptions)

    /** @see [list] */
    fun list(
        paymentOrderId: String,
        params: PaymentOrderReversalListParams = PaymentOrderReversalListParams.none(),
    ): CompletableFuture<PaymentOrderReversalListPageAsync> =
        list(paymentOrderId, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: PaymentOrderReversalListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentOrderReversalListPageAsync>

    /** @see [list] */
    fun list(
        params: PaymentOrderReversalListParams
    ): CompletableFuture<PaymentOrderReversalListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        paymentOrderId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PaymentOrderReversalListPageAsync> =
        list(paymentOrderId, PaymentOrderReversalListParams.none(), requestOptions)

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
            paymentOrderId: String,
            params: PaymentOrderReversalCreateParams,
        ): CompletableFuture<HttpResponseFor<Reversal>> =
            create(paymentOrderId, params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            paymentOrderId: String,
            params: PaymentOrderReversalCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Reversal>> =
            create(params.toBuilder().paymentOrderId(paymentOrderId).build(), requestOptions)

        /** @see [create] */
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
            reversalId: String,
            params: PaymentOrderReversalRetrieveParams,
        ): CompletableFuture<HttpResponseFor<Reversal>> =
            retrieve(reversalId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            reversalId: String,
            params: PaymentOrderReversalRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Reversal>> =
            retrieve(params.toBuilder().reversalId(reversalId).build(), requestOptions)

        /** @see [retrieve] */
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
            paymentOrderId: String
        ): CompletableFuture<HttpResponseFor<PaymentOrderReversalListPageAsync>> =
            list(paymentOrderId, PaymentOrderReversalListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            paymentOrderId: String,
            params: PaymentOrderReversalListParams = PaymentOrderReversalListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentOrderReversalListPageAsync>> =
            list(params.toBuilder().paymentOrderId(paymentOrderId).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        fun list(
            paymentOrderId: String,
            params: PaymentOrderReversalListParams = PaymentOrderReversalListParams.none(),
        ): CompletableFuture<HttpResponseFor<PaymentOrderReversalListPageAsync>> =
            list(paymentOrderId, params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PaymentOrderReversalListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentOrderReversalListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PaymentOrderReversalListParams
        ): CompletableFuture<HttpResponseFor<PaymentOrderReversalListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            paymentOrderId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PaymentOrderReversalListPageAsync>> =
            list(paymentOrderId, PaymentOrderReversalListParams.none(), requestOptions)
    }
}
