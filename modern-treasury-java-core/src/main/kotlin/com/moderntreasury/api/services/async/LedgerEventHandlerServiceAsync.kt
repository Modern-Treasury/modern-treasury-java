// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

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
    @JvmOverloads
    fun create(
        params: LedgerEventHandlerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerEventHandler>

    /** Get details on a single ledger event handler. */
    @JvmOverloads
    fun retrieve(
        params: LedgerEventHandlerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerEventHandler>

    /** Get a list of ledger event handlers. */
    @JvmOverloads
    fun list(
        params: LedgerEventHandlerListParams = LedgerEventHandlerListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerEventHandlerListPageAsync>

    /** Get a list of ledger event handlers. */
    fun list(requestOptions: RequestOptions): CompletableFuture<LedgerEventHandlerListPageAsync> =
        list(LedgerEventHandlerListParams.none(), requestOptions)

    /** Archive a ledger event handler. */
    @JvmOverloads
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
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: LedgerEventHandlerCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerEventHandler>>

        /**
         * Returns a raw HTTP response for `get /api/ledger_event_handlers/{id}`, but is otherwise
         * the same as [LedgerEventHandlerServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: LedgerEventHandlerRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerEventHandler>>

        /**
         * Returns a raw HTTP response for `get /api/ledger_event_handlers`, but is otherwise the
         * same as [LedgerEventHandlerServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: LedgerEventHandlerListParams = LedgerEventHandlerListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerEventHandlerListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /api/ledger_event_handlers`, but is otherwise the
         * same as [LedgerEventHandlerServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LedgerEventHandlerListPageAsync>> =
            list(LedgerEventHandlerListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/ledger_event_handlers/{id}`, but is
         * otherwise the same as [LedgerEventHandlerServiceAsync.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: LedgerEventHandlerDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerEventHandler>>
    }
}
