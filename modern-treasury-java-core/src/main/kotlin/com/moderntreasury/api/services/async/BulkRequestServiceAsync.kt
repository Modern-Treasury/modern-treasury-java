// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

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
    @JvmOverloads
    fun create(
        params: BulkRequestCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BulkRequest>

    /** get bulk_request */
    @JvmOverloads
    fun retrieve(
        params: BulkRequestRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BulkRequest>

    /** list bulk_requests */
    @JvmOverloads
    fun list(
        params: BulkRequestListParams = BulkRequestListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BulkRequestListPageAsync>

    /** list bulk_requests */
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
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: BulkRequestCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BulkRequest>>

        /**
         * Returns a raw HTTP response for `get /api/bulk_requests/{id}`, but is otherwise the same
         * as [BulkRequestServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: BulkRequestRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BulkRequest>>

        /**
         * Returns a raw HTTP response for `get /api/bulk_requests`, but is otherwise the same as
         * [BulkRequestServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: BulkRequestListParams = BulkRequestListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BulkRequestListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /api/bulk_requests`, but is otherwise the same as
         * [BulkRequestServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BulkRequestListPageAsync>> =
            list(BulkRequestListParams.none(), requestOptions)
    }
}
