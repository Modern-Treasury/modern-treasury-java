// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking.ledgerAccountSettlements

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.handlers.emptyHandler
import com.moderntreasury.api.core.handlers.errorHandler
import com.moderntreasury.api.core.handlers.withErrorHandler
import com.moderntreasury.api.core.http.HttpMethod
import com.moderntreasury.api.core.http.HttpRequest
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.core.http.HttpResponse.Handler
import com.moderntreasury.api.core.http.json
import com.moderntreasury.api.core.http.parseable
import com.moderntreasury.api.core.prepare
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.LedgerAccountSettlementAccountEntryDeleteParams
import com.moderntreasury.api.models.LedgerAccountSettlementAccountEntryUpdateParams

class AccountEntryServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AccountEntryService {

    private val withRawResponse: AccountEntryService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AccountEntryService.WithRawResponse = withRawResponse

    override fun update(
        params: LedgerAccountSettlementAccountEntryUpdateParams,
        requestOptions: RequestOptions,
    ) {
        // patch /api/ledger_account_settlements/{id}/ledger_entries
        withRawResponse().update(params, requestOptions)
    }

    override fun delete(
        params: LedgerAccountSettlementAccountEntryDeleteParams,
        requestOptions: RequestOptions,
    ) {
        // delete /api/ledger_account_settlements/{id}/ledger_entries
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AccountEntryService.WithRawResponse {

        private val errorHandler: Handler<ModernTreasuryError> =
            errorHandler(clientOptions.jsonMapper)

        private val updateHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override fun update(
            params: LedgerAccountSettlementAccountEntryUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments(
                        "api",
                        "ledger_account_settlements",
                        params.getPathParam(0),
                        "ledger_entries",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable { response.use { updateHandler.handle(it) } }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override fun delete(
            params: LedgerAccountSettlementAccountEntryDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "api",
                        "ledger_account_settlements",
                        params.getPathParam(0),
                        "ledger_entries",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable { response.use { deleteHandler.handle(it) } }
        }
    }
}
