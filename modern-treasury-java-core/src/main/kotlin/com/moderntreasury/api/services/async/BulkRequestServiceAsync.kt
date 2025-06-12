// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.BulkRequest
import com.moderntreasury.api.models.BulkRequestCreateParams
import com.moderntreasury.api.models.BulkRequestListPageAsync
import com.moderntreasury.api.models.BulkRequestListParams
import com.moderntreasury.api.models.BulkRequestRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BulkRequestServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BulkRequestServiceAsync

    /** create bulk_request */
    fun create(params: BulkRequestCreateParams): CompletableFuture<BulkRequest> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: BulkRequestCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BulkRequest>

    /** get bulk_request */
    fun retrieve(id: String): CompletableFuture<BulkRequest> =
        retrieve(id, BulkRequestRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: BulkRequestRetrieveParams = BulkRequestRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BulkRequest> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: BulkRequestRetrieveParams = BulkRequestRetrieveParams.none(),
    ): CompletableFuture<BulkRequest> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: BulkRequestRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BulkRequest>

    /** @see [retrieve] */
    fun retrieve(params: BulkRequestRetrieveParams): CompletableFuture<BulkRequest> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<BulkRequest> =
        retrieve(id, BulkRequestRetrieveParams.none(), requestOptions)

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
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BulkRequestServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/bulk_requests`, but is otherwise the same as
         * [BulkRequestServiceAsync.create].
         */
        fun create(
            params: BulkRequestCreateParams
        ): CompletableFuture<HttpResponseFor<BulkRequest>> = create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: BulkRequestCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BulkRequest>>

        /**
         * Returns a raw HTTP response for `get /api/bulk_requests/{id}`, but is otherwise the same
         * as [BulkRequestServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<BulkRequest>> =
            retrieve(id, BulkRequestRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: BulkRequestRetrieveParams = BulkRequestRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BulkRequest>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: BulkRequestRetrieveParams = BulkRequestRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<BulkRequest>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: BulkRequestRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BulkRequest>>

        /** @see [retrieve] */
        fun retrieve(
            params: BulkRequestRetrieveParams
        ): CompletableFuture<HttpResponseFor<BulkRequest>> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BulkRequest>> =
            retrieve(id, BulkRequestRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/bulk_requests`, but is otherwise the same as
         * [BulkRequestServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<BulkRequestListPageAsync>> =
            list(BulkRequestListParams.none())

        /** @see [list] */
        fun list(
            params: BulkRequestListParams = BulkRequestListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BulkRequestListPageAsync>>

        /** @see [list] */
        fun list(
            params: BulkRequestListParams = BulkRequestListParams.none()
        ): CompletableFuture<HttpResponseFor<BulkRequestListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BulkRequestListPageAsync>> =
            list(BulkRequestListParams.none(), requestOptions)
    }
}
