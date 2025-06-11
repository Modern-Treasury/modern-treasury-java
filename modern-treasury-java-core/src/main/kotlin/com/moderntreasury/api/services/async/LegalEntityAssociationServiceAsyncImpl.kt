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
import com.moderntreasury.api.models.LegalEntityAssociation
import com.moderntreasury.api.models.LegalEntityAssociationCreateParams
import java.util.concurrent.CompletableFuture

class LegalEntityAssociationServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    LegalEntityAssociationServiceAsync {

    private val withRawResponse: LegalEntityAssociationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LegalEntityAssociationServiceAsync.WithRawResponse =
        withRawResponse

    override fun create(
        params: LegalEntityAssociationCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LegalEntityAssociation> =
        // post /api/legal_entity_associations
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LegalEntityAssociationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<LegalEntityAssociation> =
            jsonHandler<LegalEntityAssociation>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: LegalEntityAssociationCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LegalEntityAssociation>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "legal_entity_associations")
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
    }
}
