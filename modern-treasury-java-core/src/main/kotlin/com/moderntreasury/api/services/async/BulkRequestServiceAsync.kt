// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.BulkRequest
import com.moderntreasury.api.models.BulkRequestCreateParams
import com.moderntreasury.api.models.BulkRequestListPageAsync
import com.moderntreasury.api.models.BulkRequestListParams
import com.moderntreasury.api.models.BulkRequestRetrieveParams
import java.util.concurrent.CompletableFuture

interface BulkRequestServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** create bulk_request */
    fun create(params: BulkRequestCreateParams): CompletableFuture<BulkRequest> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: BulkRequestCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BulkRequest>

    /** get bulk_request */
    fun retrieve(params: BulkRequestRetrieveParams): CompletableFuture<BulkRequest> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: BulkRequestRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BulkRequest>

    /** list bulk_requests */
    fun list(): CompletableFuture<BulkRequestListPageAsync> = list(BulkRequestListParams.none())

    /** @see [list] */
    fun list(
        params: BulkRequestListParams = BulkRequestListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BulkRequestListPageAsync>

    /** @see [list] */
    fun list(
        params: BulkRequestListParams = BulkRequestListParams.none()
    ): CompletableFuture<BulkRequestListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<BulkRequestListPageAsync> =
        list(BulkRequestListParams.none(), requestOptions)

    /**
     * A view of [BulkRequestServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/bulk_requests`, but is otherwise the same as
         * [BulkRequestServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: BulkRequestCreateParams
        ): CompletableFuture<HttpResponseFor<BulkRequest>> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: BulkRequestCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BulkRequest>>

        /**
         * Returns a raw HTTP response for `get /api/bulk_requests/{id}`, but is otherwise the same
         * as [BulkRequestServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: BulkRequestRetrieveParams
        ): CompletableFuture<HttpResponseFor<BulkRequest>> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: BulkRequestRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BulkRequest>>

        /**
         * Returns a raw HTTP response for `get /api/bulk_requests`, but is otherwise the same as
         * [BulkRequestServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<BulkRequestListPageAsync>> =
            list(BulkRequestListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: BulkRequestListParams = BulkRequestListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BulkRequestListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: BulkRequestListParams = BulkRequestListParams.none()
        ): CompletableFuture<HttpResponseFor<BulkRequestListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BulkRequestListPageAsync>> =
            list(BulkRequestListParams.none(), requestOptions)
    }
}
