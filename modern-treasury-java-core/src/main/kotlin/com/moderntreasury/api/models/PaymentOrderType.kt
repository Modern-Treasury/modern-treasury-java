package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException

class PaymentOrderType
@JsonCreator
private constructor(
    private val value: JsonField<String>,
) {

    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PaymentOrderType && this.value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()

    companion object {

        @JvmField val ACH = PaymentOrderType(JsonField.of("ach"))

        @JvmField val AU_BECS = PaymentOrderType(JsonField.of("au_becs"))

        @JvmField val BACS = PaymentOrderType(JsonField.of("bacs"))

        @JvmField val BOOK = PaymentOrderType(JsonField.of("book"))

        @JvmField val CARD = PaymentOrderType(JsonField.of("card"))

        @JvmField val CHECK = PaymentOrderType(JsonField.of("check"))

        @JvmField val CROSS_BORDER = PaymentOrderType(JsonField.of("cross_border"))

        @JvmField val EFT = PaymentOrderType(JsonField.of("eft"))

        @JvmField val INTERAC = PaymentOrderType(JsonField.of("interac"))

        @JvmField val MASAV = PaymentOrderType(JsonField.of("masav"))

        @JvmField val NEFT = PaymentOrderType(JsonField.of("neft"))

        @JvmField val PROVXCHANGE = PaymentOrderType(JsonField.of("provxchange"))

        @JvmField val RTP = PaymentOrderType(JsonField.of("rtp"))

        @JvmField val SEN = PaymentOrderType(JsonField.of("sen"))

        @JvmField val SEPA = PaymentOrderType(JsonField.of("sepa"))

        @JvmField val SIGNET = PaymentOrderType(JsonField.of("signet"))

        @JvmField val WIRE = PaymentOrderType(JsonField.of("wire"))

        @JvmStatic fun of(value: String) = PaymentOrderType(JsonField.of(value))
    }

    enum class Known {
        ACH,
        AU_BECS,
        BACS,
        BOOK,
        CARD,
        CHECK,
        CROSS_BORDER,
        EFT,
        INTERAC,
        MASAV,
        NEFT,
        PROVXCHANGE,
        RTP,
        SEN,
        SEPA,
        SIGNET,
        WIRE,
    }

    enum class Value {
        ACH,
        AU_BECS,
        BACS,
        BOOK,
        CARD,
        CHECK,
        CROSS_BORDER,
        EFT,
        INTERAC,
        MASAV,
        NEFT,
        PROVXCHANGE,
        RTP,
        SEN,
        SEPA,
        SIGNET,
        WIRE,
        _UNKNOWN,
    }

    fun value(): Value =
        when (this) {
            ACH -> Value.ACH
            AU_BECS -> Value.AU_BECS
            BACS -> Value.BACS
            BOOK -> Value.BOOK
            CARD -> Value.CARD
            CHECK -> Value.CHECK
            CROSS_BORDER -> Value.CROSS_BORDER
            EFT -> Value.EFT
            INTERAC -> Value.INTERAC
            MASAV -> Value.MASAV
            NEFT -> Value.NEFT
            PROVXCHANGE -> Value.PROVXCHANGE
            RTP -> Value.RTP
            SEN -> Value.SEN
            SEPA -> Value.SEPA
            SIGNET -> Value.SIGNET
            WIRE -> Value.WIRE
            else -> Value._UNKNOWN
        }

    fun known(): Known =
        when (this) {
            ACH -> Known.ACH
            AU_BECS -> Known.AU_BECS
            BACS -> Known.BACS
            BOOK -> Known.BOOK
            CARD -> Known.CARD
            CHECK -> Known.CHECK
            CROSS_BORDER -> Known.CROSS_BORDER
            EFT -> Known.EFT
            INTERAC -> Known.INTERAC
            MASAV -> Known.MASAV
            NEFT -> Known.NEFT
            PROVXCHANGE -> Known.PROVXCHANGE
            RTP -> Known.RTP
            SEN -> Known.SEN
            SEPA -> Known.SEPA
            SIGNET -> Known.SIGNET
            WIRE -> Known.WIRE
            else -> throw ModernTreasuryInvalidDataException("Unknown PaymentOrderType: $value")
        }

    fun asString(): String = _value().asStringOrThrow()
}
