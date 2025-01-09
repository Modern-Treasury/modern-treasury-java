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
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class WealthAndEmploymentDetails
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("annual_income")
    @ExcludeMissing
    private val annualIncome: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("discarded_at")
    @ExcludeMissing
    private val discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("employer_country")
    @ExcludeMissing
    private val employerCountry: JsonField<String> = JsonMissing.of(),
    @JsonProperty("employer_name")
    @ExcludeMissing
    private val employerName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("employer_state")
    @ExcludeMissing
    private val employerState: JsonField<String> = JsonMissing.of(),
    @JsonProperty("employment_status")
    @ExcludeMissing
    private val employmentStatus: JsonField<EmploymentStatus> = JsonMissing.of(),
    @JsonProperty("income_country")
    @ExcludeMissing
    private val incomeCountry: JsonField<String> = JsonMissing.of(),
    @JsonProperty("income_source")
    @ExcludeMissing
    private val incomeSource: JsonField<IncomeSource> = JsonMissing.of(),
    @JsonProperty("income_state")
    @ExcludeMissing
    private val incomeState: JsonField<String> = JsonMissing.of(),
    @JsonProperty("industry")
    @ExcludeMissing
    private val industry: JsonField<Industry> = JsonMissing.of(),
    @JsonProperty("live_mode")
    @ExcludeMissing
    private val liveMode: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("object")
    @ExcludeMissing
    private val object_: JsonField<String> = JsonMissing.of(),
    @JsonProperty("occupation")
    @ExcludeMissing
    private val occupation: JsonField<Occupation> = JsonMissing.of(),
    @JsonProperty("source_of_funds")
    @ExcludeMissing
    private val sourceOfFunds: JsonField<SourceOfFunds> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("wealth_source")
    @ExcludeMissing
    private val wealthSource: JsonField<WealthSource> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    /** The annual income of the individual. */
    fun annualIncome(): Optional<Long> =
        Optional.ofNullable(annualIncome.getNullable("annual_income"))

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun discardedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(discardedAt.getNullable("discarded_at"))

    /** The country in which the employer is located. */
    fun employerCountry(): Optional<String> =
        Optional.ofNullable(employerCountry.getNullable("employer_country"))

    /** The name of the employer. */
    fun employerName(): Optional<String> =
        Optional.ofNullable(employerName.getNullable("employer_name"))

    /** The state in which the employer is located. */
    fun employerState(): Optional<String> =
        Optional.ofNullable(employerState.getNullable("employer_state"))

    /** The employment status of the individual. */
    fun employmentStatus(): Optional<EmploymentStatus> =
        Optional.ofNullable(employmentStatus.getNullable("employment_status"))

    /** The country in which the individual's income is earned. */
    fun incomeCountry(): Optional<String> =
        Optional.ofNullable(incomeCountry.getNullable("income_country"))

    /** The source of the individual's income. */
    fun incomeSource(): Optional<IncomeSource> =
        Optional.ofNullable(incomeSource.getNullable("income_source"))

    /** The state in which the individual's income is earned. */
    fun incomeState(): Optional<String> =
        Optional.ofNullable(incomeState.getNullable("income_state"))

    /** The industry of the individual. */
    fun industry(): Optional<Industry> = Optional.ofNullable(industry.getNullable("industry"))

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    fun object_(): String = object_.getRequired("object")

    /** The occupation of the individual. */
    fun occupation(): Optional<Occupation> =
        Optional.ofNullable(occupation.getNullable("occupation"))

    /** The source of the individual's funds. */
    fun sourceOfFunds(): Optional<SourceOfFunds> =
        Optional.ofNullable(sourceOfFunds.getNullable("source_of_funds"))

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /** The source of the individual's wealth. */
    fun wealthSource(): Optional<WealthSource> =
        Optional.ofNullable(wealthSource.getNullable("wealth_source"))

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The annual income of the individual. */
    @JsonProperty("annual_income")
    @ExcludeMissing
    fun _annualIncome(): JsonField<Long> = annualIncome

    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    @JsonProperty("discarded_at")
    @ExcludeMissing
    fun _discardedAt(): JsonField<OffsetDateTime> = discardedAt

    /** The country in which the employer is located. */
    @JsonProperty("employer_country")
    @ExcludeMissing
    fun _employerCountry(): JsonField<String> = employerCountry

    /** The name of the employer. */
    @JsonProperty("employer_name")
    @ExcludeMissing
    fun _employerName(): JsonField<String> = employerName

    /** The state in which the employer is located. */
    @JsonProperty("employer_state")
    @ExcludeMissing
    fun _employerState(): JsonField<String> = employerState

    /** The employment status of the individual. */
    @JsonProperty("employment_status")
    @ExcludeMissing
    fun _employmentStatus(): JsonField<EmploymentStatus> = employmentStatus

    /** The country in which the individual's income is earned. */
    @JsonProperty("income_country")
    @ExcludeMissing
    fun _incomeCountry(): JsonField<String> = incomeCountry

    /** The source of the individual's income. */
    @JsonProperty("income_source")
    @ExcludeMissing
    fun _incomeSource(): JsonField<IncomeSource> = incomeSource

    /** The state in which the individual's income is earned. */
    @JsonProperty("income_state")
    @ExcludeMissing
    fun _incomeState(): JsonField<String> = incomeState

    /** The industry of the individual. */
    @JsonProperty("industry") @ExcludeMissing fun _industry(): JsonField<Industry> = industry

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

    /** The occupation of the individual. */
    @JsonProperty("occupation")
    @ExcludeMissing
    fun _occupation(): JsonField<Occupation> = occupation

    /** The source of the individual's funds. */
    @JsonProperty("source_of_funds")
    @ExcludeMissing
    fun _sourceOfFunds(): JsonField<SourceOfFunds> = sourceOfFunds

    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /** The source of the individual's wealth. */
    @JsonProperty("wealth_source")
    @ExcludeMissing
    fun _wealthSource(): JsonField<WealthSource> = wealthSource

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): WealthAndEmploymentDetails = apply {
        if (validated) {
            return@apply
        }

        id()
        annualIncome()
        createdAt()
        discardedAt()
        employerCountry()
        employerName()
        employerState()
        employmentStatus()
        incomeCountry()
        incomeSource()
        incomeState()
        industry()
        liveMode()
        object_()
        occupation()
        sourceOfFunds()
        updatedAt()
        wealthSource()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String>? = null
        private var annualIncome: JsonField<Long>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var discardedAt: JsonField<OffsetDateTime>? = null
        private var employerCountry: JsonField<String>? = null
        private var employerName: JsonField<String>? = null
        private var employerState: JsonField<String>? = null
        private var employmentStatus: JsonField<EmploymentStatus>? = null
        private var incomeCountry: JsonField<String>? = null
        private var incomeSource: JsonField<IncomeSource>? = null
        private var incomeState: JsonField<String>? = null
        private var industry: JsonField<Industry>? = null
        private var liveMode: JsonField<Boolean>? = null
        private var object_: JsonField<String>? = null
        private var occupation: JsonField<Occupation>? = null
        private var sourceOfFunds: JsonField<SourceOfFunds>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var wealthSource: JsonField<WealthSource>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(wealthAndEmploymentDetails: WealthAndEmploymentDetails) = apply {
            id = wealthAndEmploymentDetails.id
            annualIncome = wealthAndEmploymentDetails.annualIncome
            createdAt = wealthAndEmploymentDetails.createdAt
            discardedAt = wealthAndEmploymentDetails.discardedAt
            employerCountry = wealthAndEmploymentDetails.employerCountry
            employerName = wealthAndEmploymentDetails.employerName
            employerState = wealthAndEmploymentDetails.employerState
            employmentStatus = wealthAndEmploymentDetails.employmentStatus
            incomeCountry = wealthAndEmploymentDetails.incomeCountry
            incomeSource = wealthAndEmploymentDetails.incomeSource
            incomeState = wealthAndEmploymentDetails.incomeState
            industry = wealthAndEmploymentDetails.industry
            liveMode = wealthAndEmploymentDetails.liveMode
            object_ = wealthAndEmploymentDetails.object_
            occupation = wealthAndEmploymentDetails.occupation
            sourceOfFunds = wealthAndEmploymentDetails.sourceOfFunds
            updatedAt = wealthAndEmploymentDetails.updatedAt
            wealthSource = wealthAndEmploymentDetails.wealthSource
            additionalProperties = wealthAndEmploymentDetails.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The annual income of the individual. */
        fun annualIncome(annualIncome: Long?) = annualIncome(JsonField.ofNullable(annualIncome))

        /** The annual income of the individual. */
        fun annualIncome(annualIncome: Long) = annualIncome(annualIncome as Long?)

        /** The annual income of the individual. */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun annualIncome(annualIncome: Optional<Long>) =
            annualIncome(annualIncome.orElse(null) as Long?)

        /** The annual income of the individual. */
        fun annualIncome(annualIncome: JsonField<Long>) = apply { this.annualIncome = annualIncome }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun discardedAt(discardedAt: OffsetDateTime?) =
            discardedAt(JsonField.ofNullable(discardedAt))

        fun discardedAt(discardedAt: Optional<OffsetDateTime>) =
            discardedAt(discardedAt.orElse(null))

        fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
            this.discardedAt = discardedAt
        }

        /** The country in which the employer is located. */
        fun employerCountry(employerCountry: String?) =
            employerCountry(JsonField.ofNullable(employerCountry))

        /** The country in which the employer is located. */
        fun employerCountry(employerCountry: Optional<String>) =
            employerCountry(employerCountry.orElse(null))

        /** The country in which the employer is located. */
        fun employerCountry(employerCountry: JsonField<String>) = apply {
            this.employerCountry = employerCountry
        }

        /** The name of the employer. */
        fun employerName(employerName: String?) = employerName(JsonField.ofNullable(employerName))

        /** The name of the employer. */
        fun employerName(employerName: Optional<String>) = employerName(employerName.orElse(null))

        /** The name of the employer. */
        fun employerName(employerName: JsonField<String>) = apply {
            this.employerName = employerName
        }

        /** The state in which the employer is located. */
        fun employerState(employerState: String?) =
            employerState(JsonField.ofNullable(employerState))

        /** The state in which the employer is located. */
        fun employerState(employerState: Optional<String>) =
            employerState(employerState.orElse(null))

        /** The state in which the employer is located. */
        fun employerState(employerState: JsonField<String>) = apply {
            this.employerState = employerState
        }

        /** The employment status of the individual. */
        fun employmentStatus(employmentStatus: EmploymentStatus?) =
            employmentStatus(JsonField.ofNullable(employmentStatus))

        /** The employment status of the individual. */
        fun employmentStatus(employmentStatus: Optional<EmploymentStatus>) =
            employmentStatus(employmentStatus.orElse(null))

        /** The employment status of the individual. */
        fun employmentStatus(employmentStatus: JsonField<EmploymentStatus>) = apply {
            this.employmentStatus = employmentStatus
        }

        /** The country in which the individual's income is earned. */
        fun incomeCountry(incomeCountry: String?) =
            incomeCountry(JsonField.ofNullable(incomeCountry))

        /** The country in which the individual's income is earned. */
        fun incomeCountry(incomeCountry: Optional<String>) =
            incomeCountry(incomeCountry.orElse(null))

        /** The country in which the individual's income is earned. */
        fun incomeCountry(incomeCountry: JsonField<String>) = apply {
            this.incomeCountry = incomeCountry
        }

        /** The source of the individual's income. */
        fun incomeSource(incomeSource: IncomeSource?) =
            incomeSource(JsonField.ofNullable(incomeSource))

        /** The source of the individual's income. */
        fun incomeSource(incomeSource: Optional<IncomeSource>) =
            incomeSource(incomeSource.orElse(null))

        /** The source of the individual's income. */
        fun incomeSource(incomeSource: JsonField<IncomeSource>) = apply {
            this.incomeSource = incomeSource
        }

        /** The state in which the individual's income is earned. */
        fun incomeState(incomeState: String?) = incomeState(JsonField.ofNullable(incomeState))

        /** The state in which the individual's income is earned. */
        fun incomeState(incomeState: Optional<String>) = incomeState(incomeState.orElse(null))

        /** The state in which the individual's income is earned. */
        fun incomeState(incomeState: JsonField<String>) = apply { this.incomeState = incomeState }

        /** The industry of the individual. */
        fun industry(industry: Industry?) = industry(JsonField.ofNullable(industry))

        /** The industry of the individual. */
        fun industry(industry: Optional<Industry>) = industry(industry.orElse(null))

        /** The industry of the individual. */
        fun industry(industry: JsonField<Industry>) = apply { this.industry = industry }

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

        fun object_(object_: String) = object_(JsonField.of(object_))

        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        /** The occupation of the individual. */
        fun occupation(occupation: Occupation?) = occupation(JsonField.ofNullable(occupation))

        /** The occupation of the individual. */
        fun occupation(occupation: Optional<Occupation>) = occupation(occupation.orElse(null))

        /** The occupation of the individual. */
        fun occupation(occupation: JsonField<Occupation>) = apply { this.occupation = occupation }

        /** The source of the individual's funds. */
        fun sourceOfFunds(sourceOfFunds: SourceOfFunds?) =
            sourceOfFunds(JsonField.ofNullable(sourceOfFunds))

        /** The source of the individual's funds. */
        fun sourceOfFunds(sourceOfFunds: Optional<SourceOfFunds>) =
            sourceOfFunds(sourceOfFunds.orElse(null))

        /** The source of the individual's funds. */
        fun sourceOfFunds(sourceOfFunds: JsonField<SourceOfFunds>) = apply {
            this.sourceOfFunds = sourceOfFunds
        }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** The source of the individual's wealth. */
        fun wealthSource(wealthSource: WealthSource?) =
            wealthSource(JsonField.ofNullable(wealthSource))

        /** The source of the individual's wealth. */
        fun wealthSource(wealthSource: Optional<WealthSource>) =
            wealthSource(wealthSource.orElse(null))

        /** The source of the individual's wealth. */
        fun wealthSource(wealthSource: JsonField<WealthSource>) = apply {
            this.wealthSource = wealthSource
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

        fun build(): WealthAndEmploymentDetails =
            WealthAndEmploymentDetails(
                checkNotNull(id) { "`id` is required but was not set" },
                checkNotNull(annualIncome) { "`annualIncome` is required but was not set" },
                checkNotNull(createdAt) { "`createdAt` is required but was not set" },
                checkNotNull(discardedAt) { "`discardedAt` is required but was not set" },
                checkNotNull(employerCountry) { "`employerCountry` is required but was not set" },
                checkNotNull(employerName) { "`employerName` is required but was not set" },
                checkNotNull(employerState) { "`employerState` is required but was not set" },
                checkNotNull(employmentStatus) { "`employmentStatus` is required but was not set" },
                checkNotNull(incomeCountry) { "`incomeCountry` is required but was not set" },
                checkNotNull(incomeSource) { "`incomeSource` is required but was not set" },
                checkNotNull(incomeState) { "`incomeState` is required but was not set" },
                checkNotNull(industry) { "`industry` is required but was not set" },
                checkNotNull(liveMode) { "`liveMode` is required but was not set" },
                checkNotNull(object_) { "`object_` is required but was not set" },
                checkNotNull(occupation) { "`occupation` is required but was not set" },
                checkNotNull(sourceOfFunds) { "`sourceOfFunds` is required but was not set" },
                checkNotNull(updatedAt) { "`updatedAt` is required but was not set" },
                checkNotNull(wealthSource) { "`wealthSource` is required but was not set" },
                additionalProperties.toImmutable(),
            )
    }

    class EmploymentStatus
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val EMPLOYED = of("employed")

            @JvmField val RETIRED = of("retired")

            @JvmField val SELF_EMPLOYED = of("self_employed")

            @JvmField val STUDENT = of("student")

            @JvmField val UNEMPLOYED = of("unemployed")

            @JvmStatic fun of(value: String) = EmploymentStatus(JsonField.of(value))
        }

        enum class Known {
            EMPLOYED,
            RETIRED,
            SELF_EMPLOYED,
            STUDENT,
            UNEMPLOYED,
        }

        enum class Value {
            EMPLOYED,
            RETIRED,
            SELF_EMPLOYED,
            STUDENT,
            UNEMPLOYED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                EMPLOYED -> Value.EMPLOYED
                RETIRED -> Value.RETIRED
                SELF_EMPLOYED -> Value.SELF_EMPLOYED
                STUDENT -> Value.STUDENT
                UNEMPLOYED -> Value.UNEMPLOYED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                EMPLOYED -> Known.EMPLOYED
                RETIRED -> Known.RETIRED
                SELF_EMPLOYED -> Known.SELF_EMPLOYED
                STUDENT -> Known.STUDENT
                UNEMPLOYED -> Known.UNEMPLOYED
                else -> throw ModernTreasuryInvalidDataException("Unknown EmploymentStatus: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is EmploymentStatus && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class IncomeSource
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val FAMILY_SUPPORT = of("family_support")

            @JvmField val GOVERNMENT_BENEFITS = of("government_benefits")

            @JvmField val INHERITANCE = of("inheritance")

            @JvmField val INVESTMENTS = of("investments")

            @JvmField val RENTAL_INCOME = of("rental_income")

            @JvmField val RETIREMENT = of("retirement")

            @JvmField val SALARY = of("salary")

            @JvmField val SELF_EMPLOYED = of("self_employed")

            @JvmStatic fun of(value: String) = IncomeSource(JsonField.of(value))
        }

        enum class Known {
            FAMILY_SUPPORT,
            GOVERNMENT_BENEFITS,
            INHERITANCE,
            INVESTMENTS,
            RENTAL_INCOME,
            RETIREMENT,
            SALARY,
            SELF_EMPLOYED,
        }

        enum class Value {
            FAMILY_SUPPORT,
            GOVERNMENT_BENEFITS,
            INHERITANCE,
            INVESTMENTS,
            RENTAL_INCOME,
            RETIREMENT,
            SALARY,
            SELF_EMPLOYED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                FAMILY_SUPPORT -> Value.FAMILY_SUPPORT
                GOVERNMENT_BENEFITS -> Value.GOVERNMENT_BENEFITS
                INHERITANCE -> Value.INHERITANCE
                INVESTMENTS -> Value.INVESTMENTS
                RENTAL_INCOME -> Value.RENTAL_INCOME
                RETIREMENT -> Value.RETIREMENT
                SALARY -> Value.SALARY
                SELF_EMPLOYED -> Value.SELF_EMPLOYED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                FAMILY_SUPPORT -> Known.FAMILY_SUPPORT
                GOVERNMENT_BENEFITS -> Known.GOVERNMENT_BENEFITS
                INHERITANCE -> Known.INHERITANCE
                INVESTMENTS -> Known.INVESTMENTS
                RENTAL_INCOME -> Known.RENTAL_INCOME
                RETIREMENT -> Known.RETIREMENT
                SALARY -> Known.SALARY
                SELF_EMPLOYED -> Known.SELF_EMPLOYED
                else -> throw ModernTreasuryInvalidDataException("Unknown IncomeSource: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is IncomeSource && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Industry
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ACCOUNTING = of("accounting")

            @JvmField val AGRICULTURE = of("agriculture")

            @JvmField val AUTOMOTIVE = of("automotive")

            @JvmField val CHEMICAL_MANUFACTURING = of("chemical_manufacturing")

            @JvmField val CONSTRUCTION = of("construction")

            @JvmField val EDUCATIONAL_MEDICAL = of("educational_medical")

            @JvmField val FOOD_SERVICE = of("food_service")

            @JvmField val FINANCE = of("finance")

            @JvmField val GASOLINE = of("gasoline")

            @JvmField val HEALTH_STORES = of("health_stores")

            @JvmField val LAUNDRY = of("laundry")

            @JvmField val MAINTENANCE = of("maintenance")

            @JvmField val MANUFACTURING = of("manufacturing")

            @JvmField val MERCHANT_WHOLESALE = of("merchant_wholesale")

            @JvmField val MINING = of("mining")

            @JvmField val PERFORMING_ARTS = of("performing_arts")

            @JvmField val PROFESSIONAL_NON_LEGAL = of("professional_non_legal")

            @JvmField val PUBLIC_ADMINISTRATION = of("public_administration")

            @JvmField val PUBLISHING = of("publishing")

            @JvmField val REAL_ESTATE = of("real_estate")

            @JvmField val RECREATION_GAMBLING = of("recreation_gambling")

            @JvmField val RELIGIOUS_CHARITY = of("religious_charity")

            @JvmField val RENTAL_SERVICES = of("rental_services")

            @JvmField val RETAIL_CLOTHING = of("retail_clothing")

            @JvmField val RETAIL_ELECTRONICS = of("retail_electronics")

            @JvmField val RETAIL_FOOD = of("retail_food")

            @JvmField val RETAIL_FURNISHING = of("retail_furnishing")

            @JvmField val RETAIL_HOME = of("retail_home")

            @JvmField val RETAIL_NON_STORE = of("retail_non_store")

            @JvmField val RETAIL_SPORTING = of("retail_sporting")

            @JvmField val TRANSPORTATION = of("transportation")

            @JvmField val TRAVEL = of("travel")

            @JvmField val UTILITIES = of("utilities")

            @JvmStatic fun of(value: String) = Industry(JsonField.of(value))
        }

        enum class Known {
            ACCOUNTING,
            AGRICULTURE,
            AUTOMOTIVE,
            CHEMICAL_MANUFACTURING,
            CONSTRUCTION,
            EDUCATIONAL_MEDICAL,
            FOOD_SERVICE,
            FINANCE,
            GASOLINE,
            HEALTH_STORES,
            LAUNDRY,
            MAINTENANCE,
            MANUFACTURING,
            MERCHANT_WHOLESALE,
            MINING,
            PERFORMING_ARTS,
            PROFESSIONAL_NON_LEGAL,
            PUBLIC_ADMINISTRATION,
            PUBLISHING,
            REAL_ESTATE,
            RECREATION_GAMBLING,
            RELIGIOUS_CHARITY,
            RENTAL_SERVICES,
            RETAIL_CLOTHING,
            RETAIL_ELECTRONICS,
            RETAIL_FOOD,
            RETAIL_FURNISHING,
            RETAIL_HOME,
            RETAIL_NON_STORE,
            RETAIL_SPORTING,
            TRANSPORTATION,
            TRAVEL,
            UTILITIES,
        }

        enum class Value {
            ACCOUNTING,
            AGRICULTURE,
            AUTOMOTIVE,
            CHEMICAL_MANUFACTURING,
            CONSTRUCTION,
            EDUCATIONAL_MEDICAL,
            FOOD_SERVICE,
            FINANCE,
            GASOLINE,
            HEALTH_STORES,
            LAUNDRY,
            MAINTENANCE,
            MANUFACTURING,
            MERCHANT_WHOLESALE,
            MINING,
            PERFORMING_ARTS,
            PROFESSIONAL_NON_LEGAL,
            PUBLIC_ADMINISTRATION,
            PUBLISHING,
            REAL_ESTATE,
            RECREATION_GAMBLING,
            RELIGIOUS_CHARITY,
            RENTAL_SERVICES,
            RETAIL_CLOTHING,
            RETAIL_ELECTRONICS,
            RETAIL_FOOD,
            RETAIL_FURNISHING,
            RETAIL_HOME,
            RETAIL_NON_STORE,
            RETAIL_SPORTING,
            TRANSPORTATION,
            TRAVEL,
            UTILITIES,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACCOUNTING -> Value.ACCOUNTING
                AGRICULTURE -> Value.AGRICULTURE
                AUTOMOTIVE -> Value.AUTOMOTIVE
                CHEMICAL_MANUFACTURING -> Value.CHEMICAL_MANUFACTURING
                CONSTRUCTION -> Value.CONSTRUCTION
                EDUCATIONAL_MEDICAL -> Value.EDUCATIONAL_MEDICAL
                FOOD_SERVICE -> Value.FOOD_SERVICE
                FINANCE -> Value.FINANCE
                GASOLINE -> Value.GASOLINE
                HEALTH_STORES -> Value.HEALTH_STORES
                LAUNDRY -> Value.LAUNDRY
                MAINTENANCE -> Value.MAINTENANCE
                MANUFACTURING -> Value.MANUFACTURING
                MERCHANT_WHOLESALE -> Value.MERCHANT_WHOLESALE
                MINING -> Value.MINING
                PERFORMING_ARTS -> Value.PERFORMING_ARTS
                PROFESSIONAL_NON_LEGAL -> Value.PROFESSIONAL_NON_LEGAL
                PUBLIC_ADMINISTRATION -> Value.PUBLIC_ADMINISTRATION
                PUBLISHING -> Value.PUBLISHING
                REAL_ESTATE -> Value.REAL_ESTATE
                RECREATION_GAMBLING -> Value.RECREATION_GAMBLING
                RELIGIOUS_CHARITY -> Value.RELIGIOUS_CHARITY
                RENTAL_SERVICES -> Value.RENTAL_SERVICES
                RETAIL_CLOTHING -> Value.RETAIL_CLOTHING
                RETAIL_ELECTRONICS -> Value.RETAIL_ELECTRONICS
                RETAIL_FOOD -> Value.RETAIL_FOOD
                RETAIL_FURNISHING -> Value.RETAIL_FURNISHING
                RETAIL_HOME -> Value.RETAIL_HOME
                RETAIL_NON_STORE -> Value.RETAIL_NON_STORE
                RETAIL_SPORTING -> Value.RETAIL_SPORTING
                TRANSPORTATION -> Value.TRANSPORTATION
                TRAVEL -> Value.TRAVEL
                UTILITIES -> Value.UTILITIES
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACCOUNTING -> Known.ACCOUNTING
                AGRICULTURE -> Known.AGRICULTURE
                AUTOMOTIVE -> Known.AUTOMOTIVE
                CHEMICAL_MANUFACTURING -> Known.CHEMICAL_MANUFACTURING
                CONSTRUCTION -> Known.CONSTRUCTION
                EDUCATIONAL_MEDICAL -> Known.EDUCATIONAL_MEDICAL
                FOOD_SERVICE -> Known.FOOD_SERVICE
                FINANCE -> Known.FINANCE
                GASOLINE -> Known.GASOLINE
                HEALTH_STORES -> Known.HEALTH_STORES
                LAUNDRY -> Known.LAUNDRY
                MAINTENANCE -> Known.MAINTENANCE
                MANUFACTURING -> Known.MANUFACTURING
                MERCHANT_WHOLESALE -> Known.MERCHANT_WHOLESALE
                MINING -> Known.MINING
                PERFORMING_ARTS -> Known.PERFORMING_ARTS
                PROFESSIONAL_NON_LEGAL -> Known.PROFESSIONAL_NON_LEGAL
                PUBLIC_ADMINISTRATION -> Known.PUBLIC_ADMINISTRATION
                PUBLISHING -> Known.PUBLISHING
                REAL_ESTATE -> Known.REAL_ESTATE
                RECREATION_GAMBLING -> Known.RECREATION_GAMBLING
                RELIGIOUS_CHARITY -> Known.RELIGIOUS_CHARITY
                RENTAL_SERVICES -> Known.RENTAL_SERVICES
                RETAIL_CLOTHING -> Known.RETAIL_CLOTHING
                RETAIL_ELECTRONICS -> Known.RETAIL_ELECTRONICS
                RETAIL_FOOD -> Known.RETAIL_FOOD
                RETAIL_FURNISHING -> Known.RETAIL_FURNISHING
                RETAIL_HOME -> Known.RETAIL_HOME
                RETAIL_NON_STORE -> Known.RETAIL_NON_STORE
                RETAIL_SPORTING -> Known.RETAIL_SPORTING
                TRANSPORTATION -> Known.TRANSPORTATION
                TRAVEL -> Known.TRAVEL
                UTILITIES -> Known.UTILITIES
                else -> throw ModernTreasuryInvalidDataException("Unknown Industry: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Industry && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Occupation
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val CONSULTING = of("consulting")

            @JvmField val EXECUTIVE = of("executive")

            @JvmField val FINANCE_ACCOUNTING = of("finance_accounting")

            @JvmField val FOOD_SERVICES = of("food_services")

            @JvmField val GOVERNMENT = of("government")

            @JvmField val HEALTHCARE = of("healthcare")

            @JvmField val LEGAL_SERVICES = of("legal_services")

            @JvmField val MANUFACTURING = of("manufacturing")

            @JvmField val OTHER = of("other")

            @JvmField val SALES = of("sales")

            @JvmField val SCIENCE_ENGINEERING = of("science_engineering")

            @JvmField val TECHNOLOGY = of("technology")

            @JvmStatic fun of(value: String) = Occupation(JsonField.of(value))
        }

        enum class Known {
            CONSULTING,
            EXECUTIVE,
            FINANCE_ACCOUNTING,
            FOOD_SERVICES,
            GOVERNMENT,
            HEALTHCARE,
            LEGAL_SERVICES,
            MANUFACTURING,
            OTHER,
            SALES,
            SCIENCE_ENGINEERING,
            TECHNOLOGY,
        }

        enum class Value {
            CONSULTING,
            EXECUTIVE,
            FINANCE_ACCOUNTING,
            FOOD_SERVICES,
            GOVERNMENT,
            HEALTHCARE,
            LEGAL_SERVICES,
            MANUFACTURING,
            OTHER,
            SALES,
            SCIENCE_ENGINEERING,
            TECHNOLOGY,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CONSULTING -> Value.CONSULTING
                EXECUTIVE -> Value.EXECUTIVE
                FINANCE_ACCOUNTING -> Value.FINANCE_ACCOUNTING
                FOOD_SERVICES -> Value.FOOD_SERVICES
                GOVERNMENT -> Value.GOVERNMENT
                HEALTHCARE -> Value.HEALTHCARE
                LEGAL_SERVICES -> Value.LEGAL_SERVICES
                MANUFACTURING -> Value.MANUFACTURING
                OTHER -> Value.OTHER
                SALES -> Value.SALES
                SCIENCE_ENGINEERING -> Value.SCIENCE_ENGINEERING
                TECHNOLOGY -> Value.TECHNOLOGY
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CONSULTING -> Known.CONSULTING
                EXECUTIVE -> Known.EXECUTIVE
                FINANCE_ACCOUNTING -> Known.FINANCE_ACCOUNTING
                FOOD_SERVICES -> Known.FOOD_SERVICES
                GOVERNMENT -> Known.GOVERNMENT
                HEALTHCARE -> Known.HEALTHCARE
                LEGAL_SERVICES -> Known.LEGAL_SERVICES
                MANUFACTURING -> Known.MANUFACTURING
                OTHER -> Known.OTHER
                SALES -> Known.SALES
                SCIENCE_ENGINEERING -> Known.SCIENCE_ENGINEERING
                TECHNOLOGY -> Known.TECHNOLOGY
                else -> throw ModernTreasuryInvalidDataException("Unknown Occupation: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Occupation && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class SourceOfFunds
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ALIMONY = of("alimony")

            @JvmField val ANNUITY = of("annuity")

            @JvmField val BUSINESS_OWNER = of("business_owner")

            @JvmField val GENERAL_EMPLOYEE = of("general_employee")

            @JvmField val GOVERNMENT_BENEFITS = of("government_benefits")

            @JvmField val HOMEMAKER = of("homemaker")

            @JvmField val INHERITANCE_GIFT = of("inheritance_gift")

            @JvmField val INVESTMENT = of("investment")

            @JvmField val LEGAL_SETTLEMENT = of("legal_settlement")

            @JvmField val LOTTERY = of("lottery")

            @JvmField val REAL_ESTATE = of("real_estate")

            @JvmField val RETIRED = of("retired")

            @JvmField val RETIREMENT = of("retirement")

            @JvmField val SALARY = of("salary")

            @JvmField val SELF_EMPLOYED = of("self_employed")

            @JvmField val SENIOR_EXECUTIVE = of("senior_executive")

            @JvmField val TRUST_INCOME = of("trust_income")

            @JvmStatic fun of(value: String) = SourceOfFunds(JsonField.of(value))
        }

        enum class Known {
            ALIMONY,
            ANNUITY,
            BUSINESS_OWNER,
            GENERAL_EMPLOYEE,
            GOVERNMENT_BENEFITS,
            HOMEMAKER,
            INHERITANCE_GIFT,
            INVESTMENT,
            LEGAL_SETTLEMENT,
            LOTTERY,
            REAL_ESTATE,
            RETIRED,
            RETIREMENT,
            SALARY,
            SELF_EMPLOYED,
            SENIOR_EXECUTIVE,
            TRUST_INCOME,
        }

        enum class Value {
            ALIMONY,
            ANNUITY,
            BUSINESS_OWNER,
            GENERAL_EMPLOYEE,
            GOVERNMENT_BENEFITS,
            HOMEMAKER,
            INHERITANCE_GIFT,
            INVESTMENT,
            LEGAL_SETTLEMENT,
            LOTTERY,
            REAL_ESTATE,
            RETIRED,
            RETIREMENT,
            SALARY,
            SELF_EMPLOYED,
            SENIOR_EXECUTIVE,
            TRUST_INCOME,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ALIMONY -> Value.ALIMONY
                ANNUITY -> Value.ANNUITY
                BUSINESS_OWNER -> Value.BUSINESS_OWNER
                GENERAL_EMPLOYEE -> Value.GENERAL_EMPLOYEE
                GOVERNMENT_BENEFITS -> Value.GOVERNMENT_BENEFITS
                HOMEMAKER -> Value.HOMEMAKER
                INHERITANCE_GIFT -> Value.INHERITANCE_GIFT
                INVESTMENT -> Value.INVESTMENT
                LEGAL_SETTLEMENT -> Value.LEGAL_SETTLEMENT
                LOTTERY -> Value.LOTTERY
                REAL_ESTATE -> Value.REAL_ESTATE
                RETIRED -> Value.RETIRED
                RETIREMENT -> Value.RETIREMENT
                SALARY -> Value.SALARY
                SELF_EMPLOYED -> Value.SELF_EMPLOYED
                SENIOR_EXECUTIVE -> Value.SENIOR_EXECUTIVE
                TRUST_INCOME -> Value.TRUST_INCOME
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ALIMONY -> Known.ALIMONY
                ANNUITY -> Known.ANNUITY
                BUSINESS_OWNER -> Known.BUSINESS_OWNER
                GENERAL_EMPLOYEE -> Known.GENERAL_EMPLOYEE
                GOVERNMENT_BENEFITS -> Known.GOVERNMENT_BENEFITS
                HOMEMAKER -> Known.HOMEMAKER
                INHERITANCE_GIFT -> Known.INHERITANCE_GIFT
                INVESTMENT -> Known.INVESTMENT
                LEGAL_SETTLEMENT -> Known.LEGAL_SETTLEMENT
                LOTTERY -> Known.LOTTERY
                REAL_ESTATE -> Known.REAL_ESTATE
                RETIRED -> Known.RETIRED
                RETIREMENT -> Known.RETIREMENT
                SALARY -> Known.SALARY
                SELF_EMPLOYED -> Known.SELF_EMPLOYED
                SENIOR_EXECUTIVE -> Known.SENIOR_EXECUTIVE
                TRUST_INCOME -> Known.TRUST_INCOME
                else -> throw ModernTreasuryInvalidDataException("Unknown SourceOfFunds: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SourceOfFunds && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class WealthSource
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val BUSINESS_SALE = of("business_sale")

            @JvmField val FAMILY_SUPPORT = of("family_support")

            @JvmField val GOVERNMENT_BENEFITS = of("government_benefits")

            @JvmField val INHERITANCE = of("inheritance")

            @JvmField val INVESTMENTS = of("investments")

            @JvmField val OTHER = of("other")

            @JvmField val RENTAL_INCOME = of("rental_income")

            @JvmField val RETIREMENT = of("retirement")

            @JvmField val SALARY = of("salary")

            @JvmField val SELF_EMPLOYED = of("self_employed")

            @JvmStatic fun of(value: String) = WealthSource(JsonField.of(value))
        }

        enum class Known {
            BUSINESS_SALE,
            FAMILY_SUPPORT,
            GOVERNMENT_BENEFITS,
            INHERITANCE,
            INVESTMENTS,
            OTHER,
            RENTAL_INCOME,
            RETIREMENT,
            SALARY,
            SELF_EMPLOYED,
        }

        enum class Value {
            BUSINESS_SALE,
            FAMILY_SUPPORT,
            GOVERNMENT_BENEFITS,
            INHERITANCE,
            INVESTMENTS,
            OTHER,
            RENTAL_INCOME,
            RETIREMENT,
            SALARY,
            SELF_EMPLOYED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                BUSINESS_SALE -> Value.BUSINESS_SALE
                FAMILY_SUPPORT -> Value.FAMILY_SUPPORT
                GOVERNMENT_BENEFITS -> Value.GOVERNMENT_BENEFITS
                INHERITANCE -> Value.INHERITANCE
                INVESTMENTS -> Value.INVESTMENTS
                OTHER -> Value.OTHER
                RENTAL_INCOME -> Value.RENTAL_INCOME
                RETIREMENT -> Value.RETIREMENT
                SALARY -> Value.SALARY
                SELF_EMPLOYED -> Value.SELF_EMPLOYED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                BUSINESS_SALE -> Known.BUSINESS_SALE
                FAMILY_SUPPORT -> Known.FAMILY_SUPPORT
                GOVERNMENT_BENEFITS -> Known.GOVERNMENT_BENEFITS
                INHERITANCE -> Known.INHERITANCE
                INVESTMENTS -> Known.INVESTMENTS
                OTHER -> Known.OTHER
                RENTAL_INCOME -> Known.RENTAL_INCOME
                RETIREMENT -> Known.RETIREMENT
                SALARY -> Known.SALARY
                SELF_EMPLOYED -> Known.SELF_EMPLOYED
                else -> throw ModernTreasuryInvalidDataException("Unknown WealthSource: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is WealthSource && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is WealthAndEmploymentDetails && id == other.id && annualIncome == other.annualIncome && createdAt == other.createdAt && discardedAt == other.discardedAt && employerCountry == other.employerCountry && employerName == other.employerName && employerState == other.employerState && employmentStatus == other.employmentStatus && incomeCountry == other.incomeCountry && incomeSource == other.incomeSource && incomeState == other.incomeState && industry == other.industry && liveMode == other.liveMode && object_ == other.object_ && occupation == other.occupation && sourceOfFunds == other.sourceOfFunds && updatedAt == other.updatedAt && wealthSource == other.wealthSource && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, annualIncome, createdAt, discardedAt, employerCountry, employerName, employerState, employmentStatus, incomeCountry, incomeSource, incomeState, industry, liveMode, object_, occupation, sourceOfFunds, updatedAt, wealthSource, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WealthAndEmploymentDetails{id=$id, annualIncome=$annualIncome, createdAt=$createdAt, discardedAt=$discardedAt, employerCountry=$employerCountry, employerName=$employerName, employerState=$employerState, employmentStatus=$employmentStatus, incomeCountry=$incomeCountry, incomeSource=$incomeSource, incomeState=$incomeState, industry=$industry, liveMode=$liveMode, object_=$object_, occupation=$occupation, sourceOfFunds=$sourceOfFunds, updatedAt=$updatedAt, wealthSource=$wealthSource, additionalProperties=$additionalProperties}"
}
