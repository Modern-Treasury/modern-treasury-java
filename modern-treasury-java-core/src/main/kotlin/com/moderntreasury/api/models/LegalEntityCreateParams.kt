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
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.util.Objects
import java.util.Optional

class LegalEntityCreateParams
constructor(
    private val legalEntityType: LegalEntityType,
    private val addresses: List<LegalEntityAddressCreateRequest>?,
    private val bankSettings: BankSettings?,
    private val businessName: String?,
    private val citizenshipCountry: String?,
    private val dateFormed: LocalDate?,
    private val dateOfBirth: LocalDate?,
    private val doingBusinessAsNames: List<String>?,
    private val email: String?,
    private val firstName: String?,
    private val identifications: List<IdentificationCreateRequest>?,
    private val lastName: String?,
    private val legalEntityAssociations: List<LegalEntityAssociationInlineCreateRequest>?,
    private val legalStructure: LegalStructure?,
    private val metadata: Metadata?,
    private val middleName: String?,
    private val phoneNumbers: List<PhoneNumber>?,
    private val politicallyExposedPerson: Boolean?,
    private val preferredName: String?,
    private val prefix: String?,
    private val riskRating: RiskRating?,
    private val suffix: String?,
    private val wealthAndEmploymentDetails: WealthAndEmploymentDetails?,
    private val website: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun legalEntityType(): LegalEntityType = legalEntityType

    fun addresses(): Optional<List<LegalEntityAddressCreateRequest>> =
        Optional.ofNullable(addresses)

    fun bankSettings(): Optional<BankSettings> = Optional.ofNullable(bankSettings)

    fun businessName(): Optional<String> = Optional.ofNullable(businessName)

    fun citizenshipCountry(): Optional<String> = Optional.ofNullable(citizenshipCountry)

    fun dateFormed(): Optional<LocalDate> = Optional.ofNullable(dateFormed)

    fun dateOfBirth(): Optional<LocalDate> = Optional.ofNullable(dateOfBirth)

    fun doingBusinessAsNames(): Optional<List<String>> = Optional.ofNullable(doingBusinessAsNames)

    fun email(): Optional<String> = Optional.ofNullable(email)

    fun firstName(): Optional<String> = Optional.ofNullable(firstName)

    fun identifications(): Optional<List<IdentificationCreateRequest>> =
        Optional.ofNullable(identifications)

    fun lastName(): Optional<String> = Optional.ofNullable(lastName)

    fun legalEntityAssociations(): Optional<List<LegalEntityAssociationInlineCreateRequest>> =
        Optional.ofNullable(legalEntityAssociations)

    fun legalStructure(): Optional<LegalStructure> = Optional.ofNullable(legalStructure)

    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

    fun middleName(): Optional<String> = Optional.ofNullable(middleName)

    fun phoneNumbers(): Optional<List<PhoneNumber>> = Optional.ofNullable(phoneNumbers)

    fun politicallyExposedPerson(): Optional<Boolean> =
        Optional.ofNullable(politicallyExposedPerson)

    fun preferredName(): Optional<String> = Optional.ofNullable(preferredName)

    fun prefix(): Optional<String> = Optional.ofNullable(prefix)

    fun riskRating(): Optional<RiskRating> = Optional.ofNullable(riskRating)

    fun suffix(): Optional<String> = Optional.ofNullable(suffix)

    fun wealthAndEmploymentDetails(): Optional<WealthAndEmploymentDetails> =
        Optional.ofNullable(wealthAndEmploymentDetails)

    fun website(): Optional<String> = Optional.ofNullable(website)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): LegalEntityCreateBody {
        return LegalEntityCreateBody(
            legalEntityType,
            addresses,
            bankSettings,
            businessName,
            citizenshipCountry,
            dateFormed,
            dateOfBirth,
            doingBusinessAsNames,
            email,
            firstName,
            identifications,
            lastName,
            legalEntityAssociations,
            legalStructure,
            metadata,
            middleName,
            phoneNumbers,
            politicallyExposedPerson,
            preferredName,
            prefix,
            riskRating,
            suffix,
            wealthAndEmploymentDetails,
            website,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = LegalEntityCreateBody.Builder::class)
    @NoAutoDetect
    class LegalEntityCreateBody
    internal constructor(
        private val legalEntityType: LegalEntityType?,
        private val addresses: List<LegalEntityAddressCreateRequest>?,
        private val bankSettings: BankSettings?,
        private val businessName: String?,
        private val citizenshipCountry: String?,
        private val dateFormed: LocalDate?,
        private val dateOfBirth: LocalDate?,
        private val doingBusinessAsNames: List<String>?,
        private val email: String?,
        private val firstName: String?,
        private val identifications: List<IdentificationCreateRequest>?,
        private val lastName: String?,
        private val legalEntityAssociations: List<LegalEntityAssociationInlineCreateRequest>?,
        private val legalStructure: LegalStructure?,
        private val metadata: Metadata?,
        private val middleName: String?,
        private val phoneNumbers: List<PhoneNumber>?,
        private val politicallyExposedPerson: Boolean?,
        private val preferredName: String?,
        private val prefix: String?,
        private val riskRating: RiskRating?,
        private val suffix: String?,
        private val wealthAndEmploymentDetails: WealthAndEmploymentDetails?,
        private val website: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The type of legal entity. */
        @JsonProperty("legal_entity_type") fun legalEntityType(): LegalEntityType? = legalEntityType

        /** A list of addresses for the entity. */
        @JsonProperty("addresses")
        fun addresses(): List<LegalEntityAddressCreateRequest>? = addresses

        @JsonProperty("bank_settings") fun bankSettings(): BankSettings? = bankSettings

        /** The business's legal business name. */
        @JsonProperty("business_name") fun businessName(): String? = businessName

        /** The country of citizenship for an individual. */
        @JsonProperty("citizenship_country") fun citizenshipCountry(): String? = citizenshipCountry

        /** A business's formation date (YYYY-MM-DD). */
        @JsonProperty("date_formed") fun dateFormed(): LocalDate? = dateFormed

        /** An individual's date of birth (YYYY-MM-DD). */
        @JsonProperty("date_of_birth") fun dateOfBirth(): LocalDate? = dateOfBirth

        @JsonProperty("doing_business_as_names")
        fun doingBusinessAsNames(): List<String>? = doingBusinessAsNames

        /** The entity's primary email. */
        @JsonProperty("email") fun email(): String? = email

        /** An individual's first name. */
        @JsonProperty("first_name") fun firstName(): String? = firstName

        /** A list of identifications for the legal entity. */
        @JsonProperty("identifications")
        fun identifications(): List<IdentificationCreateRequest>? = identifications

        /** An individual's last name. */
        @JsonProperty("last_name") fun lastName(): String? = lastName

        /** The legal entity associations and its child legal entities. */
        @JsonProperty("legal_entity_associations")
        fun legalEntityAssociations(): List<LegalEntityAssociationInlineCreateRequest>? =
            legalEntityAssociations

        /** The business's legal structure. */
        @JsonProperty("legal_structure") fun legalStructure(): LegalStructure? = legalStructure

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /** An individual's middle name. */
        @JsonProperty("middle_name") fun middleName(): String? = middleName

        @JsonProperty("phone_numbers") fun phoneNumbers(): List<PhoneNumber>? = phoneNumbers

        /** Whether the individual is a politically exposed person. */
        @JsonProperty("politically_exposed_person")
        fun politicallyExposedPerson(): Boolean? = politicallyExposedPerson

        /** An individual's preferred name. */
        @JsonProperty("preferred_name") fun preferredName(): String? = preferredName

        /** An individual's prefix. */
        @JsonProperty("prefix") fun prefix(): String? = prefix

        /** The risk rating of the legal entity. One of low, medium, high. */
        @JsonProperty("risk_rating") fun riskRating(): RiskRating? = riskRating

        /** An individual's suffix. */
        @JsonProperty("suffix") fun suffix(): String? = suffix

        @JsonProperty("wealth_and_employment_details")
        fun wealthAndEmploymentDetails(): WealthAndEmploymentDetails? = wealthAndEmploymentDetails

        /** The entity's primary website URL. */
        @JsonProperty("website") fun website(): String? = website

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var legalEntityType: LegalEntityType? = null
            private var addresses: List<LegalEntityAddressCreateRequest>? = null
            private var bankSettings: BankSettings? = null
            private var businessName: String? = null
            private var citizenshipCountry: String? = null
            private var dateFormed: LocalDate? = null
            private var dateOfBirth: LocalDate? = null
            private var doingBusinessAsNames: List<String>? = null
            private var email: String? = null
            private var firstName: String? = null
            private var identifications: List<IdentificationCreateRequest>? = null
            private var lastName: String? = null
            private var legalEntityAssociations: List<LegalEntityAssociationInlineCreateRequest>? =
                null
            private var legalStructure: LegalStructure? = null
            private var metadata: Metadata? = null
            private var middleName: String? = null
            private var phoneNumbers: List<PhoneNumber>? = null
            private var politicallyExposedPerson: Boolean? = null
            private var preferredName: String? = null
            private var prefix: String? = null
            private var riskRating: RiskRating? = null
            private var suffix: String? = null
            private var wealthAndEmploymentDetails: WealthAndEmploymentDetails? = null
            private var website: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(legalEntityCreateBody: LegalEntityCreateBody) = apply {
                this.legalEntityType = legalEntityCreateBody.legalEntityType
                this.addresses = legalEntityCreateBody.addresses
                this.bankSettings = legalEntityCreateBody.bankSettings
                this.businessName = legalEntityCreateBody.businessName
                this.citizenshipCountry = legalEntityCreateBody.citizenshipCountry
                this.dateFormed = legalEntityCreateBody.dateFormed
                this.dateOfBirth = legalEntityCreateBody.dateOfBirth
                this.doingBusinessAsNames = legalEntityCreateBody.doingBusinessAsNames
                this.email = legalEntityCreateBody.email
                this.firstName = legalEntityCreateBody.firstName
                this.identifications = legalEntityCreateBody.identifications
                this.lastName = legalEntityCreateBody.lastName
                this.legalEntityAssociations = legalEntityCreateBody.legalEntityAssociations
                this.legalStructure = legalEntityCreateBody.legalStructure
                this.metadata = legalEntityCreateBody.metadata
                this.middleName = legalEntityCreateBody.middleName
                this.phoneNumbers = legalEntityCreateBody.phoneNumbers
                this.politicallyExposedPerson = legalEntityCreateBody.politicallyExposedPerson
                this.preferredName = legalEntityCreateBody.preferredName
                this.prefix = legalEntityCreateBody.prefix
                this.riskRating = legalEntityCreateBody.riskRating
                this.suffix = legalEntityCreateBody.suffix
                this.wealthAndEmploymentDetails = legalEntityCreateBody.wealthAndEmploymentDetails
                this.website = legalEntityCreateBody.website
                additionalProperties(legalEntityCreateBody.additionalProperties)
            }

            /** The type of legal entity. */
            @JsonProperty("legal_entity_type")
            fun legalEntityType(legalEntityType: LegalEntityType) = apply {
                this.legalEntityType = legalEntityType
            }

            /** A list of addresses for the entity. */
            @JsonProperty("addresses")
            fun addresses(addresses: List<LegalEntityAddressCreateRequest>) = apply {
                this.addresses = addresses
            }

            @JsonProperty("bank_settings")
            fun bankSettings(bankSettings: BankSettings) = apply {
                this.bankSettings = bankSettings
            }

            /** The business's legal business name. */
            @JsonProperty("business_name")
            fun businessName(businessName: String) = apply { this.businessName = businessName }

            /** The country of citizenship for an individual. */
            @JsonProperty("citizenship_country")
            fun citizenshipCountry(citizenshipCountry: String) = apply {
                this.citizenshipCountry = citizenshipCountry
            }

            /** A business's formation date (YYYY-MM-DD). */
            @JsonProperty("date_formed")
            fun dateFormed(dateFormed: LocalDate) = apply { this.dateFormed = dateFormed }

            /** An individual's date of birth (YYYY-MM-DD). */
            @JsonProperty("date_of_birth")
            fun dateOfBirth(dateOfBirth: LocalDate) = apply { this.dateOfBirth = dateOfBirth }

            @JsonProperty("doing_business_as_names")
            fun doingBusinessAsNames(doingBusinessAsNames: List<String>) = apply {
                this.doingBusinessAsNames = doingBusinessAsNames
            }

            /** The entity's primary email. */
            @JsonProperty("email") fun email(email: String) = apply { this.email = email }

            /** An individual's first name. */
            @JsonProperty("first_name")
            fun firstName(firstName: String) = apply { this.firstName = firstName }

            /** A list of identifications for the legal entity. */
            @JsonProperty("identifications")
            fun identifications(identifications: List<IdentificationCreateRequest>) = apply {
                this.identifications = identifications
            }

            /** An individual's last name. */
            @JsonProperty("last_name")
            fun lastName(lastName: String) = apply { this.lastName = lastName }

            /** The legal entity associations and its child legal entities. */
            @JsonProperty("legal_entity_associations")
            fun legalEntityAssociations(
                legalEntityAssociations: List<LegalEntityAssociationInlineCreateRequest>
            ) = apply { this.legalEntityAssociations = legalEntityAssociations }

            /** The business's legal structure. */
            @JsonProperty("legal_structure")
            fun legalStructure(legalStructure: LegalStructure) = apply {
                this.legalStructure = legalStructure
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An individual's middle name. */
            @JsonProperty("middle_name")
            fun middleName(middleName: String) = apply { this.middleName = middleName }

            @JsonProperty("phone_numbers")
            fun phoneNumbers(phoneNumbers: List<PhoneNumber>) = apply {
                this.phoneNumbers = phoneNumbers
            }

            /** Whether the individual is a politically exposed person. */
            @JsonProperty("politically_exposed_person")
            fun politicallyExposedPerson(politicallyExposedPerson: Boolean) = apply {
                this.politicallyExposedPerson = politicallyExposedPerson
            }

            /** An individual's preferred name. */
            @JsonProperty("preferred_name")
            fun preferredName(preferredName: String) = apply { this.preferredName = preferredName }

            /** An individual's prefix. */
            @JsonProperty("prefix") fun prefix(prefix: String) = apply { this.prefix = prefix }

            /** The risk rating of the legal entity. One of low, medium, high. */
            @JsonProperty("risk_rating")
            fun riskRating(riskRating: RiskRating) = apply { this.riskRating = riskRating }

            /** An individual's suffix. */
            @JsonProperty("suffix") fun suffix(suffix: String) = apply { this.suffix = suffix }

            @JsonProperty("wealth_and_employment_details")
            fun wealthAndEmploymentDetails(wealthAndEmploymentDetails: WealthAndEmploymentDetails) =
                apply {
                    this.wealthAndEmploymentDetails = wealthAndEmploymentDetails
                }

            /** The entity's primary website URL. */
            @JsonProperty("website") fun website(website: String) = apply { this.website = website }

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

            fun build(): LegalEntityCreateBody =
                LegalEntityCreateBody(
                    checkNotNull(legalEntityType) {
                        "`legalEntityType` is required but was not set"
                    },
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LegalEntityCreateBody && legalEntityType == other.legalEntityType && addresses == other.addresses && bankSettings == other.bankSettings && businessName == other.businessName && citizenshipCountry == other.citizenshipCountry && dateFormed == other.dateFormed && dateOfBirth == other.dateOfBirth && doingBusinessAsNames == other.doingBusinessAsNames && email == other.email && firstName == other.firstName && identifications == other.identifications && lastName == other.lastName && legalEntityAssociations == other.legalEntityAssociations && legalStructure == other.legalStructure && metadata == other.metadata && middleName == other.middleName && phoneNumbers == other.phoneNumbers && politicallyExposedPerson == other.politicallyExposedPerson && preferredName == other.preferredName && prefix == other.prefix && riskRating == other.riskRating && suffix == other.suffix && wealthAndEmploymentDetails == other.wealthAndEmploymentDetails && website == other.website && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(legalEntityType, addresses, bankSettings, businessName, citizenshipCountry, dateFormed, dateOfBirth, doingBusinessAsNames, email, firstName, identifications, lastName, legalEntityAssociations, legalStructure, metadata, middleName, phoneNumbers, politicallyExposedPerson, preferredName, prefix, riskRating, suffix, wealthAndEmploymentDetails, website, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LegalEntityCreateBody{legalEntityType=$legalEntityType, addresses=$addresses, bankSettings=$bankSettings, businessName=$businessName, citizenshipCountry=$citizenshipCountry, dateFormed=$dateFormed, dateOfBirth=$dateOfBirth, doingBusinessAsNames=$doingBusinessAsNames, email=$email, firstName=$firstName, identifications=$identifications, lastName=$lastName, legalEntityAssociations=$legalEntityAssociations, legalStructure=$legalStructure, metadata=$metadata, middleName=$middleName, phoneNumbers=$phoneNumbers, politicallyExposedPerson=$politicallyExposedPerson, preferredName=$preferredName, prefix=$prefix, riskRating=$riskRating, suffix=$suffix, wealthAndEmploymentDetails=$wealthAndEmploymentDetails, website=$website, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var legalEntityType: LegalEntityType? = null
        private var addresses: MutableList<LegalEntityAddressCreateRequest> = mutableListOf()
        private var bankSettings: BankSettings? = null
        private var businessName: String? = null
        private var citizenshipCountry: String? = null
        private var dateFormed: LocalDate? = null
        private var dateOfBirth: LocalDate? = null
        private var doingBusinessAsNames: MutableList<String> = mutableListOf()
        private var email: String? = null
        private var firstName: String? = null
        private var identifications: MutableList<IdentificationCreateRequest> = mutableListOf()
        private var lastName: String? = null
        private var legalEntityAssociations:
            MutableList<LegalEntityAssociationInlineCreateRequest> =
            mutableListOf()
        private var legalStructure: LegalStructure? = null
        private var metadata: Metadata? = null
        private var middleName: String? = null
        private var phoneNumbers: MutableList<PhoneNumber> = mutableListOf()
        private var politicallyExposedPerson: Boolean? = null
        private var preferredName: String? = null
        private var prefix: String? = null
        private var riskRating: RiskRating? = null
        private var suffix: String? = null
        private var wealthAndEmploymentDetails: WealthAndEmploymentDetails? = null
        private var website: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(legalEntityCreateParams: LegalEntityCreateParams) = apply {
            legalEntityType = legalEntityCreateParams.legalEntityType
            addresses = legalEntityCreateParams.addresses?.toMutableList() ?: mutableListOf()
            bankSettings = legalEntityCreateParams.bankSettings
            businessName = legalEntityCreateParams.businessName
            citizenshipCountry = legalEntityCreateParams.citizenshipCountry
            dateFormed = legalEntityCreateParams.dateFormed
            dateOfBirth = legalEntityCreateParams.dateOfBirth
            doingBusinessAsNames =
                legalEntityCreateParams.doingBusinessAsNames?.toMutableList() ?: mutableListOf()
            email = legalEntityCreateParams.email
            firstName = legalEntityCreateParams.firstName
            identifications =
                legalEntityCreateParams.identifications?.toMutableList() ?: mutableListOf()
            lastName = legalEntityCreateParams.lastName
            legalEntityAssociations =
                legalEntityCreateParams.legalEntityAssociations?.toMutableList() ?: mutableListOf()
            legalStructure = legalEntityCreateParams.legalStructure
            metadata = legalEntityCreateParams.metadata
            middleName = legalEntityCreateParams.middleName
            phoneNumbers = legalEntityCreateParams.phoneNumbers?.toMutableList() ?: mutableListOf()
            politicallyExposedPerson = legalEntityCreateParams.politicallyExposedPerson
            preferredName = legalEntityCreateParams.preferredName
            prefix = legalEntityCreateParams.prefix
            riskRating = legalEntityCreateParams.riskRating
            suffix = legalEntityCreateParams.suffix
            wealthAndEmploymentDetails = legalEntityCreateParams.wealthAndEmploymentDetails
            website = legalEntityCreateParams.website
            additionalHeaders = legalEntityCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = legalEntityCreateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                legalEntityCreateParams.additionalBodyProperties.toMutableMap()
        }

        /** The type of legal entity. */
        fun legalEntityType(legalEntityType: LegalEntityType) = apply {
            this.legalEntityType = legalEntityType
        }

        /** A list of addresses for the entity. */
        fun addresses(addresses: List<LegalEntityAddressCreateRequest>) = apply {
            this.addresses.clear()
            this.addresses.addAll(addresses)
        }

        /** A list of addresses for the entity. */
        fun addAddress(address: LegalEntityAddressCreateRequest) = apply {
            this.addresses.add(address)
        }

        fun bankSettings(bankSettings: BankSettings) = apply { this.bankSettings = bankSettings }

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
            this.doingBusinessAsNames.clear()
            this.doingBusinessAsNames.addAll(doingBusinessAsNames)
        }

        fun addDoingBusinessAsName(doingBusinessAsName: String) = apply {
            this.doingBusinessAsNames.add(doingBusinessAsName)
        }

        /** The entity's primary email. */
        fun email(email: String) = apply { this.email = email }

        /** An individual's first name. */
        fun firstName(firstName: String) = apply { this.firstName = firstName }

        /** A list of identifications for the legal entity. */
        fun identifications(identifications: List<IdentificationCreateRequest>) = apply {
            this.identifications.clear()
            this.identifications.addAll(identifications)
        }

        /** A list of identifications for the legal entity. */
        fun addIdentification(identification: IdentificationCreateRequest) = apply {
            this.identifications.add(identification)
        }

        /** An individual's last name. */
        fun lastName(lastName: String) = apply { this.lastName = lastName }

        /** The legal entity associations and its child legal entities. */
        fun legalEntityAssociations(
            legalEntityAssociations: List<LegalEntityAssociationInlineCreateRequest>
        ) = apply {
            this.legalEntityAssociations.clear()
            this.legalEntityAssociations.addAll(legalEntityAssociations)
        }

        /** The legal entity associations and its child legal entities. */
        fun addLegalEntityAssociation(
            legalEntityAssociation: LegalEntityAssociationInlineCreateRequest
        ) = apply { this.legalEntityAssociations.add(legalEntityAssociation) }

        /** The business's legal structure. */
        fun legalStructure(legalStructure: LegalStructure) = apply {
            this.legalStructure = legalStructure
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        /** An individual's middle name. */
        fun middleName(middleName: String) = apply { this.middleName = middleName }

        fun phoneNumbers(phoneNumbers: List<PhoneNumber>) = apply {
            this.phoneNumbers.clear()
            this.phoneNumbers.addAll(phoneNumbers)
        }

        fun addPhoneNumber(phoneNumber: PhoneNumber) = apply { this.phoneNumbers.add(phoneNumber) }

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
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): LegalEntityCreateParams =
            LegalEntityCreateParams(
                checkNotNull(legalEntityType) { "`legalEntityType` is required but was not set" },
                addresses.toImmutable().ifEmpty { null },
                bankSettings,
                businessName,
                citizenshipCountry,
                dateFormed,
                dateOfBirth,
                doingBusinessAsNames.toImmutable().ifEmpty { null },
                email,
                firstName,
                identifications.toImmutable().ifEmpty { null },
                lastName,
                legalEntityAssociations.toImmutable().ifEmpty { null },
                legalStructure,
                metadata,
                middleName,
                phoneNumbers.toImmutable().ifEmpty { null },
                politicallyExposedPerson,
                preferredName,
                prefix,
                riskRating,
                suffix,
                wealthAndEmploymentDetails,
                website,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
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
                else -> throw ModernTreasuryInvalidDataException("Unknown LegalEntityType: $value")
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

    @JsonDeserialize(builder = LegalEntityAddressCreateRequest.Builder::class)
    @NoAutoDetect
    class LegalEntityAddressCreateRequest
    private constructor(
        private val addressTypes: List<AddressType>?,
        private val line1: String?,
        private val line2: String?,
        private val locality: String?,
        private val region: String?,
        private val postalCode: String?,
        private val country: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The types of this address. */
        @JsonProperty("address_types") fun addressTypes(): List<AddressType>? = addressTypes

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

            private var addressTypes: List<AddressType>? = null
            private var line1: String? = null
            private var line2: String? = null
            private var locality: String? = null
            private var region: String? = null
            private var postalCode: String? = null
            private var country: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(legalEntityAddressCreateRequest: LegalEntityAddressCreateRequest) =
                apply {
                    this.addressTypes = legalEntityAddressCreateRequest.addressTypes
                    this.line1 = legalEntityAddressCreateRequest.line1
                    this.line2 = legalEntityAddressCreateRequest.line2
                    this.locality = legalEntityAddressCreateRequest.locality
                    this.region = legalEntityAddressCreateRequest.region
                    this.postalCode = legalEntityAddressCreateRequest.postalCode
                    this.country = legalEntityAddressCreateRequest.country
                    additionalProperties(legalEntityAddressCreateRequest.additionalProperties)
                }

            /** The types of this address. */
            @JsonProperty("address_types")
            fun addressTypes(addressTypes: List<AddressType>) = apply {
                this.addressTypes = addressTypes
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

            fun build(): LegalEntityAddressCreateRequest =
                LegalEntityAddressCreateRequest(
                    addressTypes?.toImmutable(),
                    line1,
                    line2,
                    locality,
                    region,
                    postalCode,
                    country,
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
                    else -> throw ModernTreasuryInvalidDataException("Unknown AddressType: $value")
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

            return /* spotless:off */ other is LegalEntityAddressCreateRequest && addressTypes == other.addressTypes && line1 == other.line1 && line2 == other.line2 && locality == other.locality && region == other.region && postalCode == other.postalCode && country == other.country && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(addressTypes, line1, line2, locality, region, postalCode, country, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LegalEntityAddressCreateRequest{addressTypes=$addressTypes, line1=$line1, line2=$line2, locality=$locality, region=$region, postalCode=$postalCode, country=$country, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = IdentificationCreateRequest.Builder::class)
    @NoAutoDetect
    class IdentificationCreateRequest
    private constructor(
        private val idNumber: String?,
        private val idType: IdType?,
        private val issuingCountry: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The ID number of identification document. */
        @JsonProperty("id_number") fun idNumber(): String? = idNumber

        /** The type of ID number. */
        @JsonProperty("id_type") fun idType(): IdType? = idType

        /** The ISO 3166-1 alpha-2 country code of the country that issued the identification */
        @JsonProperty("issuing_country") fun issuingCountry(): String? = issuingCountry

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
            internal fun from(identificationCreateRequest: IdentificationCreateRequest) = apply {
                this.idNumber = identificationCreateRequest.idNumber
                this.idType = identificationCreateRequest.idType
                this.issuingCountry = identificationCreateRequest.issuingCountry
                additionalProperties(identificationCreateRequest.additionalProperties)
            }

            /** The ID number of identification document. */
            @JsonProperty("id_number")
            fun idNumber(idNumber: String) = apply { this.idNumber = idNumber }

            /** The type of ID number. */
            @JsonProperty("id_type") fun idType(idType: IdType) = apply { this.idType = idType }

            /** The ISO 3166-1 alpha-2 country code of the country that issued the identification */
            @JsonProperty("issuing_country")
            fun issuingCountry(issuingCountry: String) = apply {
                this.issuingCountry = issuingCountry
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

    @JsonDeserialize(builder = LegalEntityAssociationInlineCreateRequest.Builder::class)
    @NoAutoDetect
    class LegalEntityAssociationInlineCreateRequest
    private constructor(
        private val relationshipTypes: List<RelationshipType>?,
        private val title: String?,
        private val ownershipPercentage: Long?,
        private val childLegalEntity: ChildLegalEntityCreate?,
        private val childLegalEntityId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("relationship_types")
        fun relationshipTypes(): List<RelationshipType>? = relationshipTypes

        /** The job title of the child entity at the parent entity. */
        @JsonProperty("title") fun title(): String? = title

        /** The child entity's ownership percentage iff they are a beneficial owner. */
        @JsonProperty("ownership_percentage") fun ownershipPercentage(): Long? = ownershipPercentage

        /** The child legal entity. */
        @JsonProperty("child_legal_entity")
        fun childLegalEntity(): ChildLegalEntityCreate? = childLegalEntity

        /** The ID of the child legal entity. */
        @JsonProperty("child_legal_entity_id")
        fun childLegalEntityId(): String? = childLegalEntityId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var relationshipTypes: List<RelationshipType>? = null
            private var title: String? = null
            private var ownershipPercentage: Long? = null
            private var childLegalEntity: ChildLegalEntityCreate? = null
            private var childLegalEntityId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                legalEntityAssociationInlineCreateRequest: LegalEntityAssociationInlineCreateRequest
            ) = apply {
                this.relationshipTypes = legalEntityAssociationInlineCreateRequest.relationshipTypes
                this.title = legalEntityAssociationInlineCreateRequest.title
                this.ownershipPercentage =
                    legalEntityAssociationInlineCreateRequest.ownershipPercentage
                this.childLegalEntity = legalEntityAssociationInlineCreateRequest.childLegalEntity
                this.childLegalEntityId =
                    legalEntityAssociationInlineCreateRequest.childLegalEntityId
                additionalProperties(legalEntityAssociationInlineCreateRequest.additionalProperties)
            }

            @JsonProperty("relationship_types")
            fun relationshipTypes(relationshipTypes: List<RelationshipType>) = apply {
                this.relationshipTypes = relationshipTypes
            }

            /** The job title of the child entity at the parent entity. */
            @JsonProperty("title") fun title(title: String) = apply { this.title = title }

            /** The child entity's ownership percentage iff they are a beneficial owner. */
            @JsonProperty("ownership_percentage")
            fun ownershipPercentage(ownershipPercentage: Long) = apply {
                this.ownershipPercentage = ownershipPercentage
            }

            /** The child legal entity. */
            @JsonProperty("child_legal_entity")
            fun childLegalEntity(childLegalEntity: ChildLegalEntityCreate) = apply {
                this.childLegalEntity = childLegalEntity
            }

            /** The ID of the child legal entity. */
            @JsonProperty("child_legal_entity_id")
            fun childLegalEntityId(childLegalEntityId: String) = apply {
                this.childLegalEntityId = childLegalEntityId
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

            fun build(): LegalEntityAssociationInlineCreateRequest =
                LegalEntityAssociationInlineCreateRequest(
                    checkNotNull(relationshipTypes) {
                            "`relationshipTypes` is required but was not set"
                        }
                        .toImmutable(),
                    title,
                    ownershipPercentage,
                    childLegalEntity,
                    childLegalEntityId,
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
                        throw ModernTreasuryInvalidDataException("Unknown RelationshipType: $value")
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
        @JsonDeserialize(builder = ChildLegalEntityCreate.Builder::class)
        @NoAutoDetect
        class ChildLegalEntityCreate
        private constructor(
            private val legalEntityType: LegalEntityType?,
            private val riskRating: RiskRating?,
            private val prefix: String?,
            private val firstName: String?,
            private val middleName: String?,
            private val lastName: String?,
            private val suffix: String?,
            private val preferredName: String?,
            private val citizenshipCountry: String?,
            private val politicallyExposedPerson: Boolean?,
            private val dateOfBirth: LocalDate?,
            private val dateFormed: LocalDate?,
            private val businessName: String?,
            private val doingBusinessAsNames: List<String>?,
            private val legalStructure: LegalStructure?,
            private val phoneNumbers: List<PhoneNumber>?,
            private val email: String?,
            private val website: String?,
            private val metadata: Metadata?,
            private val bankSettings: BankSettings?,
            private val wealthAndEmploymentDetails: WealthAndEmploymentDetails?,
            private val addresses: List<LegalEntityAddressCreateRequest>?,
            private val identifications: List<IdentificationCreateRequest>?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The type of legal entity. */
            @JsonProperty("legal_entity_type")
            fun legalEntityType(): LegalEntityType? = legalEntityType

            /** The risk rating of the legal entity. One of low, medium, high. */
            @JsonProperty("risk_rating") fun riskRating(): RiskRating? = riskRating

            /** An individual's prefix. */
            @JsonProperty("prefix") fun prefix(): String? = prefix

            /** An individual's first name. */
            @JsonProperty("first_name") fun firstName(): String? = firstName

            /** An individual's middle name. */
            @JsonProperty("middle_name") fun middleName(): String? = middleName

            /** An individual's last name. */
            @JsonProperty("last_name") fun lastName(): String? = lastName

            /** An individual's suffix. */
            @JsonProperty("suffix") fun suffix(): String? = suffix

            /** An individual's preferred name. */
            @JsonProperty("preferred_name") fun preferredName(): String? = preferredName

            /** The country of citizenship for an individual. */
            @JsonProperty("citizenship_country")
            fun citizenshipCountry(): String? = citizenshipCountry

            /** Whether the individual is a politically exposed person. */
            @JsonProperty("politically_exposed_person")
            fun politicallyExposedPerson(): Boolean? = politicallyExposedPerson

            /** An individual's date of birth (YYYY-MM-DD). */
            @JsonProperty("date_of_birth") fun dateOfBirth(): LocalDate? = dateOfBirth

            /** A business's formation date (YYYY-MM-DD). */
            @JsonProperty("date_formed") fun dateFormed(): LocalDate? = dateFormed

            /** The business's legal business name. */
            @JsonProperty("business_name") fun businessName(): String? = businessName

            @JsonProperty("doing_business_as_names")
            fun doingBusinessAsNames(): List<String>? = doingBusinessAsNames

            /** The business's legal structure. */
            @JsonProperty("legal_structure") fun legalStructure(): LegalStructure? = legalStructure

            @JsonProperty("phone_numbers") fun phoneNumbers(): List<PhoneNumber>? = phoneNumbers

            /** The entity's primary email. */
            @JsonProperty("email") fun email(): String? = email

            /** The entity's primary website URL. */
            @JsonProperty("website") fun website(): String? = website

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata") fun metadata(): Metadata? = metadata

            @JsonProperty("bank_settings") fun bankSettings(): BankSettings? = bankSettings

            @JsonProperty("wealth_and_employment_details")
            fun wealthAndEmploymentDetails(): WealthAndEmploymentDetails? =
                wealthAndEmploymentDetails

            /** A list of addresses for the entity. */
            @JsonProperty("addresses")
            fun addresses(): List<LegalEntityAddressCreateRequest>? = addresses

            /** A list of identifications for the legal entity. */
            @JsonProperty("identifications")
            fun identifications(): List<IdentificationCreateRequest>? = identifications

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var legalEntityType: LegalEntityType? = null
                private var riskRating: RiskRating? = null
                private var prefix: String? = null
                private var firstName: String? = null
                private var middleName: String? = null
                private var lastName: String? = null
                private var suffix: String? = null
                private var preferredName: String? = null
                private var citizenshipCountry: String? = null
                private var politicallyExposedPerson: Boolean? = null
                private var dateOfBirth: LocalDate? = null
                private var dateFormed: LocalDate? = null
                private var businessName: String? = null
                private var doingBusinessAsNames: List<String>? = null
                private var legalStructure: LegalStructure? = null
                private var phoneNumbers: List<PhoneNumber>? = null
                private var email: String? = null
                private var website: String? = null
                private var metadata: Metadata? = null
                private var bankSettings: BankSettings? = null
                private var wealthAndEmploymentDetails: WealthAndEmploymentDetails? = null
                private var addresses: List<LegalEntityAddressCreateRequest>? = null
                private var identifications: List<IdentificationCreateRequest>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(childLegalEntityCreate: ChildLegalEntityCreate) = apply {
                    this.legalEntityType = childLegalEntityCreate.legalEntityType
                    this.riskRating = childLegalEntityCreate.riskRating
                    this.prefix = childLegalEntityCreate.prefix
                    this.firstName = childLegalEntityCreate.firstName
                    this.middleName = childLegalEntityCreate.middleName
                    this.lastName = childLegalEntityCreate.lastName
                    this.suffix = childLegalEntityCreate.suffix
                    this.preferredName = childLegalEntityCreate.preferredName
                    this.citizenshipCountry = childLegalEntityCreate.citizenshipCountry
                    this.politicallyExposedPerson = childLegalEntityCreate.politicallyExposedPerson
                    this.dateOfBirth = childLegalEntityCreate.dateOfBirth
                    this.dateFormed = childLegalEntityCreate.dateFormed
                    this.businessName = childLegalEntityCreate.businessName
                    this.doingBusinessAsNames = childLegalEntityCreate.doingBusinessAsNames
                    this.legalStructure = childLegalEntityCreate.legalStructure
                    this.phoneNumbers = childLegalEntityCreate.phoneNumbers
                    this.email = childLegalEntityCreate.email
                    this.website = childLegalEntityCreate.website
                    this.metadata = childLegalEntityCreate.metadata
                    this.bankSettings = childLegalEntityCreate.bankSettings
                    this.wealthAndEmploymentDetails =
                        childLegalEntityCreate.wealthAndEmploymentDetails
                    this.addresses = childLegalEntityCreate.addresses
                    this.identifications = childLegalEntityCreate.identifications
                    additionalProperties(childLegalEntityCreate.additionalProperties)
                }

                /** The type of legal entity. */
                @JsonProperty("legal_entity_type")
                fun legalEntityType(legalEntityType: LegalEntityType) = apply {
                    this.legalEntityType = legalEntityType
                }

                /** The risk rating of the legal entity. One of low, medium, high. */
                @JsonProperty("risk_rating")
                fun riskRating(riskRating: RiskRating) = apply { this.riskRating = riskRating }

                /** An individual's prefix. */
                @JsonProperty("prefix") fun prefix(prefix: String) = apply { this.prefix = prefix }

                /** An individual's first name. */
                @JsonProperty("first_name")
                fun firstName(firstName: String) = apply { this.firstName = firstName }

                /** An individual's middle name. */
                @JsonProperty("middle_name")
                fun middleName(middleName: String) = apply { this.middleName = middleName }

                /** An individual's last name. */
                @JsonProperty("last_name")
                fun lastName(lastName: String) = apply { this.lastName = lastName }

                /** An individual's suffix. */
                @JsonProperty("suffix") fun suffix(suffix: String) = apply { this.suffix = suffix }

                /** An individual's preferred name. */
                @JsonProperty("preferred_name")
                fun preferredName(preferredName: String) = apply {
                    this.preferredName = preferredName
                }

                /** The country of citizenship for an individual. */
                @JsonProperty("citizenship_country")
                fun citizenshipCountry(citizenshipCountry: String) = apply {
                    this.citizenshipCountry = citizenshipCountry
                }

                /** Whether the individual is a politically exposed person. */
                @JsonProperty("politically_exposed_person")
                fun politicallyExposedPerson(politicallyExposedPerson: Boolean) = apply {
                    this.politicallyExposedPerson = politicallyExposedPerson
                }

                /** An individual's date of birth (YYYY-MM-DD). */
                @JsonProperty("date_of_birth")
                fun dateOfBirth(dateOfBirth: LocalDate) = apply { this.dateOfBirth = dateOfBirth }

                /** A business's formation date (YYYY-MM-DD). */
                @JsonProperty("date_formed")
                fun dateFormed(dateFormed: LocalDate) = apply { this.dateFormed = dateFormed }

                /** The business's legal business name. */
                @JsonProperty("business_name")
                fun businessName(businessName: String) = apply { this.businessName = businessName }

                @JsonProperty("doing_business_as_names")
                fun doingBusinessAsNames(doingBusinessAsNames: List<String>) = apply {
                    this.doingBusinessAsNames = doingBusinessAsNames
                }

                /** The business's legal structure. */
                @JsonProperty("legal_structure")
                fun legalStructure(legalStructure: LegalStructure) = apply {
                    this.legalStructure = legalStructure
                }

                @JsonProperty("phone_numbers")
                fun phoneNumbers(phoneNumbers: List<PhoneNumber>) = apply {
                    this.phoneNumbers = phoneNumbers
                }

                /** The entity's primary email. */
                @JsonProperty("email") fun email(email: String) = apply { this.email = email }

                /** The entity's primary website URL. */
                @JsonProperty("website")
                fun website(website: String) = apply { this.website = website }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata")
                fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

                @JsonProperty("bank_settings")
                fun bankSettings(bankSettings: BankSettings) = apply {
                    this.bankSettings = bankSettings
                }

                @JsonProperty("wealth_and_employment_details")
                fun wealthAndEmploymentDetails(
                    wealthAndEmploymentDetails: WealthAndEmploymentDetails
                ) = apply { this.wealthAndEmploymentDetails = wealthAndEmploymentDetails }

                /** A list of addresses for the entity. */
                @JsonProperty("addresses")
                fun addresses(addresses: List<LegalEntityAddressCreateRequest>) = apply {
                    this.addresses = addresses
                }

                /** A list of identifications for the legal entity. */
                @JsonProperty("identifications")
                fun identifications(identifications: List<IdentificationCreateRequest>) = apply {
                    this.identifications = identifications
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): ChildLegalEntityCreate =
                    ChildLegalEntityCreate(
                        legalEntityType,
                        riskRating,
                        prefix,
                        firstName,
                        middleName,
                        lastName,
                        suffix,
                        preferredName,
                        citizenshipCountry,
                        politicallyExposedPerson,
                        dateOfBirth,
                        dateFormed,
                        businessName,
                        doingBusinessAsNames?.toImmutable(),
                        legalStructure,
                        phoneNumbers?.toImmutable(),
                        email,
                        website,
                        metadata,
                        bankSettings,
                        wealthAndEmploymentDetails,
                        addresses?.toImmutable(),
                        identifications?.toImmutable(),
                        additionalProperties.toImmutable(),
                    )
            }

            @JsonDeserialize(builder = LegalEntityAddressCreateRequest.Builder::class)
            @NoAutoDetect
            class LegalEntityAddressCreateRequest
            private constructor(
                private val addressTypes: List<AddressType>?,
                private val line1: String?,
                private val line2: String?,
                private val locality: String?,
                private val region: String?,
                private val postalCode: String?,
                private val country: String?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /** The types of this address. */
                @JsonProperty("address_types") fun addressTypes(): List<AddressType>? = addressTypes

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

                    private var addressTypes: List<AddressType>? = null
                    private var line1: String? = null
                    private var line2: String? = null
                    private var locality: String? = null
                    private var region: String? = null
                    private var postalCode: String? = null
                    private var country: String? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        legalEntityAddressCreateRequest: LegalEntityAddressCreateRequest
                    ) = apply {
                        this.addressTypes = legalEntityAddressCreateRequest.addressTypes
                        this.line1 = legalEntityAddressCreateRequest.line1
                        this.line2 = legalEntityAddressCreateRequest.line2
                        this.locality = legalEntityAddressCreateRequest.locality
                        this.region = legalEntityAddressCreateRequest.region
                        this.postalCode = legalEntityAddressCreateRequest.postalCode
                        this.country = legalEntityAddressCreateRequest.country
                        additionalProperties(legalEntityAddressCreateRequest.additionalProperties)
                    }

                    /** The types of this address. */
                    @JsonProperty("address_types")
                    fun addressTypes(addressTypes: List<AddressType>) = apply {
                        this.addressTypes = addressTypes
                    }

                    @JsonProperty("line1") fun line1(line1: String) = apply { this.line1 = line1 }

                    @JsonProperty("line2") fun line2(line2: String) = apply { this.line2 = line2 }

                    /** Locality or City. */
                    @JsonProperty("locality")
                    fun locality(locality: String) = apply { this.locality = locality }

                    /** Region or State. */
                    @JsonProperty("region")
                    fun region(region: String) = apply { this.region = region }

                    /** The postal code of the address. */
                    @JsonProperty("postal_code")
                    fun postalCode(postalCode: String) = apply { this.postalCode = postalCode }

                    /** Country code conforms to [ISO 3166-1 alpha-2] */
                    @JsonProperty("country")
                    fun country(country: String) = apply { this.country = country }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): LegalEntityAddressCreateRequest =
                        LegalEntityAddressCreateRequest(
                            addressTypes?.toImmutable(),
                            line1,
                            line2,
                            locality,
                            region,
                            postalCode,
                            country,
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

                    return /* spotless:off */ other is LegalEntityAddressCreateRequest && addressTypes == other.addressTypes && line1 == other.line1 && line2 == other.line2 && locality == other.locality && region == other.region && postalCode == other.postalCode && country == other.country && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(addressTypes, line1, line2, locality, region, postalCode, country, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "LegalEntityAddressCreateRequest{addressTypes=$addressTypes, line1=$line1, line2=$line2, locality=$locality, region=$region, postalCode=$postalCode, country=$country, additionalProperties=$additionalProperties}"
            }

            @JsonDeserialize(builder = IdentificationCreateRequest.Builder::class)
            @NoAutoDetect
            class IdentificationCreateRequest
            private constructor(
                private val idNumber: String?,
                private val idType: IdType?,
                private val issuingCountry: String?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /** The ID number of identification document. */
                @JsonProperty("id_number") fun idNumber(): String? = idNumber

                /** The type of ID number. */
                @JsonProperty("id_type") fun idType(): IdType? = idType

                /**
                 * The ISO 3166-1 alpha-2 country code of the country that issued the identification
                 */
                @JsonProperty("issuing_country") fun issuingCountry(): String? = issuingCountry

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
                            this.idNumber = identificationCreateRequest.idNumber
                            this.idType = identificationCreateRequest.idType
                            this.issuingCountry = identificationCreateRequest.issuingCountry
                            additionalProperties(identificationCreateRequest.additionalProperties)
                        }

                    /** The ID number of identification document. */
                    @JsonProperty("id_number")
                    fun idNumber(idNumber: String) = apply { this.idNumber = idNumber }

                    /** The type of ID number. */
                    @JsonProperty("id_type")
                    fun idType(idType: IdType) = apply { this.idType = idType }

                    /**
                     * The ISO 3166-1 alpha-2 country code of the country that issued the
                     * identification
                     */
                    @JsonProperty("issuing_country")
                    fun issuingCountry(issuingCountry: String) = apply {
                        this.issuingCountry = issuingCountry
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
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
                                throw ModernTreasuryInvalidDataException("Unknown IdType: $value")
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
            @JsonDeserialize(builder = Metadata.Builder::class)
            @NoAutoDetect
            class Metadata
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
                    internal fun from(metadata: Metadata) = apply {
                        additionalProperties(metadata.additionalProperties)
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
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
            @JsonDeserialize(builder = PhoneNumber.Builder::class)
            @NoAutoDetect
            class PhoneNumber
            private constructor(
                private val phoneNumber: String?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                @JsonProperty("phone_number") fun phoneNumber(): String? = phoneNumber

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
                        additionalProperties(phoneNumber.additionalProperties)
                    }

                    @JsonProperty("phone_number")
                    fun phoneNumber(phoneNumber: String) = apply { this.phoneNumber = phoneNumber }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
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
                        else ->
                            throw ModernTreasuryInvalidDataException("Unknown RiskRating: $value")
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

                return /* spotless:off */ other is ChildLegalEntityCreate && legalEntityType == other.legalEntityType && riskRating == other.riskRating && prefix == other.prefix && firstName == other.firstName && middleName == other.middleName && lastName == other.lastName && suffix == other.suffix && preferredName == other.preferredName && citizenshipCountry == other.citizenshipCountry && politicallyExposedPerson == other.politicallyExposedPerson && dateOfBirth == other.dateOfBirth && dateFormed == other.dateFormed && businessName == other.businessName && doingBusinessAsNames == other.doingBusinessAsNames && legalStructure == other.legalStructure && phoneNumbers == other.phoneNumbers && email == other.email && website == other.website && metadata == other.metadata && bankSettings == other.bankSettings && wealthAndEmploymentDetails == other.wealthAndEmploymentDetails && addresses == other.addresses && identifications == other.identifications && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(legalEntityType, riskRating, prefix, firstName, middleName, lastName, suffix, preferredName, citizenshipCountry, politicallyExposedPerson, dateOfBirth, dateFormed, businessName, doingBusinessAsNames, legalStructure, phoneNumbers, email, website, metadata, bankSettings, wealthAndEmploymentDetails, addresses, identifications, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ChildLegalEntityCreate{legalEntityType=$legalEntityType, riskRating=$riskRating, prefix=$prefix, firstName=$firstName, middleName=$middleName, lastName=$lastName, suffix=$suffix, preferredName=$preferredName, citizenshipCountry=$citizenshipCountry, politicallyExposedPerson=$politicallyExposedPerson, dateOfBirth=$dateOfBirth, dateFormed=$dateFormed, businessName=$businessName, doingBusinessAsNames=$doingBusinessAsNames, legalStructure=$legalStructure, phoneNumbers=$phoneNumbers, email=$email, website=$website, metadata=$metadata, bankSettings=$bankSettings, wealthAndEmploymentDetails=$wealthAndEmploymentDetails, addresses=$addresses, identifications=$identifications, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LegalEntityAssociationInlineCreateRequest && relationshipTypes == other.relationshipTypes && title == other.title && ownershipPercentage == other.ownershipPercentage && childLegalEntity == other.childLegalEntity && childLegalEntityId == other.childLegalEntityId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(relationshipTypes, title, ownershipPercentage, childLegalEntity, childLegalEntityId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LegalEntityAssociationInlineCreateRequest{relationshipTypes=$relationshipTypes, title=$title, ownershipPercentage=$ownershipPercentage, childLegalEntity=$childLegalEntity, childLegalEntityId=$childLegalEntityId, additionalProperties=$additionalProperties}"
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
                else -> throw ModernTreasuryInvalidDataException("Unknown LegalStructure: $value")
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

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
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
            internal fun from(metadata: Metadata) = apply {
                additionalProperties(metadata.additionalProperties)
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
    @JsonDeserialize(builder = PhoneNumber.Builder::class)
    @NoAutoDetect
    class PhoneNumber
    private constructor(
        private val phoneNumber: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("phone_number") fun phoneNumber(): String? = phoneNumber

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
                additionalProperties(phoneNumber.additionalProperties)
            }

            @JsonProperty("phone_number")
            fun phoneNumber(phoneNumber: String) = apply { this.phoneNumber = phoneNumber }

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

            fun build(): PhoneNumber = PhoneNumber(phoneNumber, additionalProperties.toImmutable())
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

        return /* spotless:off */ other is LegalEntityCreateParams && legalEntityType == other.legalEntityType && addresses == other.addresses && bankSettings == other.bankSettings && businessName == other.businessName && citizenshipCountry == other.citizenshipCountry && dateFormed == other.dateFormed && dateOfBirth == other.dateOfBirth && doingBusinessAsNames == other.doingBusinessAsNames && email == other.email && firstName == other.firstName && identifications == other.identifications && lastName == other.lastName && legalEntityAssociations == other.legalEntityAssociations && legalStructure == other.legalStructure && metadata == other.metadata && middleName == other.middleName && phoneNumbers == other.phoneNumbers && politicallyExposedPerson == other.politicallyExposedPerson && preferredName == other.preferredName && prefix == other.prefix && riskRating == other.riskRating && suffix == other.suffix && wealthAndEmploymentDetails == other.wealthAndEmploymentDetails && website == other.website && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(legalEntityType, addresses, bankSettings, businessName, citizenshipCountry, dateFormed, dateOfBirth, doingBusinessAsNames, email, firstName, identifications, lastName, legalEntityAssociations, legalStructure, metadata, middleName, phoneNumbers, politicallyExposedPerson, preferredName, prefix, riskRating, suffix, wealthAndEmploymentDetails, website, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "LegalEntityCreateParams{legalEntityType=$legalEntityType, addresses=$addresses, bankSettings=$bankSettings, businessName=$businessName, citizenshipCountry=$citizenshipCountry, dateFormed=$dateFormed, dateOfBirth=$dateOfBirth, doingBusinessAsNames=$doingBusinessAsNames, email=$email, firstName=$firstName, identifications=$identifications, lastName=$lastName, legalEntityAssociations=$legalEntityAssociations, legalStructure=$legalStructure, metadata=$metadata, middleName=$middleName, phoneNumbers=$phoneNumbers, politicallyExposedPerson=$politicallyExposedPerson, preferredName=$preferredName, prefix=$prefix, riskRating=$riskRating, suffix=$suffix, wealthAndEmploymentDetails=$wealthAndEmploymentDetails, website=$website, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
