// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.fasterxml.jackson.annotation.JsonCreator
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import com.moderntreasury.api.models.LineItem
import com.moderntreasury.api.models.LineItemListPageAsync
import com.moderntreasury.api.models.LineItemListParams
import com.moderntreasury.api.models.LineItemRetrieveParams
import com.moderntreasury.api.models.LineItemUpdateParams
import java.util.concurrent.CompletableFuture

interface LineItemServiceAsync {

    /** Get a single line item */
    @JvmOverloads
    fun retrieve(
        params: LineItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<LineItem>

    /** update line item */
    @JvmOverloads
    fun update(
        params: LineItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<LineItem>

    /** Get a list of line items */
    @JvmOverloads
    fun list(
        params: LineItemListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<LineItemListPageAsync>

    class ItemizableType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ItemizableType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val EXPECTED_PAYMENTS = ItemizableType(JsonField.of("expected_payments"))

            @JvmField val PAYMENT_ORDERS = ItemizableType(JsonField.of("payment_orders"))

            @JvmStatic fun of(value: String) = ItemizableType(JsonField.of(value))
        }

        enum class Known {
            EXPECTED_PAYMENTS,
            PAYMENT_ORDERS,
        }

        enum class Value {
            EXPECTED_PAYMENTS,
            PAYMENT_ORDERS,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                EXPECTED_PAYMENTS -> Value.EXPECTED_PAYMENTS
                PAYMENT_ORDERS -> Value.PAYMENT_ORDERS
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                EXPECTED_PAYMENTS -> Known.EXPECTED_PAYMENTS
                PAYMENT_ORDERS -> Known.PAYMENT_ORDERS
                else -> throw ModernTreasuryInvalidDataException("Unknown ItemizableType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
