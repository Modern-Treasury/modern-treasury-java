// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.handlers.emptyHandler
import com.moderntreasury.api.core.handlers.errorHandler
import com.moderntreasury.api.core.handlers.jsonHandler
import com.moderntreasury.api.core.handlers.withErrorHandler
import com.moderntreasury.api.core.http.HttpMethod
import com.moderntreasury.api.core.http.HttpRequest
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.core.http.HttpResponse.Handler
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.core.http.json
import com.moderntreasury.api.core.http.parseable
import com.moderntreasury.api.core.prepareAsync
import com.moderntreasury.api.models.LedgerAccountCategory
import com.moderntreasury.api.models.LedgerAccountCategoryAddLedgerAccountParams
import com.moderntreasury.api.models.LedgerAccountCategoryAddNestedCategoryParams
import com.moderntreasury.api.models.LedgerAccountCategoryCreateParams
import com.moderntreasury.api.models.LedgerAccountCategoryDeleteParams
import com.moderntreasury.api.models.LedgerAccountCategoryListPageAsync
import com.moderntreasury.api.models.LedgerAccountCategoryListParams
import com.moderntreasury.api.models.LedgerAccountCategoryRemoveLedgerAccountParams
import com.moderntreasury.api.models.LedgerAccountCategoryRemoveNestedCategoryParams
import com.moderntreasury.api.models.LedgerAccountCategoryRetrieveParams
import com.moderntreasury.api.models.LedgerAccountCategoryUpdateParams
import java.util.concurrent.CompletableFuture

class LedgerAccountCategoryServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : LedgerAccountCategoryServiceAsync {

    private val withRawResponse: LedgerAccountCategoryServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LedgerAccountCategoryServiceAsync.WithRawResponse =
        withRawResponse

    override fun create(
        params: LedgerAccountCategoryCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LedgerAccountCategory> =
        // post /api/ledger_account_categories
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: LedgerAccountCategoryRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LedgerAccountCategory> =
        // get /api/ledger_account_categories/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: LedgerAccountCategoryUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LedgerAccountCategory> =
        // patch /api/ledger_account_categories/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: LedgerAccountCategoryListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LedgerAccountCategoryListPageAsync> =
        // get /api/ledger_account_categories
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: LedgerAccountCategoryDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LedgerAccountCategory> =
        // delete /api/ledger_account_categories/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun addLedgerAccount(
        params: LedgerAccountCategoryAddLedgerAccountParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /api/ledger_account_categories/{id}/ledger_accounts/{ledger_account_id}
        withRawResponse().addLedgerAccount(params, requestOptions).thenAccept {}

    override fun addNestedCategory(
        params: LedgerAccountCategoryAddNestedCategoryParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /api/ledger_account_categories/{id}/ledger_account_categories/{sub_category_id}
        withRawResponse().addNestedCategory(params, requestOptions).thenAccept {}

    override fun removeLedgerAccount(
        params: LedgerAccountCategoryRemoveLedgerAccountParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /api/ledger_account_categories/{id}/ledger_accounts/{ledger_account_id}
        withRawResponse().removeLedgerAccount(params, requestOptions).thenAccept {}

    override fun removeNestedCategory(
        params: LedgerAccountCategoryRemoveNestedCategoryParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /api/ledger_account_categories/{id}/ledger_account_categories/{sub_category_id}
        withRawResponse().removeNestedCategory(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LedgerAccountCategoryServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<LedgerAccountCategory> =
            jsonHandler<LedgerAccountCategory>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: LedgerAccountCategoryCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LedgerAccountCategory>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("api", "ledger_account_categories")
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

        private val retrieveHandler: Handler<LedgerAccountCategory> =
            jsonHandler<LedgerAccountCategory>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: LedgerAccountCategoryRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LedgerAccountCategory>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "ledger_account_categories", params._pathParam(0))
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

        private val updateHandler: Handler<LedgerAccountCategory> =
            jsonHandler<LedgerAccountCategory>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: LedgerAccountCategoryUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LedgerAccountCategory>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("api", "ledger_account_categories", params._pathParam(0))
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

        private val listHandler: Handler<List<LedgerAccountCategory>> =
            jsonHandler<List<LedgerAccountCategory>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: LedgerAccountCategoryListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LedgerAccountCategoryListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "ledger_account_categories")
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
                                LedgerAccountCategoryListPageAsync.builder()
                                    .service(LedgerAccountCategoryServiceAsyncImpl(clientOptions))
                                    .params(params)
                                    .headers(response.headers())
                                    .items(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<LedgerAccountCategory> =
            jsonHandler<LedgerAccountCategory>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: LedgerAccountCategoryDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LedgerAccountCategory>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("api", "ledger_account_categories", params._pathParam(0))
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

        private val addLedgerAccountHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override fun addLedgerAccount(
            params: LedgerAccountCategoryAddLedgerAccountParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "api",
                        "ledger_account_categories",
                        params._pathParam(0),
                        "ledger_accounts",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable { response.use { addLedgerAccountHandler.handle(it) } }
                }
        }

        private val addNestedCategoryHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override fun addNestedCategory(
            params: LedgerAccountCategoryAddNestedCategoryParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "api",
                        "ledger_account_categories",
                        params._pathParam(0),
                        "ledger_account_categories",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable { response.use { addNestedCategoryHandler.handle(it) } }
                }
        }

        private val removeLedgerAccountHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override fun removeLedgerAccount(
            params: LedgerAccountCategoryRemoveLedgerAccountParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "api",
                        "ledger_account_categories",
                        params._pathParam(0),
                        "ledger_accounts",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable { response.use { removeLedgerAccountHandler.handle(it) } }
                }
        }

        private val removeNestedCategoryHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override fun removeNestedCategory(
            params: LedgerAccountCategoryRemoveNestedCategoryParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "api",
                        "ledger_account_categories",
                        params._pathParam(0),
                        "ledger_account_categories",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable { response.use { removeNestedCategoryHandler.handle(it) } }
                }
        }
    }
}
