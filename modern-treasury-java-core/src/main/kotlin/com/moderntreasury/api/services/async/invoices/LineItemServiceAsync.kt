// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async.invoices

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.InvoiceLineItem
import com.moderntreasury.api.models.InvoiceLineItemCreateParams
import com.moderntreasury.api.models.InvoiceLineItemDeleteParams
import com.moderntreasury.api.models.InvoiceLineItemListPageAsync
import com.moderntreasury.api.models.InvoiceLineItemListParams
import com.moderntreasury.api.models.InvoiceLineItemRetrieveParams
import com.moderntreasury.api.models.InvoiceLineItemUpdateParams
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

    /** create invoice_line_item */
    fun create(
        invoiceId: String,
        params: InvoiceLineItemCreateParams,
    ): CompletableFuture<InvoiceLineItem> = create(invoiceId, params, RequestOptions.none())

    /** @see create */
    fun create(
        invoiceId: String,
        params: InvoiceLineItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvoiceLineItem> =
        create(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see create */
    fun create(params: InvoiceLineItemCreateParams): CompletableFuture<InvoiceLineItem> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: InvoiceLineItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvoiceLineItem>

    /** get invoice_line_item */
    fun retrieve(
        id: String,
        params: InvoiceLineItemRetrieveParams,
    ): CompletableFuture<InvoiceLineItem> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: InvoiceLineItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvoiceLineItem> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: InvoiceLineItemRetrieveParams): CompletableFuture<InvoiceLineItem> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: InvoiceLineItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvoiceLineItem>

    /** update invoice_line_item */
    fun update(
        id: String,
        params: InvoiceLineItemUpdateParams,
    ): CompletableFuture<InvoiceLineItem> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: InvoiceLineItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvoiceLineItem> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: InvoiceLineItemUpdateParams): CompletableFuture<InvoiceLineItem> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: InvoiceLineItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvoiceLineItem>

    /** list invoice_line_items */
    fun list(invoiceId: String): CompletableFuture<InvoiceLineItemListPageAsync> =
        list(invoiceId, InvoiceLineItemListParams.none())

    /** @see list */
    fun list(
        invoiceId: String,
        params: InvoiceLineItemListParams = InvoiceLineItemListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvoiceLineItemListPageAsync> =
        list(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see list */
    fun list(
        invoiceId: String,
        params: InvoiceLineItemListParams = InvoiceLineItemListParams.none(),
    ): CompletableFuture<InvoiceLineItemListPageAsync> =
        list(invoiceId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: InvoiceLineItemListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvoiceLineItemListPageAsync>

    /** @see list */
    fun list(params: InvoiceLineItemListParams): CompletableFuture<InvoiceLineItemListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        invoiceId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InvoiceLineItemListPageAsync> =
        list(invoiceId, InvoiceLineItemListParams.none(), requestOptions)

    /** delete invoice_line_item */
    fun delete(
        id: String,
        params: InvoiceLineItemDeleteParams,
    ): CompletableFuture<InvoiceLineItem> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        params: InvoiceLineItemDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvoiceLineItem> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(params: InvoiceLineItemDeleteParams): CompletableFuture<InvoiceLineItem> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: InvoiceLineItemDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvoiceLineItem>

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
         * Returns a raw HTTP response for `post /api/invoices/{invoice_id}/invoice_line_items`, but
         * is otherwise the same as [LineItemServiceAsync.create].
         */
        fun create(
            invoiceId: String,
            params: InvoiceLineItemCreateParams,
        ): CompletableFuture<HttpResponseFor<InvoiceLineItem>> =
            create(invoiceId, params, RequestOptions.none())

        /** @see create */
        fun create(
            invoiceId: String,
            params: InvoiceLineItemCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvoiceLineItem>> =
            create(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see create */
        fun create(
            params: InvoiceLineItemCreateParams
        ): CompletableFuture<HttpResponseFor<InvoiceLineItem>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: InvoiceLineItemCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvoiceLineItem>>

        /**
         * Returns a raw HTTP response for `get /api/invoices/{invoice_id}/invoice_line_items/{id}`,
         * but is otherwise the same as [LineItemServiceAsync.retrieve].
         */
        fun retrieve(
            id: String,
            params: InvoiceLineItemRetrieveParams,
        ): CompletableFuture<HttpResponseFor<InvoiceLineItem>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: InvoiceLineItemRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvoiceLineItem>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: InvoiceLineItemRetrieveParams
        ): CompletableFuture<HttpResponseFor<InvoiceLineItem>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: InvoiceLineItemRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvoiceLineItem>>

        /**
         * Returns a raw HTTP response for `patch
         * /api/invoices/{invoice_id}/invoice_line_items/{id}`, but is otherwise the same as
         * [LineItemServiceAsync.update].
         */
        fun update(
            id: String,
            params: InvoiceLineItemUpdateParams,
        ): CompletableFuture<HttpResponseFor<InvoiceLineItem>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: InvoiceLineItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvoiceLineItem>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            params: InvoiceLineItemUpdateParams
        ): CompletableFuture<HttpResponseFor<InvoiceLineItem>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: InvoiceLineItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvoiceLineItem>>

        /**
         * Returns a raw HTTP response for `get /api/invoices/{invoice_id}/invoice_line_items`, but
         * is otherwise the same as [LineItemServiceAsync.list].
         */
        fun list(
            invoiceId: String
        ): CompletableFuture<HttpResponseFor<InvoiceLineItemListPageAsync>> =
            list(invoiceId, InvoiceLineItemListParams.none())

        /** @see list */
        fun list(
            invoiceId: String,
            params: InvoiceLineItemListParams = InvoiceLineItemListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvoiceLineItemListPageAsync>> =
            list(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see list */
        fun list(
            invoiceId: String,
            params: InvoiceLineItemListParams = InvoiceLineItemListParams.none(),
        ): CompletableFuture<HttpResponseFor<InvoiceLineItemListPageAsync>> =
            list(invoiceId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: InvoiceLineItemListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvoiceLineItemListPageAsync>>

        /** @see list */
        fun list(
            params: InvoiceLineItemListParams
        ): CompletableFuture<HttpResponseFor<InvoiceLineItemListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            invoiceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InvoiceLineItemListPageAsync>> =
            list(invoiceId, InvoiceLineItemListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /api/invoices/{invoice_id}/invoice_line_items/{id}`, but is otherwise the same as
         * [LineItemServiceAsync.delete].
         */
        fun delete(
            id: String,
            params: InvoiceLineItemDeleteParams,
        ): CompletableFuture<HttpResponseFor<InvoiceLineItem>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            params: InvoiceLineItemDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvoiceLineItem>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            params: InvoiceLineItemDeleteParams
        ): CompletableFuture<HttpResponseFor<InvoiceLineItem>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: InvoiceLineItemDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvoiceLineItem>>
    }
}
