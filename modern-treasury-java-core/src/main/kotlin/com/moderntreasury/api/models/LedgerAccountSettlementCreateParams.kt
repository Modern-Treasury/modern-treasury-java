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
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create a ledger account settlement. */
class LedgerAccountSettlementCreateParams
private constructor(
    private val body: LedgerAccountSettlementCreateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The id of the contra ledger account that sends to or receives funds from the settled ledger
     * account.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contraLedgerAccountId(): String = body.contraLedgerAccountId()

    /**
     * The id of the settled ledger account whose ledger entries are queried against, and its
     * balance is reduced as a result.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun settledLedgerAccountId(): String = body.settledLedgerAccountId()

    /**
     * If true, the settlement amount and settlement_entry_direction will bring the settlement
     * ledger account's balance closer to zero, even if the balance is negative.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun allowEitherDirection(): Optional<Boolean> = body.allowEitherDirection()

    /**
     * The description of the ledger account settlement.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * The exclusive upper bound of the effective_at timestamp of the ledger entries to be included
     * in the ledger account settlement. The default value is the created_at timestamp of the ledger
     * account settlement.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun effectiveAtUpperBound(): Optional<OffsetDateTime> = body.effectiveAtUpperBound()

    /**
     * Additional data represented as key-value pairs. Both the key and value must be strings.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = body.metadata()

    /**
     * It is set to `false` by default. It should be set to `true` when migrating existing
     * settlements.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun skipSettlementLedgerTransaction(): Optional<Boolean> =
        body.skipSettlementLedgerTransaction()

    /**
     * The status of the ledger account settlement. It is set to `pending` by default. To post a
     * ledger account settlement at creation, use `posted`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun status(): Optional<Status> = body.status()

    /**
     * Returns the raw JSON value of [contraLedgerAccountId].
     *
     * Unlike [contraLedgerAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _contraLedgerAccountId(): JsonField<String> = body._contraLedgerAccountId()

    /**
     * Returns the raw JSON value of [settledLedgerAccountId].
     *
     * Unlike [settledLedgerAccountId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _settledLedgerAccountId(): JsonField<String> = body._settledLedgerAccountId()

    /**
     * Returns the raw JSON value of [allowEitherDirection].
     *
     * Unlike [allowEitherDirection], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _allowEitherDirection(): JsonField<Boolean> = body._allowEitherDirection()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [effectiveAtUpperBound].
     *
     * Unlike [effectiveAtUpperBound], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _effectiveAtUpperBound(): JsonField<OffsetDateTime> = body._effectiveAtUpperBound()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [skipSettlementLedgerTransaction].
     *
     * Unlike [skipSettlementLedgerTransaction], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _skipSettlementLedgerTransaction(): JsonField<Boolean> =
        body._skipSettlementLedgerTransaction()

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _status(): JsonField<Status> = body._status()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): LedgerAccountSettlementCreateRequest = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class LedgerAccountSettlementCreateRequest
    @JsonCreator
    private constructor(
        @JsonProperty("contra_ledger_account_id")
        @ExcludeMissing
        private val contraLedgerAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("settled_ledger_account_id")
        @ExcludeMissing
        private val settledLedgerAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("allow_either_direction")
        @ExcludeMissing
        private val allowEitherDirection: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("effective_at_upper_bound")
        @ExcludeMissing
        private val effectiveAtUpperBound: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("skip_settlement_ledger_transaction")
        @ExcludeMissing
        private val skipSettlementLedgerTransaction: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        private val status: JsonField<Status> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The id of the contra ledger account that sends to or receives funds from the settled
         * ledger account.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun contraLedgerAccountId(): String =
            contraLedgerAccountId.getRequired("contra_ledger_account_id")

        /**
         * The id of the settled ledger account whose ledger entries are queried against, and its
         * balance is reduced as a result.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun settledLedgerAccountId(): String =
            settledLedgerAccountId.getRequired("settled_ledger_account_id")

        /**
         * If true, the settlement amount and settlement_entry_direction will bring the settlement
         * ledger account's balance closer to zero, even if the balance is negative.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun allowEitherDirection(): Optional<Boolean> =
            Optional.ofNullable(allowEitherDirection.getNullable("allow_either_direction"))

        /**
         * The description of the ledger account settlement.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /**
         * The exclusive upper bound of the effective_at timestamp of the ledger entries to be
         * included in the ledger account settlement. The default value is the created_at timestamp
         * of the ledger account settlement.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun effectiveAtUpperBound(): Optional<OffsetDateTime> =
            Optional.ofNullable(effectiveAtUpperBound.getNullable("effective_at_upper_bound"))

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata.getNullable("metadata"))

        /**
         * It is set to `false` by default. It should be set to `true` when migrating existing
         * settlements.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun skipSettlementLedgerTransaction(): Optional<Boolean> =
            Optional.ofNullable(
                skipSettlementLedgerTransaction.getNullable("skip_settlement_ledger_transaction")
            )

        /**
         * The status of the ledger account settlement. It is set to `pending` by default. To post a
         * ledger account settlement at creation, use `posted`.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun status(): Optional<Status> = Optional.ofNullable(status.getNullable("status"))

        /**
         * Returns the raw JSON value of [contraLedgerAccountId].
         *
         * Unlike [contraLedgerAccountId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("contra_ledger_account_id")
        @ExcludeMissing
        fun _contraLedgerAccountId(): JsonField<String> = contraLedgerAccountId

        /**
         * Returns the raw JSON value of [settledLedgerAccountId].
         *
         * Unlike [settledLedgerAccountId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("settled_ledger_account_id")
        @ExcludeMissing
        fun _settledLedgerAccountId(): JsonField<String> = settledLedgerAccountId

        /**
         * Returns the raw JSON value of [allowEitherDirection].
         *
         * Unlike [allowEitherDirection], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("allow_either_direction")
        @ExcludeMissing
        fun _allowEitherDirection(): JsonField<Boolean> = allowEitherDirection

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [effectiveAtUpperBound].
         *
         * Unlike [effectiveAtUpperBound], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("effective_at_upper_bound")
        @ExcludeMissing
        fun _effectiveAtUpperBound(): JsonField<OffsetDateTime> = effectiveAtUpperBound

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [skipSettlementLedgerTransaction].
         *
         * Unlike [skipSettlementLedgerTransaction], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("skip_settlement_ledger_transaction")
        @ExcludeMissing
        fun _skipSettlementLedgerTransaction(): JsonField<Boolean> = skipSettlementLedgerTransaction

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): LedgerAccountSettlementCreateRequest = apply {
            if (validated) {
                return@apply
            }

            contraLedgerAccountId()
            settledLedgerAccountId()
            allowEitherDirection()
            description()
            effectiveAtUpperBound()
            metadata().ifPresent { it.validate() }
            skipSettlementLedgerTransaction()
            status()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [LedgerAccountSettlementCreateRequest].
             *
             * The following fields are required:
             * ```java
             * .contraLedgerAccountId()
             * .settledLedgerAccountId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [LedgerAccountSettlementCreateRequest]. */
        class Builder internal constructor() {

            private var contraLedgerAccountId: JsonField<String>? = null
            private var settledLedgerAccountId: JsonField<String>? = null
            private var allowEitherDirection: JsonField<Boolean> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var effectiveAtUpperBound: JsonField<OffsetDateTime> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var skipSettlementLedgerTransaction: JsonField<Boolean> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                ledgerAccountSettlementCreateRequest: LedgerAccountSettlementCreateRequest
            ) = apply {
                contraLedgerAccountId = ledgerAccountSettlementCreateRequest.contraLedgerAccountId
                settledLedgerAccountId = ledgerAccountSettlementCreateRequest.settledLedgerAccountId
                allowEitherDirection = ledgerAccountSettlementCreateRequest.allowEitherDirection
                description = ledgerAccountSettlementCreateRequest.description
                effectiveAtUpperBound = ledgerAccountSettlementCreateRequest.effectiveAtUpperBound
                metadata = ledgerAccountSettlementCreateRequest.metadata
                skipSettlementLedgerTransaction =
                    ledgerAccountSettlementCreateRequest.skipSettlementLedgerTransaction
                status = ledgerAccountSettlementCreateRequest.status
                additionalProperties =
                    ledgerAccountSettlementCreateRequest.additionalProperties.toMutableMap()
            }

            /**
             * The id of the contra ledger account that sends to or receives funds from the settled
             * ledger account.
             */
            fun contraLedgerAccountId(contraLedgerAccountId: String) =
                contraLedgerAccountId(JsonField.of(contraLedgerAccountId))

            /**
             * Sets [Builder.contraLedgerAccountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contraLedgerAccountId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun contraLedgerAccountId(contraLedgerAccountId: JsonField<String>) = apply {
                this.contraLedgerAccountId = contraLedgerAccountId
            }

            /**
             * The id of the settled ledger account whose ledger entries are queried against, and
             * its balance is reduced as a result.
             */
            fun settledLedgerAccountId(settledLedgerAccountId: String) =
                settledLedgerAccountId(JsonField.of(settledLedgerAccountId))

            /**
             * Sets [Builder.settledLedgerAccountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.settledLedgerAccountId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun settledLedgerAccountId(settledLedgerAccountId: JsonField<String>) = apply {
                this.settledLedgerAccountId = settledLedgerAccountId
            }

            /**
             * If true, the settlement amount and settlement_entry_direction will bring the
             * settlement ledger account's balance closer to zero, even if the balance is negative.
             */
            fun allowEitherDirection(allowEitherDirection: Boolean?) =
                allowEitherDirection(JsonField.ofNullable(allowEitherDirection))

            /**
             * Alias for [Builder.allowEitherDirection].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun allowEitherDirection(allowEitherDirection: Boolean) =
                allowEitherDirection(allowEitherDirection as Boolean?)

            /**
             * Alias for calling [Builder.allowEitherDirection] with
             * `allowEitherDirection.orElse(null)`.
             */
            fun allowEitherDirection(allowEitherDirection: Optional<Boolean>) =
                allowEitherDirection(allowEitherDirection.getOrNull())

            /**
             * Sets [Builder.allowEitherDirection] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowEitherDirection] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun allowEitherDirection(allowEitherDirection: JsonField<Boolean>) = apply {
                this.allowEitherDirection = allowEitherDirection
            }

            /** The description of the ledger account settlement. */
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
             * The exclusive upper bound of the effective_at timestamp of the ledger entries to be
             * included in the ledger account settlement. The default value is the created_at
             * timestamp of the ledger account settlement.
             */
            fun effectiveAtUpperBound(effectiveAtUpperBound: OffsetDateTime?) =
                effectiveAtUpperBound(JsonField.ofNullable(effectiveAtUpperBound))

            /**
             * Alias for calling [Builder.effectiveAtUpperBound] with
             * `effectiveAtUpperBound.orElse(null)`.
             */
            fun effectiveAtUpperBound(effectiveAtUpperBound: Optional<OffsetDateTime>) =
                effectiveAtUpperBound(effectiveAtUpperBound.getOrNull())

            /**
             * Sets [Builder.effectiveAtUpperBound] to an arbitrary JSON value.
             *
             * You should usually call [Builder.effectiveAtUpperBound] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun effectiveAtUpperBound(effectiveAtUpperBound: JsonField<OffsetDateTime>) = apply {
                this.effectiveAtUpperBound = effectiveAtUpperBound
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /**
             * It is set to `false` by default. It should be set to `true` when migrating existing
             * settlements.
             */
            fun skipSettlementLedgerTransaction(skipSettlementLedgerTransaction: Boolean?) =
                skipSettlementLedgerTransaction(
                    JsonField.ofNullable(skipSettlementLedgerTransaction)
                )

            /**
             * Alias for [Builder.skipSettlementLedgerTransaction].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun skipSettlementLedgerTransaction(skipSettlementLedgerTransaction: Boolean) =
                skipSettlementLedgerTransaction(skipSettlementLedgerTransaction as Boolean?)

            /**
             * Alias for calling [Builder.skipSettlementLedgerTransaction] with
             * `skipSettlementLedgerTransaction.orElse(null)`.
             */
            fun skipSettlementLedgerTransaction(
                skipSettlementLedgerTransaction: Optional<Boolean>
            ) = skipSettlementLedgerTransaction(skipSettlementLedgerTransaction.getOrNull())

            /**
             * Sets [Builder.skipSettlementLedgerTransaction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.skipSettlementLedgerTransaction] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun skipSettlementLedgerTransaction(
                skipSettlementLedgerTransaction: JsonField<Boolean>
            ) = apply { this.skipSettlementLedgerTransaction = skipSettlementLedgerTransaction }

            /**
             * The status of the ledger account settlement. It is set to `pending` by default. To
             * post a ledger account settlement at creation, use `posted`.
             */
            fun status(status: Status?) = status(JsonField.ofNullable(status))

            /** Alias for calling [Builder.status] with `status.orElse(null)`. */
            fun status(status: Optional<Status>) = status(status.getOrNull())

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            fun build(): LedgerAccountSettlementCreateRequest =
                LedgerAccountSettlementCreateRequest(
                    checkRequired("contraLedgerAccountId", contraLedgerAccountId),
                    checkRequired("settledLedgerAccountId", settledLedgerAccountId),
                    allowEitherDirection,
                    description,
                    effectiveAtUpperBound,
                    metadata,
                    skipSettlementLedgerTransaction,
                    status,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LedgerAccountSettlementCreateRequest && contraLedgerAccountId == other.contraLedgerAccountId && settledLedgerAccountId == other.settledLedgerAccountId && allowEitherDirection == other.allowEitherDirection && description == other.description && effectiveAtUpperBound == other.effectiveAtUpperBound && metadata == other.metadata && skipSettlementLedgerTransaction == other.skipSettlementLedgerTransaction && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(contraLedgerAccountId, settledLedgerAccountId, allowEitherDirection, description, effectiveAtUpperBound, metadata, skipSettlementLedgerTransaction, status, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LedgerAccountSettlementCreateRequest{contraLedgerAccountId=$contraLedgerAccountId, settledLedgerAccountId=$settledLedgerAccountId, allowEitherDirection=$allowEitherDirection, description=$description, effectiveAtUpperBound=$effectiveAtUpperBound, metadata=$metadata, skipSettlementLedgerTransaction=$skipSettlementLedgerTransaction, status=$status, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [LedgerAccountSettlementCreateParams].
         *
         * The following fields are required:
         * ```java
         * .contraLedgerAccountId()
         * .settledLedgerAccountId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LedgerAccountSettlementCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: LedgerAccountSettlementCreateRequest.Builder =
            LedgerAccountSettlementCreateRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            ledgerAccountSettlementCreateParams: LedgerAccountSettlementCreateParams
        ) = apply {
            body = ledgerAccountSettlementCreateParams.body.toBuilder()
            additionalHeaders = ledgerAccountSettlementCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                ledgerAccountSettlementCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * The id of the contra ledger account that sends to or receives funds from the settled
         * ledger account.
         */
        fun contraLedgerAccountId(contraLedgerAccountId: String) = apply {
            body.contraLedgerAccountId(contraLedgerAccountId)
        }

        /**
         * Sets [Builder.contraLedgerAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contraLedgerAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun contraLedgerAccountId(contraLedgerAccountId: JsonField<String>) = apply {
            body.contraLedgerAccountId(contraLedgerAccountId)
        }

        /**
         * The id of the settled ledger account whose ledger entries are queried against, and its
         * balance is reduced as a result.
         */
        fun settledLedgerAccountId(settledLedgerAccountId: String) = apply {
            body.settledLedgerAccountId(settledLedgerAccountId)
        }

        /**
         * Sets [Builder.settledLedgerAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.settledLedgerAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun settledLedgerAccountId(settledLedgerAccountId: JsonField<String>) = apply {
            body.settledLedgerAccountId(settledLedgerAccountId)
        }

        /**
         * If true, the settlement amount and settlement_entry_direction will bring the settlement
         * ledger account's balance closer to zero, even if the balance is negative.
         */
        fun allowEitherDirection(allowEitherDirection: Boolean?) = apply {
            body.allowEitherDirection(allowEitherDirection)
        }

        /**
         * Alias for [Builder.allowEitherDirection].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun allowEitherDirection(allowEitherDirection: Boolean) =
            allowEitherDirection(allowEitherDirection as Boolean?)

        /**
         * Alias for calling [Builder.allowEitherDirection] with
         * `allowEitherDirection.orElse(null)`.
         */
        fun allowEitherDirection(allowEitherDirection: Optional<Boolean>) =
            allowEitherDirection(allowEitherDirection.getOrNull())

        /**
         * Sets [Builder.allowEitherDirection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowEitherDirection] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun allowEitherDirection(allowEitherDirection: JsonField<Boolean>) = apply {
            body.allowEitherDirection(allowEitherDirection)
        }

        /** The description of the ledger account settlement. */
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

        /**
         * The exclusive upper bound of the effective_at timestamp of the ledger entries to be
         * included in the ledger account settlement. The default value is the created_at timestamp
         * of the ledger account settlement.
         */
        fun effectiveAtUpperBound(effectiveAtUpperBound: OffsetDateTime?) = apply {
            body.effectiveAtUpperBound(effectiveAtUpperBound)
        }

        /**
         * Alias for calling [Builder.effectiveAtUpperBound] with
         * `effectiveAtUpperBound.orElse(null)`.
         */
        fun effectiveAtUpperBound(effectiveAtUpperBound: Optional<OffsetDateTime>) =
            effectiveAtUpperBound(effectiveAtUpperBound.getOrNull())

        /**
         * Sets [Builder.effectiveAtUpperBound] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveAtUpperBound] with a well-typed
         * [OffsetDateTime] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun effectiveAtUpperBound(effectiveAtUpperBound: JsonField<OffsetDateTime>) = apply {
            body.effectiveAtUpperBound(effectiveAtUpperBound)
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /**
         * It is set to `false` by default. It should be set to `true` when migrating existing
         * settlements.
         */
        fun skipSettlementLedgerTransaction(skipSettlementLedgerTransaction: Boolean?) = apply {
            body.skipSettlementLedgerTransaction(skipSettlementLedgerTransaction)
        }

        /**
         * Alias for [Builder.skipSettlementLedgerTransaction].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun skipSettlementLedgerTransaction(skipSettlementLedgerTransaction: Boolean) =
            skipSettlementLedgerTransaction(skipSettlementLedgerTransaction as Boolean?)

        /**
         * Alias for calling [Builder.skipSettlementLedgerTransaction] with
         * `skipSettlementLedgerTransaction.orElse(null)`.
         */
        fun skipSettlementLedgerTransaction(skipSettlementLedgerTransaction: Optional<Boolean>) =
            skipSettlementLedgerTransaction(skipSettlementLedgerTransaction.getOrNull())

        /**
         * Sets [Builder.skipSettlementLedgerTransaction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.skipSettlementLedgerTransaction] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun skipSettlementLedgerTransaction(skipSettlementLedgerTransaction: JsonField<Boolean>) =
            apply {
                body.skipSettlementLedgerTransaction(skipSettlementLedgerTransaction)
            }

        /**
         * The status of the ledger account settlement. It is set to `pending` by default. To post a
         * ledger account settlement at creation, use `posted`.
         */
        fun status(status: Status?) = apply { body.status(status) }

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<Status>) = status(status.getOrNull())

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
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

        fun build(): LedgerAccountSettlementCreateParams =
            LedgerAccountSettlementCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
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

    /**
     * The status of the ledger account settlement. It is set to `pending` by default. To post a
     * ledger account settlement at creation, use `posted`.
     */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PENDING = of("pending")

            @JvmField val POSTED = of("posted")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PENDING,
            POSTED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PENDING,
            POSTED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                PENDING -> Value.PENDING
                POSTED -> Value.POSTED
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
                PENDING -> Known.PENDING
                POSTED -> Known.POSTED
                else -> throw ModernTreasuryInvalidDataException("Unknown Status: $value")
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

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerAccountSettlementCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "LedgerAccountSettlementCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
