// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.Counterparty
import com.moderntreasury.api.models.CounterpartyCollectAccountParams
import com.moderntreasury.api.models.CounterpartyCollectAccountResponse
import com.moderntreasury.api.models.CounterpartyCreateParams
import com.moderntreasury.api.models.CounterpartyDeleteParams
import com.moderntreasury.api.models.CounterpartyListPageAsync
import com.moderntreasury.api.models.CounterpartyListParams
import com.moderntreasury.api.models.CounterpartyRetrieveParams
import com.moderntreasury.api.models.CounterpartyUpdateParams
import java.util.concurrent.CompletableFuture

interface CounterpartyServiceAsync {

    /** Create a new counterparty. */
    @JvmOverloads
    fun create(
        params: CounterpartyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Counterparty>

    /** Get details on a single counterparty. */
    @JvmOverloads
    fun retrieve(
        params: CounterpartyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Counterparty>

    /** Updates a given counterparty with new information. */
    @JvmOverloads
    fun update(
        params: CounterpartyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Counterparty>

    /** Get a paginated list of all counterparties. */
    @JvmOverloads
    fun list(
        params: CounterpartyListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CounterpartyListPageAsync>

    /** Deletes a given counterparty. */
    @JvmOverloads
    fun delete(
        params: CounterpartyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Void>

    /** Send an email requesting account details. */
    @JvmOverloads
    fun collectAccount(
        params: CounterpartyCollectAccountParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CounterpartyCollectAccountResponse>
}
