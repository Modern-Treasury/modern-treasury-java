package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpMethod
import com.moderntreasury.api.core.http.HttpRequest
import com.moderntreasury.api.core.http.HttpResponse.Handler
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.InternalAccount
import com.moderntreasury.api.models.InternalAccountCreateParams
import com.moderntreasury.api.models.InternalAccountListPage
import com.moderntreasury.api.models.InternalAccountListParams
import com.moderntreasury.api.models.InternalAccountRetrieveParams
import com.moderntreasury.api.models.InternalAccountUpdateParams
import com.moderntreasury.api.services.blocking.internalAccounts.BalanceReportService
import com.moderntreasury.api.services.blocking.internalAccounts.BalanceReportServiceImpl
import com.moderntreasury.api.services.errorHandler
import com.moderntreasury.api.services.json
import com.moderntreasury.api.services.jsonHandler
import com.moderntreasury.api.services.withErrorHandler

class InternalAccountServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : InternalAccountService {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val balanceReports: BalanceReportService by lazy {
        BalanceReportServiceImpl(clientOptions)
    }

    override fun balanceReports(): BalanceReportService = balanceReports

    private val createHandler: Handler<InternalAccount> =
        jsonHandler<InternalAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** create internal account */
    override fun create(
        params: InternalAccountCreateParams,
        requestOptions: RequestOptions
    ): InternalAccount {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("api", "internal_accounts")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .let { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveHandler: Handler<InternalAccount> =
        jsonHandler<InternalAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** get internal account */
    override fun retrieve(
        params: InternalAccountRetrieveParams,
        requestOptions: RequestOptions
    ): InternalAccount {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "internal_accounts", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .let { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val updateHandler: Handler<InternalAccount> =
        jsonHandler<InternalAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** update internal account */
    override fun update(
        params: InternalAccountUpdateParams,
        requestOptions: RequestOptions
    ): InternalAccount {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("api", "internal_accounts", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .let { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<List<InternalAccount>> =
        jsonHandler<List<InternalAccount>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** list internal accounts */
    override fun list(
        params: InternalAccountListParams,
        requestOptions: RequestOptions
    ): InternalAccountListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "internal_accounts")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .let { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        forEach { it.validate() }
                    }
                }
                .let {
                    InternalAccountListPage.Response.Builder()
                        .items(it)
                        .perPage(response.headers()["X-Per-Page"].getOrNull(0) ?: "")
                        .afterCursor(response.headers()["X-After-Cursor"].getOrNull(0) ?: "")
                        .build()
                }
                .let { InternalAccountListPage.of(this, params, it) }
        }
    }
}
