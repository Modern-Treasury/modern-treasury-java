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
import com.moderntreasury.api.models.LedgerEntry
import com.moderntreasury.api.models.LedgerEntryListPageAsync
import com.moderntreasury.api.models.LedgerEntryListParams
import com.moderntreasury.api.models.LedgerEntryRetrieveParams
import com.moderntreasury.api.models.LedgerEntryUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LedgerEntryServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    LedgerEntryServiceAsync {

    private val withRawResponse: LedgerEntryServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LedgerEntryServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LedgerEntryServiceAsync =
        LedgerEntryServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: LedgerEntryRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LedgerEntry> =
        // get /api/ledger_entries/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: LedgerEntryUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LedgerEntry> =
        // patch /api/ledger_entries/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: LedgerEntryListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LedgerEntryListPageAsync> =
        // get /api/ledger_entries
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LedgerEntryServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LedgerEntryServiceAsync.WithRawResponse =
            LedgerEntryServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<LedgerEntry> =
            jsonHandler<LedgerEntry>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: LedgerEntryRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LedgerEntry>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "ledger_entries", params._pathParam(0))
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

        private val updateHandler: Handler<LedgerEntry> =
            jsonHandler<LedgerEntry>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: LedgerEntryUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LedgerEntry>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "ledger_entries", params._pathParam(0))
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

        private val listHandler: Handler<List<LedgerEntry>> =
            jsonHandler<List<LedgerEntry>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(
            params: LedgerEntryListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LedgerEntryListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "ledger_entries")
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
                                LedgerEntryListPageAsync.builder()
                                    .service(LedgerEntryServiceAsyncImpl(clientOptions))
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
