// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.ForeignExchangeQuote
import com.moderntreasury.api.models.ForeignExchangeQuoteCreateParams
import com.moderntreasury.api.models.ForeignExchangeQuoteListPage
import com.moderntreasury.api.models.ForeignExchangeQuoteListParams
import com.moderntreasury.api.models.ForeignExchangeQuoteRetrieveParams

interface ForeignExchangeQuoteService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** create foreign_exchange_quote */
    @JvmOverloads
    fun create(
        params: ForeignExchangeQuoteCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ForeignExchangeQuote

    /** get foreign_exchange_quote */
    @JvmOverloads
    fun retrieve(
        params: ForeignExchangeQuoteRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ForeignExchangeQuote

    /** list foreign_exchange_quotes */
    @JvmOverloads
    fun list(
        params: ForeignExchangeQuoteListParams = ForeignExchangeQuoteListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ForeignExchangeQuoteListPage

    /** list foreign_exchange_quotes */
    fun list(requestOptions: RequestOptions): ForeignExchangeQuoteListPage =
        list(ForeignExchangeQuoteListParams.none(), requestOptions)

    /**
     * A view of [ForeignExchangeQuoteService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/foreign_exchange_quotes`, but is otherwise the
         * same as [ForeignExchangeQuoteService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: ForeignExchangeQuoteCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ForeignExchangeQuote>

        /**
         * Returns a raw HTTP response for `get /api/foreign_exchange_quotes/{id}`, but is otherwise
         * the same as [ForeignExchangeQuoteService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: ForeignExchangeQuoteRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ForeignExchangeQuote>

        /**
         * Returns a raw HTTP response for `get /api/foreign_exchange_quotes`, but is otherwise the
         * same as [ForeignExchangeQuoteService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: ForeignExchangeQuoteListParams = ForeignExchangeQuoteListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ForeignExchangeQuoteListPage>

        /**
         * Returns a raw HTTP response for `get /api/foreign_exchange_quotes`, but is otherwise the
         * same as [ForeignExchangeQuoteService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ForeignExchangeQuoteListPage> =
            list(ForeignExchangeQuoteListParams.none(), requestOptions)
    }
}
