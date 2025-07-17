// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.handlers.errorBodyHandler
import com.moderntreasury.api.core.handlers.errorHandler
import com.moderntreasury.api.core.handlers.jsonHandler
import com.moderntreasury.api.core.http.HttpMethod
import com.moderntreasury.api.core.http.HttpRequest
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.core.http.HttpResponse.Handler
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.core.http.json
import com.moderntreasury.api.core.http.parseable
import com.moderntreasury.api.core.prepareAsync
import com.moderntreasury.api.models.LedgerAccountSettlement
import com.moderntreasury.api.models.LedgerAccountSettlementCreateParams
import com.moderntreasury.api.models.LedgerAccountSettlementListPageAsync
import com.moderntreasury.api.models.LedgerAccountSettlementListParams
import com.moderntreasury.api.models.LedgerAccountSettlementRetrieveParams
import com.moderntreasury.api.models.LedgerAccountSettlementUpdateParams
import com.moderntreasury.api.services.async.ledgerAccountSettlements.AccountEntryServiceAsync
import com.moderntreasury.api.services.async.ledgerAccountSettlements.AccountEntryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LedgerAccountSettlementServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    LedgerAccountSettlementServiceAsync {

    private val withRawResponse: LedgerAccountSettlementServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val accountEntries: AccountEntryServiceAsync by lazy {
        AccountEntryServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): LedgerAccountSettlementServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): LedgerAccountSettlementServiceAsync =
        LedgerAccountSettlementServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun accountEntries(): AccountEntryServiceAsync = accountEntries

    override fun create(
        params: LedgerAccountSettlementCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LedgerAccountSettlement> =
        // post /api/ledger_account_settlements
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: LedgerAccountSettlementRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LedgerAccountSettlement> =
        // get /api/ledger_account_settlements/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: LedgerAccountSettlementUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LedgerAccountSettlement> =
        // patch /api/ledger_account_settlements/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: LedgerAccountSettlementListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LedgerAccountSettlementListPageAsync> =
        // get /api/ledger_account_settlements
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LedgerAccountSettlementServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val accountEntries: AccountEntryServiceAsync.WithRawResponse by lazy {
            AccountEntryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LedgerAccountSettlementServiceAsync.WithRawResponse =
            LedgerAccountSettlementServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun accountEntries(): AccountEntryServiceAsync.WithRawResponse = accountEntries

        private val createHandler: Handler<LedgerAccountSettlement> =
            jsonHandler<LedgerAccountSettlement>(clientOptions.jsonMapper)

        override fun create(
            params: LedgerAccountSettlementCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LedgerAccountSettlement>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "ledger_account_settlements")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<LedgerAccountSettlement> =
            jsonHandler<LedgerAccountSettlement>(clientOptions.jsonMapper)

        override fun retrieve(
            params: LedgerAccountSettlementRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LedgerAccountSettlement>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "ledger_account_settlements", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<LedgerAccountSettlement> =
            jsonHandler<LedgerAccountSettlement>(clientOptions.jsonMapper)

        override fun update(
            params: LedgerAccountSettlementUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LedgerAccountSettlement>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "ledger_account_settlements", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<List<LedgerAccountSettlement>> =
            jsonHandler<List<LedgerAccountSettlement>>(clientOptions.jsonMapper)

        override fun list(
            params: LedgerAccountSettlementListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LedgerAccountSettlementListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "ledger_account_settlements")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                            .let {
                                LedgerAccountSettlementListPageAsync.builder()
                                    .service(LedgerAccountSettlementServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .headers(response.headers())
                                    .items(it)
                                    .build()
                            }
                    }
                }
        }
    }
}
