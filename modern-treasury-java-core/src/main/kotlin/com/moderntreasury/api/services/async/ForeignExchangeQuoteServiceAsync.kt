// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.ForeignExchangeQuote
import com.moderntreasury.api.models.ForeignExchangeQuoteCreateParams
import com.moderntreasury.api.models.ForeignExchangeQuoteListPageAsync
import com.moderntreasury.api.models.ForeignExchangeQuoteListParams
import com.moderntreasury.api.models.ForeignExchangeQuoteRetrieveParams
import java.util.concurrent.CompletableFuture

interface ForeignExchangeQuoteServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** create foreign_exchange_quote */
    fun create(params: ForeignExchangeQuoteCreateParams): CompletableFuture<ForeignExchangeQuote> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: ForeignExchangeQuoteCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ForeignExchangeQuote>

    /** get foreign_exchange_quote */
    fun retrieve(id: String): CompletableFuture<ForeignExchangeQuote> =
        retrieve(id, ForeignExchangeQuoteRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: ForeignExchangeQuoteRetrieveParams = ForeignExchangeQuoteRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ForeignExchangeQuote> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: ForeignExchangeQuoteRetrieveParams = ForeignExchangeQuoteRetrieveParams.none(),
    ): CompletableFuture<ForeignExchangeQuote> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ForeignExchangeQuoteRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ForeignExchangeQuote>

    /** @see [retrieve] */
    fun retrieve(
        params: ForeignExchangeQuoteRetrieveParams
    ): CompletableFuture<ForeignExchangeQuote> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ForeignExchangeQuote> =
        retrieve(id, ForeignExchangeQuoteRetrieveParams.none(), requestOptions)

    /** list foreign_exchange_quotes */
    fun list(): CompletableFuture<ForeignExchangeQuoteListPageAsync> =
        list(ForeignExchangeQuoteListParams.none())

    /** @see [list] */
    fun list(
        params: ForeignExchangeQuoteListParams = ForeignExchangeQuoteListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ForeignExchangeQuoteListPageAsync>

    /** @see [list] */
    fun list(
        params: ForeignExchangeQuoteListParams = ForeignExchangeQuoteListParams.none()
    ): CompletableFuture<ForeignExchangeQuoteListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<ForeignExchangeQuoteListPageAsync> =
        list(ForeignExchangeQuoteListParams.none(), requestOptions)

    /**
     * A view of [ForeignExchangeQuoteServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/foreign_exchange_quotes`, but is otherwise the
         * same as [ForeignExchangeQuoteServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: ForeignExchangeQuoteCreateParams
        ): CompletableFuture<HttpResponseFor<ForeignExchangeQuote>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ForeignExchangeQuoteCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ForeignExchangeQuote>>

        /**
         * Returns a raw HTTP response for `get /api/foreign_exchange_quotes/{id}`, but is otherwise
         * the same as [ForeignExchangeQuoteServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<ForeignExchangeQuote>> =
            retrieve(id, ForeignExchangeQuoteRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ForeignExchangeQuoteRetrieveParams = ForeignExchangeQuoteRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ForeignExchangeQuote>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ForeignExchangeQuoteRetrieveParams = ForeignExchangeQuoteRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ForeignExchangeQuote>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ForeignExchangeQuoteRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ForeignExchangeQuote>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ForeignExchangeQuoteRetrieveParams
        ): CompletableFuture<HttpResponseFor<ForeignExchangeQuote>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ForeignExchangeQuote>> =
            retrieve(id, ForeignExchangeQuoteRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/foreign_exchange_quotes`, but is otherwise the
         * same as [ForeignExchangeQuoteServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<ForeignExchangeQuoteListPageAsync>> =
            list(ForeignExchangeQuoteListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ForeignExchangeQuoteListParams = ForeignExchangeQuoteListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ForeignExchangeQuoteListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ForeignExchangeQuoteListParams = ForeignExchangeQuoteListParams.none()
        ): CompletableFuture<HttpResponseFor<ForeignExchangeQuoteListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ForeignExchangeQuoteListPageAsync>> =
            list(ForeignExchangeQuoteListParams.none(), requestOptions)
    }
}
