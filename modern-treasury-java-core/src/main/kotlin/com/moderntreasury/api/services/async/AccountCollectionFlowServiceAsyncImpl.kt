package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpMethod
import com.moderntreasury.api.core.http.HttpRequest
import com.moderntreasury.api.core.http.HttpResponse.Handler
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.AccountCollectionFlowCreateParams
import com.moderntreasury.api.models.AccountCollectionFlowListPageAsync
import com.moderntreasury.api.models.AccountCollectionFlowListParams
import com.moderntreasury.api.models.AccountCollectionFlowRetrieveParams
import com.moderntreasury.api.models.AccountCollectionFlowUpdateParams
import com.moderntreasury.api.models.AccountConnectionFlow
import com.moderntreasury.api.services.errorHandler
import com.moderntreasury.api.services.json
import com.moderntreasury.api.services.jsonHandler
import com.moderntreasury.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class AccountCollectionFlowServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : AccountCollectionFlowServiceAsync {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<AccountConnectionFlow> =
        jsonHandler<AccountConnectionFlow>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** create account_collection_flow */
    override fun create(
        params: AccountCollectionFlowCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<AccountConnectionFlow> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("api", "account_collection_flows")
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

    private val retrieveHandler: Handler<AccountConnectionFlow> =
        jsonHandler<AccountConnectionFlow>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** get account_collection_flow */
    override fun retrieve(
        params: AccountCollectionFlowRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<AccountConnectionFlow> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "account_collection_flows", params.getPathParam(0))
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

    private val updateHandler: Handler<AccountConnectionFlow> =
        jsonHandler<AccountConnectionFlow>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** update account_collection_flow */
    override fun update(
        params: AccountCollectionFlowUpdateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<AccountConnectionFlow> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("api", "account_collection_flows", params.getPathParam(0))
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

    private val listHandler: Handler<List<AccountConnectionFlow>> =
        jsonHandler<List<AccountConnectionFlow>>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** list account_collection_flows */
    override fun list(
        params: AccountCollectionFlowListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<AccountCollectionFlowListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "account_collection_flows")
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
                    AccountCollectionFlowListPageAsync.Response.Builder()
                        .items(it)
                        .perPage(response.headers()["X-Per-Page"].getOrNull(0) ?: "")
                        .afterCursor(response.headers()["X-After-Cursor"].getOrNull(0) ?: "")
                        .build()
                }
                .let { AccountCollectionFlowListPageAsync.of(this, params, it) }
        }
    }
}
