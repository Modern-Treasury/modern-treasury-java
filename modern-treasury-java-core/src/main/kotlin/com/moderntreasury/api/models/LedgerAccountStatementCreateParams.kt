// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/** Create a ledger account statement. */
class LedgerAccountStatementCreateParams
constructor(
    private val body: LedgerAccountStatementCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /**
     * The inclusive lower bound of the effective_at timestamp of the ledger entries to be included
     * in the ledger account statement.
     */
    fun effectiveAtLowerBound(): OffsetDateTime = body.effectiveAtLowerBound()

    /**
     * The exclusive upper bound of the effective_at timestamp of the ledger entries to be included
     * in the ledger account statement.
     */
    fun effectiveAtUpperBound(): OffsetDateTime = body.effectiveAtUpperBound()

    /**
     * The id of the ledger account whose ledger entries are queried against, and its balances are
     * computed as a result.
     */
    fun ledgerAccountId(): String = body.ledgerAccountId()

    /** The description of the ledger account statement. */
    fun description(): Optional<String> = body.description()

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Optional<Metadata> = body.metadata()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): LedgerAccountStatementCreateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class LedgerAccountStatementCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("effective_at_lower_bound") private val effectiveAtLowerBound: OffsetDateTime,
        @JsonProperty("effective_at_upper_bound") private val effectiveAtUpperBound: OffsetDateTime,
        @JsonProperty("ledger_account_id") private val ledgerAccountId: String,
        @JsonProperty("description") private val description: String?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The inclusive lower bound of the effective_at timestamp of the ledger entries to be
         * included in the ledger account statement.
         */
        @JsonProperty("effective_at_lower_bound")
        fun effectiveAtLowerBound(): OffsetDateTime = effectiveAtLowerBound

        /**
         * The exclusive upper bound of the effective_at timestamp of the ledger entries to be
         * included in the ledger account statement.
         */
        @JsonProperty("effective_at_upper_bound")
        fun effectiveAtUpperBound(): OffsetDateTime = effectiveAtUpperBound

        /**
         * The id of the ledger account whose ledger entries are queried against, and its balances
         * are computed as a result.
         */
        @JsonProperty("ledger_account_id") fun ledgerAccountId(): String = ledgerAccountId

        /** The description of the ledger account statement. */
        @JsonProperty("description")
        fun description(): Optional<String> = Optional.ofNullable(description)

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var effectiveAtLowerBound: OffsetDateTime? = null
            private var effectiveAtUpperBound: OffsetDateTime? = null
            private var ledgerAccountId: String? = null
            private var description: String? = null
            private var metadata: Metadata? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(ledgerAccountStatementCreateBody: LedgerAccountStatementCreateBody) =
                apply {
                    effectiveAtLowerBound = ledgerAccountStatementCreateBody.effectiveAtLowerBound
                    effectiveAtUpperBound = ledgerAccountStatementCreateBody.effectiveAtUpperBound
                    ledgerAccountId = ledgerAccountStatementCreateBody.ledgerAccountId
                    description = ledgerAccountStatementCreateBody.description
                    metadata = ledgerAccountStatementCreateBody.metadata
                    additionalProperties =
                        ledgerAccountStatementCreateBody.additionalProperties.toMutableMap()
                }

            /**
             * The inclusive lower bound of the effective_at timestamp of the ledger entries to be
             * included in the ledger account statement.
             */
            fun effectiveAtLowerBound(effectiveAtLowerBound: OffsetDateTime) = apply {
                this.effectiveAtLowerBound = effectiveAtLowerBound
            }

            /**
             * The exclusive upper bound of the effective_at timestamp of the ledger entries to be
             * included in the ledger account statement.
             */
            fun effectiveAtUpperBound(effectiveAtUpperBound: OffsetDateTime) = apply {
                this.effectiveAtUpperBound = effectiveAtUpperBound
            }

            /**
             * The id of the ledger account whose ledger entries are queried against, and its
             * balances are computed as a result.
             */
            fun ledgerAccountId(ledgerAccountId: String) = apply {
                this.ledgerAccountId = ledgerAccountId
            }

            /** The description of the ledger account statement. */
            fun description(description: String?) = apply { this.description = description }

            /** The description of the ledger account statement. */
            fun description(description: Optional<String>) = description(description.orElse(null))

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Optional<Metadata>) = metadata(metadata.orElse(null))

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

            fun build(): LedgerAccountStatementCreateBody =
                LedgerAccountStatementCreateBody(
                    checkNotNull(effectiveAtLowerBound) {
                        "`effectiveAtLowerBound` is required but was not set"
                    },
                    checkNotNull(effectiveAtUpperBound) {
                        "`effectiveAtUpperBound` is required but was not set"
                    },
                    checkNotNull(ledgerAccountId) {
                        "`ledgerAccountId` is required but was not set"
                    },
                    description,
                    metadata,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LedgerAccountStatementCreateBody && effectiveAtLowerBound == other.effectiveAtLowerBound && effectiveAtUpperBound == other.effectiveAtUpperBound && ledgerAccountId == other.ledgerAccountId && description == other.description && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(effectiveAtLowerBound, effectiveAtUpperBound, ledgerAccountId, description, metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LedgerAccountStatementCreateBody{effectiveAtLowerBound=$effectiveAtLowerBound, effectiveAtUpperBound=$effectiveAtUpperBound, ledgerAccountId=$ledgerAccountId, description=$description, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: LedgerAccountStatementCreateBody.Builder =
            LedgerAccountStatementCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(ledgerAccountStatementCreateParams: LedgerAccountStatementCreateParams) =
            apply {
                body = ledgerAccountStatementCreateParams.body.toBuilder()
                additionalHeaders = ledgerAccountStatementCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    ledgerAccountStatementCreateParams.additionalQueryParams.toBuilder()
            }

        /**
         * The inclusive lower bound of the effective_at timestamp of the ledger entries to be
         * included in the ledger account statement.
         */
        fun effectiveAtLowerBound(effectiveAtLowerBound: OffsetDateTime) = apply {
            body.effectiveAtLowerBound(effectiveAtLowerBound)
        }

        /**
         * The exclusive upper bound of the effective_at timestamp of the ledger entries to be
         * included in the ledger account statement.
         */
        fun effectiveAtUpperBound(effectiveAtUpperBound: OffsetDateTime) = apply {
            body.effectiveAtUpperBound(effectiveAtUpperBound)
        }

        /**
         * The id of the ledger account whose ledger entries are queried against, and its balances
         * are computed as a result.
         */
        fun ledgerAccountId(ledgerAccountId: String) = apply {
            body.ledgerAccountId(ledgerAccountId)
        }

        /** The description of the ledger account statement. */
        fun description(description: String?) = apply { body.description(description) }

        /** The description of the ledger account statement. */
        fun description(description: Optional<String>) = description(description.orElse(null))

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata?) = apply { body.metadata(metadata) }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Optional<Metadata>) = metadata(metadata.orElse(null))

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

        fun build(): LedgerAccountStatementCreateParams =
            LedgerAccountStatementCreateParams(
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerAccountStatementCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "LedgerAccountStatementCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
