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

class TransactionCreateParams
constructor(
    private val body: TransactionCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
    fun amount(): Long = body.amount()

    /** The date on which the transaction occurred. */
    fun asOfDate(): Optional<LocalDate> = body.asOfDate()

    /** Either `credit` or `debit`. */
    fun direction(): String = body.direction()

    /** The ID of the relevant Internal Account. */
    fun internalAccountId(): String = body.internalAccountId()

    /**
     * When applicable, the bank-given code that determines the transaction's category. For most
     * banks this is the BAI2/BTRS transaction code.
     */
    fun vendorCode(): Optional<String> = body.vendorCode()

    /**
     * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`, `bnk_dev`,
     * `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`, `evolve`, `goldman_sachs`,
     * `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`, `us_bank`, or others.
     */
    fun vendorCodeType(): Optional<String> = body.vendorCodeType()

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Optional<Metadata> = body.metadata()

    /** This field will be `true` if the transaction has posted to the account. */
    fun posted(): Optional<Boolean> = body.posted()

    /**
     * The type of the transaction. Examples could be `card, `ach`, `wire`, `check`, `rtp`, `book`,
     * or `sen`.
     */
    fun type(): Optional<Type> = body.type()

    /**
     * The transaction detail text that often appears in on your bank statement and in your banking
     * portal.
     */
    fun vendorDescription(): Optional<String> = body.vendorDescription()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): TransactionCreateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class TransactionCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("amount") private val amount: Long,
        @JsonProperty("as_of_date") private val asOfDate: LocalDate?,
        @JsonProperty("direction") private val direction: String,
        @JsonProperty("internal_account_id") private val internalAccountId: String,
        @JsonProperty("vendor_code") private val vendorCode: String?,
        @JsonProperty("vendor_code_type") private val vendorCodeType: String?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("posted") private val posted: Boolean?,
        @JsonProperty("type") private val type: Type?,
        @JsonProperty("vendor_description") private val vendorDescription: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        @JsonProperty("amount") fun amount(): Long = amount

        /** The date on which the transaction occurred. */
        @JsonProperty("as_of_date")
        fun asOfDate(): Optional<LocalDate> = Optional.ofNullable(asOfDate)

        /** Either `credit` or `debit`. */
        @JsonProperty("direction") fun direction(): String = direction

        /** The ID of the relevant Internal Account. */
        @JsonProperty("internal_account_id") fun internalAccountId(): String = internalAccountId

        /**
         * When applicable, the bank-given code that determines the transaction's category. For most
         * banks this is the BAI2/BTRS transaction code.
         */
        @JsonProperty("vendor_code")
        fun vendorCode(): Optional<String> = Optional.ofNullable(vendorCode)

        /**
         * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`, `bnk_dev`,
         * `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`, `evolve`,
         * `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`, `us_bank`, or
         * others.
         */
        @JsonProperty("vendor_code_type")
        fun vendorCodeType(): Optional<String> = Optional.ofNullable(vendorCodeType)

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

        /** This field will be `true` if the transaction has posted to the account. */
        @JsonProperty("posted") fun posted(): Optional<Boolean> = Optional.ofNullable(posted)

        /**
         * The type of the transaction. Examples could be `card, `ach`, `wire`, `check`, `rtp`,
         * `book`, or `sen`.
         */
        @JsonProperty("type") fun type(): Optional<Type> = Optional.ofNullable(type)

        /**
         * The transaction detail text that often appears in on your bank statement and in your
         * banking portal.
         */
        @JsonProperty("vendor_description")
        fun vendorDescription(): Optional<String> = Optional.ofNullable(vendorDescription)

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
                amount = transactionCreateBody.amount
                asOfDate = transactionCreateBody.asOfDate
                direction = transactionCreateBody.direction
                internalAccountId = transactionCreateBody.internalAccountId
                vendorCode = transactionCreateBody.vendorCode
                vendorCodeType = transactionCreateBody.vendorCodeType
                metadata = transactionCreateBody.metadata
                posted = transactionCreateBody.posted
                type = transactionCreateBody.type
                vendorDescription = transactionCreateBody.vendorDescription
                additionalProperties = transactionCreateBody.additionalProperties.toMutableMap()
            }

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            fun amount(amount: Long) = apply { this.amount = amount }

            /** The date on which the transaction occurred. */
            fun asOfDate(asOfDate: LocalDate?) = apply { this.asOfDate = asOfDate }

            /** The date on which the transaction occurred. */
            fun asOfDate(asOfDate: Optional<LocalDate>) = asOfDate(asOfDate.orElse(null))

            /** Either `credit` or `debit`. */
            fun direction(direction: String) = apply { this.direction = direction }

            /** The ID of the relevant Internal Account. */
            fun internalAccountId(internalAccountId: String) = apply {
                this.internalAccountId = internalAccountId
            }

            /**
             * When applicable, the bank-given code that determines the transaction's category. For
             * most banks this is the BAI2/BTRS transaction code.
             */
            fun vendorCode(vendorCode: String?) = apply { this.vendorCode = vendorCode }

            /**
             * When applicable, the bank-given code that determines the transaction's category. For
             * most banks this is the BAI2/BTRS transaction code.
             */
            fun vendorCode(vendorCode: Optional<String>) = vendorCode(vendorCode.orElse(null))

            /**
             * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`,
             * `bnk_dev`, `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`,
             * `evolve`, `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`,
             * `us_bank`, or others.
             */
            fun vendorCodeType(vendorCodeType: String?) = apply {
                this.vendorCodeType = vendorCodeType
            }

            /**
             * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`,
             * `bnk_dev`, `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`,
             * `evolve`, `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`,
             * `us_bank`, or others.
             */
            fun vendorCodeType(vendorCodeType: Optional<String>) =
                vendorCodeType(vendorCodeType.orElse(null))

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Optional<Metadata>) = metadata(metadata.orElse(null))

            /** This field will be `true` if the transaction has posted to the account. */
            fun posted(posted: Boolean?) = apply { this.posted = posted }

            /** This field will be `true` if the transaction has posted to the account. */
            fun posted(posted: Boolean) = posted(posted as Boolean?)

            /** This field will be `true` if the transaction has posted to the account. */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun posted(posted: Optional<Boolean>) = posted(posted.orElse(null) as Boolean?)

            /**
             * The type of the transaction. Examples could be `card, `ach`, `wire`, `check`, `rtp`,
             * `book`, or `sen`.
             */
            fun type(type: Type?) = apply { this.type = type }

            /**
             * The type of the transaction. Examples could be `card, `ach`, `wire`, `check`, `rtp`,
             * `book`, or `sen`.
             */
            fun type(type: Optional<Type>) = type(type.orElse(null))

            /**
             * The transaction detail text that often appears in on your bank statement and in your
             * banking portal.
             */
            fun vendorDescription(vendorDescription: String?) = apply {
                this.vendorDescription = vendorDescription
            }

            /**
             * The transaction detail text that often appears in on your bank statement and in your
             * banking portal.
             */
            fun vendorDescription(vendorDescription: Optional<String>) =
                vendorDescription(vendorDescription.orElse(null))

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
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TransactionCreateBody && amount == other.amount && asOfDate == other.asOfDate && direction == other.direction && internalAccountId == other.internalAccountId && vendorCode == other.vendorCode && vendorCodeType == other.vendorCodeType && metadata == other.metadata && posted == other.posted && type == other.type && vendorDescription == other.vendorDescription && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, asOfDate, direction, internalAccountId, vendorCode, vendorCodeType, metadata, posted, type, vendorDescription, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TransactionCreateBody{amount=$amount, asOfDate=$asOfDate, direction=$direction, internalAccountId=$internalAccountId, vendorCode=$vendorCode, vendorCodeType=$vendorCodeType, metadata=$metadata, posted=$posted, type=$type, vendorDescription=$vendorDescription, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: TransactionCreateBody.Builder = TransactionCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(transactionCreateParams: TransactionCreateParams) = apply {
            body = transactionCreateParams.body.toBuilder()
            additionalHeaders = transactionCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = transactionCreateParams.additionalQueryParams.toBuilder()
        }

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /** The date on which the transaction occurred. */
        fun asOfDate(asOfDate: LocalDate?) = apply { body.asOfDate(asOfDate) }

        /** The date on which the transaction occurred. */
        fun asOfDate(asOfDate: Optional<LocalDate>) = asOfDate(asOfDate.orElse(null))

        /** Either `credit` or `debit`. */
        fun direction(direction: String) = apply { body.direction(direction) }

        /** The ID of the relevant Internal Account. */
        fun internalAccountId(internalAccountId: String) = apply {
            body.internalAccountId(internalAccountId)
        }

        /**
         * When applicable, the bank-given code that determines the transaction's category. For most
         * banks this is the BAI2/BTRS transaction code.
         */
        fun vendorCode(vendorCode: String?) = apply { body.vendorCode(vendorCode) }

        /**
         * When applicable, the bank-given code that determines the transaction's category. For most
         * banks this is the BAI2/BTRS transaction code.
         */
        fun vendorCode(vendorCode: Optional<String>) = vendorCode(vendorCode.orElse(null))

        /**
         * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`, `bnk_dev`,
         * `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`, `evolve`,
         * `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`, `us_bank`, or
         * others.
         */
        fun vendorCodeType(vendorCodeType: String?) = apply { body.vendorCodeType(vendorCodeType) }

        /**
         * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`, `bnk_dev`,
         * `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`, `evolve`,
         * `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`, `us_bank`, or
         * others.
         */
        fun vendorCodeType(vendorCodeType: Optional<String>) =
            vendorCodeType(vendorCodeType.orElse(null))

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata?) = apply { body.metadata(metadata) }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Optional<Metadata>) = metadata(metadata.orElse(null))

        /** This field will be `true` if the transaction has posted to the account. */
        fun posted(posted: Boolean?) = apply { body.posted(posted) }

        /** This field will be `true` if the transaction has posted to the account. */
        fun posted(posted: Boolean) = posted(posted as Boolean?)

        /** This field will be `true` if the transaction has posted to the account. */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun posted(posted: Optional<Boolean>) = posted(posted.orElse(null) as Boolean?)

        /**
         * The type of the transaction. Examples could be `card, `ach`, `wire`, `check`, `rtp`,
         * `book`, or `sen`.
         */
        fun type(type: Type?) = apply { body.type(type) }

        /**
         * The type of the transaction. Examples could be `card, `ach`, `wire`, `check`, `rtp`,
         * `book`, or `sen`.
         */
        fun type(type: Optional<Type>) = type(type.orElse(null))

        /**
         * The transaction detail text that often appears in on your bank statement and in your
         * banking portal.
         */
        fun vendorDescription(vendorDescription: String?) = apply {
            body.vendorDescription(vendorDescription)
        }

        /**
         * The transaction detail text that often appears in on your bank statement and in your
         * banking portal.
         */
        fun vendorDescription(vendorDescription: Optional<String>) =
            vendorDescription(vendorDescription.orElse(null))

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

        fun build(): TransactionCreateParams =
            TransactionCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @NoAutoDetect
    class Metadata
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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
                additionalProperties = metadata.additionalProperties.toMutableMap()
            }

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

            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ACH = of("ach")

            @JvmField val AU_BECS = of("au_becs")

            @JvmField val BACS = of("bacs")

            @JvmField val BOOK = of("book")

            @JvmField val CARD = of("card")

            @JvmField val CHATS = of("chats")

            @JvmField val CHECK = of("check")

            @JvmField val CROSS_BORDER = of("cross_border")

            @JvmField val DK_NETS = of("dk_nets")

            @JvmField val EFT = of("eft")

            @JvmField val HU_ICS = of("hu_ics")

            @JvmField val INTERAC = of("interac")

            @JvmField val MASAV = of("masav")

            @JvmField val MX_CCEN = of("mx_ccen")

            @JvmField val NEFT = of("neft")

            @JvmField val NICS = of("nics")

            @JvmField val NZ_BECS = of("nz_becs")

            @JvmField val PL_ELIXIR = of("pl_elixir")

            @JvmField val PROVXCHANGE = of("provxchange")

            @JvmField val RO_SENT = of("ro_sent")

            @JvmField val RTP = of("rtp")

            @JvmField val SE_BANKGIROT = of("se_bankgirot")

            @JvmField val SEN = of("sen")

            @JvmField val SEPA = of("sepa")

            @JvmField val SG_GIRO = of("sg_giro")

            @JvmField val SIC = of("sic")

            @JvmField val SIGNET = of("signet")

            @JvmField val SKNBI = of("sknbi")

            @JvmField val WIRE = of("wire")

            @JvmField val ZENGIN = of("zengin")

            @JvmField val OTHER = of("other")

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

        return /* spotless:off */ other is TransactionCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "TransactionCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
