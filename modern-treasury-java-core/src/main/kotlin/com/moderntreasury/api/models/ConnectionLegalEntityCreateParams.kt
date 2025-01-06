// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.util.Objects
import java.util.Optional

class ConnectionLegalEntityCreateParams
constructor(
    private val body: ConnectionLegalEntityCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** The ID of the connection. */
    fun connectionId(): String = body.connectionId()

    /** The legal entity. */
    fun legalEntity(): Optional<LegalEntity> = body.legalEntity()

    /** The ID of the legal entity. */
    fun legalEntityId(): Optional<String> = body.legalEntityId()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): ConnectionLegalEntityCreateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class ConnectionLegalEntityCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("connection_id") private val connectionId: String,
        @JsonProperty("legal_entity") private val legalEntity: LegalEntity?,
        @JsonProperty("legal_entity_id") private val legalEntityId: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The ID of the connection. */
        @JsonProperty("connection_id") fun connectionId(): String = connectionId

        /** The legal entity. */
        @JsonProperty("legal_entity")
        fun legalEntity(): Optional<LegalEntity> = Optional.ofNullable(legalEntity)

        /** The ID of the legal entity. */
        @JsonProperty("legal_entity_id")
        fun legalEntityId(): Optional<String> = Optional.ofNullable(legalEntityId)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var connectionId: String? = null
            private var legalEntity: LegalEntity? = null
            private var legalEntityId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(connectionLegalEntityCreateBody: ConnectionLegalEntityCreateBody) =
                apply {
                    connectionId = connectionLegalEntityCreateBody.connectionId
                    legalEntity = connectionLegalEntityCreateBody.legalEntity
                    legalEntityId = connectionLegalEntityCreateBody.legalEntityId
                    additionalProperties =
                        connectionLegalEntityCreateBody.additionalProperties.toMutableMap()
                }

            /** The ID of the connection. */
            fun connectionId(connectionId: String) = apply { this.connectionId = connectionId }

            /** The legal entity. */
            fun legalEntity(legalEntity: LegalEntity) = apply { this.legalEntity = legalEntity }

            /** The ID of the legal entity. */
            fun legalEntityId(legalEntityId: String) = apply { this.legalEntityId = legalEntityId }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): ConnectionLegalEntityCreateBody =
                ConnectionLegalEntityCreateBody(
                    checkNotNull(connectionId) { "`connectionId` is required but was not set" },
                    legalEntity,
                    legalEntityId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ConnectionLegalEntityCreateBody && connectionId == other.connectionId && legalEntity == other.legalEntity && legalEntityId == other.legalEntityId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(connectionId, legalEntity, legalEntityId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ConnectionLegalEntityCreateBody{connectionId=$connectionId, legalEntity=$legalEntity, legalEntityId=$legalEntityId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: ConnectionLegalEntityCreateBody.Builder =
            ConnectionLegalEntityCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(connectionLegalEntityCreateParams: ConnectionLegalEntityCreateParams) =
            apply {
                body = connectionLegalEntityCreateParams.body.toBuilder()
                additionalHeaders = connectionLegalEntityCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    connectionLegalEntityCreateParams.additionalQueryParams.toBuilder()
            }

        /** The ID of the connection. */
        fun connectionId(connectionId: String) = apply { body.connectionId(connectionId) }

        /** The legal entity. */
        fun legalEntity(legalEntity: LegalEntity) = apply { body.legalEntity(legalEntity) }

        /** The ID of the legal entity. */
        fun legalEntityId(legalEntityId: String) = apply { body.legalEntityId(legalEntityId) }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun build(): ConnectionLegalEntityCreateParams =
            ConnectionLegalEntityCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** The legal entity. */
    @NoAutoDetect
    class LegalEntity
    @JsonCreator
    private constructor(
        @JsonProperty("addresses") private val addresses: List<LegalEntityAddressCreateRequest>?,
        @JsonProperty("bank_settings") private val bankSettings: BankSettings?,
        @JsonProperty("business_name") private val businessName: String?,
        @JsonProperty("citizenship_country") private val citizenshipCountry: String?,
        @JsonProperty("date_formed") private val dateFormed: LocalDate?,
        @JsonProperty("date_of_birth") private val dateOfBirth: LocalDate?,
        @JsonProperty("doing_business_as_names") private val doingBusinessAsNames: List<String>?,
        @JsonProperty("email") private val email: String?,
        @JsonProperty("first_name") private val firstName: String?,
        @JsonProperty("identifications")
        private val identifications: List<IdentificationCreateRequest>?,
        @JsonProperty("last_name") private val lastName: String?,
        @JsonProperty("legal_entity_associations")
        private val legalEntityAssociations: List<LegalEntityAssociationInlineCreateRequest>?,
        @JsonProperty("legal_entity_type") private val legalEntityType: LegalEntityType?,
        @JsonProperty("legal_structure") private val legalStructure: LegalStructure?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("middle_name") private val middleName: String?,
        @JsonProperty("phone_numbers") private val phoneNumbers: List<PhoneNumber>?,
        @JsonProperty("politically_exposed_person") private val politicallyExposedPerson: Boolean?,
        @JsonProperty("preferred_name") private val preferredName: String?,
        @JsonProperty("prefix") private val prefix: String?,
        @JsonProperty("risk_rating") private val riskRating: RiskRating?,
        @JsonProperty("suffix") private val suffix: String?,
        @JsonProperty("wealth_and_employment_details")
        private val wealthAndEmploymentDetails: WealthAndEmploymentDetails?,
        @JsonProperty("website") private val website: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** A list of addresses for the entity. */
        @JsonProperty("addresses")
        fun addresses(): Optional<List<LegalEntityAddressCreateRequest>> =
            Optional.ofNullable(addresses)

        @JsonProperty("bank_settings")
        fun bankSettings(): Optional<BankSettings> = Optional.ofNullable(bankSettings)

        /** The business's legal business name. */
        @JsonProperty("business_name")
        fun businessName(): Optional<String> = Optional.ofNullable(businessName)

        /** The country of citizenship for an individual. */
        @JsonProperty("citizenship_country")
        fun citizenshipCountry(): Optional<String> = Optional.ofNullable(citizenshipCountry)

        /** A business's formation date (YYYY-MM-DD). */
        @JsonProperty("date_formed")
        fun dateFormed(): Optional<LocalDate> = Optional.ofNullable(dateFormed)

        /** An individual's date of birth (YYYY-MM-DD). */
        @JsonProperty("date_of_birth")
        fun dateOfBirth(): Optional<LocalDate> = Optional.ofNullable(dateOfBirth)

        @JsonProperty("doing_business_as_names")
        fun doingBusinessAsNames(): Optional<List<String>> =
            Optional.ofNullable(doingBusinessAsNames)

        /** The entity's primary email. */
        @JsonProperty("email") fun email(): Optional<String> = Optional.ofNullable(email)

        /** An individual's first name. */
        @JsonProperty("first_name")
        fun firstName(): Optional<String> = Optional.ofNullable(firstName)

        /** A list of identifications for the legal entity. */
        @JsonProperty("identifications")
        fun identifications(): Optional<List<IdentificationCreateRequest>> =
            Optional.ofNullable(identifications)

        /** An individual's last name. */
        @JsonProperty("last_name") fun lastName(): Optional<String> = Optional.ofNullable(lastName)

        /** The legal entity associations and its child legal entities. */
        @JsonProperty("legal_entity_associations")
        fun legalEntityAssociations(): Optional<List<LegalEntityAssociationInlineCreateRequest>> =
            Optional.ofNullable(legalEntityAssociations)

        /** The type of legal entity. */
        @JsonProperty("legal_entity_type")
        fun legalEntityType(): Optional<LegalEntityType> = Optional.ofNullable(legalEntityType)

        /** The business's legal structure. */
        @JsonProperty("legal_structure")
        fun legalStructure(): Optional<LegalStructure> = Optional.ofNullable(legalStructure)

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

        /** An individual's middle name. */
        @JsonProperty("middle_name")
        fun middleName(): Optional<String> = Optional.ofNullable(middleName)

        @JsonProperty("phone_numbers")
        fun phoneNumbers(): Optional<List<PhoneNumber>> = Optional.ofNullable(phoneNumbers)

        /** Whether the individual is a politically exposed person. */
        @JsonProperty("politically_exposed_person")
        fun politicallyExposedPerson(): Optional<Boolean> =
            Optional.ofNullable(politicallyExposedPerson)

        /** An individual's preferred name. */
        @JsonProperty("preferred_name")
        fun preferredName(): Optional<String> = Optional.ofNullable(preferredName)

        /** An individual's prefix. */
        @JsonProperty("prefix") fun prefix(): Optional<String> = Optional.ofNullable(prefix)

        /** The risk rating of the legal entity. One of low, medium, high. */
        @JsonProperty("risk_rating")
        fun riskRating(): Optional<RiskRating> = Optional.ofNullable(riskRating)

        /** An individual's suffix. */
        @JsonProperty("suffix") fun suffix(): Optional<String> = Optional.ofNullable(suffix)

        @JsonProperty("wealth_and_employment_details")
        fun wealthAndEmploymentDetails(): Optional<WealthAndEmploymentDetails> =
            Optional.ofNullable(wealthAndEmploymentDetails)

        /** The entity's primary website URL. */
        @JsonProperty("website") fun website(): Optional<String> = Optional.ofNullable(website)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var addresses: MutableList<LegalEntityAddressCreateRequest>? = null
            private var bankSettings: BankSettings? = null
            private var businessName: String? = null
            private var citizenshipCountry: String? = null
            private var dateFormed: LocalDate? = null
            private var dateOfBirth: LocalDate? = null
            private var doingBusinessAsNames: MutableList<String>? = null
            private var email: String? = null
            private var firstName: String? = null
            private var identifications: MutableList<IdentificationCreateRequest>? = null
            private var lastName: String? = null
            private var legalEntityAssociations:
                MutableList<LegalEntityAssociationInlineCreateRequest>? =
                null
            private var legalEntityType: LegalEntityType? = null
            private var legalStructure: LegalStructure? = null
            private var metadata: Metadata? = null
            private var middleName: String? = null
            private var phoneNumbers: MutableList<PhoneNumber>? = null
            private var politicallyExposedPerson: Boolean? = null
            private var preferredName: String? = null
            private var prefix: String? = null
            private var riskRating: RiskRating? = null
            private var suffix: String? = null
            private var wealthAndEmploymentDetails: WealthAndEmploymentDetails? = null
            private var website: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(legalEntity: LegalEntity) = apply {
                addresses = legalEntity.addresses?.toMutableList()
                bankSettings = legalEntity.bankSettings
                businessName = legalEntity.businessName
                citizenshipCountry = legalEntity.citizenshipCountry
                dateFormed = legalEntity.dateFormed
                dateOfBirth = legalEntity.dateOfBirth
                doingBusinessAsNames = legalEntity.doingBusinessAsNames?.toMutableList()
                email = legalEntity.email
                firstName = legalEntity.firstName
                identifications = legalEntity.identifications?.toMutableList()
                lastName = legalEntity.lastName
                legalEntityAssociations = legalEntity.legalEntityAssociations?.toMutableList()
                legalEntityType = legalEntity.legalEntityType
                legalStructure = legalEntity.legalStructure
                metadata = legalEntity.metadata
                middleName = legalEntity.middleName
                phoneNumbers = legalEntity.phoneNumbers?.toMutableList()
                politicallyExposedPerson = legalEntity.politicallyExposedPerson
                preferredName = legalEntity.preferredName
                prefix = legalEntity.prefix
                riskRating = legalEntity.riskRating
                suffix = legalEntity.suffix
                wealthAndEmploymentDetails = legalEntity.wealthAndEmploymentDetails
                website = legalEntity.website
                additionalProperties = legalEntity.additionalProperties.toMutableMap()
            }

            /** A list of addresses for the entity. */
            fun addresses(addresses: List<LegalEntityAddressCreateRequest>) = apply {
                this.addresses = addresses.toMutableList()
            }

            /** A list of addresses for the entity. */
            fun addAddress(address: LegalEntityAddressCreateRequest) = apply {
                addresses = (addresses ?: mutableListOf()).apply { add(address) }
            }

            fun bankSettings(bankSettings: BankSettings) = apply {
                this.bankSettings = bankSettings
            }

            /** The business's legal business name. */
            fun businessName(businessName: String) = apply { this.businessName = businessName }

            /** The country of citizenship for an individual. */
            fun citizenshipCountry(citizenshipCountry: String) = apply {
                this.citizenshipCountry = citizenshipCountry
            }

            /** A business's formation date (YYYY-MM-DD). */
            fun dateFormed(dateFormed: LocalDate) = apply { this.dateFormed = dateFormed }

            /** An individual's date of birth (YYYY-MM-DD). */
            fun dateOfBirth(dateOfBirth: LocalDate) = apply { this.dateOfBirth = dateOfBirth }

            fun doingBusinessAsNames(doingBusinessAsNames: List<String>) = apply {
                this.doingBusinessAsNames = doingBusinessAsNames.toMutableList()
            }

            fun addDoingBusinessAsName(doingBusinessAsName: String) = apply {
                doingBusinessAsNames =
                    (doingBusinessAsNames ?: mutableListOf()).apply { add(doingBusinessAsName) }
            }

            /** The entity's primary email. */
            fun email(email: String) = apply { this.email = email }

            /** An individual's first name. */
            fun firstName(firstName: String) = apply { this.firstName = firstName }

            /** A list of identifications for the legal entity. */
            fun identifications(identifications: List<IdentificationCreateRequest>) = apply {
                this.identifications = identifications.toMutableList()
            }

            /** A list of identifications for the legal entity. */
            fun addIdentification(identification: IdentificationCreateRequest) = apply {
                identifications = (identifications ?: mutableListOf()).apply { add(identification) }
            }

            /** An individual's last name. */
            fun lastName(lastName: String) = apply { this.lastName = lastName }

            /** The legal entity associations and its child legal entities. */
            fun legalEntityAssociations(
                legalEntityAssociations: List<LegalEntityAssociationInlineCreateRequest>
            ) = apply { this.legalEntityAssociations = legalEntityAssociations.toMutableList() }

            /** The legal entity associations and its child legal entities. */
            fun addLegalEntityAssociation(
                legalEntityAssociation: LegalEntityAssociationInlineCreateRequest
            ) = apply {
                legalEntityAssociations =
                    (legalEntityAssociations ?: mutableListOf()).apply {
                        add(legalEntityAssociation)
                    }
            }

            /** The type of legal entity. */
            fun legalEntityType(legalEntityType: LegalEntityType) = apply {
                this.legalEntityType = legalEntityType
            }

            /** The business's legal structure. */
            fun legalStructure(legalStructure: LegalStructure) = apply {
                this.legalStructure = legalStructure
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An individual's middle name. */
            fun middleName(middleName: String) = apply { this.middleName = middleName }

            fun phoneNumbers(phoneNumbers: List<PhoneNumber>) = apply {
                this.phoneNumbers = phoneNumbers.toMutableList()
            }

            fun addPhoneNumber(phoneNumber: PhoneNumber) = apply {
                phoneNumbers = (phoneNumbers ?: mutableListOf()).apply { add(phoneNumber) }
            }

            /** Whether the individual is a politically exposed person. */
            fun politicallyExposedPerson(politicallyExposedPerson: Boolean) = apply {
                this.politicallyExposedPerson = politicallyExposedPerson
            }

            /** An individual's preferred name. */
            fun preferredName(preferredName: String) = apply { this.preferredName = preferredName }

            /** An individual's prefix. */
            fun prefix(prefix: String) = apply { this.prefix = prefix }

            /** The risk rating of the legal entity. One of low, medium, high. */
            fun riskRating(riskRating: RiskRating) = apply { this.riskRating = riskRating }

            /** An individual's suffix. */
            fun suffix(suffix: String) = apply { this.suffix = suffix }

            fun wealthAndEmploymentDetails(wealthAndEmploymentDetails: WealthAndEmploymentDetails) =
                apply {
                    this.wealthAndEmploymentDetails = wealthAndEmploymentDetails
                }

            /** The entity's primary website URL. */
            fun website(website: String) = apply { this.website = website }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): LegalEntity =
                LegalEntity(
                    addresses?.toImmutable(),
                    bankSettings,
                    businessName,
                    citizenshipCountry,
                    dateFormed,
                    dateOfBirth,
                    doingBusinessAsNames?.toImmutable(),
                    email,
                    firstName,
                    identifications?.toImmutable(),
                    lastName,
                    legalEntityAssociations?.toImmutable(),
                    legalEntityType,
                    legalStructure,
                    metadata,
                    middleName,
                    phoneNumbers?.toImmutable(),
                    politicallyExposedPerson,
                    preferredName,
                    prefix,
                    riskRating,
                    suffix,
                    wealthAndEmploymentDetails,
                    website,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class LegalEntityAddressCreateRequest
        @JsonCreator
        private constructor(
            @JsonProperty("country") private val country: String?,
            @JsonProperty("line1") private val line1: String?,
            @JsonProperty("locality") private val locality: String?,
            @JsonProperty("postal_code") private val postalCode: String?,
            @JsonProperty("region") private val region: String?,
            @JsonProperty("address_types") private val addressTypes: List<AddressType>?,
            @JsonProperty("line2") private val line2: String?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            @JsonProperty("country") fun country(): Optional<String> = Optional.ofNullable(country)

            @JsonProperty("line1") fun line1(): Optional<String> = Optional.ofNullable(line1)

            /** Locality or City. */
            @JsonProperty("locality")
            fun locality(): Optional<String> = Optional.ofNullable(locality)

            /** The postal code of the address. */
            @JsonProperty("postal_code")
            fun postalCode(): Optional<String> = Optional.ofNullable(postalCode)

            /** Region or State. */
            @JsonProperty("region") fun region(): Optional<String> = Optional.ofNullable(region)

            /** The types of this address. */
            @JsonProperty("address_types")
            fun addressTypes(): Optional<List<AddressType>> = Optional.ofNullable(addressTypes)

            @JsonProperty("line2") fun line2(): Optional<String> = Optional.ofNullable(line2)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var country: String? = null
                private var line1: String? = null
                private var locality: String? = null
                private var postalCode: String? = null
                private var region: String? = null
                private var addressTypes: MutableList<AddressType>? = null
                private var line2: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    legalEntityAddressCreateRequest: LegalEntityAddressCreateRequest
                ) = apply {
                    country = legalEntityAddressCreateRequest.country
                    line1 = legalEntityAddressCreateRequest.line1
                    locality = legalEntityAddressCreateRequest.locality
                    postalCode = legalEntityAddressCreateRequest.postalCode
                    region = legalEntityAddressCreateRequest.region
                    addressTypes = legalEntityAddressCreateRequest.addressTypes?.toMutableList()
                    line2 = legalEntityAddressCreateRequest.line2
                    additionalProperties =
                        legalEntityAddressCreateRequest.additionalProperties.toMutableMap()
                }

                /** Country code conforms to [ISO 3166-1 alpha-2] */
                fun country(country: String) = apply { this.country = country }

                fun line1(line1: String) = apply { this.line1 = line1 }

                /** Locality or City. */
                fun locality(locality: String) = apply { this.locality = locality }

                /** The postal code of the address. */
                fun postalCode(postalCode: String) = apply { this.postalCode = postalCode }

                /** Region or State. */
                fun region(region: String) = apply { this.region = region }

                /** The types of this address. */
                fun addressTypes(addressTypes: List<AddressType>) = apply {
                    this.addressTypes = addressTypes.toMutableList()
                }

                /** The types of this address. */
                fun addAddressType(addressType: AddressType) = apply {
                    addressTypes = (addressTypes ?: mutableListOf()).apply { add(addressType) }
                }

                fun line2(line2: String) = apply { this.line2 = line2 }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): LegalEntityAddressCreateRequest =
                    LegalEntityAddressCreateRequest(
                        country,
                        line1,
                        locality,
                        postalCode,
                        region,
                        addressTypes?.toImmutable(),
                        line2,
                        additionalProperties.toImmutable(),
                    )
            }

            class AddressType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val BUSINESS = of("business")

                    @JvmField val MAILING = of("mailing")

                    @JvmField val OTHER = of("other")

                    @JvmField val PO_BOX = of("po_box")

                    @JvmField val RESIDENTIAL = of("residential")

                    @JvmStatic fun of(value: String) = AddressType(JsonField.of(value))
                }

                enum class Known {
                    BUSINESS,
                    MAILING,
                    OTHER,
                    PO_BOX,
                    RESIDENTIAL,
                }

                enum class Value {
                    BUSINESS,
                    MAILING,
                    OTHER,
                    PO_BOX,
                    RESIDENTIAL,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        BUSINESS -> Value.BUSINESS
                        MAILING -> Value.MAILING
                        OTHER -> Value.OTHER
                        PO_BOX -> Value.PO_BOX
                        RESIDENTIAL -> Value.RESIDENTIAL
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        BUSINESS -> Known.BUSINESS
                        MAILING -> Known.MAILING
                        OTHER -> Known.OTHER
                        PO_BOX -> Known.PO_BOX
                        RESIDENTIAL -> Known.RESIDENTIAL
                        else ->
                            throw ModernTreasuryInvalidDataException("Unknown AddressType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is AddressType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is LegalEntityAddressCreateRequest && country == other.country && line1 == other.line1 && locality == other.locality && postalCode == other.postalCode && region == other.region && addressTypes == other.addressTypes && line2 == other.line2 && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(country, line1, locality, postalCode, region, addressTypes, line2, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LegalEntityAddressCreateRequest{country=$country, line1=$line1, locality=$locality, postalCode=$postalCode, region=$region, addressTypes=$addressTypes, line2=$line2, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class IdentificationCreateRequest
        @JsonCreator
        private constructor(
            @JsonProperty("id_number") private val idNumber: String,
            @JsonProperty("id_type") private val idType: IdType,
            @JsonProperty("issuing_country") private val issuingCountry: String?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The ID number of identification document. */
            @JsonProperty("id_number") fun idNumber(): String = idNumber

            /** The type of ID number. */
            @JsonProperty("id_type") fun idType(): IdType = idType

            /** The ISO 3166-1 alpha-2 country code of the country that issued the identification */
            @JsonProperty("issuing_country")
            fun issuingCountry(): Optional<String> = Optional.ofNullable(issuingCountry)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var idNumber: String? = null
                private var idType: IdType? = null
                private var issuingCountry: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(identificationCreateRequest: IdentificationCreateRequest) =
                    apply {
                        idNumber = identificationCreateRequest.idNumber
                        idType = identificationCreateRequest.idType
                        issuingCountry = identificationCreateRequest.issuingCountry
                        additionalProperties =
                            identificationCreateRequest.additionalProperties.toMutableMap()
                    }

                /** The ID number of identification document. */
                fun idNumber(idNumber: String) = apply { this.idNumber = idNumber }

                /** The type of ID number. */
                fun idType(idType: IdType) = apply { this.idType = idType }

                /**
                 * The ISO 3166-1 alpha-2 country code of the country that issued the identification
                 */
                fun issuingCountry(issuingCountry: String) = apply {
                    this.issuingCountry = issuingCountry
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): IdentificationCreateRequest =
                    IdentificationCreateRequest(
                        checkNotNull(idNumber) { "`idNumber` is required but was not set" },
                        checkNotNull(idType) { "`idType` is required but was not set" },
                        issuingCountry,
                        additionalProperties.toImmutable(),
                    )
            }

            class IdType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val AR_CUIL = of("ar_cuil")

                    @JvmField val AR_CUIT = of("ar_cuit")

                    @JvmField val BR_CNPJ = of("br_cnpj")

                    @JvmField val BR_CPF = of("br_cpf")

                    @JvmField val CL_RUN = of("cl_run")

                    @JvmField val CL_RUT = of("cl_rut")

                    @JvmField val CO_CEDULAS = of("co_cedulas")

                    @JvmField val CO_NIT = of("co_nit")

                    @JvmField val HN_ID = of("hn_id")

                    @JvmField val HN_RTN = of("hn_rtn")

                    @JvmField val IN_LEI = of("in_lei")

                    @JvmField val KR_BRN = of("kr_brn")

                    @JvmField val KR_CRN = of("kr_crn")

                    @JvmField val KR_RRN = of("kr_rrn")

                    @JvmField val PASSPORT = of("passport")

                    @JvmField val SA_TIN = of("sa_tin")

                    @JvmField val SA_VAT = of("sa_vat")

                    @JvmField val US_EIN = of("us_ein")

                    @JvmField val US_ITIN = of("us_itin")

                    @JvmField val US_SSN = of("us_ssn")

                    @JvmField val VN_TIN = of("vn_tin")

                    @JvmStatic fun of(value: String) = IdType(JsonField.of(value))
                }

                enum class Known {
                    AR_CUIL,
                    AR_CUIT,
                    BR_CNPJ,
                    BR_CPF,
                    CL_RUN,
                    CL_RUT,
                    CO_CEDULAS,
                    CO_NIT,
                    HN_ID,
                    HN_RTN,
                    IN_LEI,
                    KR_BRN,
                    KR_CRN,
                    KR_RRN,
                    PASSPORT,
                    SA_TIN,
                    SA_VAT,
                    US_EIN,
                    US_ITIN,
                    US_SSN,
                    VN_TIN,
                }

                enum class Value {
                    AR_CUIL,
                    AR_CUIT,
                    BR_CNPJ,
                    BR_CPF,
                    CL_RUN,
                    CL_RUT,
                    CO_CEDULAS,
                    CO_NIT,
                    HN_ID,
                    HN_RTN,
                    IN_LEI,
                    KR_BRN,
                    KR_CRN,
                    KR_RRN,
                    PASSPORT,
                    SA_TIN,
                    SA_VAT,
                    US_EIN,
                    US_ITIN,
                    US_SSN,
                    VN_TIN,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        AR_CUIL -> Value.AR_CUIL
                        AR_CUIT -> Value.AR_CUIT
                        BR_CNPJ -> Value.BR_CNPJ
                        BR_CPF -> Value.BR_CPF
                        CL_RUN -> Value.CL_RUN
                        CL_RUT -> Value.CL_RUT
                        CO_CEDULAS -> Value.CO_CEDULAS
                        CO_NIT -> Value.CO_NIT
                        HN_ID -> Value.HN_ID
                        HN_RTN -> Value.HN_RTN
                        IN_LEI -> Value.IN_LEI
                        KR_BRN -> Value.KR_BRN
                        KR_CRN -> Value.KR_CRN
                        KR_RRN -> Value.KR_RRN
                        PASSPORT -> Value.PASSPORT
                        SA_TIN -> Value.SA_TIN
                        SA_VAT -> Value.SA_VAT
                        US_EIN -> Value.US_EIN
                        US_ITIN -> Value.US_ITIN
                        US_SSN -> Value.US_SSN
                        VN_TIN -> Value.VN_TIN
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        AR_CUIL -> Known.AR_CUIL
                        AR_CUIT -> Known.AR_CUIT
                        BR_CNPJ -> Known.BR_CNPJ
                        BR_CPF -> Known.BR_CPF
                        CL_RUN -> Known.CL_RUN
                        CL_RUT -> Known.CL_RUT
                        CO_CEDULAS -> Known.CO_CEDULAS
                        CO_NIT -> Known.CO_NIT
                        HN_ID -> Known.HN_ID
                        HN_RTN -> Known.HN_RTN
                        IN_LEI -> Known.IN_LEI
                        KR_BRN -> Known.KR_BRN
                        KR_CRN -> Known.KR_CRN
                        KR_RRN -> Known.KR_RRN
                        PASSPORT -> Known.PASSPORT
                        SA_TIN -> Known.SA_TIN
                        SA_VAT -> Known.SA_VAT
                        US_EIN -> Known.US_EIN
                        US_ITIN -> Known.US_ITIN
                        US_SSN -> Known.US_SSN
                        VN_TIN -> Known.VN_TIN
                        else -> throw ModernTreasuryInvalidDataException("Unknown IdType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is IdType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is IdentificationCreateRequest && idNumber == other.idNumber && idType == other.idType && issuingCountry == other.issuingCountry && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(idNumber, idType, issuingCountry, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "IdentificationCreateRequest{idNumber=$idNumber, idType=$idType, issuingCountry=$issuingCountry, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class LegalEntityAssociationInlineCreateRequest
        @JsonCreator
        private constructor(
            @JsonProperty("relationship_types")
            private val relationshipTypes: List<RelationshipType>,
            @JsonProperty("child_legal_entity")
            private val childLegalEntity: ChildLegalEntityCreate?,
            @JsonProperty("child_legal_entity_id") private val childLegalEntityId: String?,
            @JsonProperty("ownership_percentage") private val ownershipPercentage: Long?,
            @JsonProperty("title") private val title: String?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonProperty("relationship_types")
            fun relationshipTypes(): List<RelationshipType> = relationshipTypes

            /** The child legal entity. */
            @JsonProperty("child_legal_entity")
            fun childLegalEntity(): Optional<ChildLegalEntityCreate> =
                Optional.ofNullable(childLegalEntity)

            /** The ID of the child legal entity. */
            @JsonProperty("child_legal_entity_id")
            fun childLegalEntityId(): Optional<String> = Optional.ofNullable(childLegalEntityId)

            /** The child entity's ownership percentage iff they are a beneficial owner. */
            @JsonProperty("ownership_percentage")
            fun ownershipPercentage(): Optional<Long> = Optional.ofNullable(ownershipPercentage)

            /** The job title of the child entity at the parent entity. */
            @JsonProperty("title") fun title(): Optional<String> = Optional.ofNullable(title)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var relationshipTypes: MutableList<RelationshipType>? = null
                private var childLegalEntity: ChildLegalEntityCreate? = null
                private var childLegalEntityId: String? = null
                private var ownershipPercentage: Long? = null
                private var title: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    legalEntityAssociationInlineCreateRequest:
                        LegalEntityAssociationInlineCreateRequest
                ) = apply {
                    relationshipTypes =
                        legalEntityAssociationInlineCreateRequest.relationshipTypes.toMutableList()
                    childLegalEntity = legalEntityAssociationInlineCreateRequest.childLegalEntity
                    childLegalEntityId =
                        legalEntityAssociationInlineCreateRequest.childLegalEntityId
                    ownershipPercentage =
                        legalEntityAssociationInlineCreateRequest.ownershipPercentage
                    title = legalEntityAssociationInlineCreateRequest.title
                    additionalProperties =
                        legalEntityAssociationInlineCreateRequest.additionalProperties
                            .toMutableMap()
                }

                fun relationshipTypes(relationshipTypes: List<RelationshipType>) = apply {
                    this.relationshipTypes = relationshipTypes.toMutableList()
                }

                fun addRelationshipType(relationshipType: RelationshipType) = apply {
                    relationshipTypes =
                        (relationshipTypes ?: mutableListOf()).apply { add(relationshipType) }
                }

                /** The child legal entity. */
                fun childLegalEntity(childLegalEntity: ChildLegalEntityCreate) = apply {
                    this.childLegalEntity = childLegalEntity
                }

                /** The ID of the child legal entity. */
                fun childLegalEntityId(childLegalEntityId: String) = apply {
                    this.childLegalEntityId = childLegalEntityId
                }

                /** The child entity's ownership percentage iff they are a beneficial owner. */
                fun ownershipPercentage(ownershipPercentage: Long) = apply {
                    this.ownershipPercentage = ownershipPercentage
                }

                /** The job title of the child entity at the parent entity. */
                fun title(title: String) = apply { this.title = title }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): LegalEntityAssociationInlineCreateRequest =
                    LegalEntityAssociationInlineCreateRequest(
                        checkNotNull(relationshipTypes) {
                                "`relationshipTypes` is required but was not set"
                            }
                            .toImmutable(),
                        childLegalEntity,
                        childLegalEntityId,
                        ownershipPercentage,
                        title,
                        additionalProperties.toImmutable(),
                    )
            }

            class RelationshipType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val BENEFICIAL_OWNER = of("beneficial_owner")

                    @JvmField val CONTROL_PERSON = of("control_person")

                    @JvmStatic fun of(value: String) = RelationshipType(JsonField.of(value))
                }

                enum class Known {
                    BENEFICIAL_OWNER,
                    CONTROL_PERSON,
                }

                enum class Value {
                    BENEFICIAL_OWNER,
                    CONTROL_PERSON,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        BENEFICIAL_OWNER -> Value.BENEFICIAL_OWNER
                        CONTROL_PERSON -> Value.CONTROL_PERSON
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        BENEFICIAL_OWNER -> Known.BENEFICIAL_OWNER
                        CONTROL_PERSON -> Known.CONTROL_PERSON
                        else ->
                            throw ModernTreasuryInvalidDataException(
                                "Unknown RelationshipType: $value"
                            )
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is RelationshipType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** The child legal entity. */
            @NoAutoDetect
            class ChildLegalEntityCreate
            @JsonCreator
            private constructor(
                @JsonProperty("addresses")
                private val addresses: List<LegalEntityAddressCreateRequest>?,
                @JsonProperty("bank_settings") private val bankSettings: BankSettings?,
                @JsonProperty("business_name") private val businessName: String?,
                @JsonProperty("citizenship_country") private val citizenshipCountry: String?,
                @JsonProperty("date_formed") private val dateFormed: LocalDate?,
                @JsonProperty("date_of_birth") private val dateOfBirth: LocalDate?,
                @JsonProperty("doing_business_as_names")
                private val doingBusinessAsNames: List<String>?,
                @JsonProperty("email") private val email: String?,
                @JsonProperty("first_name") private val firstName: String?,
                @JsonProperty("identifications")
                private val identifications: List<IdentificationCreateRequest>?,
                @JsonProperty("last_name") private val lastName: String?,
                @JsonProperty("legal_entity_type") private val legalEntityType: LegalEntityType?,
                @JsonProperty("legal_structure") private val legalStructure: LegalStructure?,
                @JsonProperty("metadata") private val metadata: Metadata?,
                @JsonProperty("middle_name") private val middleName: String?,
                @JsonProperty("phone_numbers") private val phoneNumbers: List<PhoneNumber>?,
                @JsonProperty("politically_exposed_person")
                private val politicallyExposedPerson: Boolean?,
                @JsonProperty("preferred_name") private val preferredName: String?,
                @JsonProperty("prefix") private val prefix: String?,
                @JsonProperty("risk_rating") private val riskRating: RiskRating?,
                @JsonProperty("suffix") private val suffix: String?,
                @JsonProperty("wealth_and_employment_details")
                private val wealthAndEmploymentDetails: WealthAndEmploymentDetails?,
                @JsonProperty("website") private val website: String?,
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** A list of addresses for the entity. */
                @JsonProperty("addresses")
                fun addresses(): Optional<List<LegalEntityAddressCreateRequest>> =
                    Optional.ofNullable(addresses)

                @JsonProperty("bank_settings")
                fun bankSettings(): Optional<BankSettings> = Optional.ofNullable(bankSettings)

                /** The business's legal business name. */
                @JsonProperty("business_name")
                fun businessName(): Optional<String> = Optional.ofNullable(businessName)

                /** The country of citizenship for an individual. */
                @JsonProperty("citizenship_country")
                fun citizenshipCountry(): Optional<String> = Optional.ofNullable(citizenshipCountry)

                /** A business's formation date (YYYY-MM-DD). */
                @JsonProperty("date_formed")
                fun dateFormed(): Optional<LocalDate> = Optional.ofNullable(dateFormed)

                /** An individual's date of birth (YYYY-MM-DD). */
                @JsonProperty("date_of_birth")
                fun dateOfBirth(): Optional<LocalDate> = Optional.ofNullable(dateOfBirth)

                @JsonProperty("doing_business_as_names")
                fun doingBusinessAsNames(): Optional<List<String>> =
                    Optional.ofNullable(doingBusinessAsNames)

                /** The entity's primary email. */
                @JsonProperty("email") fun email(): Optional<String> = Optional.ofNullable(email)

                /** An individual's first name. */
                @JsonProperty("first_name")
                fun firstName(): Optional<String> = Optional.ofNullable(firstName)

                /** A list of identifications for the legal entity. */
                @JsonProperty("identifications")
                fun identifications(): Optional<List<IdentificationCreateRequest>> =
                    Optional.ofNullable(identifications)

                /** An individual's last name. */
                @JsonProperty("last_name")
                fun lastName(): Optional<String> = Optional.ofNullable(lastName)

                /** The type of legal entity. */
                @JsonProperty("legal_entity_type")
                fun legalEntityType(): Optional<LegalEntityType> =
                    Optional.ofNullable(legalEntityType)

                /** The business's legal structure. */
                @JsonProperty("legal_structure")
                fun legalStructure(): Optional<LegalStructure> = Optional.ofNullable(legalStructure)

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata")
                fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

                /** An individual's middle name. */
                @JsonProperty("middle_name")
                fun middleName(): Optional<String> = Optional.ofNullable(middleName)

                @JsonProperty("phone_numbers")
                fun phoneNumbers(): Optional<List<PhoneNumber>> = Optional.ofNullable(phoneNumbers)

                /** Whether the individual is a politically exposed person. */
                @JsonProperty("politically_exposed_person")
                fun politicallyExposedPerson(): Optional<Boolean> =
                    Optional.ofNullable(politicallyExposedPerson)

                /** An individual's preferred name. */
                @JsonProperty("preferred_name")
                fun preferredName(): Optional<String> = Optional.ofNullable(preferredName)

                /** An individual's prefix. */
                @JsonProperty("prefix") fun prefix(): Optional<String> = Optional.ofNullable(prefix)

                /** The risk rating of the legal entity. One of low, medium, high. */
                @JsonProperty("risk_rating")
                fun riskRating(): Optional<RiskRating> = Optional.ofNullable(riskRating)

                /** An individual's suffix. */
                @JsonProperty("suffix") fun suffix(): Optional<String> = Optional.ofNullable(suffix)

                @JsonProperty("wealth_and_employment_details")
                fun wealthAndEmploymentDetails(): Optional<WealthAndEmploymentDetails> =
                    Optional.ofNullable(wealthAndEmploymentDetails)

                /** The entity's primary website URL. */
                @JsonProperty("website")
                fun website(): Optional<String> = Optional.ofNullable(website)

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var addresses: MutableList<LegalEntityAddressCreateRequest>? = null
                    private var bankSettings: BankSettings? = null
                    private var businessName: String? = null
                    private var citizenshipCountry: String? = null
                    private var dateFormed: LocalDate? = null
                    private var dateOfBirth: LocalDate? = null
                    private var doingBusinessAsNames: MutableList<String>? = null
                    private var email: String? = null
                    private var firstName: String? = null
                    private var identifications: MutableList<IdentificationCreateRequest>? = null
                    private var lastName: String? = null
                    private var legalEntityType: LegalEntityType? = null
                    private var legalStructure: LegalStructure? = null
                    private var metadata: Metadata? = null
                    private var middleName: String? = null
                    private var phoneNumbers: MutableList<PhoneNumber>? = null
                    private var politicallyExposedPerson: Boolean? = null
                    private var preferredName: String? = null
                    private var prefix: String? = null
                    private var riskRating: RiskRating? = null
                    private var suffix: String? = null
                    private var wealthAndEmploymentDetails: WealthAndEmploymentDetails? = null
                    private var website: String? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(childLegalEntityCreate: ChildLegalEntityCreate) = apply {
                        addresses = childLegalEntityCreate.addresses?.toMutableList()
                        bankSettings = childLegalEntityCreate.bankSettings
                        businessName = childLegalEntityCreate.businessName
                        citizenshipCountry = childLegalEntityCreate.citizenshipCountry
                        dateFormed = childLegalEntityCreate.dateFormed
                        dateOfBirth = childLegalEntityCreate.dateOfBirth
                        doingBusinessAsNames =
                            childLegalEntityCreate.doingBusinessAsNames?.toMutableList()
                        email = childLegalEntityCreate.email
                        firstName = childLegalEntityCreate.firstName
                        identifications = childLegalEntityCreate.identifications?.toMutableList()
                        lastName = childLegalEntityCreate.lastName
                        legalEntityType = childLegalEntityCreate.legalEntityType
                        legalStructure = childLegalEntityCreate.legalStructure
                        metadata = childLegalEntityCreate.metadata
                        middleName = childLegalEntityCreate.middleName
                        phoneNumbers = childLegalEntityCreate.phoneNumbers?.toMutableList()
                        politicallyExposedPerson = childLegalEntityCreate.politicallyExposedPerson
                        preferredName = childLegalEntityCreate.preferredName
                        prefix = childLegalEntityCreate.prefix
                        riskRating = childLegalEntityCreate.riskRating
                        suffix = childLegalEntityCreate.suffix
                        wealthAndEmploymentDetails =
                            childLegalEntityCreate.wealthAndEmploymentDetails
                        website = childLegalEntityCreate.website
                        additionalProperties =
                            childLegalEntityCreate.additionalProperties.toMutableMap()
                    }

                    /** A list of addresses for the entity. */
                    fun addresses(addresses: List<LegalEntityAddressCreateRequest>) = apply {
                        this.addresses = addresses.toMutableList()
                    }

                    /** A list of addresses for the entity. */
                    fun addAddress(address: LegalEntityAddressCreateRequest) = apply {
                        addresses = (addresses ?: mutableListOf()).apply { add(address) }
                    }

                    fun bankSettings(bankSettings: BankSettings) = apply {
                        this.bankSettings = bankSettings
                    }

                    /** The business's legal business name. */
                    fun businessName(businessName: String) = apply {
                        this.businessName = businessName
                    }

                    /** The country of citizenship for an individual. */
                    fun citizenshipCountry(citizenshipCountry: String) = apply {
                        this.citizenshipCountry = citizenshipCountry
                    }

                    /** A business's formation date (YYYY-MM-DD). */
                    fun dateFormed(dateFormed: LocalDate) = apply { this.dateFormed = dateFormed }

                    /** An individual's date of birth (YYYY-MM-DD). */
                    fun dateOfBirth(dateOfBirth: LocalDate) = apply {
                        this.dateOfBirth = dateOfBirth
                    }

                    fun doingBusinessAsNames(doingBusinessAsNames: List<String>) = apply {
                        this.doingBusinessAsNames = doingBusinessAsNames.toMutableList()
                    }

                    fun addDoingBusinessAsName(doingBusinessAsName: String) = apply {
                        doingBusinessAsNames =
                            (doingBusinessAsNames ?: mutableListOf()).apply {
                                add(doingBusinessAsName)
                            }
                    }

                    /** The entity's primary email. */
                    fun email(email: String) = apply { this.email = email }

                    /** An individual's first name. */
                    fun firstName(firstName: String) = apply { this.firstName = firstName }

                    /** A list of identifications for the legal entity. */
                    fun identifications(identifications: List<IdentificationCreateRequest>) =
                        apply {
                            this.identifications = identifications.toMutableList()
                        }

                    /** A list of identifications for the legal entity. */
                    fun addIdentification(identification: IdentificationCreateRequest) = apply {
                        identifications =
                            (identifications ?: mutableListOf()).apply { add(identification) }
                    }

                    /** An individual's last name. */
                    fun lastName(lastName: String) = apply { this.lastName = lastName }

                    /** The type of legal entity. */
                    fun legalEntityType(legalEntityType: LegalEntityType) = apply {
                        this.legalEntityType = legalEntityType
                    }

                    /** The business's legal structure. */
                    fun legalStructure(legalStructure: LegalStructure) = apply {
                        this.legalStructure = legalStructure
                    }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

                    /** An individual's middle name. */
                    fun middleName(middleName: String) = apply { this.middleName = middleName }

                    fun phoneNumbers(phoneNumbers: List<PhoneNumber>) = apply {
                        this.phoneNumbers = phoneNumbers.toMutableList()
                    }

                    fun addPhoneNumber(phoneNumber: PhoneNumber) = apply {
                        phoneNumbers = (phoneNumbers ?: mutableListOf()).apply { add(phoneNumber) }
                    }

                    /** Whether the individual is a politically exposed person. */
                    fun politicallyExposedPerson(politicallyExposedPerson: Boolean) = apply {
                        this.politicallyExposedPerson = politicallyExposedPerson
                    }

                    /** An individual's preferred name. */
                    fun preferredName(preferredName: String) = apply {
                        this.preferredName = preferredName
                    }

                    /** An individual's prefix. */
                    fun prefix(prefix: String) = apply { this.prefix = prefix }

                    /** The risk rating of the legal entity. One of low, medium, high. */
                    fun riskRating(riskRating: RiskRating) = apply { this.riskRating = riskRating }

                    /** An individual's suffix. */
                    fun suffix(suffix: String) = apply { this.suffix = suffix }

                    fun wealthAndEmploymentDetails(
                        wealthAndEmploymentDetails: WealthAndEmploymentDetails
                    ) = apply { this.wealthAndEmploymentDetails = wealthAndEmploymentDetails }

                    /** The entity's primary website URL. */
                    fun website(website: String) = apply { this.website = website }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): ChildLegalEntityCreate =
                        ChildLegalEntityCreate(
                            addresses?.toImmutable(),
                            bankSettings,
                            businessName,
                            citizenshipCountry,
                            dateFormed,
                            dateOfBirth,
                            doingBusinessAsNames?.toImmutable(),
                            email,
                            firstName,
                            identifications?.toImmutable(),
                            lastName,
                            legalEntityType,
                            legalStructure,
                            metadata,
                            middleName,
                            phoneNumbers?.toImmutable(),
                            politicallyExposedPerson,
                            preferredName,
                            prefix,
                            riskRating,
                            suffix,
                            wealthAndEmploymentDetails,
                            website,
                            additionalProperties.toImmutable(),
                        )
                }

                @NoAutoDetect
                class LegalEntityAddressCreateRequest
                @JsonCreator
                private constructor(
                    @JsonProperty("country") private val country: String?,
                    @JsonProperty("line1") private val line1: String?,
                    @JsonProperty("locality") private val locality: String?,
                    @JsonProperty("postal_code") private val postalCode: String?,
                    @JsonProperty("region") private val region: String?,
                    @JsonProperty("address_types") private val addressTypes: List<AddressType>?,
                    @JsonProperty("line2") private val line2: String?,
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /** Country code conforms to [ISO 3166-1 alpha-2] */
                    @JsonProperty("country")
                    fun country(): Optional<String> = Optional.ofNullable(country)

                    @JsonProperty("line1")
                    fun line1(): Optional<String> = Optional.ofNullable(line1)

                    /** Locality or City. */
                    @JsonProperty("locality")
                    fun locality(): Optional<String> = Optional.ofNullable(locality)

                    /** The postal code of the address. */
                    @JsonProperty("postal_code")
                    fun postalCode(): Optional<String> = Optional.ofNullable(postalCode)

                    /** Region or State. */
                    @JsonProperty("region")
                    fun region(): Optional<String> = Optional.ofNullable(region)

                    /** The types of this address. */
                    @JsonProperty("address_types")
                    fun addressTypes(): Optional<List<AddressType>> =
                        Optional.ofNullable(addressTypes)

                    @JsonProperty("line2")
                    fun line2(): Optional<String> = Optional.ofNullable(line2)

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var country: String? = null
                        private var line1: String? = null
                        private var locality: String? = null
                        private var postalCode: String? = null
                        private var region: String? = null
                        private var addressTypes: MutableList<AddressType>? = null
                        private var line2: String? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(
                            legalEntityAddressCreateRequest: LegalEntityAddressCreateRequest
                        ) = apply {
                            country = legalEntityAddressCreateRequest.country
                            line1 = legalEntityAddressCreateRequest.line1
                            locality = legalEntityAddressCreateRequest.locality
                            postalCode = legalEntityAddressCreateRequest.postalCode
                            region = legalEntityAddressCreateRequest.region
                            addressTypes =
                                legalEntityAddressCreateRequest.addressTypes?.toMutableList()
                            line2 = legalEntityAddressCreateRequest.line2
                            additionalProperties =
                                legalEntityAddressCreateRequest.additionalProperties.toMutableMap()
                        }

                        /** Country code conforms to [ISO 3166-1 alpha-2] */
                        fun country(country: String) = apply { this.country = country }

                        fun line1(line1: String) = apply { this.line1 = line1 }

                        /** Locality or City. */
                        fun locality(locality: String) = apply { this.locality = locality }

                        /** The postal code of the address. */
                        fun postalCode(postalCode: String) = apply { this.postalCode = postalCode }

                        /** Region or State. */
                        fun region(region: String) = apply { this.region = region }

                        /** The types of this address. */
                        fun addressTypes(addressTypes: List<AddressType>) = apply {
                            this.addressTypes = addressTypes.toMutableList()
                        }

                        /** The types of this address. */
                        fun addAddressType(addressType: AddressType) = apply {
                            addressTypes =
                                (addressTypes ?: mutableListOf()).apply { add(addressType) }
                        }

                        fun line2(line2: String) = apply { this.line2 = line2 }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): LegalEntityAddressCreateRequest =
                            LegalEntityAddressCreateRequest(
                                country,
                                line1,
                                locality,
                                postalCode,
                                region,
                                addressTypes?.toImmutable(),
                                line2,
                                additionalProperties.toImmutable(),
                            )
                    }

                    class AddressType
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val BUSINESS = of("business")

                            @JvmField val MAILING = of("mailing")

                            @JvmField val OTHER = of("other")

                            @JvmField val PO_BOX = of("po_box")

                            @JvmField val RESIDENTIAL = of("residential")

                            @JvmStatic fun of(value: String) = AddressType(JsonField.of(value))
                        }

                        enum class Known {
                            BUSINESS,
                            MAILING,
                            OTHER,
                            PO_BOX,
                            RESIDENTIAL,
                        }

                        enum class Value {
                            BUSINESS,
                            MAILING,
                            OTHER,
                            PO_BOX,
                            RESIDENTIAL,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                BUSINESS -> Value.BUSINESS
                                MAILING -> Value.MAILING
                                OTHER -> Value.OTHER
                                PO_BOX -> Value.PO_BOX
                                RESIDENTIAL -> Value.RESIDENTIAL
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                BUSINESS -> Known.BUSINESS
                                MAILING -> Known.MAILING
                                OTHER -> Known.OTHER
                                PO_BOX -> Known.PO_BOX
                                RESIDENTIAL -> Known.RESIDENTIAL
                                else ->
                                    throw ModernTreasuryInvalidDataException(
                                        "Unknown AddressType: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is AddressType && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is LegalEntityAddressCreateRequest && country == other.country && line1 == other.line1 && locality == other.locality && postalCode == other.postalCode && region == other.region && addressTypes == other.addressTypes && line2 == other.line2 && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(country, line1, locality, postalCode, region, addressTypes, line2, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "LegalEntityAddressCreateRequest{country=$country, line1=$line1, locality=$locality, postalCode=$postalCode, region=$region, addressTypes=$addressTypes, line2=$line2, additionalProperties=$additionalProperties}"
                }

                @NoAutoDetect
                class IdentificationCreateRequest
                @JsonCreator
                private constructor(
                    @JsonProperty("id_number") private val idNumber: String,
                    @JsonProperty("id_type") private val idType: IdType,
                    @JsonProperty("issuing_country") private val issuingCountry: String?,
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /** The ID number of identification document. */
                    @JsonProperty("id_number") fun idNumber(): String = idNumber

                    /** The type of ID number. */
                    @JsonProperty("id_type") fun idType(): IdType = idType

                    /**
                     * The ISO 3166-1 alpha-2 country code of the country that issued the
                     * identification
                     */
                    @JsonProperty("issuing_country")
                    fun issuingCountry(): Optional<String> = Optional.ofNullable(issuingCountry)

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var idNumber: String? = null
                        private var idType: IdType? = null
                        private var issuingCountry: String? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(
                            identificationCreateRequest: IdentificationCreateRequest
                        ) = apply {
                            idNumber = identificationCreateRequest.idNumber
                            idType = identificationCreateRequest.idType
                            issuingCountry = identificationCreateRequest.issuingCountry
                            additionalProperties =
                                identificationCreateRequest.additionalProperties.toMutableMap()
                        }

                        /** The ID number of identification document. */
                        fun idNumber(idNumber: String) = apply { this.idNumber = idNumber }

                        /** The type of ID number. */
                        fun idType(idType: IdType) = apply { this.idType = idType }

                        /**
                         * The ISO 3166-1 alpha-2 country code of the country that issued the
                         * identification
                         */
                        fun issuingCountry(issuingCountry: String) = apply {
                            this.issuingCountry = issuingCountry
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): IdentificationCreateRequest =
                            IdentificationCreateRequest(
                                checkNotNull(idNumber) { "`idNumber` is required but was not set" },
                                checkNotNull(idType) { "`idType` is required but was not set" },
                                issuingCountry,
                                additionalProperties.toImmutable(),
                            )
                    }

                    class IdType
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val AR_CUIL = of("ar_cuil")

                            @JvmField val AR_CUIT = of("ar_cuit")

                            @JvmField val BR_CNPJ = of("br_cnpj")

                            @JvmField val BR_CPF = of("br_cpf")

                            @JvmField val CL_RUN = of("cl_run")

                            @JvmField val CL_RUT = of("cl_rut")

                            @JvmField val CO_CEDULAS = of("co_cedulas")

                            @JvmField val CO_NIT = of("co_nit")

                            @JvmField val HN_ID = of("hn_id")

                            @JvmField val HN_RTN = of("hn_rtn")

                            @JvmField val IN_LEI = of("in_lei")

                            @JvmField val KR_BRN = of("kr_brn")

                            @JvmField val KR_CRN = of("kr_crn")

                            @JvmField val KR_RRN = of("kr_rrn")

                            @JvmField val PASSPORT = of("passport")

                            @JvmField val SA_TIN = of("sa_tin")

                            @JvmField val SA_VAT = of("sa_vat")

                            @JvmField val US_EIN = of("us_ein")

                            @JvmField val US_ITIN = of("us_itin")

                            @JvmField val US_SSN = of("us_ssn")

                            @JvmField val VN_TIN = of("vn_tin")

                            @JvmStatic fun of(value: String) = IdType(JsonField.of(value))
                        }

                        enum class Known {
                            AR_CUIL,
                            AR_CUIT,
                            BR_CNPJ,
                            BR_CPF,
                            CL_RUN,
                            CL_RUT,
                            CO_CEDULAS,
                            CO_NIT,
                            HN_ID,
                            HN_RTN,
                            IN_LEI,
                            KR_BRN,
                            KR_CRN,
                            KR_RRN,
                            PASSPORT,
                            SA_TIN,
                            SA_VAT,
                            US_EIN,
                            US_ITIN,
                            US_SSN,
                            VN_TIN,
                        }

                        enum class Value {
                            AR_CUIL,
                            AR_CUIT,
                            BR_CNPJ,
                            BR_CPF,
                            CL_RUN,
                            CL_RUT,
                            CO_CEDULAS,
                            CO_NIT,
                            HN_ID,
                            HN_RTN,
                            IN_LEI,
                            KR_BRN,
                            KR_CRN,
                            KR_RRN,
                            PASSPORT,
                            SA_TIN,
                            SA_VAT,
                            US_EIN,
                            US_ITIN,
                            US_SSN,
                            VN_TIN,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                AR_CUIL -> Value.AR_CUIL
                                AR_CUIT -> Value.AR_CUIT
                                BR_CNPJ -> Value.BR_CNPJ
                                BR_CPF -> Value.BR_CPF
                                CL_RUN -> Value.CL_RUN
                                CL_RUT -> Value.CL_RUT
                                CO_CEDULAS -> Value.CO_CEDULAS
                                CO_NIT -> Value.CO_NIT
                                HN_ID -> Value.HN_ID
                                HN_RTN -> Value.HN_RTN
                                IN_LEI -> Value.IN_LEI
                                KR_BRN -> Value.KR_BRN
                                KR_CRN -> Value.KR_CRN
                                KR_RRN -> Value.KR_RRN
                                PASSPORT -> Value.PASSPORT
                                SA_TIN -> Value.SA_TIN
                                SA_VAT -> Value.SA_VAT
                                US_EIN -> Value.US_EIN
                                US_ITIN -> Value.US_ITIN
                                US_SSN -> Value.US_SSN
                                VN_TIN -> Value.VN_TIN
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                AR_CUIL -> Known.AR_CUIL
                                AR_CUIT -> Known.AR_CUIT
                                BR_CNPJ -> Known.BR_CNPJ
                                BR_CPF -> Known.BR_CPF
                                CL_RUN -> Known.CL_RUN
                                CL_RUT -> Known.CL_RUT
                                CO_CEDULAS -> Known.CO_CEDULAS
                                CO_NIT -> Known.CO_NIT
                                HN_ID -> Known.HN_ID
                                HN_RTN -> Known.HN_RTN
                                IN_LEI -> Known.IN_LEI
                                KR_BRN -> Known.KR_BRN
                                KR_CRN -> Known.KR_CRN
                                KR_RRN -> Known.KR_RRN
                                PASSPORT -> Known.PASSPORT
                                SA_TIN -> Known.SA_TIN
                                SA_VAT -> Known.SA_VAT
                                US_EIN -> Known.US_EIN
                                US_ITIN -> Known.US_ITIN
                                US_SSN -> Known.US_SSN
                                VN_TIN -> Known.VN_TIN
                                else ->
                                    throw ModernTreasuryInvalidDataException(
                                        "Unknown IdType: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is IdType && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is IdentificationCreateRequest && idNumber == other.idNumber && idType == other.idType && issuingCountry == other.issuingCountry && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(idNumber, idType, issuingCountry, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "IdentificationCreateRequest{idNumber=$idNumber, idType=$idType, issuingCountry=$issuingCountry, additionalProperties=$additionalProperties}"
                }

                class LegalEntityType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val BUSINESS = of("business")

                        @JvmField val INDIVIDUAL = of("individual")

                        @JvmStatic fun of(value: String) = LegalEntityType(JsonField.of(value))
                    }

                    enum class Known {
                        BUSINESS,
                        INDIVIDUAL,
                    }

                    enum class Value {
                        BUSINESS,
                        INDIVIDUAL,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            BUSINESS -> Value.BUSINESS
                            INDIVIDUAL -> Value.INDIVIDUAL
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            BUSINESS -> Known.BUSINESS
                            INDIVIDUAL -> Known.INDIVIDUAL
                            else ->
                                throw ModernTreasuryInvalidDataException(
                                    "Unknown LegalEntityType: $value"
                                )
                        }

                    fun asString(): String = _value().asStringOrThrow()

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is LegalEntityType && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                class LegalStructure
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val CORPORATION = of("corporation")

                        @JvmField val LLC = of("llc")

                        @JvmField val NON_PROFIT = of("non_profit")

                        @JvmField val PARTNERSHIP = of("partnership")

                        @JvmField val SOLE_PROPRIETORSHIP = of("sole_proprietorship")

                        @JvmField val TRUST = of("trust")

                        @JvmStatic fun of(value: String) = LegalStructure(JsonField.of(value))
                    }

                    enum class Known {
                        CORPORATION,
                        LLC,
                        NON_PROFIT,
                        PARTNERSHIP,
                        SOLE_PROPRIETORSHIP,
                        TRUST,
                    }

                    enum class Value {
                        CORPORATION,
                        LLC,
                        NON_PROFIT,
                        PARTNERSHIP,
                        SOLE_PROPRIETORSHIP,
                        TRUST,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            CORPORATION -> Value.CORPORATION
                            LLC -> Value.LLC
                            NON_PROFIT -> Value.NON_PROFIT
                            PARTNERSHIP -> Value.PARTNERSHIP
                            SOLE_PROPRIETORSHIP -> Value.SOLE_PROPRIETORSHIP
                            TRUST -> Value.TRUST
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            CORPORATION -> Known.CORPORATION
                            LLC -> Known.LLC
                            NON_PROFIT -> Known.NON_PROFIT
                            PARTNERSHIP -> Known.PARTNERSHIP
                            SOLE_PROPRIETORSHIP -> Known.SOLE_PROPRIETORSHIP
                            TRUST -> Known.TRUST
                            else ->
                                throw ModernTreasuryInvalidDataException(
                                    "Unknown LegalStructure: $value"
                                )
                        }

                    fun asString(): String = _value().asStringOrThrow()

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is LegalStructure && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @NoAutoDetect
                class Metadata
                @JsonCreator
                private constructor(
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(metadata: Metadata) = apply {
                            additionalProperties = metadata.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): Metadata = Metadata(additionalProperties.toImmutable())
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
                }

                /** A list of phone numbers in E.164 format. */
                @NoAutoDetect
                class PhoneNumber
                @JsonCreator
                private constructor(
                    @JsonProperty("phone_number") private val phoneNumber: String?,
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    @JsonProperty("phone_number")
                    fun phoneNumber(): Optional<String> = Optional.ofNullable(phoneNumber)

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var phoneNumber: String? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(phoneNumber: PhoneNumber) = apply {
                            this.phoneNumber = phoneNumber.phoneNumber
                            additionalProperties = phoneNumber.additionalProperties.toMutableMap()
                        }

                        fun phoneNumber(phoneNumber: String) = apply {
                            this.phoneNumber = phoneNumber
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): PhoneNumber =
                            PhoneNumber(phoneNumber, additionalProperties.toImmutable())
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is PhoneNumber && phoneNumber == other.phoneNumber && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(phoneNumber, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "PhoneNumber{phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
                }

                class RiskRating
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val LOW = of("low")

                        @JvmField val MEDIUM = of("medium")

                        @JvmField val HIGH = of("high")

                        @JvmStatic fun of(value: String) = RiskRating(JsonField.of(value))
                    }

                    enum class Known {
                        LOW,
                        MEDIUM,
                        HIGH,
                    }

                    enum class Value {
                        LOW,
                        MEDIUM,
                        HIGH,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            LOW -> Value.LOW
                            MEDIUM -> Value.MEDIUM
                            HIGH -> Value.HIGH
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            LOW -> Known.LOW
                            MEDIUM -> Known.MEDIUM
                            HIGH -> Known.HIGH
                            else ->
                                throw ModernTreasuryInvalidDataException(
                                    "Unknown RiskRating: $value"
                                )
                        }

                    fun asString(): String = _value().asStringOrThrow()

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is RiskRating && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ChildLegalEntityCreate && addresses == other.addresses && bankSettings == other.bankSettings && businessName == other.businessName && citizenshipCountry == other.citizenshipCountry && dateFormed == other.dateFormed && dateOfBirth == other.dateOfBirth && doingBusinessAsNames == other.doingBusinessAsNames && email == other.email && firstName == other.firstName && identifications == other.identifications && lastName == other.lastName && legalEntityType == other.legalEntityType && legalStructure == other.legalStructure && metadata == other.metadata && middleName == other.middleName && phoneNumbers == other.phoneNumbers && politicallyExposedPerson == other.politicallyExposedPerson && preferredName == other.preferredName && prefix == other.prefix && riskRating == other.riskRating && suffix == other.suffix && wealthAndEmploymentDetails == other.wealthAndEmploymentDetails && website == other.website && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(addresses, bankSettings, businessName, citizenshipCountry, dateFormed, dateOfBirth, doingBusinessAsNames, email, firstName, identifications, lastName, legalEntityType, legalStructure, metadata, middleName, phoneNumbers, politicallyExposedPerson, preferredName, prefix, riskRating, suffix, wealthAndEmploymentDetails, website, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ChildLegalEntityCreate{addresses=$addresses, bankSettings=$bankSettings, businessName=$businessName, citizenshipCountry=$citizenshipCountry, dateFormed=$dateFormed, dateOfBirth=$dateOfBirth, doingBusinessAsNames=$doingBusinessAsNames, email=$email, firstName=$firstName, identifications=$identifications, lastName=$lastName, legalEntityType=$legalEntityType, legalStructure=$legalStructure, metadata=$metadata, middleName=$middleName, phoneNumbers=$phoneNumbers, politicallyExposedPerson=$politicallyExposedPerson, preferredName=$preferredName, prefix=$prefix, riskRating=$riskRating, suffix=$suffix, wealthAndEmploymentDetails=$wealthAndEmploymentDetails, website=$website, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is LegalEntityAssociationInlineCreateRequest && relationshipTypes == other.relationshipTypes && childLegalEntity == other.childLegalEntity && childLegalEntityId == other.childLegalEntityId && ownershipPercentage == other.ownershipPercentage && title == other.title && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(relationshipTypes, childLegalEntity, childLegalEntityId, ownershipPercentage, title, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LegalEntityAssociationInlineCreateRequest{relationshipTypes=$relationshipTypes, childLegalEntity=$childLegalEntity, childLegalEntityId=$childLegalEntityId, ownershipPercentage=$ownershipPercentage, title=$title, additionalProperties=$additionalProperties}"
        }

        class LegalEntityType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val BUSINESS = of("business")

                @JvmField val INDIVIDUAL = of("individual")

                @JvmStatic fun of(value: String) = LegalEntityType(JsonField.of(value))
            }

            enum class Known {
                BUSINESS,
                INDIVIDUAL,
            }

            enum class Value {
                BUSINESS,
                INDIVIDUAL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    BUSINESS -> Value.BUSINESS
                    INDIVIDUAL -> Value.INDIVIDUAL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    BUSINESS -> Known.BUSINESS
                    INDIVIDUAL -> Known.INDIVIDUAL
                    else ->
                        throw ModernTreasuryInvalidDataException("Unknown LegalEntityType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is LegalEntityType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class LegalStructure
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val CORPORATION = of("corporation")

                @JvmField val LLC = of("llc")

                @JvmField val NON_PROFIT = of("non_profit")

                @JvmField val PARTNERSHIP = of("partnership")

                @JvmField val SOLE_PROPRIETORSHIP = of("sole_proprietorship")

                @JvmField val TRUST = of("trust")

                @JvmStatic fun of(value: String) = LegalStructure(JsonField.of(value))
            }

            enum class Known {
                CORPORATION,
                LLC,
                NON_PROFIT,
                PARTNERSHIP,
                SOLE_PROPRIETORSHIP,
                TRUST,
            }

            enum class Value {
                CORPORATION,
                LLC,
                NON_PROFIT,
                PARTNERSHIP,
                SOLE_PROPRIETORSHIP,
                TRUST,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    CORPORATION -> Value.CORPORATION
                    LLC -> Value.LLC
                    NON_PROFIT -> Value.NON_PROFIT
                    PARTNERSHIP -> Value.PARTNERSHIP
                    SOLE_PROPRIETORSHIP -> Value.SOLE_PROPRIETORSHIP
                    TRUST -> Value.TRUST
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    CORPORATION -> Known.CORPORATION
                    LLC -> Known.LLC
                    NON_PROFIT -> Known.NON_PROFIT
                    PARTNERSHIP -> Known.PARTNERSHIP
                    SOLE_PROPRIETORSHIP -> Known.SOLE_PROPRIETORSHIP
                    TRUST -> Known.TRUST
                    else ->
                        throw ModernTreasuryInvalidDataException("Unknown LegalStructure: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is LegalStructure && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @NoAutoDetect
        class Metadata
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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
                internal fun from(metadata: Metadata) = apply {
                    additionalProperties = metadata.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        /** A list of phone numbers in E.164 format. */
        @NoAutoDetect
        class PhoneNumber
        @JsonCreator
        private constructor(
            @JsonProperty("phone_number") private val phoneNumber: String?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonProperty("phone_number")
            fun phoneNumber(): Optional<String> = Optional.ofNullable(phoneNumber)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var phoneNumber: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(phoneNumber: PhoneNumber) = apply {
                    this.phoneNumber = phoneNumber.phoneNumber
                    additionalProperties = phoneNumber.additionalProperties.toMutableMap()
                }

                fun phoneNumber(phoneNumber: String) = apply { this.phoneNumber = phoneNumber }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): PhoneNumber =
                    PhoneNumber(phoneNumber, additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PhoneNumber && phoneNumber == other.phoneNumber && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(phoneNumber, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PhoneNumber{phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
        }

        class RiskRating
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val LOW = of("low")

                @JvmField val MEDIUM = of("medium")

                @JvmField val HIGH = of("high")

                @JvmStatic fun of(value: String) = RiskRating(JsonField.of(value))
            }

            enum class Known {
                LOW,
                MEDIUM,
                HIGH,
            }

            enum class Value {
                LOW,
                MEDIUM,
                HIGH,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    LOW -> Value.LOW
                    MEDIUM -> Value.MEDIUM
                    HIGH -> Value.HIGH
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    LOW -> Known.LOW
                    MEDIUM -> Known.MEDIUM
                    HIGH -> Known.HIGH
                    else -> throw ModernTreasuryInvalidDataException("Unknown RiskRating: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RiskRating && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LegalEntity && addresses == other.addresses && bankSettings == other.bankSettings && businessName == other.businessName && citizenshipCountry == other.citizenshipCountry && dateFormed == other.dateFormed && dateOfBirth == other.dateOfBirth && doingBusinessAsNames == other.doingBusinessAsNames && email == other.email && firstName == other.firstName && identifications == other.identifications && lastName == other.lastName && legalEntityAssociations == other.legalEntityAssociations && legalEntityType == other.legalEntityType && legalStructure == other.legalStructure && metadata == other.metadata && middleName == other.middleName && phoneNumbers == other.phoneNumbers && politicallyExposedPerson == other.politicallyExposedPerson && preferredName == other.preferredName && prefix == other.prefix && riskRating == other.riskRating && suffix == other.suffix && wealthAndEmploymentDetails == other.wealthAndEmploymentDetails && website == other.website && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(addresses, bankSettings, businessName, citizenshipCountry, dateFormed, dateOfBirth, doingBusinessAsNames, email, firstName, identifications, lastName, legalEntityAssociations, legalEntityType, legalStructure, metadata, middleName, phoneNumbers, politicallyExposedPerson, preferredName, prefix, riskRating, suffix, wealthAndEmploymentDetails, website, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LegalEntity{addresses=$addresses, bankSettings=$bankSettings, businessName=$businessName, citizenshipCountry=$citizenshipCountry, dateFormed=$dateFormed, dateOfBirth=$dateOfBirth, doingBusinessAsNames=$doingBusinessAsNames, email=$email, firstName=$firstName, identifications=$identifications, lastName=$lastName, legalEntityAssociations=$legalEntityAssociations, legalEntityType=$legalEntityType, legalStructure=$legalStructure, metadata=$metadata, middleName=$middleName, phoneNumbers=$phoneNumbers, politicallyExposedPerson=$politicallyExposedPerson, preferredName=$preferredName, prefix=$prefix, riskRating=$riskRating, suffix=$suffix, wealthAndEmploymentDetails=$wealthAndEmploymentDetails, website=$website, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ConnectionLegalEntityCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ConnectionLegalEntityCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
