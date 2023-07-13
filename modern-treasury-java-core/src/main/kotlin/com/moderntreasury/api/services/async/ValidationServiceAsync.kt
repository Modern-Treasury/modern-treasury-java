@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.RoutingNumberLookupRequest
import com.moderntreasury.api.models.ValidationValidateRoutingNumberParams
import java.util.concurrent.CompletableFuture

interface ValidationServiceAsync {

    /** Validates the routing number information supplied without creating a routing detail */
    @JvmOverloads
    fun validateRoutingNumber(
        params: ValidationValidateRoutingNumberParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<RoutingNumberLookupRequest>
}
