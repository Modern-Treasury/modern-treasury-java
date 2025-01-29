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
import com.moderntreasury.api.models.LedgerAccountSettlement
import com.moderntreasury.api.models.LedgerAccountSettlementCreateParams
import com.moderntreasury.api.models.LedgerAccountSettlementListPageAsync
import com.moderntreasury.api.models.LedgerAccountSettlementListParams
import com.moderntreasury.api.models.LedgerAccountSettlementRetrieveParams
import com.moderntreasury.api.models.LedgerAccountSettlementUpdateParams
import com.moderntreasury.api.services.async.ledgerAccountSettlements.AccountEntryServiceAsync
import com.moderntreasury.api.services.async.ledgerAccountSettlements.AccountEntryServiceAsyncImpl
import java.util.concurrent.CompletableFuture

class LedgerAccountSettlementServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : LedgerAccountSettlementServiceAsync {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val accountEntries: AccountEntryServiceAsync by lazy {
        AccountEntryServiceAsyncImpl(clientOptions)
    }

    override fun accountEntries(): AccountEntryServiceAsync = accountEntries

    private val createHandler: Handler<LedgerAccountSettlement> =
        jsonHandler<LedgerAccountSettlement>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Create a ledger account settlement. */
    override fun create(
        params: LedgerAccountSettlementCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<LedgerAccountSettlement> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("api", "ledger_account_settlements")
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

    private val retrieveHandler: Handler<LedgerAccountSettlement> =
        jsonHandler<LedgerAccountSettlement>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get details on a single ledger account settlement. */
    override fun retrieve(
        params: LedgerAccountSettlementRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<LedgerAccountSettlement> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "ledger_account_settlements", params.getPathParam(0))
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

    private val updateHandler: Handler<LedgerAccountSettlement> =
        jsonHandler<LedgerAccountSettlement>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Update the details of a ledger account settlement. */
    override fun update(
        params: LedgerAccountSettlementUpdateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<LedgerAccountSettlement> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("api", "ledger_account_settlements", params.getPathParam(0))
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

    private val listHandler: Handler<List<LedgerAccountSettlement>> =
        jsonHandler<List<LedgerAccountSettlement>>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get a list of ledger account settlements. */
    override fun list(
        params: LedgerAccountSettlementListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<LedgerAccountSettlementListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "ledger_account_settlements")
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
                        LedgerAccountSettlementListPageAsync.Response.Builder()
                            .items(it)
                            .perPage(response.headers().values("X-Per-Page").getOrNull(0) ?: "")
                            .afterCursor(
                                response.headers().values("X-After-Cursor").getOrNull(0) ?: ""
                            )
                            .build()
                    }
                    .let { LedgerAccountSettlementListPageAsync.of(this, params, it) }
            }
    }
}
