// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

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
    @JvmOverloads
    fun create(
        params: PaymentFlowCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentFlow>

    /** get payment_flow */
    @JvmOverloads
    fun retrieve(
        params: PaymentFlowRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentFlow>

    /** update payment_flow */
    @JvmOverloads
    fun update(
        params: PaymentFlowUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentFlow>

    /** list payment_flows */
    @JvmOverloads
    fun list(
        params: PaymentFlowListParams = PaymentFlowListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentFlowListPageAsync>

    /** list payment_flows */
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
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: PaymentFlowCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentFlow>>

        /**
         * Returns a raw HTTP response for `get /api/payment_flows/{id}`, but is otherwise the same
         * as [PaymentFlowServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: PaymentFlowRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentFlow>>

        /**
         * Returns a raw HTTP response for `patch /api/payment_flows/{id}`, but is otherwise the
         * same as [PaymentFlowServiceAsync.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: PaymentFlowUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentFlow>>

        /**
         * Returns a raw HTTP response for `get /api/payment_flows`, but is otherwise the same as
         * [PaymentFlowServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: PaymentFlowListParams = PaymentFlowListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentFlowListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /api/payment_flows`, but is otherwise the same as
         * [PaymentFlowServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PaymentFlowListPageAsync>> =
            list(PaymentFlowListParams.none(), requestOptions)
    }
}
