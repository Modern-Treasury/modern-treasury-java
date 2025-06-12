// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.handlers.errorHandler
import com.moderntreasury.api.core.handlers.jsonHandler
import com.moderntreasury.api.core.handlers.withErrorHandler
import com.moderntreasury.api.core.http.HttpMethod
import com.moderntreasury.api.core.http.HttpRequest
import com.moderntreasury.api.core.http.HttpResponse.Handler
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.core.http.json
import com.moderntreasury.api.core.http.parseable
import com.moderntreasury.api.core.prepareAsync
import com.moderntreasury.api.models.LedgerAccountStatementCreateParams
import com.moderntreasury.api.models.LedgerAccountStatementCreateResponse
import com.moderntreasury.api.models.LedgerAccountStatementRetrieveParams
import com.moderntreasury.api.models.LedgerAccountStatementRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LedgerAccountStatementServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    LedgerAccountStatementServiceAsync {

    private val withRawResponse: LedgerAccountStatementServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LedgerAccountStatementServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): LedgerAccountStatementServiceAsync =
        LedgerAccountStatementServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: LedgerAccountStatementCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LedgerAccountStatementCreateResponse> =
        // post /api/ledger_account_statements
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: LedgerAccountStatementRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LedgerAccountStatementRetrieveResponse> =
        // get /api/ledger_account_statements/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LedgerAccountStatementServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LedgerAccountStatementServiceAsync.WithRawResponse =
            LedgerAccountStatementServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<LedgerAccountStatementCreateResponse> =
            jsonHandler<LedgerAccountStatementCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: LedgerAccountStatementCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LedgerAccountStatementCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "ledger_account_statements")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
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

        private val retrieveHandler: Handler<LedgerAccountStatementRetrieveResponse> =
            jsonHandler<LedgerAccountStatementRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: LedgerAccountStatementRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LedgerAccountStatementRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "ledger_account_statements", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
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
    }
}
