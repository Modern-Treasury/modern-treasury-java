// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.PaymentFlow
import com.moderntreasury.api.models.PaymentFlowCreateParams
import com.moderntreasury.api.models.PaymentFlowListPageAsync
import com.moderntreasury.api.models.PaymentFlowListParams
import com.moderntreasury.api.models.PaymentFlowRetrieveParams
import com.moderntreasury.api.models.PaymentFlowUpdateParams
import java.util.concurrent.CompletableFuture

interface PaymentFlowServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** create payment_flow */
    fun create(params: PaymentFlowCreateParams): CompletableFuture<PaymentFlow> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: PaymentFlowCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentFlow>

    /** get payment_flow */
    fun retrieve(id: String): CompletableFuture<PaymentFlow> =
        retrieve(id, PaymentFlowRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: PaymentFlowRetrieveParams = PaymentFlowRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentFlow> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: PaymentFlowRetrieveParams = PaymentFlowRetrieveParams.none(),
    ): CompletableFuture<PaymentFlow> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: PaymentFlowRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentFlow>

    /** @see [retrieve] */
    fun retrieve(params: PaymentFlowRetrieveParams): CompletableFuture<PaymentFlow> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<PaymentFlow> =
        retrieve(id, PaymentFlowRetrieveParams.none(), requestOptions)

    /** update payment_flow */
    fun update(id: String, params: PaymentFlowUpdateParams): CompletableFuture<PaymentFlow> =
        update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        id: String,
        params: PaymentFlowUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentFlow> = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(params: PaymentFlowUpdateParams): CompletableFuture<PaymentFlow> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: PaymentFlowUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentFlow>

    /** list payment_flows */
    fun list(): CompletableFuture<PaymentFlowListPageAsync> = list(PaymentFlowListParams.none())

    /** @see [list] */
    fun list(
        params: PaymentFlowListParams = PaymentFlowListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentFlowListPageAsync>

    /** @see [list] */
    fun list(
        params: PaymentFlowListParams = PaymentFlowListParams.none()
    ): CompletableFuture<PaymentFlowListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<PaymentFlowListPageAsync> =
        list(PaymentFlowListParams.none(), requestOptions)

    /**
     * A view of [PaymentFlowServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/payment_flows`, but is otherwise the same as
         * [PaymentFlowServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: PaymentFlowCreateParams
        ): CompletableFuture<HttpResponseFor<PaymentFlow>> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: PaymentFlowCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentFlow>>

        /**
         * Returns a raw HTTP response for `get /api/payment_flows/{id}`, but is otherwise the same
         * as [PaymentFlowServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<PaymentFlow>> =
            retrieve(id, PaymentFlowRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PaymentFlowRetrieveParams = PaymentFlowRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentFlow>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PaymentFlowRetrieveParams = PaymentFlowRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<PaymentFlow>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: PaymentFlowRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentFlow>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: PaymentFlowRetrieveParams
        ): CompletableFuture<HttpResponseFor<PaymentFlow>> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PaymentFlow>> =
            retrieve(id, PaymentFlowRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/payment_flows/{id}`, but is otherwise the
         * same as [PaymentFlowServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: PaymentFlowUpdateParams,
        ): CompletableFuture<HttpResponseFor<PaymentFlow>> =
            update(id, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            params: PaymentFlowUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentFlow>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: PaymentFlowUpdateParams
        ): CompletableFuture<HttpResponseFor<PaymentFlow>> = update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: PaymentFlowUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentFlow>>

        /**
         * Returns a raw HTTP response for `get /api/payment_flows`, but is otherwise the same as
         * [PaymentFlowServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<PaymentFlowListPageAsync>> =
            list(PaymentFlowListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PaymentFlowListParams = PaymentFlowListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentFlowListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PaymentFlowListParams = PaymentFlowListParams.none()
        ): CompletableFuture<HttpResponseFor<PaymentFlowListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PaymentFlowListPageAsync>> =
            list(PaymentFlowListParams.none(), requestOptions)
    }
}
