// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.ExternalAccount
import com.moderntreasury.api.models.ExternalAccountCompleteVerificationParams
import com.moderntreasury.api.models.ExternalAccountCreateParams
import com.moderntreasury.api.models.ExternalAccountDeleteParams
import com.moderntreasury.api.models.ExternalAccountListPage
import com.moderntreasury.api.models.ExternalAccountListParams
import com.moderntreasury.api.models.ExternalAccountRetrieveParams
import com.moderntreasury.api.models.ExternalAccountUpdateParams
import com.moderntreasury.api.models.ExternalAccountVerifyParams
import com.moderntreasury.api.models.ExternalAccountVerifyResponse

interface ExternalAccountService {

    /** create external account */
    @JvmOverloads
    fun create(
        params: ExternalAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ExternalAccount

    /** show external account */
    @JvmOverloads
    fun retrieve(
        params: ExternalAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ExternalAccount

    /** update external account */
    @JvmOverloads
    fun update(
        params: ExternalAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ExternalAccount

    /** list external accounts */
    @JvmOverloads
    fun list(
        params: ExternalAccountListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ExternalAccountListPage

    /** delete external account */
    @JvmOverloads
    fun delete(
        params: ExternalAccountDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )

    /** complete verification of external account */
    @JvmOverloads
    fun completeVerification(
        params: ExternalAccountCompleteVerificationParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ExternalAccount

    /** verify external account */
    @JvmOverloads
    fun verify(
        params: ExternalAccountVerifyParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ExternalAccountVerifyResponse
}
