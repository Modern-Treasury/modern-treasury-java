// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.Transaction
import com.moderntreasury.api.models.TransactionCreateParams
import com.moderntreasury.api.models.TransactionDeleteParams
import com.moderntreasury.api.models.TransactionListPageAsync
import com.moderntreasury.api.models.TransactionListParams
import com.moderntreasury.api.models.TransactionRetrieveParams
import com.moderntreasury.api.models.TransactionUpdateParams
import com.moderntreasury.api.services.async.transactions.LineItemServiceAsync
import java.util.concurrent.CompletableFuture

interface TransactionServiceAsync {

    fun lineItems(): LineItemServiceAsync

    /** create transaction */
    @JvmOverloads
    fun create(
        params: TransactionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Transaction>

    /** Get details on a single transaction. */
    @JvmOverloads
    fun retrieve(
        params: TransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Transaction>

    /** Update a single transaction. */
    @JvmOverloads
    fun update(
        params: TransactionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Transaction>

    /** Get a list of all transactions. */
    @JvmOverloads
    fun list(
        params: TransactionListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<TransactionListPageAsync>

    /** delete transaction */
    @JvmOverloads
    fun delete(
        params: TransactionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Void?>
}
