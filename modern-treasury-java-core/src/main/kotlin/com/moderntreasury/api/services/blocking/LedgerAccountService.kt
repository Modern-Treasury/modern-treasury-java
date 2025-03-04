// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.LedgerAccount
import com.moderntreasury.api.models.LedgerAccountCreateParams
import com.moderntreasury.api.models.LedgerAccountDeleteParams
import com.moderntreasury.api.models.LedgerAccountListPage
import com.moderntreasury.api.models.LedgerAccountListParams
import com.moderntreasury.api.models.LedgerAccountRetrieveParams
import com.moderntreasury.api.models.LedgerAccountUpdateParams

interface LedgerAccountService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a ledger account. */
    @JvmOverloads
    fun create(
        params: LedgerAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccount

    /** Get details on a single ledger account. */
    @JvmOverloads
    fun retrieve(
        params: LedgerAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccount

    /** Update the details of a ledger account. */
    @JvmOverloads
    fun update(
        params: LedgerAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccount

    /** Get a list of ledger accounts. */
    @JvmOverloads
    fun list(
        params: LedgerAccountListParams = LedgerAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountListPage

    /** Get a list of ledger accounts. */
    fun list(requestOptions: RequestOptions): LedgerAccountListPage =
        list(LedgerAccountListParams.none(), requestOptions)

    /** Delete a ledger account. */
    @JvmOverloads
    fun delete(
        params: LedgerAccountDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccount

    /**
     * A view of [LedgerAccountService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/ledger_accounts`, but is otherwise the same as
         * [LedgerAccountService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: LedgerAccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccount>

        /**
         * Returns a raw HTTP response for `get /api/ledger_accounts/{id}`, but is otherwise the
         * same as [LedgerAccountService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: LedgerAccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccount>

        /**
         * Returns a raw HTTP response for `patch /api/ledger_accounts/{id}`, but is otherwise the
         * same as [LedgerAccountService.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: LedgerAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccount>

        /**
         * Returns a raw HTTP response for `get /api/ledger_accounts`, but is otherwise the same as
         * [LedgerAccountService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: LedgerAccountListParams = LedgerAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountListPage>

        /**
         * Returns a raw HTTP response for `get /api/ledger_accounts`, but is otherwise the same as
         * [LedgerAccountService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<LedgerAccountListPage> =
            list(LedgerAccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/ledger_accounts/{id}`, but is otherwise the
         * same as [LedgerAccountService.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: LedgerAccountDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccount>
    }
}
