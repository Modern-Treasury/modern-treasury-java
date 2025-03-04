// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.InternalAccount
import com.moderntreasury.api.models.InternalAccountCreateParams
import com.moderntreasury.api.models.InternalAccountListPage
import com.moderntreasury.api.models.InternalAccountListParams
import com.moderntreasury.api.models.InternalAccountRetrieveParams
import com.moderntreasury.api.models.InternalAccountUpdateParams
import com.moderntreasury.api.services.blocking.internalAccounts.BalanceReportService

interface InternalAccountService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun balanceReports(): BalanceReportService

    /** create internal account */
    @JvmOverloads
    fun create(
        params: InternalAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InternalAccount

    /** get internal account */
    @JvmOverloads
    fun retrieve(
        params: InternalAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InternalAccount

    /** update internal account */
    @JvmOverloads
    fun update(
        params: InternalAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InternalAccount

    /** list internal accounts */
    @JvmOverloads
    fun list(
        params: InternalAccountListParams = InternalAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InternalAccountListPage

    /** list internal accounts */
    fun list(requestOptions: RequestOptions): InternalAccountListPage =
        list(InternalAccountListParams.none(), requestOptions)

    /**
     * A view of [InternalAccountService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        fun balanceReports(): BalanceReportService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/internal_accounts`, but is otherwise the same
         * as [InternalAccountService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: InternalAccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InternalAccount>

        /**
         * Returns a raw HTTP response for `get /api/internal_accounts/{id}`, but is otherwise the
         * same as [InternalAccountService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: InternalAccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InternalAccount>

        /**
         * Returns a raw HTTP response for `patch /api/internal_accounts/{id}`, but is otherwise the
         * same as [InternalAccountService.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: InternalAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InternalAccount>

        /**
         * Returns a raw HTTP response for `get /api/internal_accounts`, but is otherwise the same
         * as [InternalAccountService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: InternalAccountListParams = InternalAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InternalAccountListPage>

        /**
         * Returns a raw HTTP response for `get /api/internal_accounts`, but is otherwise the same
         * as [InternalAccountService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<InternalAccountListPage> =
            list(InternalAccountListParams.none(), requestOptions)
    }
}
