package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.models.*
import java.util.Objects
import java.util.Optional

class InternalAccountUpdateParams
constructor(
    private val id: String,
    private val name: String?,
    private val metadata: Metadata?,
    private val parentAccountId: String?,
    private val counterpartyId: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun id(): String = id

    fun name(): Optional<String> = Optional.ofNullable(name)

    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

    fun parentAccountId(): Optional<String> = Optional.ofNullable(parentAccountId)

    fun counterpartyId(): Optional<String> = Optional.ofNullable(counterpartyId)

    @JvmSynthetic
    internal fun getBody(): InternalAccountUpdateBody {
        return InternalAccountUpdateBody(
            name,
            metadata,
            parentAccountId,
            counterpartyId,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> id
            else -> ""
        }
    }

    @JsonDeserialize(builder = InternalAccountUpdateBody.Builder::class)
    @NoAutoDetect
    class InternalAccountUpdateBody
    internal constructor(
        private val name: String?,
        private val metadata: Metadata?,
        private val parentAccountId: String?,
        private val counterpartyId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The nickname for the internal account. */
        @JsonProperty("name") fun name(): String? = name

        /**
         * Additional data in the form of key-value pairs. Pairs can be removed by passing an empty
         * string or `null` as the value.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /** The parent internal account for this account. */
        @JsonProperty("parent_account_id") fun parentAccountId(): String? = parentAccountId

        /** The Counterparty associated to this account. */
        @JsonProperty("counterparty_id") fun counterpartyId(): String? = counterpartyId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is InternalAccountUpdateBody &&
                this.name == other.name &&
                this.metadata == other.metadata &&
                this.parentAccountId == other.parentAccountId &&
                this.counterpartyId == other.counterpartyId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        name,
                        metadata,
                        parentAccountId,
                        counterpartyId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "InternalAccountUpdateBody{name=$name, metadata=$metadata, parentAccountId=$parentAccountId, counterpartyId=$counterpartyId, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: String? = null
            private var metadata: Metadata? = null
            private var parentAccountId: String? = null
            private var counterpartyId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(internalAccountUpdateBody: InternalAccountUpdateBody) = apply {
                this.name = internalAccountUpdateBody.name
                this.metadata = internalAccountUpdateBody.metadata
                this.parentAccountId = internalAccountUpdateBody.parentAccountId
                this.counterpartyId = internalAccountUpdateBody.counterpartyId
                additionalProperties(internalAccountUpdateBody.additionalProperties)
            }

            /** The nickname for the internal account. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /**
             * Additional data in the form of key-value pairs. Pairs can be removed by passing an
             * empty string or `null` as the value.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** The parent internal account for this account. */
            @JsonProperty("parent_account_id")
            fun parentAccountId(parentAccountId: String) = apply {
                this.parentAccountId = parentAccountId
            }

            /** The Counterparty associated to this account. */
            @JsonProperty("counterparty_id")
            fun counterpartyId(counterpartyId: String) = apply {
                this.counterpartyId = counterpartyId
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): InternalAccountUpdateBody =
                InternalAccountUpdateBody(
                    name,
                    metadata,
                    parentAccountId,
                    counterpartyId,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InternalAccountUpdateParams &&
            this.id == other.id &&
            this.name == other.name &&
            this.metadata == other.metadata &&
            this.parentAccountId == other.parentAccountId &&
            this.counterpartyId == other.counterpartyId &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            id,
            name,
            metadata,
            parentAccountId,
            counterpartyId,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "InternalAccountUpdateParams{id=$id, name=$name, metadata=$metadata, parentAccountId=$parentAccountId, counterpartyId=$counterpartyId, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var id: String? = null
        private var name: String? = null
        private var metadata: Metadata? = null
        private var parentAccountId: String? = null
        private var counterpartyId: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(internalAccountUpdateParams: InternalAccountUpdateParams) = apply {
            this.id = internalAccountUpdateParams.id
            this.name = internalAccountUpdateParams.name
            this.metadata = internalAccountUpdateParams.metadata
            this.parentAccountId = internalAccountUpdateParams.parentAccountId
            this.counterpartyId = internalAccountUpdateParams.counterpartyId
            additionalQueryParams(internalAccountUpdateParams.additionalQueryParams)
            additionalHeaders(internalAccountUpdateParams.additionalHeaders)
            additionalBodyProperties(internalAccountUpdateParams.additionalBodyProperties)
        }

        fun id(id: String) = apply { this.id = id }

        /** The nickname for the internal account. */
        fun name(name: String) = apply { this.name = name }

        /**
         * Additional data in the form of key-value pairs. Pairs can be removed by passing an empty
         * string or `null` as the value.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        /** The parent internal account for this account. */
        fun parentAccountId(parentAccountId: String) = apply {
            this.parentAccountId = parentAccountId
        }

        /** The Counterparty associated to this account. */
        fun counterpartyId(counterpartyId: String) = apply { this.counterpartyId = counterpartyId }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): InternalAccountUpdateParams =
            InternalAccountUpdateParams(
                checkNotNull(id) { "`id` is required but was not set" },
                name,
                metadata,
                parentAccountId,
                counterpartyId,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    /**
     * Additional data in the form of key-value pairs. Pairs can be removed by passing an empty
     * string or `null` as the value.
     */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata && this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties(metadata.additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
        }
    }
}
