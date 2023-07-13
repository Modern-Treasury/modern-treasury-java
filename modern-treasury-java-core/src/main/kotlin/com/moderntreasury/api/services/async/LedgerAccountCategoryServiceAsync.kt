@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.LedgerAccountCategory
import com.moderntreasury.api.models.LedgerAccountCategoryAddLedgerAccountParams
import com.moderntreasury.api.models.LedgerAccountCategoryAddNestedCategoryParams
import com.moderntreasury.api.models.LedgerAccountCategoryCreateParams
import com.moderntreasury.api.models.LedgerAccountCategoryDeleteParams
import com.moderntreasury.api.models.LedgerAccountCategoryListPageAsync
import com.moderntreasury.api.models.LedgerAccountCategoryListParams
import com.moderntreasury.api.models.LedgerAccountCategoryRemoveLedgerAccountParams
import com.moderntreasury.api.models.LedgerAccountCategoryRemoveNestedCategoryParams
import com.moderntreasury.api.models.LedgerAccountCategoryRetrieveParams
import com.moderntreasury.api.models.LedgerAccountCategoryUpdateParams
import java.util.concurrent.CompletableFuture

interface LedgerAccountCategoryServiceAsync {

    /** Create a ledger account category. */
    @JvmOverloads
    fun create(
        params: LedgerAccountCategoryCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<LedgerAccountCategory>

    /** Get the details on a single ledger account category. */
    @JvmOverloads
    fun retrieve(
        params: LedgerAccountCategoryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<LedgerAccountCategory>

    /** Update the details of a ledger account category. */
    @JvmOverloads
    fun update(
        params: LedgerAccountCategoryUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<LedgerAccountCategory>

    /** Get a list of ledger account categories. */
    @JvmOverloads
    fun list(
        params: LedgerAccountCategoryListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<LedgerAccountCategoryListPageAsync>

    /** Delete a ledger account category. */
    @JvmOverloads
    fun delete(
        params: LedgerAccountCategoryDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<LedgerAccountCategory>

    /** Add a ledger account category to an account. */
    @JvmOverloads
    fun addLedgerAccount(
        params: LedgerAccountCategoryAddLedgerAccountParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Void>

    /** Add a ledger account category to a ledger account category. */
    @JvmOverloads
    fun addNestedCategory(
        params: LedgerAccountCategoryAddNestedCategoryParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Void>

    /** Delete a ledger account category from an account. */
    @JvmOverloads
    fun removeLedgerAccount(
        params: LedgerAccountCategoryRemoveLedgerAccountParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Void>

    /** Delete a ledger account category from a ledger account category. */
    @JvmOverloads
    fun removeNestedCategory(
        params: LedgerAccountCategoryRemoveNestedCategoryParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Void>
}
