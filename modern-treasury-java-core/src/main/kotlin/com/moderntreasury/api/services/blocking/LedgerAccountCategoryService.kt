// File generated from our OpenAPI spec by Stainless.

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
    fun create(params: LedgerAccountCategoryCreateParams): LedgerAccountCategory =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: LedgerAccountCategoryCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountCategory

    /** Get the details on a single ledger account category. */
    fun retrieve(params: LedgerAccountCategoryRetrieveParams): LedgerAccountCategory =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: LedgerAccountCategoryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountCategory

    /** Update the details of a ledger account category. */
    fun update(params: LedgerAccountCategoryUpdateParams): LedgerAccountCategory =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: LedgerAccountCategoryUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountCategory

    /** Get a list of ledger account categories. */
    fun list(): LedgerAccountCategoryListPage = list(LedgerAccountCategoryListParams.none())

    /** @see [list] */
    fun list(
        params: LedgerAccountCategoryListParams = LedgerAccountCategoryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountCategoryListPage

    /** @see [list] */
    fun list(
        params: LedgerAccountCategoryListParams = LedgerAccountCategoryListParams.none()
    ): LedgerAccountCategoryListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): LedgerAccountCategoryListPage =
        list(LedgerAccountCategoryListParams.none(), requestOptions)

    /** Delete a ledger account category. */
    fun delete(params: LedgerAccountCategoryDeleteParams): LedgerAccountCategory =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: LedgerAccountCategoryDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountCategory

    /** Add a ledger account to a ledger account category. */
    fun addLedgerAccount(params: LedgerAccountCategoryAddLedgerAccountParams) =
        addLedgerAccount(params, RequestOptions.none())

    /** @see [addLedgerAccount] */
    fun addLedgerAccount(
        params: LedgerAccountCategoryAddLedgerAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Add a ledger account category to a ledger account category. */
    fun addNestedCategory(params: LedgerAccountCategoryAddNestedCategoryParams) =
        addNestedCategory(params, RequestOptions.none())

    /** @see [addNestedCategory] */
    fun addNestedCategory(
        params: LedgerAccountCategoryAddNestedCategoryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Remove a ledger account from a ledger account category. */
    fun removeLedgerAccount(params: LedgerAccountCategoryRemoveLedgerAccountParams) =
        removeLedgerAccount(params, RequestOptions.none())

    /** @see [removeLedgerAccount] */
    fun removeLedgerAccount(
        params: LedgerAccountCategoryRemoveLedgerAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Delete a ledger account category from a ledger account category. */
    fun removeNestedCategory(params: LedgerAccountCategoryRemoveNestedCategoryParams) =
        removeNestedCategory(params, RequestOptions.none())

    /** @see [removeNestedCategory] */
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
        @MustBeClosed
        fun create(
            params: LedgerAccountCategoryCreateParams
        ): HttpResponseFor<LedgerAccountCategory> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: LedgerAccountCategoryCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountCategory>

        /**
         * Returns a raw HTTP response for `get /api/ledger_account_categories/{id}`, but is
         * otherwise the same as [LedgerAccountCategoryService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: LedgerAccountCategoryRetrieveParams
        ): HttpResponseFor<LedgerAccountCategory> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: LedgerAccountCategoryRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountCategory>

        /**
         * Returns a raw HTTP response for `patch /api/ledger_account_categories/{id}`, but is
         * otherwise the same as [LedgerAccountCategoryService.update].
         */
        @MustBeClosed
        fun update(
            params: LedgerAccountCategoryUpdateParams
        ): HttpResponseFor<LedgerAccountCategory> = update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: LedgerAccountCategoryUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountCategory>

        /**
         * Returns a raw HTTP response for `get /api/ledger_account_categories`, but is otherwise
         * the same as [LedgerAccountCategoryService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<LedgerAccountCategoryListPage> =
            list(LedgerAccountCategoryListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: LedgerAccountCategoryListParams = LedgerAccountCategoryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountCategoryListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: LedgerAccountCategoryListParams = LedgerAccountCategoryListParams.none()
        ): HttpResponseFor<LedgerAccountCategoryListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<LedgerAccountCategoryListPage> =
            list(LedgerAccountCategoryListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/ledger_account_categories/{id}`, but is
         * otherwise the same as [LedgerAccountCategoryService.delete].
         */
        @MustBeClosed
        fun delete(
            params: LedgerAccountCategoryDeleteParams
        ): HttpResponseFor<LedgerAccountCategory> = delete(params, RequestOptions.none())

        /** @see [delete] */
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
        @MustBeClosed
        fun addLedgerAccount(params: LedgerAccountCategoryAddLedgerAccountParams): HttpResponse =
            addLedgerAccount(params, RequestOptions.none())

        /** @see [addLedgerAccount] */
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
        @MustBeClosed
        fun addNestedCategory(params: LedgerAccountCategoryAddNestedCategoryParams): HttpResponse =
            addNestedCategory(params, RequestOptions.none())

        /** @see [addNestedCategory] */
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
        @MustBeClosed
        fun removeLedgerAccount(
            params: LedgerAccountCategoryRemoveLedgerAccountParams
        ): HttpResponse = removeLedgerAccount(params, RequestOptions.none())

        /** @see [removeLedgerAccount] */
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
        @MustBeClosed
        fun removeNestedCategory(
            params: LedgerAccountCategoryRemoveNestedCategoryParams
        ): HttpResponse = removeNestedCategory(params, RequestOptions.none())

        /** @see [removeNestedCategory] */
        @MustBeClosed
        fun removeNestedCategory(
            params: LedgerAccountCategoryRemoveNestedCategoryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
