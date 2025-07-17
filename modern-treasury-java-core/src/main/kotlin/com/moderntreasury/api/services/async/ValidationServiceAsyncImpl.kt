// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.handlers.errorBodyHandler
import com.moderntreasury.api.core.handlers.errorHandler
import com.moderntreasury.api.core.handlers.jsonHandler
import com.moderntreasury.api.core.http.HttpMethod
import com.moderntreasury.api.core.http.HttpRequest
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.core.http.HttpResponse.Handler
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.core.http.parseable
import com.moderntreasury.api.core.prepareAsync
import com.moderntreasury.api.models.RoutingNumberLookupRequest
import com.moderntreasury.api.models.ValidationValidateRoutingNumberParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class ValidationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ValidationServiceAsync {

    private val withRawResponse: ValidationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ValidationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ValidationServiceAsync =
        ValidationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun validateRoutingNumber(
        params: ValidationValidateRoutingNumberParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RoutingNumberLookupRequest> =
        // get /api/validations/routing_numbers
        withRawResponse().validateRoutingNumber(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ValidationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ValidationServiceAsync.WithRawResponse =
            ValidationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val validateRoutingNumberHandler: Handler<RoutingNumberLookupRequest> =
            jsonHandler<RoutingNumberLookupRequest>(clientOptions.jsonMapper)

        override fun validateRoutingNumber(
            params: ValidationValidateRoutingNumberParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RoutingNumberLookupRequest>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "validations", "routing_numbers")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { validateRoutingNumberHandler.handle(it) }
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
