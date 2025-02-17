// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.Params
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.util.Objects
import java.util.Optional

/** Get a list of documents. */
class DocumentListParams
private constructor(
    private val afterCursor: String?,
    private val documentableId: String?,
    private val documentableType: DocumentableType?,
    private val perPage: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun afterCursor(): Optional<String> = Optional.ofNullable(afterCursor)

    /** The unique identifier for the associated object. */
    fun documentableId(): Optional<String> = Optional.ofNullable(documentableId)

    /**
     * The type of the associated object. Currently can be one of `payment_order`, `transaction`,
     * `paper_item`, `expected_payment`, `counterparty`, `organization`, `case`, `internal_account`,
     * `decision`, or `external_account`.
     */
    fun documentableType(): Optional<DocumentableType> = Optional.ofNullable(documentableType)

    fun perPage(): Optional<Long> = Optional.ofNullable(perPage)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.afterCursor?.let { queryParams.put("after_cursor", listOf(it.toString())) }
        this.documentableId?.let { queryParams.put("documentable_id", listOf(it.toString())) }
        this.documentableType?.let { queryParams.put("documentable_type", listOf(it.toString())) }
        this.perPage?.let { queryParams.put("per_page", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DocumentListParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var afterCursor: String? = null
        private var documentableId: String? = null
        private var documentableType: DocumentableType? = null
        private var perPage: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(documentListParams: DocumentListParams) = apply {
            afterCursor = documentListParams.afterCursor
            documentableId = documentListParams.documentableId
            documentableType = documentListParams.documentableType
            perPage = documentListParams.perPage
            additionalHeaders = documentListParams.additionalHeaders.toBuilder()
            additionalQueryParams = documentListParams.additionalQueryParams.toBuilder()
        }

        fun afterCursor(afterCursor: String?) = apply { this.afterCursor = afterCursor }

        fun afterCursor(afterCursor: Optional<String>) = afterCursor(afterCursor.orElse(null))

        /** The unique identifier for the associated object. */
        fun documentableId(documentableId: String?) = apply { this.documentableId = documentableId }

        /** The unique identifier for the associated object. */
        fun documentableId(documentableId: Optional<String>) =
            documentableId(documentableId.orElse(null))

        /**
         * The type of the associated object. Currently can be one of `payment_order`,
         * `transaction`, `paper_item`, `expected_payment`, `counterparty`, `organization`, `case`,
         * `internal_account`, `decision`, or `external_account`.
         */
        fun documentableType(documentableType: DocumentableType?) = apply {
            this.documentableType = documentableType
        }

        /**
         * The type of the associated object. Currently can be one of `payment_order`,
         * `transaction`, `paper_item`, `expected_payment`, `counterparty`, `organization`, `case`,
         * `internal_account`, `decision`, or `external_account`.
         */
        fun documentableType(documentableType: Optional<DocumentableType>) =
            documentableType(documentableType.orElse(null))

        fun perPage(perPage: Long?) = apply { this.perPage = perPage }

        fun perPage(perPage: Long) = perPage(perPage as Long?)

        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun perPage(perPage: Optional<Long>) = perPage(perPage.orElse(null) as Long?)

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): DocumentListParams =
            DocumentListParams(
                afterCursor,
                documentableId,
                documentableType,
                perPage,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /**
     * The type of the associated object. Currently can be one of `payment_order`, `transaction`,
     * `paper_item`, `expected_payment`, `counterparty`, `organization`, `case`, `internal_account`,
     * `decision`, or `external_account`.
     */
    class DocumentableType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val CASES = of("cases")

            @JvmField val COUNTERPARTIES = of("counterparties")

            @JvmField val EXPECTED_PAYMENTS = of("expected_payments")

            @JvmField val EXTERNAL_ACCOUNTS = of("external_accounts")

            @JvmField val INCOMING_PAYMENT_DETAILS = of("incoming_payment_details")

            @JvmField val INTERNAL_ACCOUNTS = of("internal_accounts")

            @JvmField val ORGANIZATIONS = of("organizations")

            @JvmField val PAPER_ITEMS = of("paper_items")

            @JvmField val PAYMENT_ORDERS = of("payment_orders")

            @JvmField val TRANSACTIONS = of("transactions")

            @JvmField val DECISIONS = of("decisions")

            @JvmField val CONNECTIONS = of("connections")

            @JvmStatic fun of(value: String) = DocumentableType(JsonField.of(value))
        }

        /** An enum containing [DocumentableType]'s known values. */
        enum class Known {
            CASES,
            COUNTERPARTIES,
            EXPECTED_PAYMENTS,
            EXTERNAL_ACCOUNTS,
            INCOMING_PAYMENT_DETAILS,
            INTERNAL_ACCOUNTS,
            ORGANIZATIONS,
            PAPER_ITEMS,
            PAYMENT_ORDERS,
            TRANSACTIONS,
            DECISIONS,
            CONNECTIONS,
        }

        /**
         * An enum containing [DocumentableType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DocumentableType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CASES,
            COUNTERPARTIES,
            EXPECTED_PAYMENTS,
            EXTERNAL_ACCOUNTS,
            INCOMING_PAYMENT_DETAILS,
            INTERNAL_ACCOUNTS,
            ORGANIZATIONS,
            PAPER_ITEMS,
            PAYMENT_ORDERS,
            TRANSACTIONS,
            DECISIONS,
            CONNECTIONS,
            /**
             * An enum member indicating that [DocumentableType] was instantiated with an unknown
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
                CASES -> Value.CASES
                COUNTERPARTIES -> Value.COUNTERPARTIES
                EXPECTED_PAYMENTS -> Value.EXPECTED_PAYMENTS
                EXTERNAL_ACCOUNTS -> Value.EXTERNAL_ACCOUNTS
                INCOMING_PAYMENT_DETAILS -> Value.INCOMING_PAYMENT_DETAILS
                INTERNAL_ACCOUNTS -> Value.INTERNAL_ACCOUNTS
                ORGANIZATIONS -> Value.ORGANIZATIONS
                PAPER_ITEMS -> Value.PAPER_ITEMS
                PAYMENT_ORDERS -> Value.PAYMENT_ORDERS
                TRANSACTIONS -> Value.TRANSACTIONS
                DECISIONS -> Value.DECISIONS
                CONNECTIONS -> Value.CONNECTIONS
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
                CASES -> Known.CASES
                COUNTERPARTIES -> Known.COUNTERPARTIES
                EXPECTED_PAYMENTS -> Known.EXPECTED_PAYMENTS
                EXTERNAL_ACCOUNTS -> Known.EXTERNAL_ACCOUNTS
                INCOMING_PAYMENT_DETAILS -> Known.INCOMING_PAYMENT_DETAILS
                INTERNAL_ACCOUNTS -> Known.INTERNAL_ACCOUNTS
                ORGANIZATIONS -> Known.ORGANIZATIONS
                PAPER_ITEMS -> Known.PAPER_ITEMS
                PAYMENT_ORDERS -> Known.PAYMENT_ORDERS
                TRANSACTIONS -> Known.TRANSACTIONS
                DECISIONS -> Known.DECISIONS
                CONNECTIONS -> Known.CONNECTIONS
                else -> throw ModernTreasuryInvalidDataException("Unknown DocumentableType: $value")
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

            return /* spotless:off */ other is DocumentableType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DocumentListParams && afterCursor == other.afterCursor && documentableId == other.documentableId && documentableType == other.documentableType && perPage == other.perPage && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(afterCursor, documentableId, documentableType, perPage, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "DocumentListParams{afterCursor=$afterCursor, documentableId=$documentableId, documentableType=$documentableType, perPage=$perPage, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
