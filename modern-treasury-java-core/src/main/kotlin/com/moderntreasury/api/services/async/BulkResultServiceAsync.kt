// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.BulkResult
import com.moderntreasury.api.models.BulkResultListPageAsync
import com.moderntreasury.api.models.BulkResultListParams
import com.moderntreasury.api.models.BulkResultRetrieveParams
import java.util.concurrent.CompletableFuture

interface BulkResultServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** get bulk_result */
    fun retrieve(params: BulkResultRetrieveParams): CompletableFuture<BulkResult> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: BulkResultRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BulkResult>

    /** list bulk_results */
    fun list(): CompletableFuture<BulkResultListPageAsync> = list(BulkResultListParams.none())

    /** @see [list] */
    fun list(
        params: BulkResultListParams = BulkResultListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BulkResultListPageAsync>

    /** @see [list] */
    fun list(
        params: BulkResultListParams = BulkResultListParams.none()
    ): CompletableFuture<BulkResultListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<BulkResultListPageAsync> =
        list(BulkResultListParams.none(), requestOptions)

    /**
     * A view of [BulkResultServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/bulk_results/{id}`, but is otherwise the same
         * as [BulkResultServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: BulkResultRetrieveParams
        ): CompletableFuture<HttpResponseFor<BulkResult>> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: BulkResultRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BulkResult>>

        /**
         * Returns a raw HTTP response for `get /api/bulk_results`, but is otherwise the same as
         * [BulkResultServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<BulkResultListPageAsync>> =
            list(BulkResultListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: BulkResultListParams = BulkResultListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BulkResultListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: BulkResultListParams = BulkResultListParams.none()
        ): CompletableFuture<HttpResponseFor<BulkResultListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BulkResultListPageAsync>> =
            list(BulkResultListParams.none(), requestOptions)
    }
}
