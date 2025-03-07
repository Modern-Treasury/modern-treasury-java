// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.AccountCollectionFlow
import com.moderntreasury.api.models.AccountCollectionFlowCreateParams
import com.moderntreasury.api.models.AccountCollectionFlowListPage
import com.moderntreasury.api.models.AccountCollectionFlowListParams
import com.moderntreasury.api.models.AccountCollectionFlowRetrieveParams
import com.moderntreasury.api.models.AccountCollectionFlowUpdateParams

interface AccountCollectionFlowService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** create account_collection_flow */
    fun create(params: AccountCollectionFlowCreateParams): AccountCollectionFlow =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: AccountCollectionFlowCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountCollectionFlow

    /** get account_collection_flow */
    fun retrieve(params: AccountCollectionFlowRetrieveParams): AccountCollectionFlow =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: AccountCollectionFlowRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountCollectionFlow

    /** update account_collection_flow */
    fun update(params: AccountCollectionFlowUpdateParams): AccountCollectionFlow =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: AccountCollectionFlowUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountCollectionFlow

    /** list account_collection_flows */
    fun list(): AccountCollectionFlowListPage = list(AccountCollectionFlowListParams.none())

    /** @see [list] */
    fun list(
        params: AccountCollectionFlowListParams = AccountCollectionFlowListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountCollectionFlowListPage

    /** @see [list] */
    fun list(
        params: AccountCollectionFlowListParams = AccountCollectionFlowListParams.none()
    ): AccountCollectionFlowListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): AccountCollectionFlowListPage =
        list(AccountCollectionFlowListParams.none(), requestOptions)

    /**
     * A view of [AccountCollectionFlowService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/account_collection_flows`, but is otherwise
         * the same as [AccountCollectionFlowService.create].
         */
        @MustBeClosed
        fun create(
            params: AccountCollectionFlowCreateParams
        ): HttpResponseFor<AccountCollectionFlow> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: AccountCollectionFlowCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountCollectionFlow>

        /**
         * Returns a raw HTTP response for `get /api/account_collection_flows/{id}`, but is
         * otherwise the same as [AccountCollectionFlowService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: AccountCollectionFlowRetrieveParams
        ): HttpResponseFor<AccountCollectionFlow> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: AccountCollectionFlowRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountCollectionFlow>

        /**
         * Returns a raw HTTP response for `patch /api/account_collection_flows/{id}`, but is
         * otherwise the same as [AccountCollectionFlowService.update].
         */
        @MustBeClosed
        fun update(
            params: AccountCollectionFlowUpdateParams
        ): HttpResponseFor<AccountCollectionFlow> = update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: AccountCollectionFlowUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountCollectionFlow>

        /**
         * Returns a raw HTTP response for `get /api/account_collection_flows`, but is otherwise the
         * same as [AccountCollectionFlowService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<AccountCollectionFlowListPage> =
            list(AccountCollectionFlowListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AccountCollectionFlowListParams = AccountCollectionFlowListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountCollectionFlowListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AccountCollectionFlowListParams = AccountCollectionFlowListParams.none()
        ): HttpResponseFor<AccountCollectionFlowListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AccountCollectionFlowListPage> =
            list(AccountCollectionFlowListParams.none(), requestOptions)
    }
}
