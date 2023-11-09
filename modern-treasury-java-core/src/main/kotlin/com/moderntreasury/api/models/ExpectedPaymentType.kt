// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException

class ExpectedPaymentType
@JsonCreator
private constructor(
    private val value: JsonField<String>,
) {

    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExpectedPaymentType && this.value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()

    companion object {

        @JvmField val ACH = ExpectedPaymentType(JsonField.of("ach"))

        @JvmField val AU_BECS = ExpectedPaymentType(JsonField.of("au_becs"))

        @JvmField val BACS = ExpectedPaymentType(JsonField.of("bacs"))

        @JvmField val BOOK = ExpectedPaymentType(JsonField.of("book"))

        @JvmField val CARD = ExpectedPaymentType(JsonField.of("card"))

        @JvmField val CHATS = ExpectedPaymentType(JsonField.of("chats"))

        @JvmField val CHECK = ExpectedPaymentType(JsonField.of("check"))

        @JvmField val CROSS_BORDER = ExpectedPaymentType(JsonField.of("cross_border"))

        @JvmField val DK_NETS = ExpectedPaymentType(JsonField.of("dk_nets"))

        @JvmField val EFT = ExpectedPaymentType(JsonField.of("eft"))

        @JvmField val INTERAC = ExpectedPaymentType(JsonField.of("interac"))

        @JvmField val MASAV = ExpectedPaymentType(JsonField.of("masav"))

        @JvmField val NEFT = ExpectedPaymentType(JsonField.of("neft"))

        @JvmField val NICS = ExpectedPaymentType(JsonField.of("nics"))

        @JvmField val NZ_BECS = ExpectedPaymentType(JsonField.of("nz_becs"))

        @JvmField val PROVXCHANGE = ExpectedPaymentType(JsonField.of("provxchange"))

        @JvmField val RTP = ExpectedPaymentType(JsonField.of("rtp"))

        @JvmField val SE_BANKGIROT = ExpectedPaymentType(JsonField.of("se_bankgirot"))

        @JvmField val SEN = ExpectedPaymentType(JsonField.of("sen"))

        @JvmField val SEPA = ExpectedPaymentType(JsonField.of("sepa"))

        @JvmField val SG_GIRO = ExpectedPaymentType(JsonField.of("sg_giro"))

        @JvmField val SIC = ExpectedPaymentType(JsonField.of("sic"))

        @JvmField val SIGNET = ExpectedPaymentType(JsonField.of("signet"))

        @JvmField val WIRE = ExpectedPaymentType(JsonField.of("wire"))

        @JvmField val ZENGIN = ExpectedPaymentType(JsonField.of("zengin"))

        @JvmStatic fun of(value: String) = ExpectedPaymentType(JsonField.of(value))
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
        INTERAC,
        MASAV,
        NEFT,
        NICS,
        NZ_BECS,
        PROVXCHANGE,
        RTP,
        SE_BANKGIROT,
        SEN,
        SEPA,
        SG_GIRO,
        SIC,
        SIGNET,
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
        INTERAC,
        MASAV,
        NEFT,
        NICS,
        NZ_BECS,
        PROVXCHANGE,
        RTP,
        SE_BANKGIROT,
        SEN,
        SEPA,
        SG_GIRO,
        SIC,
        SIGNET,
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
            INTERAC -> Value.INTERAC
            MASAV -> Value.MASAV
            NEFT -> Value.NEFT
            NICS -> Value.NICS
            NZ_BECS -> Value.NZ_BECS
            PROVXCHANGE -> Value.PROVXCHANGE
            RTP -> Value.RTP
            SE_BANKGIROT -> Value.SE_BANKGIROT
            SEN -> Value.SEN
            SEPA -> Value.SEPA
            SG_GIRO -> Value.SG_GIRO
            SIC -> Value.SIC
            SIGNET -> Value.SIGNET
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
            INTERAC -> Known.INTERAC
            MASAV -> Known.MASAV
            NEFT -> Known.NEFT
            NICS -> Known.NICS
            NZ_BECS -> Known.NZ_BECS
            PROVXCHANGE -> Known.PROVXCHANGE
            RTP -> Known.RTP
            SE_BANKGIROT -> Known.SE_BANKGIROT
            SEN -> Known.SEN
            SEPA -> Known.SEPA
            SG_GIRO -> Known.SG_GIRO
            SIC -> Known.SIC
            SIGNET -> Known.SIGNET
            WIRE -> Known.WIRE
            ZENGIN -> Known.ZENGIN
            else -> throw ModernTreasuryInvalidDataException("Unknown ExpectedPaymentType: $value")
        }

    fun asString(): String = _value().asStringOrThrow()
}
