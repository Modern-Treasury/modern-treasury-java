// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.AsyncResponse
import com.moderntreasury.api.models.IncomingPaymentDetail
import com.moderntreasury.api.models.IncomingPaymentDetailCreateAsyncParams
import com.moderntreasury.api.models.IncomingPaymentDetailListPageAsync
import com.moderntreasury.api.models.IncomingPaymentDetailListParams
import com.moderntreasury.api.models.IncomingPaymentDetailRetrieveParams
import com.moderntreasury.api.models.IncomingPaymentDetailUpdateParams
import java.util.concurrent.CompletableFuture

interface IncomingPaymentDetailServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get an existing Incoming Payment Detail. */
    fun retrieve(
        params: IncomingPaymentDetailRetrieveParams
    ): CompletableFuture<IncomingPaymentDetail> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: IncomingPaymentDetailRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IncomingPaymentDetail>

    /** Update an existing Incoming Payment Detail. */
    fun update(
        params: IncomingPaymentDetailUpdateParams
    ): CompletableFuture<IncomingPaymentDetail> = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: IncomingPaymentDetailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IncomingPaymentDetail>

    /** Get a list of Incoming Payment Details. */
    fun list(): CompletableFuture<IncomingPaymentDetailListPageAsync> =
        list(IncomingPaymentDetailListParams.none())

    /** @see [list] */
    fun list(
        params: IncomingPaymentDetailListParams = IncomingPaymentDetailListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IncomingPaymentDetailListPageAsync>

    /** @see [list] */
    fun list(
        params: IncomingPaymentDetailListParams = IncomingPaymentDetailListParams.none()
    ): CompletableFuture<IncomingPaymentDetailListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<IncomingPaymentDetailListPageAsync> =
        list(IncomingPaymentDetailListParams.none(), requestOptions)

    /** Simulate Incoming Payment Detail */
    fun createAsync(): CompletableFuture<AsyncResponse> =
        createAsync(IncomingPaymentDetailCreateAsyncParams.none())

    /** @see [createAsync] */
    fun createAsync(
        params: IncomingPaymentDetailCreateAsyncParams =
            IncomingPaymentDetailCreateAsyncParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AsyncResponse>

    /** @see [createAsync] */
    fun createAsync(
        params: IncomingPaymentDetailCreateAsyncParams =
            IncomingPaymentDetailCreateAsyncParams.none()
    ): CompletableFuture<AsyncResponse> = createAsync(params, RequestOptions.none())

    /** @see [createAsync] */
    fun createAsync(requestOptions: RequestOptions): CompletableFuture<AsyncResponse> =
        createAsync(IncomingPaymentDetailCreateAsyncParams.none(), requestOptions)

    /**
     * A view of [IncomingPaymentDetailServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/incoming_payment_details/{id}`, but is
         * otherwise the same as [IncomingPaymentDetailServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: IncomingPaymentDetailRetrieveParams
        ): CompletableFuture<HttpResponseFor<IncomingPaymentDetail>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: IncomingPaymentDetailRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IncomingPaymentDetail>>

        /**
         * Returns a raw HTTP response for `patch /api/incoming_payment_details/{id}`, but is
         * otherwise the same as [IncomingPaymentDetailServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: IncomingPaymentDetailUpdateParams
        ): CompletableFuture<HttpResponseFor<IncomingPaymentDetail>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: IncomingPaymentDetailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IncomingPaymentDetail>>

        /**
         * Returns a raw HTTP response for `get /api/incoming_payment_details`, but is otherwise the
         * same as [IncomingPaymentDetailServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<IncomingPaymentDetailListPageAsync>> =
            list(IncomingPaymentDetailListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: IncomingPaymentDetailListParams = IncomingPaymentDetailListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IncomingPaymentDetailListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: IncomingPaymentDetailListParams = IncomingPaymentDetailListParams.none()
        ): CompletableFuture<HttpResponseFor<IncomingPaymentDetailListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<IncomingPaymentDetailListPageAsync>> =
            list(IncomingPaymentDetailListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /api/simulations/incoming_payment_details/create_async`, but is otherwise the same as
         * [IncomingPaymentDetailServiceAsync.createAsync].
         */
        @MustBeClosed
        fun createAsync(): CompletableFuture<HttpResponseFor<AsyncResponse>> =
            createAsync(IncomingPaymentDetailCreateAsyncParams.none())

        /** @see [createAsync] */
        @MustBeClosed
        fun createAsync(
            params: IncomingPaymentDetailCreateAsyncParams =
                IncomingPaymentDetailCreateAsyncParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AsyncResponse>>

        /** @see [createAsync] */
        @MustBeClosed
        fun createAsync(
            params: IncomingPaymentDetailCreateAsyncParams =
                IncomingPaymentDetailCreateAsyncParams.none()
        ): CompletableFuture<HttpResponseFor<AsyncResponse>> =
            createAsync(params, RequestOptions.none())

        /** @see [createAsync] */
        @MustBeClosed
        fun createAsync(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AsyncResponse>> =
            createAsync(IncomingPaymentDetailCreateAsyncParams.none(), requestOptions)
    }
}
