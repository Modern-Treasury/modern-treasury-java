// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking.transactions

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.TransactionLineItem
import com.moderntreasury.api.models.TransactionLineItemCreateParams
import com.moderntreasury.api.models.TransactionLineItemDeleteParams
import com.moderntreasury.api.models.TransactionLineItemListPage
import com.moderntreasury.api.models.TransactionLineItemListParams
import com.moderntreasury.api.models.TransactionLineItemRetrieveParams

interface LineItemService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** create transaction line items */
    fun create(params: TransactionLineItemCreateParams): TransactionLineItem =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: TransactionLineItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionLineItem

    /** get transaction line item */
    fun retrieve(params: TransactionLineItemRetrieveParams): TransactionLineItem =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: TransactionLineItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionLineItem

    /** list transaction_line_items */
    fun list(): TransactionLineItemListPage = list(TransactionLineItemListParams.none())

    /** @see [list] */
    fun list(
        params: TransactionLineItemListParams = TransactionLineItemListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionLineItemListPage

    /** @see [list] */
    fun list(
        params: TransactionLineItemListParams = TransactionLineItemListParams.none()
    ): TransactionLineItemListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): TransactionLineItemListPage =
        list(TransactionLineItemListParams.none(), requestOptions)

    /** delete transaction line item */
    fun delete(params: TransactionLineItemDeleteParams) = delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: TransactionLineItemDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [LineItemService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/transaction_line_items`, but is otherwise the
         * same as [LineItemService.create].
         */
        @MustBeClosed
        fun create(params: TransactionLineItemCreateParams): HttpResponseFor<TransactionLineItem> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: TransactionLineItemCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionLineItem>

        /**
         * Returns a raw HTTP response for `get /api/transaction_line_items/{id}`, but is otherwise
         * the same as [LineItemService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: TransactionLineItemRetrieveParams
        ): HttpResponseFor<TransactionLineItem> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: TransactionLineItemRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionLineItem>

        /**
         * Returns a raw HTTP response for `get /api/transaction_line_items`, but is otherwise the
         * same as [LineItemService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<TransactionLineItemListPage> =
            list(TransactionLineItemListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: TransactionLineItemListParams = TransactionLineItemListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionLineItemListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: TransactionLineItemListParams = TransactionLineItemListParams.none()
        ): HttpResponseFor<TransactionLineItemListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<TransactionLineItemListPage> =
            list(TransactionLineItemListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/transaction_line_items/{id}`, but is
         * otherwise the same as [LineItemService.delete].
         */
        @MustBeClosed
        fun delete(params: TransactionLineItemDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: TransactionLineItemDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
