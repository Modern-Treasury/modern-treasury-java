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
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import com.moderntreasury.api.models.*
import java.time.LocalDate
import java.util.Objects
import java.util.Optional

class ReturnCreateParams
constructor(
    private val returnableId: String?,
    private val returnableType: ReturnableType,
    private val additionalInformation: String?,
    private val code: Code?,
    private val dateOfDeath: LocalDate?,
    private val reason: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun returnableId(): Optional<String> = Optional.ofNullable(returnableId)

    fun returnableType(): ReturnableType = returnableType

    fun additionalInformation(): Optional<String> = Optional.ofNullable(additionalInformation)

    fun code(): Optional<Code> = Optional.ofNullable(code)

    fun dateOfDeath(): Optional<LocalDate> = Optional.ofNullable(dateOfDeath)

    fun reason(): Optional<String> = Optional.ofNullable(reason)

    @JvmSynthetic
    internal fun getBody(): ReturnCreateBody {
        return ReturnCreateBody(
            returnableId,
            returnableType,
            additionalInformation,
            code,
            dateOfDeath,
            reason,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = ReturnCreateBody.Builder::class)
    @NoAutoDetect
    class ReturnCreateBody
    internal constructor(
        private val returnableId: String?,
        private val returnableType: ReturnableType?,
        private val additionalInformation: String?,
        private val code: Code?,
        private val dateOfDeath: LocalDate?,
        private val reason: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The ID of the object being returned or `null`. */
        @JsonProperty("returnable_id") fun returnableId(): String? = returnableId

        /**
         * The type of object being returned. Currently, this may only be incoming_payment_detail.
         */
        @JsonProperty("returnable_type") fun returnableType(): ReturnableType? = returnableType

        /**
         * Some returns may include additional information from the bank. In these cases, this
         * string will be present.
         */
        @JsonProperty("additional_information")
        fun additionalInformation(): String? = additionalInformation

        /** The return code. For ACH returns, this is the required ACH return code. */
        @JsonProperty("code") fun code(): Code? = code

        /**
         * If the return code is `R14` or `R15` this is the date the deceased counterparty passed
         * away.
         */
        @JsonProperty("date_of_death") fun dateOfDeath(): LocalDate? = dateOfDeath

        /**
         * An optional description of the reason for the return. This is for internal usage and will
         * not be transmitted to the bank.”
         */
        @JsonProperty("reason") fun reason(): String? = reason

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var returnableId: String? = null
            private var returnableType: ReturnableType? = null
            private var additionalInformation: String? = null
            private var code: Code? = null
            private var dateOfDeath: LocalDate? = null
            private var reason: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(returnCreateBody: ReturnCreateBody) = apply {
                this.returnableId = returnCreateBody.returnableId
                this.returnableType = returnCreateBody.returnableType
                this.additionalInformation = returnCreateBody.additionalInformation
                this.code = returnCreateBody.code
                this.dateOfDeath = returnCreateBody.dateOfDeath
                this.reason = returnCreateBody.reason
                additionalProperties(returnCreateBody.additionalProperties)
            }

            /** The ID of the object being returned or `null`. */
            @JsonProperty("returnable_id")
            fun returnableId(returnableId: String) = apply { this.returnableId = returnableId }

            /**
             * The type of object being returned. Currently, this may only be
             * incoming_payment_detail.
             */
            @JsonProperty("returnable_type")
            fun returnableType(returnableType: ReturnableType) = apply {
                this.returnableType = returnableType
            }

            /**
             * Some returns may include additional information from the bank. In these cases, this
             * string will be present.
             */
            @JsonProperty("additional_information")
            fun additionalInformation(additionalInformation: String) = apply {
                this.additionalInformation = additionalInformation
            }

            /** The return code. For ACH returns, this is the required ACH return code. */
            @JsonProperty("code") fun code(code: Code) = apply { this.code = code }

            /**
             * If the return code is `R14` or `R15` this is the date the deceased counterparty
             * passed away.
             */
            @JsonProperty("date_of_death")
            fun dateOfDeath(dateOfDeath: LocalDate) = apply { this.dateOfDeath = dateOfDeath }

            /**
             * An optional description of the reason for the return. This is for internal usage and
             * will not be transmitted to the bank.”
             */
            @JsonProperty("reason") fun reason(reason: String) = apply { this.reason = reason }

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

            fun build(): ReturnCreateBody =
                ReturnCreateBody(
                    returnableId,
                    checkNotNull(returnableType) { "`returnableType` is required but was not set" },
                    additionalInformation,
                    code,
                    dateOfDeath,
                    reason,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ReturnCreateBody && this.returnableId == other.returnableId && this.returnableType == other.returnableType && this.additionalInformation == other.additionalInformation && this.code == other.code && this.dateOfDeath == other.dateOfDeath && this.reason == other.reason && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(returnableId, returnableType, additionalInformation, code, dateOfDeath, reason, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ReturnCreateBody{returnableId=$returnableId, returnableType=$returnableType, additionalInformation=$additionalInformation, code=$code, dateOfDeath=$dateOfDeath, reason=$reason, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ReturnCreateParams && this.returnableId == other.returnableId && this.returnableType == other.returnableType && this.additionalInformation == other.additionalInformation && this.code == other.code && this.dateOfDeath == other.dateOfDeath && this.reason == other.reason && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(returnableId, returnableType, additionalInformation, code, dateOfDeath, reason, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "ReturnCreateParams{returnableId=$returnableId, returnableType=$returnableType, additionalInformation=$additionalInformation, code=$code, dateOfDeath=$dateOfDeath, reason=$reason, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var returnableId: String? = null
        private var returnableType: ReturnableType? = null
        private var additionalInformation: String? = null
        private var code: Code? = null
        private var dateOfDeath: LocalDate? = null
        private var reason: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(returnCreateParams: ReturnCreateParams) = apply {
            this.returnableId = returnCreateParams.returnableId
            this.returnableType = returnCreateParams.returnableType
            this.additionalInformation = returnCreateParams.additionalInformation
            this.code = returnCreateParams.code
            this.dateOfDeath = returnCreateParams.dateOfDeath
            this.reason = returnCreateParams.reason
            additionalQueryParams(returnCreateParams.additionalQueryParams)
            additionalHeaders(returnCreateParams.additionalHeaders)
            additionalBodyProperties(returnCreateParams.additionalBodyProperties)
        }

        /** The ID of the object being returned or `null`. */
        fun returnableId(returnableId: String) = apply { this.returnableId = returnableId }

        /**
         * The type of object being returned. Currently, this may only be incoming_payment_detail.
         */
        fun returnableType(returnableType: ReturnableType) = apply {
            this.returnableType = returnableType
        }

        /**
         * Some returns may include additional information from the bank. In these cases, this
         * string will be present.
         */
        fun additionalInformation(additionalInformation: String) = apply {
            this.additionalInformation = additionalInformation
        }

        /** The return code. For ACH returns, this is the required ACH return code. */
        fun code(code: Code) = apply { this.code = code }

        /**
         * If the return code is `R14` or `R15` this is the date the deceased counterparty passed
         * away.
         */
        fun dateOfDeath(dateOfDeath: LocalDate) = apply { this.dateOfDeath = dateOfDeath }

        /**
         * An optional description of the reason for the return. This is for internal usage and will
         * not be transmitted to the bank.”
         */
        fun reason(reason: String) = apply { this.reason = reason }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): ReturnCreateParams =
            ReturnCreateParams(
                returnableId,
                checkNotNull(returnableType) { "`returnableType` is required but was not set" },
                additionalInformation,
                code,
                dateOfDeath,
                reason,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class ReturnableType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ReturnableType && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField
            val INCOMING_PAYMENT_DETAIL = ReturnableType(JsonField.of("incoming_payment_detail"))

            @JvmStatic fun of(value: String) = ReturnableType(JsonField.of(value))
        }

        enum class Known {
            INCOMING_PAYMENT_DETAIL,
        }

        enum class Value {
            INCOMING_PAYMENT_DETAIL,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                INCOMING_PAYMENT_DETAIL -> Value.INCOMING_PAYMENT_DETAIL
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                INCOMING_PAYMENT_DETAIL -> Known.INCOMING_PAYMENT_DETAIL
                else -> throw ModernTreasuryInvalidDataException("Unknown ReturnableType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Code
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Code && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val _901 = Code(JsonField.of("901"))

            @JvmField val _902 = Code(JsonField.of("902"))

            @JvmField val _903 = Code(JsonField.of("903"))

            @JvmField val _904 = Code(JsonField.of("904"))

            @JvmField val _905 = Code(JsonField.of("905"))

            @JvmField val _907 = Code(JsonField.of("907"))

            @JvmField val _908 = Code(JsonField.of("908"))

            @JvmField val _909 = Code(JsonField.of("909"))

            @JvmField val _910 = Code(JsonField.of("910"))

            @JvmField val _911 = Code(JsonField.of("911"))

            @JvmField val _912 = Code(JsonField.of("912"))

            @JvmField val _914 = Code(JsonField.of("914"))

            @JvmField val C01 = Code(JsonField.of("C01"))

            @JvmField val C02 = Code(JsonField.of("C02"))

            @JvmField val C03 = Code(JsonField.of("C03"))

            @JvmField val C05 = Code(JsonField.of("C05"))

            @JvmField val C06 = Code(JsonField.of("C06"))

            @JvmField val C07 = Code(JsonField.of("C07"))

            @JvmField val C08 = Code(JsonField.of("C08"))

            @JvmField val C09 = Code(JsonField.of("C09"))

            @JvmField val C13 = Code(JsonField.of("C13"))

            @JvmField val C14 = Code(JsonField.of("C14"))

            @JvmField val R01 = Code(JsonField.of("R01"))

            @JvmField val R02 = Code(JsonField.of("R02"))

            @JvmField val R03 = Code(JsonField.of("R03"))

            @JvmField val R04 = Code(JsonField.of("R04"))

            @JvmField val R05 = Code(JsonField.of("R05"))

            @JvmField val R06 = Code(JsonField.of("R06"))

            @JvmField val R07 = Code(JsonField.of("R07"))

            @JvmField val R08 = Code(JsonField.of("R08"))

            @JvmField val R09 = Code(JsonField.of("R09"))

            @JvmField val R10 = Code(JsonField.of("R10"))

            @JvmField val R11 = Code(JsonField.of("R11"))

            @JvmField val R12 = Code(JsonField.of("R12"))

            @JvmField val R14 = Code(JsonField.of("R14"))

            @JvmField val R15 = Code(JsonField.of("R15"))

            @JvmField val R16 = Code(JsonField.of("R16"))

            @JvmField val R17 = Code(JsonField.of("R17"))

            @JvmField val R20 = Code(JsonField.of("R20"))

            @JvmField val R21 = Code(JsonField.of("R21"))

            @JvmField val R22 = Code(JsonField.of("R22"))

            @JvmField val R23 = Code(JsonField.of("R23"))

            @JvmField val R24 = Code(JsonField.of("R24"))

            @JvmField val R29 = Code(JsonField.of("R29"))

            @JvmField val R31 = Code(JsonField.of("R31"))

            @JvmField val R33 = Code(JsonField.of("R33"))

            @JvmField val R37 = Code(JsonField.of("R37"))

            @JvmField val R38 = Code(JsonField.of("R38"))

            @JvmField val R39 = Code(JsonField.of("R39"))

            @JvmField val R51 = Code(JsonField.of("R51"))

            @JvmField val R52 = Code(JsonField.of("R52"))

            @JvmField val R53 = Code(JsonField.of("R53"))

            @JvmField val CURRENCYCLOUD = Code(JsonField.of("currencycloud"))

            @JvmStatic fun of(value: String) = Code(JsonField.of(value))
        }

        enum class Known {
            _901,
            _902,
            _903,
            _904,
            _905,
            _907,
            _908,
            _909,
            _910,
            _911,
            _912,
            _914,
            C01,
            C02,
            C03,
            C05,
            C06,
            C07,
            C08,
            C09,
            C13,
            C14,
            R01,
            R02,
            R03,
            R04,
            R05,
            R06,
            R07,
            R08,
            R09,
            R10,
            R11,
            R12,
            R14,
            R15,
            R16,
            R17,
            R20,
            R21,
            R22,
            R23,
            R24,
            R29,
            R31,
            R33,
            R37,
            R38,
            R39,
            R51,
            R52,
            R53,
            CURRENCYCLOUD,
        }

        enum class Value {
            _901,
            _902,
            _903,
            _904,
            _905,
            _907,
            _908,
            _909,
            _910,
            _911,
            _912,
            _914,
            C01,
            C02,
            C03,
            C05,
            C06,
            C07,
            C08,
            C09,
            C13,
            C14,
            R01,
            R02,
            R03,
            R04,
            R05,
            R06,
            R07,
            R08,
            R09,
            R10,
            R11,
            R12,
            R14,
            R15,
            R16,
            R17,
            R20,
            R21,
            R22,
            R23,
            R24,
            R29,
            R31,
            R33,
            R37,
            R38,
            R39,
            R51,
            R52,
            R53,
            CURRENCYCLOUD,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                _901 -> Value._901
                _902 -> Value._902
                _903 -> Value._903
                _904 -> Value._904
                _905 -> Value._905
                _907 -> Value._907
                _908 -> Value._908
                _909 -> Value._909
                _910 -> Value._910
                _911 -> Value._911
                _912 -> Value._912
                _914 -> Value._914
                C01 -> Value.C01
                C02 -> Value.C02
                C03 -> Value.C03
                C05 -> Value.C05
                C06 -> Value.C06
                C07 -> Value.C07
                C08 -> Value.C08
                C09 -> Value.C09
                C13 -> Value.C13
                C14 -> Value.C14
                R01 -> Value.R01
                R02 -> Value.R02
                R03 -> Value.R03
                R04 -> Value.R04
                R05 -> Value.R05
                R06 -> Value.R06
                R07 -> Value.R07
                R08 -> Value.R08
                R09 -> Value.R09
                R10 -> Value.R10
                R11 -> Value.R11
                R12 -> Value.R12
                R14 -> Value.R14
                R15 -> Value.R15
                R16 -> Value.R16
                R17 -> Value.R17
                R20 -> Value.R20
                R21 -> Value.R21
                R22 -> Value.R22
                R23 -> Value.R23
                R24 -> Value.R24
                R29 -> Value.R29
                R31 -> Value.R31
                R33 -> Value.R33
                R37 -> Value.R37
                R38 -> Value.R38
                R39 -> Value.R39
                R51 -> Value.R51
                R52 -> Value.R52
                R53 -> Value.R53
                CURRENCYCLOUD -> Value.CURRENCYCLOUD
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                _901 -> Known._901
                _902 -> Known._902
                _903 -> Known._903
                _904 -> Known._904
                _905 -> Known._905
                _907 -> Known._907
                _908 -> Known._908
                _909 -> Known._909
                _910 -> Known._910
                _911 -> Known._911
                _912 -> Known._912
                _914 -> Known._914
                C01 -> Known.C01
                C02 -> Known.C02
                C03 -> Known.C03
                C05 -> Known.C05
                C06 -> Known.C06
                C07 -> Known.C07
                C08 -> Known.C08
                C09 -> Known.C09
                C13 -> Known.C13
                C14 -> Known.C14
                R01 -> Known.R01
                R02 -> Known.R02
                R03 -> Known.R03
                R04 -> Known.R04
                R05 -> Known.R05
                R06 -> Known.R06
                R07 -> Known.R07
                R08 -> Known.R08
                R09 -> Known.R09
                R10 -> Known.R10
                R11 -> Known.R11
                R12 -> Known.R12
                R14 -> Known.R14
                R15 -> Known.R15
                R16 -> Known.R16
                R17 -> Known.R17
                R20 -> Known.R20
                R21 -> Known.R21
                R22 -> Known.R22
                R23 -> Known.R23
                R24 -> Known.R24
                R29 -> Known.R29
                R31 -> Known.R31
                R33 -> Known.R33
                R37 -> Known.R37
                R38 -> Known.R38
                R39 -> Known.R39
                R51 -> Known.R51
                R52 -> Known.R52
                R53 -> Known.R53
                CURRENCYCLOUD -> Known.CURRENCYCLOUD
                else -> throw ModernTreasuryInvalidDataException("Unknown Code: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
