// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

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
    @JvmOverloads
    fun create(
        params: ForeignExchangeQuoteCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ForeignExchangeQuote>

    /** get foreign_exchange_quote */
    @JvmOverloads
    fun retrieve(
        params: ForeignExchangeQuoteRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ForeignExchangeQuote>

    /** list foreign_exchange_quotes */
    @JvmOverloads
    fun list(
        params: ForeignExchangeQuoteListParams = ForeignExchangeQuoteListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ForeignExchangeQuoteListPageAsync>

    /** list foreign_exchange_quotes */
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
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: ForeignExchangeQuoteCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ForeignExchangeQuote>>

        /**
         * Returns a raw HTTP response for `get /api/foreign_exchange_quotes/{id}`, but is otherwise
         * the same as [ForeignExchangeQuoteServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: ForeignExchangeQuoteRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ForeignExchangeQuote>>

        /**
         * Returns a raw HTTP response for `get /api/foreign_exchange_quotes`, but is otherwise the
         * same as [ForeignExchangeQuoteServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: ForeignExchangeQuoteListParams = ForeignExchangeQuoteListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ForeignExchangeQuoteListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /api/foreign_exchange_quotes`, but is otherwise the
         * same as [ForeignExchangeQuoteServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ForeignExchangeQuoteListPageAsync>> =
            list(ForeignExchangeQuoteListParams.none(), requestOptions)
    }
}
