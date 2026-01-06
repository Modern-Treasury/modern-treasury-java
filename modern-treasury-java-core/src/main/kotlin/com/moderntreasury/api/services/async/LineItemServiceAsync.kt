// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.LineItemListPageAsync
import com.moderntreasury.api.models.LineItemListParams
import com.moderntreasury.api.models.LineItemRetrieveParams
import com.moderntreasury.api.models.LineItemRetrieveResponse
import com.moderntreasury.api.models.LineItemUpdateParams
import com.moderntreasury.api.models.LineItemUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LineItemServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LineItemServiceAsync

    /** Get a single line item */
    fun retrieve(
        id: String,
        params: LineItemRetrieveParams,
    ): CompletableFuture<LineItemRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: LineItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LineItemRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: LineItemRetrieveParams): CompletableFuture<LineItemRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: LineItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LineItemRetrieveResponse>

    /** update line item */
    fun update(
        id: String,
        params: LineItemUpdateParams,
    ): CompletableFuture<LineItemUpdateResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: LineItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LineItemUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: LineItemUpdateParams): CompletableFuture<LineItemUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: LineItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LineItemUpdateResponse>

    /** Get a list of line items */
    fun list(
        itemizableId: String,
        params: LineItemListParams,
    ): CompletableFuture<LineItemListPageAsync> = list(itemizableId, params, RequestOptions.none())

    /** @see list */
    fun list(
        itemizableId: String,
        params: LineItemListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LineItemListPageAsync> =
        list(params.toBuilder().itemizableId(itemizableId).build(), requestOptions)

    /** @see list */
    fun list(params: LineItemListParams): CompletableFuture<LineItemListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: LineItemListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LineItemListPageAsync>

    /**
     * A view of [LineItemServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LineItemServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /api/{itemizable_type}/{itemizable_id}/line_items/{id}`, but is otherwise the same as
         * [LineItemServiceAsync.retrieve].
         */
        fun retrieve(
            id: String,
            params: LineItemRetrieveParams,
        ): CompletableFuture<HttpResponseFor<LineItemRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: LineItemRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LineItemRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: LineItemRetrieveParams
        ): CompletableFuture<HttpResponseFor<LineItemRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: LineItemRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LineItemRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `patch
         * /api/{itemizable_type}/{itemizable_id}/line_items/{id}`, but is otherwise the same as
         * [LineItemServiceAsync.update].
         */
        fun update(
            id: String,
            params: LineItemUpdateParams,
        ): CompletableFuture<HttpResponseFor<LineItemUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: LineItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LineItemUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            params: LineItemUpdateParams
        ): CompletableFuture<HttpResponseFor<LineItemUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: LineItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LineItemUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /api/{itemizable_type}/{itemizable_id}/line_items`,
         * but is otherwise the same as [LineItemServiceAsync.list].
         */
        fun list(
            itemizableId: String,
            params: LineItemListParams,
        ): CompletableFuture<HttpResponseFor<LineItemListPageAsync>> =
            list(itemizableId, params, RequestOptions.none())

        /** @see list */
        fun list(
            itemizableId: String,
            params: LineItemListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LineItemListPageAsync>> =
            list(params.toBuilder().itemizableId(itemizableId).build(), requestOptions)

        /** @see list */
        fun list(
            params: LineItemListParams
        ): CompletableFuture<HttpResponseFor<LineItemListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: LineItemListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LineItemListPageAsync>>
    }
}
