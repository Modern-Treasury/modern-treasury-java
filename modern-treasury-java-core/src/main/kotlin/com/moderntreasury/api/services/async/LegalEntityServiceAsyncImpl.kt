// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.JsonValue
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
import com.moderntreasury.api.models.LegalEntity
import com.moderntreasury.api.models.LegalEntityCreateParams
import com.moderntreasury.api.models.LegalEntityListPageAsync
import com.moderntreasury.api.models.LegalEntityListParams
import com.moderntreasury.api.models.LegalEntityRetrieveParams
import com.moderntreasury.api.models.LegalEntityUpdateParams
import java.util.concurrent.CompletableFuture

class LegalEntityServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    LegalEntityServiceAsync {

    private val withRawResponse: LegalEntityServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LegalEntityServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: LegalEntityCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LegalEntity> =
        // post /api/legal_entities
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: LegalEntityRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LegalEntity> =
        // get /api/legal_entities/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: LegalEntityUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LegalEntity> =
        // patch /api/legal_entities/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: LegalEntityListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LegalEntityListPageAsync> =
        // get /api/legal_entities
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LegalEntityServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<LegalEntity> =
            jsonHandler<LegalEntity>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: LegalEntityCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LegalEntity>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("api", "legal_entities")
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

        private val retrieveHandler: Handler<LegalEntity> =
            jsonHandler<LegalEntity>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: LegalEntityRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LegalEntity>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "legal_entities", params._pathParam(0))
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

        private val updateHandler: Handler<LegalEntity> =
            jsonHandler<LegalEntity>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: LegalEntityUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LegalEntity>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("api", "legal_entities", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<List<LegalEntity>> =
            jsonHandler<List<LegalEntity>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(
            params: LegalEntityListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LegalEntityListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "legal_entities")
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
                                LegalEntityListPageAsync.of(
                                    LegalEntityServiceAsyncImpl(clientOptions),
                                    params,
                                    LegalEntityListPageAsync.Response.builder()
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
