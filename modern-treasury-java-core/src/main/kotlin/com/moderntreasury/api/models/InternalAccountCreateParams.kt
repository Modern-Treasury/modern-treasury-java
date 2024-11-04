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

class InternalAccountCreateParams
constructor(
    private val connectionId: String,
    private val currency: Currency,
    private val name: String,
    private val partyName: String,
    private val counterpartyId: String?,
    private val legalEntityId: String?,
    private val parentAccountId: String?,
    private val partyAddress: PartyAddress?,
    private val vendorAttributes: VendorAttributes?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun connectionId(): String = connectionId

    fun currency(): Currency = currency

    fun name(): String = name

    fun partyName(): String = partyName

    fun counterpartyId(): Optional<String> = Optional.ofNullable(counterpartyId)

    fun legalEntityId(): Optional<String> = Optional.ofNullable(legalEntityId)

    fun parentAccountId(): Optional<String> = Optional.ofNullable(parentAccountId)

    fun partyAddress(): Optional<PartyAddress> = Optional.ofNullable(partyAddress)

    fun vendorAttributes(): Optional<VendorAttributes> = Optional.ofNullable(vendorAttributes)

    @JvmSynthetic
    internal fun getBody(): InternalAccountCreateBody {
        return InternalAccountCreateBody(
            connectionId,
            currency,
            name,
            partyName,
            counterpartyId,
            legalEntityId,
            parentAccountId,
            partyAddress,
            vendorAttributes,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JsonDeserialize(builder = InternalAccountCreateBody.Builder::class)
    @NoAutoDetect
    class InternalAccountCreateBody
    internal constructor(
        private val connectionId: String?,
        private val currency: Currency?,
        private val name: String?,
        private val partyName: String?,
        private val counterpartyId: String?,
        private val legalEntityId: String?,
        private val parentAccountId: String?,
        private val partyAddress: PartyAddress?,
        private val vendorAttributes: VendorAttributes?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The identifier of the financial institution the account belongs to. */
        @JsonProperty("connection_id") fun connectionId(): String? = connectionId

        /** Either "USD" or "CAD". Internal accounts created at Increase only supports "USD". */
        @JsonProperty("currency") fun currency(): Currency? = currency

        /** The nickname of the account. */
        @JsonProperty("name") fun name(): String? = name

        /** The legal name of the entity which owns the account. */
        @JsonProperty("party_name") fun partyName(): String? = partyName

        /** The Counterparty associated to this account. */
        @JsonProperty("counterparty_id") fun counterpartyId(): String? = counterpartyId

        /** The LegalEntity associated to this account. */
        @JsonProperty("legal_entity_id") fun legalEntityId(): String? = legalEntityId

        /** The parent internal account of this new account. */
        @JsonProperty("parent_account_id") fun parentAccountId(): String? = parentAccountId

        /** The address associated with the owner or null. */
        @JsonProperty("party_address") fun partyAddress(): PartyAddress? = partyAddress

        /**
         * A hash of vendor specific attributes that will be used when creating the account at the
         * vendor specified by the given connection.
         */
        @JsonProperty("vendor_attributes")
        fun vendorAttributes(): VendorAttributes? = vendorAttributes

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var connectionId: String? = null
            private var currency: Currency? = null
            private var name: String? = null
            private var partyName: String? = null
            private var counterpartyId: String? = null
            private var legalEntityId: String? = null
            private var parentAccountId: String? = null
            private var partyAddress: PartyAddress? = null
            private var vendorAttributes: VendorAttributes? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(internalAccountCreateBody: InternalAccountCreateBody) = apply {
                this.connectionId = internalAccountCreateBody.connectionId
                this.currency = internalAccountCreateBody.currency
                this.name = internalAccountCreateBody.name
                this.partyName = internalAccountCreateBody.partyName
                this.counterpartyId = internalAccountCreateBody.counterpartyId
                this.legalEntityId = internalAccountCreateBody.legalEntityId
                this.parentAccountId = internalAccountCreateBody.parentAccountId
                this.partyAddress = internalAccountCreateBody.partyAddress
                this.vendorAttributes = internalAccountCreateBody.vendorAttributes
                additionalProperties(internalAccountCreateBody.additionalProperties)
            }

            /** The identifier of the financial institution the account belongs to. */
            @JsonProperty("connection_id")
            fun connectionId(connectionId: String) = apply { this.connectionId = connectionId }

            /** Either "USD" or "CAD". Internal accounts created at Increase only supports "USD". */
            @JsonProperty("currency")
            fun currency(currency: Currency) = apply { this.currency = currency }

            /** The nickname of the account. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /** The legal name of the entity which owns the account. */
            @JsonProperty("party_name")
            fun partyName(partyName: String) = apply { this.partyName = partyName }

            /** The Counterparty associated to this account. */
            @JsonProperty("counterparty_id")
            fun counterpartyId(counterpartyId: String) = apply {
                this.counterpartyId = counterpartyId
            }

            /** The LegalEntity associated to this account. */
            @JsonProperty("legal_entity_id")
            fun legalEntityId(legalEntityId: String) = apply { this.legalEntityId = legalEntityId }

            /** The parent internal account of this new account. */
            @JsonProperty("parent_account_id")
            fun parentAccountId(parentAccountId: String) = apply {
                this.parentAccountId = parentAccountId
            }

            /** The address associated with the owner or null. */
            @JsonProperty("party_address")
            fun partyAddress(partyAddress: PartyAddress) = apply {
                this.partyAddress = partyAddress
            }

            /**
             * A hash of vendor specific attributes that will be used when creating the account at
             * the vendor specified by the given connection.
             */
            @JsonProperty("vendor_attributes")
            fun vendorAttributes(vendorAttributes: VendorAttributes) = apply {
                this.vendorAttributes = vendorAttributes
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

            fun build(): InternalAccountCreateBody =
                InternalAccountCreateBody(
                    checkNotNull(connectionId) { "`connectionId` is required but was not set" },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(partyName) { "`partyName` is required but was not set" },
                    counterpartyId,
                    legalEntityId,
                    parentAccountId,
                    partyAddress,
                    vendorAttributes,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InternalAccountCreateBody && this.connectionId == other.connectionId && this.currency == other.currency && this.name == other.name && this.partyName == other.partyName && this.counterpartyId == other.counterpartyId && this.legalEntityId == other.legalEntityId && this.parentAccountId == other.parentAccountId && this.partyAddress == other.partyAddress && this.vendorAttributes == other.vendorAttributes && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(connectionId, currency, name, partyName, counterpartyId, legalEntityId, parentAccountId, partyAddress, vendorAttributes, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "InternalAccountCreateBody{connectionId=$connectionId, currency=$currency, name=$name, partyName=$partyName, counterpartyId=$counterpartyId, legalEntityId=$legalEntityId, parentAccountId=$parentAccountId, partyAddress=$partyAddress, vendorAttributes=$vendorAttributes, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InternalAccountCreateParams && this.connectionId == other.connectionId && this.currency == other.currency && this.name == other.name && this.partyName == other.partyName && this.counterpartyId == other.counterpartyId && this.legalEntityId == other.legalEntityId && this.parentAccountId == other.parentAccountId && this.partyAddress == other.partyAddress && this.vendorAttributes == other.vendorAttributes && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(connectionId, currency, name, partyName, counterpartyId, legalEntityId, parentAccountId, partyAddress, vendorAttributes, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "InternalAccountCreateParams{connectionId=$connectionId, currency=$currency, name=$name, partyName=$partyName, counterpartyId=$counterpartyId, legalEntityId=$legalEntityId, parentAccountId=$parentAccountId, partyAddress=$partyAddress, vendorAttributes=$vendorAttributes, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var connectionId: String? = null
        private var currency: Currency? = null
        private var name: String? = null
        private var partyName: String? = null
        private var counterpartyId: String? = null
        private var legalEntityId: String? = null
        private var parentAccountId: String? = null
        private var partyAddress: PartyAddress? = null
        private var vendorAttributes: VendorAttributes? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(internalAccountCreateParams: InternalAccountCreateParams) = apply {
            this.connectionId = internalAccountCreateParams.connectionId
            this.currency = internalAccountCreateParams.currency
            this.name = internalAccountCreateParams.name
            this.partyName = internalAccountCreateParams.partyName
            this.counterpartyId = internalAccountCreateParams.counterpartyId
            this.legalEntityId = internalAccountCreateParams.legalEntityId
            this.parentAccountId = internalAccountCreateParams.parentAccountId
            this.partyAddress = internalAccountCreateParams.partyAddress
            this.vendorAttributes = internalAccountCreateParams.vendorAttributes
            additionalHeaders(internalAccountCreateParams.additionalHeaders)
            additionalQueryParams(internalAccountCreateParams.additionalQueryParams)
            additionalBodyProperties(internalAccountCreateParams.additionalBodyProperties)
        }

        /** The identifier of the financial institution the account belongs to. */
        fun connectionId(connectionId: String) = apply { this.connectionId = connectionId }

        /** Either "USD" or "CAD". Internal accounts created at Increase only supports "USD". */
        fun currency(currency: Currency) = apply { this.currency = currency }

        /** The nickname of the account. */
        fun name(name: String) = apply { this.name = name }

        /** The legal name of the entity which owns the account. */
        fun partyName(partyName: String) = apply { this.partyName = partyName }

        /** The Counterparty associated to this account. */
        fun counterpartyId(counterpartyId: String) = apply { this.counterpartyId = counterpartyId }

        /** The LegalEntity associated to this account. */
        fun legalEntityId(legalEntityId: String) = apply { this.legalEntityId = legalEntityId }

        /** The parent internal account of this new account. */
        fun parentAccountId(parentAccountId: String) = apply {
            this.parentAccountId = parentAccountId
        }

        /** The address associated with the owner or null. */
        fun partyAddress(partyAddress: PartyAddress) = apply { this.partyAddress = partyAddress }

        /**
         * A hash of vendor specific attributes that will be used when creating the account at the
         * vendor specified by the given connection.
         */
        fun vendorAttributes(vendorAttributes: VendorAttributes) = apply {
            this.vendorAttributes = vendorAttributes
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

        fun removeAdditionalHeader(name: String) = apply { additionalHeaders.removeAll(name) }

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

        fun removeAdditionalQueryParam(key: String) = apply { additionalQueryParams.removeAll(key) }

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

        fun build(): InternalAccountCreateParams =
            InternalAccountCreateParams(
                checkNotNull(connectionId) { "`connectionId` is required but was not set" },
                checkNotNull(currency) { "`currency` is required but was not set" },
                checkNotNull(name) { "`name` is required but was not set" },
                checkNotNull(partyName) { "`partyName` is required but was not set" },
                counterpartyId,
                legalEntityId,
                parentAccountId,
                partyAddress,
                vendorAttributes,
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

    class Currency
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Currency && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val USD = Currency(JsonField.of("USD"))

            @JvmField val CAD = Currency(JsonField.of("CAD"))

            @JvmStatic fun of(value: String) = Currency(JsonField.of(value))
        }

        enum class Known {
            USD,
            CAD,
        }

        enum class Value {
            USD,
            CAD,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                USD -> Value.USD
                CAD -> Value.CAD
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                USD -> Known.USD
                CAD -> Known.CAD
                else -> throw ModernTreasuryInvalidDataException("Unknown Currency: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /** The address associated with the owner or null. */
    @JsonDeserialize(builder = PartyAddress.Builder::class)
    @NoAutoDetect
    class PartyAddress
    private constructor(
        private val line1: String?,
        private val line2: String?,
        private val locality: String?,
        private val region: String?,
        private val postalCode: String?,
        private val country: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("line1") fun line1(): String? = line1

        @JsonProperty("line2") fun line2(): String? = line2

        /** Locality or City. */
        @JsonProperty("locality") fun locality(): String? = locality

        /** Region or State. */
        @JsonProperty("region") fun region(): String? = region

        /** The postal code of the address. */
        @JsonProperty("postal_code") fun postalCode(): String? = postalCode

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        @JsonProperty("country") fun country(): String? = country

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var line1: String? = null
            private var line2: String? = null
            private var locality: String? = null
            private var region: String? = null
            private var postalCode: String? = null
            private var country: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(partyAddress: PartyAddress) = apply {
                this.line1 = partyAddress.line1
                this.line2 = partyAddress.line2
                this.locality = partyAddress.locality
                this.region = partyAddress.region
                this.postalCode = partyAddress.postalCode
                this.country = partyAddress.country
                additionalProperties(partyAddress.additionalProperties)
            }

            @JsonProperty("line1") fun line1(line1: String) = apply { this.line1 = line1 }

            @JsonProperty("line2") fun line2(line2: String) = apply { this.line2 = line2 }

            /** Locality or City. */
            @JsonProperty("locality")
            fun locality(locality: String) = apply { this.locality = locality }

            /** Region or State. */
            @JsonProperty("region") fun region(region: String) = apply { this.region = region }

            /** The postal code of the address. */
            @JsonProperty("postal_code")
            fun postalCode(postalCode: String) = apply { this.postalCode = postalCode }

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            @JsonProperty("country") fun country(country: String) = apply { this.country = country }

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

            fun build(): PartyAddress =
                PartyAddress(
                    checkNotNull(line1) { "`line1` is required but was not set" },
                    line2,
                    checkNotNull(locality) { "`locality` is required but was not set" },
                    checkNotNull(region) { "`region` is required but was not set" },
                    checkNotNull(postalCode) { "`postalCode` is required but was not set" },
                    checkNotNull(country) { "`country` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PartyAddress && this.line1 == other.line1 && this.line2 == other.line2 && this.locality == other.locality && this.region == other.region && this.postalCode == other.postalCode && this.country == other.country && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(line1, line2, locality, region, postalCode, country, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "PartyAddress{line1=$line1, line2=$line2, locality=$locality, region=$region, postalCode=$postalCode, country=$country, additionalProperties=$additionalProperties}"
    }

    /**
     * A hash of vendor specific attributes that will be used when creating the account at the
     * vendor specified by the given connection.
     */
    @JsonDeserialize(builder = VendorAttributes.Builder::class)
    @NoAutoDetect
    class VendorAttributes
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(vendorAttributes: VendorAttributes) = apply {
                additionalProperties(vendorAttributes.additionalProperties)
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

            fun build(): VendorAttributes = VendorAttributes(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is VendorAttributes && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "VendorAttributes{additionalProperties=$additionalProperties}"
    }
}
