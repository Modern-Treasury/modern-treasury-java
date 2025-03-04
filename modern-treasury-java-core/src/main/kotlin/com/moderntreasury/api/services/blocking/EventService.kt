// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.Event
import com.moderntreasury.api.models.EventListPage
import com.moderntreasury.api.models.EventListParams
import com.moderntreasury.api.models.EventRetrieveParams

interface EventService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** get event */
    @JvmOverloads
    fun retrieve(
        params: EventRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Event

    /** list events */
    @JvmOverloads
    fun list(
        params: EventListParams = EventListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventListPage

    /** list events */
    fun list(requestOptions: RequestOptions): EventListPage =
        list(EventListParams.none(), requestOptions)

    /** A view of [EventService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/events/{id}`, but is otherwise the same as
         * [EventService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: EventRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Event>

        /**
         * Returns a raw HTTP response for `get /api/events`, but is otherwise the same as
         * [EventService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: EventListParams = EventListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventListPage>

        /**
         * Returns a raw HTTP response for `get /api/events`, but is otherwise the same as
         * [EventService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<EventListPage> =
            list(EventListParams.none(), requestOptions)
    }
}
