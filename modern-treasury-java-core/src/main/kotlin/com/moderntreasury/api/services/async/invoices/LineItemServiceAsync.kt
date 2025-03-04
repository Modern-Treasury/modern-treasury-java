// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async.invoices

import com.google.errorprone.annotations.MustBeClosed
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

interface LineItemServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** create invoice_line_item */
    @JvmOverloads
    fun create(
        params: InvoiceLineItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvoiceLineItem>

    /** get invoice_line_item */
    @JvmOverloads
    fun retrieve(
        params: InvoiceLineItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvoiceLineItem>

    /** update invoice_line_item */
    @JvmOverloads
    fun update(
        params: InvoiceLineItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvoiceLineItem>

    /** list invoice_line_items */
    @JvmOverloads
    fun list(
        params: InvoiceLineItemListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvoiceLineItemListPageAsync>

    /** delete invoice_line_item */
    @JvmOverloads
    fun delete(
        params: InvoiceLineItemDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvoiceLineItem>

    /**
     * A view of [LineItemServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/invoices/{invoice_id}/invoice_line_items`, but
         * is otherwise the same as [LineItemServiceAsync.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: InvoiceLineItemCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvoiceLineItem>>

        /**
         * Returns a raw HTTP response for `get /api/invoices/{invoice_id}/invoice_line_items/{id}`,
         * but is otherwise the same as [LineItemServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: InvoiceLineItemRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvoiceLineItem>>

        /**
         * Returns a raw HTTP response for `patch
         * /api/invoices/{invoice_id}/invoice_line_items/{id}`, but is otherwise the same as
         * [LineItemServiceAsync.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: InvoiceLineItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvoiceLineItem>>

        /**
         * Returns a raw HTTP response for `get /api/invoices/{invoice_id}/invoice_line_items`, but
         * is otherwise the same as [LineItemServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: InvoiceLineItemListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvoiceLineItemListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete
         * /api/invoices/{invoice_id}/invoice_line_items/{id}`, but is otherwise the same as
         * [LineItemServiceAsync.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: InvoiceLineItemDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvoiceLineItem>>
    }
}
