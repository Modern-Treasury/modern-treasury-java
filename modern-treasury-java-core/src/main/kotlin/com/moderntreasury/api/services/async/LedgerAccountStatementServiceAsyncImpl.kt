// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.errorHandler
import com.moderntreasury.api.core.http.HttpMethod
import com.moderntreasury.api.core.http.HttpRequest
import com.moderntreasury.api.core.http.HttpResponse.Handler
import com.moderntreasury.api.core.json
import com.moderntreasury.api.core.jsonHandler
import com.moderntreasury.api.core.withErrorHandler
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.LedgerAccountStatementCreateParams
import com.moderntreasury.api.models.LedgerAccountStatementCreateResponse
import com.moderntreasury.api.models.LedgerAccountStatementRetrieveParams
import com.moderntreasury.api.models.LedgerAccountStatementRetrieveResponse
import java.util.concurrent.CompletableFuture

class LedgerAccountStatementServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : LedgerAccountStatementServiceAsync {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<LedgerAccountStatementCreateResponse> =
        jsonHandler<LedgerAccountStatementCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Create a ledger account statement. */
    override fun create(
        params: LedgerAccountStatementCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<LedgerAccountStatementCreateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("api", "ledger_account_statements")
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

    private val retrieveHandler: Handler<LedgerAccountStatementRetrieveResponse> =
        jsonHandler<LedgerAccountStatementRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get details on a single ledger account statement. */
    override fun retrieve(
        params: LedgerAccountStatementRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<LedgerAccountStatementRetrieveResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "ledger_account_statements", params.getPathParam(0))
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
}
