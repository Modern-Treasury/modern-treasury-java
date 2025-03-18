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
import com.moderntreasury.api.models.AsyncResponse
import com.moderntreasury.api.models.IncomingPaymentDetail
import com.moderntreasury.api.models.IncomingPaymentDetailCreateAsyncParams
import com.moderntreasury.api.models.IncomingPaymentDetailListPageAsync
import com.moderntreasury.api.models.IncomingPaymentDetailListParams
import com.moderntreasury.api.models.IncomingPaymentDetailRetrieveParams
import com.moderntreasury.api.models.IncomingPaymentDetailUpdateParams
import java.util.concurrent.CompletableFuture

class IncomingPaymentDetailServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : IncomingPaymentDetailServiceAsync {

    private val withRawResponse: IncomingPaymentDetailServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): IncomingPaymentDetailServiceAsync.WithRawResponse =
        withRawResponse

    override fun retrieve(
        params: IncomingPaymentDetailRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IncomingPaymentDetail> =
        // get /api/incoming_payment_details/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: IncomingPaymentDetailUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IncomingPaymentDetail> =
        // patch /api/incoming_payment_details/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: IncomingPaymentDetailListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IncomingPaymentDetailListPageAsync> =
        // get /api/incoming_payment_details
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun createAsync(
        params: IncomingPaymentDetailCreateAsyncParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AsyncResponse> =
        // post /api/simulations/incoming_payment_details/create_async
        withRawResponse().createAsync(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IncomingPaymentDetailServiceAsync.WithRawResponse {

        private val errorHandler: Handler<ModernTreasuryError> =
            errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<IncomingPaymentDetail> =
            jsonHandler<IncomingPaymentDetail>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: IncomingPaymentDetailRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IncomingPaymentDetail>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "incoming_payment_details", params._pathParam(0))
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

        private val updateHandler: Handler<IncomingPaymentDetail> =
            jsonHandler<IncomingPaymentDetail>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: IncomingPaymentDetailUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IncomingPaymentDetail>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("api", "incoming_payment_details", params._pathParam(0))
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

        private val listHandler: Handler<List<IncomingPaymentDetail>> =
            jsonHandler<List<IncomingPaymentDetail>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: IncomingPaymentDetailListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IncomingPaymentDetailListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "incoming_payment_details")
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
                                IncomingPaymentDetailListPageAsync.of(
                                    IncomingPaymentDetailServiceAsyncImpl(clientOptions),
                                    params,
                                    IncomingPaymentDetailListPageAsync.Response.builder()
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

        private val createAsyncHandler: Handler<AsyncResponse> =
            jsonHandler<AsyncResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun createAsync(
            params: IncomingPaymentDetailCreateAsyncParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AsyncResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "api",
                        "simulations",
                        "incoming_payment_details",
                        "create_async",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { createAsyncHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
