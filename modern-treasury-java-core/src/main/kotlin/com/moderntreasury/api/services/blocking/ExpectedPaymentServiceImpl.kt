// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

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
import com.moderntreasury.api.core.prepare
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.ExpectedPayment
import com.moderntreasury.api.models.ExpectedPaymentCreateParams
import com.moderntreasury.api.models.ExpectedPaymentDeleteParams
import com.moderntreasury.api.models.ExpectedPaymentListPage
import com.moderntreasury.api.models.ExpectedPaymentListParams
import com.moderntreasury.api.models.ExpectedPaymentRetrieveParams
import com.moderntreasury.api.models.ExpectedPaymentUpdateParams

class ExpectedPaymentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ExpectedPaymentService {

    private val withRawResponse: ExpectedPaymentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExpectedPaymentService.WithRawResponse = withRawResponse

    override fun create(
        params: ExpectedPaymentCreateParams,
        requestOptions: RequestOptions,
    ): ExpectedPayment =
        // post /api/expected_payments
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: ExpectedPaymentRetrieveParams,
        requestOptions: RequestOptions,
    ): ExpectedPayment =
        // get /api/expected_payments/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: ExpectedPaymentUpdateParams,
        requestOptions: RequestOptions,
    ): ExpectedPayment =
        // patch /api/expected_payments/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: ExpectedPaymentListParams,
        requestOptions: RequestOptions,
    ): ExpectedPaymentListPage =
        // get /api/expected_payments
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: ExpectedPaymentDeleteParams,
        requestOptions: RequestOptions,
    ): ExpectedPayment =
        // delete /api/expected_payments/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExpectedPaymentService.WithRawResponse {

        private val errorHandler: Handler<ModernTreasuryError> =
            errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<ExpectedPayment> =
            jsonHandler<ExpectedPayment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: ExpectedPaymentCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExpectedPayment> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("api", "expected_payments")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<ExpectedPayment> =
            jsonHandler<ExpectedPayment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: ExpectedPaymentRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExpectedPayment> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "expected_payments", params.getPathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<ExpectedPayment> =
            jsonHandler<ExpectedPayment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: ExpectedPaymentUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExpectedPayment> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("api", "expected_payments", params.getPathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<ExpectedPaymentListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "expected_payments")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
                    .let {
                        ExpectedPaymentListPage.of(
                            ExpectedPaymentServiceImpl(clientOptions),
                            params,
                            ExpectedPaymentListPage.Response.builder()
                                .items(it)
                                .perPage(response.headers().values("X-Per-Page").getOrNull(0) ?: "")
                                .afterCursor(
                                    response.headers().values("X-After-Cursor").getOrNull(0) ?: ""
                                )
                                .build(),
                        )
                    }
            }
        }

        private val deleteHandler: Handler<ExpectedPayment> =
            jsonHandler<ExpectedPayment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: ExpectedPaymentDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExpectedPayment> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("api", "expected_payments", params.getPathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
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
