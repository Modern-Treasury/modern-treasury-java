// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpMethod
import com.moderntreasury.api.core.http.HttpRequest
import com.moderntreasury.api.core.http.HttpResponse.Handler
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.Event
import com.moderntreasury.api.models.EventListPage
import com.moderntreasury.api.models.EventListParams
import com.moderntreasury.api.models.EventRetrieveParams
import com.moderntreasury.api.services.errorHandler
import com.moderntreasury.api.services.jsonHandler
import com.moderntreasury.api.services.withErrorHandler

class EventServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : EventService {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<Event> =
        jsonHandler<Event>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** get event */
    override fun retrieve(params: EventRetrieveParams, requestOptions: RequestOptions): Event {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "events", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<List<Event>> =
        jsonHandler<List<Event>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** list events */
    override fun list(params: EventListParams, requestOptions: RequestOptions): EventListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "events")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        forEach { it.validate() }
                    }
                }
                .let {
                    EventListPage.Response.Builder()
                        .items(it)
                        .perPage(response.headers()["X-Per-Page"].getOrNull(0) ?: "")
                        .afterCursor(response.headers()["X-After-Cursor"].getOrNull(0) ?: "")
                        .build()
                }
                .let { EventListPage.of(this, params, it) }
        }
    }
}
