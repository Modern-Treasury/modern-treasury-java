// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.Case
import com.moderntreasury.api.models.CaseListPageAsync
import com.moderntreasury.api.models.CaseListParams
import com.moderntreasury.api.models.CaseRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CaseServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CaseServiceAsync

    /** Get details on a single case. */
    fun retrieve(id: String): CompletableFuture<Case> = retrieve(id, CaseRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CaseRetrieveParams = CaseRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Case> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CaseRetrieveParams = CaseRetrieveParams.none(),
    ): CompletableFuture<Case> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CaseRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Case>

    /** @see retrieve */
    fun retrieve(params: CaseRetrieveParams): CompletableFuture<Case> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Case> =
        retrieve(id, CaseRetrieveParams.none(), requestOptions)

    /** Get a list of cases. */
    fun list(): CompletableFuture<CaseListPageAsync> = list(CaseListParams.none())

    /** @see list */
    fun list(
        params: CaseListParams = CaseListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CaseListPageAsync>

    /** @see list */
    fun list(params: CaseListParams = CaseListParams.none()): CompletableFuture<CaseListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CaseListPageAsync> =
        list(CaseListParams.none(), requestOptions)

    /** A view of [CaseServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CaseServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/cases/{id}`, but is otherwise the same as
         * [CaseServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<Case>> =
            retrieve(id, CaseRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: CaseRetrieveParams = CaseRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Case>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: CaseRetrieveParams = CaseRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Case>> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CaseRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Case>>

        /** @see retrieve */
        fun retrieve(params: CaseRetrieveParams): CompletableFuture<HttpResponseFor<Case>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Case>> =
            retrieve(id, CaseRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/cases`, but is otherwise the same as
         * [CaseServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CaseListPageAsync>> =
            list(CaseListParams.none())

        /** @see list */
        fun list(
            params: CaseListParams = CaseListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CaseListPageAsync>>

        /** @see list */
        fun list(
            params: CaseListParams = CaseListParams.none()
        ): CompletableFuture<HttpResponseFor<CaseListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CaseListPageAsync>> =
            list(CaseListParams.none(), requestOptions)
    }
}
