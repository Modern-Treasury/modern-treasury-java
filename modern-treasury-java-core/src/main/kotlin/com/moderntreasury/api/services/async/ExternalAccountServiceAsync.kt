// File generated from our OpenAPI spec by Stainless.

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
    fun create(params: ExternalAccountCreateParams): CompletableFuture<ExternalAccount> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: ExternalAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalAccount>

    /** show external account */
    fun retrieve(id: String): CompletableFuture<ExternalAccount> =
        retrieve(id, ExternalAccountRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: ExternalAccountRetrieveParams = ExternalAccountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalAccount> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: ExternalAccountRetrieveParams = ExternalAccountRetrieveParams.none(),
    ): CompletableFuture<ExternalAccount> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ExternalAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalAccount>

    /** @see [retrieve] */
    fun retrieve(params: ExternalAccountRetrieveParams): CompletableFuture<ExternalAccount> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<ExternalAccount> =
        retrieve(id, ExternalAccountRetrieveParams.none(), requestOptions)

    /** update external account */
    fun update(id: String): CompletableFuture<ExternalAccount> =
        update(id, ExternalAccountUpdateParams.none())

    /** @see [update] */
    fun update(
        id: String,
        params: ExternalAccountUpdateParams = ExternalAccountUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalAccount> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(
        id: String,
        params: ExternalAccountUpdateParams = ExternalAccountUpdateParams.none(),
    ): CompletableFuture<ExternalAccount> = update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: ExternalAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalAccount>

    /** @see [update] */
    fun update(params: ExternalAccountUpdateParams): CompletableFuture<ExternalAccount> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(id: String, requestOptions: RequestOptions): CompletableFuture<ExternalAccount> =
        update(id, ExternalAccountUpdateParams.none(), requestOptions)

    /** list external accounts */
    fun list(): CompletableFuture<ExternalAccountListPageAsync> =
        list(ExternalAccountListParams.none())

    /** @see [list] */
    fun list(
        params: ExternalAccountListParams = ExternalAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalAccountListPageAsync>

    /** @see [list] */
    fun list(
        params: ExternalAccountListParams = ExternalAccountListParams.none()
    ): CompletableFuture<ExternalAccountListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<ExternalAccountListPageAsync> =
        list(ExternalAccountListParams.none(), requestOptions)

    /** delete external account */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(id, ExternalAccountDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: ExternalAccountDeleteParams = ExternalAccountDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        id: String,
        params: ExternalAccountDeleteParams = ExternalAccountDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: ExternalAccountDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see [delete] */
    fun delete(params: ExternalAccountDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, ExternalAccountDeleteParams.none(), requestOptions)

    /** complete verification of external account */
    fun completeVerification(id: String): CompletableFuture<ExternalAccount> =
        completeVerification(id, ExternalAccountCompleteVerificationParams.none())

    /** @see [completeVerification] */
    fun completeVerification(
        id: String,
        params: ExternalAccountCompleteVerificationParams =
            ExternalAccountCompleteVerificationParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalAccount> =
        completeVerification(params.toBuilder().id(id).build(), requestOptions)

    /** @see [completeVerification] */
    fun completeVerification(
        id: String,
        params: ExternalAccountCompleteVerificationParams =
            ExternalAccountCompleteVerificationParams.none(),
    ): CompletableFuture<ExternalAccount> = completeVerification(id, params, RequestOptions.none())

    /** @see [completeVerification] */
    fun completeVerification(
        params: ExternalAccountCompleteVerificationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalAccount>

    /** @see [completeVerification] */
    fun completeVerification(
        params: ExternalAccountCompleteVerificationParams
    ): CompletableFuture<ExternalAccount> = completeVerification(params, RequestOptions.none())

    /** @see [completeVerification] */
    fun completeVerification(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalAccount> =
        completeVerification(id, ExternalAccountCompleteVerificationParams.none(), requestOptions)

    /** verify external account */
    fun verify(
        id: String,
        params: ExternalAccountVerifyParams,
    ): CompletableFuture<ExternalAccountVerifyResponse> = verify(id, params, RequestOptions.none())

    /** @see [verify] */
    fun verify(
        id: String,
        params: ExternalAccountVerifyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalAccountVerifyResponse> =
        verify(params.toBuilder().id(id).build(), requestOptions)

    /** @see [verify] */
    fun verify(
        params: ExternalAccountVerifyParams
    ): CompletableFuture<ExternalAccountVerifyResponse> = verify(params, RequestOptions.none())

    /** @see [verify] */
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
        @MustBeClosed
        fun create(
            params: ExternalAccountCreateParams
        ): CompletableFuture<HttpResponseFor<ExternalAccount>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ExternalAccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalAccount>>

        /**
         * Returns a raw HTTP response for `get /api/external_accounts/{id}`, but is otherwise the
         * same as [ExternalAccountServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<ExternalAccount>> =
            retrieve(id, ExternalAccountRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ExternalAccountRetrieveParams = ExternalAccountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalAccount>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ExternalAccountRetrieveParams = ExternalAccountRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ExternalAccount>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ExternalAccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalAccount>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ExternalAccountRetrieveParams
        ): CompletableFuture<HttpResponseFor<ExternalAccount>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalAccount>> =
            retrieve(id, ExternalAccountRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/external_accounts/{id}`, but is otherwise the
         * same as [ExternalAccountServiceAsync.update].
         */
        @MustBeClosed
        fun update(id: String): CompletableFuture<HttpResponseFor<ExternalAccount>> =
            update(id, ExternalAccountUpdateParams.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            params: ExternalAccountUpdateParams = ExternalAccountUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalAccount>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            params: ExternalAccountUpdateParams = ExternalAccountUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<ExternalAccount>> =
            update(id, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: ExternalAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalAccount>>

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: ExternalAccountUpdateParams
        ): CompletableFuture<HttpResponseFor<ExternalAccount>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalAccount>> =
            update(id, ExternalAccountUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/external_accounts`, but is otherwise the same
         * as [ExternalAccountServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<ExternalAccountListPageAsync>> =
            list(ExternalAccountListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ExternalAccountListParams = ExternalAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalAccountListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ExternalAccountListParams = ExternalAccountListParams.none()
        ): CompletableFuture<HttpResponseFor<ExternalAccountListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ExternalAccountListPageAsync>> =
            list(ExternalAccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/external_accounts/{id}`, but is otherwise
         * the same as [ExternalAccountServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, ExternalAccountDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: ExternalAccountDeleteParams = ExternalAccountDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: ExternalAccountDeleteParams = ExternalAccountDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: ExternalAccountDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: ExternalAccountDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, ExternalAccountDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/external_accounts/{id}/complete_verification`,
         * but is otherwise the same as [ExternalAccountServiceAsync.completeVerification].
         */
        @MustBeClosed
        fun completeVerification(id: String): CompletableFuture<HttpResponseFor<ExternalAccount>> =
            completeVerification(id, ExternalAccountCompleteVerificationParams.none())

        /** @see [completeVerification] */
        @MustBeClosed
        fun completeVerification(
            id: String,
            params: ExternalAccountCompleteVerificationParams =
                ExternalAccountCompleteVerificationParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalAccount>> =
            completeVerification(params.toBuilder().id(id).build(), requestOptions)

        /** @see [completeVerification] */
        @MustBeClosed
        fun completeVerification(
            id: String,
            params: ExternalAccountCompleteVerificationParams =
                ExternalAccountCompleteVerificationParams.none(),
        ): CompletableFuture<HttpResponseFor<ExternalAccount>> =
            completeVerification(id, params, RequestOptions.none())

        /** @see [completeVerification] */
        @MustBeClosed
        fun completeVerification(
            params: ExternalAccountCompleteVerificationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalAccount>>

        /** @see [completeVerification] */
        @MustBeClosed
        fun completeVerification(
            params: ExternalAccountCompleteVerificationParams
        ): CompletableFuture<HttpResponseFor<ExternalAccount>> =
            completeVerification(params, RequestOptions.none())

        /** @see [completeVerification] */
        @MustBeClosed
        fun completeVerification(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalAccount>> =
            completeVerification(
                id,
                ExternalAccountCompleteVerificationParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /api/external_accounts/{id}/verify`, but is
         * otherwise the same as [ExternalAccountServiceAsync.verify].
         */
        @MustBeClosed
        fun verify(
            id: String,
            params: ExternalAccountVerifyParams,
        ): CompletableFuture<HttpResponseFor<ExternalAccountVerifyResponse>> =
            verify(id, params, RequestOptions.none())

        /** @see [verify] */
        @MustBeClosed
        fun verify(
            id: String,
            params: ExternalAccountVerifyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalAccountVerifyResponse>> =
            verify(params.toBuilder().id(id).build(), requestOptions)

        /** @see [verify] */
        @MustBeClosed
        fun verify(
            params: ExternalAccountVerifyParams
        ): CompletableFuture<HttpResponseFor<ExternalAccountVerifyResponse>> =
            verify(params, RequestOptions.none())

        /** @see [verify] */
        @MustBeClosed
        fun verify(
            params: ExternalAccountVerifyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalAccountVerifyResponse>>
    }
}
