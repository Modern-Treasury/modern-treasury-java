package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException

class ExternalAccountType
@JsonCreator
private constructor(
    private val value: JsonField<String>,
) {

    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalAccountType && this.value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()

    companion object {

        @JvmField val CASH = ExternalAccountType(JsonField.of("cash"))

        @JvmField val CHECKING = ExternalAccountType(JsonField.of("checking"))

        @JvmField val LOAN = ExternalAccountType(JsonField.of("loan"))

        @JvmField val NON_RESIDENT = ExternalAccountType(JsonField.of("non_resident"))

        @JvmField val OTHER = ExternalAccountType(JsonField.of("other"))

        @JvmField val OVERDRAFT = ExternalAccountType(JsonField.of("overdraft"))

        @JvmField val SAVINGS = ExternalAccountType(JsonField.of("savings"))

        @JvmStatic fun of(value: String) = ExternalAccountType(JsonField.of(value))
    }

    enum class Known {
        CASH,
        CHECKING,
        LOAN,
        NON_RESIDENT,
        OTHER,
        OVERDRAFT,
        SAVINGS,
    }

    enum class Value {
        CASH,
        CHECKING,
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
            LOAN -> Known.LOAN
            NON_RESIDENT -> Known.NON_RESIDENT
            OTHER -> Known.OTHER
            OVERDRAFT -> Known.OVERDRAFT
            SAVINGS -> Known.SAVINGS
            else -> throw ModernTreasuryInvalidDataException("Unknown ExternalAccountType: $value")
        }

    fun asString(): String = _value().asStringOrThrow()
}
