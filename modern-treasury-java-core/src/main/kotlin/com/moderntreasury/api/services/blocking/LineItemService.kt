// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.fasterxml.jackson.annotation.JsonCreator
import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import com.moderntreasury.api.models.LineItem
import com.moderntreasury.api.models.LineItemListPage
import com.moderntreasury.api.models.LineItemListParams
import com.moderntreasury.api.models.LineItemRetrieveParams
import com.moderntreasury.api.models.LineItemUpdateParams

interface LineItemService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get a single line item */
    fun retrieve(params: LineItemRetrieveParams): LineItem = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: LineItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LineItem

    /** update line item */
    fun update(params: LineItemUpdateParams): LineItem = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: LineItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LineItem

    /** Get a list of line items */
    fun list(params: LineItemListParams): LineItemListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: LineItemListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LineItemListPage

    class ItemizableType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val EXPECTED_PAYMENTS = of("expected_payments")

            @JvmField val PAYMENT_ORDERS = of("payment_orders")

            @JvmStatic fun of(value: String) = ItemizableType(JsonField.of(value))
        }

        /** An enum containing [ItemizableType]'s known values. */
        enum class Known {
            EXPECTED_PAYMENTS,
            PAYMENT_ORDERS,
        }

        /**
         * An enum containing [ItemizableType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ItemizableType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            EXPECTED_PAYMENTS,
            PAYMENT_ORDERS,
            /**
             * An enum member indicating that [ItemizableType] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                EXPECTED_PAYMENTS -> Value.EXPECTED_PAYMENTS
                PAYMENT_ORDERS -> Value.PAYMENT_ORDERS
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws ModernTreasuryInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                EXPECTED_PAYMENTS -> Known.EXPECTED_PAYMENTS
                PAYMENT_ORDERS -> Known.PAYMENT_ORDERS
                else -> throw ModernTreasuryInvalidDataException("Unknown ItemizableType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws ModernTreasuryInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                ModernTreasuryInvalidDataException("Value is not a String")
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ItemizableType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** A view of [LineItemService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get
         * /api/{itemizable_type}/{itemizable_id}/line_items/{id}`, but is otherwise the same as
         * [LineItemService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: LineItemRetrieveParams): HttpResponseFor<LineItem> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: LineItemRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LineItem>

        /**
         * Returns a raw HTTP response for `patch
         * /api/{itemizable_type}/{itemizable_id}/line_items/{id}`, but is otherwise the same as
         * [LineItemService.update].
         */
        @MustBeClosed
        fun update(params: LineItemUpdateParams): HttpResponseFor<LineItem> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: LineItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LineItem>

        /**
         * Returns a raw HTTP response for `get /api/{itemizable_type}/{itemizable_id}/line_items`,
         * but is otherwise the same as [LineItemService.list].
         */
        @MustBeClosed
        fun list(params: LineItemListParams): HttpResponseFor<LineItemListPage> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: LineItemListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LineItemListPage>
    }
}
