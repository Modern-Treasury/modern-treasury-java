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
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import com.moderntreasury.api.models.*
import java.time.LocalDate
import java.util.Objects
import java.util.Optional

class TransactionCreateParams
constructor(
    private val amount: Long,
    private val asOfDate: LocalDate?,
    private val direction: String,
    private val internalAccountId: String,
    private val vendorCode: String?,
    private val vendorCodeType: String?,
    private val metadata: Metadata?,
    private val posted: Boolean?,
    private val type: Type?,
    private val vendorDescription: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun amount(): Long = amount

    fun asOfDate(): Optional<LocalDate> = Optional.ofNullable(asOfDate)

    fun direction(): String = direction

    fun internalAccountId(): String = internalAccountId

    fun vendorCode(): Optional<String> = Optional.ofNullable(vendorCode)

    fun vendorCodeType(): Optional<String> = Optional.ofNullable(vendorCodeType)

    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

    fun posted(): Optional<Boolean> = Optional.ofNullable(posted)

    fun type(): Optional<Type> = Optional.ofNullable(type)

    fun vendorDescription(): Optional<String> = Optional.ofNullable(vendorDescription)

    @JvmSynthetic
    internal fun getBody(): TransactionCreateBody {
        return TransactionCreateBody(
            amount,
            asOfDate,
            direction,
            internalAccountId,
            vendorCode,
            vendorCodeType,
            metadata,
            posted,
            type,
            vendorDescription,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = TransactionCreateBody.Builder::class)
    @NoAutoDetect
    class TransactionCreateBody
    internal constructor(
        private val amount: Long?,
        private val asOfDate: LocalDate?,
        private val direction: String?,
        private val internalAccountId: String?,
        private val vendorCode: String?,
        private val vendorCodeType: String?,
        private val metadata: Metadata?,
        private val posted: Boolean?,
        private val type: Type?,
        private val vendorDescription: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        @JsonProperty("amount") fun amount(): Long? = amount

        /** The date on which the transaction occurred. */
        @JsonProperty("as_of_date") fun asOfDate(): LocalDate? = asOfDate

        /** Either `credit` or `debit`. */
        @JsonProperty("direction") fun direction(): String? = direction

        /** The ID of the relevant Internal Account. */
        @JsonProperty("internal_account_id") fun internalAccountId(): String? = internalAccountId

        /**
         * When applicable, the bank-given code that determines the transaction's category. For most
         * banks this is the BAI2/BTRS transaction code.
         */
        @JsonProperty("vendor_code") fun vendorCode(): String? = vendorCode

        /**
         * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`, `bnk_dev`,
         * `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`, `evolve`,
         * `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`, `us_bank`, or
         * others.
         */
        @JsonProperty("vendor_code_type") fun vendorCodeType(): String? = vendorCodeType

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /** This field will be `true` if the transaction has posted to the account. */
        @JsonProperty("posted") fun posted(): Boolean? = posted

        /**
         * The type of the transaction. Examples could be `card, `ach`, `wire`, `check`, `rtp`,
         * `book`, or `sen`.
         */
        @JsonProperty("type") fun type(): Type? = type

        /**
         * The transaction detail text that often appears in on your bank statement and in your
         * banking portal.
         */
        @JsonProperty("vendor_description") fun vendorDescription(): String? = vendorDescription

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
            private var direction: String? = null
            private var internalAccountId: String? = null
            private var vendorCode: String? = null
            private var vendorCodeType: String? = null
            private var metadata: Metadata? = null
            private var posted: Boolean? = null
            private var type: Type? = null
            private var vendorDescription: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(transactionCreateBody: TransactionCreateBody) = apply {
                this.amount = transactionCreateBody.amount
                this.asOfDate = transactionCreateBody.asOfDate
                this.direction = transactionCreateBody.direction
                this.internalAccountId = transactionCreateBody.internalAccountId
                this.vendorCode = transactionCreateBody.vendorCode
                this.vendorCodeType = transactionCreateBody.vendorCodeType
                this.metadata = transactionCreateBody.metadata
                this.posted = transactionCreateBody.posted
                this.type = transactionCreateBody.type
                this.vendorDescription = transactionCreateBody.vendorDescription
                additionalProperties(transactionCreateBody.additionalProperties)
            }

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /** The date on which the transaction occurred. */
            @JsonProperty("as_of_date")
            fun asOfDate(asOfDate: LocalDate) = apply { this.asOfDate = asOfDate }

            /** Either `credit` or `debit`. */
            @JsonProperty("direction")
            fun direction(direction: String) = apply { this.direction = direction }

            /** The ID of the relevant Internal Account. */
            @JsonProperty("internal_account_id")
            fun internalAccountId(internalAccountId: String) = apply {
                this.internalAccountId = internalAccountId
            }

            /**
             * When applicable, the bank-given code that determines the transaction's category. For
             * most banks this is the BAI2/BTRS transaction code.
             */
            @JsonProperty("vendor_code")
            fun vendorCode(vendorCode: String) = apply { this.vendorCode = vendorCode }

            /**
             * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`,
             * `bnk_dev`, `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`,
             * `evolve`, `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`,
             * `us_bank`, or others.
             */
            @JsonProperty("vendor_code_type")
            fun vendorCodeType(vendorCodeType: String) = apply {
                this.vendorCodeType = vendorCodeType
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** This field will be `true` if the transaction has posted to the account. */
            @JsonProperty("posted") fun posted(posted: Boolean) = apply { this.posted = posted }

            /**
             * The type of the transaction. Examples could be `card, `ach`, `wire`, `check`, `rtp`,
             * `book`, or `sen`.
             */
            @JsonProperty("type") fun type(type: Type) = apply { this.type = type }

            /**
             * The transaction detail text that often appears in on your bank statement and in your
             * banking portal.
             */
            @JsonProperty("vendor_description")
            fun vendorDescription(vendorDescription: String) = apply {
                this.vendorDescription = vendorDescription
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

            fun build(): TransactionCreateBody =
                TransactionCreateBody(
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    asOfDate,
                    checkNotNull(direction) { "`direction` is required but was not set" },
                    checkNotNull(internalAccountId) {
                        "`internalAccountId` is required but was not set"
                    },
                    vendorCode,
                    vendorCodeType,
                    metadata,
                    posted,
                    type,
                    vendorDescription,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TransactionCreateBody && this.amount == other.amount && this.asOfDate == other.asOfDate && this.direction == other.direction && this.internalAccountId == other.internalAccountId && this.vendorCode == other.vendorCode && this.vendorCodeType == other.vendorCodeType && this.metadata == other.metadata && this.posted == other.posted && this.type == other.type && this.vendorDescription == other.vendorDescription && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(amount, asOfDate, direction, internalAccountId, vendorCode, vendorCodeType, metadata, posted, type, vendorDescription, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "TransactionCreateBody{amount=$amount, asOfDate=$asOfDate, direction=$direction, internalAccountId=$internalAccountId, vendorCode=$vendorCode, vendorCodeType=$vendorCodeType, metadata=$metadata, posted=$posted, type=$type, vendorDescription=$vendorDescription, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TransactionCreateParams && this.amount == other.amount && this.asOfDate == other.asOfDate && this.direction == other.direction && this.internalAccountId == other.internalAccountId && this.vendorCode == other.vendorCode && this.vendorCodeType == other.vendorCodeType && this.metadata == other.metadata && this.posted == other.posted && this.type == other.type && this.vendorDescription == other.vendorDescription && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(amount, asOfDate, direction, internalAccountId, vendorCode, vendorCodeType, metadata, posted, type, vendorDescription, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "TransactionCreateParams{amount=$amount, asOfDate=$asOfDate, direction=$direction, internalAccountId=$internalAccountId, vendorCode=$vendorCode, vendorCodeType=$vendorCodeType, metadata=$metadata, posted=$posted, type=$type, vendorDescription=$vendorDescription, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var amount: Long? = null
        private var asOfDate: LocalDate? = null
        private var direction: String? = null
        private var internalAccountId: String? = null
        private var vendorCode: String? = null
        private var vendorCodeType: String? = null
        private var metadata: Metadata? = null
        private var posted: Boolean? = null
        private var type: Type? = null
        private var vendorDescription: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(transactionCreateParams: TransactionCreateParams) = apply {
            this.amount = transactionCreateParams.amount
            this.asOfDate = transactionCreateParams.asOfDate
            this.direction = transactionCreateParams.direction
            this.internalAccountId = transactionCreateParams.internalAccountId
            this.vendorCode = transactionCreateParams.vendorCode
            this.vendorCodeType = transactionCreateParams.vendorCodeType
            this.metadata = transactionCreateParams.metadata
            this.posted = transactionCreateParams.posted
            this.type = transactionCreateParams.type
            this.vendorDescription = transactionCreateParams.vendorDescription
            additionalQueryParams(transactionCreateParams.additionalQueryParams)
            additionalHeaders(transactionCreateParams.additionalHeaders)
            additionalBodyProperties(transactionCreateParams.additionalBodyProperties)
        }

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        fun amount(amount: Long) = apply { this.amount = amount }

        /** The date on which the transaction occurred. */
        fun asOfDate(asOfDate: LocalDate) = apply { this.asOfDate = asOfDate }

        /** Either `credit` or `debit`. */
        fun direction(direction: String) = apply { this.direction = direction }

        /** The ID of the relevant Internal Account. */
        fun internalAccountId(internalAccountId: String) = apply {
            this.internalAccountId = internalAccountId
        }

        /**
         * When applicable, the bank-given code that determines the transaction's category. For most
         * banks this is the BAI2/BTRS transaction code.
         */
        fun vendorCode(vendorCode: String) = apply { this.vendorCode = vendorCode }

        /**
         * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`, `bnk_dev`,
         * `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`, `evolve`,
         * `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`, `us_bank`, or
         * others.
         */
        fun vendorCodeType(vendorCodeType: String) = apply { this.vendorCodeType = vendorCodeType }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        /** This field will be `true` if the transaction has posted to the account. */
        fun posted(posted: Boolean) = apply { this.posted = posted }

        /**
         * The type of the transaction. Examples could be `card, `ach`, `wire`, `check`, `rtp`,
         * `book`, or `sen`.
         */
        fun type(type: Type) = apply { this.type = type }

        /**
         * The transaction detail text that often appears in on your bank statement and in your
         * banking portal.
         */
        fun vendorDescription(vendorDescription: String) = apply {
            this.vendorDescription = vendorDescription
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

        fun build(): TransactionCreateParams =
            TransactionCreateParams(
                checkNotNull(amount) { "`amount` is required but was not set" },
                asOfDate,
                checkNotNull(direction) { "`direction` is required but was not set" },
                checkNotNull(internalAccountId) {
                    "`internalAccountId` is required but was not set"
                },
                vendorCode,
                vendorCodeType,
                metadata,
                posted,
                type,
                vendorDescription,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties(metadata.additionalProperties)
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

            fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
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

            @JvmField val AU_BECS = Type(JsonField.of("au_becs"))

            @JvmField val BACS = Type(JsonField.of("bacs"))

            @JvmField val BOOK = Type(JsonField.of("book"))

            @JvmField val CARD = Type(JsonField.of("card"))

            @JvmField val CHATS = Type(JsonField.of("chats"))

            @JvmField val CHECK = Type(JsonField.of("check"))

            @JvmField val CROSS_BORDER = Type(JsonField.of("cross_border"))

            @JvmField val DK_NETS = Type(JsonField.of("dk_nets"))

            @JvmField val EFT = Type(JsonField.of("eft"))

            @JvmField val HU_ICS = Type(JsonField.of("hu_ics"))

            @JvmField val INTERAC = Type(JsonField.of("interac"))

            @JvmField val MASAV = Type(JsonField.of("masav"))

            @JvmField val MX_CCEN = Type(JsonField.of("mx_ccen"))

            @JvmField val NEFT = Type(JsonField.of("neft"))

            @JvmField val NICS = Type(JsonField.of("nics"))

            @JvmField val NZ_BECS = Type(JsonField.of("nz_becs"))

            @JvmField val PL_ELIXIR = Type(JsonField.of("pl_elixir"))

            @JvmField val PROVXCHANGE = Type(JsonField.of("provxchange"))

            @JvmField val RO_SENT = Type(JsonField.of("ro_sent"))

            @JvmField val RTP = Type(JsonField.of("rtp"))

            @JvmField val SE_BANKGIROT = Type(JsonField.of("se_bankgirot"))

            @JvmField val SEN = Type(JsonField.of("sen"))

            @JvmField val SEPA = Type(JsonField.of("sepa"))

            @JvmField val SG_GIRO = Type(JsonField.of("sg_giro"))

            @JvmField val SIC = Type(JsonField.of("sic"))

            @JvmField val SIGNET = Type(JsonField.of("signet"))

            @JvmField val SKNBI = Type(JsonField.of("sknbi"))

            @JvmField val WIRE = Type(JsonField.of("wire"))

            @JvmField val ZENGIN = Type(JsonField.of("zengin"))

            @JvmField val OTHER = Type(JsonField.of("other"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
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
            OTHER,
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
            OTHER,
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
                OTHER -> Value.OTHER
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
                OTHER -> Known.OTHER
                else -> throw ModernTreasuryInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
