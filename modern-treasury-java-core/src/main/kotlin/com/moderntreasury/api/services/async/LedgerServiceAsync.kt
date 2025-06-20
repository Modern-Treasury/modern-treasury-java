// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
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
import java.util.function.Consumer

interface LedgerServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LedgerServiceAsync

    /** Create a ledger. */
    fun create(params: LedgerCreateParams): CompletableFuture<Ledger> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: LedgerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Ledger>

    /** Get details on a single ledger. */
    fun retrieve(id: String): CompletableFuture<Ledger> = retrieve(id, LedgerRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: LedgerRetrieveParams = LedgerRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Ledger> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: LedgerRetrieveParams = LedgerRetrieveParams.none(),
    ): CompletableFuture<Ledger> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: LedgerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Ledger>

    /** @see [retrieve] */
    fun retrieve(params: LedgerRetrieveParams): CompletableFuture<Ledger> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Ledger> =
        retrieve(id, LedgerRetrieveParams.none(), requestOptions)

    /** Update the details of a ledger. */
    fun update(id: String): CompletableFuture<Ledger> = update(id, LedgerUpdateParams.none())

    /** @see [update] */
    fun update(
        id: String,
        params: LedgerUpdateParams = LedgerUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Ledger> = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(
        id: String,
        params: LedgerUpdateParams = LedgerUpdateParams.none(),
    ): CompletableFuture<Ledger> = update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: LedgerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Ledger>

    /** @see [update] */
    fun update(params: LedgerUpdateParams): CompletableFuture<Ledger> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(id: String, requestOptions: RequestOptions): CompletableFuture<Ledger> =
        update(id, LedgerUpdateParams.none(), requestOptions)

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
    fun delete(id: String): CompletableFuture<Ledger> = delete(id, LedgerDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: LedgerDeleteParams = LedgerDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Ledger> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        id: String,
        params: LedgerDeleteParams = LedgerDeleteParams.none(),
    ): CompletableFuture<Ledger> = delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: LedgerDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Ledger>

    /** @see [delete] */
    fun delete(params: LedgerDeleteParams): CompletableFuture<Ledger> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Ledger> =
        delete(id, LedgerDeleteParams.none(), requestOptions)

    /**
     * A view of [LedgerServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LedgerServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/ledgers`, but is otherwise the same as
         * [LedgerServiceAsync.create].
         */
        fun create(params: LedgerCreateParams): CompletableFuture<HttpResponseFor<Ledger>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: LedgerCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Ledger>>

        /**
         * Returns a raw HTTP response for `get /api/ledgers/{id}`, but is otherwise the same as
         * [LedgerServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<Ledger>> =
            retrieve(id, LedgerRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: LedgerRetrieveParams = LedgerRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Ledger>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: LedgerRetrieveParams = LedgerRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Ledger>> = retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: LedgerRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Ledger>>

        /** @see [retrieve] */
        fun retrieve(params: LedgerRetrieveParams): CompletableFuture<HttpResponseFor<Ledger>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Ledger>> =
            retrieve(id, LedgerRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/ledgers/{id}`, but is otherwise the same as
         * [LedgerServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<Ledger>> =
            update(id, LedgerUpdateParams.none())

        /** @see [update] */
        fun update(
            id: String,
            params: LedgerUpdateParams = LedgerUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Ledger>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        fun update(
            id: String,
            params: LedgerUpdateParams = LedgerUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<Ledger>> = update(id, params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: LedgerUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Ledger>>

        /** @see [update] */
        fun update(params: LedgerUpdateParams): CompletableFuture<HttpResponseFor<Ledger>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Ledger>> =
            update(id, LedgerUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/ledgers`, but is otherwise the same as
         * [LedgerServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<LedgerListPageAsync>> =
            list(LedgerListParams.none())

        /** @see [list] */
        fun list(
            params: LedgerListParams = LedgerListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerListPageAsync>>

        /** @see [list] */
        fun list(
            params: LedgerListParams = LedgerListParams.none()
        ): CompletableFuture<HttpResponseFor<LedgerListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LedgerListPageAsync>> =
            list(LedgerListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/ledgers/{id}`, but is otherwise the same as
         * [LedgerServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<Ledger>> =
            delete(id, LedgerDeleteParams.none())

        /** @see [delete] */
        fun delete(
            id: String,
            params: LedgerDeleteParams = LedgerDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Ledger>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        fun delete(
            id: String,
            params: LedgerDeleteParams = LedgerDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<Ledger>> = delete(id, params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            params: LedgerDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Ledger>>

        /** @see [delete] */
        fun delete(params: LedgerDeleteParams): CompletableFuture<HttpResponseFor<Ledger>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Ledger>> =
            delete(id, LedgerDeleteParams.none(), requestOptions)
    }
}
