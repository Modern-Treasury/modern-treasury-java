// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.Params
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get a paginated list of all counterparties. */
class CounterpartyListParams
private constructor(
    private val afterCursor: String?,
    private val createdAtLowerBound: OffsetDateTime?,
    private val createdAtUpperBound: OffsetDateTime?,
    private val email: String?,
    private val legalEntityId: String?,
    private val metadata: Metadata?,
    private val name: String?,
    private val perPage: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun afterCursor(): Optional<String> = Optional.ofNullable(afterCursor)

    /** Used to return counterparties created after some datetime. */
    fun createdAtLowerBound(): Optional<OffsetDateTime> = Optional.ofNullable(createdAtLowerBound)

    /** Used to return counterparties created before some datetime. */
    fun createdAtUpperBound(): Optional<OffsetDateTime> = Optional.ofNullable(createdAtUpperBound)

    /** Performs a partial string match of the email field. This is also case insensitive. */
    fun email(): Optional<String> = Optional.ofNullable(email)

    /** Filters for counterparties with the given legal entity ID. */
    fun legalEntityId(): Optional<String> = Optional.ofNullable(legalEntityId)

    /**
     * For example, if you want to query for records with metadata key `Type` and value `Loan`, the
     * query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
     */
    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

    /** Performs a partial string match of the name field. This is also case insensitive. */
    fun name(): Optional<String> = Optional.ofNullable(name)

    fun perPage(): Optional<Long> = Optional.ofNullable(perPage)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): CounterpartyListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [CounterpartyListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CounterpartyListParams]. */
    class Builder internal constructor() {

        private var afterCursor: String? = null
        private var createdAtLowerBound: OffsetDateTime? = null
        private var createdAtUpperBound: OffsetDateTime? = null
        private var email: String? = null
        private var legalEntityId: String? = null
        private var metadata: Metadata? = null
        private var name: String? = null
        private var perPage: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(counterpartyListParams: CounterpartyListParams) = apply {
            afterCursor = counterpartyListParams.afterCursor
            createdAtLowerBound = counterpartyListParams.createdAtLowerBound
            createdAtUpperBound = counterpartyListParams.createdAtUpperBound
            email = counterpartyListParams.email
            legalEntityId = counterpartyListParams.legalEntityId
            metadata = counterpartyListParams.metadata
            name = counterpartyListParams.name
            perPage = counterpartyListParams.perPage
            additionalHeaders = counterpartyListParams.additionalHeaders.toBuilder()
            additionalQueryParams = counterpartyListParams.additionalQueryParams.toBuilder()
        }

        fun afterCursor(afterCursor: String?) = apply { this.afterCursor = afterCursor }

        /** Alias for calling [Builder.afterCursor] with `afterCursor.orElse(null)`. */
        fun afterCursor(afterCursor: Optional<String>) = afterCursor(afterCursor.getOrNull())

        /** Used to return counterparties created after some datetime. */
        fun createdAtLowerBound(createdAtLowerBound: OffsetDateTime?) = apply {
            this.createdAtLowerBound = createdAtLowerBound
        }

        /**
         * Alias for calling [Builder.createdAtLowerBound] with `createdAtLowerBound.orElse(null)`.
         */
        fun createdAtLowerBound(createdAtLowerBound: Optional<OffsetDateTime>) =
            createdAtLowerBound(createdAtLowerBound.getOrNull())

        /** Used to return counterparties created before some datetime. */
        fun createdAtUpperBound(createdAtUpperBound: OffsetDateTime?) = apply {
            this.createdAtUpperBound = createdAtUpperBound
        }

        /**
         * Alias for calling [Builder.createdAtUpperBound] with `createdAtUpperBound.orElse(null)`.
         */
        fun createdAtUpperBound(createdAtUpperBound: Optional<OffsetDateTime>) =
            createdAtUpperBound(createdAtUpperBound.getOrNull())

        /** Performs a partial string match of the email field. This is also case insensitive. */
        fun email(email: String?) = apply { this.email = email }

        /** Alias for calling [Builder.email] with `email.orElse(null)`. */
        fun email(email: Optional<String>) = email(email.getOrNull())

        /** Filters for counterparties with the given legal entity ID. */
        fun legalEntityId(legalEntityId: String?) = apply { this.legalEntityId = legalEntityId }

        /** Alias for calling [Builder.legalEntityId] with `legalEntityId.orElse(null)`. */
        fun legalEntityId(legalEntityId: Optional<String>) =
            legalEntityId(legalEntityId.getOrNull())

        /**
         * For example, if you want to query for records with metadata key `Type` and value `Loan`,
         * the query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
         */
        fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

        /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
        fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

        /** Performs a partial string match of the name field. This is also case insensitive. */
        fun name(name: String?) = apply { this.name = name }

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        fun perPage(perPage: Long?) = apply { this.perPage = perPage }

        /**
         * Alias for [Builder.perPage].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun perPage(perPage: Long) = perPage(perPage as Long?)

        /** Alias for calling [Builder.perPage] with `perPage.orElse(null)`. */
        fun perPage(perPage: Optional<Long>) = perPage(perPage.getOrNull())

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
         * Returns an immutable instance of [CounterpartyListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
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
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                afterCursor?.let { put("after_cursor", it) }
                createdAtLowerBound?.let {
                    put("created_at_lower_bound", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                createdAtUpperBound?.let {
                    put("created_at_upper_bound", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                email?.let { put("email", it) }
                legalEntityId?.let { put("legal_entity_id", it) }
                metadata?.let {
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("metadata[$key]", value)
                        }
                    }
                }
                name?.let { put("name", it) }
                perPage?.let { put("per_page", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * For example, if you want to query for records with metadata key `Type` and value `Loan`, the
     * query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
     */
    class Metadata private constructor(private val additionalProperties: QueryParams) {

        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toBuilder()
            }

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceAdditionalProperties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAllAdditionalProperties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeAdditionalProperties(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            /**
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.build())
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

        return /* spotless:off */ other is CounterpartyListParams && afterCursor == other.afterCursor && createdAtLowerBound == other.createdAtLowerBound && createdAtUpperBound == other.createdAtUpperBound && email == other.email && legalEntityId == other.legalEntityId && metadata == other.metadata && name == other.name && perPage == other.perPage && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(afterCursor, createdAtLowerBound, createdAtUpperBound, email, legalEntityId, metadata, name, perPage, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CounterpartyListParams{afterCursor=$afterCursor, createdAtLowerBound=$createdAtLowerBound, createdAtUpperBound=$createdAtUpperBound, email=$email, legalEntityId=$legalEntityId, metadata=$metadata, name=$name, perPage=$perPage, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
