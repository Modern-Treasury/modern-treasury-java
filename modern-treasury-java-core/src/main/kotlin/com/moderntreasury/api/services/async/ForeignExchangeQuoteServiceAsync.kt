// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.ForeignExchangeQuote
import com.moderntreasury.api.models.ForeignExchangeQuoteCreateParams
import com.moderntreasury.api.models.ForeignExchangeQuoteListPageAsync
import com.moderntreasury.api.models.ForeignExchangeQuoteListParams
import com.moderntreasury.api.models.ForeignExchangeQuoteRetrieveParams
import java.util.concurrent.CompletableFuture

interface ForeignExchangeQuoteServiceAsync {

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
        params: ForeignExchangeQuoteListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ForeignExchangeQuoteListPageAsync>
}
