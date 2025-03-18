// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.handlers.errorHandler
import com.moderntreasury.api.core.handlers.jsonHandler
import com.moderntreasury.api.core.handlers.withErrorHandler
import com.moderntreasury.api.core.http.HttpMethod
import com.moderntreasury.api.core.http.HttpRequest
import com.moderntreasury.api.core.http.HttpResponse.Handler
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.core.http.json
import com.moderntreasury.api.core.http.parseable
import com.moderntreasury.api.core.prepareAsync
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.ForeignExchangeQuote
import com.moderntreasury.api.models.ForeignExchangeQuoteCreateParams
import com.moderntreasury.api.models.ForeignExchangeQuoteListPageAsync
import com.moderntreasury.api.models.ForeignExchangeQuoteListParams
import com.moderntreasury.api.models.ForeignExchangeQuoteRetrieveParams
import java.util.concurrent.CompletableFuture

class ForeignExchangeQuoteServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : ForeignExchangeQuoteServiceAsync {

    private val withRawResponse: ForeignExchangeQuoteServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ForeignExchangeQuoteServiceAsync.WithRawResponse =
        withRawResponse

    override fun create(
        params: ForeignExchangeQuoteCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ForeignExchangeQuote> =
        // post /api/foreign_exchange_quotes
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: ForeignExchangeQuoteRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ForeignExchangeQuote> =
        // get /api/foreign_exchange_quotes/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ForeignExchangeQuoteListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ForeignExchangeQuoteListPageAsync> =
        // get /api/foreign_exchange_quotes
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ForeignExchangeQuoteServiceAsync.WithRawResponse {

        private val errorHandler: Handler<ModernTreasuryError> =
            errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<ForeignExchangeQuote> =
            jsonHandler<ForeignExchangeQuote>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: ForeignExchangeQuoteCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ForeignExchangeQuote>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("api", "foreign_exchange_quotes")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<ForeignExchangeQuote> =
            jsonHandler<ForeignExchangeQuote>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: ForeignExchangeQuoteRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ForeignExchangeQuote>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "foreign_exchange_quotes", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<List<ForeignExchangeQuote>> =
            jsonHandler<List<ForeignExchangeQuote>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: ForeignExchangeQuoteListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ForeignExchangeQuoteListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "foreign_exchange_quotes")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                            .let {
                                ForeignExchangeQuoteListPageAsync.of(
                                    ForeignExchangeQuoteServiceAsyncImpl(clientOptions),
                                    params,
                                    ForeignExchangeQuoteListPageAsync.Response.builder()
                                        .items(it)
                                        .perPage(
                                            response.headers().values("X-Per-Page").getOrNull(0)
                                                ?: ""
                                        )
                                        .afterCursor(
                                            response.headers().values("X-After-Cursor").getOrNull(0)
                                                ?: ""
                                        )
                                        .build(),
                                )
                            }
                    }
                }
        }
    }
}
