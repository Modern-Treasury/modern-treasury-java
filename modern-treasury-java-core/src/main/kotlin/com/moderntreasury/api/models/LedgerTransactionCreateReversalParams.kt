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
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/** Create a ledger transaction reversal. */
class LedgerTransactionCreateReversalParams
private constructor(
    private val id: String,
    private val body: LedgerTransactionCreateReversalBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun id(): String = id

    /**
     * An optional free-form description for the reversal ledger transaction. Maximum of 1000
     * characters allowed.
     */
    fun description(): Optional<String> = body.description()

    /**
     * The timestamp (ISO8601 format) at which the reversal ledger transaction happened for
     * reporting purposes. It defaults to the `effective_at` of the original ledger transaction if
     * not provided.
     */
    fun effectiveAt(): Optional<OffsetDateTime> = body.effectiveAt()

    /** Must be unique within the ledger. */
    fun externalId(): Optional<String> = body.externalId()

    /**
     * Specify this if you'd like to link the reversal ledger transaction to a Payment object like
     * Return or Reversal.
     */
    fun ledgerableId(): Optional<String> = body.ledgerableId()

    /**
     * Specify this if you'd like to link the reversal ledger transaction to a Payment object like
     * Return or Reversal.
     */
    fun ledgerableType(): Optional<LedgerableType> = body.ledgerableType()

    /**
     * Additional data to be added to the reversal ledger transaction as key-value pairs. Both the
     * key and value must be strings.
     */
    fun metadata(): Optional<Metadata> = body.metadata()

    /** Status of the reversal ledger transaction. It defaults to `posted` if not provided. */
    fun status(): Optional<Status> = body.status()

    /**
     * An optional free-form description for the reversal ledger transaction. Maximum of 1000
     * characters allowed.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * The timestamp (ISO8601 format) at which the reversal ledger transaction happened for
     * reporting purposes. It defaults to the `effective_at` of the original ledger transaction if
     * not provided.
     */
    fun _effectiveAt(): JsonField<OffsetDateTime> = body._effectiveAt()

    /** Must be unique within the ledger. */
    fun _externalId(): JsonField<String> = body._externalId()

    /**
     * Specify this if you'd like to link the reversal ledger transaction to a Payment object like
     * Return or Reversal.
     */
    fun _ledgerableId(): JsonField<String> = body._ledgerableId()

    /**
     * Specify this if you'd like to link the reversal ledger transaction to a Payment object like
     * Return or Reversal.
     */
    fun _ledgerableType(): JsonField<LedgerableType> = body._ledgerableType()

    /**
     * Additional data to be added to the reversal ledger transaction as key-value pairs. Both the
     * key and value must be strings.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /** Status of the reversal ledger transaction. It defaults to `posted` if not provided. */
    fun _status(): JsonField<Status> = body._status()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): LedgerTransactionCreateReversalBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> id
            else -> ""
        }
    }

    @NoAutoDetect
    class LedgerTransactionCreateReversalBody
    @JsonCreator
    internal constructor(
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("effective_at")
        @ExcludeMissing
        private val effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("external_id")
        @ExcludeMissing
        private val externalId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ledgerable_id")
        @ExcludeMissing
        private val ledgerableId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ledgerable_type")
        @ExcludeMissing
        private val ledgerableType: JsonField<LedgerableType> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        private val status: JsonField<Status> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * An optional free-form description for the reversal ledger transaction. Maximum of 1000
         * characters allowed.
         */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /**
         * The timestamp (ISO8601 format) at which the reversal ledger transaction happened for
         * reporting purposes. It defaults to the `effective_at` of the original ledger transaction
         * if not provided.
         */
        fun effectiveAt(): Optional<OffsetDateTime> =
            Optional.ofNullable(effectiveAt.getNullable("effective_at"))

        /** Must be unique within the ledger. */
        fun externalId(): Optional<String> =
            Optional.ofNullable(externalId.getNullable("external_id"))

        /**
         * Specify this if you'd like to link the reversal ledger transaction to a Payment object
         * like Return or Reversal.
         */
        fun ledgerableId(): Optional<String> =
            Optional.ofNullable(ledgerableId.getNullable("ledgerable_id"))

        /**
         * Specify this if you'd like to link the reversal ledger transaction to a Payment object
         * like Return or Reversal.
         */
        fun ledgerableType(): Optional<LedgerableType> =
            Optional.ofNullable(ledgerableType.getNullable("ledgerable_type"))

        /**
         * Additional data to be added to the reversal ledger transaction as key-value pairs. Both
         * the key and value must be strings.
         */
        fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata.getNullable("metadata"))

        /** Status of the reversal ledger transaction. It defaults to `posted` if not provided. */
        fun status(): Optional<Status> = Optional.ofNullable(status.getNullable("status"))

        /**
         * An optional free-form description for the reversal ledger transaction. Maximum of 1000
         * characters allowed.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * The timestamp (ISO8601 format) at which the reversal ledger transaction happened for
         * reporting purposes. It defaults to the `effective_at` of the original ledger transaction
         * if not provided.
         */
        @JsonProperty("effective_at")
        @ExcludeMissing
        fun _effectiveAt(): JsonField<OffsetDateTime> = effectiveAt

        /** Must be unique within the ledger. */
        @JsonProperty("external_id")
        @ExcludeMissing
        fun _externalId(): JsonField<String> = externalId

        /**
         * Specify this if you'd like to link the reversal ledger transaction to a Payment object
         * like Return or Reversal.
         */
        @JsonProperty("ledgerable_id")
        @ExcludeMissing
        fun _ledgerableId(): JsonField<String> = ledgerableId

        /**
         * Specify this if you'd like to link the reversal ledger transaction to a Payment object
         * like Return or Reversal.
         */
        @JsonProperty("ledgerable_type")
        @ExcludeMissing
        fun _ledgerableType(): JsonField<LedgerableType> = ledgerableType

        /**
         * Additional data to be added to the reversal ledger transaction as key-value pairs. Both
         * the key and value must be strings.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /** Status of the reversal ledger transaction. It defaults to `posted` if not provided. */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): LedgerTransactionCreateReversalBody = apply {
            if (validated) {
                return@apply
            }

            description()
            effectiveAt()
            externalId()
            ledgerableId()
            ledgerableType()
            metadata().ifPresent { it.validate() }
            status()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var description: JsonField<String> = JsonMissing.of()
            private var effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var externalId: JsonField<String> = JsonMissing.of()
            private var ledgerableId: JsonField<String> = JsonMissing.of()
            private var ledgerableType: JsonField<LedgerableType> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                ledgerTransactionCreateReversalBody: LedgerTransactionCreateReversalBody
            ) = apply {
                description = ledgerTransactionCreateReversalBody.description
                effectiveAt = ledgerTransactionCreateReversalBody.effectiveAt
                externalId = ledgerTransactionCreateReversalBody.externalId
                ledgerableId = ledgerTransactionCreateReversalBody.ledgerableId
                ledgerableType = ledgerTransactionCreateReversalBody.ledgerableType
                metadata = ledgerTransactionCreateReversalBody.metadata
                status = ledgerTransactionCreateReversalBody.status
                additionalProperties =
                    ledgerTransactionCreateReversalBody.additionalProperties.toMutableMap()
            }

            /**
             * An optional free-form description for the reversal ledger transaction. Maximum of
             * 1000 characters allowed.
             */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * An optional free-form description for the reversal ledger transaction. Maximum of
             * 1000 characters allowed.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * The timestamp (ISO8601 format) at which the reversal ledger transaction happened for
             * reporting purposes. It defaults to the `effective_at` of the original ledger
             * transaction if not provided.
             */
            fun effectiveAt(effectiveAt: OffsetDateTime?) =
                effectiveAt(JsonField.ofNullable(effectiveAt))

            /**
             * The timestamp (ISO8601 format) at which the reversal ledger transaction happened for
             * reporting purposes. It defaults to the `effective_at` of the original ledger
             * transaction if not provided.
             */
            fun effectiveAt(effectiveAt: Optional<OffsetDateTime>) =
                effectiveAt(effectiveAt.orElse(null))

            /**
             * The timestamp (ISO8601 format) at which the reversal ledger transaction happened for
             * reporting purposes. It defaults to the `effective_at` of the original ledger
             * transaction if not provided.
             */
            fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
                this.effectiveAt = effectiveAt
            }

            /** Must be unique within the ledger. */
            fun externalId(externalId: String) = externalId(JsonField.of(externalId))

            /** Must be unique within the ledger. */
            fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

            /**
             * Specify this if you'd like to link the reversal ledger transaction to a Payment
             * object like Return or Reversal.
             */
            fun ledgerableId(ledgerableId: String) = ledgerableId(JsonField.of(ledgerableId))

            /**
             * Specify this if you'd like to link the reversal ledger transaction to a Payment
             * object like Return or Reversal.
             */
            fun ledgerableId(ledgerableId: JsonField<String>) = apply {
                this.ledgerableId = ledgerableId
            }

            /**
             * Specify this if you'd like to link the reversal ledger transaction to a Payment
             * object like Return or Reversal.
             */
            fun ledgerableType(ledgerableType: LedgerableType) =
                ledgerableType(JsonField.of(ledgerableType))

            /**
             * Specify this if you'd like to link the reversal ledger transaction to a Payment
             * object like Return or Reversal.
             */
            fun ledgerableType(ledgerableType: JsonField<LedgerableType>) = apply {
                this.ledgerableType = ledgerableType
            }

            /**
             * Additional data to be added to the reversal ledger transaction as key-value pairs.
             * Both the key and value must be strings.
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Additional data to be added to the reversal ledger transaction as key-value pairs.
             * Both the key and value must be strings.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /**
             * Status of the reversal ledger transaction. It defaults to `posted` if not provided.
             */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Status of the reversal ledger transaction. It defaults to `posted` if not provided.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

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

            fun build(): LedgerTransactionCreateReversalBody =
                LedgerTransactionCreateReversalBody(
                    description,
                    effectiveAt,
                    externalId,
                    ledgerableId,
                    ledgerableType,
                    metadata,
                    status,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LedgerTransactionCreateReversalBody && description == other.description && effectiveAt == other.effectiveAt && externalId == other.externalId && ledgerableId == other.ledgerableId && ledgerableType == other.ledgerableType && metadata == other.metadata && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(description, effectiveAt, externalId, ledgerableId, ledgerableType, metadata, status, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LedgerTransactionCreateReversalBody{description=$description, effectiveAt=$effectiveAt, externalId=$externalId, ledgerableId=$ledgerableId, ledgerableType=$ledgerableType, metadata=$metadata, status=$status, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder internal constructor() {

        private var id: String? = null
        private var body: LedgerTransactionCreateReversalBody.Builder =
            LedgerTransactionCreateReversalBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            ledgerTransactionCreateReversalParams: LedgerTransactionCreateReversalParams
        ) = apply {
            id = ledgerTransactionCreateReversalParams.id
            body = ledgerTransactionCreateReversalParams.body.toBuilder()
            additionalHeaders = ledgerTransactionCreateReversalParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                ledgerTransactionCreateReversalParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String) = apply { this.id = id }

        /**
         * An optional free-form description for the reversal ledger transaction. Maximum of 1000
         * characters allowed.
         */
        fun description(description: String) = apply { body.description(description) }

        /**
         * An optional free-form description for the reversal ledger transaction. Maximum of 1000
         * characters allowed.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /**
         * The timestamp (ISO8601 format) at which the reversal ledger transaction happened for
         * reporting purposes. It defaults to the `effective_at` of the original ledger transaction
         * if not provided.
         */
        fun effectiveAt(effectiveAt: OffsetDateTime?) = apply { body.effectiveAt(effectiveAt) }

        /**
         * The timestamp (ISO8601 format) at which the reversal ledger transaction happened for
         * reporting purposes. It defaults to the `effective_at` of the original ledger transaction
         * if not provided.
         */
        fun effectiveAt(effectiveAt: Optional<OffsetDateTime>) =
            effectiveAt(effectiveAt.orElse(null))

        /**
         * The timestamp (ISO8601 format) at which the reversal ledger transaction happened for
         * reporting purposes. It defaults to the `effective_at` of the original ledger transaction
         * if not provided.
         */
        fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
            body.effectiveAt(effectiveAt)
        }

        /** Must be unique within the ledger. */
        fun externalId(externalId: String) = apply { body.externalId(externalId) }

        /** Must be unique within the ledger. */
        fun externalId(externalId: JsonField<String>) = apply { body.externalId(externalId) }

        /**
         * Specify this if you'd like to link the reversal ledger transaction to a Payment object
         * like Return or Reversal.
         */
        fun ledgerableId(ledgerableId: String) = apply { body.ledgerableId(ledgerableId) }

        /**
         * Specify this if you'd like to link the reversal ledger transaction to a Payment object
         * like Return or Reversal.
         */
        fun ledgerableId(ledgerableId: JsonField<String>) = apply {
            body.ledgerableId(ledgerableId)
        }

        /**
         * Specify this if you'd like to link the reversal ledger transaction to a Payment object
         * like Return or Reversal.
         */
        fun ledgerableType(ledgerableType: LedgerableType) = apply {
            body.ledgerableType(ledgerableType)
        }

        /**
         * Specify this if you'd like to link the reversal ledger transaction to a Payment object
         * like Return or Reversal.
         */
        fun ledgerableType(ledgerableType: JsonField<LedgerableType>) = apply {
            body.ledgerableType(ledgerableType)
        }

        /**
         * Additional data to be added to the reversal ledger transaction as key-value pairs. Both
         * the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * Additional data to be added to the reversal ledger transaction as key-value pairs. Both
         * the key and value must be strings.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /** Status of the reversal ledger transaction. It defaults to `posted` if not provided. */
        fun status(status: Status) = apply { body.status(status) }

        /** Status of the reversal ledger transaction. It defaults to `posted` if not provided. */
        fun status(status: JsonField<Status>) = apply { body.status(status) }

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

        fun build(): LedgerTransactionCreateReversalParams =
            LedgerTransactionCreateReversalParams(
                checkRequired("id", id),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /**
     * Specify this if you'd like to link the reversal ledger transaction to a Payment object like
     * Return or Reversal.
     */
    class LedgerableType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val EXPECTED_PAYMENT = of("expected_payment")

            @JvmField val INCOMING_PAYMENT_DETAIL = of("incoming_payment_detail")

            @JvmField val PAPER_ITEM = of("paper_item")

            @JvmField val PAYMENT_ORDER = of("payment_order")

            @JvmField val RETURN = of("return")

            @JvmField val REVERSAL = of("reversal")

            @JvmStatic fun of(value: String) = LedgerableType(JsonField.of(value))
        }

        enum class Known {
            EXPECTED_PAYMENT,
            INCOMING_PAYMENT_DETAIL,
            PAPER_ITEM,
            PAYMENT_ORDER,
            RETURN,
            REVERSAL,
        }

        enum class Value {
            EXPECTED_PAYMENT,
            INCOMING_PAYMENT_DETAIL,
            PAPER_ITEM,
            PAYMENT_ORDER,
            RETURN,
            REVERSAL,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                EXPECTED_PAYMENT -> Value.EXPECTED_PAYMENT
                INCOMING_PAYMENT_DETAIL -> Value.INCOMING_PAYMENT_DETAIL
                PAPER_ITEM -> Value.PAPER_ITEM
                PAYMENT_ORDER -> Value.PAYMENT_ORDER
                RETURN -> Value.RETURN
                REVERSAL -> Value.REVERSAL
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                EXPECTED_PAYMENT -> Known.EXPECTED_PAYMENT
                INCOMING_PAYMENT_DETAIL -> Known.INCOMING_PAYMENT_DETAIL
                PAPER_ITEM -> Known.PAPER_ITEM
                PAYMENT_ORDER -> Known.PAYMENT_ORDER
                RETURN -> Known.RETURN
                REVERSAL -> Known.REVERSAL
                else -> throw ModernTreasuryInvalidDataException("Unknown LedgerableType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LedgerableType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Additional data to be added to the reversal ledger transaction as key-value pairs. Both the
     * key and value must be strings.
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

    /** Status of the reversal ledger transaction. It defaults to `posted` if not provided. */
    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ARCHIVED = of("archived")

            @JvmField val PENDING = of("pending")

            @JvmField val POSTED = of("posted")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            ARCHIVED,
            PENDING,
            POSTED,
        }

        enum class Value {
            ARCHIVED,
            PENDING,
            POSTED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ARCHIVED -> Value.ARCHIVED
                PENDING -> Value.PENDING
                POSTED -> Value.POSTED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ARCHIVED -> Known.ARCHIVED
                PENDING -> Known.PENDING
                POSTED -> Known.POSTED
                else -> throw ModernTreasuryInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerTransactionCreateReversalParams && id == other.id && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(id, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "LedgerTransactionCreateReversalParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
