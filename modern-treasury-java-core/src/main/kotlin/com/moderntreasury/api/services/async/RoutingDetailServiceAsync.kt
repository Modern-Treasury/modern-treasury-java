@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.fasterxml.jackson.annotation.JsonCreator
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import com.moderntreasury.api.models.RoutingDetail
import com.moderntreasury.api.models.RoutingDetailCreateParams
import com.moderntreasury.api.models.RoutingDetailDeleteParams
import com.moderntreasury.api.models.RoutingDetailListPageAsync
import com.moderntreasury.api.models.RoutingDetailListParams
import com.moderntreasury.api.models.RoutingDetailRetrieveParams
import java.util.concurrent.CompletableFuture

interface RoutingDetailServiceAsync {

    /** Create a routing detail for a single external account. */
    @JvmOverloads
    fun create(
        params: RoutingDetailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<RoutingDetail>

    /** Get a single routing detail for a single internal or external account. */
    @JvmOverloads
    fun retrieve(
        params: RoutingDetailRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<RoutingDetail>

    /** Get a list of routing details for a single internal or external account. */
    @JvmOverloads
    fun list(
        params: RoutingDetailListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<RoutingDetailListPageAsync>

    /** Delete a routing detail for a single external account. */
    @JvmOverloads
    fun delete(
        params: RoutingDetailDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Void>

    class AccountsType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccountsType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val EXTERNAL_ACCOUNTS = AccountsType(JsonField.of("external_accounts"))

            @JvmStatic fun of(value: String) = AccountsType(JsonField.of(value))
        }

        enum class Known {
            EXTERNAL_ACCOUNTS,
        }

        enum class Value {
            EXTERNAL_ACCOUNTS,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                EXTERNAL_ACCOUNTS -> Value.EXTERNAL_ACCOUNTS
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                EXTERNAL_ACCOUNTS -> Known.EXTERNAL_ACCOUNTS
                else -> throw ModernTreasuryInvalidDataException("Unknown AccountsType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
