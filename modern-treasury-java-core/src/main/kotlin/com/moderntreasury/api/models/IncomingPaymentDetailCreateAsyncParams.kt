// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.util.Objects
import java.util.Optional

/** Simulate Incoming Payment Detail */
class IncomingPaymentDetailCreateAsyncParams
constructor(
    private val body: IncomingPaymentDetailCreateAsyncBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
    fun amount(): Optional<Long> = body.amount()

    /** Defaults to today. */
    fun asOfDate(): Optional<LocalDate> = body.asOfDate()

    /** Defaults to the currency of the originating account. */
    fun currency(): Optional<Currency> = body.currency()

    /** Defaults to a random description. */
    fun description(): Optional<String> = body.description()

    /** One of `credit`, `debit`. */
    fun direction(): Optional<Direction> = body.direction()

    /** The ID of one of your internal accounts. */
    fun internalAccountId(): Optional<String> = body.internalAccountId()

    /** One of `ach`, `wire`, `check`. */
    fun type(): Optional<Type> = body.type()

    /** An optional parameter to associate the incoming payment detail to a virtual account. */
    fun virtualAccountId(): Optional<String> = body.virtualAccountId()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): IncomingPaymentDetailCreateAsyncBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class IncomingPaymentDetailCreateAsyncBody
    @JsonCreator
    internal constructor(
        @JsonProperty("amount") private val amount: Long?,
        @JsonProperty("as_of_date") private val asOfDate: LocalDate?,
        @JsonProperty("currency") private val currency: Currency?,
        @JsonProperty("description") private val description: String?,
        @JsonProperty("direction") private val direction: Direction?,
        @JsonProperty("internal_account_id") private val internalAccountId: String?,
        @JsonProperty("type") private val type: Type?,
        @JsonProperty("virtual_account_id") private val virtualAccountId: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        @JsonProperty("amount") fun amount(): Optional<Long> = Optional.ofNullable(amount)

        /** Defaults to today. */
        @JsonProperty("as_of_date")
        fun asOfDate(): Optional<LocalDate> = Optional.ofNullable(asOfDate)

        /** Defaults to the currency of the originating account. */
        @JsonProperty("currency") fun currency(): Optional<Currency> = Optional.ofNullable(currency)

        /** Defaults to a random description. */
        @JsonProperty("description")
        fun description(): Optional<String> = Optional.ofNullable(description)

        /** One of `credit`, `debit`. */
        @JsonProperty("direction")
        fun direction(): Optional<Direction> = Optional.ofNullable(direction)

        /** The ID of one of your internal accounts. */
        @JsonProperty("internal_account_id")
        fun internalAccountId(): Optional<String> = Optional.ofNullable(internalAccountId)

        /** One of `ach`, `wire`, `check`. */
        @JsonProperty("type") fun type(): Optional<Type> = Optional.ofNullable(type)

        /** An optional parameter to associate the incoming payment detail to a virtual account. */
        @JsonProperty("virtual_account_id")
        fun virtualAccountId(): Optional<String> = Optional.ofNullable(virtualAccountId)

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
                amount = incomingPaymentDetailCreateAsyncBody.amount
                asOfDate = incomingPaymentDetailCreateAsyncBody.asOfDate
                currency = incomingPaymentDetailCreateAsyncBody.currency
                description = incomingPaymentDetailCreateAsyncBody.description
                direction = incomingPaymentDetailCreateAsyncBody.direction
                internalAccountId = incomingPaymentDetailCreateAsyncBody.internalAccountId
                type = incomingPaymentDetailCreateAsyncBody.type
                virtualAccountId = incomingPaymentDetailCreateAsyncBody.virtualAccountId
                additionalProperties =
                    incomingPaymentDetailCreateAsyncBody.additionalProperties.toMutableMap()
            }

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            fun amount(amount: Long?) = apply { this.amount = amount }

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            fun amount(amount: Long) = amount(amount as Long?)

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun amount(amount: Optional<Long>) = amount(amount.orElse(null) as Long?)

            /** Defaults to today. */
            fun asOfDate(asOfDate: LocalDate?) = apply { this.asOfDate = asOfDate }

            /** Defaults to today. */
            fun asOfDate(asOfDate: Optional<LocalDate>) = asOfDate(asOfDate.orElse(null))

            /** Defaults to the currency of the originating account. */
            fun currency(currency: Currency?) = apply { this.currency = currency }

            /** Defaults to the currency of the originating account. */
            fun currency(currency: Optional<Currency>) = currency(currency.orElse(null))

            /** Defaults to a random description. */
            fun description(description: String?) = apply { this.description = description }

            /** Defaults to a random description. */
            fun description(description: Optional<String>) = description(description.orElse(null))

            /** One of `credit`, `debit`. */
            fun direction(direction: Direction?) = apply { this.direction = direction }

            /** One of `credit`, `debit`. */
            fun direction(direction: Optional<Direction>) = direction(direction.orElse(null))

            /** The ID of one of your internal accounts. */
            fun internalAccountId(internalAccountId: String?) = apply {
                this.internalAccountId = internalAccountId
            }

            /** The ID of one of your internal accounts. */
            fun internalAccountId(internalAccountId: Optional<String>) =
                internalAccountId(internalAccountId.orElse(null))

            /** One of `ach`, `wire`, `check`. */
            fun type(type: Type?) = apply { this.type = type }

            /** One of `ach`, `wire`, `check`. */
            fun type(type: Optional<Type>) = type(type.orElse(null))

            /**
             * An optional parameter to associate the incoming payment detail to a virtual account.
             */
            fun virtualAccountId(virtualAccountId: String?) = apply {
                this.virtualAccountId = virtualAccountId
            }

            /**
             * An optional parameter to associate the incoming payment detail to a virtual account.
             */
            fun virtualAccountId(virtualAccountId: Optional<String>) =
                virtualAccountId(virtualAccountId.orElse(null))

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
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

            return /* spotless:off */ other is IncomingPaymentDetailCreateAsyncBody && amount == other.amount && asOfDate == other.asOfDate && currency == other.currency && description == other.description && direction == other.direction && internalAccountId == other.internalAccountId && type == other.type && virtualAccountId == other.virtualAccountId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, asOfDate, currency, description, direction, internalAccountId, type, virtualAccountId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "IncomingPaymentDetailCreateAsyncBody{amount=$amount, asOfDate=$asOfDate, currency=$currency, description=$description, direction=$direction, internalAccountId=$internalAccountId, type=$type, virtualAccountId=$virtualAccountId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: IncomingPaymentDetailCreateAsyncBody.Builder =
            IncomingPaymentDetailCreateAsyncBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            incomingPaymentDetailCreateAsyncParams: IncomingPaymentDetailCreateAsyncParams
        ) = apply {
            body = incomingPaymentDetailCreateAsyncParams.body.toBuilder()
            additionalHeaders = incomingPaymentDetailCreateAsyncParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                incomingPaymentDetailCreateAsyncParams.additionalQueryParams.toBuilder()
        }

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        fun amount(amount: Long?) = apply { body.amount(amount) }

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        fun amount(amount: Long) = amount(amount as Long?)

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun amount(amount: Optional<Long>) = amount(amount.orElse(null) as Long?)

        /** Defaults to today. */
        fun asOfDate(asOfDate: LocalDate?) = apply { body.asOfDate(asOfDate) }

        /** Defaults to today. */
        fun asOfDate(asOfDate: Optional<LocalDate>) = asOfDate(asOfDate.orElse(null))

        /** Defaults to the currency of the originating account. */
        fun currency(currency: Currency?) = apply { body.currency(currency) }

        /** Defaults to the currency of the originating account. */
        fun currency(currency: Optional<Currency>) = currency(currency.orElse(null))

        /** Defaults to a random description. */
        fun description(description: String?) = apply { body.description(description) }

        /** Defaults to a random description. */
        fun description(description: Optional<String>) = description(description.orElse(null))

        /** One of `credit`, `debit`. */
        fun direction(direction: Direction?) = apply { body.direction(direction) }

        /** One of `credit`, `debit`. */
        fun direction(direction: Optional<Direction>) = direction(direction.orElse(null))

        /** The ID of one of your internal accounts. */
        fun internalAccountId(internalAccountId: String?) = apply {
            body.internalAccountId(internalAccountId)
        }

        /** The ID of one of your internal accounts. */
        fun internalAccountId(internalAccountId: Optional<String>) =
            internalAccountId(internalAccountId.orElse(null))

        /** One of `ach`, `wire`, `check`. */
        fun type(type: Type?) = apply { body.type(type) }

        /** One of `ach`, `wire`, `check`. */
        fun type(type: Optional<Type>) = type(type.orElse(null))

        /** An optional parameter to associate the incoming payment detail to a virtual account. */
        fun virtualAccountId(virtualAccountId: String?) = apply {
            body.virtualAccountId(virtualAccountId)
        }

        /** An optional parameter to associate the incoming payment detail to a virtual account. */
        fun virtualAccountId(virtualAccountId: Optional<String>) =
            virtualAccountId(virtualAccountId.orElse(null))

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
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun build(): IncomingPaymentDetailCreateAsyncParams =
            IncomingPaymentDetailCreateAsyncParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
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

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ACH = of("ach")

            @JvmField val BOOK = of("book")

            @JvmField val CHECK = of("check")

            @JvmField val EFT = of("eft")

            @JvmField val INTERAC = of("interac")

            @JvmField val RTP = of("rtp")

            @JvmField val SEPA = of("sepa")

            @JvmField val SIGNET = of("signet")

            @JvmField val WIRE = of("wire")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is IncomingPaymentDetailCreateAsyncParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "IncomingPaymentDetailCreateAsyncParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
