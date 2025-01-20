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
import com.moderntreasury.api.core.json
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.LedgerEventHandler
import com.moderntreasury.api.models.LedgerEventHandlerCreateParams
import com.moderntreasury.api.models.LedgerEventHandlerDeleteParams
import com.moderntreasury.api.models.LedgerEventHandlerListPageAsync
import com.moderntreasury.api.models.LedgerEventHandlerListParams
import com.moderntreasury.api.models.LedgerEventHandlerRetrieveParams
import java.util.concurrent.CompletableFuture

class LedgerEventHandlerServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : LedgerEventHandlerServiceAsync {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<LedgerEventHandler> =
        jsonHandler<LedgerEventHandler>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** create ledger_event_handler */
    override fun create(
        params: LedgerEventHandlerCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<LedgerEventHandler> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("api", "ledger_event_handlers")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveHandler: Handler<LedgerEventHandler> =
        jsonHandler<LedgerEventHandler>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get details on a single ledger event handler. */
    override fun retrieve(
        params: LedgerEventHandlerRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<LedgerEventHandler> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "ledger_event_handlers", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<List<LedgerEventHandler>> =
        jsonHandler<List<LedgerEventHandler>>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get a list of ledger event handlers. */
    override fun list(
        params: LedgerEventHandlerListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<LedgerEventHandlerListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "ledger_event_handlers")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        forEach { it.validate() }
                    }
                }
                .let {
                    LedgerEventHandlerListPageAsync.Response.Builder()
                        .items(it)
                        .perPage(response.headers().values("X-Per-Page").getOrNull(0) ?: "")
                        .afterCursor(response.headers().values("X-After-Cursor").getOrNull(0) ?: "")
                        .build()
                }
                .let { LedgerEventHandlerListPageAsync.of(this, params, it) }
        }
    }

    private val deleteHandler: Handler<LedgerEventHandler> =
        jsonHandler<LedgerEventHandler>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Archive a ledger event handler. */
    override fun delete(
        params: LedgerEventHandlerDeleteParams,
        requestOptions: RequestOptions
    ): CompletableFuture<LedgerEventHandler> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("api", "ledger_event_handlers", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { deleteHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
