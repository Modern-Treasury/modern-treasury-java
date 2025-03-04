// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.LedgerAccountCategory
import com.moderntreasury.api.models.LedgerAccountCategoryAddLedgerAccountParams
import com.moderntreasury.api.models.LedgerAccountCategoryAddNestedCategoryParams
import com.moderntreasury.api.models.LedgerAccountCategoryCreateParams
import com.moderntreasury.api.models.LedgerAccountCategoryDeleteParams
import com.moderntreasury.api.models.LedgerAccountCategoryListPage
import com.moderntreasury.api.models.LedgerAccountCategoryListParams
import com.moderntreasury.api.models.LedgerAccountCategoryRemoveLedgerAccountParams
import com.moderntreasury.api.models.LedgerAccountCategoryRemoveNestedCategoryParams
import com.moderntreasury.api.models.LedgerAccountCategoryRetrieveParams
import com.moderntreasury.api.models.LedgerAccountCategoryUpdateParams

interface LedgerAccountCategoryService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a ledger account category. */
    @JvmOverloads
    fun create(
        params: LedgerAccountCategoryCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountCategory

    /** Get the details on a single ledger account category. */
    @JvmOverloads
    fun retrieve(
        params: LedgerAccountCategoryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountCategory

    /** Update the details of a ledger account category. */
    @JvmOverloads
    fun update(
        params: LedgerAccountCategoryUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountCategory

    /** Get a list of ledger account categories. */
    @JvmOverloads
    fun list(
        params: LedgerAccountCategoryListParams = LedgerAccountCategoryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountCategoryListPage

    /** Get a list of ledger account categories. */
    fun list(requestOptions: RequestOptions): LedgerAccountCategoryListPage =
        list(LedgerAccountCategoryListParams.none(), requestOptions)

    /** Delete a ledger account category. */
    @JvmOverloads
    fun delete(
        params: LedgerAccountCategoryDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountCategory

    /** Add a ledger account to a ledger account category. */
    @JvmOverloads
    fun addLedgerAccount(
        params: LedgerAccountCategoryAddLedgerAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Add a ledger account category to a ledger account category. */
    @JvmOverloads
    fun addNestedCategory(
        params: LedgerAccountCategoryAddNestedCategoryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Remove a ledger account from a ledger account category. */
    @JvmOverloads
    fun removeLedgerAccount(
        params: LedgerAccountCategoryRemoveLedgerAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Delete a ledger account category from a ledger account category. */
    @JvmOverloads
    fun removeNestedCategory(
        params: LedgerAccountCategoryRemoveNestedCategoryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [LedgerAccountCategoryService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/ledger_account_categories`, but is otherwise
         * the same as [LedgerAccountCategoryService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: LedgerAccountCategoryCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountCategory>

        /**
         * Returns a raw HTTP response for `get /api/ledger_account_categories/{id}`, but is
         * otherwise the same as [LedgerAccountCategoryService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: LedgerAccountCategoryRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountCategory>

        /**
         * Returns a raw HTTP response for `patch /api/ledger_account_categories/{id}`, but is
         * otherwise the same as [LedgerAccountCategoryService.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: LedgerAccountCategoryUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountCategory>

        /**
         * Returns a raw HTTP response for `get /api/ledger_account_categories`, but is otherwise
         * the same as [LedgerAccountCategoryService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: LedgerAccountCategoryListParams = LedgerAccountCategoryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountCategoryListPage>

        /**
         * Returns a raw HTTP response for `get /api/ledger_account_categories`, but is otherwise
         * the same as [LedgerAccountCategoryService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<LedgerAccountCategoryListPage> =
            list(LedgerAccountCategoryListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/ledger_account_categories/{id}`, but is
         * otherwise the same as [LedgerAccountCategoryService.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: LedgerAccountCategoryDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountCategory>

        /**
         * Returns a raw HTTP response for `put
         * /api/ledger_account_categories/{id}/ledger_accounts/{ledger_account_id}`, but is
         * otherwise the same as [LedgerAccountCategoryService.addLedgerAccount].
         */
        @JvmOverloads
        @MustBeClosed
        fun addLedgerAccount(
            params: LedgerAccountCategoryAddLedgerAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put
         * /api/ledger_account_categories/{id}/ledger_account_categories/{sub_category_id}`, but is
         * otherwise the same as [LedgerAccountCategoryService.addNestedCategory].
         */
        @JvmOverloads
        @MustBeClosed
        fun addNestedCategory(
            params: LedgerAccountCategoryAddNestedCategoryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `delete
         * /api/ledger_account_categories/{id}/ledger_accounts/{ledger_account_id}`, but is
         * otherwise the same as [LedgerAccountCategoryService.removeLedgerAccount].
         */
        @JvmOverloads
        @MustBeClosed
        fun removeLedgerAccount(
            params: LedgerAccountCategoryRemoveLedgerAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `delete
         * /api/ledger_account_categories/{id}/ledger_account_categories/{sub_category_id}`, but is
         * otherwise the same as [LedgerAccountCategoryService.removeNestedCategory].
         */
        @JvmOverloads
        @MustBeClosed
        fun removeNestedCategory(
            params: LedgerAccountCategoryRemoveNestedCategoryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
