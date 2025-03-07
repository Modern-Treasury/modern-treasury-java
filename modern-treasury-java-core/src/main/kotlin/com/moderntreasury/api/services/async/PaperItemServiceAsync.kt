// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.PaperItem
import com.moderntreasury.api.models.PaperItemListPageAsync
import com.moderntreasury.api.models.PaperItemListParams
import com.moderntreasury.api.models.PaperItemRetrieveParams
import java.util.concurrent.CompletableFuture

interface PaperItemServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get details on a single paper item. */
    fun retrieve(params: PaperItemRetrieveParams): CompletableFuture<PaperItem> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: PaperItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaperItem>

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
         * Returns a raw HTTP response for `get /api/paper_items/{id}`, but is otherwise the same as
         * [PaperItemServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: PaperItemRetrieveParams
        ): CompletableFuture<HttpResponseFor<PaperItem>> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: PaperItemRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaperItem>>

        /**
         * Returns a raw HTTP response for `get /api/paper_items`, but is otherwise the same as
         * [PaperItemServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<PaperItemListPageAsync>> =
            list(PaperItemListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PaperItemListParams = PaperItemListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaperItemListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PaperItemListParams = PaperItemListParams.none()
        ): CompletableFuture<HttpResponseFor<PaperItemListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PaperItemListPageAsync>> =
            list(PaperItemListParams.none(), requestOptions)
    }
}
