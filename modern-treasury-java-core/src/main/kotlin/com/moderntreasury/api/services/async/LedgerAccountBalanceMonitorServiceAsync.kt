// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.LedgerAccountBalanceMonitor
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorCreateParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorDeleteParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorListPageAsync
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorListParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorRetrieveParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorUpdateParams
import java.util.concurrent.CompletableFuture

interface LedgerAccountBalanceMonitorServiceAsync {

    /** Create a ledger account balance monitor. */
    @JvmOverloads
    fun create(
        params: LedgerAccountBalanceMonitorCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<LedgerAccountBalanceMonitor>

    /** Get details on a single ledger account balance monitor. */
    @JvmOverloads
    fun retrieve(
        params: LedgerAccountBalanceMonitorRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<LedgerAccountBalanceMonitor>

    /** Update a ledger account balance monitor. */
    @JvmOverloads
    fun update(
        params: LedgerAccountBalanceMonitorUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<LedgerAccountBalanceMonitor>

    /** Get a list of ledger account balance monitors. */
    @JvmOverloads
    fun list(
        params: LedgerAccountBalanceMonitorListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<LedgerAccountBalanceMonitorListPageAsync>

    /** Delete a ledger account balance monitor. */
    @JvmOverloads
    fun delete(
        params: LedgerAccountBalanceMonitorDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<LedgerAccountBalanceMonitor>
}
