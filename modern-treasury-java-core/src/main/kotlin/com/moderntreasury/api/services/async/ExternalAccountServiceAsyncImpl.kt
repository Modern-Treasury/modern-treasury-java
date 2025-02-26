// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.handlers.emptyHandler
import com.moderntreasury.api.core.handlers.errorHandler
import com.moderntreasury.api.core.handlers.jsonHandler
import com.moderntreasury.api.core.handlers.withErrorHandler
import com.moderntreasury.api.core.http.HttpMethod
import com.moderntreasury.api.core.http.HttpRequest
import com.moderntreasury.api.core.http.HttpResponse.Handler
import com.moderntreasury.api.core.json
import com.moderntreasury.api.core.prepareAsync
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.ExternalAccount
import com.moderntreasury.api.models.ExternalAccountCompleteVerificationParams
import com.moderntreasury.api.models.ExternalAccountCreateParams
import com.moderntreasury.api.models.ExternalAccountDeleteParams
import com.moderntreasury.api.models.ExternalAccountListPageAsync
import com.moderntreasury.api.models.ExternalAccountListParams
import com.moderntreasury.api.models.ExternalAccountRetrieveParams
import com.moderntreasury.api.models.ExternalAccountUpdateParams
import com.moderntreasury.api.models.ExternalAccountVerifyParams
import com.moderntreasury.api.models.ExternalAccountVerifyResponse
import java.util.concurrent.CompletableFuture

class ExternalAccountServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : ExternalAccountServiceAsync {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<ExternalAccount> =
        jsonHandler<ExternalAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** create external account */
    override fun create(
        params: ExternalAccountCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalAccount> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("api", "external_accounts")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val retrieveHandler: Handler<ExternalAccount> =
        jsonHandler<ExternalAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** show external account */
    override fun retrieve(
        params: ExternalAccountRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalAccount> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "external_accounts", params.getPathParam(0))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val updateHandler: Handler<ExternalAccount> =
        jsonHandler<ExternalAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** update external account */
    override fun update(
        params: ExternalAccountUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalAccount> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("api", "external_accounts", params.getPathParam(0))
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val listHandler: Handler<List<ExternalAccount>> =
        jsonHandler<List<ExternalAccount>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** list external accounts */
    override fun list(
        params: ExternalAccountListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalAccountListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "external_accounts")
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.forEach { it.validate() }
                        }
                    }
                    .let {
                        ExternalAccountListPageAsync.of(
                            this,
                            params,
                            ExternalAccountListPageAsync.Response.builder()
                                .items(it)
                                .perPage(response.headers().values("X-Per-Page").getOrNull(0) ?: "")
                                .afterCursor(
                                    response.headers().values("X-After-Cursor").getOrNull(0) ?: ""
                                )
                                .build(),
                        )
                    }
            }
    }

    private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /** delete external account */
    override fun delete(
        params: ExternalAccountDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("api", "external_accounts", params.getPathParam(0))
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response -> response.use { deleteHandler.handle(it) } }
    }

    private val completeVerificationHandler: Handler<ExternalAccount> =
        jsonHandler<ExternalAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** complete verification of external account */
    override fun completeVerification(
        params: ExternalAccountCompleteVerificationParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalAccount> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments(
                    "api",
                    "external_accounts",
                    params.getPathParam(0),
                    "complete_verification",
                )
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { completeVerificationHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val verifyHandler: Handler<ExternalAccountVerifyResponse> =
        jsonHandler<ExternalAccountVerifyResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** verify external account */
    override fun verify(
        params: ExternalAccountVerifyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalAccountVerifyResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("api", "external_accounts", params.getPathParam(0), "verify")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { verifyHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }
}
