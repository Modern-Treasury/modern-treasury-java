// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.Params
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.util.Objects
import java.util.Optional

/** Update a legal entity. */
class LegalEntityUpdateParams
private constructor(
    private val id: String,
    private val body: LegalEntityUpdateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String = id

    /** A list of addresses for the entity. */
    fun addresses(): Optional<List<LegalEntityAddressCreateRequest>> = body.addresses()

    fun bankSettings(): Optional<BankSettings> = body.bankSettings()

    /** The business's legal business name. */
    fun businessName(): Optional<String> = body.businessName()

    /** The country of citizenship for an individual. */
    fun citizenshipCountry(): Optional<String> = body.citizenshipCountry()

    /** A business's formation date (YYYY-MM-DD). */
    fun dateFormed(): Optional<LocalDate> = body.dateFormed()

    /** An individual's date of birth (YYYY-MM-DD). */
    fun dateOfBirth(): Optional<LocalDate> = body.dateOfBirth()

    fun doingBusinessAsNames(): Optional<List<String>> = body.doingBusinessAsNames()

    /** The entity's primary email. */
    fun email(): Optional<String> = body.email()

    /** An individual's first name. */
    fun firstName(): Optional<String> = body.firstName()

    /** A list of identifications for the legal entity. */
    fun identifications(): Optional<List<IdentificationCreateRequest>> = body.identifications()

    /** An individual's last name. */
    fun lastName(): Optional<String> = body.lastName()

    /** The business's legal structure. */
    fun legalStructure(): Optional<LegalStructure> = body.legalStructure()

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Optional<Metadata> = body.metadata()

    /** An individual's middle name. */
    fun middleName(): Optional<String> = body.middleName()

    fun phoneNumbers(): Optional<List<PhoneNumber>> = body.phoneNumbers()

    /** Whether the individual is a politically exposed person. */
    fun politicallyExposedPerson(): Optional<Boolean> = body.politicallyExposedPerson()

    /** An individual's preferred name. */
    fun preferredName(): Optional<String> = body.preferredName()

    /** An individual's prefix. */
    fun prefix(): Optional<String> = body.prefix()

    /** The risk rating of the legal entity. One of low, medium, high. */
    fun riskRating(): Optional<RiskRating> = body.riskRating()

    /** An individual's suffix. */
    fun suffix(): Optional<String> = body.suffix()

    fun wealthAndEmploymentDetails(): Optional<WealthAndEmploymentDetails> =
        body.wealthAndEmploymentDetails()

    /** The entity's primary website URL. */
    fun website(): Optional<String> = body.website()

    /** A list of addresses for the entity. */
    fun _addresses(): JsonField<List<LegalEntityAddressCreateRequest>> = body._addresses()

    fun _bankSettings(): JsonField<BankSettings> = body._bankSettings()

    /** The business's legal business name. */
    fun _businessName(): JsonField<String> = body._businessName()

    /** The country of citizenship for an individual. */
    fun _citizenshipCountry(): JsonField<String> = body._citizenshipCountry()

    /** A business's formation date (YYYY-MM-DD). */
    fun _dateFormed(): JsonField<LocalDate> = body._dateFormed()

    /** An individual's date of birth (YYYY-MM-DD). */
    fun _dateOfBirth(): JsonField<LocalDate> = body._dateOfBirth()

    fun _doingBusinessAsNames(): JsonField<List<String>> = body._doingBusinessAsNames()

    /** The entity's primary email. */
    fun _email(): JsonField<String> = body._email()

    /** An individual's first name. */
    fun _firstName(): JsonField<String> = body._firstName()

    /** A list of identifications for the legal entity. */
    fun _identifications(): JsonField<List<IdentificationCreateRequest>> = body._identifications()

    /** An individual's last name. */
    fun _lastName(): JsonField<String> = body._lastName()

    /** The business's legal structure. */
    fun _legalStructure(): JsonField<LegalStructure> = body._legalStructure()

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /** An individual's middle name. */
    fun _middleName(): JsonField<String> = body._middleName()

    fun _phoneNumbers(): JsonField<List<PhoneNumber>> = body._phoneNumbers()

    /** Whether the individual is a politically exposed person. */
    fun _politicallyExposedPerson(): JsonField<Boolean> = body._politicallyExposedPerson()

    /** An individual's preferred name. */
    fun _preferredName(): JsonField<String> = body._preferredName()

    /** An individual's prefix. */
    fun _prefix(): JsonField<String> = body._prefix()

    /** The risk rating of the legal entity. One of low, medium, high. */
    fun _riskRating(): JsonField<RiskRating> = body._riskRating()

    /** An individual's suffix. */
    fun _suffix(): JsonField<String> = body._suffix()

    fun _wealthAndEmploymentDetails(): JsonField<WealthAndEmploymentDetails> =
        body._wealthAndEmploymentDetails()

    /** The entity's primary website URL. */
    fun _website(): JsonField<String> = body._website()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): LegalEntityUpdateRequest = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> id
            else -> ""
        }
    }

    @NoAutoDetect
    class LegalEntityUpdateRequest
    @JsonCreator
    private constructor(
        @JsonProperty("addresses")
        @ExcludeMissing
        private val addresses: JsonField<List<LegalEntityAddressCreateRequest>> = JsonMissing.of(),
        @JsonProperty("bank_settings")
        @ExcludeMissing
        private val bankSettings: JsonField<BankSettings> = JsonMissing.of(),
        @JsonProperty("business_name")
        @ExcludeMissing
        private val businessName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("citizenship_country")
        @ExcludeMissing
        private val citizenshipCountry: JsonField<String> = JsonMissing.of(),
        @JsonProperty("date_formed")
        @ExcludeMissing
        private val dateFormed: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("date_of_birth")
        @ExcludeMissing
        private val dateOfBirth: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("doing_business_as_names")
        @ExcludeMissing
        private val doingBusinessAsNames: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("email")
        @ExcludeMissing
        private val email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("first_name")
        @ExcludeMissing
        private val firstName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("identifications")
        @ExcludeMissing
        private val identifications: JsonField<List<IdentificationCreateRequest>> =
            JsonMissing.of(),
        @JsonProperty("last_name")
        @ExcludeMissing
        private val lastName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("legal_structure")
        @ExcludeMissing
        private val legalStructure: JsonField<LegalStructure> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("middle_name")
        @ExcludeMissing
        private val middleName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone_numbers")
        @ExcludeMissing
        private val phoneNumbers: JsonField<List<PhoneNumber>> = JsonMissing.of(),
        @JsonProperty("politically_exposed_person")
        @ExcludeMissing
        private val politicallyExposedPerson: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("preferred_name")
        @ExcludeMissing
        private val preferredName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prefix")
        @ExcludeMissing
        private val prefix: JsonField<String> = JsonMissing.of(),
        @JsonProperty("risk_rating")
        @ExcludeMissing
        private val riskRating: JsonField<RiskRating> = JsonMissing.of(),
        @JsonProperty("suffix")
        @ExcludeMissing
        private val suffix: JsonField<String> = JsonMissing.of(),
        @JsonProperty("wealth_and_employment_details")
        @ExcludeMissing
        private val wealthAndEmploymentDetails: JsonField<WealthAndEmploymentDetails> =
            JsonMissing.of(),
        @JsonProperty("website")
        @ExcludeMissing
        private val website: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** A list of addresses for the entity. */
        fun addresses(): Optional<List<LegalEntityAddressCreateRequest>> =
            Optional.ofNullable(addresses.getNullable("addresses"))

        fun bankSettings(): Optional<BankSettings> =
            Optional.ofNullable(bankSettings.getNullable("bank_settings"))

        /** The business's legal business name. */
        fun businessName(): Optional<String> =
            Optional.ofNullable(businessName.getNullable("business_name"))

        /** The country of citizenship for an individual. */
        fun citizenshipCountry(): Optional<String> =
            Optional.ofNullable(citizenshipCountry.getNullable("citizenship_country"))

        /** A business's formation date (YYYY-MM-DD). */
        fun dateFormed(): Optional<LocalDate> =
            Optional.ofNullable(dateFormed.getNullable("date_formed"))

        /** An individual's date of birth (YYYY-MM-DD). */
        fun dateOfBirth(): Optional<LocalDate> =
            Optional.ofNullable(dateOfBirth.getNullable("date_of_birth"))

        fun doingBusinessAsNames(): Optional<List<String>> =
            Optional.ofNullable(doingBusinessAsNames.getNullable("doing_business_as_names"))

        /** The entity's primary email. */
        fun email(): Optional<String> = Optional.ofNullable(email.getNullable("email"))

        /** An individual's first name. */
        fun firstName(): Optional<String> = Optional.ofNullable(firstName.getNullable("first_name"))

        /** A list of identifications for the legal entity. */
        fun identifications(): Optional<List<IdentificationCreateRequest>> =
            Optional.ofNullable(identifications.getNullable("identifications"))

        /** An individual's last name. */
        fun lastName(): Optional<String> = Optional.ofNullable(lastName.getNullable("last_name"))

        /** The business's legal structure. */
        fun legalStructure(): Optional<LegalStructure> =
            Optional.ofNullable(legalStructure.getNullable("legal_structure"))

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata.getNullable("metadata"))

        /** An individual's middle name. */
        fun middleName(): Optional<String> =
            Optional.ofNullable(middleName.getNullable("middle_name"))

        fun phoneNumbers(): Optional<List<PhoneNumber>> =
            Optional.ofNullable(phoneNumbers.getNullable("phone_numbers"))

        /** Whether the individual is a politically exposed person. */
        fun politicallyExposedPerson(): Optional<Boolean> =
            Optional.ofNullable(politicallyExposedPerson.getNullable("politically_exposed_person"))

        /** An individual's preferred name. */
        fun preferredName(): Optional<String> =
            Optional.ofNullable(preferredName.getNullable("preferred_name"))

        /** An individual's prefix. */
        fun prefix(): Optional<String> = Optional.ofNullable(prefix.getNullable("prefix"))

        /** The risk rating of the legal entity. One of low, medium, high. */
        fun riskRating(): Optional<RiskRating> =
            Optional.ofNullable(riskRating.getNullable("risk_rating"))

        /** An individual's suffix. */
        fun suffix(): Optional<String> = Optional.ofNullable(suffix.getNullable("suffix"))

        fun wealthAndEmploymentDetails(): Optional<WealthAndEmploymentDetails> =
            Optional.ofNullable(
                wealthAndEmploymentDetails.getNullable("wealth_and_employment_details")
            )

        /** The entity's primary website URL. */
        fun website(): Optional<String> = Optional.ofNullable(website.getNullable("website"))

        /** A list of addresses for the entity. */
        @JsonProperty("addresses")
        @ExcludeMissing
        fun _addresses(): JsonField<List<LegalEntityAddressCreateRequest>> = addresses

        @JsonProperty("bank_settings")
        @ExcludeMissing
        fun _bankSettings(): JsonField<BankSettings> = bankSettings

        /** The business's legal business name. */
        @JsonProperty("business_name")
        @ExcludeMissing
        fun _businessName(): JsonField<String> = businessName

        /** The country of citizenship for an individual. */
        @JsonProperty("citizenship_country")
        @ExcludeMissing
        fun _citizenshipCountry(): JsonField<String> = citizenshipCountry

        /** A business's formation date (YYYY-MM-DD). */
        @JsonProperty("date_formed")
        @ExcludeMissing
        fun _dateFormed(): JsonField<LocalDate> = dateFormed

        /** An individual's date of birth (YYYY-MM-DD). */
        @JsonProperty("date_of_birth")
        @ExcludeMissing
        fun _dateOfBirth(): JsonField<LocalDate> = dateOfBirth

        @JsonProperty("doing_business_as_names")
        @ExcludeMissing
        fun _doingBusinessAsNames(): JsonField<List<String>> = doingBusinessAsNames

        /** The entity's primary email. */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /** An individual's first name. */
        @JsonProperty("first_name") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

        /** A list of identifications for the legal entity. */
        @JsonProperty("identifications")
        @ExcludeMissing
        fun _identifications(): JsonField<List<IdentificationCreateRequest>> = identifications

        /** An individual's last name. */
        @JsonProperty("last_name") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

        /** The business's legal structure. */
        @JsonProperty("legal_structure")
        @ExcludeMissing
        fun _legalStructure(): JsonField<LegalStructure> = legalStructure

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /** An individual's middle name. */
        @JsonProperty("middle_name")
        @ExcludeMissing
        fun _middleName(): JsonField<String> = middleName

        @JsonProperty("phone_numbers")
        @ExcludeMissing
        fun _phoneNumbers(): JsonField<List<PhoneNumber>> = phoneNumbers

        /** Whether the individual is a politically exposed person. */
        @JsonProperty("politically_exposed_person")
        @ExcludeMissing
        fun _politicallyExposedPerson(): JsonField<Boolean> = politicallyExposedPerson

        /** An individual's preferred name. */
        @JsonProperty("preferred_name")
        @ExcludeMissing
        fun _preferredName(): JsonField<String> = preferredName

        /** An individual's prefix. */
        @JsonProperty("prefix") @ExcludeMissing fun _prefix(): JsonField<String> = prefix

        /** The risk rating of the legal entity. One of low, medium, high. */
        @JsonProperty("risk_rating")
        @ExcludeMissing
        fun _riskRating(): JsonField<RiskRating> = riskRating

        /** An individual's suffix. */
        @JsonProperty("suffix") @ExcludeMissing fun _suffix(): JsonField<String> = suffix

        @JsonProperty("wealth_and_employment_details")
        @ExcludeMissing
        fun _wealthAndEmploymentDetails(): JsonField<WealthAndEmploymentDetails> =
            wealthAndEmploymentDetails

        /** The entity's primary website URL. */
        @JsonProperty("website") @ExcludeMissing fun _website(): JsonField<String> = website

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): LegalEntityUpdateRequest = apply {
            if (validated) {
                return@apply
            }

            addresses().ifPresent { it.forEach { it.validate() } }
            bankSettings().ifPresent { it.validate() }
            businessName()
            citizenshipCountry()
            dateFormed()
            dateOfBirth()
            doingBusinessAsNames()
            email()
            firstName()
            identifications().ifPresent { it.forEach { it.validate() } }
            lastName()
            legalStructure()
            metadata().ifPresent { it.validate() }
            middleName()
            phoneNumbers().ifPresent { it.forEach { it.validate() } }
            politicallyExposedPerson()
            preferredName()
            prefix()
            riskRating()
            suffix()
            wealthAndEmploymentDetails().ifPresent { it.validate() }
            website()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [LegalEntityUpdateRequest]. */
        class Builder internal constructor() {

            private var addresses: JsonField<MutableList<LegalEntityAddressCreateRequest>>? = null
            private var bankSettings: JsonField<BankSettings> = JsonMissing.of()
            private var businessName: JsonField<String> = JsonMissing.of()
            private var citizenshipCountry: JsonField<String> = JsonMissing.of()
            private var dateFormed: JsonField<LocalDate> = JsonMissing.of()
            private var dateOfBirth: JsonField<LocalDate> = JsonMissing.of()
            private var doingBusinessAsNames: JsonField<MutableList<String>>? = null
            private var email: JsonField<String> = JsonMissing.of()
            private var firstName: JsonField<String> = JsonMissing.of()
            private var identifications: JsonField<MutableList<IdentificationCreateRequest>>? = null
            private var lastName: JsonField<String> = JsonMissing.of()
            private var legalStructure: JsonField<LegalStructure> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var middleName: JsonField<String> = JsonMissing.of()
            private var phoneNumbers: JsonField<MutableList<PhoneNumber>>? = null
            private var politicallyExposedPerson: JsonField<Boolean> = JsonMissing.of()
            private var preferredName: JsonField<String> = JsonMissing.of()
            private var prefix: JsonField<String> = JsonMissing.of()
            private var riskRating: JsonField<RiskRating> = JsonMissing.of()
            private var suffix: JsonField<String> = JsonMissing.of()
            private var wealthAndEmploymentDetails: JsonField<WealthAndEmploymentDetails> =
                JsonMissing.of()
            private var website: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(legalEntityUpdateRequest: LegalEntityUpdateRequest) = apply {
                addresses = legalEntityUpdateRequest.addresses.map { it.toMutableList() }
                bankSettings = legalEntityUpdateRequest.bankSettings
                businessName = legalEntityUpdateRequest.businessName
                citizenshipCountry = legalEntityUpdateRequest.citizenshipCountry
                dateFormed = legalEntityUpdateRequest.dateFormed
                dateOfBirth = legalEntityUpdateRequest.dateOfBirth
                doingBusinessAsNames =
                    legalEntityUpdateRequest.doingBusinessAsNames.map { it.toMutableList() }
                email = legalEntityUpdateRequest.email
                firstName = legalEntityUpdateRequest.firstName
                identifications =
                    legalEntityUpdateRequest.identifications.map { it.toMutableList() }
                lastName = legalEntityUpdateRequest.lastName
                legalStructure = legalEntityUpdateRequest.legalStructure
                metadata = legalEntityUpdateRequest.metadata
                middleName = legalEntityUpdateRequest.middleName
                phoneNumbers = legalEntityUpdateRequest.phoneNumbers.map { it.toMutableList() }
                politicallyExposedPerson = legalEntityUpdateRequest.politicallyExposedPerson
                preferredName = legalEntityUpdateRequest.preferredName
                prefix = legalEntityUpdateRequest.prefix
                riskRating = legalEntityUpdateRequest.riskRating
                suffix = legalEntityUpdateRequest.suffix
                wealthAndEmploymentDetails = legalEntityUpdateRequest.wealthAndEmploymentDetails
                website = legalEntityUpdateRequest.website
                additionalProperties = legalEntityUpdateRequest.additionalProperties.toMutableMap()
            }

            /** A list of addresses for the entity. */
            fun addresses(addresses: List<LegalEntityAddressCreateRequest>) =
                addresses(JsonField.of(addresses))

            /** A list of addresses for the entity. */
            fun addresses(addresses: JsonField<List<LegalEntityAddressCreateRequest>>) = apply {
                this.addresses = addresses.map { it.toMutableList() }
            }

            /** A list of addresses for the entity. */
            fun addAddress(address: LegalEntityAddressCreateRequest) = apply {
                addresses =
                    (addresses ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(address)
                    }
            }

            fun bankSettings(bankSettings: BankSettings?) =
                bankSettings(JsonField.ofNullable(bankSettings))

            fun bankSettings(bankSettings: Optional<BankSettings>) =
                bankSettings(bankSettings.orElse(null))

            fun bankSettings(bankSettings: JsonField<BankSettings>) = apply {
                this.bankSettings = bankSettings
            }

            /** The business's legal business name. */
            fun businessName(businessName: String?) =
                businessName(JsonField.ofNullable(businessName))

            /** The business's legal business name. */
            fun businessName(businessName: Optional<String>) =
                businessName(businessName.orElse(null))

            /** The business's legal business name. */
            fun businessName(businessName: JsonField<String>) = apply {
                this.businessName = businessName
            }

            /** The country of citizenship for an individual. */
            fun citizenshipCountry(citizenshipCountry: String?) =
                citizenshipCountry(JsonField.ofNullable(citizenshipCountry))

            /** The country of citizenship for an individual. */
            fun citizenshipCountry(citizenshipCountry: Optional<String>) =
                citizenshipCountry(citizenshipCountry.orElse(null))

            /** The country of citizenship for an individual. */
            fun citizenshipCountry(citizenshipCountry: JsonField<String>) = apply {
                this.citizenshipCountry = citizenshipCountry
            }

            /** A business's formation date (YYYY-MM-DD). */
            fun dateFormed(dateFormed: LocalDate?) = dateFormed(JsonField.ofNullable(dateFormed))

            /** A business's formation date (YYYY-MM-DD). */
            fun dateFormed(dateFormed: Optional<LocalDate>) = dateFormed(dateFormed.orElse(null))

            /** A business's formation date (YYYY-MM-DD). */
            fun dateFormed(dateFormed: JsonField<LocalDate>) = apply {
                this.dateFormed = dateFormed
            }

            /** An individual's date of birth (YYYY-MM-DD). */
            fun dateOfBirth(dateOfBirth: LocalDate?) =
                dateOfBirth(JsonField.ofNullable(dateOfBirth))

            /** An individual's date of birth (YYYY-MM-DD). */
            fun dateOfBirth(dateOfBirth: Optional<LocalDate>) =
                dateOfBirth(dateOfBirth.orElse(null))

            /** An individual's date of birth (YYYY-MM-DD). */
            fun dateOfBirth(dateOfBirth: JsonField<LocalDate>) = apply {
                this.dateOfBirth = dateOfBirth
            }

            fun doingBusinessAsNames(doingBusinessAsNames: List<String>) =
                doingBusinessAsNames(JsonField.of(doingBusinessAsNames))

            fun doingBusinessAsNames(doingBusinessAsNames: JsonField<List<String>>) = apply {
                this.doingBusinessAsNames = doingBusinessAsNames.map { it.toMutableList() }
            }

            fun addDoingBusinessAsName(doingBusinessAsName: String) = apply {
                doingBusinessAsNames =
                    (doingBusinessAsNames ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(doingBusinessAsName)
                    }
            }

            /** The entity's primary email. */
            fun email(email: String?) = email(JsonField.ofNullable(email))

            /** The entity's primary email. */
            fun email(email: Optional<String>) = email(email.orElse(null))

            /** The entity's primary email. */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** An individual's first name. */
            fun firstName(firstName: String?) = firstName(JsonField.ofNullable(firstName))

            /** An individual's first name. */
            fun firstName(firstName: Optional<String>) = firstName(firstName.orElse(null))

            /** An individual's first name. */
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

            /** A list of identifications for the legal entity. */
            fun identifications(identifications: List<IdentificationCreateRequest>) =
                identifications(JsonField.of(identifications))

            /** A list of identifications for the legal entity. */
            fun identifications(identifications: JsonField<List<IdentificationCreateRequest>>) =
                apply {
                    this.identifications = identifications.map { it.toMutableList() }
                }

            /** A list of identifications for the legal entity. */
            fun addIdentification(identification: IdentificationCreateRequest) = apply {
                identifications =
                    (identifications ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(identification)
                    }
            }

            /** An individual's last name. */
            fun lastName(lastName: String?) = lastName(JsonField.ofNullable(lastName))

            /** An individual's last name. */
            fun lastName(lastName: Optional<String>) = lastName(lastName.orElse(null))

            /** An individual's last name. */
            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

            /** The business's legal structure. */
            fun legalStructure(legalStructure: LegalStructure?) =
                legalStructure(JsonField.ofNullable(legalStructure))

            /** The business's legal structure. */
            fun legalStructure(legalStructure: Optional<LegalStructure>) =
                legalStructure(legalStructure.orElse(null))

            /** The business's legal structure. */
            fun legalStructure(legalStructure: JsonField<LegalStructure>) = apply {
                this.legalStructure = legalStructure
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /** An individual's middle name. */
            fun middleName(middleName: String?) = middleName(JsonField.ofNullable(middleName))

            /** An individual's middle name. */
            fun middleName(middleName: Optional<String>) = middleName(middleName.orElse(null))

            /** An individual's middle name. */
            fun middleName(middleName: JsonField<String>) = apply { this.middleName = middleName }

            fun phoneNumbers(phoneNumbers: List<PhoneNumber>) =
                phoneNumbers(JsonField.of(phoneNumbers))

            fun phoneNumbers(phoneNumbers: JsonField<List<PhoneNumber>>) = apply {
                this.phoneNumbers = phoneNumbers.map { it.toMutableList() }
            }

            fun addPhoneNumber(phoneNumber: PhoneNumber) = apply {
                phoneNumbers =
                    (phoneNumbers ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(phoneNumber)
                    }
            }

            /** Whether the individual is a politically exposed person. */
            fun politicallyExposedPerson(politicallyExposedPerson: Boolean?) =
                politicallyExposedPerson(JsonField.ofNullable(politicallyExposedPerson))

            /** Whether the individual is a politically exposed person. */
            fun politicallyExposedPerson(politicallyExposedPerson: Boolean) =
                politicallyExposedPerson(politicallyExposedPerson as Boolean?)

            /** Whether the individual is a politically exposed person. */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun politicallyExposedPerson(politicallyExposedPerson: Optional<Boolean>) =
                politicallyExposedPerson(politicallyExposedPerson.orElse(null) as Boolean?)

            /** Whether the individual is a politically exposed person. */
            fun politicallyExposedPerson(politicallyExposedPerson: JsonField<Boolean>) = apply {
                this.politicallyExposedPerson = politicallyExposedPerson
            }

            /** An individual's preferred name. */
            fun preferredName(preferredName: String?) =
                preferredName(JsonField.ofNullable(preferredName))

            /** An individual's preferred name. */
            fun preferredName(preferredName: Optional<String>) =
                preferredName(preferredName.orElse(null))

            /** An individual's preferred name. */
            fun preferredName(preferredName: JsonField<String>) = apply {
                this.preferredName = preferredName
            }

            /** An individual's prefix. */
            fun prefix(prefix: String?) = prefix(JsonField.ofNullable(prefix))

            /** An individual's prefix. */
            fun prefix(prefix: Optional<String>) = prefix(prefix.orElse(null))

            /** An individual's prefix. */
            fun prefix(prefix: JsonField<String>) = apply { this.prefix = prefix }

            /** The risk rating of the legal entity. One of low, medium, high. */
            fun riskRating(riskRating: RiskRating?) = riskRating(JsonField.ofNullable(riskRating))

            /** The risk rating of the legal entity. One of low, medium, high. */
            fun riskRating(riskRating: Optional<RiskRating>) = riskRating(riskRating.orElse(null))

            /** The risk rating of the legal entity. One of low, medium, high. */
            fun riskRating(riskRating: JsonField<RiskRating>) = apply {
                this.riskRating = riskRating
            }

            /** An individual's suffix. */
            fun suffix(suffix: String?) = suffix(JsonField.ofNullable(suffix))

            /** An individual's suffix. */
            fun suffix(suffix: Optional<String>) = suffix(suffix.orElse(null))

            /** An individual's suffix. */
            fun suffix(suffix: JsonField<String>) = apply { this.suffix = suffix }

            fun wealthAndEmploymentDetails(
                wealthAndEmploymentDetails: WealthAndEmploymentDetails?
            ) = wealthAndEmploymentDetails(JsonField.ofNullable(wealthAndEmploymentDetails))

            fun wealthAndEmploymentDetails(
                wealthAndEmploymentDetails: Optional<WealthAndEmploymentDetails>
            ) = wealthAndEmploymentDetails(wealthAndEmploymentDetails.orElse(null))

            fun wealthAndEmploymentDetails(
                wealthAndEmploymentDetails: JsonField<WealthAndEmploymentDetails>
            ) = apply { this.wealthAndEmploymentDetails = wealthAndEmploymentDetails }

            /** The entity's primary website URL. */
            fun website(website: String?) = website(JsonField.ofNullable(website))

            /** The entity's primary website URL. */
            fun website(website: Optional<String>) = website(website.orElse(null))

            /** The entity's primary website URL. */
            fun website(website: JsonField<String>) = apply { this.website = website }

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

            fun build(): LegalEntityUpdateRequest =
                LegalEntityUpdateRequest(
                    (addresses ?: JsonMissing.of()).map { it.toImmutable() },
                    bankSettings,
                    businessName,
                    citizenshipCountry,
                    dateFormed,
                    dateOfBirth,
                    (doingBusinessAsNames ?: JsonMissing.of()).map { it.toImmutable() },
                    email,
                    firstName,
                    (identifications ?: JsonMissing.of()).map { it.toImmutable() },
                    lastName,
                    legalStructure,
                    metadata,
                    middleName,
                    (phoneNumbers ?: JsonMissing.of()).map { it.toImmutable() },
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

            return /* spotless:off */ other is LegalEntityUpdateRequest && addresses == other.addresses && bankSettings == other.bankSettings && businessName == other.businessName && citizenshipCountry == other.citizenshipCountry && dateFormed == other.dateFormed && dateOfBirth == other.dateOfBirth && doingBusinessAsNames == other.doingBusinessAsNames && email == other.email && firstName == other.firstName && identifications == other.identifications && lastName == other.lastName && legalStructure == other.legalStructure && metadata == other.metadata && middleName == other.middleName && phoneNumbers == other.phoneNumbers && politicallyExposedPerson == other.politicallyExposedPerson && preferredName == other.preferredName && prefix == other.prefix && riskRating == other.riskRating && suffix == other.suffix && wealthAndEmploymentDetails == other.wealthAndEmploymentDetails && website == other.website && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(addresses, bankSettings, businessName, citizenshipCountry, dateFormed, dateOfBirth, doingBusinessAsNames, email, firstName, identifications, lastName, legalStructure, metadata, middleName, phoneNumbers, politicallyExposedPerson, preferredName, prefix, riskRating, suffix, wealthAndEmploymentDetails, website, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LegalEntityUpdateRequest{addresses=$addresses, bankSettings=$bankSettings, businessName=$businessName, citizenshipCountry=$citizenshipCountry, dateFormed=$dateFormed, dateOfBirth=$dateOfBirth, doingBusinessAsNames=$doingBusinessAsNames, email=$email, firstName=$firstName, identifications=$identifications, lastName=$lastName, legalStructure=$legalStructure, metadata=$metadata, middleName=$middleName, phoneNumbers=$phoneNumbers, politicallyExposedPerson=$politicallyExposedPerson, preferredName=$preferredName, prefix=$prefix, riskRating=$riskRating, suffix=$suffix, wealthAndEmploymentDetails=$wealthAndEmploymentDetails, website=$website, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LegalEntityUpdateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var id: String? = null
        private var body: LegalEntityUpdateRequest.Builder = LegalEntityUpdateRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(legalEntityUpdateParams: LegalEntityUpdateParams) = apply {
            id = legalEntityUpdateParams.id
            body = legalEntityUpdateParams.body.toBuilder()
            additionalHeaders = legalEntityUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = legalEntityUpdateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String) = apply { this.id = id }

        /** A list of addresses for the entity. */
        fun addresses(addresses: List<LegalEntityAddressCreateRequest>) = apply {
            body.addresses(addresses)
        }

        /** A list of addresses for the entity. */
        fun addresses(addresses: JsonField<List<LegalEntityAddressCreateRequest>>) = apply {
            body.addresses(addresses)
        }

        /** A list of addresses for the entity. */
        fun addAddress(address: LegalEntityAddressCreateRequest) = apply {
            body.addAddress(address)
        }

        fun bankSettings(bankSettings: BankSettings?) = apply { body.bankSettings(bankSettings) }

        fun bankSettings(bankSettings: Optional<BankSettings>) =
            bankSettings(bankSettings.orElse(null))

        fun bankSettings(bankSettings: JsonField<BankSettings>) = apply {
            body.bankSettings(bankSettings)
        }

        /** The business's legal business name. */
        fun businessName(businessName: String?) = apply { body.businessName(businessName) }

        /** The business's legal business name. */
        fun businessName(businessName: Optional<String>) = businessName(businessName.orElse(null))

        /** The business's legal business name. */
        fun businessName(businessName: JsonField<String>) = apply {
            body.businessName(businessName)
        }

        /** The country of citizenship for an individual. */
        fun citizenshipCountry(citizenshipCountry: String?) = apply {
            body.citizenshipCountry(citizenshipCountry)
        }

        /** The country of citizenship for an individual. */
        fun citizenshipCountry(citizenshipCountry: Optional<String>) =
            citizenshipCountry(citizenshipCountry.orElse(null))

        /** The country of citizenship for an individual. */
        fun citizenshipCountry(citizenshipCountry: JsonField<String>) = apply {
            body.citizenshipCountry(citizenshipCountry)
        }

        /** A business's formation date (YYYY-MM-DD). */
        fun dateFormed(dateFormed: LocalDate?) = apply { body.dateFormed(dateFormed) }

        /** A business's formation date (YYYY-MM-DD). */
        fun dateFormed(dateFormed: Optional<LocalDate>) = dateFormed(dateFormed.orElse(null))

        /** A business's formation date (YYYY-MM-DD). */
        fun dateFormed(dateFormed: JsonField<LocalDate>) = apply { body.dateFormed(dateFormed) }

        /** An individual's date of birth (YYYY-MM-DD). */
        fun dateOfBirth(dateOfBirth: LocalDate?) = apply { body.dateOfBirth(dateOfBirth) }

        /** An individual's date of birth (YYYY-MM-DD). */
        fun dateOfBirth(dateOfBirth: Optional<LocalDate>) = dateOfBirth(dateOfBirth.orElse(null))

        /** An individual's date of birth (YYYY-MM-DD). */
        fun dateOfBirth(dateOfBirth: JsonField<LocalDate>) = apply { body.dateOfBirth(dateOfBirth) }

        fun doingBusinessAsNames(doingBusinessAsNames: List<String>) = apply {
            body.doingBusinessAsNames(doingBusinessAsNames)
        }

        fun doingBusinessAsNames(doingBusinessAsNames: JsonField<List<String>>) = apply {
            body.doingBusinessAsNames(doingBusinessAsNames)
        }

        fun addDoingBusinessAsName(doingBusinessAsName: String) = apply {
            body.addDoingBusinessAsName(doingBusinessAsName)
        }

        /** The entity's primary email. */
        fun email(email: String?) = apply { body.email(email) }

        /** The entity's primary email. */
        fun email(email: Optional<String>) = email(email.orElse(null))

        /** The entity's primary email. */
        fun email(email: JsonField<String>) = apply { body.email(email) }

        /** An individual's first name. */
        fun firstName(firstName: String?) = apply { body.firstName(firstName) }

        /** An individual's first name. */
        fun firstName(firstName: Optional<String>) = firstName(firstName.orElse(null))

        /** An individual's first name. */
        fun firstName(firstName: JsonField<String>) = apply { body.firstName(firstName) }

        /** A list of identifications for the legal entity. */
        fun identifications(identifications: List<IdentificationCreateRequest>) = apply {
            body.identifications(identifications)
        }

        /** A list of identifications for the legal entity. */
        fun identifications(identifications: JsonField<List<IdentificationCreateRequest>>) = apply {
            body.identifications(identifications)
        }

        /** A list of identifications for the legal entity. */
        fun addIdentification(identification: IdentificationCreateRequest) = apply {
            body.addIdentification(identification)
        }

        /** An individual's last name. */
        fun lastName(lastName: String?) = apply { body.lastName(lastName) }

        /** An individual's last name. */
        fun lastName(lastName: Optional<String>) = lastName(lastName.orElse(null))

        /** An individual's last name. */
        fun lastName(lastName: JsonField<String>) = apply { body.lastName(lastName) }

        /** The business's legal structure. */
        fun legalStructure(legalStructure: LegalStructure?) = apply {
            body.legalStructure(legalStructure)
        }

        /** The business's legal structure. */
        fun legalStructure(legalStructure: Optional<LegalStructure>) =
            legalStructure(legalStructure.orElse(null))

        /** The business's legal structure. */
        fun legalStructure(legalStructure: JsonField<LegalStructure>) = apply {
            body.legalStructure(legalStructure)
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /** An individual's middle name. */
        fun middleName(middleName: String?) = apply { body.middleName(middleName) }

        /** An individual's middle name. */
        fun middleName(middleName: Optional<String>) = middleName(middleName.orElse(null))

        /** An individual's middle name. */
        fun middleName(middleName: JsonField<String>) = apply { body.middleName(middleName) }

        fun phoneNumbers(phoneNumbers: List<PhoneNumber>) = apply {
            body.phoneNumbers(phoneNumbers)
        }

        fun phoneNumbers(phoneNumbers: JsonField<List<PhoneNumber>>) = apply {
            body.phoneNumbers(phoneNumbers)
        }

        fun addPhoneNumber(phoneNumber: PhoneNumber) = apply { body.addPhoneNumber(phoneNumber) }

        /** Whether the individual is a politically exposed person. */
        fun politicallyExposedPerson(politicallyExposedPerson: Boolean?) = apply {
            body.politicallyExposedPerson(politicallyExposedPerson)
        }

        /** Whether the individual is a politically exposed person. */
        fun politicallyExposedPerson(politicallyExposedPerson: Boolean) =
            politicallyExposedPerson(politicallyExposedPerson as Boolean?)

        /** Whether the individual is a politically exposed person. */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun politicallyExposedPerson(politicallyExposedPerson: Optional<Boolean>) =
            politicallyExposedPerson(politicallyExposedPerson.orElse(null) as Boolean?)

        /** Whether the individual is a politically exposed person. */
        fun politicallyExposedPerson(politicallyExposedPerson: JsonField<Boolean>) = apply {
            body.politicallyExposedPerson(politicallyExposedPerson)
        }

        /** An individual's preferred name. */
        fun preferredName(preferredName: String?) = apply { body.preferredName(preferredName) }

        /** An individual's preferred name. */
        fun preferredName(preferredName: Optional<String>) =
            preferredName(preferredName.orElse(null))

        /** An individual's preferred name. */
        fun preferredName(preferredName: JsonField<String>) = apply {
            body.preferredName(preferredName)
        }

        /** An individual's prefix. */
        fun prefix(prefix: String?) = apply { body.prefix(prefix) }

        /** An individual's prefix. */
        fun prefix(prefix: Optional<String>) = prefix(prefix.orElse(null))

        /** An individual's prefix. */
        fun prefix(prefix: JsonField<String>) = apply { body.prefix(prefix) }

        /** The risk rating of the legal entity. One of low, medium, high. */
        fun riskRating(riskRating: RiskRating?) = apply { body.riskRating(riskRating) }

        /** The risk rating of the legal entity. One of low, medium, high. */
        fun riskRating(riskRating: Optional<RiskRating>) = riskRating(riskRating.orElse(null))

        /** The risk rating of the legal entity. One of low, medium, high. */
        fun riskRating(riskRating: JsonField<RiskRating>) = apply { body.riskRating(riskRating) }

        /** An individual's suffix. */
        fun suffix(suffix: String?) = apply { body.suffix(suffix) }

        /** An individual's suffix. */
        fun suffix(suffix: Optional<String>) = suffix(suffix.orElse(null))

        /** An individual's suffix. */
        fun suffix(suffix: JsonField<String>) = apply { body.suffix(suffix) }

        fun wealthAndEmploymentDetails(wealthAndEmploymentDetails: WealthAndEmploymentDetails?) =
            apply {
                body.wealthAndEmploymentDetails(wealthAndEmploymentDetails)
            }

        fun wealthAndEmploymentDetails(
            wealthAndEmploymentDetails: Optional<WealthAndEmploymentDetails>
        ) = wealthAndEmploymentDetails(wealthAndEmploymentDetails.orElse(null))

        fun wealthAndEmploymentDetails(
            wealthAndEmploymentDetails: JsonField<WealthAndEmploymentDetails>
        ) = apply { body.wealthAndEmploymentDetails(wealthAndEmploymentDetails) }

        /** The entity's primary website URL. */
        fun website(website: String?) = apply { body.website(website) }

        /** The entity's primary website URL. */
        fun website(website: Optional<String>) = website(website.orElse(null))

        /** The entity's primary website URL. */
        fun website(website: JsonField<String>) = apply { body.website(website) }

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

        fun build(): LegalEntityUpdateParams =
            LegalEntityUpdateParams(
                checkRequired("id", id),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class LegalEntityAddressCreateRequest
    @JsonCreator
    private constructor(
        @JsonProperty("country")
        @ExcludeMissing
        private val country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line1")
        @ExcludeMissing
        private val line1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("locality")
        @ExcludeMissing
        private val locality: JsonField<String> = JsonMissing.of(),
        @JsonProperty("postal_code")
        @ExcludeMissing
        private val postalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("region")
        @ExcludeMissing
        private val region: JsonField<String> = JsonMissing.of(),
        @JsonProperty("address_types")
        @ExcludeMissing
        private val addressTypes: JsonField<List<AddressType>> = JsonMissing.of(),
        @JsonProperty("line2")
        @ExcludeMissing
        private val line2: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        fun country(): Optional<String> = Optional.ofNullable(country.getNullable("country"))

        fun line1(): Optional<String> = Optional.ofNullable(line1.getNullable("line1"))

        /** Locality or City. */
        fun locality(): Optional<String> = Optional.ofNullable(locality.getNullable("locality"))

        /** The postal code of the address. */
        fun postalCode(): Optional<String> =
            Optional.ofNullable(postalCode.getNullable("postal_code"))

        /** Region or State. */
        fun region(): Optional<String> = Optional.ofNullable(region.getNullable("region"))

        /** The types of this address. */
        fun addressTypes(): Optional<List<AddressType>> =
            Optional.ofNullable(addressTypes.getNullable("address_types"))

        fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

        /** Locality or City. */
        @JsonProperty("locality") @ExcludeMissing fun _locality(): JsonField<String> = locality

        /** The postal code of the address. */
        @JsonProperty("postal_code")
        @ExcludeMissing
        fun _postalCode(): JsonField<String> = postalCode

        /** Region or State. */
        @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

        /** The types of this address. */
        @JsonProperty("address_types")
        @ExcludeMissing
        fun _addressTypes(): JsonField<List<AddressType>> = addressTypes

        @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): LegalEntityAddressCreateRequest = apply {
            if (validated) {
                return@apply
            }

            country()
            line1()
            locality()
            postalCode()
            region()
            addressTypes()
            line2()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [LegalEntityAddressCreateRequest]. */
        class Builder internal constructor() {

            private var country: JsonField<String>? = null
            private var line1: JsonField<String>? = null
            private var locality: JsonField<String>? = null
            private var postalCode: JsonField<String>? = null
            private var region: JsonField<String>? = null
            private var addressTypes: JsonField<MutableList<AddressType>>? = null
            private var line2: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(legalEntityAddressCreateRequest: LegalEntityAddressCreateRequest) =
                apply {
                    country = legalEntityAddressCreateRequest.country
                    line1 = legalEntityAddressCreateRequest.line1
                    locality = legalEntityAddressCreateRequest.locality
                    postalCode = legalEntityAddressCreateRequest.postalCode
                    region = legalEntityAddressCreateRequest.region
                    addressTypes =
                        legalEntityAddressCreateRequest.addressTypes.map { it.toMutableList() }
                    line2 = legalEntityAddressCreateRequest.line2
                    additionalProperties =
                        legalEntityAddressCreateRequest.additionalProperties.toMutableMap()
                }

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: String?) = country(JsonField.ofNullable(country))

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: Optional<String>) = country(country.orElse(null))

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: JsonField<String>) = apply { this.country = country }

            fun line1(line1: String?) = line1(JsonField.ofNullable(line1))

            fun line1(line1: Optional<String>) = line1(line1.orElse(null))

            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            /** Locality or City. */
            fun locality(locality: String?) = locality(JsonField.ofNullable(locality))

            /** Locality or City. */
            fun locality(locality: Optional<String>) = locality(locality.orElse(null))

            /** Locality or City. */
            fun locality(locality: JsonField<String>) = apply { this.locality = locality }

            /** The postal code of the address. */
            fun postalCode(postalCode: String?) = postalCode(JsonField.ofNullable(postalCode))

            /** The postal code of the address. */
            fun postalCode(postalCode: Optional<String>) = postalCode(postalCode.orElse(null))

            /** The postal code of the address. */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** Region or State. */
            fun region(region: String?) = region(JsonField.ofNullable(region))

            /** Region or State. */
            fun region(region: Optional<String>) = region(region.orElse(null))

            /** Region or State. */
            fun region(region: JsonField<String>) = apply { this.region = region }

            /** The types of this address. */
            fun addressTypes(addressTypes: List<AddressType>) =
                addressTypes(JsonField.of(addressTypes))

            /** The types of this address. */
            fun addressTypes(addressTypes: JsonField<List<AddressType>>) = apply {
                this.addressTypes = addressTypes.map { it.toMutableList() }
            }

            /** The types of this address. */
            fun addAddressType(addressType: AddressType) = apply {
                addressTypes =
                    (addressTypes ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(addressType)
                    }
            }

            fun line2(line2: String?) = line2(JsonField.ofNullable(line2))

            fun line2(line2: Optional<String>) = line2(line2.orElse(null))

            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

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

            fun build(): LegalEntityAddressCreateRequest =
                LegalEntityAddressCreateRequest(
                    checkRequired("country", country),
                    checkRequired("line1", line1),
                    checkRequired("locality", locality),
                    checkRequired("postalCode", postalCode),
                    checkRequired("region", region),
                    (addressTypes ?: JsonMissing.of()).map { it.toImmutable() },
                    line2,
                    additionalProperties.toImmutable(),
                )
        }

        class AddressType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val BUSINESS = of("business")

                @JvmField val MAILING = of("mailing")

                @JvmField val OTHER = of("other")

                @JvmField val PO_BOX = of("po_box")

                @JvmField val RESIDENTIAL = of("residential")

                @JvmStatic fun of(value: String) = AddressType(JsonField.of(value))
            }

            /** An enum containing [AddressType]'s known values. */
            enum class Known {
                BUSINESS,
                MAILING,
                OTHER,
                PO_BOX,
                RESIDENTIAL,
            }

            /**
             * An enum containing [AddressType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [AddressType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                BUSINESS,
                MAILING,
                OTHER,
                PO_BOX,
                RESIDENTIAL,
                /**
                 * An enum member indicating that [AddressType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    BUSINESS -> Value.BUSINESS
                    MAILING -> Value.MAILING
                    OTHER -> Value.OTHER
                    PO_BOX -> Value.PO_BOX
                    RESIDENTIAL -> Value.RESIDENTIAL
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws ModernTreasuryInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    BUSINESS -> Known.BUSINESS
                    MAILING -> Known.MAILING
                    OTHER -> Known.OTHER
                    PO_BOX -> Known.PO_BOX
                    RESIDENTIAL -> Known.RESIDENTIAL
                    else -> throw ModernTreasuryInvalidDataException("Unknown AddressType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws ModernTreasuryInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    ModernTreasuryInvalidDataException("Value is not a String")
                }

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
        @JsonProperty("id_number")
        @ExcludeMissing
        private val idNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id_type")
        @ExcludeMissing
        private val idType: JsonField<IdType> = JsonMissing.of(),
        @JsonProperty("issuing_country")
        @ExcludeMissing
        private val issuingCountry: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The ID number of identification document. */
        fun idNumber(): String = idNumber.getRequired("id_number")

        /** The type of ID number. */
        fun idType(): IdType = idType.getRequired("id_type")

        /** The ISO 3166-1 alpha-2 country code of the country that issued the identification */
        fun issuingCountry(): Optional<String> =
            Optional.ofNullable(issuingCountry.getNullable("issuing_country"))

        /** The ID number of identification document. */
        @JsonProperty("id_number") @ExcludeMissing fun _idNumber(): JsonField<String> = idNumber

        /** The type of ID number. */
        @JsonProperty("id_type") @ExcludeMissing fun _idType(): JsonField<IdType> = idType

        /** The ISO 3166-1 alpha-2 country code of the country that issued the identification */
        @JsonProperty("issuing_country")
        @ExcludeMissing
        fun _issuingCountry(): JsonField<String> = issuingCountry

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): IdentificationCreateRequest = apply {
            if (validated) {
                return@apply
            }

            idNumber()
            idType()
            issuingCountry()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [IdentificationCreateRequest]. */
        class Builder internal constructor() {

            private var idNumber: JsonField<String>? = null
            private var idType: JsonField<IdType>? = null
            private var issuingCountry: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(identificationCreateRequest: IdentificationCreateRequest) = apply {
                idNumber = identificationCreateRequest.idNumber
                idType = identificationCreateRequest.idType
                issuingCountry = identificationCreateRequest.issuingCountry
                additionalProperties =
                    identificationCreateRequest.additionalProperties.toMutableMap()
            }

            /** The ID number of identification document. */
            fun idNumber(idNumber: String) = idNumber(JsonField.of(idNumber))

            /** The ID number of identification document. */
            fun idNumber(idNumber: JsonField<String>) = apply { this.idNumber = idNumber }

            /** The type of ID number. */
            fun idType(idType: IdType) = idType(JsonField.of(idType))

            /** The type of ID number. */
            fun idType(idType: JsonField<IdType>) = apply { this.idType = idType }

            /** The ISO 3166-1 alpha-2 country code of the country that issued the identification */
            fun issuingCountry(issuingCountry: String?) =
                issuingCountry(JsonField.ofNullable(issuingCountry))

            /** The ISO 3166-1 alpha-2 country code of the country that issued the identification */
            fun issuingCountry(issuingCountry: Optional<String>) =
                issuingCountry(issuingCountry.orElse(null))

            /** The ISO 3166-1 alpha-2 country code of the country that issued the identification */
            fun issuingCountry(issuingCountry: JsonField<String>) = apply {
                this.issuingCountry = issuingCountry
            }

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

            fun build(): IdentificationCreateRequest =
                IdentificationCreateRequest(
                    checkRequired("idNumber", idNumber),
                    checkRequired("idType", idType),
                    issuingCountry,
                    additionalProperties.toImmutable(),
                )
        }

        /** The type of ID number. */
        class IdType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
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

            /** An enum containing [IdType]'s known values. */
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

            /**
             * An enum containing [IdType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [IdType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
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
                /**
                 * An enum member indicating that [IdType] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
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

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws ModernTreasuryInvalidDataException if this class instance's value is a not a
             *   known member.
             */
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

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws ModernTreasuryInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    ModernTreasuryInvalidDataException("Value is not a String")
                }

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

    /** The business's legal structure. */
    class LegalStructure @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
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

        /** An enum containing [LegalStructure]'s known values. */
        enum class Known {
            CORPORATION,
            LLC,
            NON_PROFIT,
            PARTNERSHIP,
            SOLE_PROPRIETORSHIP,
            TRUST,
        }

        /**
         * An enum containing [LegalStructure]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [LegalStructure] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CORPORATION,
            LLC,
            NON_PROFIT,
            PARTNERSHIP,
            SOLE_PROPRIETORSHIP,
            TRUST,
            /**
             * An enum member indicating that [LegalStructure] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
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

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws ModernTreasuryInvalidDataException if this class instance's value is a not a
         *   known member.
         */
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

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws ModernTreasuryInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                ModernTreasuryInvalidDataException("Value is not a String")
            }

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
    @NoAutoDetect
    class Metadata
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

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
        @JsonProperty("phone_number")
        @ExcludeMissing
        private val phoneNumber: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun phoneNumber(): Optional<String> =
            Optional.ofNullable(phoneNumber.getNullable("phone_number"))

        @JsonProperty("phone_number")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PhoneNumber = apply {
            if (validated) {
                return@apply
            }

            phoneNumber()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PhoneNumber]. */
        class Builder internal constructor() {

            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(phoneNumber: PhoneNumber) = apply {
                this.phoneNumber = phoneNumber.phoneNumber
                additionalProperties = phoneNumber.additionalProperties.toMutableMap()
            }

            fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
            }

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

    /** The risk rating of the legal entity. One of low, medium, high. */
    class RiskRating @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val LOW = of("low")

            @JvmField val MEDIUM = of("medium")

            @JvmField val HIGH = of("high")

            @JvmStatic fun of(value: String) = RiskRating(JsonField.of(value))
        }

        /** An enum containing [RiskRating]'s known values. */
        enum class Known {
            LOW,
            MEDIUM,
            HIGH,
        }

        /**
         * An enum containing [RiskRating]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RiskRating] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LOW,
            MEDIUM,
            HIGH,
            /**
             * An enum member indicating that [RiskRating] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                LOW -> Value.LOW
                MEDIUM -> Value.MEDIUM
                HIGH -> Value.HIGH
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws ModernTreasuryInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                LOW -> Known.LOW
                MEDIUM -> Known.MEDIUM
                HIGH -> Known.HIGH
                else -> throw ModernTreasuryInvalidDataException("Unknown RiskRating: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws ModernTreasuryInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                ModernTreasuryInvalidDataException("Value is not a String")
            }

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

        return /* spotless:off */ other is LegalEntityUpdateParams && id == other.id && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(id, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "LegalEntityUpdateParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
