// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.LedgerTransaction
import com.moderntreasury.api.models.LedgerTransactionCreateParams
import com.moderntreasury.api.models.LedgerTransactionCreateReversalParams
import com.moderntreasury.api.models.LedgerTransactionListPage
import com.moderntreasury.api.models.LedgerTransactionListParams
import com.moderntreasury.api.models.LedgerTransactionRetrieveParams
import com.moderntreasury.api.models.LedgerTransactionUpdateParams
import com.moderntreasury.api.services.blocking.ledgerTransactions.VersionService

interface LedgerTransactionService {

    fun versions(): VersionService

    /** Create a ledger transaction. */
    @JvmOverloads
    fun create(
        params: LedgerTransactionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LedgerTransaction

    /** Get details on a single ledger transaction. */
    @JvmOverloads
    fun retrieve(
        params: LedgerTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LedgerTransaction

    /** Update the details of a ledger transaction. */
    @JvmOverloads
    fun update(
        params: LedgerTransactionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LedgerTransaction

    /** Get a list of ledger transactions. */
    @JvmOverloads
    fun list(
        params: LedgerTransactionListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LedgerTransactionListPage

    /** Create a ledger transaction reversal. */
    @JvmOverloads
    fun createReversal(
        params: LedgerTransactionCreateReversalParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LedgerTransaction
}
