// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

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
    @JvmOverloads
    fun create(
        params: AccountCollectionFlowCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountCollectionFlow

    /** get account_collection_flow */
    @JvmOverloads
    fun retrieve(
        params: AccountCollectionFlowRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountCollectionFlow

    /** update account_collection_flow */
    @JvmOverloads
    fun update(
        params: AccountCollectionFlowUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountCollectionFlow

    /** list account_collection_flows */
    @JvmOverloads
    fun list(
        params: AccountCollectionFlowListParams = AccountCollectionFlowListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountCollectionFlowListPage

    /** list account_collection_flows */
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
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: AccountCollectionFlowCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountCollectionFlow>

        /**
         * Returns a raw HTTP response for `get /api/account_collection_flows/{id}`, but is
         * otherwise the same as [AccountCollectionFlowService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: AccountCollectionFlowRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountCollectionFlow>

        /**
         * Returns a raw HTTP response for `patch /api/account_collection_flows/{id}`, but is
         * otherwise the same as [AccountCollectionFlowService.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: AccountCollectionFlowUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountCollectionFlow>

        /**
         * Returns a raw HTTP response for `get /api/account_collection_flows`, but is otherwise the
         * same as [AccountCollectionFlowService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: AccountCollectionFlowListParams = AccountCollectionFlowListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountCollectionFlowListPage>

        /**
         * Returns a raw HTTP response for `get /api/account_collection_flows`, but is otherwise the
         * same as [AccountCollectionFlowService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AccountCollectionFlowListPage> =
            list(AccountCollectionFlowListParams.none(), requestOptions)
    }
}
