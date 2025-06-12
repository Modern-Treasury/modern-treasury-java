// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.LedgerAccountBalanceMonitor
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorCreateParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorDeleteParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorListPageAsync
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorListParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorRetrieveParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LedgerAccountBalanceMonitorServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): LedgerAccountBalanceMonitorServiceAsync

    /** Create a ledger account balance monitor. */
    fun create(
        params: LedgerAccountBalanceMonitorCreateParams
    ): CompletableFuture<LedgerAccountBalanceMonitor> = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: LedgerAccountBalanceMonitorCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountBalanceMonitor>

    /** Get details on a single ledger account balance monitor. */
    fun retrieve(id: String): CompletableFuture<LedgerAccountBalanceMonitor> =
        retrieve(id, LedgerAccountBalanceMonitorRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: LedgerAccountBalanceMonitorRetrieveParams =
            LedgerAccountBalanceMonitorRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountBalanceMonitor> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: LedgerAccountBalanceMonitorRetrieveParams =
            LedgerAccountBalanceMonitorRetrieveParams.none(),
    ): CompletableFuture<LedgerAccountBalanceMonitor> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: LedgerAccountBalanceMonitorRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountBalanceMonitor>

    /** @see [retrieve] */
    fun retrieve(
        params: LedgerAccountBalanceMonitorRetrieveParams
    ): CompletableFuture<LedgerAccountBalanceMonitor> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<LedgerAccountBalanceMonitor> =
        retrieve(id, LedgerAccountBalanceMonitorRetrieveParams.none(), requestOptions)

    /** Update a ledger account balance monitor. */
    fun update(id: String): CompletableFuture<LedgerAccountBalanceMonitor> =
        update(id, LedgerAccountBalanceMonitorUpdateParams.none())

    /** @see [update] */
    fun update(
        id: String,
        params: LedgerAccountBalanceMonitorUpdateParams =
            LedgerAccountBalanceMonitorUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountBalanceMonitor> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(
        id: String,
        params: LedgerAccountBalanceMonitorUpdateParams =
            LedgerAccountBalanceMonitorUpdateParams.none(),
    ): CompletableFuture<LedgerAccountBalanceMonitor> = update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: LedgerAccountBalanceMonitorUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountBalanceMonitor>

    /** @see [update] */
    fun update(
        params: LedgerAccountBalanceMonitorUpdateParams
    ): CompletableFuture<LedgerAccountBalanceMonitor> = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<LedgerAccountBalanceMonitor> =
        update(id, LedgerAccountBalanceMonitorUpdateParams.none(), requestOptions)

    /** Get a list of ledger account balance monitors. */
    fun list(): CompletableFuture<LedgerAccountBalanceMonitorListPageAsync> =
        list(LedgerAccountBalanceMonitorListParams.none())

    /** @see [list] */
    fun list(
        params: LedgerAccountBalanceMonitorListParams =
            LedgerAccountBalanceMonitorListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountBalanceMonitorListPageAsync>

    /** @see [list] */
    fun list(
        params: LedgerAccountBalanceMonitorListParams = LedgerAccountBalanceMonitorListParams.none()
    ): CompletableFuture<LedgerAccountBalanceMonitorListPageAsync> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<LedgerAccountBalanceMonitorListPageAsync> =
        list(LedgerAccountBalanceMonitorListParams.none(), requestOptions)

    /** Delete a ledger account balance monitor. */
    fun delete(id: String): CompletableFuture<LedgerAccountBalanceMonitor> =
        delete(id, LedgerAccountBalanceMonitorDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: LedgerAccountBalanceMonitorDeleteParams =
            LedgerAccountBalanceMonitorDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountBalanceMonitor> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        id: String,
        params: LedgerAccountBalanceMonitorDeleteParams =
            LedgerAccountBalanceMonitorDeleteParams.none(),
    ): CompletableFuture<LedgerAccountBalanceMonitor> = delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: LedgerAccountBalanceMonitorDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountBalanceMonitor>

    /** @see [delete] */
    fun delete(
        params: LedgerAccountBalanceMonitorDeleteParams
    ): CompletableFuture<LedgerAccountBalanceMonitor> = delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<LedgerAccountBalanceMonitor> =
        delete(id, LedgerAccountBalanceMonitorDeleteParams.none(), requestOptions)

    /**
     * A view of [LedgerAccountBalanceMonitorServiceAsync] that provides access to raw HTTP
     * responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LedgerAccountBalanceMonitorServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/ledger_account_balance_monitors`, but is
         * otherwise the same as [LedgerAccountBalanceMonitorServiceAsync.create].
         */
        fun create(
            params: LedgerAccountBalanceMonitorCreateParams
        ): CompletableFuture<HttpResponseFor<LedgerAccountBalanceMonitor>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: LedgerAccountBalanceMonitorCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountBalanceMonitor>>

        /**
         * Returns a raw HTTP response for `get /api/ledger_account_balance_monitors/{id}`, but is
         * otherwise the same as [LedgerAccountBalanceMonitorServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<LedgerAccountBalanceMonitor>> =
            retrieve(id, LedgerAccountBalanceMonitorRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: LedgerAccountBalanceMonitorRetrieveParams =
                LedgerAccountBalanceMonitorRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountBalanceMonitor>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: LedgerAccountBalanceMonitorRetrieveParams =
                LedgerAccountBalanceMonitorRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountBalanceMonitor>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: LedgerAccountBalanceMonitorRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountBalanceMonitor>>

        /** @see [retrieve] */
        fun retrieve(
            params: LedgerAccountBalanceMonitorRetrieveParams
        ): CompletableFuture<HttpResponseFor<LedgerAccountBalanceMonitor>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LedgerAccountBalanceMonitor>> =
            retrieve(id, LedgerAccountBalanceMonitorRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/ledger_account_balance_monitors/{id}`, but is
         * otherwise the same as [LedgerAccountBalanceMonitorServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<LedgerAccountBalanceMonitor>> =
            update(id, LedgerAccountBalanceMonitorUpdateParams.none())

        /** @see [update] */
        fun update(
            id: String,
            params: LedgerAccountBalanceMonitorUpdateParams =
                LedgerAccountBalanceMonitorUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountBalanceMonitor>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        fun update(
            id: String,
            params: LedgerAccountBalanceMonitorUpdateParams =
                LedgerAccountBalanceMonitorUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountBalanceMonitor>> =
            update(id, params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: LedgerAccountBalanceMonitorUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountBalanceMonitor>>

        /** @see [update] */
        fun update(
            params: LedgerAccountBalanceMonitorUpdateParams
        ): CompletableFuture<HttpResponseFor<LedgerAccountBalanceMonitor>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LedgerAccountBalanceMonitor>> =
            update(id, LedgerAccountBalanceMonitorUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/ledger_account_balance_monitors`, but is
         * otherwise the same as [LedgerAccountBalanceMonitorServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<LedgerAccountBalanceMonitorListPageAsync>> =
            list(LedgerAccountBalanceMonitorListParams.none())

        /** @see [list] */
        fun list(
            params: LedgerAccountBalanceMonitorListParams =
                LedgerAccountBalanceMonitorListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountBalanceMonitorListPageAsync>>

        /** @see [list] */
        fun list(
            params: LedgerAccountBalanceMonitorListParams =
                LedgerAccountBalanceMonitorListParams.none()
        ): CompletableFuture<HttpResponseFor<LedgerAccountBalanceMonitorListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LedgerAccountBalanceMonitorListPageAsync>> =
            list(LedgerAccountBalanceMonitorListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/ledger_account_balance_monitors/{id}`, but
         * is otherwise the same as [LedgerAccountBalanceMonitorServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<LedgerAccountBalanceMonitor>> =
            delete(id, LedgerAccountBalanceMonitorDeleteParams.none())

        /** @see [delete] */
        fun delete(
            id: String,
            params: LedgerAccountBalanceMonitorDeleteParams =
                LedgerAccountBalanceMonitorDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountBalanceMonitor>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        fun delete(
            id: String,
            params: LedgerAccountBalanceMonitorDeleteParams =
                LedgerAccountBalanceMonitorDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountBalanceMonitor>> =
            delete(id, params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            params: LedgerAccountBalanceMonitorDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountBalanceMonitor>>

        /** @see [delete] */
        fun delete(
            params: LedgerAccountBalanceMonitorDeleteParams
        ): CompletableFuture<HttpResponseFor<LedgerAccountBalanceMonitor>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LedgerAccountBalanceMonitor>> =
            delete(id, LedgerAccountBalanceMonitorDeleteParams.none(), requestOptions)
    }
}
