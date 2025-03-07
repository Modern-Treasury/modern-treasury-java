// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.PaymentFlow
import com.moderntreasury.api.models.PaymentFlowCreateParams
import com.moderntreasury.api.models.PaymentFlowListPage
import com.moderntreasury.api.models.PaymentFlowListParams
import com.moderntreasury.api.models.PaymentFlowRetrieveParams
import com.moderntreasury.api.models.PaymentFlowUpdateParams

interface PaymentFlowService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** create payment_flow */
    fun create(params: PaymentFlowCreateParams): PaymentFlow = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: PaymentFlowCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentFlow

    /** get payment_flow */
    fun retrieve(params: PaymentFlowRetrieveParams): PaymentFlow =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: PaymentFlowRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentFlow

    /** update payment_flow */
    fun update(params: PaymentFlowUpdateParams): PaymentFlow = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: PaymentFlowUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentFlow

    /** list payment_flows */
    fun list(): PaymentFlowListPage = list(PaymentFlowListParams.none())

    /** @see [list] */
    fun list(
        params: PaymentFlowListParams = PaymentFlowListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentFlowListPage

    /** @see [list] */
    fun list(params: PaymentFlowListParams = PaymentFlowListParams.none()): PaymentFlowListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): PaymentFlowListPage =
        list(PaymentFlowListParams.none(), requestOptions)

    /**
     * A view of [PaymentFlowService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/payment_flows`, but is otherwise the same as
         * [PaymentFlowService.create].
         */
        @MustBeClosed
        fun create(params: PaymentFlowCreateParams): HttpResponseFor<PaymentFlow> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: PaymentFlowCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentFlow>

        /**
         * Returns a raw HTTP response for `get /api/payment_flows/{id}`, but is otherwise the same
         * as [PaymentFlowService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: PaymentFlowRetrieveParams): HttpResponseFor<PaymentFlow> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: PaymentFlowRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentFlow>

        /**
         * Returns a raw HTTP response for `patch /api/payment_flows/{id}`, but is otherwise the
         * same as [PaymentFlowService.update].
         */
        @MustBeClosed
        fun update(params: PaymentFlowUpdateParams): HttpResponseFor<PaymentFlow> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: PaymentFlowUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentFlow>

        /**
         * Returns a raw HTTP response for `get /api/payment_flows`, but is otherwise the same as
         * [PaymentFlowService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<PaymentFlowListPage> = list(PaymentFlowListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PaymentFlowListParams = PaymentFlowListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentFlowListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PaymentFlowListParams = PaymentFlowListParams.none()
        ): HttpResponseFor<PaymentFlowListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PaymentFlowListPage> =
            list(PaymentFlowListParams.none(), requestOptions)
    }
}
