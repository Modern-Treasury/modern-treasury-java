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
import com.moderntreasury.api.models.LedgerAccountBalanceMonitor
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorCreateParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorDeleteParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorListPageAsync
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorListParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorRetrieveParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LedgerAccountBalanceMonitorServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    LedgerAccountBalanceMonitorServiceAsync {

    private val withRawResponse: LedgerAccountBalanceMonitorServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LedgerAccountBalanceMonitorServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): LedgerAccountBalanceMonitorServiceAsync =
        LedgerAccountBalanceMonitorServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: LedgerAccountBalanceMonitorCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LedgerAccountBalanceMonitor> =
        // post /api/ledger_account_balance_monitors
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: LedgerAccountBalanceMonitorRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LedgerAccountBalanceMonitor> =
        // get /api/ledger_account_balance_monitors/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: LedgerAccountBalanceMonitorUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LedgerAccountBalanceMonitor> =
        // patch /api/ledger_account_balance_monitors/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: LedgerAccountBalanceMonitorListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LedgerAccountBalanceMonitorListPageAsync> =
        // get /api/ledger_account_balance_monitors
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: LedgerAccountBalanceMonitorDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LedgerAccountBalanceMonitor> =
        // delete /api/ledger_account_balance_monitors/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LedgerAccountBalanceMonitorServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LedgerAccountBalanceMonitorServiceAsync.WithRawResponse =
            LedgerAccountBalanceMonitorServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<LedgerAccountBalanceMonitor> =
            jsonHandler<LedgerAccountBalanceMonitor>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: LedgerAccountBalanceMonitorCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LedgerAccountBalanceMonitor>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "ledger_account_balance_monitors")
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

        private val retrieveHandler: Handler<LedgerAccountBalanceMonitor> =
            jsonHandler<LedgerAccountBalanceMonitor>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: LedgerAccountBalanceMonitorRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LedgerAccountBalanceMonitor>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "ledger_account_balance_monitors", params._pathParam(0))
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

        private val updateHandler: Handler<LedgerAccountBalanceMonitor> =
            jsonHandler<LedgerAccountBalanceMonitor>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: LedgerAccountBalanceMonitorUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LedgerAccountBalanceMonitor>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "ledger_account_balance_monitors", params._pathParam(0))
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

        private val listHandler: Handler<List<LedgerAccountBalanceMonitor>> =
            jsonHandler<List<LedgerAccountBalanceMonitor>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: LedgerAccountBalanceMonitorListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LedgerAccountBalanceMonitorListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "ledger_account_balance_monitors")
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
                                LedgerAccountBalanceMonitorListPageAsync.builder()
                                    .service(
                                        LedgerAccountBalanceMonitorServiceAsyncImpl(clientOptions)
                                    )
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .headers(response.headers())
                                    .items(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<LedgerAccountBalanceMonitor> =
            jsonHandler<LedgerAccountBalanceMonitor>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: LedgerAccountBalanceMonitorDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LedgerAccountBalanceMonitor>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "ledger_account_balance_monitors", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { deleteHandler.handle(it) }
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
