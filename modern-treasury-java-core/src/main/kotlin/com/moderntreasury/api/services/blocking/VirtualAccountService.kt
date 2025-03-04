// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.VirtualAccount
import com.moderntreasury.api.models.VirtualAccountCreateParams
import com.moderntreasury.api.models.VirtualAccountDeleteParams
import com.moderntreasury.api.models.VirtualAccountListPage
import com.moderntreasury.api.models.VirtualAccountListParams
import com.moderntreasury.api.models.VirtualAccountRetrieveParams
import com.moderntreasury.api.models.VirtualAccountUpdateParams

interface VirtualAccountService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** create virtual_account */
    @JvmOverloads
    fun create(
        params: VirtualAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VirtualAccount

    /** get virtual_account */
    @JvmOverloads
    fun retrieve(
        params: VirtualAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VirtualAccount

    /** update virtual_account */
    @JvmOverloads
    fun update(
        params: VirtualAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VirtualAccount

    /** Get a list of virtual accounts. */
    @JvmOverloads
    fun list(
        params: VirtualAccountListParams = VirtualAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VirtualAccountListPage

    /** Get a list of virtual accounts. */
    fun list(requestOptions: RequestOptions): VirtualAccountListPage =
        list(VirtualAccountListParams.none(), requestOptions)

    /** delete virtual_account */
    @JvmOverloads
    fun delete(
        params: VirtualAccountDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VirtualAccount

    /**
     * A view of [VirtualAccountService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/virtual_accounts`, but is otherwise the same
         * as [VirtualAccountService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: VirtualAccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VirtualAccount>

        /**
         * Returns a raw HTTP response for `get /api/virtual_accounts/{id}`, but is otherwise the
         * same as [VirtualAccountService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: VirtualAccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VirtualAccount>

        /**
         * Returns a raw HTTP response for `patch /api/virtual_accounts/{id}`, but is otherwise the
         * same as [VirtualAccountService.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: VirtualAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VirtualAccount>

        /**
         * Returns a raw HTTP response for `get /api/virtual_accounts`, but is otherwise the same as
         * [VirtualAccountService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: VirtualAccountListParams = VirtualAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VirtualAccountListPage>

        /**
         * Returns a raw HTTP response for `get /api/virtual_accounts`, but is otherwise the same as
         * [VirtualAccountService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<VirtualAccountListPage> =
            list(VirtualAccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/virtual_accounts/{id}`, but is otherwise the
         * same as [VirtualAccountService.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: VirtualAccountDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VirtualAccount>
    }
}
