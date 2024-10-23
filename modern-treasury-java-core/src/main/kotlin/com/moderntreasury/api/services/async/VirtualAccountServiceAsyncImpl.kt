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
import com.moderntreasury.api.models.VirtualAccount
import com.moderntreasury.api.models.VirtualAccountCreateParams
import com.moderntreasury.api.models.VirtualAccountDeleteParams
import com.moderntreasury.api.models.VirtualAccountListPageAsync
import com.moderntreasury.api.models.VirtualAccountListParams
import com.moderntreasury.api.models.VirtualAccountRetrieveParams
import com.moderntreasury.api.models.VirtualAccountUpdateParams
import java.util.concurrent.CompletableFuture

class VirtualAccountServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : VirtualAccountServiceAsync {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<VirtualAccount> =
        jsonHandler<VirtualAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** create virtual_account */
    override fun create(
        params: VirtualAccountCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<VirtualAccount> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("api", "virtual_accounts")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
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

    private val retrieveHandler: Handler<VirtualAccount> =
        jsonHandler<VirtualAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** get virtual_account */
    override fun retrieve(
        params: VirtualAccountRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<VirtualAccount> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "virtual_accounts", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
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

    private val updateHandler: Handler<VirtualAccount> =
        jsonHandler<VirtualAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** update virtual_account */
    override fun update(
        params: VirtualAccountUpdateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<VirtualAccount> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("api", "virtual_accounts", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<List<VirtualAccount>> =
        jsonHandler<List<VirtualAccount>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a list of virtual accounts. */
    override fun list(
        params: VirtualAccountListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<VirtualAccountListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "virtual_accounts")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
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
                    VirtualAccountListPageAsync.Response.Builder()
                        .items(it)
                        .perPage(response.headers()["X-Per-Page"].getOrNull(0) ?: "")
                        .afterCursor(response.headers()["X-After-Cursor"].getOrNull(0) ?: "")
                        .build()
                }
                .let { VirtualAccountListPageAsync.of(this, params, it) }
        }
    }

    private val deleteHandler: Handler<VirtualAccount> =
        jsonHandler<VirtualAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** delete virtual_account */
    override fun delete(
        params: VirtualAccountDeleteParams,
        requestOptions: RequestOptions
    ): CompletableFuture<VirtualAccount> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("api", "virtual_accounts", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
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
