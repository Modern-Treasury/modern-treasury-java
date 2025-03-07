// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking.paymentOrders

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.PaymentOrderReversalCreateParams
import com.moderntreasury.api.models.PaymentOrderReversalListPage
import com.moderntreasury.api.models.PaymentOrderReversalListParams
import com.moderntreasury.api.models.PaymentOrderReversalRetrieveParams
import com.moderntreasury.api.models.Reversal

interface ReversalService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a reversal for a payment order. */
    fun create(params: PaymentOrderReversalCreateParams): Reversal =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: PaymentOrderReversalCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Reversal

    /** Get details on a single reversal of a payment order. */
    fun retrieve(params: PaymentOrderReversalRetrieveParams): Reversal =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: PaymentOrderReversalRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Reversal

    /** Get a list of all reversals of a payment order. */
    fun list(params: PaymentOrderReversalListParams): PaymentOrderReversalListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: PaymentOrderReversalListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentOrderReversalListPage

    /** A view of [ReversalService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/payment_orders/{payment_order_id}/reversals`,
         * but is otherwise the same as [ReversalService.create].
         */
        @MustBeClosed
        fun create(params: PaymentOrderReversalCreateParams): HttpResponseFor<Reversal> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: PaymentOrderReversalCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Reversal>

        /**
         * Returns a raw HTTP response for `get
         * /api/payment_orders/{payment_order_id}/reversals/{reversal_id}`, but is otherwise the
         * same as [ReversalService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: PaymentOrderReversalRetrieveParams): HttpResponseFor<Reversal> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: PaymentOrderReversalRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Reversal>

        /**
         * Returns a raw HTTP response for `get /api/payment_orders/{payment_order_id}/reversals`,
         * but is otherwise the same as [ReversalService.list].
         */
        @MustBeClosed
        fun list(
            params: PaymentOrderReversalListParams
        ): HttpResponseFor<PaymentOrderReversalListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PaymentOrderReversalListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentOrderReversalListPage>
    }
}
