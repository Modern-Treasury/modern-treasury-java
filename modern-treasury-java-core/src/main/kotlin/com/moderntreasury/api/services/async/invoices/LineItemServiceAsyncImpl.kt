package com.moderntreasury.api.services.async.invoices

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpMethod
import com.moderntreasury.api.core.http.HttpRequest
import com.moderntreasury.api.core.http.HttpResponse.Handler
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.InvoiceLineItem
import com.moderntreasury.api.models.InvoiceLineItemCreateParams
import com.moderntreasury.api.models.InvoiceLineItemDeleteParams
import com.moderntreasury.api.models.InvoiceLineItemListPageAsync
import com.moderntreasury.api.models.InvoiceLineItemListParams
import com.moderntreasury.api.models.InvoiceLineItemRetrieveParams
import com.moderntreasury.api.models.InvoiceLineItemUpdateParams
import com.moderntreasury.api.services.errorHandler
import com.moderntreasury.api.services.json
import com.moderntreasury.api.services.jsonHandler
import com.moderntreasury.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class LineItemServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : LineItemServiceAsync {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<InvoiceLineItem> =
        jsonHandler<InvoiceLineItem>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** create invoice_line_item */
    override fun create(
        params: InvoiceLineItemCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<InvoiceLineItem> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("api", "invoices", params.getPathParam(0), "invoice_line_items")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .let { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveHandler: Handler<InvoiceLineItem> =
        jsonHandler<InvoiceLineItem>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** get invoice_line_item */
    override fun retrieve(
        params: InvoiceLineItemRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<InvoiceLineItem> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "api",
                    "invoices",
                    params.getPathParam(0),
                    "invoice_line_items",
                    params.getPathParam(1)
                )
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .let { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val updateHandler: Handler<InvoiceLineItem> =
        jsonHandler<InvoiceLineItem>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** update invoice_line_item */
    override fun update(
        params: InvoiceLineItemUpdateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<InvoiceLineItem> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments(
                    "api",
                    "invoices",
                    params.getPathParam(0),
                    "invoice_line_items",
                    params.getPathParam(1)
                )
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .let { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<List<InvoiceLineItem>> =
        jsonHandler<List<InvoiceLineItem>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** list invoice_line_items */
    override fun list(
        params: InvoiceLineItemListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<InvoiceLineItemListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "invoices", params.getPathParam(0), "invoice_line_items")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .let { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        forEach { it.validate() }
                    }
                }
                .let {
                    InvoiceLineItemListPageAsync.Response.Builder()
                        .items(it)
                        .perPage(response.headers()["X-Per-Page"].getOrNull(0) ?: "")
                        .afterCursor(response.headers()["X-After-Cursor"].getOrNull(0) ?: "")
                        .build()
                }
                .let { InvoiceLineItemListPageAsync.of(this, params, it) }
        }
    }

    private val deleteHandler: Handler<InvoiceLineItem> =
        jsonHandler<InvoiceLineItem>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** delete invoice_line_item */
    override fun delete(
        params: InvoiceLineItemDeleteParams,
        requestOptions: RequestOptions
    ): CompletableFuture<InvoiceLineItem> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments(
                    "api",
                    "invoices",
                    params.getPathParam(0),
                    "invoice_line_items",
                    params.getPathParam(1)
                )
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .let { deleteHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
