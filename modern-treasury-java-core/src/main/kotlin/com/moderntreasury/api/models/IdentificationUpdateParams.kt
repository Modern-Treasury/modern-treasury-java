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
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update an existing Identification. */
class IdentificationUpdateParams
private constructor(
    private val id: String?,
    private val body: IdentificationUpdateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * The date when the Identification is no longer considered valid by the issuing authority.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun expirationDate(): Optional<LocalDate> = body.expirationDate()

    /**
     * The ID number of identification document.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun idNumber(): Optional<String> = body.idNumber()

    /**
     * The type of ID number.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun idType(): Optional<IdType> = body.idType()

    /**
     * The ISO 3166-1 alpha-2 country code of the country that issued the identification
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun issuingCountry(): Optional<String> = body.issuingCountry()

    /**
     * The region in which the identifcation was issued.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun issuingRegion(): Optional<String> = body.issuingRegion()

    /**
     * Returns the raw JSON value of [expirationDate].
     *
     * Unlike [expirationDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _expirationDate(): JsonField<LocalDate> = body._expirationDate()

    /**
     * Returns the raw JSON value of [idNumber].
     *
     * Unlike [idNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _idNumber(): JsonField<String> = body._idNumber()

    /**
     * Returns the raw JSON value of [idType].
     *
     * Unlike [idType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _idType(): JsonField<IdType> = body._idType()

    /**
     * Returns the raw JSON value of [issuingCountry].
     *
     * Unlike [issuingCountry], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _issuingCountry(): JsonField<String> = body._issuingCountry()

    /**
     * Returns the raw JSON value of [issuingRegion].
     *
     * Unlike [issuingRegion], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _issuingRegion(): JsonField<String> = body._issuingRegion()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): IdentificationUpdateParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [IdentificationUpdateParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IdentificationUpdateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: IdentificationUpdateRequest.Builder =
            IdentificationUpdateRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(identificationUpdateParams: IdentificationUpdateParams) = apply {
            id = identificationUpdateParams.id
            body = identificationUpdateParams.body.toBuilder()
            additionalHeaders = identificationUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = identificationUpdateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [expirationDate]
         * - [idNumber]
         * - [idType]
         * - [issuingCountry]
         * - [issuingRegion]
         * - etc.
         */
        fun body(body: IdentificationUpdateRequest) = apply { this.body = body.toBuilder() }

        /**
         * The date when the Identification is no longer considered valid by the issuing authority.
         */
        fun expirationDate(expirationDate: LocalDate?) = apply {
            body.expirationDate(expirationDate)
        }

        /** Alias for calling [Builder.expirationDate] with `expirationDate.orElse(null)`. */
        fun expirationDate(expirationDate: Optional<LocalDate>) =
            expirationDate(expirationDate.getOrNull())

        /**
         * Sets [Builder.expirationDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expirationDate] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expirationDate(expirationDate: JsonField<LocalDate>) = apply {
            body.expirationDate(expirationDate)
        }

        /** The ID number of identification document. */
        fun idNumber(idNumber: String) = apply { body.idNumber(idNumber) }

        /**
         * Sets [Builder.idNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idNumber] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idNumber(idNumber: JsonField<String>) = apply { body.idNumber(idNumber) }

        /** The type of ID number. */
        fun idType(idType: IdType) = apply { body.idType(idType) }

        /**
         * Sets [Builder.idType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idType] with a well-typed [IdType] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idType(idType: JsonField<IdType>) = apply { body.idType(idType) }

        /** The ISO 3166-1 alpha-2 country code of the country that issued the identification */
        fun issuingCountry(issuingCountry: String?) = apply { body.issuingCountry(issuingCountry) }

        /** Alias for calling [Builder.issuingCountry] with `issuingCountry.orElse(null)`. */
        fun issuingCountry(issuingCountry: Optional<String>) =
            issuingCountry(issuingCountry.getOrNull())

        /**
         * Sets [Builder.issuingCountry] to an arbitrary JSON value.
         *
         * You should usually call [Builder.issuingCountry] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun issuingCountry(issuingCountry: JsonField<String>) = apply {
            body.issuingCountry(issuingCountry)
        }

        /** The region in which the identifcation was issued. */
        fun issuingRegion(issuingRegion: String?) = apply { body.issuingRegion(issuingRegion) }

        /** Alias for calling [Builder.issuingRegion] with `issuingRegion.orElse(null)`. */
        fun issuingRegion(issuingRegion: Optional<String>) =
            issuingRegion(issuingRegion.getOrNull())

        /**
         * Sets [Builder.issuingRegion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.issuingRegion] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun issuingRegion(issuingRegion: JsonField<String>) = apply {
            body.issuingRegion(issuingRegion)
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

        /**
         * Returns an immutable instance of [IdentificationUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): IdentificationUpdateParams =
            IdentificationUpdateParams(
                id,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): IdentificationUpdateRequest = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class IdentificationUpdateRequest
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val expirationDate: JsonField<LocalDate>,
        private val idNumber: JsonField<String>,
        private val idType: JsonField<IdType>,
        private val issuingCountry: JsonField<String>,
        private val issuingRegion: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("expiration_date")
            @ExcludeMissing
            expirationDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("id_number")
            @ExcludeMissing
            idNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("id_type") @ExcludeMissing idType: JsonField<IdType> = JsonMissing.of(),
            @JsonProperty("issuing_country")
            @ExcludeMissing
            issuingCountry: JsonField<String> = JsonMissing.of(),
            @JsonProperty("issuing_region")
            @ExcludeMissing
            issuingRegion: JsonField<String> = JsonMissing.of(),
        ) : this(expirationDate, idNumber, idType, issuingCountry, issuingRegion, mutableMapOf())

        /**
         * The date when the Identification is no longer considered valid by the issuing authority.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun expirationDate(): Optional<LocalDate> = expirationDate.getOptional("expiration_date")

        /**
         * The ID number of identification document.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun idNumber(): Optional<String> = idNumber.getOptional("id_number")

        /**
         * The type of ID number.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun idType(): Optional<IdType> = idType.getOptional("id_type")

        /**
         * The ISO 3166-1 alpha-2 country code of the country that issued the identification
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun issuingCountry(): Optional<String> = issuingCountry.getOptional("issuing_country")

        /**
         * The region in which the identifcation was issued.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun issuingRegion(): Optional<String> = issuingRegion.getOptional("issuing_region")

        /**
         * Returns the raw JSON value of [expirationDate].
         *
         * Unlike [expirationDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("expiration_date")
        @ExcludeMissing
        fun _expirationDate(): JsonField<LocalDate> = expirationDate

        /**
         * Returns the raw JSON value of [idNumber].
         *
         * Unlike [idNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id_number") @ExcludeMissing fun _idNumber(): JsonField<String> = idNumber

        /**
         * Returns the raw JSON value of [idType].
         *
         * Unlike [idType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id_type") @ExcludeMissing fun _idType(): JsonField<IdType> = idType

        /**
         * Returns the raw JSON value of [issuingCountry].
         *
         * Unlike [issuingCountry], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("issuing_country")
        @ExcludeMissing
        fun _issuingCountry(): JsonField<String> = issuingCountry

        /**
         * Returns the raw JSON value of [issuingRegion].
         *
         * Unlike [issuingRegion], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("issuing_region")
        @ExcludeMissing
        fun _issuingRegion(): JsonField<String> = issuingRegion

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
             * Returns a mutable builder for constructing an instance of
             * [IdentificationUpdateRequest].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [IdentificationUpdateRequest]. */
        class Builder internal constructor() {

            private var expirationDate: JsonField<LocalDate> = JsonMissing.of()
            private var idNumber: JsonField<String> = JsonMissing.of()
            private var idType: JsonField<IdType> = JsonMissing.of()
            private var issuingCountry: JsonField<String> = JsonMissing.of()
            private var issuingRegion: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(identificationUpdateRequest: IdentificationUpdateRequest) = apply {
                expirationDate = identificationUpdateRequest.expirationDate
                idNumber = identificationUpdateRequest.idNumber
                idType = identificationUpdateRequest.idType
                issuingCountry = identificationUpdateRequest.issuingCountry
                issuingRegion = identificationUpdateRequest.issuingRegion
                additionalProperties =
                    identificationUpdateRequest.additionalProperties.toMutableMap()
            }

            /**
             * The date when the Identification is no longer considered valid by the issuing
             * authority.
             */
            fun expirationDate(expirationDate: LocalDate?) =
                expirationDate(JsonField.ofNullable(expirationDate))

            /** Alias for calling [Builder.expirationDate] with `expirationDate.orElse(null)`. */
            fun expirationDate(expirationDate: Optional<LocalDate>) =
                expirationDate(expirationDate.getOrNull())

            /**
             * Sets [Builder.expirationDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expirationDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expirationDate(expirationDate: JsonField<LocalDate>) = apply {
                this.expirationDate = expirationDate
            }

            /** The ID number of identification document. */
            fun idNumber(idNumber: String) = idNumber(JsonField.of(idNumber))

            /**
             * Sets [Builder.idNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idNumber] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idNumber(idNumber: JsonField<String>) = apply { this.idNumber = idNumber }

            /** The type of ID number. */
            fun idType(idType: IdType) = idType(JsonField.of(idType))

            /**
             * Sets [Builder.idType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idType] with a well-typed [IdType] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idType(idType: JsonField<IdType>) = apply { this.idType = idType }

            /** The ISO 3166-1 alpha-2 country code of the country that issued the identification */
            fun issuingCountry(issuingCountry: String?) =
                issuingCountry(JsonField.ofNullable(issuingCountry))

            /** Alias for calling [Builder.issuingCountry] with `issuingCountry.orElse(null)`. */
            fun issuingCountry(issuingCountry: Optional<String>) =
                issuingCountry(issuingCountry.getOrNull())

            /**
             * Sets [Builder.issuingCountry] to an arbitrary JSON value.
             *
             * You should usually call [Builder.issuingCountry] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun issuingCountry(issuingCountry: JsonField<String>) = apply {
                this.issuingCountry = issuingCountry
            }

            /** The region in which the identifcation was issued. */
            fun issuingRegion(issuingRegion: String?) =
                issuingRegion(JsonField.ofNullable(issuingRegion))

            /** Alias for calling [Builder.issuingRegion] with `issuingRegion.orElse(null)`. */
            fun issuingRegion(issuingRegion: Optional<String>) =
                issuingRegion(issuingRegion.getOrNull())

            /**
             * Sets [Builder.issuingRegion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.issuingRegion] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun issuingRegion(issuingRegion: JsonField<String>) = apply {
                this.issuingRegion = issuingRegion
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
             * Returns an immutable instance of [IdentificationUpdateRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): IdentificationUpdateRequest =
                IdentificationUpdateRequest(
                    expirationDate,
                    idNumber,
                    idType,
                    issuingCountry,
                    issuingRegion,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ModernTreasuryInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): IdentificationUpdateRequest = apply {
            if (validated) {
                return@apply
            }

            expirationDate()
            idNumber()
            idType().ifPresent { it.validate() }
            issuingCountry()
            issuingRegion()
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
            (if (expirationDate.asKnown().isPresent) 1 else 0) +
                (if (idNumber.asKnown().isPresent) 1 else 0) +
                (idType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (issuingCountry.asKnown().isPresent) 1 else 0) +
                (if (issuingRegion.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is IdentificationUpdateRequest &&
                expirationDate == other.expirationDate &&
                idNumber == other.idNumber &&
                idType == other.idType &&
                issuingCountry == other.issuingCountry &&
                issuingRegion == other.issuingRegion &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                expirationDate,
                idNumber,
                idType,
                issuingCountry,
                issuingRegion,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "IdentificationUpdateRequest{expirationDate=$expirationDate, idNumber=$idNumber, idType=$idType, issuingCountry=$issuingCountry, issuingRegion=$issuingRegion, additionalProperties=$additionalProperties}"
    }

    /** The type of ID number. */
    class IdType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val AR_CUIL = of("ar_cuil")

            @JvmField val AR_CUIT = of("ar_cuit")

            @JvmField val AT_ATIN = of("at_atin")

            @JvmField val AT_VAT = of("at_vat")

            @JvmField val AU_ABN = of("au_abn")

            @JvmField val AU_TFN = of("au_tfn")

            @JvmField val BE_ENT = of("be_ent")

            @JvmField val BE_NRN = of("be_nrn")

            @JvmField val BR_CNPJ = of("br_cnpj")

            @JvmField val BR_CPF = of("br_cpf")

            @JvmField val CA_BN = of("ca_bn")

            @JvmField val CA_SIN = of("ca_sin")

            @JvmField val CH_AHV = of("ch_ahv")

            @JvmField val CH_UID = of("ch_uid")

            @JvmField val CL_RUN = of("cl_run")

            @JvmField val CL_RUT = of("cl_rut")

            @JvmField val CO_CEDULAS = of("co_cedulas")

            @JvmField val CO_NIT = of("co_nit")

            @JvmField val CY_TIN = of("cy_tin")

            @JvmField val CZ_ICO = of("cz_ico")

            @JvmField val CZ_RC = of("cz_rc")

            @JvmField val DE_STID = of("de_stid")

            @JvmField val DE_STNR = of("de_stnr")

            @JvmField val DE_VAT = of("de_vat")

            @JvmField val DK_CPR = of("dk_cpr")

            @JvmField val DK_CVR = of("dk_cvr")

            @JvmField val DRIVERS_LICENSE = of("drivers_license")

            @JvmField val EE_IK = of("ee_ik")

            @JvmField val EE_RK = of("ee_rk")

            @JvmField val ES_NIE = of("es_nie")

            @JvmField val ES_NIF = of("es_nif")

            @JvmField val FI_HETU = of("fi_hetu")

            @JvmField val FI_YTJ = of("fi_ytj")

            @JvmField val FR_NIF = of("fr_nif")

            @JvmField val FR_SIREN = of("fr_siren")

            @JvmField val FR_VAT = of("fr_vat")

            @JvmField val GB_NINO = of("gb_nino")

            @JvmField val GB_UTR = of("gb_utr")

            @JvmField val GB_VAT = of("gb_vat")

            @JvmField val GENERIC_INTERNATIONAL = of("generic_international")

            @JvmField val GR_VAT = of("gr_vat")

            @JvmField val HK_BRN = of("hk_brn")

            @JvmField val HK_HKID = of("hk_hkid")

            @JvmField val HN_ID = of("hn_id")

            @JvmField val HN_RTN = of("hn_rtn")

            @JvmField val HR_OIB = of("hr_oib")

            @JvmField val HU_ADJ = of("hu_adj")

            @JvmField val HU_ANUM = of("hu_anum")

            @JvmField val IE_PPS = of("ie_pps")

            @JvmField val IE_TRN = of("ie_trn")

            @JvmField val IN_LEI = of("in_lei")

            @JvmField val IS_KNT = of("is_knt")

            @JvmField val IT_CF = of("it_cf")

            @JvmField val IT_PIVA = of("it_piva")

            @JvmField val JP_HB = of("jp_hb")

            @JvmField val JP_MN = of("jp_mn")

            @JvmField val KR_BRN = of("kr_brn")

            @JvmField val KR_CRN = of("kr_crn")

            @JvmField val KR_RRN = of("kr_rrn")

            @JvmField val LI_PEID = of("li_peid")

            @JvmField val LT_AK = of("lt_ak")

            @JvmField val LT_JAK = of("lt_jak")

            @JvmField val LU_MTC = of("lu_mtc")

            @JvmField val LU_VAT = of("lu_vat")

            @JvmField val LV_PK = of("lv_pk")

            @JvmField val LV_RN = of("lv_rn")

            @JvmField val MT_TIN = of("mt_tin")

            @JvmField val MT_VAT = of("mt_vat")

            @JvmField val MX_CURP = of("mx_curp")

            @JvmField val MX_INE = of("mx_ine")

            @JvmField val MX_RFC = of("mx_rfc")

            @JvmField val NATIONAL_ID = of("national_id")

            @JvmField val NL_BSN = of("nl_bsn")

            @JvmField val NL_BTW = of("nl_btw")

            @JvmField val NL_RSIN = of("nl_rsin")

            @JvmField val NO_FDN = of("no_fdn")

            @JvmField val NO_MVA = of("no_mva")

            @JvmField val NO_ORGNR = of("no_orgnr")

            @JvmField val NZ_IRD = of("nz_ird")

            @JvmField val PASSPORT = of("passport")

            @JvmField val PL_NIP = of("pl_nip")

            @JvmField val PL_PESEL = of("pl_pesel")

            @JvmField val PT_NIF = of("pt_nif")

            @JvmField val RO_CNP = of("ro_cnp")

            @JvmField val RO_CUI = of("ro_cui")

            @JvmField val SA_TIN = of("sa_tin")

            @JvmField val SA_VAT = of("sa_vat")

            @JvmField val SE_ORGNR = of("se_orgnr")

            @JvmField val SE_PNMR = of("se_pnmr")

            @JvmField val SG_FIN = of("sg_fin")

            @JvmField val SG_NRIC = of("sg_nric")

            @JvmField val SG_UEN = of("sg_uen")

            @JvmField val SI_DAV = of("si_dav")

            @JvmField val SI_TIN = of("si_tin")

            @JvmField val SK_ICO = of("sk_ico")

            @JvmField val SK_RC = of("sk_rc")

            @JvmField val US_EIN = of("us_ein")

            @JvmField val US_ITIN = of("us_itin")

            @JvmField val US_SSN = of("us_ssn")

            @JvmField val UY_RUT = of("uy_rut")

            @JvmField val VN_TIN = of("vn_tin")

            @JvmStatic fun of(value: String) = IdType(JsonField.of(value))
        }

        /** An enum containing [IdType]'s known values. */
        enum class Known {
            AR_CUIL,
            AR_CUIT,
            AT_ATIN,
            AT_VAT,
            AU_ABN,
            AU_TFN,
            BE_ENT,
            BE_NRN,
            BR_CNPJ,
            BR_CPF,
            CA_BN,
            CA_SIN,
            CH_AHV,
            CH_UID,
            CL_RUN,
            CL_RUT,
            CO_CEDULAS,
            CO_NIT,
            CY_TIN,
            CZ_ICO,
            CZ_RC,
            DE_STID,
            DE_STNR,
            DE_VAT,
            DK_CPR,
            DK_CVR,
            DRIVERS_LICENSE,
            EE_IK,
            EE_RK,
            ES_NIE,
            ES_NIF,
            FI_HETU,
            FI_YTJ,
            FR_NIF,
            FR_SIREN,
            FR_VAT,
            GB_NINO,
            GB_UTR,
            GB_VAT,
            GENERIC_INTERNATIONAL,
            GR_VAT,
            HK_BRN,
            HK_HKID,
            HN_ID,
            HN_RTN,
            HR_OIB,
            HU_ADJ,
            HU_ANUM,
            IE_PPS,
            IE_TRN,
            IN_LEI,
            IS_KNT,
            IT_CF,
            IT_PIVA,
            JP_HB,
            JP_MN,
            KR_BRN,
            KR_CRN,
            KR_RRN,
            LI_PEID,
            LT_AK,
            LT_JAK,
            LU_MTC,
            LU_VAT,
            LV_PK,
            LV_RN,
            MT_TIN,
            MT_VAT,
            MX_CURP,
            MX_INE,
            MX_RFC,
            NATIONAL_ID,
            NL_BSN,
            NL_BTW,
            NL_RSIN,
            NO_FDN,
            NO_MVA,
            NO_ORGNR,
            NZ_IRD,
            PASSPORT,
            PL_NIP,
            PL_PESEL,
            PT_NIF,
            RO_CNP,
            RO_CUI,
            SA_TIN,
            SA_VAT,
            SE_ORGNR,
            SE_PNMR,
            SG_FIN,
            SG_NRIC,
            SG_UEN,
            SI_DAV,
            SI_TIN,
            SK_ICO,
            SK_RC,
            US_EIN,
            US_ITIN,
            US_SSN,
            UY_RUT,
            VN_TIN,
        }

        /**
         * An enum containing [IdType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [IdType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AR_CUIL,
            AR_CUIT,
            AT_ATIN,
            AT_VAT,
            AU_ABN,
            AU_TFN,
            BE_ENT,
            BE_NRN,
            BR_CNPJ,
            BR_CPF,
            CA_BN,
            CA_SIN,
            CH_AHV,
            CH_UID,
            CL_RUN,
            CL_RUT,
            CO_CEDULAS,
            CO_NIT,
            CY_TIN,
            CZ_ICO,
            CZ_RC,
            DE_STID,
            DE_STNR,
            DE_VAT,
            DK_CPR,
            DK_CVR,
            DRIVERS_LICENSE,
            EE_IK,
            EE_RK,
            ES_NIE,
            ES_NIF,
            FI_HETU,
            FI_YTJ,
            FR_NIF,
            FR_SIREN,
            FR_VAT,
            GB_NINO,
            GB_UTR,
            GB_VAT,
            GENERIC_INTERNATIONAL,
            GR_VAT,
            HK_BRN,
            HK_HKID,
            HN_ID,
            HN_RTN,
            HR_OIB,
            HU_ADJ,
            HU_ANUM,
            IE_PPS,
            IE_TRN,
            IN_LEI,
            IS_KNT,
            IT_CF,
            IT_PIVA,
            JP_HB,
            JP_MN,
            KR_BRN,
            KR_CRN,
            KR_RRN,
            LI_PEID,
            LT_AK,
            LT_JAK,
            LU_MTC,
            LU_VAT,
            LV_PK,
            LV_RN,
            MT_TIN,
            MT_VAT,
            MX_CURP,
            MX_INE,
            MX_RFC,
            NATIONAL_ID,
            NL_BSN,
            NL_BTW,
            NL_RSIN,
            NO_FDN,
            NO_MVA,
            NO_ORGNR,
            NZ_IRD,
            PASSPORT,
            PL_NIP,
            PL_PESEL,
            PT_NIF,
            RO_CNP,
            RO_CUI,
            SA_TIN,
            SA_VAT,
            SE_ORGNR,
            SE_PNMR,
            SG_FIN,
            SG_NRIC,
            SG_UEN,
            SI_DAV,
            SI_TIN,
            SK_ICO,
            SK_RC,
            US_EIN,
            US_ITIN,
            US_SSN,
            UY_RUT,
            VN_TIN,
            /** An enum member indicating that [IdType] was instantiated with an unknown value. */
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
                AR_CUIL -> Value.AR_CUIL
                AR_CUIT -> Value.AR_CUIT
                AT_ATIN -> Value.AT_ATIN
                AT_VAT -> Value.AT_VAT
                AU_ABN -> Value.AU_ABN
                AU_TFN -> Value.AU_TFN
                BE_ENT -> Value.BE_ENT
                BE_NRN -> Value.BE_NRN
                BR_CNPJ -> Value.BR_CNPJ
                BR_CPF -> Value.BR_CPF
                CA_BN -> Value.CA_BN
                CA_SIN -> Value.CA_SIN
                CH_AHV -> Value.CH_AHV
                CH_UID -> Value.CH_UID
                CL_RUN -> Value.CL_RUN
                CL_RUT -> Value.CL_RUT
                CO_CEDULAS -> Value.CO_CEDULAS
                CO_NIT -> Value.CO_NIT
                CY_TIN -> Value.CY_TIN
                CZ_ICO -> Value.CZ_ICO
                CZ_RC -> Value.CZ_RC
                DE_STID -> Value.DE_STID
                DE_STNR -> Value.DE_STNR
                DE_VAT -> Value.DE_VAT
                DK_CPR -> Value.DK_CPR
                DK_CVR -> Value.DK_CVR
                DRIVERS_LICENSE -> Value.DRIVERS_LICENSE
                EE_IK -> Value.EE_IK
                EE_RK -> Value.EE_RK
                ES_NIE -> Value.ES_NIE
                ES_NIF -> Value.ES_NIF
                FI_HETU -> Value.FI_HETU
                FI_YTJ -> Value.FI_YTJ
                FR_NIF -> Value.FR_NIF
                FR_SIREN -> Value.FR_SIREN
                FR_VAT -> Value.FR_VAT
                GB_NINO -> Value.GB_NINO
                GB_UTR -> Value.GB_UTR
                GB_VAT -> Value.GB_VAT
                GENERIC_INTERNATIONAL -> Value.GENERIC_INTERNATIONAL
                GR_VAT -> Value.GR_VAT
                HK_BRN -> Value.HK_BRN
                HK_HKID -> Value.HK_HKID
                HN_ID -> Value.HN_ID
                HN_RTN -> Value.HN_RTN
                HR_OIB -> Value.HR_OIB
                HU_ADJ -> Value.HU_ADJ
                HU_ANUM -> Value.HU_ANUM
                IE_PPS -> Value.IE_PPS
                IE_TRN -> Value.IE_TRN
                IN_LEI -> Value.IN_LEI
                IS_KNT -> Value.IS_KNT
                IT_CF -> Value.IT_CF
                IT_PIVA -> Value.IT_PIVA
                JP_HB -> Value.JP_HB
                JP_MN -> Value.JP_MN
                KR_BRN -> Value.KR_BRN
                KR_CRN -> Value.KR_CRN
                KR_RRN -> Value.KR_RRN
                LI_PEID -> Value.LI_PEID
                LT_AK -> Value.LT_AK
                LT_JAK -> Value.LT_JAK
                LU_MTC -> Value.LU_MTC
                LU_VAT -> Value.LU_VAT
                LV_PK -> Value.LV_PK
                LV_RN -> Value.LV_RN
                MT_TIN -> Value.MT_TIN
                MT_VAT -> Value.MT_VAT
                MX_CURP -> Value.MX_CURP
                MX_INE -> Value.MX_INE
                MX_RFC -> Value.MX_RFC
                NATIONAL_ID -> Value.NATIONAL_ID
                NL_BSN -> Value.NL_BSN
                NL_BTW -> Value.NL_BTW
                NL_RSIN -> Value.NL_RSIN
                NO_FDN -> Value.NO_FDN
                NO_MVA -> Value.NO_MVA
                NO_ORGNR -> Value.NO_ORGNR
                NZ_IRD -> Value.NZ_IRD
                PASSPORT -> Value.PASSPORT
                PL_NIP -> Value.PL_NIP
                PL_PESEL -> Value.PL_PESEL
                PT_NIF -> Value.PT_NIF
                RO_CNP -> Value.RO_CNP
                RO_CUI -> Value.RO_CUI
                SA_TIN -> Value.SA_TIN
                SA_VAT -> Value.SA_VAT
                SE_ORGNR -> Value.SE_ORGNR
                SE_PNMR -> Value.SE_PNMR
                SG_FIN -> Value.SG_FIN
                SG_NRIC -> Value.SG_NRIC
                SG_UEN -> Value.SG_UEN
                SI_DAV -> Value.SI_DAV
                SI_TIN -> Value.SI_TIN
                SK_ICO -> Value.SK_ICO
                SK_RC -> Value.SK_RC
                US_EIN -> Value.US_EIN
                US_ITIN -> Value.US_ITIN
                US_SSN -> Value.US_SSN
                UY_RUT -> Value.UY_RUT
                VN_TIN -> Value.VN_TIN
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
                AR_CUIL -> Known.AR_CUIL
                AR_CUIT -> Known.AR_CUIT
                AT_ATIN -> Known.AT_ATIN
                AT_VAT -> Known.AT_VAT
                AU_ABN -> Known.AU_ABN
                AU_TFN -> Known.AU_TFN
                BE_ENT -> Known.BE_ENT
                BE_NRN -> Known.BE_NRN
                BR_CNPJ -> Known.BR_CNPJ
                BR_CPF -> Known.BR_CPF
                CA_BN -> Known.CA_BN
                CA_SIN -> Known.CA_SIN
                CH_AHV -> Known.CH_AHV
                CH_UID -> Known.CH_UID
                CL_RUN -> Known.CL_RUN
                CL_RUT -> Known.CL_RUT
                CO_CEDULAS -> Known.CO_CEDULAS
                CO_NIT -> Known.CO_NIT
                CY_TIN -> Known.CY_TIN
                CZ_ICO -> Known.CZ_ICO
                CZ_RC -> Known.CZ_RC
                DE_STID -> Known.DE_STID
                DE_STNR -> Known.DE_STNR
                DE_VAT -> Known.DE_VAT
                DK_CPR -> Known.DK_CPR
                DK_CVR -> Known.DK_CVR
                DRIVERS_LICENSE -> Known.DRIVERS_LICENSE
                EE_IK -> Known.EE_IK
                EE_RK -> Known.EE_RK
                ES_NIE -> Known.ES_NIE
                ES_NIF -> Known.ES_NIF
                FI_HETU -> Known.FI_HETU
                FI_YTJ -> Known.FI_YTJ
                FR_NIF -> Known.FR_NIF
                FR_SIREN -> Known.FR_SIREN
                FR_VAT -> Known.FR_VAT
                GB_NINO -> Known.GB_NINO
                GB_UTR -> Known.GB_UTR
                GB_VAT -> Known.GB_VAT
                GENERIC_INTERNATIONAL -> Known.GENERIC_INTERNATIONAL
                GR_VAT -> Known.GR_VAT
                HK_BRN -> Known.HK_BRN
                HK_HKID -> Known.HK_HKID
                HN_ID -> Known.HN_ID
                HN_RTN -> Known.HN_RTN
                HR_OIB -> Known.HR_OIB
                HU_ADJ -> Known.HU_ADJ
                HU_ANUM -> Known.HU_ANUM
                IE_PPS -> Known.IE_PPS
                IE_TRN -> Known.IE_TRN
                IN_LEI -> Known.IN_LEI
                IS_KNT -> Known.IS_KNT
                IT_CF -> Known.IT_CF
                IT_PIVA -> Known.IT_PIVA
                JP_HB -> Known.JP_HB
                JP_MN -> Known.JP_MN
                KR_BRN -> Known.KR_BRN
                KR_CRN -> Known.KR_CRN
                KR_RRN -> Known.KR_RRN
                LI_PEID -> Known.LI_PEID
                LT_AK -> Known.LT_AK
                LT_JAK -> Known.LT_JAK
                LU_MTC -> Known.LU_MTC
                LU_VAT -> Known.LU_VAT
                LV_PK -> Known.LV_PK
                LV_RN -> Known.LV_RN
                MT_TIN -> Known.MT_TIN
                MT_VAT -> Known.MT_VAT
                MX_CURP -> Known.MX_CURP
                MX_INE -> Known.MX_INE
                MX_RFC -> Known.MX_RFC
                NATIONAL_ID -> Known.NATIONAL_ID
                NL_BSN -> Known.NL_BSN
                NL_BTW -> Known.NL_BTW
                NL_RSIN -> Known.NL_RSIN
                NO_FDN -> Known.NO_FDN
                NO_MVA -> Known.NO_MVA
                NO_ORGNR -> Known.NO_ORGNR
                NZ_IRD -> Known.NZ_IRD
                PASSPORT -> Known.PASSPORT
                PL_NIP -> Known.PL_NIP
                PL_PESEL -> Known.PL_PESEL
                PT_NIF -> Known.PT_NIF
                RO_CNP -> Known.RO_CNP
                RO_CUI -> Known.RO_CUI
                SA_TIN -> Known.SA_TIN
                SA_VAT -> Known.SA_VAT
                SE_ORGNR -> Known.SE_ORGNR
                SE_PNMR -> Known.SE_PNMR
                SG_FIN -> Known.SG_FIN
                SG_NRIC -> Known.SG_NRIC
                SG_UEN -> Known.SG_UEN
                SI_DAV -> Known.SI_DAV
                SI_TIN -> Known.SI_TIN
                SK_ICO -> Known.SK_ICO
                SK_RC -> Known.SK_RC
                US_EIN -> Known.US_EIN
                US_ITIN -> Known.US_ITIN
                US_SSN -> Known.US_SSN
                UY_RUT -> Known.UY_RUT
                VN_TIN -> Known.VN_TIN
                else -> throw ModernTreasuryInvalidDataException("Unknown IdType: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ModernTreasuryInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): IdType = apply {
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

            return other is IdType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IdentificationUpdateParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "IdentificationUpdateParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
