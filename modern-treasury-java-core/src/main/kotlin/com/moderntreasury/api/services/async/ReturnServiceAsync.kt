// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.ReturnCreateParams
import com.moderntreasury.api.models.ReturnListPageAsync
import com.moderntreasury.api.models.ReturnListParams
import com.moderntreasury.api.models.ReturnObject
import com.moderntreasury.api.models.ReturnRetrieveParams
import java.util.concurrent.CompletableFuture

interface ReturnServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a return. */
    fun create(params: ReturnCreateParams): CompletableFuture<ReturnObject> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: ReturnCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReturnObject>

    /** Get a single return. */
    fun retrieve(id: String): CompletableFuture<ReturnObject> =
        retrieve(id, ReturnRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: ReturnRetrieveParams = ReturnRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReturnObject> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: ReturnRetrieveParams = ReturnRetrieveParams.none(),
    ): CompletableFuture<ReturnObject> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ReturnRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReturnObject>

    /** @see [retrieve] */
    fun retrieve(params: ReturnRetrieveParams): CompletableFuture<ReturnObject> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<ReturnObject> =
        retrieve(id, ReturnRetrieveParams.none(), requestOptions)

    /** Get a list of returns. */
    fun list(): CompletableFuture<ReturnListPageAsync> = list(ReturnListParams.none())

    /** @see [list] */
    fun list(
        params: ReturnListParams = ReturnListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReturnListPageAsync>

    /** @see [list] */
    fun list(
        params: ReturnListParams = ReturnListParams.none()
    ): CompletableFuture<ReturnListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<ReturnListPageAsync> =
        list(ReturnListParams.none(), requestOptions)

    /**
     * A view of [ReturnServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/returns`, but is otherwise the same as
         * [ReturnServiceAsync.create].
         */
        @MustBeClosed
        fun create(params: ReturnCreateParams): CompletableFuture<HttpResponseFor<ReturnObject>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ReturnCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReturnObject>>

        /**
         * Returns a raw HTTP response for `get /api/returns/{id}`, but is otherwise the same as
         * [ReturnServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<ReturnObject>> =
            retrieve(id, ReturnRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ReturnRetrieveParams = ReturnRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReturnObject>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ReturnRetrieveParams = ReturnRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ReturnObject>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ReturnRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReturnObject>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ReturnRetrieveParams
        ): CompletableFuture<HttpResponseFor<ReturnObject>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ReturnObject>> =
            retrieve(id, ReturnRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/returns`, but is otherwise the same as
         * [ReturnServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<ReturnListPageAsync>> =
            list(ReturnListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ReturnListParams = ReturnListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReturnListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ReturnListParams = ReturnListParams.none()
        ): CompletableFuture<HttpResponseFor<ReturnListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ReturnListPageAsync>> =
            list(ReturnListParams.none(), requestOptions)
    }
}
