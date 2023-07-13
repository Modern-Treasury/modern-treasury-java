@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.InternalAccount
import com.moderntreasury.api.models.InternalAccountCreateParams
import com.moderntreasury.api.models.InternalAccountListPageAsync
import com.moderntreasury.api.models.InternalAccountListParams
import com.moderntreasury.api.models.InternalAccountRetrieveParams
import com.moderntreasury.api.models.InternalAccountUpdateParams
import com.moderntreasury.api.services.async.internalAccounts.BalanceReportServiceAsync
import java.util.concurrent.CompletableFuture

interface InternalAccountServiceAsync {

    fun balanceReports(): BalanceReportServiceAsync

    /** create internal account */
    @JvmOverloads
    fun create(
        params: InternalAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<InternalAccount>

    /** get internal account */
    @JvmOverloads
    fun retrieve(
        params: InternalAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<InternalAccount>

    /** update internal account */
    @JvmOverloads
    fun update(
        params: InternalAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<InternalAccount>

    /** list internal accounts */
    @JvmOverloads
    fun list(
        params: InternalAccountListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<InternalAccountListPageAsync>
}
