// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
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
import com.moderntreasury.api.models.VirtualAccountSetting
import com.moderntreasury.api.models.VirtualAccountSettingCreateParams
import com.moderntreasury.api.models.VirtualAccountSettingListPageAsync
import com.moderntreasury.api.models.VirtualAccountSettingListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class VirtualAccountSettingServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : VirtualAccountSettingServiceAsync {

    private val withRawResponse: VirtualAccountSettingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): VirtualAccountSettingServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): VirtualAccountSettingServiceAsync =
        VirtualAccountSettingServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: VirtualAccountSettingCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VirtualAccountSetting> =
        // post /api/virtual_account_settings
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: VirtualAccountSettingListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VirtualAccountSettingListPageAsync> =
        // get /api/virtual_account_settings
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VirtualAccountSettingServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VirtualAccountSettingServiceAsync.WithRawResponse =
            VirtualAccountSettingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<VirtualAccountSetting> =
            jsonHandler<VirtualAccountSetting>(clientOptions.jsonMapper)

        override fun create(
            params: VirtualAccountSettingCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VirtualAccountSetting>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "virtual_account_settings")
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

        private val listHandler: Handler<List<VirtualAccountSetting>> =
            jsonHandler<List<VirtualAccountSetting>>(clientOptions.jsonMapper)

        override fun list(
            params: VirtualAccountSettingListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VirtualAccountSettingListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "virtual_account_settings")
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
                                VirtualAccountSettingListPageAsync.builder()
                                    .service(VirtualAccountSettingServiceAsyncImpl(clientOptions))
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
