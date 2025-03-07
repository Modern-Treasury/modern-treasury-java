// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.LedgerEventHandler
import com.moderntreasury.api.models.LedgerEventHandlerCreateParams
import com.moderntreasury.api.models.LedgerEventHandlerDeleteParams
import com.moderntreasury.api.models.LedgerEventHandlerListPageAsync
import com.moderntreasury.api.models.LedgerEventHandlerListParams
import com.moderntreasury.api.models.LedgerEventHandlerRetrieveParams
import java.util.concurrent.CompletableFuture

interface LedgerEventHandlerServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** create ledger_event_handler */
    fun create(params: LedgerEventHandlerCreateParams): CompletableFuture<LedgerEventHandler> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: LedgerEventHandlerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerEventHandler>

    /** Get details on a single ledger event handler. */
    fun retrieve(params: LedgerEventHandlerRetrieveParams): CompletableFuture<LedgerEventHandler> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: LedgerEventHandlerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerEventHandler>

    /** Get a list of ledger event handlers. */
    fun list(): CompletableFuture<LedgerEventHandlerListPageAsync> =
        list(LedgerEventHandlerListParams.none())

    /** @see [list] */
    fun list(
        params: LedgerEventHandlerListParams = LedgerEventHandlerListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerEventHandlerListPageAsync>

    /** @see [list] */
    fun list(
        params: LedgerEventHandlerListParams = LedgerEventHandlerListParams.none()
    ): CompletableFuture<LedgerEventHandlerListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<LedgerEventHandlerListPageAsync> =
        list(LedgerEventHandlerListParams.none(), requestOptions)

    /** Archive a ledger event handler. */
    fun delete(params: LedgerEventHandlerDeleteParams): CompletableFuture<LedgerEventHandler> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: LedgerEventHandlerDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerEventHandler>

    /**
     * A view of [LedgerEventHandlerServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/ledger_event_handlers`, but is otherwise the
         * same as [LedgerEventHandlerServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: LedgerEventHandlerCreateParams
        ): CompletableFuture<HttpResponseFor<LedgerEventHandler>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: LedgerEventHandlerCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerEventHandler>>

        /**
         * Returns a raw HTTP response for `get /api/ledger_event_handlers/{id}`, but is otherwise
         * the same as [LedgerEventHandlerServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: LedgerEventHandlerRetrieveParams
        ): CompletableFuture<HttpResponseFor<LedgerEventHandler>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: LedgerEventHandlerRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerEventHandler>>

        /**
         * Returns a raw HTTP response for `get /api/ledger_event_handlers`, but is otherwise the
         * same as [LedgerEventHandlerServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<LedgerEventHandlerListPageAsync>> =
            list(LedgerEventHandlerListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: LedgerEventHandlerListParams = LedgerEventHandlerListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerEventHandlerListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: LedgerEventHandlerListParams = LedgerEventHandlerListParams.none()
        ): CompletableFuture<HttpResponseFor<LedgerEventHandlerListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LedgerEventHandlerListPageAsync>> =
            list(LedgerEventHandlerListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/ledger_event_handlers/{id}`, but is
         * otherwise the same as [LedgerEventHandlerServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(
            params: LedgerEventHandlerDeleteParams
        ): CompletableFuture<HttpResponseFor<LedgerEventHandler>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: LedgerEventHandlerDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerEventHandler>>
    }
}
