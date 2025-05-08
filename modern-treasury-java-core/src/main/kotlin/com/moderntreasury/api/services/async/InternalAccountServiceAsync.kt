// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.InternalAccount
import com.moderntreasury.api.models.InternalAccountCreateParams
import com.moderntreasury.api.models.InternalAccountListPageAsync
import com.moderntreasury.api.models.InternalAccountListParams
import com.moderntreasury.api.models.InternalAccountRetrieveParams
import com.moderntreasury.api.models.InternalAccountUpdateParams
import com.moderntreasury.api.services.async.internalAccounts.BalanceReportServiceAsync
import java.util.concurrent.CompletableFuture

interface InternalAccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun balanceReports(): BalanceReportServiceAsync

    /** create internal account */
    fun create(params: InternalAccountCreateParams): CompletableFuture<InternalAccount> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: InternalAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InternalAccount>

    /** get internal account */
    fun retrieve(id: String): CompletableFuture<InternalAccount> =
        retrieve(id, InternalAccountRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: InternalAccountRetrieveParams = InternalAccountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InternalAccount> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: InternalAccountRetrieveParams = InternalAccountRetrieveParams.none(),
    ): CompletableFuture<InternalAccount> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: InternalAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InternalAccount>

    /** @see [retrieve] */
    fun retrieve(params: InternalAccountRetrieveParams): CompletableFuture<InternalAccount> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<InternalAccount> =
        retrieve(id, InternalAccountRetrieveParams.none(), requestOptions)

    /** update internal account */
    fun update(id: String): CompletableFuture<InternalAccount> =
        update(id, InternalAccountUpdateParams.none())

    /** @see [update] */
    fun update(
        id: String,
        params: InternalAccountUpdateParams = InternalAccountUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InternalAccount> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(
        id: String,
        params: InternalAccountUpdateParams = InternalAccountUpdateParams.none(),
    ): CompletableFuture<InternalAccount> = update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: InternalAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InternalAccount>

    /** @see [update] */
    fun update(params: InternalAccountUpdateParams): CompletableFuture<InternalAccount> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(id: String, requestOptions: RequestOptions): CompletableFuture<InternalAccount> =
        update(id, InternalAccountUpdateParams.none(), requestOptions)

    /** list internal accounts */
    fun list(): CompletableFuture<InternalAccountListPageAsync> =
        list(InternalAccountListParams.none())

    /** @see [list] */
    fun list(
        params: InternalAccountListParams = InternalAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InternalAccountListPageAsync>

    /** @see [list] */
    fun list(
        params: InternalAccountListParams = InternalAccountListParams.none()
    ): CompletableFuture<InternalAccountListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<InternalAccountListPageAsync> =
        list(InternalAccountListParams.none(), requestOptions)

    /**
     * A view of [InternalAccountServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        fun balanceReports(): BalanceReportServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/internal_accounts`, but is otherwise the same
         * as [InternalAccountServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: InternalAccountCreateParams
        ): CompletableFuture<HttpResponseFor<InternalAccount>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: InternalAccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InternalAccount>>

        /**
         * Returns a raw HTTP response for `get /api/internal_accounts/{id}`, but is otherwise the
         * same as [InternalAccountServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<InternalAccount>> =
            retrieve(id, InternalAccountRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: InternalAccountRetrieveParams = InternalAccountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InternalAccount>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: InternalAccountRetrieveParams = InternalAccountRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<InternalAccount>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: InternalAccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InternalAccount>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: InternalAccountRetrieveParams
        ): CompletableFuture<HttpResponseFor<InternalAccount>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InternalAccount>> =
            retrieve(id, InternalAccountRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/internal_accounts/{id}`, but is otherwise the
         * same as [InternalAccountServiceAsync.update].
         */
        @MustBeClosed
        fun update(id: String): CompletableFuture<HttpResponseFor<InternalAccount>> =
            update(id, InternalAccountUpdateParams.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            params: InternalAccountUpdateParams = InternalAccountUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InternalAccount>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            params: InternalAccountUpdateParams = InternalAccountUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<InternalAccount>> =
            update(id, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: InternalAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InternalAccount>>

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: InternalAccountUpdateParams
        ): CompletableFuture<HttpResponseFor<InternalAccount>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InternalAccount>> =
            update(id, InternalAccountUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/internal_accounts`, but is otherwise the same
         * as [InternalAccountServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<InternalAccountListPageAsync>> =
            list(InternalAccountListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: InternalAccountListParams = InternalAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InternalAccountListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: InternalAccountListParams = InternalAccountListParams.none()
        ): CompletableFuture<HttpResponseFor<InternalAccountListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InternalAccountListPageAsync>> =
            list(InternalAccountListParams.none(), requestOptions)
    }
}
