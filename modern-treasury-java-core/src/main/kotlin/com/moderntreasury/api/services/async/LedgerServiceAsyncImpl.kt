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
import com.moderntreasury.api.core.prepareAsync
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.Ledger
import com.moderntreasury.api.models.LedgerCreateParams
import com.moderntreasury.api.models.LedgerDeleteParams
import com.moderntreasury.api.models.LedgerListPageAsync
import com.moderntreasury.api.models.LedgerListParams
import com.moderntreasury.api.models.LedgerRetrieveParams
import com.moderntreasury.api.models.LedgerUpdateParams
import java.util.concurrent.CompletableFuture

class LedgerServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : LedgerServiceAsync {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Ledger> =
        jsonHandler<Ledger>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a ledger. */
    override fun create(
        params: LedgerCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Ledger> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("api", "ledgers")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { createHandler.handle(it) }
                    .apply {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            validate()
                        }
                    }
            }
    }

    private val retrieveHandler: Handler<Ledger> =
        jsonHandler<Ledger>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get details on a single ledger. */
    override fun retrieve(
        params: LedgerRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Ledger> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "ledgers", params.getPathParam(0))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { retrieveHandler.handle(it) }
                    .apply {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            validate()
                        }
                    }
            }
    }

    private val updateHandler: Handler<Ledger> =
        jsonHandler<Ledger>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update the details of a ledger. */
    override fun update(
        params: LedgerUpdateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Ledger> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("api", "ledgers", params.getPathParam(0))
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { updateHandler.handle(it) }
                    .apply {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            validate()
                        }
                    }
            }
    }

    private val listHandler: Handler<List<Ledger>> =
        jsonHandler<List<Ledger>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a list of ledgers. */
    override fun list(
        params: LedgerListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<LedgerListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "ledgers")
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listHandler.handle(it) }
                    .apply {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            forEach { it.validate() }
                        }
                    }
                    .let {
                        LedgerListPageAsync.Response.Builder()
                            .items(it)
                            .perPage(response.headers().values("X-Per-Page").getOrNull(0) ?: "")
                            .afterCursor(
                                response.headers().values("X-After-Cursor").getOrNull(0) ?: ""
                            )
                            .build()
                    }
                    .let { LedgerListPageAsync.of(this, params, it) }
            }
    }

    private val deleteHandler: Handler<Ledger> =
        jsonHandler<Ledger>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Delete a ledger. */
    override fun delete(
        params: LedgerDeleteParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Ledger> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("api", "ledgers", params.getPathParam(0))
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
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
