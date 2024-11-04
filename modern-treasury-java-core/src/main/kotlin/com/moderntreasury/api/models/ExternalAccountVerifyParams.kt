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
import java.util.Objects
import java.util.Optional

class ExternalAccountVerifyParams
constructor(
    private val id: String,
    private val originatingAccountId: String,
    private val paymentType: PaymentType,
    private val currency: Currency?,
    private val fallbackType: FallbackType?,
    private val priority: Priority?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun id(): String = id

    fun originatingAccountId(): String = originatingAccountId

    fun paymentType(): PaymentType = paymentType

    fun currency(): Optional<Currency> = Optional.ofNullable(currency)

    fun fallbackType(): Optional<FallbackType> = Optional.ofNullable(fallbackType)

    fun priority(): Optional<Priority> = Optional.ofNullable(priority)

    @JvmSynthetic
    internal fun getBody(): ExternalAccountVerifyBody {
        return ExternalAccountVerifyBody(
            originatingAccountId,
            paymentType,
            currency,
            fallbackType,
            priority,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> id
            else -> ""
        }
    }

    @JsonDeserialize(builder = ExternalAccountVerifyBody.Builder::class)
    @NoAutoDetect
    class ExternalAccountVerifyBody
    internal constructor(
        private val originatingAccountId: String?,
        private val paymentType: PaymentType?,
        private val currency: Currency?,
        private val fallbackType: FallbackType?,
        private val priority: Priority?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * The ID of the internal account where the micro-deposits originate from. Both credit and
         * debit capabilities must be enabled.
         */
        @JsonProperty("originating_account_id")
        fun originatingAccountId(): String? = originatingAccountId

        /** Can be `ach`, `eft`, or `rtp`. */
        @JsonProperty("payment_type") fun paymentType(): PaymentType? = paymentType

        /** Defaults to the currency of the originating account. */
        @JsonProperty("currency") fun currency(): Currency? = currency

        /**
         * A payment type to fallback to if the original type is not valid for the receiving
         * account. Currently, this only supports falling back from RTP to ACH (payment_type=rtp and
         * fallback_type=ach)
         */
        @JsonProperty("fallback_type") fun fallbackType(): FallbackType? = fallbackType

        /**
         * Either `normal` or `high`. For ACH payments, `high` represents a same-day ACH transfer.
         * This will apply to both `payment_type` and `fallback_type`.
         */
        @JsonProperty("priority") fun priority(): Priority? = priority

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var originatingAccountId: String? = null
            private var paymentType: PaymentType? = null
            private var currency: Currency? = null
            private var fallbackType: FallbackType? = null
            private var priority: Priority? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(externalAccountVerifyBody: ExternalAccountVerifyBody) = apply {
                this.originatingAccountId = externalAccountVerifyBody.originatingAccountId
                this.paymentType = externalAccountVerifyBody.paymentType
                this.currency = externalAccountVerifyBody.currency
                this.fallbackType = externalAccountVerifyBody.fallbackType
                this.priority = externalAccountVerifyBody.priority
                additionalProperties(externalAccountVerifyBody.additionalProperties)
            }

            /**
             * The ID of the internal account where the micro-deposits originate from. Both credit
             * and debit capabilities must be enabled.
             */
            @JsonProperty("originating_account_id")
            fun originatingAccountId(originatingAccountId: String) = apply {
                this.originatingAccountId = originatingAccountId
            }

            /** Can be `ach`, `eft`, or `rtp`. */
            @JsonProperty("payment_type")
            fun paymentType(paymentType: PaymentType) = apply { this.paymentType = paymentType }

            /** Defaults to the currency of the originating account. */
            @JsonProperty("currency")
            fun currency(currency: Currency) = apply { this.currency = currency }

            /**
             * A payment type to fallback to if the original type is not valid for the receiving
             * account. Currently, this only supports falling back from RTP to ACH (payment_type=rtp
             * and fallback_type=ach)
             */
            @JsonProperty("fallback_type")
            fun fallbackType(fallbackType: FallbackType) = apply {
                this.fallbackType = fallbackType
            }

            /**
             * Either `normal` or `high`. For ACH payments, `high` represents a same-day ACH
             * transfer. This will apply to both `payment_type` and `fallback_type`.
             */
            @JsonProperty("priority")
            fun priority(priority: Priority) = apply { this.priority = priority }

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

            fun build(): ExternalAccountVerifyBody =
                ExternalAccountVerifyBody(
                    checkNotNull(originatingAccountId) {
                        "`originatingAccountId` is required but was not set"
                    },
                    checkNotNull(paymentType) { "`paymentType` is required but was not set" },
                    currency,
                    fallbackType,
                    priority,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExternalAccountVerifyBody && this.originatingAccountId == other.originatingAccountId && this.paymentType == other.paymentType && this.currency == other.currency && this.fallbackType == other.fallbackType && this.priority == other.priority && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(originatingAccountId, paymentType, currency, fallbackType, priority, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ExternalAccountVerifyBody{originatingAccountId=$originatingAccountId, paymentType=$paymentType, currency=$currency, fallbackType=$fallbackType, priority=$priority, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalAccountVerifyParams && this.id == other.id && this.originatingAccountId == other.originatingAccountId && this.paymentType == other.paymentType && this.currency == other.currency && this.fallbackType == other.fallbackType && this.priority == other.priority && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(id, originatingAccountId, paymentType, currency, fallbackType, priority, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "ExternalAccountVerifyParams{id=$id, originatingAccountId=$originatingAccountId, paymentType=$paymentType, currency=$currency, fallbackType=$fallbackType, priority=$priority, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var id: String? = null
        private var originatingAccountId: String? = null
        private var paymentType: PaymentType? = null
        private var currency: Currency? = null
        private var fallbackType: FallbackType? = null
        private var priority: Priority? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalAccountVerifyParams: ExternalAccountVerifyParams) = apply {
            this.id = externalAccountVerifyParams.id
            this.originatingAccountId = externalAccountVerifyParams.originatingAccountId
            this.paymentType = externalAccountVerifyParams.paymentType
            this.currency = externalAccountVerifyParams.currency
            this.fallbackType = externalAccountVerifyParams.fallbackType
            this.priority = externalAccountVerifyParams.priority
            additionalHeaders(externalAccountVerifyParams.additionalHeaders)
            additionalQueryParams(externalAccountVerifyParams.additionalQueryParams)
            additionalBodyProperties(externalAccountVerifyParams.additionalBodyProperties)
        }

        fun id(id: String) = apply { this.id = id }

        /**
         * The ID of the internal account where the micro-deposits originate from. Both credit and
         * debit capabilities must be enabled.
         */
        fun originatingAccountId(originatingAccountId: String) = apply {
            this.originatingAccountId = originatingAccountId
        }

        /** Can be `ach`, `eft`, or `rtp`. */
        fun paymentType(paymentType: PaymentType) = apply { this.paymentType = paymentType }

        /** Defaults to the currency of the originating account. */
        fun currency(currency: Currency) = apply { this.currency = currency }

        /**
         * A payment type to fallback to if the original type is not valid for the receiving
         * account. Currently, this only supports falling back from RTP to ACH (payment_type=rtp and
         * fallback_type=ach)
         */
        fun fallbackType(fallbackType: FallbackType) = apply { this.fallbackType = fallbackType }

        /**
         * Either `normal` or `high`. For ACH payments, `high` represents a same-day ACH transfer.
         * This will apply to both `payment_type` and `fallback_type`.
         */
        fun priority(priority: Priority) = apply { this.priority = priority }

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

        fun build(): ExternalAccountVerifyParams =
            ExternalAccountVerifyParams(
                checkNotNull(id) { "`id` is required but was not set" },
                checkNotNull(originatingAccountId) {
                    "`originatingAccountId` is required but was not set"
                },
                checkNotNull(paymentType) { "`paymentType` is required but was not set" },
                currency,
                fallbackType,
                priority,
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

    class PaymentType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PaymentType && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ACH = PaymentType(JsonField.of("ach"))

            @JvmField val AU_BECS = PaymentType(JsonField.of("au_becs"))

            @JvmField val BACS = PaymentType(JsonField.of("bacs"))

            @JvmField val BOOK = PaymentType(JsonField.of("book"))

            @JvmField val CARD = PaymentType(JsonField.of("card"))

            @JvmField val CHATS = PaymentType(JsonField.of("chats"))

            @JvmField val CHECK = PaymentType(JsonField.of("check"))

            @JvmField val CROSS_BORDER = PaymentType(JsonField.of("cross_border"))

            @JvmField val DK_NETS = PaymentType(JsonField.of("dk_nets"))

            @JvmField val EFT = PaymentType(JsonField.of("eft"))

            @JvmField val HU_ICS = PaymentType(JsonField.of("hu_ics"))

            @JvmField val INTERAC = PaymentType(JsonField.of("interac"))

            @JvmField val MASAV = PaymentType(JsonField.of("masav"))

            @JvmField val MX_CCEN = PaymentType(JsonField.of("mx_ccen"))

            @JvmField val NEFT = PaymentType(JsonField.of("neft"))

            @JvmField val NICS = PaymentType(JsonField.of("nics"))

            @JvmField val NZ_BECS = PaymentType(JsonField.of("nz_becs"))

            @JvmField val PL_ELIXIR = PaymentType(JsonField.of("pl_elixir"))

            @JvmField val PROVXCHANGE = PaymentType(JsonField.of("provxchange"))

            @JvmField val RO_SENT = PaymentType(JsonField.of("ro_sent"))

            @JvmField val RTP = PaymentType(JsonField.of("rtp"))

            @JvmField val SE_BANKGIROT = PaymentType(JsonField.of("se_bankgirot"))

            @JvmField val SEN = PaymentType(JsonField.of("sen"))

            @JvmField val SEPA = PaymentType(JsonField.of("sepa"))

            @JvmField val SG_GIRO = PaymentType(JsonField.of("sg_giro"))

            @JvmField val SIC = PaymentType(JsonField.of("sic"))

            @JvmField val SIGNET = PaymentType(JsonField.of("signet"))

            @JvmField val SKNBI = PaymentType(JsonField.of("sknbi"))

            @JvmField val WIRE = PaymentType(JsonField.of("wire"))

            @JvmField val ZENGIN = PaymentType(JsonField.of("zengin"))

            @JvmStatic fun of(value: String) = PaymentType(JsonField.of(value))
        }

        enum class Known {
            ACH,
            AU_BECS,
            BACS,
            BOOK,
            CARD,
            CHATS,
            CHECK,
            CROSS_BORDER,
            DK_NETS,
            EFT,
            HU_ICS,
            INTERAC,
            MASAV,
            MX_CCEN,
            NEFT,
            NICS,
            NZ_BECS,
            PL_ELIXIR,
            PROVXCHANGE,
            RO_SENT,
            RTP,
            SE_BANKGIROT,
            SEN,
            SEPA,
            SG_GIRO,
            SIC,
            SIGNET,
            SKNBI,
            WIRE,
            ZENGIN,
        }

        enum class Value {
            ACH,
            AU_BECS,
            BACS,
            BOOK,
            CARD,
            CHATS,
            CHECK,
            CROSS_BORDER,
            DK_NETS,
            EFT,
            HU_ICS,
            INTERAC,
            MASAV,
            MX_CCEN,
            NEFT,
            NICS,
            NZ_BECS,
            PL_ELIXIR,
            PROVXCHANGE,
            RO_SENT,
            RTP,
            SE_BANKGIROT,
            SEN,
            SEPA,
            SG_GIRO,
            SIC,
            SIGNET,
            SKNBI,
            WIRE,
            ZENGIN,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACH -> Value.ACH
                AU_BECS -> Value.AU_BECS
                BACS -> Value.BACS
                BOOK -> Value.BOOK
                CARD -> Value.CARD
                CHATS -> Value.CHATS
                CHECK -> Value.CHECK
                CROSS_BORDER -> Value.CROSS_BORDER
                DK_NETS -> Value.DK_NETS
                EFT -> Value.EFT
                HU_ICS -> Value.HU_ICS
                INTERAC -> Value.INTERAC
                MASAV -> Value.MASAV
                MX_CCEN -> Value.MX_CCEN
                NEFT -> Value.NEFT
                NICS -> Value.NICS
                NZ_BECS -> Value.NZ_BECS
                PL_ELIXIR -> Value.PL_ELIXIR
                PROVXCHANGE -> Value.PROVXCHANGE
                RO_SENT -> Value.RO_SENT
                RTP -> Value.RTP
                SE_BANKGIROT -> Value.SE_BANKGIROT
                SEN -> Value.SEN
                SEPA -> Value.SEPA
                SG_GIRO -> Value.SG_GIRO
                SIC -> Value.SIC
                SIGNET -> Value.SIGNET
                SKNBI -> Value.SKNBI
                WIRE -> Value.WIRE
                ZENGIN -> Value.ZENGIN
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACH -> Known.ACH
                AU_BECS -> Known.AU_BECS
                BACS -> Known.BACS
                BOOK -> Known.BOOK
                CARD -> Known.CARD
                CHATS -> Known.CHATS
                CHECK -> Known.CHECK
                CROSS_BORDER -> Known.CROSS_BORDER
                DK_NETS -> Known.DK_NETS
                EFT -> Known.EFT
                HU_ICS -> Known.HU_ICS
                INTERAC -> Known.INTERAC
                MASAV -> Known.MASAV
                MX_CCEN -> Known.MX_CCEN
                NEFT -> Known.NEFT
                NICS -> Known.NICS
                NZ_BECS -> Known.NZ_BECS
                PL_ELIXIR -> Known.PL_ELIXIR
                PROVXCHANGE -> Known.PROVXCHANGE
                RO_SENT -> Known.RO_SENT
                RTP -> Known.RTP
                SE_BANKGIROT -> Known.SE_BANKGIROT
                SEN -> Known.SEN
                SEPA -> Known.SEPA
                SG_GIRO -> Known.SG_GIRO
                SIC -> Known.SIC
                SIGNET -> Known.SIGNET
                SKNBI -> Known.SKNBI
                WIRE -> Known.WIRE
                ZENGIN -> Known.ZENGIN
                else -> throw ModernTreasuryInvalidDataException("Unknown PaymentType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class FallbackType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FallbackType && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ACH = FallbackType(JsonField.of("ach"))

            @JvmStatic fun of(value: String) = FallbackType(JsonField.of(value))
        }

        enum class Known {
            ACH,
        }

        enum class Value {
            ACH,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACH -> Value.ACH
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACH -> Known.ACH
                else -> throw ModernTreasuryInvalidDataException("Unknown FallbackType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Priority
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Priority && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val HIGH = Priority(JsonField.of("high"))

            @JvmField val NORMAL = Priority(JsonField.of("normal"))

            @JvmStatic fun of(value: String) = Priority(JsonField.of(value))
        }

        enum class Known {
            HIGH,
            NORMAL,
        }

        enum class Value {
            HIGH,
            NORMAL,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                HIGH -> Value.HIGH
                NORMAL -> Value.NORMAL
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                HIGH -> Known.HIGH
                NORMAL -> Known.NORMAL
                else -> throw ModernTreasuryInvalidDataException("Unknown Priority: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
