// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.models.*
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional

class CounterpartyListParams
constructor(
    private val afterCursor: String?,
    private val createdAtLowerBound: OffsetDateTime?,
    private val createdAtUpperBound: OffsetDateTime?,
    private val email: String?,
    private val legalEntityId: String?,
    private val metadata: Metadata?,
    private val name: String?,
    private val perPage: Long?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
) {

    fun afterCursor(): Optional<String> = Optional.ofNullable(afterCursor)

    fun createdAtLowerBound(): Optional<OffsetDateTime> = Optional.ofNullable(createdAtLowerBound)

    fun createdAtUpperBound(): Optional<OffsetDateTime> = Optional.ofNullable(createdAtUpperBound)

    fun email(): Optional<String> = Optional.ofNullable(email)

    fun legalEntityId(): Optional<String> = Optional.ofNullable(legalEntityId)

    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

    fun name(): Optional<String> = Optional.ofNullable(name)

    fun perPage(): Optional<Long> = Optional.ofNullable(perPage)

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.afterCursor?.let { params.put("after_cursor", listOf(it.toString())) }
        this.createdAtLowerBound?.let {
            params.put(
                "created_at_lower_bound",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
            )
        }
        this.createdAtUpperBound?.let {
            params.put(
                "created_at_upper_bound",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
            )
        }
        this.email?.let { params.put("email", listOf(it.toString())) }
        this.legalEntityId?.let { params.put("legal_entity_id", listOf(it.toString())) }
        this.metadata?.forEachQueryParam { key, values -> params.put("metadata[$key]", values) }
        this.name?.let { params.put("name", listOf(it.toString())) }
        this.perPage?.let { params.put("per_page", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toImmutable()
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CounterpartyListParams && this.afterCursor == other.afterCursor && this.createdAtLowerBound == other.createdAtLowerBound && this.createdAtUpperBound == other.createdAtUpperBound && this.email == other.email && this.legalEntityId == other.legalEntityId && this.metadata == other.metadata && this.name == other.name && this.perPage == other.perPage && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(afterCursor, createdAtLowerBound, createdAtUpperBound, email, legalEntityId, metadata, name, perPage, additionalHeaders, additionalQueryParams) /* spotless:on */
    }

    override fun toString() =
        "CounterpartyListParams{afterCursor=$afterCursor, createdAtLowerBound=$createdAtLowerBound, createdAtUpperBound=$createdAtUpperBound, email=$email, legalEntityId=$legalEntityId, metadata=$metadata, name=$name, perPage=$perPage, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var afterCursor: String? = null
        private var createdAtLowerBound: OffsetDateTime? = null
        private var createdAtUpperBound: OffsetDateTime? = null
        private var email: String? = null
        private var legalEntityId: String? = null
        private var metadata: Metadata? = null
        private var name: String? = null
        private var perPage: Long? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()

        @JvmSynthetic
        internal fun from(counterpartyListParams: CounterpartyListParams) = apply {
            this.afterCursor = counterpartyListParams.afterCursor
            this.createdAtLowerBound = counterpartyListParams.createdAtLowerBound
            this.createdAtUpperBound = counterpartyListParams.createdAtUpperBound
            this.email = counterpartyListParams.email
            this.legalEntityId = counterpartyListParams.legalEntityId
            this.metadata = counterpartyListParams.metadata
            this.name = counterpartyListParams.name
            this.perPage = counterpartyListParams.perPage
            additionalHeaders(counterpartyListParams.additionalHeaders)
            additionalQueryParams(counterpartyListParams.additionalQueryParams)
        }

        fun afterCursor(afterCursor: String) = apply { this.afterCursor = afterCursor }

        /** Used to return counterparties created after some datetime. */
        fun createdAtLowerBound(createdAtLowerBound: OffsetDateTime) = apply {
            this.createdAtLowerBound = createdAtLowerBound
        }

        /** Used to return counterparties created before some datetime. */
        fun createdAtUpperBound(createdAtUpperBound: OffsetDateTime) = apply {
            this.createdAtUpperBound = createdAtUpperBound
        }

        /** Performs a partial string match of the email field. This is also case insensitive. */
        fun email(email: String) = apply { this.email = email }

        /** Filters for counterparties with the given legal entity ID. */
        fun legalEntityId(legalEntityId: String) = apply { this.legalEntityId = legalEntityId }

        /**
         * For example, if you want to query for records with metadata key `Type` and value `Loan`,
         * the query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        /** Performs a partial string match of the name field. This is also case insensitive. */
        fun name(name: String) = apply { this.name = name }

        fun perPage(perPage: Long) = apply { this.perPage = perPage }

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

        fun removeAdditionalHeader(name: String) = apply { additionalHeaders.removeAll(name) }

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

        fun removeAdditionalQueryParam(key: String) = apply { additionalQueryParams.removeAll(key) }

        fun build(): CounterpartyListParams =
            CounterpartyListParams(
                afterCursor,
                createdAtLowerBound,
                createdAtUpperBound,
                email,
                legalEntityId,
                metadata,
                name,
                perPage,
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
            )
    }

    /**
     * For example, if you want to query for records with metadata key `Type` and value `Loan`, the
     * query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
     */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, List<String>>,
    ) {

        fun _additionalProperties(): Map<String, List<String>> = additionalProperties

        @JvmSynthetic
        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
            this.additionalProperties.forEach { key, values -> putParam(key, values) }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, List<String>> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties(metadata.additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, List<String>>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: List<String>) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, List<String>>) =
                apply {
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
