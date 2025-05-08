// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async.internalAccounts

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.BalanceReport
import com.moderntreasury.api.models.BalanceReportCreateParams
import com.moderntreasury.api.models.BalanceReportDeleteParams
import com.moderntreasury.api.models.BalanceReportListPageAsync
import com.moderntreasury.api.models.BalanceReportListParams
import com.moderntreasury.api.models.BalanceReportRetrieveParams
import java.util.concurrent.CompletableFuture

interface BalanceReportServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** create balance reports */
    fun create(
        internalAccountId: String,
        params: BalanceReportCreateParams,
    ): CompletableFuture<BalanceReport> = create(internalAccountId, params, RequestOptions.none())

    /** @see [create] */
    fun create(
        internalAccountId: String,
        params: BalanceReportCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BalanceReport> =
        create(params.toBuilder().internalAccountId(internalAccountId).build(), requestOptions)

    /** @see [create] */
    fun create(params: BalanceReportCreateParams): CompletableFuture<BalanceReport> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: BalanceReportCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BalanceReport>

    /** Get a single balance report for a given internal account. */
    fun retrieve(
        id: String,
        params: BalanceReportRetrieveParams,
    ): CompletableFuture<BalanceReport> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: BalanceReportRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BalanceReport> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(params: BalanceReportRetrieveParams): CompletableFuture<BalanceReport> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: BalanceReportRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BalanceReport>

    /** Get all balance reports for a given internal account. */
    fun list(internalAccountId: String): CompletableFuture<BalanceReportListPageAsync> =
        list(internalAccountId, BalanceReportListParams.none())

    /** @see [list] */
    fun list(
        internalAccountId: String,
        params: BalanceReportListParams = BalanceReportListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BalanceReportListPageAsync> =
        list(params.toBuilder().internalAccountId(internalAccountId).build(), requestOptions)

    /** @see [list] */
    fun list(
        internalAccountId: String,
        params: BalanceReportListParams = BalanceReportListParams.none(),
    ): CompletableFuture<BalanceReportListPageAsync> =
        list(internalAccountId, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: BalanceReportListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BalanceReportListPageAsync>

    /** @see [list] */
    fun list(params: BalanceReportListParams): CompletableFuture<BalanceReportListPageAsync> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        internalAccountId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BalanceReportListPageAsync> =
        list(internalAccountId, BalanceReportListParams.none(), requestOptions)

    /** Deletes a given balance report. */
    fun delete(id: String, params: BalanceReportDeleteParams): CompletableFuture<Void?> =
        delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: BalanceReportDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(params: BalanceReportDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: BalanceReportDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [BalanceReportServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post
         * /api/internal_accounts/{internal_account_id}/balance_reports`, but is otherwise the same
         * as [BalanceReportServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            internalAccountId: String,
            params: BalanceReportCreateParams,
        ): CompletableFuture<HttpResponseFor<BalanceReport>> =
            create(internalAccountId, params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            internalAccountId: String,
            params: BalanceReportCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BalanceReport>> =
            create(params.toBuilder().internalAccountId(internalAccountId).build(), requestOptions)

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: BalanceReportCreateParams
        ): CompletableFuture<HttpResponseFor<BalanceReport>> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: BalanceReportCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BalanceReport>>

        /**
         * Returns a raw HTTP response for `get
         * /api/internal_accounts/{internal_account_id}/balance_reports/{id}`, but is otherwise the
         * same as [BalanceReportServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: BalanceReportRetrieveParams,
        ): CompletableFuture<HttpResponseFor<BalanceReport>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: BalanceReportRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BalanceReport>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: BalanceReportRetrieveParams
        ): CompletableFuture<HttpResponseFor<BalanceReport>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: BalanceReportRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BalanceReport>>

        /**
         * Returns a raw HTTP response for `get
         * /api/internal_accounts/{internal_account_id}/balance_reports`, but is otherwise the same
         * as [BalanceReportServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            internalAccountId: String
        ): CompletableFuture<HttpResponseFor<BalanceReportListPageAsync>> =
            list(internalAccountId, BalanceReportListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            internalAccountId: String,
            params: BalanceReportListParams = BalanceReportListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BalanceReportListPageAsync>> =
            list(params.toBuilder().internalAccountId(internalAccountId).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        fun list(
            internalAccountId: String,
            params: BalanceReportListParams = BalanceReportListParams.none(),
        ): CompletableFuture<HttpResponseFor<BalanceReportListPageAsync>> =
            list(internalAccountId, params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: BalanceReportListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BalanceReportListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: BalanceReportListParams
        ): CompletableFuture<HttpResponseFor<BalanceReportListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            internalAccountId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BalanceReportListPageAsync>> =
            list(internalAccountId, BalanceReportListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /api/internal_accounts/{internal_account_id}/balance_reports/{id}`, but is otherwise the
         * same as [BalanceReportServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(id: String, params: BalanceReportDeleteParams): CompletableFuture<HttpResponse> =
            delete(id, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: BalanceReportDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: BalanceReportDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: BalanceReportDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
