// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.Event
import com.moderntreasury.api.models.EventListPageAsync
import com.moderntreasury.api.models.EventListParams
import com.moderntreasury.api.models.EventRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EventServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventServiceAsync

    /** get event */
    fun retrieve(id: String): CompletableFuture<Event> = retrieve(id, EventRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EventRetrieveParams = EventRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Event> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EventRetrieveParams = EventRetrieveParams.none(),
    ): CompletableFuture<Event> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EventRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Event>

    /** @see retrieve */
    fun retrieve(params: EventRetrieveParams): CompletableFuture<Event> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Event> =
        retrieve(id, EventRetrieveParams.none(), requestOptions)

    /** list events */
    fun list(): CompletableFuture<EventListPageAsync> = list(EventListParams.none())

    /** @see list */
    fun list(
        params: EventListParams = EventListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventListPageAsync>

    /** @see list */
    fun list(
        params: EventListParams = EventListParams.none()
    ): CompletableFuture<EventListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<EventListPageAsync> =
        list(EventListParams.none(), requestOptions)

    /** A view of [EventServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EventServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/events/{id}`, but is otherwise the same as
         * [EventServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<Event>> =
            retrieve(id, EventRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: EventRetrieveParams = EventRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Event>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: EventRetrieveParams = EventRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Event>> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: EventRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Event>>

        /** @see retrieve */
        fun retrieve(params: EventRetrieveParams): CompletableFuture<HttpResponseFor<Event>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Event>> =
            retrieve(id, EventRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/events`, but is otherwise the same as
         * [EventServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<EventListPageAsync>> =
            list(EventListParams.none())

        /** @see list */
        fun list(
            params: EventListParams = EventListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventListPageAsync>>

        /** @see list */
        fun list(
            params: EventListParams = EventListParams.none()
        ): CompletableFuture<HttpResponseFor<EventListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EventListPageAsync>> =
            list(EventListParams.none(), requestOptions)
    }
}
