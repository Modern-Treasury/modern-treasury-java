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
import com.moderntreasury.api.core.http.parseable
import com.moderntreasury.api.core.json
import com.moderntreasury.api.core.prepareAsync
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.BulkRequest
import com.moderntreasury.api.models.BulkRequestCreateParams
import com.moderntreasury.api.models.BulkRequestListPageAsync
import com.moderntreasury.api.models.BulkRequestListParams
import com.moderntreasury.api.models.BulkRequestRetrieveParams
import java.util.concurrent.CompletableFuture

class BulkRequestServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BulkRequestServiceAsync {

    private val withRawResponse: BulkRequestServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BulkRequestServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: BulkRequestCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BulkRequest> =
        // post /api/bulk_requests
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: BulkRequestRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BulkRequest> =
        // get /api/bulk_requests/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: BulkRequestListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BulkRequestListPageAsync> =
        // get /api/bulk_requests
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BulkRequestServiceAsync.WithRawResponse {

        private val errorHandler: Handler<ModernTreasuryError> =
            errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<BulkRequest> =
            jsonHandler<BulkRequest>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: BulkRequestCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BulkRequest>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("api", "bulk_requests")
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

        private val retrieveHandler: Handler<BulkRequest> =
            jsonHandler<BulkRequest>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: BulkRequestRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BulkRequest>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "bulk_requests", params.getPathParam(0))
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

        private val listHandler: Handler<List<BulkRequest>> =
            jsonHandler<List<BulkRequest>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(
            params: BulkRequestListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BulkRequestListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "bulk_requests")
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
                                BulkRequestListPageAsync.of(
                                    BulkRequestServiceAsyncImpl(clientOptions),
                                    params,
                                    BulkRequestListPageAsync.Response.builder()
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
