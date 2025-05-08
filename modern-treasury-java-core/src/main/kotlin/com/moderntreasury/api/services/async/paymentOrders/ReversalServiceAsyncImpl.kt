// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async.paymentOrders

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
import com.moderntreasury.api.models.PaymentOrderReversalCreateParams
import com.moderntreasury.api.models.PaymentOrderReversalListPageAsync
import com.moderntreasury.api.models.PaymentOrderReversalListParams
import com.moderntreasury.api.models.PaymentOrderReversalRetrieveParams
import com.moderntreasury.api.models.Reversal
import java.util.concurrent.CompletableFuture
import kotlin.jvm.optionals.getOrNull

class ReversalServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ReversalServiceAsync {

    private val withRawResponse: ReversalServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ReversalServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: PaymentOrderReversalCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Reversal> =
        // post /api/payment_orders/{payment_order_id}/reversals
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: PaymentOrderReversalRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Reversal> =
        // get /api/payment_orders/{payment_order_id}/reversals/{reversal_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: PaymentOrderReversalListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PaymentOrderReversalListPageAsync> =
        // get /api/payment_orders/{payment_order_id}/reversals
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ReversalServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<Reversal> =
            jsonHandler<Reversal>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: PaymentOrderReversalCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Reversal>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("paymentOrderId", params.paymentOrderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("api", "payment_orders", params._pathParam(0), "reversals")
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

        private val retrieveHandler: Handler<Reversal> =
            jsonHandler<Reversal>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: PaymentOrderReversalRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Reversal>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("reversalId", params.reversalId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "api",
                        "payment_orders",
                        params._pathParam(0),
                        "reversals",
                        params._pathParam(1),
                    )
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

        private val listHandler: Handler<List<Reversal>> =
            jsonHandler<List<Reversal>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(
            params: PaymentOrderReversalListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PaymentOrderReversalListPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("paymentOrderId", params.paymentOrderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "payment_orders", params._pathParam(0), "reversals")
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
                                PaymentOrderReversalListPageAsync.builder()
                                    .service(ReversalServiceAsyncImpl(clientOptions))
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
