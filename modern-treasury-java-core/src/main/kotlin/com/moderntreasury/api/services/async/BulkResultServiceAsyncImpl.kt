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
import com.moderntreasury.api.core.prepareAsync
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.BulkResult
import com.moderntreasury.api.models.BulkResultListPageAsync
import com.moderntreasury.api.models.BulkResultListParams
import com.moderntreasury.api.models.BulkResultRetrieveParams
import java.util.concurrent.CompletableFuture

class BulkResultServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : BulkResultServiceAsync {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<BulkResult> =
        jsonHandler<BulkResult>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** get bulk_result */
    override fun retrieve(
        params: BulkResultRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<BulkResult> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "bulk_results", params.getPathParam(0))
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

    private val listHandler: Handler<List<BulkResult>> =
        jsonHandler<List<BulkResult>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** list bulk_results */
    override fun list(
        params: BulkResultListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<BulkResultListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "bulk_results")
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
                        BulkResultListPageAsync.Response.Builder()
                            .items(it)
                            .perPage(response.headers().values("X-Per-Page").getOrNull(0) ?: "")
                            .afterCursor(
                                response.headers().values("X-After-Cursor").getOrNull(0) ?: ""
                            )
                            .build()
                    }
                    .let { BulkResultListPageAsync.of(this, params, it) }
            }
    }
}
