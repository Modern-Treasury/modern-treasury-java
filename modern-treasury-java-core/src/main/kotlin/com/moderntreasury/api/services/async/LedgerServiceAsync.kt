// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.Ledger
import com.moderntreasury.api.models.LedgerCreateParams
import com.moderntreasury.api.models.LedgerDeleteParams
import com.moderntreasury.api.models.LedgerListPageAsync
import com.moderntreasury.api.models.LedgerListParams
import com.moderntreasury.api.models.LedgerRetrieveParams
import com.moderntreasury.api.models.LedgerUpdateParams
import java.util.concurrent.CompletableFuture

interface LedgerServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a ledger. */
    fun create(params: LedgerCreateParams): CompletableFuture<Ledger> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: LedgerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Ledger>

    /** Get details on a single ledger. */
    fun retrieve(params: LedgerRetrieveParams): CompletableFuture<Ledger> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: LedgerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Ledger>

    /** Update the details of a ledger. */
    fun update(params: LedgerUpdateParams): CompletableFuture<Ledger> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: LedgerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Ledger>

    /** Get a list of ledgers. */
    fun list(): CompletableFuture<LedgerListPageAsync> = list(LedgerListParams.none())

    /** @see [list] */
    fun list(
        params: LedgerListParams = LedgerListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerListPageAsync>

    /** @see [list] */
    fun list(
        params: LedgerListParams = LedgerListParams.none()
    ): CompletableFuture<LedgerListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<LedgerListPageAsync> =
        list(LedgerListParams.none(), requestOptions)

    /** Delete a ledger. */
    fun delete(params: LedgerDeleteParams): CompletableFuture<Ledger> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: LedgerDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Ledger>

    /**
     * A view of [LedgerServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/ledgers`, but is otherwise the same as
         * [LedgerServiceAsync.create].
         */
        @MustBeClosed
        fun create(params: LedgerCreateParams): CompletableFuture<HttpResponseFor<Ledger>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: LedgerCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Ledger>>

        /**
         * Returns a raw HTTP response for `get /api/ledgers/{id}`, but is otherwise the same as
         * [LedgerServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: LedgerRetrieveParams): CompletableFuture<HttpResponseFor<Ledger>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: LedgerRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Ledger>>

        /**
         * Returns a raw HTTP response for `patch /api/ledgers/{id}`, but is otherwise the same as
         * [LedgerServiceAsync.update].
         */
        @MustBeClosed
        fun update(params: LedgerUpdateParams): CompletableFuture<HttpResponseFor<Ledger>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: LedgerUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Ledger>>

        /**
         * Returns a raw HTTP response for `get /api/ledgers`, but is otherwise the same as
         * [LedgerServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<LedgerListPageAsync>> =
            list(LedgerListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: LedgerListParams = LedgerListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: LedgerListParams = LedgerListParams.none()
        ): CompletableFuture<HttpResponseFor<LedgerListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LedgerListPageAsync>> =
            list(LedgerListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/ledgers/{id}`, but is otherwise the same as
         * [LedgerServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(params: LedgerDeleteParams): CompletableFuture<HttpResponseFor<Ledger>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: LedgerDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Ledger>>
    }
}
