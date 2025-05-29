// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.LedgerableEvent
import com.moderntreasury.api.models.LedgerableEventCreateParams
import com.moderntreasury.api.models.LedgerableEventRetrieveParams
import java.util.concurrent.CompletableFuture

interface LedgerableEventServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a ledgerable event. */
    fun create(params: LedgerableEventCreateParams): CompletableFuture<LedgerableEvent> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: LedgerableEventCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerableEvent>

    /** Get details on a single ledgerable event. */
    fun retrieve(id: String): CompletableFuture<LedgerableEvent> =
        retrieve(id, LedgerableEventRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: LedgerableEventRetrieveParams = LedgerableEventRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerableEvent> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: LedgerableEventRetrieveParams = LedgerableEventRetrieveParams.none(),
    ): CompletableFuture<LedgerableEvent> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: LedgerableEventRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerableEvent>

    /** @see [retrieve] */
    fun retrieve(params: LedgerableEventRetrieveParams): CompletableFuture<LedgerableEvent> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<LedgerableEvent> =
        retrieve(id, LedgerableEventRetrieveParams.none(), requestOptions)

    /**
     * A view of [LedgerableEventServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/ledgerable_events`, but is otherwise the same
         * as [LedgerableEventServiceAsync.create].
         */
        fun create(
            params: LedgerableEventCreateParams
        ): CompletableFuture<HttpResponseFor<LedgerableEvent>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: LedgerableEventCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerableEvent>>

        /**
         * Returns a raw HTTP response for `get /api/ledgerable_events/{id}`, but is otherwise the
         * same as [LedgerableEventServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<LedgerableEvent>> =
            retrieve(id, LedgerableEventRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: LedgerableEventRetrieveParams = LedgerableEventRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerableEvent>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: LedgerableEventRetrieveParams = LedgerableEventRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<LedgerableEvent>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: LedgerableEventRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerableEvent>>

        /** @see [retrieve] */
        fun retrieve(
            params: LedgerableEventRetrieveParams
        ): CompletableFuture<HttpResponseFor<LedgerableEvent>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LedgerableEvent>> =
            retrieve(id, LedgerableEventRetrieveParams.none(), requestOptions)
    }
}
