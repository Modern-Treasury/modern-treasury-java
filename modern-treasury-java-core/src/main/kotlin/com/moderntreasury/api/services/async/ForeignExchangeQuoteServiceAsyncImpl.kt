// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.checkRequired
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
import com.moderntreasury.api.models.ForeignExchangeQuote
import com.moderntreasury.api.models.ForeignExchangeQuoteCreateParams
import com.moderntreasury.api.models.ForeignExchangeQuoteListPageAsync
import com.moderntreasury.api.models.ForeignExchangeQuoteListParams
import com.moderntreasury.api.models.ForeignExchangeQuoteRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ForeignExchangeQuoteServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : ForeignExchangeQuoteServiceAsync {

    private val withRawResponse: ForeignExchangeQuoteServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ForeignExchangeQuoteServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): ForeignExchangeQuoteServiceAsync =
        ForeignExchangeQuoteServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

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

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ForeignExchangeQuoteServiceAsync.WithRawResponse =
            ForeignExchangeQuoteServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

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
                    .baseUrl(clientOptions.baseUrl())
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
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
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
                    .baseUrl(clientOptions.baseUrl())
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
                                ForeignExchangeQuoteListPageAsync.builder()
                                    .service(ForeignExchangeQuoteServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .headers(response.headers())
                                    .items(it)
                                    .build()
                            }
                    }
                }
        }
    }
}
