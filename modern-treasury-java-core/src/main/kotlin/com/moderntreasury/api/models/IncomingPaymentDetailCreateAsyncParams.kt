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
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import com.moderntreasury.api.models.*
import java.time.LocalDate
import java.util.Objects
import java.util.Optional

class IncomingPaymentDetailCreateAsyncParams
constructor(
    private val amount: Long?,
    private val asOfDate: LocalDate?,
    private val currency: Currency?,
    private val description: String?,
    private val direction: Direction?,
    private val internalAccountId: String?,
    private val type: Type?,
    private val virtualAccountId: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun amount(): Optional<Long> = Optional.ofNullable(amount)

    fun asOfDate(): Optional<LocalDate> = Optional.ofNullable(asOfDate)

    fun currency(): Optional<Currency> = Optional.ofNullable(currency)

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun direction(): Optional<Direction> = Optional.ofNullable(direction)

    fun internalAccountId(): Optional<String> = Optional.ofNullable(internalAccountId)

    fun type(): Optional<Type> = Optional.ofNullable(type)

    fun virtualAccountId(): Optional<String> = Optional.ofNullable(virtualAccountId)

    @JvmSynthetic
    internal fun getBody(): IncomingPaymentDetailCreateAsyncBody {
        return IncomingPaymentDetailCreateAsyncBody(
            amount,
            asOfDate,
            currency,
            description,
            direction,
            internalAccountId,
            type,
            virtualAccountId,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = IncomingPaymentDetailCreateAsyncBody.Builder::class)
    @NoAutoDetect
    class IncomingPaymentDetailCreateAsyncBody
    internal constructor(
        private val amount: Long?,
        private val asOfDate: LocalDate?,
        private val currency: Currency?,
        private val description: String?,
        private val direction: Direction?,
        private val internalAccountId: String?,
        private val type: Type?,
        private val virtualAccountId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        @JsonProperty("amount") fun amount(): Long? = amount

        /** Defaults to today. */
        @JsonProperty("as_of_date") fun asOfDate(): LocalDate? = asOfDate

        /** Defaults to the currency of the originating account. */
        @JsonProperty("currency") fun currency(): Currency? = currency

        /** Defaults to a random description. */
        @JsonProperty("description") fun description(): String? = description

        /** One of `credit`, `debit`. */
        @JsonProperty("direction") fun direction(): Direction? = direction

        /** The ID of one of your internal accounts. */
        @JsonProperty("internal_account_id") fun internalAccountId(): String? = internalAccountId

        /** One of `ach`, `wire`, `check`. */
        @JsonProperty("type") fun type(): Type? = type

        /** An optional parameter to associate the incoming payment detail to a virtual account. */
        @JsonProperty("virtual_account_id") fun virtualAccountId(): String? = virtualAccountId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: Long? = null
            private var asOfDate: LocalDate? = null
            private var currency: Currency? = null
            private var description: String? = null
            private var direction: Direction? = null
            private var internalAccountId: String? = null
            private var type: Type? = null
            private var virtualAccountId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                incomingPaymentDetailCreateAsyncBody: IncomingPaymentDetailCreateAsyncBody
            ) = apply {
                this.amount = incomingPaymentDetailCreateAsyncBody.amount
                this.asOfDate = incomingPaymentDetailCreateAsyncBody.asOfDate
                this.currency = incomingPaymentDetailCreateAsyncBody.currency
                this.description = incomingPaymentDetailCreateAsyncBody.description
                this.direction = incomingPaymentDetailCreateAsyncBody.direction
                this.internalAccountId = incomingPaymentDetailCreateAsyncBody.internalAccountId
                this.type = incomingPaymentDetailCreateAsyncBody.type
                this.virtualAccountId = incomingPaymentDetailCreateAsyncBody.virtualAccountId
                additionalProperties(incomingPaymentDetailCreateAsyncBody.additionalProperties)
            }

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /** Defaults to today. */
            @JsonProperty("as_of_date")
            fun asOfDate(asOfDate: LocalDate) = apply { this.asOfDate = asOfDate }

            /** Defaults to the currency of the originating account. */
            @JsonProperty("currency")
            fun currency(currency: Currency) = apply { this.currency = currency }

            /** Defaults to a random description. */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /** One of `credit`, `debit`. */
            @JsonProperty("direction")
            fun direction(direction: Direction) = apply { this.direction = direction }

            /** The ID of one of your internal accounts. */
            @JsonProperty("internal_account_id")
            fun internalAccountId(internalAccountId: String) = apply {
                this.internalAccountId = internalAccountId
            }

            /** One of `ach`, `wire`, `check`. */
            @JsonProperty("type") fun type(type: Type) = apply { this.type = type }

            /**
             * An optional parameter to associate the incoming payment detail to a virtual account.
             */
            @JsonProperty("virtual_account_id")
            fun virtualAccountId(virtualAccountId: String) = apply {
                this.virtualAccountId = virtualAccountId
            }

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

            fun build(): IncomingPaymentDetailCreateAsyncBody =
                IncomingPaymentDetailCreateAsyncBody(
                    amount,
                    asOfDate,
                    currency,
                    description,
                    direction,
                    internalAccountId,
                    type,
                    virtualAccountId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is IncomingPaymentDetailCreateAsyncBody && this.amount == other.amount && this.asOfDate == other.asOfDate && this.currency == other.currency && this.description == other.description && this.direction == other.direction && this.internalAccountId == other.internalAccountId && this.type == other.type && this.virtualAccountId == other.virtualAccountId && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(amount, asOfDate, currency, description, direction, internalAccountId, type, virtualAccountId, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "IncomingPaymentDetailCreateAsyncBody{amount=$amount, asOfDate=$asOfDate, currency=$currency, description=$description, direction=$direction, internalAccountId=$internalAccountId, type=$type, virtualAccountId=$virtualAccountId, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is IncomingPaymentDetailCreateAsyncParams && this.amount == other.amount && this.asOfDate == other.asOfDate && this.currency == other.currency && this.description == other.description && this.direction == other.direction && this.internalAccountId == other.internalAccountId && this.type == other.type && this.virtualAccountId == other.virtualAccountId && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(amount, asOfDate, currency, description, direction, internalAccountId, type, virtualAccountId, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "IncomingPaymentDetailCreateAsyncParams{amount=$amount, asOfDate=$asOfDate, currency=$currency, description=$description, direction=$direction, internalAccountId=$internalAccountId, type=$type, virtualAccountId=$virtualAccountId, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var amount: Long? = null
        private var asOfDate: LocalDate? = null
        private var currency: Currency? = null
        private var description: String? = null
        private var direction: Direction? = null
        private var internalAccountId: String? = null
        private var type: Type? = null
        private var virtualAccountId: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            incomingPaymentDetailCreateAsyncParams: IncomingPaymentDetailCreateAsyncParams
        ) = apply {
            this.amount = incomingPaymentDetailCreateAsyncParams.amount
            this.asOfDate = incomingPaymentDetailCreateAsyncParams.asOfDate
            this.currency = incomingPaymentDetailCreateAsyncParams.currency
            this.description = incomingPaymentDetailCreateAsyncParams.description
            this.direction = incomingPaymentDetailCreateAsyncParams.direction
            this.internalAccountId = incomingPaymentDetailCreateAsyncParams.internalAccountId
            this.type = incomingPaymentDetailCreateAsyncParams.type
            this.virtualAccountId = incomingPaymentDetailCreateAsyncParams.virtualAccountId
            additionalQueryParams(incomingPaymentDetailCreateAsyncParams.additionalQueryParams)
            additionalHeaders(incomingPaymentDetailCreateAsyncParams.additionalHeaders)
            additionalBodyProperties(
                incomingPaymentDetailCreateAsyncParams.additionalBodyProperties
            )
        }

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        fun amount(amount: Long) = apply { this.amount = amount }

        /** Defaults to today. */
        fun asOfDate(asOfDate: LocalDate) = apply { this.asOfDate = asOfDate }

        /** Defaults to the currency of the originating account. */
        fun currency(currency: Currency) = apply { this.currency = currency }

        /** Defaults to a random description. */
        fun description(description: String) = apply { this.description = description }

        /** One of `credit`, `debit`. */
        fun direction(direction: Direction) = apply { this.direction = direction }

        /** The ID of one of your internal accounts. */
        fun internalAccountId(internalAccountId: String) = apply {
            this.internalAccountId = internalAccountId
        }

        /** One of `ach`, `wire`, `check`. */
        fun type(type: Type) = apply { this.type = type }

        /** An optional parameter to associate the incoming payment detail to a virtual account. */
        fun virtualAccountId(virtualAccountId: String) = apply {
            this.virtualAccountId = virtualAccountId
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

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

        fun build(): IncomingPaymentDetailCreateAsyncParams =
            IncomingPaymentDetailCreateAsyncParams(
                amount,
                asOfDate,
                currency,
                description,
                direction,
                internalAccountId,
                type,
                virtualAccountId,
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
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

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ACH = Type(JsonField.of("ach"))

            @JvmField val BOOK = Type(JsonField.of("book"))

            @JvmField val CHECK = Type(JsonField.of("check"))

            @JvmField val EFT = Type(JsonField.of("eft"))

            @JvmField val INTERAC = Type(JsonField.of("interac"))

            @JvmField val RTP = Type(JsonField.of("rtp"))

            @JvmField val SEPA = Type(JsonField.of("sepa"))

            @JvmField val SIGNET = Type(JsonField.of("signet"))

            @JvmField val WIRE = Type(JsonField.of("wire"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            ACH,
            BOOK,
            CHECK,
            EFT,
            INTERAC,
            RTP,
            SEPA,
            SIGNET,
            WIRE,
        }

        enum class Value {
            ACH,
            BOOK,
            CHECK,
            EFT,
            INTERAC,
            RTP,
            SEPA,
            SIGNET,
            WIRE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACH -> Value.ACH
                BOOK -> Value.BOOK
                CHECK -> Value.CHECK
                EFT -> Value.EFT
                INTERAC -> Value.INTERAC
                RTP -> Value.RTP
                SEPA -> Value.SEPA
                SIGNET -> Value.SIGNET
                WIRE -> Value.WIRE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACH -> Known.ACH
                BOOK -> Known.BOOK
                CHECK -> Known.CHECK
                EFT -> Known.EFT
                INTERAC -> Known.INTERAC
                RTP -> Known.RTP
                SEPA -> Known.SEPA
                SIGNET -> Known.SIGNET
                WIRE -> Known.WIRE
                else -> throw ModernTreasuryInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
