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
import com.moderntreasury.api.core.Params
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create a return. */
class ReturnCreateParams
private constructor(
    private val body: ReturnCreateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The ID of the object being returned or `null`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun returnableId(): Optional<String> = body.returnableId()

    /**
     * The type of object being returned. Currently, this may only be incoming_payment_detail.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun returnableType(): ReturnableType = body.returnableType()

    /**
     * Some returns may include additional information from the bank. In these cases, this string
     * will be present.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun additionalInformation(): Optional<String> = body.additionalInformation()

    /**
     * The return code. For ACH returns, this is the required ACH return code.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun code(): Optional<Code> = body.code()

    /** The raw data from the return file that we get from the bank. */
    fun _data(): JsonValue = body._data()

    /**
     * If the return code is `R14` or `R15` this is the date the deceased counterparty passed away.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun dateOfDeath(): Optional<LocalDate> = body.dateOfDeath()

    /**
     * An optional description of the reason for the return. This is for internal usage and will not
     * be transmitted to the bank.”
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun reason(): Optional<String> = body.reason()

    /**
     * Returns the raw JSON value of [returnableId].
     *
     * Unlike [returnableId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _returnableId(): JsonField<String> = body._returnableId()

    /**
     * Returns the raw JSON value of [returnableType].
     *
     * Unlike [returnableType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _returnableType(): JsonField<ReturnableType> = body._returnableType()

    /**
     * Returns the raw JSON value of [additionalInformation].
     *
     * Unlike [additionalInformation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _additionalInformation(): JsonField<String> = body._additionalInformation()

    /**
     * Returns the raw JSON value of [code].
     *
     * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _code(): JsonField<Code> = body._code()

    /**
     * Returns the raw JSON value of [dateOfDeath].
     *
     * Unlike [dateOfDeath], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dateOfDeath(): JsonField<LocalDate> = body._dateOfDeath()

    /**
     * Returns the raw JSON value of [reason].
     *
     * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _reason(): JsonField<String> = body._reason()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ReturnCreateParams].
         *
         * The following fields are required:
         * ```java
         * .returnableId()
         * .returnableType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ReturnCreateParams]. */
    class Builder internal constructor() {

        private var body: ReturnCreateRequest.Builder = ReturnCreateRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(returnCreateParams: ReturnCreateParams) = apply {
            body = returnCreateParams.body.toBuilder()
            additionalHeaders = returnCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = returnCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [returnableId]
         * - [returnableType]
         * - [additionalInformation]
         * - [code]
         * - [data]
         * - etc.
         */
        fun body(body: ReturnCreateRequest) = apply { this.body = body.toBuilder() }

        /** The ID of the object being returned or `null`. */
        fun returnableId(returnableId: String?) = apply { body.returnableId(returnableId) }

        /** Alias for calling [Builder.returnableId] with `returnableId.orElse(null)`. */
        fun returnableId(returnableId: Optional<String>) = returnableId(returnableId.getOrNull())

        /**
         * Sets [Builder.returnableId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.returnableId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun returnableId(returnableId: JsonField<String>) = apply {
            body.returnableId(returnableId)
        }

        /**
         * The type of object being returned. Currently, this may only be incoming_payment_detail.
         */
        fun returnableType(returnableType: ReturnableType) = apply {
            body.returnableType(returnableType)
        }

        /**
         * Sets [Builder.returnableType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.returnableType] with a well-typed [ReturnableType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun returnableType(returnableType: JsonField<ReturnableType>) = apply {
            body.returnableType(returnableType)
        }

        /**
         * Some returns may include additional information from the bank. In these cases, this
         * string will be present.
         */
        fun additionalInformation(additionalInformation: String?) = apply {
            body.additionalInformation(additionalInformation)
        }

        /**
         * Alias for calling [Builder.additionalInformation] with
         * `additionalInformation.orElse(null)`.
         */
        fun additionalInformation(additionalInformation: Optional<String>) =
            additionalInformation(additionalInformation.getOrNull())

        /**
         * Sets [Builder.additionalInformation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.additionalInformation] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun additionalInformation(additionalInformation: JsonField<String>) = apply {
            body.additionalInformation(additionalInformation)
        }

        /** The return code. For ACH returns, this is the required ACH return code. */
        fun code(code: Code?) = apply { body.code(code) }

        /** Alias for calling [Builder.code] with `code.orElse(null)`. */
        fun code(code: Optional<Code>) = code(code.getOrNull())

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [Code] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<Code>) = apply { body.code(code) }

        /** The raw data from the return file that we get from the bank. */
        fun data(data: JsonValue) = apply { body.data(data) }

        /**
         * If the return code is `R14` or `R15` this is the date the deceased counterparty passed
         * away.
         */
        fun dateOfDeath(dateOfDeath: LocalDate?) = apply { body.dateOfDeath(dateOfDeath) }

        /** Alias for calling [Builder.dateOfDeath] with `dateOfDeath.orElse(null)`. */
        fun dateOfDeath(dateOfDeath: Optional<LocalDate>) = dateOfDeath(dateOfDeath.getOrNull())

        /**
         * Sets [Builder.dateOfDeath] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateOfDeath] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dateOfDeath(dateOfDeath: JsonField<LocalDate>) = apply { body.dateOfDeath(dateOfDeath) }

        /**
         * An optional description of the reason for the return. This is for internal usage and will
         * not be transmitted to the bank.”
         */
        fun reason(reason: String?) = apply { body.reason(reason) }

        /** Alias for calling [Builder.reason] with `reason.orElse(null)`. */
        fun reason(reason: Optional<String>) = reason(reason.getOrNull())

        /**
         * Sets [Builder.reason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reason] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reason(reason: JsonField<String>) = apply { body.reason(reason) }

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

        /**
         * Returns an immutable instance of [ReturnCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .returnableId()
         * .returnableType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ReturnCreateParams =
            ReturnCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): ReturnCreateRequest = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class ReturnCreateRequest
    private constructor(
        private val returnableId: JsonField<String>,
        private val returnableType: JsonField<ReturnableType>,
        private val additionalInformation: JsonField<String>,
        private val code: JsonField<Code>,
        private val data: JsonValue,
        private val dateOfDeath: JsonField<LocalDate>,
        private val reason: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("returnable_id")
            @ExcludeMissing
            returnableId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("returnable_type")
            @ExcludeMissing
            returnableType: JsonField<ReturnableType> = JsonMissing.of(),
            @JsonProperty("additional_information")
            @ExcludeMissing
            additionalInformation: JsonField<String> = JsonMissing.of(),
            @JsonProperty("code") @ExcludeMissing code: JsonField<Code> = JsonMissing.of(),
            @JsonProperty("data") @ExcludeMissing data: JsonValue = JsonMissing.of(),
            @JsonProperty("date_of_death")
            @ExcludeMissing
            dateOfDeath: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
        ) : this(
            returnableId,
            returnableType,
            additionalInformation,
            code,
            data,
            dateOfDeath,
            reason,
            mutableMapOf(),
        )

        /**
         * The ID of the object being returned or `null`.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun returnableId(): Optional<String> = returnableId.getOptional("returnable_id")

        /**
         * The type of object being returned. Currently, this may only be incoming_payment_detail.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun returnableType(): ReturnableType = returnableType.getRequired("returnable_type")

        /**
         * Some returns may include additional information from the bank. In these cases, this
         * string will be present.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun additionalInformation(): Optional<String> =
            additionalInformation.getOptional("additional_information")

        /**
         * The return code. For ACH returns, this is the required ACH return code.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun code(): Optional<Code> = code.getOptional("code")

        /** The raw data from the return file that we get from the bank. */
        @JsonProperty("data") @ExcludeMissing fun _data(): JsonValue = data

        /**
         * If the return code is `R14` or `R15` this is the date the deceased counterparty passed
         * away.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun dateOfDeath(): Optional<LocalDate> = dateOfDeath.getOptional("date_of_death")

        /**
         * An optional description of the reason for the return. This is for internal usage and will
         * not be transmitted to the bank.”
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun reason(): Optional<String> = reason.getOptional("reason")

        /**
         * Returns the raw JSON value of [returnableId].
         *
         * Unlike [returnableId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("returnable_id")
        @ExcludeMissing
        fun _returnableId(): JsonField<String> = returnableId

        /**
         * Returns the raw JSON value of [returnableType].
         *
         * Unlike [returnableType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("returnable_type")
        @ExcludeMissing
        fun _returnableType(): JsonField<ReturnableType> = returnableType

        /**
         * Returns the raw JSON value of [additionalInformation].
         *
         * Unlike [additionalInformation], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("additional_information")
        @ExcludeMissing
        fun _additionalInformation(): JsonField<String> = additionalInformation

        /**
         * Returns the raw JSON value of [code].
         *
         * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<Code> = code

        /**
         * Returns the raw JSON value of [dateOfDeath].
         *
         * Unlike [dateOfDeath], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("date_of_death")
        @ExcludeMissing
        fun _dateOfDeath(): JsonField<LocalDate> = dateOfDeath

        /**
         * Returns the raw JSON value of [reason].
         *
         * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

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
             * Returns a mutable builder for constructing an instance of [ReturnCreateRequest].
             *
             * The following fields are required:
             * ```java
             * .returnableId()
             * .returnableType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ReturnCreateRequest]. */
        class Builder internal constructor() {

            private var returnableId: JsonField<String>? = null
            private var returnableType: JsonField<ReturnableType>? = null
            private var additionalInformation: JsonField<String> = JsonMissing.of()
            private var code: JsonField<Code> = JsonMissing.of()
            private var data: JsonValue = JsonMissing.of()
            private var dateOfDeath: JsonField<LocalDate> = JsonMissing.of()
            private var reason: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(returnCreateRequest: ReturnCreateRequest) = apply {
                returnableId = returnCreateRequest.returnableId
                returnableType = returnCreateRequest.returnableType
                additionalInformation = returnCreateRequest.additionalInformation
                code = returnCreateRequest.code
                data = returnCreateRequest.data
                dateOfDeath = returnCreateRequest.dateOfDeath
                reason = returnCreateRequest.reason
                additionalProperties = returnCreateRequest.additionalProperties.toMutableMap()
            }

            /** The ID of the object being returned or `null`. */
            fun returnableId(returnableId: String?) =
                returnableId(JsonField.ofNullable(returnableId))

            /** Alias for calling [Builder.returnableId] with `returnableId.orElse(null)`. */
            fun returnableId(returnableId: Optional<String>) =
                returnableId(returnableId.getOrNull())

            /**
             * Sets [Builder.returnableId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.returnableId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun returnableId(returnableId: JsonField<String>) = apply {
                this.returnableId = returnableId
            }

            /**
             * The type of object being returned. Currently, this may only be
             * incoming_payment_detail.
             */
            fun returnableType(returnableType: ReturnableType) =
                returnableType(JsonField.of(returnableType))

            /**
             * Sets [Builder.returnableType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.returnableType] with a well-typed [ReturnableType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun returnableType(returnableType: JsonField<ReturnableType>) = apply {
                this.returnableType = returnableType
            }

            /**
             * Some returns may include additional information from the bank. In these cases, this
             * string will be present.
             */
            fun additionalInformation(additionalInformation: String?) =
                additionalInformation(JsonField.ofNullable(additionalInformation))

            /**
             * Alias for calling [Builder.additionalInformation] with
             * `additionalInformation.orElse(null)`.
             */
            fun additionalInformation(additionalInformation: Optional<String>) =
                additionalInformation(additionalInformation.getOrNull())

            /**
             * Sets [Builder.additionalInformation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.additionalInformation] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun additionalInformation(additionalInformation: JsonField<String>) = apply {
                this.additionalInformation = additionalInformation
            }

            /** The return code. For ACH returns, this is the required ACH return code. */
            fun code(code: Code?) = code(JsonField.ofNullable(code))

            /** Alias for calling [Builder.code] with `code.orElse(null)`. */
            fun code(code: Optional<Code>) = code(code.getOrNull())

            /**
             * Sets [Builder.code] to an arbitrary JSON value.
             *
             * You should usually call [Builder.code] with a well-typed [Code] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun code(code: JsonField<Code>) = apply { this.code = code }

            /** The raw data from the return file that we get from the bank. */
            fun data(data: JsonValue) = apply { this.data = data }

            /**
             * If the return code is `R14` or `R15` this is the date the deceased counterparty
             * passed away.
             */
            fun dateOfDeath(dateOfDeath: LocalDate?) =
                dateOfDeath(JsonField.ofNullable(dateOfDeath))

            /** Alias for calling [Builder.dateOfDeath] with `dateOfDeath.orElse(null)`. */
            fun dateOfDeath(dateOfDeath: Optional<LocalDate>) = dateOfDeath(dateOfDeath.getOrNull())

            /**
             * Sets [Builder.dateOfDeath] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dateOfDeath] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dateOfDeath(dateOfDeath: JsonField<LocalDate>) = apply {
                this.dateOfDeath = dateOfDeath
            }

            /**
             * An optional description of the reason for the return. This is for internal usage and
             * will not be transmitted to the bank.”
             */
            fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

            /** Alias for calling [Builder.reason] with `reason.orElse(null)`. */
            fun reason(reason: Optional<String>) = reason(reason.getOrNull())

            /**
             * Sets [Builder.reason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reason] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reason(reason: JsonField<String>) = apply { this.reason = reason }

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
             * Returns an immutable instance of [ReturnCreateRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .returnableId()
             * .returnableType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ReturnCreateRequest =
                ReturnCreateRequest(
                    checkRequired("returnableId", returnableId),
                    checkRequired("returnableType", returnableType),
                    additionalInformation,
                    code,
                    data,
                    dateOfDeath,
                    reason,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ReturnCreateRequest = apply {
            if (validated) {
                return@apply
            }

            returnableId()
            returnableType().validate()
            additionalInformation()
            code().ifPresent { it.validate() }
            dateOfDeath()
            reason()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (returnableId.asKnown().isPresent) 1 else 0) +
                (returnableType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (additionalInformation.asKnown().isPresent) 1 else 0) +
                (code.asKnown().getOrNull()?.validity() ?: 0) +
                (if (dateOfDeath.asKnown().isPresent) 1 else 0) +
                (if (reason.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ReturnCreateRequest && returnableId == other.returnableId && returnableType == other.returnableType && additionalInformation == other.additionalInformation && code == other.code && data == other.data && dateOfDeath == other.dateOfDeath && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(returnableId, returnableType, additionalInformation, code, data, dateOfDeath, reason, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ReturnCreateRequest{returnableId=$returnableId, returnableType=$returnableType, additionalInformation=$additionalInformation, code=$code, data=$data, dateOfDeath=$dateOfDeath, reason=$reason, additionalProperties=$additionalProperties}"
    }

    /** The type of object being returned. Currently, this may only be incoming_payment_detail. */
    class ReturnableType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val INCOMING_PAYMENT_DETAIL = of("incoming_payment_detail")

            @JvmStatic fun of(value: String) = ReturnableType(JsonField.of(value))
        }

        /** An enum containing [ReturnableType]'s known values. */
        enum class Known {
            INCOMING_PAYMENT_DETAIL
        }

        /**
         * An enum containing [ReturnableType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ReturnableType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INCOMING_PAYMENT_DETAIL,
            /**
             * An enum member indicating that [ReturnableType] was instantiated with an unknown
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
                INCOMING_PAYMENT_DETAIL -> Value.INCOMING_PAYMENT_DETAIL
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
                INCOMING_PAYMENT_DETAIL -> Known.INCOMING_PAYMENT_DETAIL
                else -> throw ModernTreasuryInvalidDataException("Unknown ReturnableType: $value")
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

        fun validate(): ReturnableType = apply {
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

            return /* spotless:off */ other is ReturnableType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The return code. For ACH returns, this is the required ACH return code. */
    class Code @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val _901 = of("901")

            @JvmField val _902 = of("902")

            @JvmField val _903 = of("903")

            @JvmField val _904 = of("904")

            @JvmField val _905 = of("905")

            @JvmField val _907 = of("907")

            @JvmField val _908 = of("908")

            @JvmField val _909 = of("909")

            @JvmField val _910 = of("910")

            @JvmField val _911 = of("911")

            @JvmField val _912 = of("912")

            @JvmField val _914 = of("914")

            @JvmField val C01 = of("C01")

            @JvmField val C02 = of("C02")

            @JvmField val C03 = of("C03")

            @JvmField val C05 = of("C05")

            @JvmField val C06 = of("C06")

            @JvmField val C07 = of("C07")

            @JvmField val C08 = of("C08")

            @JvmField val C09 = of("C09")

            @JvmField val C13 = of("C13")

            @JvmField val C14 = of("C14")

            @JvmField val R01 = of("R01")

            @JvmField val R02 = of("R02")

            @JvmField val R03 = of("R03")

            @JvmField val R04 = of("R04")

            @JvmField val R05 = of("R05")

            @JvmField val R06 = of("R06")

            @JvmField val R07 = of("R07")

            @JvmField val R08 = of("R08")

            @JvmField val R09 = of("R09")

            @JvmField val R10 = of("R10")

            @JvmField val R11 = of("R11")

            @JvmField val R12 = of("R12")

            @JvmField val R13 = of("R13")

            @JvmField val R14 = of("R14")

            @JvmField val R15 = of("R15")

            @JvmField val R16 = of("R16")

            @JvmField val R17 = of("R17")

            @JvmField val R18 = of("R18")

            @JvmField val R19 = of("R19")

            @JvmField val R20 = of("R20")

            @JvmField val R21 = of("R21")

            @JvmField val R22 = of("R22")

            @JvmField val R23 = of("R23")

            @JvmField val R24 = of("R24")

            @JvmField val R25 = of("R25")

            @JvmField val R26 = of("R26")

            @JvmField val R27 = of("R27")

            @JvmField val R28 = of("R28")

            @JvmField val R29 = of("R29")

            @JvmField val R30 = of("R30")

            @JvmField val R31 = of("R31")

            @JvmField val R32 = of("R32")

            @JvmField val R33 = of("R33")

            @JvmField val R34 = of("R34")

            @JvmField val R35 = of("R35")

            @JvmField val R36 = of("R36")

            @JvmField val R37 = of("R37")

            @JvmField val R38 = of("R38")

            @JvmField val R39 = of("R39")

            @JvmField val R40 = of("R40")

            @JvmField val R41 = of("R41")

            @JvmField val R42 = of("R42")

            @JvmField val R43 = of("R43")

            @JvmField val R44 = of("R44")

            @JvmField val R45 = of("R45")

            @JvmField val R46 = of("R46")

            @JvmField val R47 = of("R47")

            @JvmField val R50 = of("R50")

            @JvmField val R51 = of("R51")

            @JvmField val R52 = of("R52")

            @JvmField val R53 = of("R53")

            @JvmField val R61 = of("R61")

            @JvmField val R62 = of("R62")

            @JvmField val R67 = of("R67")

            @JvmField val R68 = of("R68")

            @JvmField val R69 = of("R69")

            @JvmField val R70 = of("R70")

            @JvmField val R71 = of("R71")

            @JvmField val R72 = of("R72")

            @JvmField val R73 = of("R73")

            @JvmField val R74 = of("R74")

            @JvmField val R75 = of("R75")

            @JvmField val R76 = of("R76")

            @JvmField val R77 = of("R77")

            @JvmField val R80 = of("R80")

            @JvmField val R81 = of("R81")

            @JvmField val R82 = of("R82")

            @JvmField val R83 = of("R83")

            @JvmField val R84 = of("R84")

            @JvmField val R85 = of("R85")

            @JvmField val CURRENCYCLOUD = of("currencycloud")

            @JvmStatic fun of(value: String) = Code(JsonField.of(value))
        }

        /** An enum containing [Code]'s known values. */
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
            R13,
            R14,
            R15,
            R16,
            R17,
            R18,
            R19,
            R20,
            R21,
            R22,
            R23,
            R24,
            R25,
            R26,
            R27,
            R28,
            R29,
            R30,
            R31,
            R32,
            R33,
            R34,
            R35,
            R36,
            R37,
            R38,
            R39,
            R40,
            R41,
            R42,
            R43,
            R44,
            R45,
            R46,
            R47,
            R50,
            R51,
            R52,
            R53,
            R61,
            R62,
            R67,
            R68,
            R69,
            R70,
            R71,
            R72,
            R73,
            R74,
            R75,
            R76,
            R77,
            R80,
            R81,
            R82,
            R83,
            R84,
            R85,
            CURRENCYCLOUD,
        }

        /**
         * An enum containing [Code]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Code] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
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
            R13,
            R14,
            R15,
            R16,
            R17,
            R18,
            R19,
            R20,
            R21,
            R22,
            R23,
            R24,
            R25,
            R26,
            R27,
            R28,
            R29,
            R30,
            R31,
            R32,
            R33,
            R34,
            R35,
            R36,
            R37,
            R38,
            R39,
            R40,
            R41,
            R42,
            R43,
            R44,
            R45,
            R46,
            R47,
            R50,
            R51,
            R52,
            R53,
            R61,
            R62,
            R67,
            R68,
            R69,
            R70,
            R71,
            R72,
            R73,
            R74,
            R75,
            R76,
            R77,
            R80,
            R81,
            R82,
            R83,
            R84,
            R85,
            CURRENCYCLOUD,
            /** An enum member indicating that [Code] was instantiated with an unknown value. */
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
                R13 -> Value.R13
                R14 -> Value.R14
                R15 -> Value.R15
                R16 -> Value.R16
                R17 -> Value.R17
                R18 -> Value.R18
                R19 -> Value.R19
                R20 -> Value.R20
                R21 -> Value.R21
                R22 -> Value.R22
                R23 -> Value.R23
                R24 -> Value.R24
                R25 -> Value.R25
                R26 -> Value.R26
                R27 -> Value.R27
                R28 -> Value.R28
                R29 -> Value.R29
                R30 -> Value.R30
                R31 -> Value.R31
                R32 -> Value.R32
                R33 -> Value.R33
                R34 -> Value.R34
                R35 -> Value.R35
                R36 -> Value.R36
                R37 -> Value.R37
                R38 -> Value.R38
                R39 -> Value.R39
                R40 -> Value.R40
                R41 -> Value.R41
                R42 -> Value.R42
                R43 -> Value.R43
                R44 -> Value.R44
                R45 -> Value.R45
                R46 -> Value.R46
                R47 -> Value.R47
                R50 -> Value.R50
                R51 -> Value.R51
                R52 -> Value.R52
                R53 -> Value.R53
                R61 -> Value.R61
                R62 -> Value.R62
                R67 -> Value.R67
                R68 -> Value.R68
                R69 -> Value.R69
                R70 -> Value.R70
                R71 -> Value.R71
                R72 -> Value.R72
                R73 -> Value.R73
                R74 -> Value.R74
                R75 -> Value.R75
                R76 -> Value.R76
                R77 -> Value.R77
                R80 -> Value.R80
                R81 -> Value.R81
                R82 -> Value.R82
                R83 -> Value.R83
                R84 -> Value.R84
                R85 -> Value.R85
                CURRENCYCLOUD -> Value.CURRENCYCLOUD
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
                R13 -> Known.R13
                R14 -> Known.R14
                R15 -> Known.R15
                R16 -> Known.R16
                R17 -> Known.R17
                R18 -> Known.R18
                R19 -> Known.R19
                R20 -> Known.R20
                R21 -> Known.R21
                R22 -> Known.R22
                R23 -> Known.R23
                R24 -> Known.R24
                R25 -> Known.R25
                R26 -> Known.R26
                R27 -> Known.R27
                R28 -> Known.R28
                R29 -> Known.R29
                R30 -> Known.R30
                R31 -> Known.R31
                R32 -> Known.R32
                R33 -> Known.R33
                R34 -> Known.R34
                R35 -> Known.R35
                R36 -> Known.R36
                R37 -> Known.R37
                R38 -> Known.R38
                R39 -> Known.R39
                R40 -> Known.R40
                R41 -> Known.R41
                R42 -> Known.R42
                R43 -> Known.R43
                R44 -> Known.R44
                R45 -> Known.R45
                R46 -> Known.R46
                R47 -> Known.R47
                R50 -> Known.R50
                R51 -> Known.R51
                R52 -> Known.R52
                R53 -> Known.R53
                R61 -> Known.R61
                R62 -> Known.R62
                R67 -> Known.R67
                R68 -> Known.R68
                R69 -> Known.R69
                R70 -> Known.R70
                R71 -> Known.R71
                R72 -> Known.R72
                R73 -> Known.R73
                R74 -> Known.R74
                R75 -> Known.R75
                R76 -> Known.R76
                R77 -> Known.R77
                R80 -> Known.R80
                R81 -> Known.R81
                R82 -> Known.R82
                R83 -> Known.R83
                R84 -> Known.R84
                R85 -> Known.R85
                CURRENCYCLOUD -> Known.CURRENCYCLOUD
                else -> throw ModernTreasuryInvalidDataException("Unknown Code: $value")
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

        fun validate(): Code = apply {
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

            return /* spotless:off */ other is Code && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ReturnCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ReturnCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
