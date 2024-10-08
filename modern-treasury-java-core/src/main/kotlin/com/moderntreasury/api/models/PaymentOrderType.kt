// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException

class PaymentOrderType
@JsonCreator
private constructor(
    private val value: JsonField<String>,
) : Enum {

    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentOrderType && this.value == other.value /* spotless:on */
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()

    companion object {

        @JvmField val ACH = PaymentOrderType(JsonField.of("ach"))

        @JvmField val AU_BECS = PaymentOrderType(JsonField.of("au_becs"))

        @JvmField val BACS = PaymentOrderType(JsonField.of("bacs"))

        @JvmField val BOOK = PaymentOrderType(JsonField.of("book"))

        @JvmField val CARD = PaymentOrderType(JsonField.of("card"))

        @JvmField val CHATS = PaymentOrderType(JsonField.of("chats"))

        @JvmField val CHECK = PaymentOrderType(JsonField.of("check"))

        @JvmField val CROSS_BORDER = PaymentOrderType(JsonField.of("cross_border"))

        @JvmField val DK_NETS = PaymentOrderType(JsonField.of("dk_nets"))

        @JvmField val EFT = PaymentOrderType(JsonField.of("eft"))

        @JvmField val HU_ICS = PaymentOrderType(JsonField.of("hu_ics"))

        @JvmField val INTERAC = PaymentOrderType(JsonField.of("interac"))

        @JvmField val MASAV = PaymentOrderType(JsonField.of("masav"))

        @JvmField val MX_CCEN = PaymentOrderType(JsonField.of("mx_ccen"))

        @JvmField val NEFT = PaymentOrderType(JsonField.of("neft"))

        @JvmField val NICS = PaymentOrderType(JsonField.of("nics"))

        @JvmField val NZ_BECS = PaymentOrderType(JsonField.of("nz_becs"))

        @JvmField val PL_ELIXIR = PaymentOrderType(JsonField.of("pl_elixir"))

        @JvmField val PROVXCHANGE = PaymentOrderType(JsonField.of("provxchange"))

        @JvmField val RO_SENT = PaymentOrderType(JsonField.of("ro_sent"))

        @JvmField val RTP = PaymentOrderType(JsonField.of("rtp"))

        @JvmField val SE_BANKGIROT = PaymentOrderType(JsonField.of("se_bankgirot"))

        @JvmField val SEN = PaymentOrderType(JsonField.of("sen"))

        @JvmField val SEPA = PaymentOrderType(JsonField.of("sepa"))

        @JvmField val SG_GIRO = PaymentOrderType(JsonField.of("sg_giro"))

        @JvmField val SIC = PaymentOrderType(JsonField.of("sic"))

        @JvmField val SIGNET = PaymentOrderType(JsonField.of("signet"))

        @JvmField val SKNBI = PaymentOrderType(JsonField.of("sknbi"))

        @JvmField val WIRE = PaymentOrderType(JsonField.of("wire"))

        @JvmField val ZENGIN = PaymentOrderType(JsonField.of("zengin"))

        @JvmStatic fun of(value: String) = PaymentOrderType(JsonField.of(value))
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
            else -> throw ModernTreasuryInvalidDataException("Unknown PaymentOrderType: $value")
        }

    fun asString(): String = _value().asStringOrThrow()
}
