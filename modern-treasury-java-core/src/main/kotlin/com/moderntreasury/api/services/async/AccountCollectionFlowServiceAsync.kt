// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.AccountCollectionFlow
import com.moderntreasury.api.models.AccountCollectionFlowCreateParams
import com.moderntreasury.api.models.AccountCollectionFlowListPageAsync
import com.moderntreasury.api.models.AccountCollectionFlowListParams
import com.moderntreasury.api.models.AccountCollectionFlowRetrieveParams
import com.moderntreasury.api.models.AccountCollectionFlowUpdateParams
import java.util.concurrent.CompletableFuture

interface AccountCollectionFlowServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** create account_collection_flow */
    fun create(
        params: AccountCollectionFlowCreateParams
    ): CompletableFuture<AccountCollectionFlow> = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: AccountCollectionFlowCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountCollectionFlow>

    /** get account_collection_flow */
    fun retrieve(id: String): CompletableFuture<AccountCollectionFlow> =
        retrieve(id, AccountCollectionFlowRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: AccountCollectionFlowRetrieveParams = AccountCollectionFlowRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountCollectionFlow> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: AccountCollectionFlowRetrieveParams = AccountCollectionFlowRetrieveParams.none(),
    ): CompletableFuture<AccountCollectionFlow> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: AccountCollectionFlowRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountCollectionFlow>

    /** @see [retrieve] */
    fun retrieve(
        params: AccountCollectionFlowRetrieveParams
    ): CompletableFuture<AccountCollectionFlow> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountCollectionFlow> =
        retrieve(id, AccountCollectionFlowRetrieveParams.none(), requestOptions)

    /** update account_collection_flow */
    fun update(
        id: String,
        params: AccountCollectionFlowUpdateParams,
    ): CompletableFuture<AccountCollectionFlow> = update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        id: String,
        params: AccountCollectionFlowUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountCollectionFlow> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(
        params: AccountCollectionFlowUpdateParams
    ): CompletableFuture<AccountCollectionFlow> = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: AccountCollectionFlowUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountCollectionFlow>

    /** list account_collection_flows */
    fun list(): CompletableFuture<AccountCollectionFlowListPageAsync> =
        list(AccountCollectionFlowListParams.none())

    /** @see [list] */
    fun list(
        params: AccountCollectionFlowListParams = AccountCollectionFlowListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountCollectionFlowListPageAsync>

    /** @see [list] */
    fun list(
        params: AccountCollectionFlowListParams = AccountCollectionFlowListParams.none()
    ): CompletableFuture<AccountCollectionFlowListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<AccountCollectionFlowListPageAsync> =
        list(AccountCollectionFlowListParams.none(), requestOptions)

    /**
     * A view of [AccountCollectionFlowServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/account_collection_flows`, but is otherwise
         * the same as [AccountCollectionFlowServiceAsync.create].
         */
        fun create(
            params: AccountCollectionFlowCreateParams
        ): CompletableFuture<HttpResponseFor<AccountCollectionFlow>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: AccountCollectionFlowCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountCollectionFlow>>

        /**
         * Returns a raw HTTP response for `get /api/account_collection_flows/{id}`, but is
         * otherwise the same as [AccountCollectionFlowServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<AccountCollectionFlow>> =
            retrieve(id, AccountCollectionFlowRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: AccountCollectionFlowRetrieveParams =
                AccountCollectionFlowRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountCollectionFlow>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: AccountCollectionFlowRetrieveParams = AccountCollectionFlowRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AccountCollectionFlow>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: AccountCollectionFlowRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountCollectionFlow>>

        /** @see [retrieve] */
        fun retrieve(
            params: AccountCollectionFlowRetrieveParams
        ): CompletableFuture<HttpResponseFor<AccountCollectionFlow>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountCollectionFlow>> =
            retrieve(id, AccountCollectionFlowRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/account_collection_flows/{id}`, but is
         * otherwise the same as [AccountCollectionFlowServiceAsync.update].
         */
        fun update(
            id: String,
            params: AccountCollectionFlowUpdateParams,
        ): CompletableFuture<HttpResponseFor<AccountCollectionFlow>> =
            update(id, params, RequestOptions.none())

        /** @see [update] */
        fun update(
            id: String,
            params: AccountCollectionFlowUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountCollectionFlow>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        fun update(
            params: AccountCollectionFlowUpdateParams
        ): CompletableFuture<HttpResponseFor<AccountCollectionFlow>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: AccountCollectionFlowUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountCollectionFlow>>

        /**
         * Returns a raw HTTP response for `get /api/account_collection_flows`, but is otherwise the
         * same as [AccountCollectionFlowServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AccountCollectionFlowListPageAsync>> =
            list(AccountCollectionFlowListParams.none())

        /** @see [list] */
        fun list(
            params: AccountCollectionFlowListParams = AccountCollectionFlowListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountCollectionFlowListPageAsync>>

        /** @see [list] */
        fun list(
            params: AccountCollectionFlowListParams = AccountCollectionFlowListParams.none()
        ): CompletableFuture<HttpResponseFor<AccountCollectionFlowListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AccountCollectionFlowListPageAsync>> =
            list(AccountCollectionFlowListParams.none(), requestOptions)
    }
}
