// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException

class ExternalAccountType
@JsonCreator
private constructor(
    private val value: JsonField<String>,
) : Enum {

    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val CASH = of("cash")

        @JvmField val CHECKING = of("checking")

        @JvmField val GENERAL_LEDGER = of("general_ledger")

        @JvmField val LOAN = of("loan")

        @JvmField val NON_RESIDENT = of("non_resident")

        @JvmField val OTHER = of("other")

        @JvmField val OVERDRAFT = of("overdraft")

        @JvmField val SAVINGS = of("savings")

        @JvmStatic fun of(value: String) = ExternalAccountType(JsonField.of(value))
    }

    enum class Known {
        CASH,
        CHECKING,
        GENERAL_LEDGER,
        LOAN,
        NON_RESIDENT,
        OTHER,
        OVERDRAFT,
        SAVINGS,
    }

    enum class Value {
        CASH,
        CHECKING,
        GENERAL_LEDGER,
        LOAN,
        NON_RESIDENT,
        OTHER,
        OVERDRAFT,
        SAVINGS,
        _UNKNOWN,
    }

    fun value(): Value =
        when (this) {
            CASH -> Value.CASH
            CHECKING -> Value.CHECKING
            GENERAL_LEDGER -> Value.GENERAL_LEDGER
            LOAN -> Value.LOAN
            NON_RESIDENT -> Value.NON_RESIDENT
            OTHER -> Value.OTHER
            OVERDRAFT -> Value.OVERDRAFT
            SAVINGS -> Value.SAVINGS
            else -> Value._UNKNOWN
        }

    fun known(): Known =
        when (this) {
            CASH -> Known.CASH
            CHECKING -> Known.CHECKING
            GENERAL_LEDGER -> Known.GENERAL_LEDGER
            LOAN -> Known.LOAN
            NON_RESIDENT -> Known.NON_RESIDENT
            OTHER -> Known.OTHER
            OVERDRAFT -> Known.OVERDRAFT
            SAVINGS -> Known.SAVINGS
            else -> throw ModernTreasuryInvalidDataException("Unknown ExternalAccountType: $value")
        }

    fun asString(): String = _value().asStringOrThrow()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalAccountType && value == other.value /* spotless:on */
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
