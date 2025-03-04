// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.ExternalAccount
import com.moderntreasury.api.models.ExternalAccountCompleteVerificationParams
import com.moderntreasury.api.models.ExternalAccountCreateParams
import com.moderntreasury.api.models.ExternalAccountDeleteParams
import com.moderntreasury.api.models.ExternalAccountListPageAsync
import com.moderntreasury.api.models.ExternalAccountListParams
import com.moderntreasury.api.models.ExternalAccountRetrieveParams
import com.moderntreasury.api.models.ExternalAccountUpdateParams
import com.moderntreasury.api.models.ExternalAccountVerifyParams
import com.moderntreasury.api.models.ExternalAccountVerifyResponse
import java.util.concurrent.CompletableFuture

interface ExternalAccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** create external account */
    @JvmOverloads
    fun create(
        params: ExternalAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalAccount>

    /** show external account */
    @JvmOverloads
    fun retrieve(
        params: ExternalAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalAccount>

    /** update external account */
    @JvmOverloads
    fun update(
        params: ExternalAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalAccount>

    /** list external accounts */
    @JvmOverloads
    fun list(
        params: ExternalAccountListParams = ExternalAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalAccountListPageAsync>

    /** list external accounts */
    fun list(requestOptions: RequestOptions): CompletableFuture<ExternalAccountListPageAsync> =
        list(ExternalAccountListParams.none(), requestOptions)

    /** delete external account */
    @JvmOverloads
    fun delete(
        params: ExternalAccountDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** complete verification of external account */
    @JvmOverloads
    fun completeVerification(
        params: ExternalAccountCompleteVerificationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalAccount>

    /** verify external account */
    @JvmOverloads
    fun verify(
        params: ExternalAccountVerifyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalAccountVerifyResponse>

    /**
     * A view of [ExternalAccountServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/external_accounts`, but is otherwise the same
         * as [ExternalAccountServiceAsync.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: ExternalAccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalAccount>>

        /**
         * Returns a raw HTTP response for `get /api/external_accounts/{id}`, but is otherwise the
         * same as [ExternalAccountServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: ExternalAccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalAccount>>

        /**
         * Returns a raw HTTP response for `patch /api/external_accounts/{id}`, but is otherwise the
         * same as [ExternalAccountServiceAsync.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: ExternalAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalAccount>>

        /**
         * Returns a raw HTTP response for `get /api/external_accounts`, but is otherwise the same
         * as [ExternalAccountServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: ExternalAccountListParams = ExternalAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalAccountListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /api/external_accounts`, but is otherwise the same
         * as [ExternalAccountServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ExternalAccountListPageAsync>> =
            list(ExternalAccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/external_accounts/{id}`, but is otherwise
         * the same as [ExternalAccountServiceAsync.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: ExternalAccountDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /api/external_accounts/{id}/complete_verification`,
         * but is otherwise the same as [ExternalAccountServiceAsync.completeVerification].
         */
        @JvmOverloads
        @MustBeClosed
        fun completeVerification(
            params: ExternalAccountCompleteVerificationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalAccount>>

        /**
         * Returns a raw HTTP response for `post /api/external_accounts/{id}/verify`, but is
         * otherwise the same as [ExternalAccountServiceAsync.verify].
         */
        @JvmOverloads
        @MustBeClosed
        fun verify(
            params: ExternalAccountVerifyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalAccountVerifyResponse>>
    }
}
