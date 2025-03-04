// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.blocking.internalAccounts

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.BalanceReport
import com.moderntreasury.api.models.BalanceReportCreateParams
import com.moderntreasury.api.models.BalanceReportDeleteParams
import com.moderntreasury.api.models.BalanceReportListPage
import com.moderntreasury.api.models.BalanceReportListParams
import com.moderntreasury.api.models.BalanceReportRetrieveParams

interface BalanceReportService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** create balance reports */
    @JvmOverloads
    fun create(
        params: BalanceReportCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceReport

    /** Get a single balance report for a given internal account. */
    @JvmOverloads
    fun retrieve(
        params: BalanceReportRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceReport

    /** Get all balance reports for a given internal account. */
    @JvmOverloads
    fun list(
        params: BalanceReportListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceReportListPage

    /** Deletes a given balance report. */
    @JvmOverloads
    fun delete(
        params: BalanceReportDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [BalanceReportService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post
         * /api/internal_accounts/{internal_account_id}/balance_reports`, but is otherwise the same
         * as [BalanceReportService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: BalanceReportCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceReport>

        /**
         * Returns a raw HTTP response for `get
         * /api/internal_accounts/{internal_account_id}/balance_reports/{id}`, but is otherwise the
         * same as [BalanceReportService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: BalanceReportRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceReport>

        /**
         * Returns a raw HTTP response for `get
         * /api/internal_accounts/{internal_account_id}/balance_reports`, but is otherwise the same
         * as [BalanceReportService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: BalanceReportListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceReportListPage>

        /**
         * Returns a raw HTTP response for `delete
         * /api/internal_accounts/{internal_account_id}/balance_reports/{id}`, but is otherwise the
         * same as [BalanceReportService.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: BalanceReportDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
