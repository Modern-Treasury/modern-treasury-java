// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
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
import java.util.function.Consumer

interface VirtualAccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VirtualAccountServiceAsync

    /** create virtual_account */
    fun create(params: VirtualAccountCreateParams): CompletableFuture<VirtualAccount> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: VirtualAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VirtualAccount>

    /** get virtual_account */
    fun retrieve(id: String): CompletableFuture<VirtualAccount> =
        retrieve(id, VirtualAccountRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: VirtualAccountRetrieveParams = VirtualAccountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VirtualAccount> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: VirtualAccountRetrieveParams = VirtualAccountRetrieveParams.none(),
    ): CompletableFuture<VirtualAccount> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: VirtualAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VirtualAccount>

    /** @see [retrieve] */
    fun retrieve(params: VirtualAccountRetrieveParams): CompletableFuture<VirtualAccount> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<VirtualAccount> =
        retrieve(id, VirtualAccountRetrieveParams.none(), requestOptions)

    /** update virtual_account */
    fun update(id: String): CompletableFuture<VirtualAccount> =
        update(id, VirtualAccountUpdateParams.none())

    /** @see [update] */
    fun update(
        id: String,
        params: VirtualAccountUpdateParams = VirtualAccountUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VirtualAccount> = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(
        id: String,
        params: VirtualAccountUpdateParams = VirtualAccountUpdateParams.none(),
    ): CompletableFuture<VirtualAccount> = update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: VirtualAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VirtualAccount>

    /** @see [update] */
    fun update(params: VirtualAccountUpdateParams): CompletableFuture<VirtualAccount> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(id: String, requestOptions: RequestOptions): CompletableFuture<VirtualAccount> =
        update(id, VirtualAccountUpdateParams.none(), requestOptions)

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
    fun delete(id: String): CompletableFuture<VirtualAccount> =
        delete(id, VirtualAccountDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: VirtualAccountDeleteParams = VirtualAccountDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VirtualAccount> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        id: String,
        params: VirtualAccountDeleteParams = VirtualAccountDeleteParams.none(),
    ): CompletableFuture<VirtualAccount> = delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: VirtualAccountDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VirtualAccount>

    /** @see [delete] */
    fun delete(params: VirtualAccountDeleteParams): CompletableFuture<VirtualAccount> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<VirtualAccount> =
        delete(id, VirtualAccountDeleteParams.none(), requestOptions)

    /**
     * A view of [VirtualAccountServiceAsync] that provides access to raw HTTP responses for each
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
        ): VirtualAccountServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/virtual_accounts`, but is otherwise the same
         * as [VirtualAccountServiceAsync.create].
         */
        fun create(
            params: VirtualAccountCreateParams
        ): CompletableFuture<HttpResponseFor<VirtualAccount>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: VirtualAccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VirtualAccount>>

        /**
         * Returns a raw HTTP response for `get /api/virtual_accounts/{id}`, but is otherwise the
         * same as [VirtualAccountServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<VirtualAccount>> =
            retrieve(id, VirtualAccountRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: VirtualAccountRetrieveParams = VirtualAccountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VirtualAccount>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: VirtualAccountRetrieveParams = VirtualAccountRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<VirtualAccount>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: VirtualAccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VirtualAccount>>

        /** @see [retrieve] */
        fun retrieve(
            params: VirtualAccountRetrieveParams
        ): CompletableFuture<HttpResponseFor<VirtualAccount>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VirtualAccount>> =
            retrieve(id, VirtualAccountRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/virtual_accounts/{id}`, but is otherwise the
         * same as [VirtualAccountServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<VirtualAccount>> =
            update(id, VirtualAccountUpdateParams.none())

        /** @see [update] */
        fun update(
            id: String,
            params: VirtualAccountUpdateParams = VirtualAccountUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VirtualAccount>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        fun update(
            id: String,
            params: VirtualAccountUpdateParams = VirtualAccountUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<VirtualAccount>> =
            update(id, params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: VirtualAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VirtualAccount>>

        /** @see [update] */
        fun update(
            params: VirtualAccountUpdateParams
        ): CompletableFuture<HttpResponseFor<VirtualAccount>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VirtualAccount>> =
            update(id, VirtualAccountUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/virtual_accounts`, but is otherwise the same as
         * [VirtualAccountServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<VirtualAccountListPageAsync>> =
            list(VirtualAccountListParams.none())

        /** @see [list] */
        fun list(
            params: VirtualAccountListParams = VirtualAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VirtualAccountListPageAsync>>

        /** @see [list] */
        fun list(
            params: VirtualAccountListParams = VirtualAccountListParams.none()
        ): CompletableFuture<HttpResponseFor<VirtualAccountListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<VirtualAccountListPageAsync>> =
            list(VirtualAccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/virtual_accounts/{id}`, but is otherwise the
         * same as [VirtualAccountServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<VirtualAccount>> =
            delete(id, VirtualAccountDeleteParams.none())

        /** @see [delete] */
        fun delete(
            id: String,
            params: VirtualAccountDeleteParams = VirtualAccountDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VirtualAccount>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        fun delete(
            id: String,
            params: VirtualAccountDeleteParams = VirtualAccountDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<VirtualAccount>> =
            delete(id, params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            params: VirtualAccountDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VirtualAccount>>

        /** @see [delete] */
        fun delete(
            params: VirtualAccountDeleteParams
        ): CompletableFuture<HttpResponseFor<VirtualAccount>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VirtualAccount>> =
            delete(id, VirtualAccountDeleteParams.none(), requestOptions)
    }
}
