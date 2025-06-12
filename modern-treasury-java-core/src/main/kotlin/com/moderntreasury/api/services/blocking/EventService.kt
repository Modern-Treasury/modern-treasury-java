// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.Event
import com.moderntreasury.api.models.EventListPage
import com.moderntreasury.api.models.EventListParams
import com.moderntreasury.api.models.EventRetrieveParams
import java.util.function.Consumer

interface EventService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventService

    /** get event */
    fun retrieve(id: String): Event = retrieve(id, EventRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: EventRetrieveParams = EventRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Event = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(id: String, params: EventRetrieveParams = EventRetrieveParams.none()): Event =
        retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: EventRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Event

    /** @see [retrieve] */
    fun retrieve(params: EventRetrieveParams): Event = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): Event =
        retrieve(id, EventRetrieveParams.none(), requestOptions)

    /** list events */
    fun list(): EventListPage = list(EventListParams.none())

    /** @see [list] */
    fun list(
        params: EventListParams = EventListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventListPage

    /** @see [list] */
    fun list(params: EventListParams = EventListParams.none()): EventListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): EventListPage =
        list(EventListParams.none(), requestOptions)

    /** A view of [EventService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/events/{id}`, but is otherwise the same as
         * [EventService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<Event> = retrieve(id, EventRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: EventRetrieveParams = EventRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Event> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: EventRetrieveParams = EventRetrieveParams.none(),
        ): HttpResponseFor<Event> = retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: EventRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Event>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: EventRetrieveParams): HttpResponseFor<Event> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<Event> =
            retrieve(id, EventRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/events`, but is otherwise the same as
         * [EventService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<EventListPage> = list(EventListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: EventListParams = EventListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(params: EventListParams = EventListParams.none()): HttpResponseFor<EventListPage> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<EventListPage> =
            list(EventListParams.none(), requestOptions)
    }
}
