// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.ForeignExchangeQuote
import com.moderntreasury.api.models.ForeignExchangeQuoteCreateParams
import com.moderntreasury.api.models.ForeignExchangeQuoteListPage
import com.moderntreasury.api.models.ForeignExchangeQuoteListParams
import com.moderntreasury.api.models.ForeignExchangeQuoteRetrieveParams
import java.util.function.Consumer

interface ForeignExchangeQuoteService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ForeignExchangeQuoteService

    /** create foreign_exchange_quote */
    fun create(params: ForeignExchangeQuoteCreateParams): ForeignExchangeQuote =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: ForeignExchangeQuoteCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ForeignExchangeQuote

    /** get foreign_exchange_quote */
    fun retrieve(id: String): ForeignExchangeQuote =
        retrieve(id, ForeignExchangeQuoteRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: ForeignExchangeQuoteRetrieveParams = ForeignExchangeQuoteRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ForeignExchangeQuote = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: ForeignExchangeQuoteRetrieveParams = ForeignExchangeQuoteRetrieveParams.none(),
    ): ForeignExchangeQuote = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ForeignExchangeQuoteRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ForeignExchangeQuote

    /** @see [retrieve] */
    fun retrieve(params: ForeignExchangeQuoteRetrieveParams): ForeignExchangeQuote =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): ForeignExchangeQuote =
        retrieve(id, ForeignExchangeQuoteRetrieveParams.none(), requestOptions)

    /** list foreign_exchange_quotes */
    fun list(): ForeignExchangeQuoteListPage = list(ForeignExchangeQuoteListParams.none())

    /** @see [list] */
    fun list(
        params: ForeignExchangeQuoteListParams = ForeignExchangeQuoteListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ForeignExchangeQuoteListPage

    /** @see [list] */
    fun list(
        params: ForeignExchangeQuoteListParams = ForeignExchangeQuoteListParams.none()
    ): ForeignExchangeQuoteListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): ForeignExchangeQuoteListPage =
        list(ForeignExchangeQuoteListParams.none(), requestOptions)

    /**
     * A view of [ForeignExchangeQuoteService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ForeignExchangeQuoteService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/foreign_exchange_quotes`, but is otherwise the
         * same as [ForeignExchangeQuoteService.create].
         */
        @MustBeClosed
        fun create(
            params: ForeignExchangeQuoteCreateParams
        ): HttpResponseFor<ForeignExchangeQuote> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ForeignExchangeQuoteCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ForeignExchangeQuote>

        /**
         * Returns a raw HTTP response for `get /api/foreign_exchange_quotes/{id}`, but is otherwise
         * the same as [ForeignExchangeQuoteService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<ForeignExchangeQuote> =
            retrieve(id, ForeignExchangeQuoteRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ForeignExchangeQuoteRetrieveParams = ForeignExchangeQuoteRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ForeignExchangeQuote> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ForeignExchangeQuoteRetrieveParams = ForeignExchangeQuoteRetrieveParams.none(),
        ): HttpResponseFor<ForeignExchangeQuote> = retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ForeignExchangeQuoteRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ForeignExchangeQuote>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ForeignExchangeQuoteRetrieveParams
        ): HttpResponseFor<ForeignExchangeQuote> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ForeignExchangeQuote> =
            retrieve(id, ForeignExchangeQuoteRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/foreign_exchange_quotes`, but is otherwise the
         * same as [ForeignExchangeQuoteService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ForeignExchangeQuoteListPage> =
            list(ForeignExchangeQuoteListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ForeignExchangeQuoteListParams = ForeignExchangeQuoteListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ForeignExchangeQuoteListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ForeignExchangeQuoteListParams = ForeignExchangeQuoteListParams.none()
        ): HttpResponseFor<ForeignExchangeQuoteListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ForeignExchangeQuoteListPage> =
            list(ForeignExchangeQuoteListParams.none(), requestOptions)
    }
}
