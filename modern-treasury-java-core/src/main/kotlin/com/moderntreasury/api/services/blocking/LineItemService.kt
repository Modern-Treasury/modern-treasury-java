// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.LineItem
import com.moderntreasury.api.models.LineItemListPage
import com.moderntreasury.api.models.LineItemListParams
import com.moderntreasury.api.models.LineItemRetrieveParams
import com.moderntreasury.api.models.LineItemUpdateParams
import java.util.function.Consumer

interface LineItemService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LineItemService

    /** Get a single line item */
    fun retrieve(id: String, params: LineItemRetrieveParams): LineItem =
        retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: LineItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LineItem = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(params: LineItemRetrieveParams): LineItem = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: LineItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LineItem

    /** update line item */
    fun update(id: String, params: LineItemUpdateParams): LineItem =
        update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        id: String,
        params: LineItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LineItem = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(params: LineItemUpdateParams): LineItem = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: LineItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LineItem

    /** Get a list of line items */
    fun list(itemizableId: String, params: LineItemListParams): LineItemListPage =
        list(itemizableId, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        itemizableId: String,
        params: LineItemListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LineItemListPage =
        list(params.toBuilder().itemizableId(itemizableId).build(), requestOptions)

    /** @see [list] */
    fun list(params: LineItemListParams): LineItemListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: LineItemListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LineItemListPage

    /** A view of [LineItemService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): LineItemService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /api/{itemizable_type}/{itemizable_id}/line_items/{id}`, but is otherwise the same as
         * [LineItemService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String, params: LineItemRetrieveParams): HttpResponseFor<LineItem> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: LineItemRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LineItem> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: LineItemRetrieveParams): HttpResponseFor<LineItem> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: LineItemRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LineItem>

        /**
         * Returns a raw HTTP response for `patch
         * /api/{itemizable_type}/{itemizable_id}/line_items/{id}`, but is otherwise the same as
         * [LineItemService.update].
         */
        @MustBeClosed
        fun update(id: String, params: LineItemUpdateParams): HttpResponseFor<LineItem> =
            update(id, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            params: LineItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LineItem> = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(params: LineItemUpdateParams): HttpResponseFor<LineItem> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: LineItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LineItem>

        /**
         * Returns a raw HTTP response for `get /api/{itemizable_type}/{itemizable_id}/line_items`,
         * but is otherwise the same as [LineItemService.list].
         */
        @MustBeClosed
        fun list(
            itemizableId: String,
            params: LineItemListParams,
        ): HttpResponseFor<LineItemListPage> = list(itemizableId, params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            itemizableId: String,
            params: LineItemListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LineItemListPage> =
            list(params.toBuilder().itemizableId(itemizableId).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        fun list(params: LineItemListParams): HttpResponseFor<LineItemListPage> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: LineItemListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LineItemListPage>
    }
}
