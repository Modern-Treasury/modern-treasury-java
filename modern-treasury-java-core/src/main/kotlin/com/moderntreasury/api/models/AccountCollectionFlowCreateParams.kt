// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import com.moderntreasury.api.models.*
import java.util.Objects
import java.util.Optional

class AccountCollectionFlowCreateParams
constructor(
    private val counterpartyId: String,
    private val paymentTypes: List<String>,
    private val receivingCountries: List<ReceivingCountry>?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun counterpartyId(): String = counterpartyId

    fun paymentTypes(): List<String> = paymentTypes

    fun receivingCountries(): Optional<List<ReceivingCountry>> =
        Optional.ofNullable(receivingCountries)

    @JvmSynthetic
    internal fun getBody(): AccountCollectionFlowCreateBody {
        return AccountCollectionFlowCreateBody(
            counterpartyId,
            paymentTypes,
            receivingCountries,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JsonDeserialize(builder = AccountCollectionFlowCreateBody.Builder::class)
    @NoAutoDetect
    class AccountCollectionFlowCreateBody
    internal constructor(
        private val counterpartyId: String?,
        private val paymentTypes: List<String>?,
        private val receivingCountries: List<ReceivingCountry>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Required. */
        @JsonProperty("counterparty_id") fun counterpartyId(): String? = counterpartyId

        @JsonProperty("payment_types") fun paymentTypes(): List<String>? = paymentTypes

        @JsonProperty("receiving_countries")
        fun receivingCountries(): List<ReceivingCountry>? = receivingCountries

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var counterpartyId: String? = null
            private var paymentTypes: List<String>? = null
            private var receivingCountries: List<ReceivingCountry>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accountCollectionFlowCreateBody: AccountCollectionFlowCreateBody) =
                apply {
                    this.counterpartyId = accountCollectionFlowCreateBody.counterpartyId
                    this.paymentTypes = accountCollectionFlowCreateBody.paymentTypes
                    this.receivingCountries = accountCollectionFlowCreateBody.receivingCountries
                    additionalProperties(accountCollectionFlowCreateBody.additionalProperties)
                }

            /** Required. */
            @JsonProperty("counterparty_id")
            fun counterpartyId(counterpartyId: String) = apply {
                this.counterpartyId = counterpartyId
            }

            @JsonProperty("payment_types")
            fun paymentTypes(paymentTypes: List<String>) = apply {
                this.paymentTypes = paymentTypes
            }

            @JsonProperty("receiving_countries")
            fun receivingCountries(receivingCountries: List<ReceivingCountry>) = apply {
                this.receivingCountries = receivingCountries
            }

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

            fun build(): AccountCollectionFlowCreateBody =
                AccountCollectionFlowCreateBody(
                    checkNotNull(counterpartyId) { "`counterpartyId` is required but was not set" },
                    checkNotNull(paymentTypes) { "`paymentTypes` is required but was not set" }
                        .toImmutable(),
                    receivingCountries?.toImmutable(),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountCollectionFlowCreateBody && this.counterpartyId == other.counterpartyId && this.paymentTypes == other.paymentTypes && this.receivingCountries == other.receivingCountries && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(counterpartyId, paymentTypes, receivingCountries, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "AccountCollectionFlowCreateBody{counterpartyId=$counterpartyId, paymentTypes=$paymentTypes, receivingCountries=$receivingCountries, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountCollectionFlowCreateParams && this.counterpartyId == other.counterpartyId && this.paymentTypes == other.paymentTypes && this.receivingCountries == other.receivingCountries && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(counterpartyId, paymentTypes, receivingCountries, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "AccountCollectionFlowCreateParams{counterpartyId=$counterpartyId, paymentTypes=$paymentTypes, receivingCountries=$receivingCountries, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var counterpartyId: String? = null
        private var paymentTypes: MutableList<String> = mutableListOf()
        private var receivingCountries: MutableList<ReceivingCountry> = mutableListOf()
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountCollectionFlowCreateParams: AccountCollectionFlowCreateParams) =
            apply {
                this.counterpartyId = accountCollectionFlowCreateParams.counterpartyId
                this.paymentTypes(accountCollectionFlowCreateParams.paymentTypes)
                this.receivingCountries(
                    accountCollectionFlowCreateParams.receivingCountries ?: listOf()
                )
                additionalHeaders(accountCollectionFlowCreateParams.additionalHeaders)
                additionalQueryParams(accountCollectionFlowCreateParams.additionalQueryParams)
                additionalBodyProperties(accountCollectionFlowCreateParams.additionalBodyProperties)
            }

        /** Required. */
        fun counterpartyId(counterpartyId: String) = apply { this.counterpartyId = counterpartyId }

        fun paymentTypes(paymentTypes: List<String>) = apply {
            this.paymentTypes.clear()
            this.paymentTypes.addAll(paymentTypes)
        }

        fun addPaymentType(paymentType: String) = apply { this.paymentTypes.add(paymentType) }

        fun receivingCountries(receivingCountries: List<ReceivingCountry>) = apply {
            this.receivingCountries.clear()
            this.receivingCountries.addAll(receivingCountries)
        }

        fun addReceivingCountry(receivingCountry: ReceivingCountry) = apply {
            this.receivingCountries.add(receivingCountry)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replaceValues(name, listOf(value))
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replaceValues(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::replaceAdditionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.removeAll(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            names.forEach(::removeAdditionalHeaders)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replaceValues(key, listOf(value))
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replaceValues(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::replaceAdditionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply {
            additionalQueryParams.removeAll(key)
        }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalQueryParams)
        }

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

        fun build(): AccountCollectionFlowCreateParams =
            AccountCollectionFlowCreateParams(
                checkNotNull(counterpartyId) { "`counterpartyId` is required but was not set" },
                checkNotNull(paymentTypes) { "`paymentTypes` is required but was not set" }
                    .toImmutable(),
                if (receivingCountries.size == 0) null else receivingCountries.toImmutable(),
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }

    class ReceivingCountry
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ReceivingCountry && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val USA = ReceivingCountry(JsonField.of("USA"))

            @JvmField val AUS = ReceivingCountry(JsonField.of("AUS"))

            @JvmField val BEL = ReceivingCountry(JsonField.of("BEL"))

            @JvmField val CAN = ReceivingCountry(JsonField.of("CAN"))

            @JvmField val CHL = ReceivingCountry(JsonField.of("CHL"))

            @JvmField val CHN = ReceivingCountry(JsonField.of("CHN"))

            @JvmField val COL = ReceivingCountry(JsonField.of("COL"))

            @JvmField val FRA = ReceivingCountry(JsonField.of("FRA"))

            @JvmField val DEU = ReceivingCountry(JsonField.of("DEU"))

            @JvmField val HKG = ReceivingCountry(JsonField.of("HKG"))

            @JvmField val IND = ReceivingCountry(JsonField.of("IND"))

            @JvmField val IRL = ReceivingCountry(JsonField.of("IRL"))

            @JvmField val ITA = ReceivingCountry(JsonField.of("ITA"))

            @JvmField val MEX = ReceivingCountry(JsonField.of("MEX"))

            @JvmField val NLD = ReceivingCountry(JsonField.of("NLD"))

            @JvmField val PER = ReceivingCountry(JsonField.of("PER"))

            @JvmField val ESP = ReceivingCountry(JsonField.of("ESP"))

            @JvmField val GBR = ReceivingCountry(JsonField.of("GBR"))

            @JvmStatic fun of(value: String) = ReceivingCountry(JsonField.of(value))
        }

        enum class Known {
            USA,
            AUS,
            BEL,
            CAN,
            CHL,
            CHN,
            COL,
            FRA,
            DEU,
            HKG,
            IND,
            IRL,
            ITA,
            MEX,
            NLD,
            PER,
            ESP,
            GBR,
        }

        enum class Value {
            USA,
            AUS,
            BEL,
            CAN,
            CHL,
            CHN,
            COL,
            FRA,
            DEU,
            HKG,
            IND,
            IRL,
            ITA,
            MEX,
            NLD,
            PER,
            ESP,
            GBR,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                USA -> Value.USA
                AUS -> Value.AUS
                BEL -> Value.BEL
                CAN -> Value.CAN
                CHL -> Value.CHL
                CHN -> Value.CHN
                COL -> Value.COL
                FRA -> Value.FRA
                DEU -> Value.DEU
                HKG -> Value.HKG
                IND -> Value.IND
                IRL -> Value.IRL
                ITA -> Value.ITA
                MEX -> Value.MEX
                NLD -> Value.NLD
                PER -> Value.PER
                ESP -> Value.ESP
                GBR -> Value.GBR
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                USA -> Known.USA
                AUS -> Known.AUS
                BEL -> Known.BEL
                CAN -> Known.CAN
                CHL -> Known.CHL
                CHN -> Known.CHN
                COL -> Known.COL
                FRA -> Known.FRA
                DEU -> Known.DEU
                HKG -> Known.HKG
                IND -> Known.IND
                IRL -> Known.IRL
                ITA -> Known.ITA
                MEX -> Known.MEX
                NLD -> Known.NLD
                PER -> Known.PER
                ESP -> Known.ESP
                GBR -> Known.GBR
                else -> throw ModernTreasuryInvalidDataException("Unknown ReceivingCountry: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
