// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.AccountDetail
import com.moderntreasury.api.models.AccountDetailCreateParams
import com.moderntreasury.api.models.AccountDetailDeleteParams
import com.moderntreasury.api.models.AccountDetailListPageAsync
import com.moderntreasury.api.models.AccountDetailListParams
import com.moderntreasury.api.models.AccountDetailRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AccountDetailServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountDetailServiceAsync

    /** Create an account detail for an external account. */
    fun create(
        accountId: String,
        params: AccountDetailCreateParams,
    ): CompletableFuture<AccountDetail> = create(accountId, params, RequestOptions.none())

    /** @see [create] */
    fun create(
        accountId: String,
        params: AccountDetailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountDetail> =
        create(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see [create] */
    fun create(params: AccountDetailCreateParams): CompletableFuture<AccountDetail> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: AccountDetailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountDetail>

    /** Get a single account detail for a single internal or external account. */
    fun retrieve(
        id: String,
        params: AccountDetailRetrieveParams,
    ): CompletableFuture<AccountDetail> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: AccountDetailRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountDetail> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(params: AccountDetailRetrieveParams): CompletableFuture<AccountDetail> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: AccountDetailRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountDetail>

    /** Get a list of account details for a single internal or external account. */
    fun list(
        accountId: String,
        params: AccountDetailListParams,
    ): CompletableFuture<AccountDetailListPageAsync> =
        list(accountId, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        accountId: String,
        params: AccountDetailListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountDetailListPageAsync> =
        list(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see [list] */
    fun list(params: AccountDetailListParams): CompletableFuture<AccountDetailListPageAsync> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: AccountDetailListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountDetailListPageAsync>

    /** Delete a single account detail for an external account. */
    fun delete(id: String, params: AccountDetailDeleteParams): CompletableFuture<Void?> =
        delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: AccountDetailDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(params: AccountDetailDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: AccountDetailDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [AccountDetailServiceAsync] that provides access to raw HTTP responses for each
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
        ): AccountDetailServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/{accounts_type}/{account_id}/account_details`,
         * but is otherwise the same as [AccountDetailServiceAsync.create].
         */
        fun create(
            accountId: String,
            params: AccountDetailCreateParams,
        ): CompletableFuture<HttpResponseFor<AccountDetail>> =
            create(accountId, params, RequestOptions.none())

        /** @see [create] */
        fun create(
            accountId: String,
            params: AccountDetailCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountDetail>> =
            create(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see [create] */
        fun create(
            params: AccountDetailCreateParams
        ): CompletableFuture<HttpResponseFor<AccountDetail>> = create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: AccountDetailCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountDetail>>

        /**
         * Returns a raw HTTP response for `get
         * /api/{accounts_type}/{account_id}/account_details/{id}`, but is otherwise the same as
         * [AccountDetailServiceAsync.retrieve].
         */
        fun retrieve(
            id: String,
            params: AccountDetailRetrieveParams,
        ): CompletableFuture<HttpResponseFor<AccountDetail>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: AccountDetailRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountDetail>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            params: AccountDetailRetrieveParams
        ): CompletableFuture<HttpResponseFor<AccountDetail>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: AccountDetailRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountDetail>>

        /**
         * Returns a raw HTTP response for `get /api/{accounts_type}/{account_id}/account_details`,
         * but is otherwise the same as [AccountDetailServiceAsync.list].
         */
        fun list(
            accountId: String,
            params: AccountDetailListParams,
        ): CompletableFuture<HttpResponseFor<AccountDetailListPageAsync>> =
            list(accountId, params, RequestOptions.none())

        /** @see [list] */
        fun list(
            accountId: String,
            params: AccountDetailListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountDetailListPageAsync>> =
            list(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see [list] */
        fun list(
            params: AccountDetailListParams
        ): CompletableFuture<HttpResponseFor<AccountDetailListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            params: AccountDetailListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountDetailListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete
         * /api/{accounts_type}/{account_id}/account_details/{id}`, but is otherwise the same as
         * [AccountDetailServiceAsync.delete].
         */
        fun delete(id: String, params: AccountDetailDeleteParams): CompletableFuture<HttpResponse> =
            delete(id, params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            id: String,
            params: AccountDetailDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        fun delete(params: AccountDetailDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            params: AccountDetailDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
