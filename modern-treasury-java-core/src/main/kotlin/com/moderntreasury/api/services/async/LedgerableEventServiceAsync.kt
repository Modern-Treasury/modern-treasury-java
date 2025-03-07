// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
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
    fun retrieve(params: LedgerableEventRetrieveParams): CompletableFuture<LedgerableEvent> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: LedgerableEventRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerableEvent>

    /**
     * A view of [LedgerableEventServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/ledgerable_events`, but is otherwise the same
         * as [LedgerableEventServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: LedgerableEventCreateParams
        ): CompletableFuture<HttpResponseFor<LedgerableEvent>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: LedgerableEventCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerableEvent>>

        /**
         * Returns a raw HTTP response for `get /api/ledgerable_events/{id}`, but is otherwise the
         * same as [LedgerableEventServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: LedgerableEventRetrieveParams
        ): CompletableFuture<HttpResponseFor<LedgerableEvent>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: LedgerableEventRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerableEvent>>
    }
}
