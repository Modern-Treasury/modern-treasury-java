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
import com.moderntreasury.api.core.prepareAsync
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.BulkResult
import com.moderntreasury.api.models.BulkResultListPageAsync
import com.moderntreasury.api.models.BulkResultListParams
import com.moderntreasury.api.models.BulkResultRetrieveParams
import java.util.concurrent.CompletableFuture

class BulkResultServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BulkResultServiceAsync {

    private val withRawResponse: BulkResultServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BulkResultServiceAsync.WithRawResponse = withRawResponse

    override fun retrieve(
        params: BulkResultRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BulkResult> =
        // get /api/bulk_results/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: BulkResultListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BulkResultListPageAsync> =
        // get /api/bulk_results
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BulkResultServiceAsync.WithRawResponse {

        private val errorHandler: Handler<ModernTreasuryError> =
            errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<BulkResult> =
            jsonHandler<BulkResult>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: BulkResultRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BulkResult>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "bulk_results", params._pathParam(0))
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

        private val listHandler: Handler<List<BulkResult>> =
            jsonHandler<List<BulkResult>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(
            params: BulkResultListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BulkResultListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "bulk_results")
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
                                BulkResultListPageAsync.of(
                                    BulkResultServiceAsyncImpl(clientOptions),
                                    params,
                                    BulkResultListPageAsync.Response.builder()
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
