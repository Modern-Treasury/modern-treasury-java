// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.RequestOptions
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
import com.moderntreasury.api.models.LedgerTransaction
import com.moderntreasury.api.models.LedgerTransactionCreateParams
import com.moderntreasury.api.models.LedgerTransactionCreatePartialPostParams
import com.moderntreasury.api.models.LedgerTransactionCreateReversalParams
import com.moderntreasury.api.models.LedgerTransactionListPageAsync
import com.moderntreasury.api.models.LedgerTransactionListParams
import com.moderntreasury.api.models.LedgerTransactionRetrieveParams
import com.moderntreasury.api.models.LedgerTransactionUpdateParams
import com.moderntreasury.api.services.async.ledgerTransactions.VersionServiceAsync
import com.moderntreasury.api.services.async.ledgerTransactions.VersionServiceAsyncImpl
import java.util.concurrent.CompletableFuture

class LedgerTransactionServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : LedgerTransactionServiceAsync {

    private val withRawResponse: LedgerTransactionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val versions: VersionServiceAsync by lazy { VersionServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): LedgerTransactionServiceAsync.WithRawResponse = withRawResponse

    override fun versions(): VersionServiceAsync = versions

    override fun create(
        params: LedgerTransactionCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LedgerTransaction> =
        // post /api/ledger_transactions
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: LedgerTransactionRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LedgerTransaction> =
        // get /api/ledger_transactions/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: LedgerTransactionUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LedgerTransaction> =
        // patch /api/ledger_transactions/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: LedgerTransactionListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LedgerTransactionListPageAsync> =
        // get /api/ledger_transactions
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun createPartialPost(
        params: LedgerTransactionCreatePartialPostParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LedgerTransaction> =
        // post /api/ledger_transactions/{id}/partial_post
        withRawResponse().createPartialPost(params, requestOptions).thenApply { it.parse() }

    override fun createReversal(
        params: LedgerTransactionCreateReversalParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LedgerTransaction> =
        // post /api/ledger_transactions/{id}/reversal
        withRawResponse().createReversal(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LedgerTransactionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val versions: VersionServiceAsync.WithRawResponse by lazy {
            VersionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun versions(): VersionServiceAsync.WithRawResponse = versions

        private val createHandler: Handler<LedgerTransaction> =
            jsonHandler<LedgerTransaction>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: LedgerTransactionCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LedgerTransaction>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("api", "ledger_transactions")
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

        private val retrieveHandler: Handler<LedgerTransaction> =
            jsonHandler<LedgerTransaction>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: LedgerTransactionRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LedgerTransaction>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "ledger_transactions", params._pathParam(0))
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

        private val updateHandler: Handler<LedgerTransaction> =
            jsonHandler<LedgerTransaction>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: LedgerTransactionUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LedgerTransaction>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("api", "ledger_transactions", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
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

        private val listHandler: Handler<List<LedgerTransaction>> =
            jsonHandler<List<LedgerTransaction>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: LedgerTransactionListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LedgerTransactionListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "ledger_transactions")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                            .let {
                                LedgerTransactionListPageAsync.of(
                                    LedgerTransactionServiceAsyncImpl(clientOptions),
                                    params,
                                    response.headers(),
                                    it,
                                )
                            }
                    }
                }
        }

        private val createPartialPostHandler: Handler<LedgerTransaction> =
            jsonHandler<LedgerTransaction>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun createPartialPost(
            params: LedgerTransactionCreatePartialPostParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LedgerTransaction>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "api",
                        "ledger_transactions",
                        params._pathParam(0),
                        "partial_post",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { createPartialPostHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createReversalHandler: Handler<LedgerTransaction> =
            jsonHandler<LedgerTransaction>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun createReversal(
            params: LedgerTransactionCreateReversalParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LedgerTransaction>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("api", "ledger_transactions", params._pathParam(0), "reversal")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { createReversalHandler.handle(it) }
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
