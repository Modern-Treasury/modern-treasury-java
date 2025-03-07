// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.VirtualAccount
import com.moderntreasury.api.models.VirtualAccountCreateParams
import com.moderntreasury.api.models.VirtualAccountDeleteParams
import com.moderntreasury.api.models.VirtualAccountListPageAsync
import com.moderntreasury.api.models.VirtualAccountListParams
import com.moderntreasury.api.models.VirtualAccountRetrieveParams
import com.moderntreasury.api.models.VirtualAccountUpdateParams
import java.util.concurrent.CompletableFuture

interface VirtualAccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** create virtual_account */
    fun create(params: VirtualAccountCreateParams): CompletableFuture<VirtualAccount> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: VirtualAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VirtualAccount>

    /** get virtual_account */
    fun retrieve(params: VirtualAccountRetrieveParams): CompletableFuture<VirtualAccount> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: VirtualAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VirtualAccount>

    /** update virtual_account */
    fun update(params: VirtualAccountUpdateParams): CompletableFuture<VirtualAccount> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: VirtualAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VirtualAccount>

    /** Get a list of virtual accounts. */
    fun list(): CompletableFuture<VirtualAccountListPageAsync> =
        list(VirtualAccountListParams.none())

    /** @see [list] */
    fun list(
        params: VirtualAccountListParams = VirtualAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VirtualAccountListPageAsync>

    /** @see [list] */
    fun list(
        params: VirtualAccountListParams = VirtualAccountListParams.none()
    ): CompletableFuture<VirtualAccountListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<VirtualAccountListPageAsync> =
        list(VirtualAccountListParams.none(), requestOptions)

    /** delete virtual_account */
    fun delete(params: VirtualAccountDeleteParams): CompletableFuture<VirtualAccount> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: VirtualAccountDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VirtualAccount>

    /**
     * A view of [VirtualAccountServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/virtual_accounts`, but is otherwise the same
         * as [VirtualAccountServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: VirtualAccountCreateParams
        ): CompletableFuture<HttpResponseFor<VirtualAccount>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: VirtualAccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VirtualAccount>>

        /**
         * Returns a raw HTTP response for `get /api/virtual_accounts/{id}`, but is otherwise the
         * same as [VirtualAccountServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: VirtualAccountRetrieveParams
        ): CompletableFuture<HttpResponseFor<VirtualAccount>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: VirtualAccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VirtualAccount>>

        /**
         * Returns a raw HTTP response for `patch /api/virtual_accounts/{id}`, but is otherwise the
         * same as [VirtualAccountServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: VirtualAccountUpdateParams
        ): CompletableFuture<HttpResponseFor<VirtualAccount>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: VirtualAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VirtualAccount>>

        /**
         * Returns a raw HTTP response for `get /api/virtual_accounts`, but is otherwise the same as
         * [VirtualAccountServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<VirtualAccountListPageAsync>> =
            list(VirtualAccountListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: VirtualAccountListParams = VirtualAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VirtualAccountListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: VirtualAccountListParams = VirtualAccountListParams.none()
        ): CompletableFuture<HttpResponseFor<VirtualAccountListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<VirtualAccountListPageAsync>> =
            list(VirtualAccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/virtual_accounts/{id}`, but is otherwise the
         * same as [VirtualAccountServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(
            params: VirtualAccountDeleteParams
        ): CompletableFuture<HttpResponseFor<VirtualAccount>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: VirtualAccountDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VirtualAccount>>
    }
}
