// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.Params
import com.moderntreasury.api.core.checkKnown
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** create ledger_event_handler */
class LedgerEventHandlerCreateParams
private constructor(
    private val body: LedgerEventHandlerCreateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun ledgerTransactionTemplate(): LedgerEventHandlerLedgerTransactionTemplate =
        body.ledgerTransactionTemplate()

    /**
     * Name of the ledger event handler.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun conditions(): Optional<LedgerEventHandlerConditions> = body.conditions()

    /**
     * An optional description.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * The id of the ledger that this account belongs to.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ledgerId(): Optional<String> = body.ledgerId()

    /**
     * Additional data represented as key-value pairs. Both the key and value must be strings.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = body.metadata()

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun variables(): Optional<LedgerEventHandlerVariables> = body.variables()

    /**
     * Returns the raw JSON value of [ledgerTransactionTemplate].
     *
     * Unlike [ledgerTransactionTemplate], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @Deprecated("deprecated")
    fun _ledgerTransactionTemplate(): JsonField<LedgerEventHandlerLedgerTransactionTemplate> =
        body._ledgerTransactionTemplate()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [conditions].
     *
     * Unlike [conditions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
    fun _conditions(): JsonField<LedgerEventHandlerConditions> = body._conditions()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [ledgerId].
     *
     * Unlike [ledgerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _ledgerId(): JsonField<String> = body._ledgerId()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [variables].
     *
     * Unlike [variables], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
    fun _variables(): JsonField<LedgerEventHandlerVariables> = body._variables()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): LedgerEventHandlerCreateRequest = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class LedgerEventHandlerCreateRequest
    @JsonCreator
    private constructor(
        @JsonProperty("ledger_transaction_template")
        @ExcludeMissing
        private val ledgerTransactionTemplate:
            JsonField<LedgerEventHandlerLedgerTransactionTemplate> =
            JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("conditions")
        @ExcludeMissing
        private val conditions: JsonField<LedgerEventHandlerConditions> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ledger_id")
        @ExcludeMissing
        private val ledgerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("variables")
        @ExcludeMissing
        private val variables: JsonField<LedgerEventHandlerVariables> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun ledgerTransactionTemplate(): LedgerEventHandlerLedgerTransactionTemplate =
            ledgerTransactionTemplate.getRequired("ledger_transaction_template")

        /**
         * Name of the ledger event handler.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun conditions(): Optional<LedgerEventHandlerConditions> =
            Optional.ofNullable(conditions.getNullable("conditions"))

        /**
         * An optional description.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /**
         * The id of the ledger that this account belongs to.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun ledgerId(): Optional<String> = Optional.ofNullable(ledgerId.getNullable("ledger_id"))

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata.getNullable("metadata"))

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun variables(): Optional<LedgerEventHandlerVariables> =
            Optional.ofNullable(variables.getNullable("variables"))

        /**
         * Returns the raw JSON value of [ledgerTransactionTemplate].
         *
         * Unlike [ledgerTransactionTemplate], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @Deprecated("deprecated")
        @JsonProperty("ledger_transaction_template")
        @ExcludeMissing
        fun _ledgerTransactionTemplate(): JsonField<LedgerEventHandlerLedgerTransactionTemplate> =
            ledgerTransactionTemplate

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [conditions].
         *
         * Unlike [conditions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @Deprecated("deprecated")
        @JsonProperty("conditions")
        @ExcludeMissing
        fun _conditions(): JsonField<LedgerEventHandlerConditions> = conditions

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [ledgerId].
         *
         * Unlike [ledgerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ledger_id") @ExcludeMissing fun _ledgerId(): JsonField<String> = ledgerId

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [variables].
         *
         * Unlike [variables], this method doesn't throw if the JSON field has an unexpected type.
         */
        @Deprecated("deprecated")
        @JsonProperty("variables")
        @ExcludeMissing
        fun _variables(): JsonField<LedgerEventHandlerVariables> = variables

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): LedgerEventHandlerCreateRequest = apply {
            if (validated) {
                return@apply
            }

            ledgerTransactionTemplate().validate()
            name()
            conditions().ifPresent { it.validate() }
            description()
            ledgerId()
            metadata().ifPresent { it.validate() }
            variables().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [LedgerEventHandlerCreateRequest].
             *
             * The following fields are required:
             * ```java
             * .ledgerTransactionTemplate()
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [LedgerEventHandlerCreateRequest]. */
        class Builder internal constructor() {

            private var ledgerTransactionTemplate:
                JsonField<LedgerEventHandlerLedgerTransactionTemplate>? =
                null
            private var name: JsonField<String>? = null
            private var conditions: JsonField<LedgerEventHandlerConditions> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var ledgerId: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var variables: JsonField<LedgerEventHandlerVariables> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(ledgerEventHandlerCreateRequest: LedgerEventHandlerCreateRequest) =
                apply {
                    ledgerTransactionTemplate =
                        ledgerEventHandlerCreateRequest.ledgerTransactionTemplate
                    name = ledgerEventHandlerCreateRequest.name
                    conditions = ledgerEventHandlerCreateRequest.conditions
                    description = ledgerEventHandlerCreateRequest.description
                    ledgerId = ledgerEventHandlerCreateRequest.ledgerId
                    metadata = ledgerEventHandlerCreateRequest.metadata
                    variables = ledgerEventHandlerCreateRequest.variables
                    additionalProperties =
                        ledgerEventHandlerCreateRequest.additionalProperties.toMutableMap()
                }

            @Deprecated("deprecated")
            fun ledgerTransactionTemplate(
                ledgerTransactionTemplate: LedgerEventHandlerLedgerTransactionTemplate
            ) = ledgerTransactionTemplate(JsonField.of(ledgerTransactionTemplate))

            /**
             * Sets [Builder.ledgerTransactionTemplate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ledgerTransactionTemplate] with a well-typed
             * [LedgerEventHandlerLedgerTransactionTemplate] value instead. This method is primarily
             * for setting the field to an undocumented or not yet supported value.
             */
            @Deprecated("deprecated")
            fun ledgerTransactionTemplate(
                ledgerTransactionTemplate: JsonField<LedgerEventHandlerLedgerTransactionTemplate>
            ) = apply { this.ledgerTransactionTemplate = ledgerTransactionTemplate }

            /** Name of the ledger event handler. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            @Deprecated("deprecated")
            fun conditions(conditions: LedgerEventHandlerConditions?) =
                conditions(JsonField.ofNullable(conditions))

            /** Alias for calling [Builder.conditions] with `conditions.orElse(null)`. */
            @Deprecated("deprecated")
            fun conditions(conditions: Optional<LedgerEventHandlerConditions>) =
                conditions(conditions.getOrNull())

            /**
             * Sets [Builder.conditions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.conditions] with a well-typed
             * [LedgerEventHandlerConditions] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            @Deprecated("deprecated")
            fun conditions(conditions: JsonField<LedgerEventHandlerConditions>) = apply {
                this.conditions = conditions
            }

            /** An optional description. */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Alias for calling [Builder.description] with `description.orElse(null)`. */
            fun description(description: Optional<String>) = description(description.getOrNull())

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** The id of the ledger that this account belongs to. */
            fun ledgerId(ledgerId: String) = ledgerId(JsonField.of(ledgerId))

            /**
             * Sets [Builder.ledgerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ledgerId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ledgerId(ledgerId: JsonField<String>) = apply { this.ledgerId = ledgerId }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

            /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
            fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            @Deprecated("deprecated")
            fun variables(variables: LedgerEventHandlerVariables?) =
                variables(JsonField.ofNullable(variables))

            /** Alias for calling [Builder.variables] with `variables.orElse(null)`. */
            @Deprecated("deprecated")
            fun variables(variables: Optional<LedgerEventHandlerVariables>) =
                variables(variables.getOrNull())

            /**
             * Sets [Builder.variables] to an arbitrary JSON value.
             *
             * You should usually call [Builder.variables] with a well-typed
             * [LedgerEventHandlerVariables] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            @Deprecated("deprecated")
            fun variables(variables: JsonField<LedgerEventHandlerVariables>) = apply {
                this.variables = variables
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

            fun build(): LedgerEventHandlerCreateRequest =
                LedgerEventHandlerCreateRequest(
                    checkRequired("ledgerTransactionTemplate", ledgerTransactionTemplate),
                    checkRequired("name", name),
                    conditions,
                    description,
                    ledgerId,
                    metadata,
                    variables,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LedgerEventHandlerCreateRequest && ledgerTransactionTemplate == other.ledgerTransactionTemplate && name == other.name && conditions == other.conditions && description == other.description && ledgerId == other.ledgerId && metadata == other.metadata && variables == other.variables && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(ledgerTransactionTemplate, name, conditions, description, ledgerId, metadata, variables, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LedgerEventHandlerCreateRequest{ledgerTransactionTemplate=$ledgerTransactionTemplate, name=$name, conditions=$conditions, description=$description, ledgerId=$ledgerId, metadata=$metadata, variables=$variables, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [LedgerEventHandlerCreateParams].
         *
         * The following fields are required:
         * ```java
         * .ledgerTransactionTemplate()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LedgerEventHandlerCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: LedgerEventHandlerCreateRequest.Builder =
            LedgerEventHandlerCreateRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(ledgerEventHandlerCreateParams: LedgerEventHandlerCreateParams) = apply {
            body = ledgerEventHandlerCreateParams.body.toBuilder()
            additionalHeaders = ledgerEventHandlerCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = ledgerEventHandlerCreateParams.additionalQueryParams.toBuilder()
        }

        @Deprecated("deprecated")
        fun ledgerTransactionTemplate(
            ledgerTransactionTemplate: LedgerEventHandlerLedgerTransactionTemplate
        ) = apply { body.ledgerTransactionTemplate(ledgerTransactionTemplate) }

        /**
         * Sets [Builder.ledgerTransactionTemplate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ledgerTransactionTemplate] with a well-typed
         * [LedgerEventHandlerLedgerTransactionTemplate] value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        @Deprecated("deprecated")
        fun ledgerTransactionTemplate(
            ledgerTransactionTemplate: JsonField<LedgerEventHandlerLedgerTransactionTemplate>
        ) = apply { body.ledgerTransactionTemplate(ledgerTransactionTemplate) }

        /** Name of the ledger event handler. */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        @Deprecated("deprecated")
        fun conditions(conditions: LedgerEventHandlerConditions?) = apply {
            body.conditions(conditions)
        }

        /** Alias for calling [Builder.conditions] with `conditions.orElse(null)`. */
        @Deprecated("deprecated")
        fun conditions(conditions: Optional<LedgerEventHandlerConditions>) =
            conditions(conditions.getOrNull())

        /**
         * Sets [Builder.conditions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conditions] with a well-typed
         * [LedgerEventHandlerConditions] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        @Deprecated("deprecated")
        fun conditions(conditions: JsonField<LedgerEventHandlerConditions>) = apply {
            body.conditions(conditions)
        }

        /** An optional description. */
        fun description(description: String?) = apply { body.description(description) }

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** The id of the ledger that this account belongs to. */
        fun ledgerId(ledgerId: String) = apply { body.ledgerId(ledgerId) }

        /**
         * Sets [Builder.ledgerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ledgerId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ledgerId(ledgerId: JsonField<String>) = apply { body.ledgerId(ledgerId) }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata?) = apply { body.metadata(metadata) }

        /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
        fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        @Deprecated("deprecated")
        fun variables(variables: LedgerEventHandlerVariables?) = apply { body.variables(variables) }

        /** Alias for calling [Builder.variables] with `variables.orElse(null)`. */
        @Deprecated("deprecated")
        fun variables(variables: Optional<LedgerEventHandlerVariables>) =
            variables(variables.getOrNull())

        /**
         * Sets [Builder.variables] to an arbitrary JSON value.
         *
         * You should usually call [Builder.variables] with a well-typed
         * [LedgerEventHandlerVariables] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        @Deprecated("deprecated")
        fun variables(variables: JsonField<LedgerEventHandlerVariables>) = apply {
            body.variables(variables)
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

        fun build(): LedgerEventHandlerCreateParams =
            LedgerEventHandlerCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @Deprecated("deprecated")
    @NoAutoDetect
    class LedgerEventHandlerLedgerTransactionTemplate
    @JsonCreator
    private constructor(
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("effective_at")
        @ExcludeMissing
        private val effectiveAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ledger_entries")
        @ExcludeMissing
        private val ledgerEntries: JsonField<List<LedgerEventHandlerLedgerEntries>> =
            JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        private val status: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * An optional description for internal use.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /**
         * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
         * purposes.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun effectiveAt(): Optional<String> =
            Optional.ofNullable(effectiveAt.getNullable("effective_at"))

        /**
         * An array of ledger entry objects.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun ledgerEntries(): List<LedgerEventHandlerLedgerEntries> =
            ledgerEntries.getRequired("ledger_entries")

        /**
         * To post a ledger transaction at creation, use `posted`.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun status(): Optional<String> = Optional.ofNullable(status.getNullable("status"))

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [effectiveAt].
         *
         * Unlike [effectiveAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("effective_at")
        @ExcludeMissing
        fun _effectiveAt(): JsonField<String> = effectiveAt

        /**
         * Returns the raw JSON value of [ledgerEntries].
         *
         * Unlike [ledgerEntries], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ledger_entries")
        @ExcludeMissing
        fun _ledgerEntries(): JsonField<List<LedgerEventHandlerLedgerEntries>> = ledgerEntries

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): LedgerEventHandlerLedgerTransactionTemplate = apply {
            if (validated) {
                return@apply
            }

            description()
            effectiveAt()
            ledgerEntries().forEach { it.validate() }
            status()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [LedgerEventHandlerLedgerTransactionTemplate].
             *
             * The following fields are required:
             * ```java
             * .description()
             * .effectiveAt()
             * .ledgerEntries()
             * .status()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [LedgerEventHandlerLedgerTransactionTemplate]. */
        class Builder internal constructor() {

            private var description: JsonField<String>? = null
            private var effectiveAt: JsonField<String>? = null
            private var ledgerEntries: JsonField<MutableList<LedgerEventHandlerLedgerEntries>>? =
                null
            private var status: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                ledgerEventHandlerLedgerTransactionTemplate:
                    LedgerEventHandlerLedgerTransactionTemplate
            ) = apply {
                description = ledgerEventHandlerLedgerTransactionTemplate.description
                effectiveAt = ledgerEventHandlerLedgerTransactionTemplate.effectiveAt
                ledgerEntries =
                    ledgerEventHandlerLedgerTransactionTemplate.ledgerEntries.map {
                        it.toMutableList()
                    }
                status = ledgerEventHandlerLedgerTransactionTemplate.status
                additionalProperties =
                    ledgerEventHandlerLedgerTransactionTemplate.additionalProperties.toMutableMap()
            }

            /** An optional description for internal use. */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Alias for calling [Builder.description] with `description.orElse(null)`. */
            fun description(description: Optional<String>) = description(description.getOrNull())

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
             * purposes.
             */
            fun effectiveAt(effectiveAt: String?) = effectiveAt(JsonField.ofNullable(effectiveAt))

            /** Alias for calling [Builder.effectiveAt] with `effectiveAt.orElse(null)`. */
            fun effectiveAt(effectiveAt: Optional<String>) = effectiveAt(effectiveAt.getOrNull())

            /**
             * Sets [Builder.effectiveAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.effectiveAt] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun effectiveAt(effectiveAt: JsonField<String>) = apply {
                this.effectiveAt = effectiveAt
            }

            /** An array of ledger entry objects. */
            fun ledgerEntries(ledgerEntries: List<LedgerEventHandlerLedgerEntries>) =
                ledgerEntries(JsonField.of(ledgerEntries))

            /**
             * Sets [Builder.ledgerEntries] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ledgerEntries] with a well-typed
             * `List<LedgerEventHandlerLedgerEntries>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun ledgerEntries(ledgerEntries: JsonField<List<LedgerEventHandlerLedgerEntries>>) =
                apply {
                    this.ledgerEntries = ledgerEntries.map { it.toMutableList() }
                }

            /**
             * Adds a single [LedgerEventHandlerLedgerEntries] to [ledgerEntries].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addLedgerEntry(ledgerEntry: LedgerEventHandlerLedgerEntries) = apply {
                ledgerEntries =
                    (ledgerEntries ?: JsonField.of(mutableListOf())).also {
                        checkKnown("ledgerEntries", it).add(ledgerEntry)
                    }
            }

            /** To post a ledger transaction at creation, use `posted`. */
            fun status(status: String?) = status(JsonField.ofNullable(status))

            /** Alias for calling [Builder.status] with `status.orElse(null)`. */
            fun status(status: Optional<String>) = status(status.getOrNull())

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<String>) = apply { this.status = status }

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

            fun build(): LedgerEventHandlerLedgerTransactionTemplate =
                LedgerEventHandlerLedgerTransactionTemplate(
                    checkRequired("description", description),
                    checkRequired("effectiveAt", effectiveAt),
                    checkRequired("ledgerEntries", ledgerEntries).map { it.toImmutable() },
                    checkRequired("status", status),
                    additionalProperties.toImmutable(),
                )
        }

        @Deprecated("deprecated")
        @NoAutoDetect
        class LedgerEventHandlerLedgerEntries
        @JsonCreator
        private constructor(
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("direction")
            @ExcludeMissing
            private val direction: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ledger_account_id")
            @ExcludeMissing
            private val ledgerAccountId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * The LHS of the conditional.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): String = amount.getRequired("amount")

            /**
             * What the operator between the `field` and `value` is.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun direction(): String = direction.getRequired("direction")

            /**
             * The RHS of the conditional.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun ledgerAccountId(): String = ledgerAccountId.getRequired("ledger_account_id")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

            /**
             * Returns the raw JSON value of [direction].
             *
             * Unlike [direction], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("direction")
            @ExcludeMissing
            fun _direction(): JsonField<String> = direction

            /**
             * Returns the raw JSON value of [ledgerAccountId].
             *
             * Unlike [ledgerAccountId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("ledger_account_id")
            @ExcludeMissing
            fun _ledgerAccountId(): JsonField<String> = ledgerAccountId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): LedgerEventHandlerLedgerEntries = apply {
                if (validated) {
                    return@apply
                }

                amount()
                direction()
                ledgerAccountId()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [LedgerEventHandlerLedgerEntries].
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .direction()
                 * .ledgerAccountId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [LedgerEventHandlerLedgerEntries]. */
            class Builder internal constructor() {

                private var amount: JsonField<String>? = null
                private var direction: JsonField<String>? = null
                private var ledgerAccountId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    ledgerEventHandlerLedgerEntries: LedgerEventHandlerLedgerEntries
                ) = apply {
                    amount = ledgerEventHandlerLedgerEntries.amount
                    direction = ledgerEventHandlerLedgerEntries.direction
                    ledgerAccountId = ledgerEventHandlerLedgerEntries.ledgerAccountId
                    additionalProperties =
                        ledgerEventHandlerLedgerEntries.additionalProperties.toMutableMap()
                }

                /** The LHS of the conditional. */
                fun amount(amount: String) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                /** What the operator between the `field` and `value` is. */
                fun direction(direction: String) = direction(JsonField.of(direction))

                /**
                 * Sets [Builder.direction] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.direction] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun direction(direction: JsonField<String>) = apply { this.direction = direction }

                /** The RHS of the conditional. */
                fun ledgerAccountId(ledgerAccountId: String) =
                    ledgerAccountId(JsonField.of(ledgerAccountId))

                /**
                 * Sets [Builder.ledgerAccountId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ledgerAccountId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun ledgerAccountId(ledgerAccountId: JsonField<String>) = apply {
                    this.ledgerAccountId = ledgerAccountId
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

                fun build(): LedgerEventHandlerLedgerEntries =
                    LedgerEventHandlerLedgerEntries(
                        checkRequired("amount", amount),
                        checkRequired("direction", direction),
                        checkRequired("ledgerAccountId", ledgerAccountId),
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is LedgerEventHandlerLedgerEntries && amount == other.amount && direction == other.direction && ledgerAccountId == other.ledgerAccountId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, direction, ledgerAccountId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LedgerEventHandlerLedgerEntries{amount=$amount, direction=$direction, ledgerAccountId=$ledgerAccountId, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LedgerEventHandlerLedgerTransactionTemplate && description == other.description && effectiveAt == other.effectiveAt && ledgerEntries == other.ledgerEntries && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(description, effectiveAt, ledgerEntries, status, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LedgerEventHandlerLedgerTransactionTemplate{description=$description, effectiveAt=$effectiveAt, ledgerEntries=$ledgerEntries, status=$status, additionalProperties=$additionalProperties}"
    }

    @Deprecated("deprecated")
    @NoAutoDetect
    class LedgerEventHandlerConditions
    @JsonCreator
    private constructor(
        @JsonProperty("field")
        @ExcludeMissing
        private val field: JsonField<String> = JsonMissing.of(),
        @JsonProperty("operator")
        @ExcludeMissing
        private val operator: JsonField<String> = JsonMissing.of(),
        @JsonProperty("value")
        @ExcludeMissing
        private val value: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The LHS of the conditional.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun field(): String = field.getRequired("field")

        /**
         * What the operator between the `field` and `value` is.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun operator(): String = operator.getRequired("operator")

        /**
         * The RHS of the conditional.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun value(): String = value.getRequired("value")

        /**
         * Returns the raw JSON value of [field].
         *
         * Unlike [field], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("field") @ExcludeMissing fun _field(): JsonField<String> = field

        /**
         * Returns the raw JSON value of [operator].
         *
         * Unlike [operator], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("operator") @ExcludeMissing fun _operator(): JsonField<String> = operator

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): LedgerEventHandlerConditions = apply {
            if (validated) {
                return@apply
            }

            field()
            operator()
            value()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [LedgerEventHandlerConditions].
             *
             * The following fields are required:
             * ```java
             * .field()
             * .operator()
             * .value()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [LedgerEventHandlerConditions]. */
        class Builder internal constructor() {

            private var field: JsonField<String>? = null
            private var operator: JsonField<String>? = null
            private var value: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(ledgerEventHandlerConditions: LedgerEventHandlerConditions) = apply {
                field = ledgerEventHandlerConditions.field
                operator = ledgerEventHandlerConditions.operator
                value = ledgerEventHandlerConditions.value
                additionalProperties =
                    ledgerEventHandlerConditions.additionalProperties.toMutableMap()
            }

            /** The LHS of the conditional. */
            fun field(field: String) = field(JsonField.of(field))

            /**
             * Sets [Builder.field] to an arbitrary JSON value.
             *
             * You should usually call [Builder.field] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun field(field: JsonField<String>) = apply { this.field = field }

            /** What the operator between the `field` and `value` is. */
            fun operator(operator: String) = operator(JsonField.of(operator))

            /**
             * Sets [Builder.operator] to an arbitrary JSON value.
             *
             * You should usually call [Builder.operator] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun operator(operator: JsonField<String>) = apply { this.operator = operator }

            /** The RHS of the conditional. */
            fun value(value: String) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun value(value: JsonField<String>) = apply { this.value = value }

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

            fun build(): LedgerEventHandlerConditions =
                LedgerEventHandlerConditions(
                    checkRequired("field", field),
                    checkRequired("operator", operator),
                    checkRequired("value", value),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LedgerEventHandlerConditions && field == other.field && operator == other.operator && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(field, operator, value, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LedgerEventHandlerConditions{field=$field, operator=$operator, value=$value, additionalProperties=$additionalProperties}"
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

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
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

    @Deprecated("deprecated")
    @NoAutoDetect
    class LedgerEventHandlerVariables
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): LedgerEventHandlerVariables = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [LedgerEventHandlerVariables].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [LedgerEventHandlerVariables]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(ledgerEventHandlerVariables: LedgerEventHandlerVariables) = apply {
                additionalProperties =
                    ledgerEventHandlerVariables.additionalProperties.toMutableMap()
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

            fun build(): LedgerEventHandlerVariables =
                LedgerEventHandlerVariables(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LedgerEventHandlerVariables && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LedgerEventHandlerVariables{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerEventHandlerCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "LedgerEventHandlerCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
