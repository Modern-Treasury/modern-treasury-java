// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.BulkResult
import com.moderntreasury.api.models.BulkResultListPageAsync
import com.moderntreasury.api.models.BulkResultListParams
import com.moderntreasury.api.models.BulkResultRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BulkResultServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BulkResultServiceAsync

    /** get bulk_result */
    fun retrieve(id: String): CompletableFuture<BulkResult> =
        retrieve(id, BulkResultRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: BulkResultRetrieveParams = BulkResultRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BulkResult> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: BulkResultRetrieveParams = BulkResultRetrieveParams.none(),
    ): CompletableFuture<BulkResult> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BulkResultRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BulkResult>

    /** @see retrieve */
    fun retrieve(params: BulkResultRetrieveParams): CompletableFuture<BulkResult> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<BulkResult> =
        retrieve(id, BulkResultRetrieveParams.none(), requestOptions)

    /** list bulk_results */
    fun list(): CompletableFuture<BulkResultListPageAsync> = list(BulkResultListParams.none())

    /** @see list */
    fun list(
        params: BulkResultListParams = BulkResultListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BulkResultListPageAsync>

    /** @see list */
    fun list(
        params: BulkResultListParams = BulkResultListParams.none()
    ): CompletableFuture<BulkResultListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<BulkResultListPageAsync> =
        list(BulkResultListParams.none(), requestOptions)

    /**
     * A view of [BulkResultServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BulkResultServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/bulk_results/{id}`, but is otherwise the same
         * as [BulkResultServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<BulkResult>> =
            retrieve(id, BulkResultRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: BulkResultRetrieveParams = BulkResultRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BulkResult>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: BulkResultRetrieveParams = BulkResultRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<BulkResult>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: BulkResultRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BulkResult>>

        /** @see retrieve */
        fun retrieve(
            params: BulkResultRetrieveParams
        ): CompletableFuture<HttpResponseFor<BulkResult>> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BulkResult>> =
            retrieve(id, BulkResultRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/bulk_results`, but is otherwise the same as
         * [BulkResultServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<BulkResultListPageAsync>> =
            list(BulkResultListParams.none())

        /** @see list */
        fun list(
            params: BulkResultListParams = BulkResultListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BulkResultListPageAsync>>

        /** @see list */
        fun list(
            params: BulkResultListParams = BulkResultListParams.none()
        ): CompletableFuture<HttpResponseFor<BulkResultListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BulkResultListPageAsync>> =
            list(BulkResultListParams.none(), requestOptions)
    }
}
