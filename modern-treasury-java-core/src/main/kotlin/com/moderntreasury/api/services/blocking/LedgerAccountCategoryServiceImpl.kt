// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

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
import com.moderntreasury.api.core.prepare
import com.moderntreasury.api.models.LedgerAccountCategory
import com.moderntreasury.api.models.LedgerAccountCategoryAddLedgerAccountParams
import com.moderntreasury.api.models.LedgerAccountCategoryAddNestedCategoryParams
import com.moderntreasury.api.models.LedgerAccountCategoryCreateParams
import com.moderntreasury.api.models.LedgerAccountCategoryDeleteParams
import com.moderntreasury.api.models.LedgerAccountCategoryListPage
import com.moderntreasury.api.models.LedgerAccountCategoryListParams
import com.moderntreasury.api.models.LedgerAccountCategoryRemoveLedgerAccountParams
import com.moderntreasury.api.models.LedgerAccountCategoryRemoveNestedCategoryParams
import com.moderntreasury.api.models.LedgerAccountCategoryRetrieveParams
import com.moderntreasury.api.models.LedgerAccountCategoryUpdateParams

class LedgerAccountCategoryServiceImpl
internal constructor(private val clientOptions: ClientOptions) : LedgerAccountCategoryService {

    private val withRawResponse: LedgerAccountCategoryService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LedgerAccountCategoryService.WithRawResponse = withRawResponse

    override fun create(
        params: LedgerAccountCategoryCreateParams,
        requestOptions: RequestOptions,
    ): LedgerAccountCategory =
        // post /api/ledger_account_categories
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: LedgerAccountCategoryRetrieveParams,
        requestOptions: RequestOptions,
    ): LedgerAccountCategory =
        // get /api/ledger_account_categories/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: LedgerAccountCategoryUpdateParams,
        requestOptions: RequestOptions,
    ): LedgerAccountCategory =
        // patch /api/ledger_account_categories/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: LedgerAccountCategoryListParams,
        requestOptions: RequestOptions,
    ): LedgerAccountCategoryListPage =
        // get /api/ledger_account_categories
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: LedgerAccountCategoryDeleteParams,
        requestOptions: RequestOptions,
    ): LedgerAccountCategory =
        // delete /api/ledger_account_categories/{id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun addLedgerAccount(
        params: LedgerAccountCategoryAddLedgerAccountParams,
        requestOptions: RequestOptions,
    ) {
        // put /api/ledger_account_categories/{id}/ledger_accounts/{ledger_account_id}
        withRawResponse().addLedgerAccount(params, requestOptions)
    }

    override fun addNestedCategory(
        params: LedgerAccountCategoryAddNestedCategoryParams,
        requestOptions: RequestOptions,
    ) {
        // put /api/ledger_account_categories/{id}/ledger_account_categories/{sub_category_id}
        withRawResponse().addNestedCategory(params, requestOptions)
    }

    override fun removeLedgerAccount(
        params: LedgerAccountCategoryRemoveLedgerAccountParams,
        requestOptions: RequestOptions,
    ) {
        // delete /api/ledger_account_categories/{id}/ledger_accounts/{ledger_account_id}
        withRawResponse().removeLedgerAccount(params, requestOptions)
    }

    override fun removeNestedCategory(
        params: LedgerAccountCategoryRemoveNestedCategoryParams,
        requestOptions: RequestOptions,
    ) {
        // delete /api/ledger_account_categories/{id}/ledger_account_categories/{sub_category_id}
        withRawResponse().removeNestedCategory(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LedgerAccountCategoryService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<LedgerAccountCategory> =
            jsonHandler<LedgerAccountCategory>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: LedgerAccountCategoryCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerAccountCategory> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("api", "ledger_account_categories")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<LedgerAccountCategory> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "ledger_account_categories", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<LedgerAccountCategory> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("api", "ledger_account_categories", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<LedgerAccountCategoryListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "ledger_account_categories")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
                    .let {
                        LedgerAccountCategoryListPage.of(
                            LedgerAccountCategoryServiceImpl(clientOptions),
                            params,
                            response.headers(),
                            it,
                        )
                    }
            }
        }

        private val deleteHandler: Handler<LedgerAccountCategory> =
            jsonHandler<LedgerAccountCategory>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: LedgerAccountCategoryDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerAccountCategory> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("api", "ledger_account_categories", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val addLedgerAccountHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override fun addLedgerAccount(
            params: LedgerAccountCategoryAddLedgerAccountParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable { response.use { addLedgerAccountHandler.handle(it) } }
        }

        private val addNestedCategoryHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override fun addNestedCategory(
            params: LedgerAccountCategoryAddNestedCategoryParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable { response.use { addNestedCategoryHandler.handle(it) } }
        }

        private val removeLedgerAccountHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override fun removeLedgerAccount(
            params: LedgerAccountCategoryRemoveLedgerAccountParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable { response.use { removeLedgerAccountHandler.handle(it) } }
        }

        private val removeNestedCategoryHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override fun removeNestedCategory(
            params: LedgerAccountCategoryRemoveNestedCategoryParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable { response.use { removeNestedCategoryHandler.handle(it) } }
        }
    }
}
