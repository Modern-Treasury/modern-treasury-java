// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.InternalAccount
import com.moderntreasury.api.models.InternalAccountCreateParams
import com.moderntreasury.api.models.InternalAccountListPageAsync
import com.moderntreasury.api.models.InternalAccountListParams
import com.moderntreasury.api.models.InternalAccountRequestClosureParams
import com.moderntreasury.api.models.InternalAccountRetrieveParams
import com.moderntreasury.api.models.InternalAccountUpdateAccountCapabilityParams
import com.moderntreasury.api.models.InternalAccountUpdateAccountCapabilityResponse
import com.moderntreasury.api.models.InternalAccountUpdateParams
import com.moderntreasury.api.services.async.internalAccounts.BalanceReportServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface InternalAccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InternalAccountServiceAsync

    fun balanceReports(): BalanceReportServiceAsync

    /** create internal account */
    fun create(params: InternalAccountCreateParams): CompletableFuture<InternalAccount> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: InternalAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InternalAccount>

    /** get internal account */
    fun retrieve(id: String): CompletableFuture<InternalAccount> =
        retrieve(id, InternalAccountRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: InternalAccountRetrieveParams = InternalAccountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InternalAccount> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: InternalAccountRetrieveParams = InternalAccountRetrieveParams.none(),
    ): CompletableFuture<InternalAccount> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: InternalAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InternalAccount>

    /** @see retrieve */
    fun retrieve(params: InternalAccountRetrieveParams): CompletableFuture<InternalAccount> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<InternalAccount> =
        retrieve(id, InternalAccountRetrieveParams.none(), requestOptions)

    /** update internal account */
    fun update(id: String): CompletableFuture<InternalAccount> =
        update(id, InternalAccountUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: InternalAccountUpdateParams = InternalAccountUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InternalAccount> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: InternalAccountUpdateParams = InternalAccountUpdateParams.none(),
    ): CompletableFuture<InternalAccount> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: InternalAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InternalAccount>

    /** @see update */
    fun update(params: InternalAccountUpdateParams): CompletableFuture<InternalAccount> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): CompletableFuture<InternalAccount> =
        update(id, InternalAccountUpdateParams.none(), requestOptions)

    /** list internal accounts */
    fun list(): CompletableFuture<InternalAccountListPageAsync> =
        list(InternalAccountListParams.none())

    /** @see list */
    fun list(
        params: InternalAccountListParams = InternalAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InternalAccountListPageAsync>

    /** @see list */
    fun list(
        params: InternalAccountListParams = InternalAccountListParams.none()
    ): CompletableFuture<InternalAccountListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<InternalAccountListPageAsync> =
        list(InternalAccountListParams.none(), requestOptions)

    /** request closure of internal account */
    fun requestClosure(id: String): CompletableFuture<InternalAccount> =
        requestClosure(id, InternalAccountRequestClosureParams.none())

    /** @see requestClosure */
    fun requestClosure(
        id: String,
        params: InternalAccountRequestClosureParams = InternalAccountRequestClosureParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InternalAccount> =
        requestClosure(params.toBuilder().id(id).build(), requestOptions)

    /** @see requestClosure */
    fun requestClosure(
        id: String,
        params: InternalAccountRequestClosureParams = InternalAccountRequestClosureParams.none(),
    ): CompletableFuture<InternalAccount> = requestClosure(id, params, RequestOptions.none())

    /** @see requestClosure */
    fun requestClosure(
        params: InternalAccountRequestClosureParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InternalAccount>

    /** @see requestClosure */
    fun requestClosure(
        params: InternalAccountRequestClosureParams
    ): CompletableFuture<InternalAccount> = requestClosure(params, RequestOptions.none())

    /** @see requestClosure */
    fun requestClosure(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InternalAccount> =
        requestClosure(id, InternalAccountRequestClosureParams.none(), requestOptions)

    /** update account_capability */
    fun updateAccountCapability(
        id: String,
        params: InternalAccountUpdateAccountCapabilityParams,
    ): CompletableFuture<InternalAccountUpdateAccountCapabilityResponse> =
        updateAccountCapability(id, params, RequestOptions.none())

    /** @see updateAccountCapability */
    fun updateAccountCapability(
        id: String,
        params: InternalAccountUpdateAccountCapabilityParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InternalAccountUpdateAccountCapabilityResponse> =
        updateAccountCapability(params.toBuilder().id(id).build(), requestOptions)

    /** @see updateAccountCapability */
    fun updateAccountCapability(
        params: InternalAccountUpdateAccountCapabilityParams
    ): CompletableFuture<InternalAccountUpdateAccountCapabilityResponse> =
        updateAccountCapability(params, RequestOptions.none())

    /** @see updateAccountCapability */
    fun updateAccountCapability(
        params: InternalAccountUpdateAccountCapabilityParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InternalAccountUpdateAccountCapabilityResponse>

    /**
     * A view of [InternalAccountServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InternalAccountServiceAsync.WithRawResponse

        fun balanceReports(): BalanceReportServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/internal_accounts`, but is otherwise the same
         * as [InternalAccountServiceAsync.create].
         */
        fun create(
            params: InternalAccountCreateParams
        ): CompletableFuture<HttpResponseFor<InternalAccount>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: InternalAccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InternalAccount>>

        /**
         * Returns a raw HTTP response for `get /api/internal_accounts/{id}`, but is otherwise the
         * same as [InternalAccountServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<InternalAccount>> =
            retrieve(id, InternalAccountRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: InternalAccountRetrieveParams = InternalAccountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InternalAccount>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: InternalAccountRetrieveParams = InternalAccountRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<InternalAccount>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: InternalAccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InternalAccount>>

        /** @see retrieve */
        fun retrieve(
            params: InternalAccountRetrieveParams
        ): CompletableFuture<HttpResponseFor<InternalAccount>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InternalAccount>> =
            retrieve(id, InternalAccountRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/internal_accounts/{id}`, but is otherwise the
         * same as [InternalAccountServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<InternalAccount>> =
            update(id, InternalAccountUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: InternalAccountUpdateParams = InternalAccountUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InternalAccount>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: InternalAccountUpdateParams = InternalAccountUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<InternalAccount>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: InternalAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InternalAccount>>

        /** @see update */
        fun update(
            params: InternalAccountUpdateParams
        ): CompletableFuture<HttpResponseFor<InternalAccount>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InternalAccount>> =
            update(id, InternalAccountUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/internal_accounts`, but is otherwise the same
         * as [InternalAccountServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<InternalAccountListPageAsync>> =
            list(InternalAccountListParams.none())

        /** @see list */
        fun list(
            params: InternalAccountListParams = InternalAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InternalAccountListPageAsync>>

        /** @see list */
        fun list(
            params: InternalAccountListParams = InternalAccountListParams.none()
        ): CompletableFuture<HttpResponseFor<InternalAccountListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InternalAccountListPageAsync>> =
            list(InternalAccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/internal_accounts/{id}/request_closure`, but
         * is otherwise the same as [InternalAccountServiceAsync.requestClosure].
         */
        fun requestClosure(id: String): CompletableFuture<HttpResponseFor<InternalAccount>> =
            requestClosure(id, InternalAccountRequestClosureParams.none())

        /** @see requestClosure */
        fun requestClosure(
            id: String,
            params: InternalAccountRequestClosureParams =
                InternalAccountRequestClosureParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InternalAccount>> =
            requestClosure(params.toBuilder().id(id).build(), requestOptions)

        /** @see requestClosure */
        fun requestClosure(
            id: String,
            params: InternalAccountRequestClosureParams = InternalAccountRequestClosureParams.none(),
        ): CompletableFuture<HttpResponseFor<InternalAccount>> =
            requestClosure(id, params, RequestOptions.none())

        /** @see requestClosure */
        fun requestClosure(
            params: InternalAccountRequestClosureParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InternalAccount>>

        /** @see requestClosure */
        fun requestClosure(
            params: InternalAccountRequestClosureParams
        ): CompletableFuture<HttpResponseFor<InternalAccount>> =
            requestClosure(params, RequestOptions.none())

        /** @see requestClosure */
        fun requestClosure(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InternalAccount>> =
            requestClosure(id, InternalAccountRequestClosureParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch
         * /api/internal_accounts/{internal_account_id}/account_capabilities/{id}`, but is otherwise
         * the same as [InternalAccountServiceAsync.updateAccountCapability].
         */
        fun updateAccountCapability(
            id: String,
            params: InternalAccountUpdateAccountCapabilityParams,
        ): CompletableFuture<HttpResponseFor<InternalAccountUpdateAccountCapabilityResponse>> =
            updateAccountCapability(id, params, RequestOptions.none())

        /** @see updateAccountCapability */
        fun updateAccountCapability(
            id: String,
            params: InternalAccountUpdateAccountCapabilityParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InternalAccountUpdateAccountCapabilityResponse>> =
            updateAccountCapability(params.toBuilder().id(id).build(), requestOptions)

        /** @see updateAccountCapability */
        fun updateAccountCapability(
            params: InternalAccountUpdateAccountCapabilityParams
        ): CompletableFuture<HttpResponseFor<InternalAccountUpdateAccountCapabilityResponse>> =
            updateAccountCapability(params, RequestOptions.none())

        /** @see updateAccountCapability */
        fun updateAccountCapability(
            params: InternalAccountUpdateAccountCapabilityParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InternalAccountUpdateAccountCapabilityResponse>>
    }
}
