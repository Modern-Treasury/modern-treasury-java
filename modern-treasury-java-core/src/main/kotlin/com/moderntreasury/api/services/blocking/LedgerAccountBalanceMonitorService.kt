// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.LedgerAccountBalanceMonitor
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorCreateParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorDeleteParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorListPage
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorListParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorRetrieveParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorUpdateParams

interface LedgerAccountBalanceMonitorService {

    /** Create a ledger account balance monitor. */
    @JvmOverloads
    fun create(
        params: LedgerAccountBalanceMonitorCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountBalanceMonitor

    /** Get details on a single ledger account balance monitor. */
    @JvmOverloads
    fun retrieve(
        params: LedgerAccountBalanceMonitorRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountBalanceMonitor

    /** Update a ledger account balance monitor. */
    @JvmOverloads
    fun update(
        params: LedgerAccountBalanceMonitorUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountBalanceMonitor

    /** Get a list of ledger account balance monitors. */
    @JvmOverloads
    fun list(
        params: LedgerAccountBalanceMonitorListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountBalanceMonitorListPage

    /** Delete a ledger account balance monitor. */
    @JvmOverloads
    fun delete(
        params: LedgerAccountBalanceMonitorDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountBalanceMonitor
}
