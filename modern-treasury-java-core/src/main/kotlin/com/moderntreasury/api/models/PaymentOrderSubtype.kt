// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException

/**
 * An additional layer of classification for the type of payment order you are doing. This field is
 * only used for `ach` payment orders currently. For `ach` payment orders, the `subtype` represents
 * the SEC code. We currently support `CCD`, `PPD`, `IAT`, `CTX`, `WEB`, `CIE`, and `TEL`.
 */
class PaymentOrderSubtype @JsonCreator private constructor(private val value: JsonField<String>) :
    Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val BACS_NEW_INSTRUCTION = of("0C")

        @JvmField val BACS_CANCELLATION_INSTRUCTION = of("0N")

        @JvmField val BACS_CONVERSION_INSTRUCTION = of("0S")

        @JvmField val CCD = of("CCD")

        @JvmField val CIE = of("CIE")

        @JvmField val CTX = of("CTX")

        @JvmField val IAT = of("IAT")

        @JvmField val PPD = of("PPD")

        @JvmField val TEL = of("TEL")

        @JvmField val WEB = of("WEB")

        @JvmField val AU_BECS = of("au_becs")

        @JvmField val BACS = of("bacs")

        @JvmField val CHATS = of("chats")

        @JvmField val DK_NETS = of("dk_nets")

        @JvmField val EFT = of("eft")

        @JvmField val HU_ICS = of("hu_ics")

        @JvmField val MASAV = of("masav")

        @JvmField val MX_CCEN = of("mx_ccen")

        @JvmField val NEFT = of("neft")

        @JvmField val NICS = of("nics")

        @JvmField val NZ_BECS = of("nz_becs")

        @JvmField val PL_ELIXIR = of("pl_elixir")

        @JvmField val RO_SENT = of("ro_sent")

        @JvmField val SE_BANKGIROT = of("se_bankgirot")

        @JvmField val SEPA = of("sepa")

        @JvmField val SG_GIRO = of("sg_giro")

        @JvmField val SIC = of("sic")

        @JvmField val SKNBI = of("sknbi")

        @JvmField val ZENGIN = of("zengin")

        @JvmStatic fun of(value: String) = PaymentOrderSubtype(JsonField.of(value))
    }

    /** An enum containing [PaymentOrderSubtype]'s known values. */
    enum class Known {
        BACS_NEW_INSTRUCTION,
        BACS_CANCELLATION_INSTRUCTION,
        BACS_CONVERSION_INSTRUCTION,
        CCD,
        CIE,
        CTX,
        IAT,
        PPD,
        TEL,
        WEB,
        AU_BECS,
        BACS,
        CHATS,
        DK_NETS,
        EFT,
        HU_ICS,
        MASAV,
        MX_CCEN,
        NEFT,
        NICS,
        NZ_BECS,
        PL_ELIXIR,
        RO_SENT,
        SE_BANKGIROT,
        SEPA,
        SG_GIRO,
        SIC,
        SKNBI,
        ZENGIN,
    }

    /**
     * An enum containing [PaymentOrderSubtype]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [PaymentOrderSubtype] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        BACS_NEW_INSTRUCTION,
        BACS_CANCELLATION_INSTRUCTION,
        BACS_CONVERSION_INSTRUCTION,
        CCD,
        CIE,
        CTX,
        IAT,
        PPD,
        TEL,
        WEB,
        AU_BECS,
        BACS,
        CHATS,
        DK_NETS,
        EFT,
        HU_ICS,
        MASAV,
        MX_CCEN,
        NEFT,
        NICS,
        NZ_BECS,
        PL_ELIXIR,
        RO_SENT,
        SE_BANKGIROT,
        SEPA,
        SG_GIRO,
        SIC,
        SKNBI,
        ZENGIN,
        /**
         * An enum member indicating that [PaymentOrderSubtype] was instantiated with an unknown
         * value.
         */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
     */
    fun value(): Value =
        when (this) {
            BACS_NEW_INSTRUCTION -> Value.BACS_NEW_INSTRUCTION
            BACS_CANCELLATION_INSTRUCTION -> Value.BACS_CANCELLATION_INSTRUCTION
            BACS_CONVERSION_INSTRUCTION -> Value.BACS_CONVERSION_INSTRUCTION
            CCD -> Value.CCD
            CIE -> Value.CIE
            CTX -> Value.CTX
            IAT -> Value.IAT
            PPD -> Value.PPD
            TEL -> Value.TEL
            WEB -> Value.WEB
            AU_BECS -> Value.AU_BECS
            BACS -> Value.BACS
            CHATS -> Value.CHATS
            DK_NETS -> Value.DK_NETS
            EFT -> Value.EFT
            HU_ICS -> Value.HU_ICS
            MASAV -> Value.MASAV
            MX_CCEN -> Value.MX_CCEN
            NEFT -> Value.NEFT
            NICS -> Value.NICS
            NZ_BECS -> Value.NZ_BECS
            PL_ELIXIR -> Value.PL_ELIXIR
            RO_SENT -> Value.RO_SENT
            SE_BANKGIROT -> Value.SE_BANKGIROT
            SEPA -> Value.SEPA
            SG_GIRO -> Value.SG_GIRO
            SIC -> Value.SIC
            SKNBI -> Value.SKNBI
            ZENGIN -> Value.ZENGIN
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws ModernTreasuryInvalidDataException if this class instance's value is a not a known
     *   member.
     */
    fun known(): Known =
        when (this) {
            BACS_NEW_INSTRUCTION -> Known.BACS_NEW_INSTRUCTION
            BACS_CANCELLATION_INSTRUCTION -> Known.BACS_CANCELLATION_INSTRUCTION
            BACS_CONVERSION_INSTRUCTION -> Known.BACS_CONVERSION_INSTRUCTION
            CCD -> Known.CCD
            CIE -> Known.CIE
            CTX -> Known.CTX
            IAT -> Known.IAT
            PPD -> Known.PPD
            TEL -> Known.TEL
            WEB -> Known.WEB
            AU_BECS -> Known.AU_BECS
            BACS -> Known.BACS
            CHATS -> Known.CHATS
            DK_NETS -> Known.DK_NETS
            EFT -> Known.EFT
            HU_ICS -> Known.HU_ICS
            MASAV -> Known.MASAV
            MX_CCEN -> Known.MX_CCEN
            NEFT -> Known.NEFT
            NICS -> Known.NICS
            NZ_BECS -> Known.NZ_BECS
            PL_ELIXIR -> Known.PL_ELIXIR
            RO_SENT -> Known.RO_SENT
            SE_BANKGIROT -> Known.SE_BANKGIROT
            SEPA -> Known.SEPA
            SG_GIRO -> Known.SG_GIRO
            SIC -> Known.SIC
            SKNBI -> Known.SKNBI
            ZENGIN -> Known.ZENGIN
            else -> throw ModernTreasuryInvalidDataException("Unknown PaymentOrderSubtype: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws ModernTreasuryInvalidDataException if this class instance's value does not have the
     *   expected primitive type.
     */
    fun asString(): String =
        _value().asString().orElseThrow {
            ModernTreasuryInvalidDataException("Value is not a String")
        }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentOrderSubtype && value == other.value /* spotless:on */
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
