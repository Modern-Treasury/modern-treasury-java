package com.moderntreasury.api.services.async.paymentOrders

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpMethod
import com.moderntreasury.api.core.http.HttpRequest
import com.moderntreasury.api.core.http.HttpResponse.Handler
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.PaymentOrderReversalCreateParams
import com.moderntreasury.api.models.PaymentOrderReversalListPageAsync
import com.moderntreasury.api.models.PaymentOrderReversalListParams
import com.moderntreasury.api.models.PaymentOrderReversalRetrieveParams
import com.moderntreasury.api.models.Reversal
import com.moderntreasury.api.services.errorHandler
import com.moderntreasury.api.services.json
import com.moderntreasury.api.services.jsonHandler
import com.moderntreasury.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class ReversalServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : ReversalServiceAsync {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Reversal> =
        jsonHandler<Reversal>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a reversal for a payment order. */
    override fun create(
        params: PaymentOrderReversalCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Reversal> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("api", "payment_orders", params.getPathParam(0), "reversals")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .let { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveHandler: Handler<Reversal> =
        jsonHandler<Reversal>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get details on a single reversal of a payment order. */
    override fun retrieve(
        params: PaymentOrderReversalRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Reversal> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "api",
                    "payment_orders",
                    params.getPathParam(0),
                    "reversals",
                    params.getPathParam(1)
                )
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .let { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<List<Reversal>> =
        jsonHandler<List<Reversal>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a list of all reversals of a payment order. */
    override fun list(
        params: PaymentOrderReversalListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<PaymentOrderReversalListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "payment_orders", params.getPathParam(0), "reversals")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .let { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        forEach { it.validate() }
                    }
                }
                .let {
                    PaymentOrderReversalListPageAsync.Response.Builder()
                        .items(it)
                        .perPage(response.headers()["X-Per-Page"].getOrNull(0) ?: "")
                        .afterCursor(response.headers()["X-After-Cursor"].getOrNull(0) ?: "")
                        .build()
                }
                .let { PaymentOrderReversalListPageAsync.of(this, params, it) }
        }
    }
}
