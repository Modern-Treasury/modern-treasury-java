// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.AccountCollectionFlow
import com.moderntreasury.api.models.AccountCollectionFlowCreateParams
import com.moderntreasury.api.models.AccountCollectionFlowListPageAsync
import com.moderntreasury.api.models.AccountCollectionFlowListParams
import com.moderntreasury.api.models.AccountCollectionFlowRetrieveParams
import com.moderntreasury.api.models.AccountCollectionFlowUpdateParams
import java.util.concurrent.CompletableFuture

interface AccountCollectionFlowServiceAsync {

    /** create account_collection_flow */
    @JvmOverloads
    fun create(
        params: AccountCollectionFlowCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AccountCollectionFlow>

    /** get account_collection_flow */
    @JvmOverloads
    fun retrieve(
        params: AccountCollectionFlowRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AccountCollectionFlow>

    /** update account_collection_flow */
    @JvmOverloads
    fun update(
        params: AccountCollectionFlowUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AccountCollectionFlow>

    /** list account_collection_flows */
    @JvmOverloads
    fun list(
        params: AccountCollectionFlowListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AccountCollectionFlowListPageAsync>
}
