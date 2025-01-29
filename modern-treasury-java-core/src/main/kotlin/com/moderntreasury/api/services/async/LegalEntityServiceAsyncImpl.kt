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
import com.moderntreasury.api.models.LegalEntity
import com.moderntreasury.api.models.LegalEntityCreateParams
import com.moderntreasury.api.models.LegalEntityListPageAsync
import com.moderntreasury.api.models.LegalEntityListParams
import com.moderntreasury.api.models.LegalEntityRetrieveParams
import com.moderntreasury.api.models.LegalEntityUpdateParams
import java.util.concurrent.CompletableFuture

class LegalEntityServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : LegalEntityServiceAsync {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<LegalEntity> =
        jsonHandler<LegalEntity>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** create legal_entity */
    override fun create(
        params: LegalEntityCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<LegalEntity> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("api", "legal_entities")
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

    private val retrieveHandler: Handler<LegalEntity> =
        jsonHandler<LegalEntity>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get details on a single legal entity. */
    override fun retrieve(
        params: LegalEntityRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<LegalEntity> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "legal_entities", params.getPathParam(0))
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

    private val updateHandler: Handler<LegalEntity> =
        jsonHandler<LegalEntity>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update a legal entity. */
    override fun update(
        params: LegalEntityUpdateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<LegalEntity> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("api", "legal_entities", params.getPathParam(0))
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

    private val listHandler: Handler<List<LegalEntity>> =
        jsonHandler<List<LegalEntity>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a list of all legal entities. */
    override fun list(
        params: LegalEntityListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<LegalEntityListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "legal_entities")
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
                        LegalEntityListPageAsync.Response.Builder()
                            .items(it)
                            .perPage(response.headers().values("X-Per-Page").getOrNull(0) ?: "")
                            .afterCursor(
                                response.headers().values("X-After-Cursor").getOrNull(0) ?: ""
                            )
                            .build()
                    }
                    .let { LegalEntityListPageAsync.of(this, params, it) }
            }
    }
}
