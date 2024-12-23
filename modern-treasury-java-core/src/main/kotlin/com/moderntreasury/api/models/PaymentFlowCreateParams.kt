// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.util.Objects
import java.util.Optional

class PaymentFlowCreateParams
constructor(
    private val amount: Long,
    private val counterpartyId: String,
    private val currency: String,
    private val direction: Direction,
    private val originatingAccountId: String,
    private val dueDate: LocalDate?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun amount(): Long = amount

    fun counterpartyId(): String = counterpartyId

    fun currency(): String = currency

    fun direction(): Direction = direction

    fun originatingAccountId(): String = originatingAccountId

    fun dueDate(): Optional<LocalDate> = Optional.ofNullable(dueDate)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): PaymentFlowCreateBody {
        return PaymentFlowCreateBody(
            amount,
            counterpartyId,
            currency,
            direction,
            originatingAccountId,
            dueDate,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = PaymentFlowCreateBody.Builder::class)
    @NoAutoDetect
    class PaymentFlowCreateBody
    internal constructor(
        private val amount: Long?,
        private val counterpartyId: String?,
        private val currency: String?,
        private val direction: Direction?,
        private val originatingAccountId: String?,
        private val dueDate: LocalDate?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * Required. Value in specified currency's smallest unit. e.g. $10 would be represented
         * as 1000. Can be any integer up to 36 digits.
         */
        @JsonProperty("amount") fun amount(): Long? = amount

        /**
         * Required. The ID of a counterparty associated with the payment. As part of the payment
         * workflow an external account will be associated with this model.
         */
        @JsonProperty("counterparty_id") fun counterpartyId(): String? = counterpartyId

        /** Required. The currency of the payment. */
        @JsonProperty("currency") fun currency(): String? = currency

        /**
         * Required. Describes the direction money is flowing in the transaction. Can only be
         * `debit`. A `debit` pulls money from someone else's account to your own.
         */
        @JsonProperty("direction") fun direction(): Direction? = direction

        /** Required. The ID of one of your organization's internal accounts. */
        @JsonProperty("originating_account_id")
        fun originatingAccountId(): String? = originatingAccountId

        /**
         * Optional. Can only be passed in when `effective_date_selection_enabled` is `true`. When
         * set, the due date is shown to your end-user in the pre-built UI as they are selecting a
         * payment `effective_date`.
         */
        @JsonProperty("due_date") fun dueDate(): LocalDate? = dueDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: Long? = null
            private var counterpartyId: String? = null
            private var currency: String? = null
            private var direction: Direction? = null
            private var originatingAccountId: String? = null
            private var dueDate: LocalDate? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(paymentFlowCreateBody: PaymentFlowCreateBody) = apply {
                this.amount = paymentFlowCreateBody.amount
                this.counterpartyId = paymentFlowCreateBody.counterpartyId
                this.currency = paymentFlowCreateBody.currency
                this.direction = paymentFlowCreateBody.direction
                this.originatingAccountId = paymentFlowCreateBody.originatingAccountId
                this.dueDate = paymentFlowCreateBody.dueDate
                additionalProperties(paymentFlowCreateBody.additionalProperties)
            }

            /**
             * Required. Value in specified currency's smallest unit. e.g. $10 would be represented
             * as 1000. Can be any integer up to 36 digits.
             */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /**
             * Required. The ID of a counterparty associated with the payment. As part of the
             * payment workflow an external account will be associated with this model.
             */
            @JsonProperty("counterparty_id")
            fun counterpartyId(counterpartyId: String) = apply {
                this.counterpartyId = counterpartyId
            }

            /** Required. The currency of the payment. */
            @JsonProperty("currency")
            fun currency(currency: String) = apply { this.currency = currency }

            /**
             * Required. Describes the direction money is flowing in the transaction. Can only be
             * `debit`. A `debit` pulls money from someone else's account to your own.
             */
            @JsonProperty("direction")
            fun direction(direction: Direction) = apply { this.direction = direction }

            /** Required. The ID of one of your organization's internal accounts. */
            @JsonProperty("originating_account_id")
            fun originatingAccountId(originatingAccountId: String) = apply {
                this.originatingAccountId = originatingAccountId
            }

            /**
             * Optional. Can only be passed in when `effective_date_selection_enabled` is `true`.
             * When set, the due date is shown to your end-user in the pre-built UI as they are
             * selecting a payment `effective_date`.
             */
            @JsonProperty("due_date")
            fun dueDate(dueDate: LocalDate) = apply { this.dueDate = dueDate }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): PaymentFlowCreateBody =
                PaymentFlowCreateBody(
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    checkNotNull(counterpartyId) { "`counterpartyId` is required but was not set" },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    checkNotNull(direction) { "`direction` is required but was not set" },
                    checkNotNull(originatingAccountId) {
                        "`originatingAccountId` is required but was not set"
                    },
                    dueDate,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PaymentFlowCreateBody && amount == other.amount && counterpartyId == other.counterpartyId && currency == other.currency && direction == other.direction && originatingAccountId == other.originatingAccountId && dueDate == other.dueDate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, counterpartyId, currency, direction, originatingAccountId, dueDate, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PaymentFlowCreateBody{amount=$amount, counterpartyId=$counterpartyId, currency=$currency, direction=$direction, originatingAccountId=$originatingAccountId, dueDate=$dueDate, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var amount: Long? = null
        private var counterpartyId: String? = null
        private var currency: String? = null
        private var direction: Direction? = null
        private var originatingAccountId: String? = null
        private var dueDate: LocalDate? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(paymentFlowCreateParams: PaymentFlowCreateParams) = apply {
            amount = paymentFlowCreateParams.amount
            counterpartyId = paymentFlowCreateParams.counterpartyId
            currency = paymentFlowCreateParams.currency
            direction = paymentFlowCreateParams.direction
            originatingAccountId = paymentFlowCreateParams.originatingAccountId
            dueDate = paymentFlowCreateParams.dueDate
            additionalHeaders = paymentFlowCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = paymentFlowCreateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                paymentFlowCreateParams.additionalBodyProperties.toMutableMap()
        }

        /**
         * Required. Value in specified currency's smallest unit. e.g. $10 would be represented
         * as 1000. Can be any integer up to 36 digits.
         */
        fun amount(amount: Long) = apply { this.amount = amount }

        /**
         * Required. The ID of a counterparty associated with the payment. As part of the payment
         * workflow an external account will be associated with this model.
         */
        fun counterpartyId(counterpartyId: String) = apply { this.counterpartyId = counterpartyId }

        /** Required. The currency of the payment. */
        fun currency(currency: String) = apply { this.currency = currency }

        /**
         * Required. Describes the direction money is flowing in the transaction. Can only be
         * `debit`. A `debit` pulls money from someone else's account to your own.
         */
        fun direction(direction: Direction) = apply { this.direction = direction }

        /** Required. The ID of one of your organization's internal accounts. */
        fun originatingAccountId(originatingAccountId: String) = apply {
            this.originatingAccountId = originatingAccountId
        }

        /**
         * Optional. Can only be passed in when `effective_date_selection_enabled` is `true`. When
         * set, the due date is shown to your end-user in the pre-built UI as they are selecting a
         * payment `effective_date`.
         */
        fun dueDate(dueDate: LocalDate) = apply { this.dueDate = dueDate }

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): PaymentFlowCreateParams =
            PaymentFlowCreateParams(
                checkNotNull(amount) { "`amount` is required but was not set" },
                checkNotNull(counterpartyId) { "`counterpartyId` is required but was not set" },
                checkNotNull(currency) { "`currency` is required but was not set" },
                checkNotNull(direction) { "`direction` is required but was not set" },
                checkNotNull(originatingAccountId) {
                    "`originatingAccountId` is required but was not set"
                },
                dueDate,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    class Direction
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val CREDIT = of("credit")

            @JvmField val DEBIT = of("debit")

            @JvmStatic fun of(value: String) = Direction(JsonField.of(value))
        }

        enum class Known {
            CREDIT,
            DEBIT,
        }

        enum class Value {
            CREDIT,
            DEBIT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CREDIT -> Value.CREDIT
                DEBIT -> Value.DEBIT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CREDIT -> Known.CREDIT
                DEBIT -> Known.DEBIT
                else -> throw ModernTreasuryInvalidDataException("Unknown Direction: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Direction && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentFlowCreateParams && amount == other.amount && counterpartyId == other.counterpartyId && currency == other.currency && direction == other.direction && originatingAccountId == other.originatingAccountId && dueDate == other.dueDate && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(amount, counterpartyId, currency, direction, originatingAccountId, dueDate, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "PaymentFlowCreateParams{amount=$amount, counterpartyId=$counterpartyId, currency=$currency, direction=$direction, originatingAccountId=$originatingAccountId, dueDate=$dueDate, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
