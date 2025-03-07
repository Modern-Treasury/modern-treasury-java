// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.LedgerAccount
import com.moderntreasury.api.models.LedgerAccountCreateParams
import com.moderntreasury.api.models.LedgerAccountDeleteParams
import com.moderntreasury.api.models.LedgerAccountListPageAsync
import com.moderntreasury.api.models.LedgerAccountListParams
import com.moderntreasury.api.models.LedgerAccountRetrieveParams
import com.moderntreasury.api.models.LedgerAccountUpdateParams
import java.util.concurrent.CompletableFuture

interface LedgerAccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a ledger account. */
    fun create(params: LedgerAccountCreateParams): CompletableFuture<LedgerAccount> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: LedgerAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccount>

    /** Get details on a single ledger account. */
    fun retrieve(params: LedgerAccountRetrieveParams): CompletableFuture<LedgerAccount> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: LedgerAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccount>

    /** Update the details of a ledger account. */
    fun update(params: LedgerAccountUpdateParams): CompletableFuture<LedgerAccount> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: LedgerAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccount>

    /** Get a list of ledger accounts. */
    fun list(): CompletableFuture<LedgerAccountListPageAsync> = list(LedgerAccountListParams.none())

    /** @see [list] */
    fun list(
        params: LedgerAccountListParams = LedgerAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountListPageAsync>

    /** @see [list] */
    fun list(
        params: LedgerAccountListParams = LedgerAccountListParams.none()
    ): CompletableFuture<LedgerAccountListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<LedgerAccountListPageAsync> =
        list(LedgerAccountListParams.none(), requestOptions)

    /** Delete a ledger account. */
    fun delete(params: LedgerAccountDeleteParams): CompletableFuture<LedgerAccount> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: LedgerAccountDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccount>

    /**
     * A view of [LedgerAccountServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/ledger_accounts`, but is otherwise the same as
         * [LedgerAccountServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: LedgerAccountCreateParams
        ): CompletableFuture<HttpResponseFor<LedgerAccount>> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: LedgerAccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccount>>

        /**
         * Returns a raw HTTP response for `get /api/ledger_accounts/{id}`, but is otherwise the
         * same as [LedgerAccountServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: LedgerAccountRetrieveParams
        ): CompletableFuture<HttpResponseFor<LedgerAccount>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: LedgerAccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccount>>

        /**
         * Returns a raw HTTP response for `patch /api/ledger_accounts/{id}`, but is otherwise the
         * same as [LedgerAccountServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: LedgerAccountUpdateParams
        ): CompletableFuture<HttpResponseFor<LedgerAccount>> = update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: LedgerAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccount>>

        /**
         * Returns a raw HTTP response for `get /api/ledger_accounts`, but is otherwise the same as
         * [LedgerAccountServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<LedgerAccountListPageAsync>> =
            list(LedgerAccountListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: LedgerAccountListParams = LedgerAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: LedgerAccountListParams = LedgerAccountListParams.none()
        ): CompletableFuture<HttpResponseFor<LedgerAccountListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LedgerAccountListPageAsync>> =
            list(LedgerAccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/ledger_accounts/{id}`, but is otherwise the
         * same as [LedgerAccountServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(
            params: LedgerAccountDeleteParams
        ): CompletableFuture<HttpResponseFor<LedgerAccount>> = delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: LedgerAccountDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccount>>
    }
}
