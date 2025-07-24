// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
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
import java.util.function.Consumer

interface LedgerAccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LedgerAccountServiceAsync

    /** Create a ledger account. */
    fun create(params: LedgerAccountCreateParams): CompletableFuture<LedgerAccount> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LedgerAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccount>

    /** Get details on a single ledger account. */
    fun retrieve(id: String): CompletableFuture<LedgerAccount> =
        retrieve(id, LedgerAccountRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: LedgerAccountRetrieveParams = LedgerAccountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccount> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: LedgerAccountRetrieveParams = LedgerAccountRetrieveParams.none(),
    ): CompletableFuture<LedgerAccount> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: LedgerAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccount>

    /** @see retrieve */
    fun retrieve(params: LedgerAccountRetrieveParams): CompletableFuture<LedgerAccount> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<LedgerAccount> =
        retrieve(id, LedgerAccountRetrieveParams.none(), requestOptions)

    /** Update the details of a ledger account. */
    fun update(id: String): CompletableFuture<LedgerAccount> =
        update(id, LedgerAccountUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: LedgerAccountUpdateParams = LedgerAccountUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccount> = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: LedgerAccountUpdateParams = LedgerAccountUpdateParams.none(),
    ): CompletableFuture<LedgerAccount> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: LedgerAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccount>

    /** @see update */
    fun update(params: LedgerAccountUpdateParams): CompletableFuture<LedgerAccount> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): CompletableFuture<LedgerAccount> =
        update(id, LedgerAccountUpdateParams.none(), requestOptions)

    /** Get a list of ledger accounts. */
    fun list(): CompletableFuture<LedgerAccountListPageAsync> = list(LedgerAccountListParams.none())

    /** @see list */
    fun list(
        params: LedgerAccountListParams = LedgerAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountListPageAsync>

    /** @see list */
    fun list(
        params: LedgerAccountListParams = LedgerAccountListParams.none()
    ): CompletableFuture<LedgerAccountListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<LedgerAccountListPageAsync> =
        list(LedgerAccountListParams.none(), requestOptions)

    /** Delete a ledger account. */
    fun delete(id: String): CompletableFuture<LedgerAccount> =
        delete(id, LedgerAccountDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: LedgerAccountDeleteParams = LedgerAccountDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccount> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: LedgerAccountDeleteParams = LedgerAccountDeleteParams.none(),
    ): CompletableFuture<LedgerAccount> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: LedgerAccountDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccount>

    /** @see delete */
    fun delete(params: LedgerAccountDeleteParams): CompletableFuture<LedgerAccount> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<LedgerAccount> =
        delete(id, LedgerAccountDeleteParams.none(), requestOptions)

    /**
     * A view of [LedgerAccountServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LedgerAccountServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/ledger_accounts`, but is otherwise the same as
         * [LedgerAccountServiceAsync.create].
         */
        fun create(
            params: LedgerAccountCreateParams
        ): CompletableFuture<HttpResponseFor<LedgerAccount>> = create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: LedgerAccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccount>>

        /**
         * Returns a raw HTTP response for `get /api/ledger_accounts/{id}`, but is otherwise the
         * same as [LedgerAccountServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<LedgerAccount>> =
            retrieve(id, LedgerAccountRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: LedgerAccountRetrieveParams = LedgerAccountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccount>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: LedgerAccountRetrieveParams = LedgerAccountRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccount>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: LedgerAccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccount>>

        /** @see retrieve */
        fun retrieve(
            params: LedgerAccountRetrieveParams
        ): CompletableFuture<HttpResponseFor<LedgerAccount>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LedgerAccount>> =
            retrieve(id, LedgerAccountRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/ledger_accounts/{id}`, but is otherwise the
         * same as [LedgerAccountServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<LedgerAccount>> =
            update(id, LedgerAccountUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: LedgerAccountUpdateParams = LedgerAccountUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccount>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: LedgerAccountUpdateParams = LedgerAccountUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccount>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: LedgerAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccount>>

        /** @see update */
        fun update(
            params: LedgerAccountUpdateParams
        ): CompletableFuture<HttpResponseFor<LedgerAccount>> = update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LedgerAccount>> =
            update(id, LedgerAccountUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/ledger_accounts`, but is otherwise the same as
         * [LedgerAccountServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<LedgerAccountListPageAsync>> =
            list(LedgerAccountListParams.none())

        /** @see list */
        fun list(
            params: LedgerAccountListParams = LedgerAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountListPageAsync>>

        /** @see list */
        fun list(
            params: LedgerAccountListParams = LedgerAccountListParams.none()
        ): CompletableFuture<HttpResponseFor<LedgerAccountListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LedgerAccountListPageAsync>> =
            list(LedgerAccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/ledger_accounts/{id}`, but is otherwise the
         * same as [LedgerAccountServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<LedgerAccount>> =
            delete(id, LedgerAccountDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: LedgerAccountDeleteParams = LedgerAccountDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccount>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: LedgerAccountDeleteParams = LedgerAccountDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccount>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: LedgerAccountDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccount>>

        /** @see delete */
        fun delete(
            params: LedgerAccountDeleteParams
        ): CompletableFuture<HttpResponseFor<LedgerAccount>> = delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LedgerAccount>> =
            delete(id, LedgerAccountDeleteParams.none(), requestOptions)
    }
}
