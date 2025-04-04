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
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class WealthAndEmploymentDetails
private constructor(
    private val id: JsonField<String>,
    private val annualIncome: JsonField<Long>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val discardedAt: JsonField<OffsetDateTime>,
    private val employerCountry: JsonField<String>,
    private val employerName: JsonField<String>,
    private val employerState: JsonField<String>,
    private val employmentStatus: JsonField<EmploymentStatus>,
    private val incomeCountry: JsonField<String>,
    private val incomeSource: JsonField<IncomeSource>,
    private val incomeState: JsonField<String>,
    private val industry: JsonField<Industry>,
    private val liveMode: JsonField<Boolean>,
    private val object_: JsonField<String>,
    private val occupation: JsonField<Occupation>,
    private val sourceOfFunds: JsonField<SourceOfFunds>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val wealthSource: JsonField<WealthSource>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("annual_income")
        @ExcludeMissing
        annualIncome: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("discarded_at")
        @ExcludeMissing
        discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("employer_country")
        @ExcludeMissing
        employerCountry: JsonField<String> = JsonMissing.of(),
        @JsonProperty("employer_name")
        @ExcludeMissing
        employerName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("employer_state")
        @ExcludeMissing
        employerState: JsonField<String> = JsonMissing.of(),
        @JsonProperty("employment_status")
        @ExcludeMissing
        employmentStatus: JsonField<EmploymentStatus> = JsonMissing.of(),
        @JsonProperty("income_country")
        @ExcludeMissing
        incomeCountry: JsonField<String> = JsonMissing.of(),
        @JsonProperty("income_source")
        @ExcludeMissing
        incomeSource: JsonField<IncomeSource> = JsonMissing.of(),
        @JsonProperty("income_state")
        @ExcludeMissing
        incomeState: JsonField<String> = JsonMissing.of(),
        @JsonProperty("industry") @ExcludeMissing industry: JsonField<Industry> = JsonMissing.of(),
        @JsonProperty("live_mode") @ExcludeMissing liveMode: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("object") @ExcludeMissing object_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("occupation")
        @ExcludeMissing
        occupation: JsonField<Occupation> = JsonMissing.of(),
        @JsonProperty("source_of_funds")
        @ExcludeMissing
        sourceOfFunds: JsonField<SourceOfFunds> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("wealth_source")
        @ExcludeMissing
        wealthSource: JsonField<WealthSource> = JsonMissing.of(),
    ) : this(
        id,
        annualIncome,
        createdAt,
        discardedAt,
        employerCountry,
        employerName,
        employerState,
        employmentStatus,
        incomeCountry,
        incomeSource,
        incomeState,
        industry,
        liveMode,
        object_,
        occupation,
        sourceOfFunds,
        updatedAt,
        wealthSource,
        mutableMapOf(),
    )

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The annual income of the individual.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun annualIncome(): Optional<Long> = annualIncome.getOptional("annual_income")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun discardedAt(): Optional<OffsetDateTime> = discardedAt.getOptional("discarded_at")

    /**
     * The country in which the employer is located.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun employerCountry(): Optional<String> = employerCountry.getOptional("employer_country")

    /**
     * The name of the employer.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun employerName(): Optional<String> = employerName.getOptional("employer_name")

    /**
     * The state in which the employer is located.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun employerState(): Optional<String> = employerState.getOptional("employer_state")

    /**
     * The employment status of the individual.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun employmentStatus(): Optional<EmploymentStatus> =
        employmentStatus.getOptional("employment_status")

    /**
     * The country in which the individual's income is earned.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun incomeCountry(): Optional<String> = incomeCountry.getOptional("income_country")

    /**
     * The source of the individual's income.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun incomeSource(): Optional<IncomeSource> = incomeSource.getOptional("income_source")

    /**
     * The state in which the individual's income is earned.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun incomeState(): Optional<String> = incomeState.getOptional("income_state")

    /**
     * The industry of the individual.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun industry(): Optional<Industry> = industry.getOptional("industry")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun object_(): String = object_.getRequired("object")

    /**
     * The occupation of the individual.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun occupation(): Optional<Occupation> = occupation.getOptional("occupation")

    /**
     * The source of the individual's funds.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun sourceOfFunds(): Optional<SourceOfFunds> = sourceOfFunds.getOptional("source_of_funds")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * The source of the individual's wealth.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun wealthSource(): Optional<WealthSource> = wealthSource.getOptional("wealth_source")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [annualIncome].
     *
     * Unlike [annualIncome], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("annual_income")
    @ExcludeMissing
    fun _annualIncome(): JsonField<Long> = annualIncome

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [discardedAt].
     *
     * Unlike [discardedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("discarded_at")
    @ExcludeMissing
    fun _discardedAt(): JsonField<OffsetDateTime> = discardedAt

    /**
     * Returns the raw JSON value of [employerCountry].
     *
     * Unlike [employerCountry], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("employer_country")
    @ExcludeMissing
    fun _employerCountry(): JsonField<String> = employerCountry

    /**
     * Returns the raw JSON value of [employerName].
     *
     * Unlike [employerName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("employer_name")
    @ExcludeMissing
    fun _employerName(): JsonField<String> = employerName

    /**
     * Returns the raw JSON value of [employerState].
     *
     * Unlike [employerState], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("employer_state")
    @ExcludeMissing
    fun _employerState(): JsonField<String> = employerState

    /**
     * Returns the raw JSON value of [employmentStatus].
     *
     * Unlike [employmentStatus], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("employment_status")
    @ExcludeMissing
    fun _employmentStatus(): JsonField<EmploymentStatus> = employmentStatus

    /**
     * Returns the raw JSON value of [incomeCountry].
     *
     * Unlike [incomeCountry], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("income_country")
    @ExcludeMissing
    fun _incomeCountry(): JsonField<String> = incomeCountry

    /**
     * Returns the raw JSON value of [incomeSource].
     *
     * Unlike [incomeSource], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("income_source")
    @ExcludeMissing
    fun _incomeSource(): JsonField<IncomeSource> = incomeSource

    /**
     * Returns the raw JSON value of [incomeState].
     *
     * Unlike [incomeState], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("income_state")
    @ExcludeMissing
    fun _incomeState(): JsonField<String> = incomeState

    /**
     * Returns the raw JSON value of [industry].
     *
     * Unlike [industry], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("industry") @ExcludeMissing fun _industry(): JsonField<Industry> = industry

    /**
     * Returns the raw JSON value of [liveMode].
     *
     * Unlike [liveMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

    /**
     * Returns the raw JSON value of [object_].
     *
     * Unlike [object_], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

    /**
     * Returns the raw JSON value of [occupation].
     *
     * Unlike [occupation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("occupation")
    @ExcludeMissing
    fun _occupation(): JsonField<Occupation> = occupation

    /**
     * Returns the raw JSON value of [sourceOfFunds].
     *
     * Unlike [sourceOfFunds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source_of_funds")
    @ExcludeMissing
    fun _sourceOfFunds(): JsonField<SourceOfFunds> = sourceOfFunds

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [wealthSource].
     *
     * Unlike [wealthSource], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("wealth_source")
    @ExcludeMissing
    fun _wealthSource(): JsonField<WealthSource> = wealthSource

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [WealthAndEmploymentDetails].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .annualIncome()
         * .createdAt()
         * .discardedAt()
         * .employerCountry()
         * .employerName()
         * .employerState()
         * .employmentStatus()
         * .incomeCountry()
         * .incomeSource()
         * .incomeState()
         * .industry()
         * .liveMode()
         * .object_()
         * .occupation()
         * .sourceOfFunds()
         * .updatedAt()
         * .wealthSource()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WealthAndEmploymentDetails]. */
    class Builder internal constructor() {

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

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The annual income of the individual. */
        fun annualIncome(annualIncome: Long?) = annualIncome(JsonField.ofNullable(annualIncome))

        /**
         * Alias for [Builder.annualIncome].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun annualIncome(annualIncome: Long) = annualIncome(annualIncome as Long?)

        /** Alias for calling [Builder.annualIncome] with `annualIncome.orElse(null)`. */
        fun annualIncome(annualIncome: Optional<Long>) = annualIncome(annualIncome.getOrNull())

        /**
         * Sets [Builder.annualIncome] to an arbitrary JSON value.
         *
         * You should usually call [Builder.annualIncome] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun annualIncome(annualIncome: JsonField<Long>) = apply { this.annualIncome = annualIncome }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun discardedAt(discardedAt: OffsetDateTime?) =
            discardedAt(JsonField.ofNullable(discardedAt))

        /** Alias for calling [Builder.discardedAt] with `discardedAt.orElse(null)`. */
        fun discardedAt(discardedAt: Optional<OffsetDateTime>) =
            discardedAt(discardedAt.getOrNull())

        /**
         * Sets [Builder.discardedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discardedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
            this.discardedAt = discardedAt
        }

        /** The country in which the employer is located. */
        fun employerCountry(employerCountry: String?) =
            employerCountry(JsonField.ofNullable(employerCountry))

        /** Alias for calling [Builder.employerCountry] with `employerCountry.orElse(null)`. */
        fun employerCountry(employerCountry: Optional<String>) =
            employerCountry(employerCountry.getOrNull())

        /**
         * Sets [Builder.employerCountry] to an arbitrary JSON value.
         *
         * You should usually call [Builder.employerCountry] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun employerCountry(employerCountry: JsonField<String>) = apply {
            this.employerCountry = employerCountry
        }

        /** The name of the employer. */
        fun employerName(employerName: String?) = employerName(JsonField.ofNullable(employerName))

        /** Alias for calling [Builder.employerName] with `employerName.orElse(null)`. */
        fun employerName(employerName: Optional<String>) = employerName(employerName.getOrNull())

        /**
         * Sets [Builder.employerName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.employerName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun employerName(employerName: JsonField<String>) = apply {
            this.employerName = employerName
        }

        /** The state in which the employer is located. */
        fun employerState(employerState: String?) =
            employerState(JsonField.ofNullable(employerState))

        /** Alias for calling [Builder.employerState] with `employerState.orElse(null)`. */
        fun employerState(employerState: Optional<String>) =
            employerState(employerState.getOrNull())

        /**
         * Sets [Builder.employerState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.employerState] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun employerState(employerState: JsonField<String>) = apply {
            this.employerState = employerState
        }

        /** The employment status of the individual. */
        fun employmentStatus(employmentStatus: EmploymentStatus?) =
            employmentStatus(JsonField.ofNullable(employmentStatus))

        /** Alias for calling [Builder.employmentStatus] with `employmentStatus.orElse(null)`. */
        fun employmentStatus(employmentStatus: Optional<EmploymentStatus>) =
            employmentStatus(employmentStatus.getOrNull())

        /**
         * Sets [Builder.employmentStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.employmentStatus] with a well-typed [EmploymentStatus]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun employmentStatus(employmentStatus: JsonField<EmploymentStatus>) = apply {
            this.employmentStatus = employmentStatus
        }

        /** The country in which the individual's income is earned. */
        fun incomeCountry(incomeCountry: String?) =
            incomeCountry(JsonField.ofNullable(incomeCountry))

        /** Alias for calling [Builder.incomeCountry] with `incomeCountry.orElse(null)`. */
        fun incomeCountry(incomeCountry: Optional<String>) =
            incomeCountry(incomeCountry.getOrNull())

        /**
         * Sets [Builder.incomeCountry] to an arbitrary JSON value.
         *
         * You should usually call [Builder.incomeCountry] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun incomeCountry(incomeCountry: JsonField<String>) = apply {
            this.incomeCountry = incomeCountry
        }

        /** The source of the individual's income. */
        fun incomeSource(incomeSource: IncomeSource?) =
            incomeSource(JsonField.ofNullable(incomeSource))

        /** Alias for calling [Builder.incomeSource] with `incomeSource.orElse(null)`. */
        fun incomeSource(incomeSource: Optional<IncomeSource>) =
            incomeSource(incomeSource.getOrNull())

        /**
         * Sets [Builder.incomeSource] to an arbitrary JSON value.
         *
         * You should usually call [Builder.incomeSource] with a well-typed [IncomeSource] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun incomeSource(incomeSource: JsonField<IncomeSource>) = apply {
            this.incomeSource = incomeSource
        }

        /** The state in which the individual's income is earned. */
        fun incomeState(incomeState: String?) = incomeState(JsonField.ofNullable(incomeState))

        /** Alias for calling [Builder.incomeState] with `incomeState.orElse(null)`. */
        fun incomeState(incomeState: Optional<String>) = incomeState(incomeState.getOrNull())

        /**
         * Sets [Builder.incomeState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.incomeState] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun incomeState(incomeState: JsonField<String>) = apply { this.incomeState = incomeState }

        /** The industry of the individual. */
        fun industry(industry: Industry?) = industry(JsonField.ofNullable(industry))

        /** Alias for calling [Builder.industry] with `industry.orElse(null)`. */
        fun industry(industry: Optional<Industry>) = industry(industry.getOrNull())

        /**
         * Sets [Builder.industry] to an arbitrary JSON value.
         *
         * You should usually call [Builder.industry] with a well-typed [Industry] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun industry(industry: JsonField<Industry>) = apply { this.industry = industry }

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

        /**
         * Sets [Builder.liveMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.liveMode] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

        fun object_(object_: String) = object_(JsonField.of(object_))

        /**
         * Sets [Builder.object_] to an arbitrary JSON value.
         *
         * You should usually call [Builder.object_] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        /** The occupation of the individual. */
        fun occupation(occupation: Occupation?) = occupation(JsonField.ofNullable(occupation))

        /** Alias for calling [Builder.occupation] with `occupation.orElse(null)`. */
        fun occupation(occupation: Optional<Occupation>) = occupation(occupation.getOrNull())

        /**
         * Sets [Builder.occupation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.occupation] with a well-typed [Occupation] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun occupation(occupation: JsonField<Occupation>) = apply { this.occupation = occupation }

        /** The source of the individual's funds. */
        fun sourceOfFunds(sourceOfFunds: SourceOfFunds?) =
            sourceOfFunds(JsonField.ofNullable(sourceOfFunds))

        /** Alias for calling [Builder.sourceOfFunds] with `sourceOfFunds.orElse(null)`. */
        fun sourceOfFunds(sourceOfFunds: Optional<SourceOfFunds>) =
            sourceOfFunds(sourceOfFunds.getOrNull())

        /**
         * Sets [Builder.sourceOfFunds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceOfFunds] with a well-typed [SourceOfFunds] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sourceOfFunds(sourceOfFunds: JsonField<SourceOfFunds>) = apply {
            this.sourceOfFunds = sourceOfFunds
        }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** The source of the individual's wealth. */
        fun wealthSource(wealthSource: WealthSource?) =
            wealthSource(JsonField.ofNullable(wealthSource))

        /** Alias for calling [Builder.wealthSource] with `wealthSource.orElse(null)`. */
        fun wealthSource(wealthSource: Optional<WealthSource>) =
            wealthSource(wealthSource.getOrNull())

        /**
         * Sets [Builder.wealthSource] to an arbitrary JSON value.
         *
         * You should usually call [Builder.wealthSource] with a well-typed [WealthSource] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
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

        /**
         * Returns an immutable instance of [WealthAndEmploymentDetails].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .annualIncome()
         * .createdAt()
         * .discardedAt()
         * .employerCountry()
         * .employerName()
         * .employerState()
         * .employmentStatus()
         * .incomeCountry()
         * .incomeSource()
         * .incomeState()
         * .industry()
         * .liveMode()
         * .object_()
         * .occupation()
         * .sourceOfFunds()
         * .updatedAt()
         * .wealthSource()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WealthAndEmploymentDetails =
            WealthAndEmploymentDetails(
                checkRequired("id", id),
                checkRequired("annualIncome", annualIncome),
                checkRequired("createdAt", createdAt),
                checkRequired("discardedAt", discardedAt),
                checkRequired("employerCountry", employerCountry),
                checkRequired("employerName", employerName),
                checkRequired("employerState", employerState),
                checkRequired("employmentStatus", employmentStatus),
                checkRequired("incomeCountry", incomeCountry),
                checkRequired("incomeSource", incomeSource),
                checkRequired("incomeState", incomeState),
                checkRequired("industry", industry),
                checkRequired("liveMode", liveMode),
                checkRequired("object_", object_),
                checkRequired("occupation", occupation),
                checkRequired("sourceOfFunds", sourceOfFunds),
                checkRequired("updatedAt", updatedAt),
                checkRequired("wealthSource", wealthSource),
                additionalProperties.toMutableMap(),
            )
    }

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
        employmentStatus().ifPresent { it.validate() }
        incomeCountry()
        incomeSource().ifPresent { it.validate() }
        incomeState()
        industry().ifPresent { it.validate() }
        liveMode()
        object_()
        occupation().ifPresent { it.validate() }
        sourceOfFunds().ifPresent { it.validate() }
        updatedAt()
        wealthSource().ifPresent { it.validate() }
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: ModernTreasuryInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (annualIncome.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (discardedAt.asKnown().isPresent) 1 else 0) +
            (if (employerCountry.asKnown().isPresent) 1 else 0) +
            (if (employerName.asKnown().isPresent) 1 else 0) +
            (if (employerState.asKnown().isPresent) 1 else 0) +
            (employmentStatus.asKnown().getOrNull()?.validity() ?: 0) +
            (if (incomeCountry.asKnown().isPresent) 1 else 0) +
            (incomeSource.asKnown().getOrNull()?.validity() ?: 0) +
            (if (incomeState.asKnown().isPresent) 1 else 0) +
            (industry.asKnown().getOrNull()?.validity() ?: 0) +
            (if (liveMode.asKnown().isPresent) 1 else 0) +
            (if (object_.asKnown().isPresent) 1 else 0) +
            (occupation.asKnown().getOrNull()?.validity() ?: 0) +
            (sourceOfFunds.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (wealthSource.asKnown().getOrNull()?.validity() ?: 0)

    /** The employment status of the individual. */
    class EmploymentStatus @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val EMPLOYED = of("employed")

            @JvmField val RETIRED = of("retired")

            @JvmField val SELF_EMPLOYED = of("self_employed")

            @JvmField val STUDENT = of("student")

            @JvmField val UNEMPLOYED = of("unemployed")

            @JvmStatic fun of(value: String) = EmploymentStatus(JsonField.of(value))
        }

        /** An enum containing [EmploymentStatus]'s known values. */
        enum class Known {
            EMPLOYED,
            RETIRED,
            SELF_EMPLOYED,
            STUDENT,
            UNEMPLOYED,
        }

        /**
         * An enum containing [EmploymentStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EmploymentStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            EMPLOYED,
            RETIRED,
            SELF_EMPLOYED,
            STUDENT,
            UNEMPLOYED,
            /**
             * An enum member indicating that [EmploymentStatus] was instantiated with an unknown
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
                EMPLOYED -> Value.EMPLOYED
                RETIRED -> Value.RETIRED
                SELF_EMPLOYED -> Value.SELF_EMPLOYED
                STUDENT -> Value.STUDENT
                UNEMPLOYED -> Value.UNEMPLOYED
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
                EMPLOYED -> Known.EMPLOYED
                RETIRED -> Known.RETIRED
                SELF_EMPLOYED -> Known.SELF_EMPLOYED
                STUDENT -> Known.STUDENT
                UNEMPLOYED -> Known.UNEMPLOYED
                else -> throw ModernTreasuryInvalidDataException("Unknown EmploymentStatus: $value")
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

        private var validated: Boolean = false

        fun validate(): EmploymentStatus = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: ModernTreasuryInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is EmploymentStatus && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The source of the individual's income. */
    class IncomeSource @JsonCreator private constructor(private val value: JsonField<String>) :
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

        /** An enum containing [IncomeSource]'s known values. */
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

        /**
         * An enum containing [IncomeSource]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [IncomeSource] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FAMILY_SUPPORT,
            GOVERNMENT_BENEFITS,
            INHERITANCE,
            INVESTMENTS,
            RENTAL_INCOME,
            RETIREMENT,
            SALARY,
            SELF_EMPLOYED,
            /**
             * An enum member indicating that [IncomeSource] was instantiated with an unknown value.
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

        private var validated: Boolean = false

        fun validate(): IncomeSource = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: ModernTreasuryInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is IncomeSource && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The industry of the individual. */
    class Industry @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

        /** An enum containing [Industry]'s known values. */
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

        /**
         * An enum containing [Industry]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Industry] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
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
            /** An enum member indicating that [Industry] was instantiated with an unknown value. */
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

        private var validated: Boolean = false

        fun validate(): Industry = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: ModernTreasuryInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Industry && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The occupation of the individual. */
    class Occupation @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

        /** An enum containing [Occupation]'s known values. */
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

        /**
         * An enum containing [Occupation]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Occupation] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
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
            /**
             * An enum member indicating that [Occupation] was instantiated with an unknown value.
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

        private var validated: Boolean = false

        fun validate(): Occupation = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: ModernTreasuryInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Occupation && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The source of the individual's funds. */
    class SourceOfFunds @JsonCreator private constructor(private val value: JsonField<String>) :
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

        /** An enum containing [SourceOfFunds]'s known values. */
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

        /**
         * An enum containing [SourceOfFunds]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SourceOfFunds] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
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
            /**
             * An enum member indicating that [SourceOfFunds] was instantiated with an unknown
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

        private var validated: Boolean = false

        fun validate(): SourceOfFunds = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: ModernTreasuryInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SourceOfFunds && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The source of the individual's wealth. */
    class WealthSource @JsonCreator private constructor(private val value: JsonField<String>) :
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

        /** An enum containing [WealthSource]'s known values. */
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

        /**
         * An enum containing [WealthSource]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [WealthSource] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
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
            /**
             * An enum member indicating that [WealthSource] was instantiated with an unknown value.
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

        private var validated: Boolean = false

        fun validate(): WealthSource = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: ModernTreasuryInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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
