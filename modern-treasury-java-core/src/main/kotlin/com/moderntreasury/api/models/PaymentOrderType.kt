// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException

/**
 * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`, `bacs`,
 * `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`, `signet`,
 * `provexchange`, `zengin`.
 */
class PaymentOrderType @JsonCreator private constructor(private val value: JsonField<String>) :
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

        @JvmField val ACH = of("ach")

        @JvmField val AU_BECS = of("au_becs")

        @JvmField val BACS = of("bacs")

        @JvmField val BASE = of("base")

        @JvmField val BOOK = of("book")

        @JvmField val CARD = of("card")

        @JvmField val CHATS = of("chats")

        @JvmField val CHECK = of("check")

        @JvmField val CROSS_BORDER = of("cross_border")

        @JvmField val DK_NETS = of("dk_nets")

        @JvmField val EFT = of("eft")

        @JvmField val ETHEREUM = of("ethereum")

        @JvmField val HU_ICS = of("hu_ics")

        @JvmField val INTERAC = of("interac")

        @JvmField val MASAV = of("masav")

        @JvmField val MX_CCEN = of("mx_ccen")

        @JvmField val NEFT = of("neft")

        @JvmField val NICS = of("nics")

        @JvmField val NZ_BECS = of("nz_becs")

        @JvmField val PL_ELIXIR = of("pl_elixir")

        @JvmField val POLYGON = of("polygon")

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

        @JvmField val SOLANA = of("solana")

        @JvmField val WIRE = of("wire")

        @JvmField val ZENGIN = of("zengin")

        @JvmStatic fun of(value: String) = PaymentOrderType(JsonField.of(value))
    }

    /** An enum containing [PaymentOrderType]'s known values. */
    enum class Known {
        ACH,
        AU_BECS,
        BACS,
        BASE,
        BOOK,
        CARD,
        CHATS,
        CHECK,
        CROSS_BORDER,
        DK_NETS,
        EFT,
        ETHEREUM,
        HU_ICS,
        INTERAC,
        MASAV,
        MX_CCEN,
        NEFT,
        NICS,
        NZ_BECS,
        PL_ELIXIR,
        POLYGON,
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
        SOLANA,
        WIRE,
        ZENGIN,
    }

    /**
     * An enum containing [PaymentOrderType]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [PaymentOrderType] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        ACH,
        AU_BECS,
        BACS,
        BASE,
        BOOK,
        CARD,
        CHATS,
        CHECK,
        CROSS_BORDER,
        DK_NETS,
        EFT,
        ETHEREUM,
        HU_ICS,
        INTERAC,
        MASAV,
        MX_CCEN,
        NEFT,
        NICS,
        NZ_BECS,
        PL_ELIXIR,
        POLYGON,
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
        SOLANA,
        WIRE,
        ZENGIN,
        /**
         * An enum member indicating that [PaymentOrderType] was instantiated with an unknown value.
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
            ACH -> Value.ACH
            AU_BECS -> Value.AU_BECS
            BACS -> Value.BACS
            BASE -> Value.BASE
            BOOK -> Value.BOOK
            CARD -> Value.CARD
            CHATS -> Value.CHATS
            CHECK -> Value.CHECK
            CROSS_BORDER -> Value.CROSS_BORDER
            DK_NETS -> Value.DK_NETS
            EFT -> Value.EFT
            ETHEREUM -> Value.ETHEREUM
            HU_ICS -> Value.HU_ICS
            INTERAC -> Value.INTERAC
            MASAV -> Value.MASAV
            MX_CCEN -> Value.MX_CCEN
            NEFT -> Value.NEFT
            NICS -> Value.NICS
            NZ_BECS -> Value.NZ_BECS
            PL_ELIXIR -> Value.PL_ELIXIR
            POLYGON -> Value.POLYGON
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
            SOLANA -> Value.SOLANA
            WIRE -> Value.WIRE
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
            ACH -> Known.ACH
            AU_BECS -> Known.AU_BECS
            BACS -> Known.BACS
            BASE -> Known.BASE
            BOOK -> Known.BOOK
            CARD -> Known.CARD
            CHATS -> Known.CHATS
            CHECK -> Known.CHECK
            CROSS_BORDER -> Known.CROSS_BORDER
            DK_NETS -> Known.DK_NETS
            EFT -> Known.EFT
            ETHEREUM -> Known.ETHEREUM
            HU_ICS -> Known.HU_ICS
            INTERAC -> Known.INTERAC
            MASAV -> Known.MASAV
            MX_CCEN -> Known.MX_CCEN
            NEFT -> Known.NEFT
            NICS -> Known.NICS
            NZ_BECS -> Known.NZ_BECS
            PL_ELIXIR -> Known.PL_ELIXIR
            POLYGON -> Known.POLYGON
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
            SOLANA -> Known.SOLANA
            WIRE -> Known.WIRE
            ZENGIN -> Known.ZENGIN
            else -> throw ModernTreasuryInvalidDataException("Unknown PaymentOrderType: $value")
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

    private var validated: Boolean = false

    fun validate(): PaymentOrderType = apply {
        if (validated) {
            return@apply
        }

        known()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: ModernTreasuryInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PaymentOrderType && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
