// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import com.moderntreasury.api.models.*
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
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun amount(): Long = amount

    fun counterpartyId(): String = counterpartyId

    fun currency(): String = currency

    fun direction(): Direction = direction

    fun originatingAccountId(): String = originatingAccountId

    fun dueDate(): Optional<LocalDate> = Optional.ofNullable(dueDate)

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

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

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

            return /* spotless:off */ other is PaymentFlowCreateBody && this.amount == other.amount && this.counterpartyId == other.counterpartyId && this.currency == other.currency && this.direction == other.direction && this.originatingAccountId == other.originatingAccountId && this.dueDate == other.dueDate && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(amount, counterpartyId, currency, direction, originatingAccountId, dueDate, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "PaymentFlowCreateBody{amount=$amount, counterpartyId=$counterpartyId, currency=$currency, direction=$direction, originatingAccountId=$originatingAccountId, dueDate=$dueDate, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentFlowCreateParams && this.amount == other.amount && this.counterpartyId == other.counterpartyId && this.currency == other.currency && this.direction == other.direction && this.originatingAccountId == other.originatingAccountId && this.dueDate == other.dueDate && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(amount, counterpartyId, currency, direction, originatingAccountId, dueDate, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "PaymentFlowCreateParams{amount=$amount, counterpartyId=$counterpartyId, currency=$currency, direction=$direction, originatingAccountId=$originatingAccountId, dueDate=$dueDate, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

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
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(paymentFlowCreateParams: PaymentFlowCreateParams) = apply {
            this.amount = paymentFlowCreateParams.amount
            this.counterpartyId = paymentFlowCreateParams.counterpartyId
            this.currency = paymentFlowCreateParams.currency
            this.direction = paymentFlowCreateParams.direction
            this.originatingAccountId = paymentFlowCreateParams.originatingAccountId
            this.dueDate = paymentFlowCreateParams.dueDate
            additionalHeaders(paymentFlowCreateParams.additionalHeaders)
            additionalQueryParams(paymentFlowCreateParams.additionalQueryParams)
            additionalBodyProperties(paymentFlowCreateParams.additionalBodyProperties)
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

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun removeAdditionalHeader(name: String) = apply { additionalHeaders.removeAll(name) }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun removeAdditionalQueryParam(key: String) = apply { additionalQueryParams.removeAll(key) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
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
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }

    class Direction
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Direction && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val CREDIT = Direction(JsonField.of("credit"))

            @JvmField val DEBIT = Direction(JsonField.of("debit"))

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
    }
}
