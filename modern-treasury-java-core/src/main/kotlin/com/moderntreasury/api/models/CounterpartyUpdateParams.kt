// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.models.*
import java.util.Objects
import java.util.Optional

class CounterpartyUpdateParams
constructor(
    private val id: String,
    private val email: String?,
    private val legalEntityId: String?,
    private val metadata: Metadata?,
    private val name: String?,
    private val sendRemittanceAdvice: Boolean?,
    private val taxpayerIdentifier: String?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun id(): String = id

    fun email(): Optional<String> = Optional.ofNullable(email)

    fun legalEntityId(): Optional<String> = Optional.ofNullable(legalEntityId)

    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

    fun name(): Optional<String> = Optional.ofNullable(name)

    fun sendRemittanceAdvice(): Optional<Boolean> = Optional.ofNullable(sendRemittanceAdvice)

    fun taxpayerIdentifier(): Optional<String> = Optional.ofNullable(taxpayerIdentifier)

    @JvmSynthetic
    internal fun getBody(): CounterpartyUpdateBody {
        return CounterpartyUpdateBody(
            email,
            legalEntityId,
            metadata,
            name,
            sendRemittanceAdvice,
            taxpayerIdentifier,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> id
            else -> ""
        }
    }

    @JsonDeserialize(builder = CounterpartyUpdateBody.Builder::class)
    @NoAutoDetect
    class CounterpartyUpdateBody
    internal constructor(
        private val email: String?,
        private val legalEntityId: String?,
        private val metadata: Metadata?,
        private val name: String?,
        private val sendRemittanceAdvice: Boolean?,
        private val taxpayerIdentifier: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** A new email for the counterparty. */
        @JsonProperty("email") fun email(): String? = email

        /** The id of the legal entity. */
        @JsonProperty("legal_entity_id") fun legalEntityId(): String? = legalEntityId

        /**
         * Additional data in the form of key-value pairs. Pairs can be removed by passing an empty
         * string or `null` as the value.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /** A new name for the counterparty. Will only update if passed. */
        @JsonProperty("name") fun name(): String? = name

        /**
         * If this is `true`, Modern Treasury will send an email to the counterparty whenever an
         * associated payment order is sent to the bank.
         */
        @JsonProperty("send_remittance_advice")
        fun sendRemittanceAdvice(): Boolean? = sendRemittanceAdvice

        /** Either a valid SSN or EIN. */
        @JsonProperty("taxpayer_identifier") fun taxpayerIdentifier(): String? = taxpayerIdentifier

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var email: String? = null
            private var legalEntityId: String? = null
            private var metadata: Metadata? = null
            private var name: String? = null
            private var sendRemittanceAdvice: Boolean? = null
            private var taxpayerIdentifier: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(counterpartyUpdateBody: CounterpartyUpdateBody) = apply {
                this.email = counterpartyUpdateBody.email
                this.legalEntityId = counterpartyUpdateBody.legalEntityId
                this.metadata = counterpartyUpdateBody.metadata
                this.name = counterpartyUpdateBody.name
                this.sendRemittanceAdvice = counterpartyUpdateBody.sendRemittanceAdvice
                this.taxpayerIdentifier = counterpartyUpdateBody.taxpayerIdentifier
                additionalProperties(counterpartyUpdateBody.additionalProperties)
            }

            /** A new email for the counterparty. */
            @JsonProperty("email") fun email(email: String) = apply { this.email = email }

            /** The id of the legal entity. */
            @JsonProperty("legal_entity_id")
            fun legalEntityId(legalEntityId: String) = apply { this.legalEntityId = legalEntityId }

            /**
             * Additional data in the form of key-value pairs. Pairs can be removed by passing an
             * empty string or `null` as the value.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** A new name for the counterparty. Will only update if passed. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /**
             * If this is `true`, Modern Treasury will send an email to the counterparty whenever an
             * associated payment order is sent to the bank.
             */
            @JsonProperty("send_remittance_advice")
            fun sendRemittanceAdvice(sendRemittanceAdvice: Boolean) = apply {
                this.sendRemittanceAdvice = sendRemittanceAdvice
            }

            /** Either a valid SSN or EIN. */
            @JsonProperty("taxpayer_identifier")
            fun taxpayerIdentifier(taxpayerIdentifier: String) = apply {
                this.taxpayerIdentifier = taxpayerIdentifier
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

            fun build(): CounterpartyUpdateBody =
                CounterpartyUpdateBody(
                    email,
                    legalEntityId,
                    metadata,
                    name,
                    sendRemittanceAdvice,
                    taxpayerIdentifier,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CounterpartyUpdateBody && this.email == other.email && this.legalEntityId == other.legalEntityId && this.metadata == other.metadata && this.name == other.name && this.sendRemittanceAdvice == other.sendRemittanceAdvice && this.taxpayerIdentifier == other.taxpayerIdentifier && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(email, legalEntityId, metadata, name, sendRemittanceAdvice, taxpayerIdentifier, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "CounterpartyUpdateBody{email=$email, legalEntityId=$legalEntityId, metadata=$metadata, name=$name, sendRemittanceAdvice=$sendRemittanceAdvice, taxpayerIdentifier=$taxpayerIdentifier, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CounterpartyUpdateParams && this.id == other.id && this.email == other.email && this.legalEntityId == other.legalEntityId && this.metadata == other.metadata && this.name == other.name && this.sendRemittanceAdvice == other.sendRemittanceAdvice && this.taxpayerIdentifier == other.taxpayerIdentifier && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(id, email, legalEntityId, metadata, name, sendRemittanceAdvice, taxpayerIdentifier, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "CounterpartyUpdateParams{id=$id, email=$email, legalEntityId=$legalEntityId, metadata=$metadata, name=$name, sendRemittanceAdvice=$sendRemittanceAdvice, taxpayerIdentifier=$taxpayerIdentifier, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var id: String? = null
        private var email: String? = null
        private var legalEntityId: String? = null
        private var metadata: Metadata? = null
        private var name: String? = null
        private var sendRemittanceAdvice: Boolean? = null
        private var taxpayerIdentifier: String? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(counterpartyUpdateParams: CounterpartyUpdateParams) = apply {
            this.id = counterpartyUpdateParams.id
            this.email = counterpartyUpdateParams.email
            this.legalEntityId = counterpartyUpdateParams.legalEntityId
            this.metadata = counterpartyUpdateParams.metadata
            this.name = counterpartyUpdateParams.name
            this.sendRemittanceAdvice = counterpartyUpdateParams.sendRemittanceAdvice
            this.taxpayerIdentifier = counterpartyUpdateParams.taxpayerIdentifier
            additionalHeaders(counterpartyUpdateParams.additionalHeaders)
            additionalQueryParams(counterpartyUpdateParams.additionalQueryParams)
            additionalBodyProperties(counterpartyUpdateParams.additionalBodyProperties)
        }

        fun id(id: String) = apply { this.id = id }

        /** A new email for the counterparty. */
        fun email(email: String) = apply { this.email = email }

        /** The id of the legal entity. */
        fun legalEntityId(legalEntityId: String) = apply { this.legalEntityId = legalEntityId }

        /**
         * Additional data in the form of key-value pairs. Pairs can be removed by passing an empty
         * string or `null` as the value.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        /** A new name for the counterparty. Will only update if passed. */
        fun name(name: String) = apply { this.name = name }

        /**
         * If this is `true`, Modern Treasury will send an email to the counterparty whenever an
         * associated payment order is sent to the bank.
         */
        fun sendRemittanceAdvice(sendRemittanceAdvice: Boolean) = apply {
            this.sendRemittanceAdvice = sendRemittanceAdvice
        }

        /** Either a valid SSN or EIN. */
        fun taxpayerIdentifier(taxpayerIdentifier: String) = apply {
            this.taxpayerIdentifier = taxpayerIdentifier
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replaceValues(name, listOf(value))
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replaceValues(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::replaceAdditionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.removeAll(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            names.forEach(::removeAdditionalHeaders)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replaceValues(key, listOf(value))
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replaceValues(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::replaceAdditionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply {
            additionalQueryParams.removeAll(key)
        }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalQueryParams)
        }

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

        fun build(): CounterpartyUpdateParams =
            CounterpartyUpdateParams(
                checkNotNull(id) { "`id` is required but was not set" },
                email,
                legalEntityId,
                metadata,
                name,
                sendRemittanceAdvice,
                taxpayerIdentifier,
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalBodyProperties.toImmutable(),
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

            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }
}
