// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async.transactions

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.TransactionLineItem
import com.moderntreasury.api.models.TransactionLineItemCreateParams
import com.moderntreasury.api.models.TransactionLineItemDeleteParams
import com.moderntreasury.api.models.TransactionLineItemListPageAsync
import com.moderntreasury.api.models.TransactionLineItemListParams
import com.moderntreasury.api.models.TransactionLineItemRetrieveParams
import java.util.concurrent.CompletableFuture

interface LineItemServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** create transaction line items */
    fun create(params: TransactionLineItemCreateParams): CompletableFuture<TransactionLineItem> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: TransactionLineItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionLineItem>

    /** get transaction line item */
    fun retrieve(id: String): CompletableFuture<TransactionLineItem> =
        retrieve(id, TransactionLineItemRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: TransactionLineItemRetrieveParams = TransactionLineItemRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionLineItem> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: TransactionLineItemRetrieveParams = TransactionLineItemRetrieveParams.none(),
    ): CompletableFuture<TransactionLineItem> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: TransactionLineItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionLineItem>

    /** @see [retrieve] */
    fun retrieve(
        params: TransactionLineItemRetrieveParams
    ): CompletableFuture<TransactionLineItem> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TransactionLineItem> =
        retrieve(id, TransactionLineItemRetrieveParams.none(), requestOptions)

    /** list transaction_line_items */
    fun list(): CompletableFuture<TransactionLineItemListPageAsync> =
        list(TransactionLineItemListParams.none())

    /** @see [list] */
    fun list(
        params: TransactionLineItemListParams = TransactionLineItemListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionLineItemListPageAsync>

    /** @see [list] */
    fun list(
        params: TransactionLineItemListParams = TransactionLineItemListParams.none()
    ): CompletableFuture<TransactionLineItemListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<TransactionLineItemListPageAsync> =
        list(TransactionLineItemListParams.none(), requestOptions)

    /** delete transaction line item */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(id, TransactionLineItemDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: TransactionLineItemDeleteParams = TransactionLineItemDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        id: String,
        params: TransactionLineItemDeleteParams = TransactionLineItemDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: TransactionLineItemDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see [delete] */
    fun delete(params: TransactionLineItemDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, TransactionLineItemDeleteParams.none(), requestOptions)

    /**
     * A view of [LineItemServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/transaction_line_items`, but is otherwise the
         * same as [LineItemServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: TransactionLineItemCreateParams
        ): CompletableFuture<HttpResponseFor<TransactionLineItem>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: TransactionLineItemCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionLineItem>>

        /**
         * Returns a raw HTTP response for `get /api/transaction_line_items/{id}`, but is otherwise
         * the same as [LineItemServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<TransactionLineItem>> =
            retrieve(id, TransactionLineItemRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: TransactionLineItemRetrieveParams = TransactionLineItemRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionLineItem>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: TransactionLineItemRetrieveParams = TransactionLineItemRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<TransactionLineItem>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: TransactionLineItemRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionLineItem>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: TransactionLineItemRetrieveParams
        ): CompletableFuture<HttpResponseFor<TransactionLineItem>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TransactionLineItem>> =
            retrieve(id, TransactionLineItemRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/transaction_line_items`, but is otherwise the
         * same as [LineItemServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<TransactionLineItemListPageAsync>> =
            list(TransactionLineItemListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: TransactionLineItemListParams = TransactionLineItemListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionLineItemListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: TransactionLineItemListParams = TransactionLineItemListParams.none()
        ): CompletableFuture<HttpResponseFor<TransactionLineItemListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TransactionLineItemListPageAsync>> =
            list(TransactionLineItemListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/transaction_line_items/{id}`, but is
         * otherwise the same as [LineItemServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, TransactionLineItemDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: TransactionLineItemDeleteParams = TransactionLineItemDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: TransactionLineItemDeleteParams = TransactionLineItemDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: TransactionLineItemDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: TransactionLineItemDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, TransactionLineItemDeleteParams.none(), requestOptions)
    }
}
