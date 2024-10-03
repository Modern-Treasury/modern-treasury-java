// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException

class PaymentOrderSubtype
@JsonCreator
private constructor(
    private val value: JsonField<String>,
) : Enum {

    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentOrderSubtype && this.value == other.value /* spotless:on */
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()

    companion object {

        @JvmField val BACS_NEW_INSTRUCTION = PaymentOrderSubtype(JsonField.of("0C"))

        @JvmField val BACS_CANCELLATION_INSTRUCTION = PaymentOrderSubtype(JsonField.of("0N"))

        @JvmField val BACS_CONVERSION_INSTRUCTION = PaymentOrderSubtype(JsonField.of("0S"))

        @JvmField val CCD = PaymentOrderSubtype(JsonField.of("CCD"))

        @JvmField val CIE = PaymentOrderSubtype(JsonField.of("CIE"))

        @JvmField val CTX = PaymentOrderSubtype(JsonField.of("CTX"))

        @JvmField val IAT = PaymentOrderSubtype(JsonField.of("IAT"))

        @JvmField val PPD = PaymentOrderSubtype(JsonField.of("PPD"))

        @JvmField val TEL = PaymentOrderSubtype(JsonField.of("TEL"))

        @JvmField val WEB = PaymentOrderSubtype(JsonField.of("WEB"))

        @JvmField val AU_BECS = PaymentOrderSubtype(JsonField.of("au_becs"))

        @JvmField val BACS = PaymentOrderSubtype(JsonField.of("bacs"))

        @JvmField val CHATS = PaymentOrderSubtype(JsonField.of("chats"))

        @JvmField val DK_NETS = PaymentOrderSubtype(JsonField.of("dk_nets"))

        @JvmField val EFT = PaymentOrderSubtype(JsonField.of("eft"))

        @JvmField val HU_ICS = PaymentOrderSubtype(JsonField.of("hu_ics"))

        @JvmField val MASAV = PaymentOrderSubtype(JsonField.of("masav"))

        @JvmField val MX_CCEN = PaymentOrderSubtype(JsonField.of("mx_ccen"))

        @JvmField val NEFT = PaymentOrderSubtype(JsonField.of("neft"))

        @JvmField val NICS = PaymentOrderSubtype(JsonField.of("nics"))

        @JvmField val NZ_BECS = PaymentOrderSubtype(JsonField.of("nz_becs"))

        @JvmField val PL_ELIXIR = PaymentOrderSubtype(JsonField.of("pl_elixir"))

        @JvmField val RO_SENT = PaymentOrderSubtype(JsonField.of("ro_sent"))

        @JvmField val SE_BANKGIROT = PaymentOrderSubtype(JsonField.of("se_bankgirot"))

        @JvmField val SEPA = PaymentOrderSubtype(JsonField.of("sepa"))

        @JvmField val SG_GIRO = PaymentOrderSubtype(JsonField.of("sg_giro"))

        @JvmField val SIC = PaymentOrderSubtype(JsonField.of("sic"))

        @JvmField val SKNBI = PaymentOrderSubtype(JsonField.of("sknbi"))

        @JvmField val ZENGIN = PaymentOrderSubtype(JsonField.of("zengin"))

        @JvmStatic fun of(value: String) = PaymentOrderSubtype(JsonField.of(value))
    }

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
        _UNKNOWN,
    }

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

    fun asString(): String = _value().asStringOrThrow()
}
