// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.ExpectedPayment
import com.moderntreasury.api.models.ExpectedPaymentCreateParams
import com.moderntreasury.api.models.ExpectedPaymentDeleteParams
import com.moderntreasury.api.models.ExpectedPaymentListPage
import com.moderntreasury.api.models.ExpectedPaymentListParams
import com.moderntreasury.api.models.ExpectedPaymentRetrieveParams
import com.moderntreasury.api.models.ExpectedPaymentUpdateParams

interface ExpectedPaymentService {

    /** create expected payment */
    @JvmOverloads
    fun create(
        params: ExpectedPaymentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExpectedPayment

    /** get expected payment */
    @JvmOverloads
    fun retrieve(
        params: ExpectedPaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExpectedPayment

    /** update expected payment */
    @JvmOverloads
    fun update(
        params: ExpectedPaymentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExpectedPayment

    /** list expected_payments */
    @JvmOverloads
    fun list(
        params: ExpectedPaymentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExpectedPaymentListPage

    /** delete expected payment */
    @JvmOverloads
    fun delete(
        params: ExpectedPaymentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExpectedPayment
}
