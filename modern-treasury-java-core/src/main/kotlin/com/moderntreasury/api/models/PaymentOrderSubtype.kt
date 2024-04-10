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

        return other is PaymentOrderSubtype && this.value == other.value
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
            else -> throw ModernTreasuryInvalidDataException("Unknown PaymentOrderSubtype: $value")
        }

    fun asString(): String = _value().asStringOrThrow()
}
