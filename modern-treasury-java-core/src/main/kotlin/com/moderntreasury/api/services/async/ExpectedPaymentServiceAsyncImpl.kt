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
import com.moderntreasury.api.models.ExpectedPayment
import com.moderntreasury.api.models.ExpectedPaymentCreateParams
import com.moderntreasury.api.models.ExpectedPaymentDeleteParams
import com.moderntreasury.api.models.ExpectedPaymentListPageAsync
import com.moderntreasury.api.models.ExpectedPaymentListParams
import com.moderntreasury.api.models.ExpectedPaymentRetrieveParams
import com.moderntreasury.api.models.ExpectedPaymentUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ExpectedPaymentServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : ExpectedPaymentServiceAsync {

    private val withRawResponse: ExpectedPaymentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExpectedPaymentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): ExpectedPaymentServiceAsync =
        ExpectedPaymentServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: ExpectedPaymentCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExpectedPayment> =
        // post /api/expected_payments
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: ExpectedPaymentRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExpectedPayment> =
        // get /api/expected_payments/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: ExpectedPaymentUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExpectedPayment> =
        // patch /api/expected_payments/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ExpectedPaymentListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExpectedPaymentListPageAsync> =
        // get /api/expected_payments
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: ExpectedPaymentDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExpectedPayment> =
        // delete /api/expected_payments/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExpectedPaymentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExpectedPaymentServiceAsync.WithRawResponse =
            ExpectedPaymentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ExpectedPayment> =
            jsonHandler<ExpectedPayment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: ExpectedPaymentCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExpectedPayment>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "expected_payments")
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

        private val retrieveHandler: Handler<ExpectedPayment> =
            jsonHandler<ExpectedPayment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: ExpectedPaymentRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExpectedPayment>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "expected_payments", params._pathParam(0))
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

        private val updateHandler: Handler<ExpectedPayment> =
            jsonHandler<ExpectedPayment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: ExpectedPaymentUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExpectedPayment>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "expected_payments", params._pathParam(0))
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

        private val listHandler: Handler<List<ExpectedPayment>> =
            jsonHandler<List<ExpectedPayment>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: ExpectedPaymentListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExpectedPaymentListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "expected_payments")
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
                                ExpectedPaymentListPageAsync.builder()
                                    .service(ExpectedPaymentServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .headers(response.headers())
                                    .items(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<ExpectedPayment> =
            jsonHandler<ExpectedPayment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: ExpectedPaymentDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExpectedPayment>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "expected_payments", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { deleteHandler.handle(it) }
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
