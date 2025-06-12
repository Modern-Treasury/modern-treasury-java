// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.PaperItem
import com.moderntreasury.api.models.PaperItemListPageAsync
import com.moderntreasury.api.models.PaperItemListParams
import com.moderntreasury.api.models.PaperItemRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PaperItemServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PaperItemServiceAsync

    /** Get details on a single paper item. */
    fun retrieve(id: String): CompletableFuture<PaperItem> =
        retrieve(id, PaperItemRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: PaperItemRetrieveParams = PaperItemRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaperItem> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: PaperItemRetrieveParams = PaperItemRetrieveParams.none(),
    ): CompletableFuture<PaperItem> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: PaperItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaperItem>

    /** @see [retrieve] */
    fun retrieve(params: PaperItemRetrieveParams): CompletableFuture<PaperItem> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<PaperItem> =
        retrieve(id, PaperItemRetrieveParams.none(), requestOptions)

    /** Get a list of all paper items. */
    fun list(): CompletableFuture<PaperItemListPageAsync> = list(PaperItemListParams.none())

    /** @see [list] */
    fun list(
        params: PaperItemListParams = PaperItemListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaperItemListPageAsync>

    /** @see [list] */
    fun list(
        params: PaperItemListParams = PaperItemListParams.none()
    ): CompletableFuture<PaperItemListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<PaperItemListPageAsync> =
        list(PaperItemListParams.none(), requestOptions)

    /**
     * A view of [PaperItemServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PaperItemServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/paper_items/{id}`, but is otherwise the same as
         * [PaperItemServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<PaperItem>> =
            retrieve(id, PaperItemRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: PaperItemRetrieveParams = PaperItemRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaperItem>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: PaperItemRetrieveParams = PaperItemRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<PaperItem>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: PaperItemRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaperItem>>

        /** @see [retrieve] */
        fun retrieve(
            params: PaperItemRetrieveParams
        ): CompletableFuture<HttpResponseFor<PaperItem>> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PaperItem>> =
            retrieve(id, PaperItemRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/paper_items`, but is otherwise the same as
         * [PaperItemServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<PaperItemListPageAsync>> =
            list(PaperItemListParams.none())

        /** @see [list] */
        fun list(
            params: PaperItemListParams = PaperItemListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaperItemListPageAsync>>

        /** @see [list] */
        fun list(
            params: PaperItemListParams = PaperItemListParams.none()
        ): CompletableFuture<HttpResponseFor<PaperItemListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PaperItemListPageAsync>> =
            list(PaperItemListParams.none(), requestOptions)
    }
}
