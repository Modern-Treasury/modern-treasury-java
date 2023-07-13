@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async.internalAccounts

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.BalanceReport
import com.moderntreasury.api.models.BalanceReportListPageAsync
import com.moderntreasury.api.models.BalanceReportListParams
import com.moderntreasury.api.models.BalanceReportRetrieveParams
import java.util.concurrent.CompletableFuture

interface BalanceReportServiceAsync {

    /** Get a single balance report for a given internal account. */
    @JvmOverloads
    fun retrieve(
        params: BalanceReportRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<BalanceReport>

    /** Get all balance reports for a given internal account. */
    @JvmOverloads
    fun list(
        params: BalanceReportListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<BalanceReportListPageAsync>
}
