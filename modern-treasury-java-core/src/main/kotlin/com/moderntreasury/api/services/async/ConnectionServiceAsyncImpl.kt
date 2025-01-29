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
import com.moderntreasury.api.models.Connection
import com.moderntreasury.api.models.ConnectionListPageAsync
import com.moderntreasury.api.models.ConnectionListParams
import java.util.concurrent.CompletableFuture

class ConnectionServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : ConnectionServiceAsync {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<List<Connection>> =
        jsonHandler<List<Connection>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a list of all connections. */
    override fun list(
        params: ConnectionListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ConnectionListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "connections")
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
                        ConnectionListPageAsync.Response.Builder()
                            .items(it)
                            .perPage(response.headers().values("X-Per-Page").getOrNull(0) ?: "")
                            .afterCursor(
                                response.headers().values("X-After-Cursor").getOrNull(0) ?: ""
                            )
                            .build()
                    }
                    .let { ConnectionListPageAsync.of(this, params, it) }
            }
    }
}
