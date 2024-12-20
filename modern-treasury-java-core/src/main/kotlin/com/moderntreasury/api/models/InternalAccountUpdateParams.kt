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
import java.util.Objects
import java.util.Optional

class InternalAccountUpdateParams
constructor(
    private val id: String,
    private val counterpartyId: String?,
    private val ledgerAccountId: String?,
    private val metadata: Metadata?,
    private val name: String?,
    private val parentAccountId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun id(): String = id

    fun counterpartyId(): Optional<String> = Optional.ofNullable(counterpartyId)

    fun ledgerAccountId(): Optional<String> = Optional.ofNullable(ledgerAccountId)

    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

    fun name(): Optional<String> = Optional.ofNullable(name)

    fun parentAccountId(): Optional<String> = Optional.ofNullable(parentAccountId)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): InternalAccountUpdateBody {
        return InternalAccountUpdateBody(
            counterpartyId,
            ledgerAccountId,
            metadata,
            name,
            parentAccountId,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> id
            else -> ""
        }
    }

    @NoAutoDetect
    class InternalAccountUpdateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("counterparty_id") private val counterpartyId: String?,
        @JsonProperty("ledger_account_id") private val ledgerAccountId: String?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("name") private val name: String?,
        @JsonProperty("parent_account_id") private val parentAccountId: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The Counterparty associated to this account. */
        @JsonProperty("counterparty_id")
        fun counterpartyId(): Optional<String> = Optional.ofNullable(counterpartyId)

        /** The Ledger Account associated to this account. */
        @JsonProperty("ledger_account_id")
        fun ledgerAccountId(): Optional<String> = Optional.ofNullable(ledgerAccountId)

        /**
         * Additional data in the form of key-value pairs. Pairs can be removed by passing an empty
         * string or `null` as the value.
         */
        @JsonProperty("metadata") fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

        /** The nickname for the internal account. */
        @JsonProperty("name") fun name(): Optional<String> = Optional.ofNullable(name)

        /** The parent internal account for this account. */
        @JsonProperty("parent_account_id")
        fun parentAccountId(): Optional<String> = Optional.ofNullable(parentAccountId)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var counterpartyId: String? = null
            private var ledgerAccountId: String? = null
            private var metadata: Metadata? = null
            private var name: String? = null
            private var parentAccountId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(internalAccountUpdateBody: InternalAccountUpdateBody) = apply {
                counterpartyId = internalAccountUpdateBody.counterpartyId
                ledgerAccountId = internalAccountUpdateBody.ledgerAccountId
                metadata = internalAccountUpdateBody.metadata
                name = internalAccountUpdateBody.name
                parentAccountId = internalAccountUpdateBody.parentAccountId
                additionalProperties = internalAccountUpdateBody.additionalProperties.toMutableMap()
            }

            /** The Counterparty associated to this account. */
            fun counterpartyId(counterpartyId: String) = apply {
                this.counterpartyId = counterpartyId
            }

            /** The Ledger Account associated to this account. */
            fun ledgerAccountId(ledgerAccountId: String) = apply {
                this.ledgerAccountId = ledgerAccountId
            }

            /**
             * Additional data in the form of key-value pairs. Pairs can be removed by passing an
             * empty string or `null` as the value.
             */
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** The nickname for the internal account. */
            fun name(name: String) = apply { this.name = name }

            /** The parent internal account for this account. */
            fun parentAccountId(parentAccountId: String) = apply {
                this.parentAccountId = parentAccountId
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

            fun build(): InternalAccountUpdateBody =
                InternalAccountUpdateBody(
                    counterpartyId,
                    ledgerAccountId,
                    metadata,
                    name,
                    parentAccountId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InternalAccountUpdateBody && counterpartyId == other.counterpartyId && ledgerAccountId == other.ledgerAccountId && metadata == other.metadata && name == other.name && parentAccountId == other.parentAccountId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(counterpartyId, ledgerAccountId, metadata, name, parentAccountId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InternalAccountUpdateBody{counterpartyId=$counterpartyId, ledgerAccountId=$ledgerAccountId, metadata=$metadata, name=$name, parentAccountId=$parentAccountId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var id: String? = null
        private var counterpartyId: String? = null
        private var ledgerAccountId: String? = null
        private var metadata: Metadata? = null
        private var name: String? = null
        private var parentAccountId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(internalAccountUpdateParams: InternalAccountUpdateParams) = apply {
            id = internalAccountUpdateParams.id
            counterpartyId = internalAccountUpdateParams.counterpartyId
            ledgerAccountId = internalAccountUpdateParams.ledgerAccountId
            metadata = internalAccountUpdateParams.metadata
            name = internalAccountUpdateParams.name
            parentAccountId = internalAccountUpdateParams.parentAccountId
            additionalHeaders = internalAccountUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = internalAccountUpdateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                internalAccountUpdateParams.additionalBodyProperties.toMutableMap()
        }

        fun id(id: String) = apply { this.id = id }

        /** The Counterparty associated to this account. */
        fun counterpartyId(counterpartyId: String) = apply { this.counterpartyId = counterpartyId }

        /** The Ledger Account associated to this account. */
        fun ledgerAccountId(ledgerAccountId: String) = apply {
            this.ledgerAccountId = ledgerAccountId
        }

        /**
         * Additional data in the form of key-value pairs. Pairs can be removed by passing an empty
         * string or `null` as the value.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        /** The nickname for the internal account. */
        fun name(name: String) = apply { this.name = name }

        /** The parent internal account for this account. */
        fun parentAccountId(parentAccountId: String) = apply {
            this.parentAccountId = parentAccountId
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

        fun build(): InternalAccountUpdateParams =
            InternalAccountUpdateParams(
                checkNotNull(id) { "`id` is required but was not set" },
                counterpartyId,
                ledgerAccountId,
                metadata,
                name,
                parentAccountId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    /**
     * Additional data in the form of key-value pairs. Pairs can be removed by passing an empty
     * string or `null` as the value.
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

        return /* spotless:off */ other is InternalAccountUpdateParams && id == other.id && counterpartyId == other.counterpartyId && ledgerAccountId == other.ledgerAccountId && metadata == other.metadata && name == other.name && parentAccountId == other.parentAccountId && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(id, counterpartyId, ledgerAccountId, metadata, name, parentAccountId, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "InternalAccountUpdateParams{id=$id, counterpartyId=$counterpartyId, ledgerAccountId=$ledgerAccountId, metadata=$metadata, name=$name, parentAccountId=$parentAccountId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
