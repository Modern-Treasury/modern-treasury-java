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
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = RoutingNumberLookupRequest.Builder::class)
@NoAutoDetect
class RoutingNumberLookupRequest
private constructor(
    private val routingNumber: JsonField<String>,
    private val routingNumberType: JsonField<RoutingNumberType>,
    private val supportedPaymentTypes: JsonField<List<SupportedPaymentType>>,
    private val bankName: JsonField<String>,
    private val bankAddress: JsonField<AddressRequest>,
    private val sanctions: JsonField<Sanctions>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** The routing number of the bank. */
    fun routingNumber(): Optional<String> =
        Optional.ofNullable(routingNumber.getNullable("routing_number"))

    /**
     * The type of routing number. See
     * https://docs.moderntreasury.com/platform/reference/routing-detail-object for more details. In
     * sandbox mode we currently only support `aba` and `swift` with routing numbers '123456789' and
     * 'GRINUST0XXX' respectively.
     */
    fun routingNumberType(): Optional<RoutingNumberType> =
        Optional.ofNullable(routingNumberType.getNullable("routing_number_type"))

    /**
     * An array of payment types that are supported for this routing number. This can include `ach`,
     * `wire`, `rtp`, `sepa`, `bacs`, `au_becs` currently.
     */
    fun supportedPaymentTypes(): Optional<List<SupportedPaymentType>> =
        Optional.ofNullable(supportedPaymentTypes.getNullable("supported_payment_types"))

    /** The name of the bank. */
    fun bankName(): Optional<String> = Optional.ofNullable(bankName.getNullable("bank_name"))

    /** The address of the bank. */
    fun bankAddress(): Optional<AddressRequest> =
        Optional.ofNullable(bankAddress.getNullable("bank_address"))

    /**
     * An object containing key-value pairs, each with a sanctions list as the key and a boolean
     * value representing whether the bank is on that particular sanctions list. Currently, this
     * includes eu_con, uk_hmt, us_ofac, and un sanctions lists.
     */
    fun sanctions(): Optional<Sanctions> = Optional.ofNullable(sanctions.getNullable("sanctions"))

    /** The routing number of the bank. */
    @JsonProperty("routing_number") @ExcludeMissing fun _routingNumber() = routingNumber

    /**
     * The type of routing number. See
     * https://docs.moderntreasury.com/platform/reference/routing-detail-object for more details. In
     * sandbox mode we currently only support `aba` and `swift` with routing numbers '123456789' and
     * 'GRINUST0XXX' respectively.
     */
    @JsonProperty("routing_number_type")
    @ExcludeMissing
    fun _routingNumberType() = routingNumberType

    /**
     * An array of payment types that are supported for this routing number. This can include `ach`,
     * `wire`, `rtp`, `sepa`, `bacs`, `au_becs` currently.
     */
    @JsonProperty("supported_payment_types")
    @ExcludeMissing
    fun _supportedPaymentTypes() = supportedPaymentTypes

    /** The name of the bank. */
    @JsonProperty("bank_name") @ExcludeMissing fun _bankName() = bankName

    /** The address of the bank. */
    @JsonProperty("bank_address") @ExcludeMissing fun _bankAddress() = bankAddress

    /**
     * An object containing key-value pairs, each with a sanctions list as the key and a boolean
     * value representing whether the bank is on that particular sanctions list. Currently, this
     * includes eu_con, uk_hmt, us_ofac, and un sanctions lists.
     */
    @JsonProperty("sanctions") @ExcludeMissing fun _sanctions() = sanctions

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): RoutingNumberLookupRequest = apply {
        if (!validated) {
            routingNumber()
            routingNumberType()
            supportedPaymentTypes()
            bankName()
            bankAddress().map { it.validate() }
            sanctions().map { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var routingNumber: JsonField<String> = JsonMissing.of()
        private var routingNumberType: JsonField<RoutingNumberType> = JsonMissing.of()
        private var supportedPaymentTypes: JsonField<List<SupportedPaymentType>> = JsonMissing.of()
        private var bankName: JsonField<String> = JsonMissing.of()
        private var bankAddress: JsonField<AddressRequest> = JsonMissing.of()
        private var sanctions: JsonField<Sanctions> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(routingNumberLookupRequest: RoutingNumberLookupRequest) = apply {
            this.routingNumber = routingNumberLookupRequest.routingNumber
            this.routingNumberType = routingNumberLookupRequest.routingNumberType
            this.supportedPaymentTypes = routingNumberLookupRequest.supportedPaymentTypes
            this.bankName = routingNumberLookupRequest.bankName
            this.bankAddress = routingNumberLookupRequest.bankAddress
            this.sanctions = routingNumberLookupRequest.sanctions
            additionalProperties(routingNumberLookupRequest.additionalProperties)
        }

        /** The routing number of the bank. */
        fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

        /** The routing number of the bank. */
        @JsonProperty("routing_number")
        @ExcludeMissing
        fun routingNumber(routingNumber: JsonField<String>) = apply {
            this.routingNumber = routingNumber
        }

        /**
         * The type of routing number. See
         * https://docs.moderntreasury.com/platform/reference/routing-detail-object for more
         * details. In sandbox mode we currently only support `aba` and `swift` with routing numbers
         * '123456789' and 'GRINUST0XXX' respectively.
         */
        fun routingNumberType(routingNumberType: RoutingNumberType) =
            routingNumberType(JsonField.of(routingNumberType))

        /**
         * The type of routing number. See
         * https://docs.moderntreasury.com/platform/reference/routing-detail-object for more
         * details. In sandbox mode we currently only support `aba` and `swift` with routing numbers
         * '123456789' and 'GRINUST0XXX' respectively.
         */
        @JsonProperty("routing_number_type")
        @ExcludeMissing
        fun routingNumberType(routingNumberType: JsonField<RoutingNumberType>) = apply {
            this.routingNumberType = routingNumberType
        }

        /**
         * An array of payment types that are supported for this routing number. This can include
         * `ach`, `wire`, `rtp`, `sepa`, `bacs`, `au_becs` currently.
         */
        fun supportedPaymentTypes(supportedPaymentTypes: List<SupportedPaymentType>) =
            supportedPaymentTypes(JsonField.of(supportedPaymentTypes))

        /**
         * An array of payment types that are supported for this routing number. This can include
         * `ach`, `wire`, `rtp`, `sepa`, `bacs`, `au_becs` currently.
         */
        @JsonProperty("supported_payment_types")
        @ExcludeMissing
        fun supportedPaymentTypes(supportedPaymentTypes: JsonField<List<SupportedPaymentType>>) =
            apply {
                this.supportedPaymentTypes = supportedPaymentTypes
            }

        /** The name of the bank. */
        fun bankName(bankName: String) = bankName(JsonField.of(bankName))

        /** The name of the bank. */
        @JsonProperty("bank_name")
        @ExcludeMissing
        fun bankName(bankName: JsonField<String>) = apply { this.bankName = bankName }

        /** The address of the bank. */
        fun bankAddress(bankAddress: AddressRequest) = bankAddress(JsonField.of(bankAddress))

        /** The address of the bank. */
        @JsonProperty("bank_address")
        @ExcludeMissing
        fun bankAddress(bankAddress: JsonField<AddressRequest>) = apply {
            this.bankAddress = bankAddress
        }

        /**
         * An object containing key-value pairs, each with a sanctions list as the key and a boolean
         * value representing whether the bank is on that particular sanctions list. Currently, this
         * includes eu_con, uk_hmt, us_ofac, and un sanctions lists.
         */
        fun sanctions(sanctions: Sanctions) = sanctions(JsonField.of(sanctions))

        /**
         * An object containing key-value pairs, each with a sanctions list as the key and a boolean
         * value representing whether the bank is on that particular sanctions list. Currently, this
         * includes eu_con, uk_hmt, us_ofac, and un sanctions lists.
         */
        @JsonProperty("sanctions")
        @ExcludeMissing
        fun sanctions(sanctions: JsonField<Sanctions>) = apply { this.sanctions = sanctions }

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

        fun build(): RoutingNumberLookupRequest =
            RoutingNumberLookupRequest(
                routingNumber,
                routingNumberType,
                supportedPaymentTypes.map { it.toImmutable() },
                bankName,
                bankAddress,
                sanctions,
                additionalProperties.toImmutable(),
            )
    }

    /** The address of the bank. */
    @JsonDeserialize(builder = AddressRequest.Builder::class)
    @NoAutoDetect
    class AddressRequest
    private constructor(
        private val line1: JsonField<String>,
        private val line2: JsonField<String>,
        private val locality: JsonField<String>,
        private val region: JsonField<String>,
        private val postalCode: JsonField<String>,
        private val country: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun line1(): Optional<String> = Optional.ofNullable(line1.getNullable("line1"))

        fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

        /** Locality or City. */
        fun locality(): Optional<String> = Optional.ofNullable(locality.getNullable("locality"))

        /** Region or State. */
        fun region(): Optional<String> = Optional.ofNullable(region.getNullable("region"))

        /** The postal code of the address. */
        fun postalCode(): Optional<String> =
            Optional.ofNullable(postalCode.getNullable("postal_code"))

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        fun country(): Optional<String> = Optional.ofNullable(country.getNullable("country"))

        @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

        @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

        /** Locality or City. */
        @JsonProperty("locality") @ExcludeMissing fun _locality() = locality

        /** Region or State. */
        @JsonProperty("region") @ExcludeMissing fun _region() = region

        /** The postal code of the address. */
        @JsonProperty("postal_code") @ExcludeMissing fun _postalCode() = postalCode

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        @JsonProperty("country") @ExcludeMissing fun _country() = country

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): AddressRequest = apply {
            if (!validated) {
                line1()
                line2()
                locality()
                region()
                postalCode()
                country()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var line1: JsonField<String> = JsonMissing.of()
            private var line2: JsonField<String> = JsonMissing.of()
            private var locality: JsonField<String> = JsonMissing.of()
            private var region: JsonField<String> = JsonMissing.of()
            private var postalCode: JsonField<String> = JsonMissing.of()
            private var country: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(addressRequest: AddressRequest) = apply {
                this.line1 = addressRequest.line1
                this.line2 = addressRequest.line2
                this.locality = addressRequest.locality
                this.region = addressRequest.region
                this.postalCode = addressRequest.postalCode
                this.country = addressRequest.country
                additionalProperties(addressRequest.additionalProperties)
            }

            fun line1(line1: String) = line1(JsonField.of(line1))

            @JsonProperty("line1")
            @ExcludeMissing
            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            fun line2(line2: String) = line2(JsonField.of(line2))

            @JsonProperty("line2")
            @ExcludeMissing
            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

            /** Locality or City. */
            fun locality(locality: String) = locality(JsonField.of(locality))

            /** Locality or City. */
            @JsonProperty("locality")
            @ExcludeMissing
            fun locality(locality: JsonField<String>) = apply { this.locality = locality }

            /** Region or State. */
            fun region(region: String) = region(JsonField.of(region))

            /** Region or State. */
            @JsonProperty("region")
            @ExcludeMissing
            fun region(region: JsonField<String>) = apply { this.region = region }

            /** The postal code of the address. */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /** The postal code of the address. */
            @JsonProperty("postal_code")
            @ExcludeMissing
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: String) = country(JsonField.of(country))

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            @JsonProperty("country")
            @ExcludeMissing
            fun country(country: JsonField<String>) = apply { this.country = country }

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

            fun build(): AddressRequest =
                AddressRequest(
                    line1,
                    line2,
                    locality,
                    region,
                    postalCode,
                    country,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AddressRequest && line1 == other.line1 && line2 == other.line2 && locality == other.locality && region == other.region && postalCode == other.postalCode && country == other.country && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(line1, line2, locality, region, postalCode, country, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AddressRequest{line1=$line1, line2=$line2, locality=$locality, region=$region, postalCode=$postalCode, country=$country, additionalProperties=$additionalProperties}"
    }

    class RoutingNumberType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ABA = of("aba")

            @JvmField val AU_BSB = of("au_bsb")

            @JvmField val CA_CPA = of("ca_cpa")

            @JvmField val GB_SORT_CODE = of("gb_sort_code")

            @JvmField val IN_IFSC = of("in_ifsc")

            @JvmField val NZ_NATIONAL_CLEARING_CODE = of("nz_national_clearing_code")

            @JvmField val SE_BANKGIRO_CLEARING_CODE = of("se_bankgiro_clearing_code")

            @JvmField val SWIFT = of("swift")

            @JvmStatic fun of(value: String) = RoutingNumberType(JsonField.of(value))
        }

        enum class Known {
            ABA,
            AU_BSB,
            CA_CPA,
            GB_SORT_CODE,
            IN_IFSC,
            NZ_NATIONAL_CLEARING_CODE,
            SE_BANKGIRO_CLEARING_CODE,
            SWIFT,
        }

        enum class Value {
            ABA,
            AU_BSB,
            CA_CPA,
            GB_SORT_CODE,
            IN_IFSC,
            NZ_NATIONAL_CLEARING_CODE,
            SE_BANKGIRO_CLEARING_CODE,
            SWIFT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ABA -> Value.ABA
                AU_BSB -> Value.AU_BSB
                CA_CPA -> Value.CA_CPA
                GB_SORT_CODE -> Value.GB_SORT_CODE
                IN_IFSC -> Value.IN_IFSC
                NZ_NATIONAL_CLEARING_CODE -> Value.NZ_NATIONAL_CLEARING_CODE
                SE_BANKGIRO_CLEARING_CODE -> Value.SE_BANKGIRO_CLEARING_CODE
                SWIFT -> Value.SWIFT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ABA -> Known.ABA
                AU_BSB -> Known.AU_BSB
                CA_CPA -> Known.CA_CPA
                GB_SORT_CODE -> Known.GB_SORT_CODE
                IN_IFSC -> Known.IN_IFSC
                NZ_NATIONAL_CLEARING_CODE -> Known.NZ_NATIONAL_CLEARING_CODE
                SE_BANKGIRO_CLEARING_CODE -> Known.SE_BANKGIRO_CLEARING_CODE
                SWIFT -> Known.SWIFT
                else ->
                    throw ModernTreasuryInvalidDataException("Unknown RoutingNumberType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RoutingNumberType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * An object containing key-value pairs, each with a sanctions list as the key and a boolean
     * value representing whether the bank is on that particular sanctions list. Currently, this
     * includes eu_con, uk_hmt, us_ofac, and un sanctions lists.
     */
    @JsonDeserialize(builder = Sanctions.Builder::class)
    @NoAutoDetect
    class Sanctions
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Sanctions = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(sanctions: Sanctions) = apply {
                additionalProperties(sanctions.additionalProperties)
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

            fun build(): Sanctions = Sanctions(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Sanctions && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Sanctions{additionalProperties=$additionalProperties}"
    }

    class SupportedPaymentType
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

            @JvmStatic fun of(value: String) = SupportedPaymentType(JsonField.of(value))
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
                else ->
                    throw ModernTreasuryInvalidDataException("Unknown SupportedPaymentType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SupportedPaymentType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RoutingNumberLookupRequest && routingNumber == other.routingNumber && routingNumberType == other.routingNumberType && supportedPaymentTypes == other.supportedPaymentTypes && bankName == other.bankName && bankAddress == other.bankAddress && sanctions == other.sanctions && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(routingNumber, routingNumberType, supportedPaymentTypes, bankName, bankAddress, sanctions, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RoutingNumberLookupRequest{routingNumber=$routingNumber, routingNumberType=$routingNumberType, supportedPaymentTypes=$supportedPaymentTypes, bankName=$bankName, bankAddress=$bankAddress, sanctions=$sanctions, additionalProperties=$additionalProperties}"
}
