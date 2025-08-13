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

/** list events */
class EventListParams
private constructor(
    private val afterCursor: String?,
    private val entityId: String?,
    private val eventName: String?,
    private val eventTimeEnd: OffsetDateTime?,
    private val eventTimeStart: OffsetDateTime?,
    private val perPage: Long?,
    private val resource: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun afterCursor(): Optional<String> = Optional.ofNullable(afterCursor)

    fun entityId(): Optional<String> = Optional.ofNullable(entityId)

    fun eventName(): Optional<String> = Optional.ofNullable(eventName)

    /** An inclusive upper bound for when the event occurred */
    fun eventTimeEnd(): Optional<OffsetDateTime> = Optional.ofNullable(eventTimeEnd)

    /** An inclusive lower bound for when the event occurred */
    fun eventTimeStart(): Optional<OffsetDateTime> = Optional.ofNullable(eventTimeStart)

    fun perPage(): Optional<Long> = Optional.ofNullable(perPage)

    fun resource(): Optional<String> = Optional.ofNullable(resource)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): EventListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [EventListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EventListParams]. */
    class Builder internal constructor() {

        private var afterCursor: String? = null
        private var entityId: String? = null
        private var eventName: String? = null
        private var eventTimeEnd: OffsetDateTime? = null
        private var eventTimeStart: OffsetDateTime? = null
        private var perPage: Long? = null
        private var resource: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(eventListParams: EventListParams) = apply {
            afterCursor = eventListParams.afterCursor
            entityId = eventListParams.entityId
            eventName = eventListParams.eventName
            eventTimeEnd = eventListParams.eventTimeEnd
            eventTimeStart = eventListParams.eventTimeStart
            perPage = eventListParams.perPage
            resource = eventListParams.resource
            additionalHeaders = eventListParams.additionalHeaders.toBuilder()
            additionalQueryParams = eventListParams.additionalQueryParams.toBuilder()
        }

        fun afterCursor(afterCursor: String?) = apply { this.afterCursor = afterCursor }

        /** Alias for calling [Builder.afterCursor] with `afterCursor.orElse(null)`. */
        fun afterCursor(afterCursor: Optional<String>) = afterCursor(afterCursor.getOrNull())

        fun entityId(entityId: String?) = apply { this.entityId = entityId }

        /** Alias for calling [Builder.entityId] with `entityId.orElse(null)`. */
        fun entityId(entityId: Optional<String>) = entityId(entityId.getOrNull())

        fun eventName(eventName: String?) = apply { this.eventName = eventName }

        /** Alias for calling [Builder.eventName] with `eventName.orElse(null)`. */
        fun eventName(eventName: Optional<String>) = eventName(eventName.getOrNull())

        /** An inclusive upper bound for when the event occurred */
        fun eventTimeEnd(eventTimeEnd: OffsetDateTime?) = apply { this.eventTimeEnd = eventTimeEnd }

        /** Alias for calling [Builder.eventTimeEnd] with `eventTimeEnd.orElse(null)`. */
        fun eventTimeEnd(eventTimeEnd: Optional<OffsetDateTime>) =
            eventTimeEnd(eventTimeEnd.getOrNull())

        /** An inclusive lower bound for when the event occurred */
        fun eventTimeStart(eventTimeStart: OffsetDateTime?) = apply {
            this.eventTimeStart = eventTimeStart
        }

        /** Alias for calling [Builder.eventTimeStart] with `eventTimeStart.orElse(null)`. */
        fun eventTimeStart(eventTimeStart: Optional<OffsetDateTime>) =
            eventTimeStart(eventTimeStart.getOrNull())

        fun perPage(perPage: Long?) = apply { this.perPage = perPage }

        /**
         * Alias for [Builder.perPage].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun perPage(perPage: Long) = perPage(perPage as Long?)

        /** Alias for calling [Builder.perPage] with `perPage.orElse(null)`. */
        fun perPage(perPage: Optional<Long>) = perPage(perPage.getOrNull())

        fun resource(resource: String?) = apply { this.resource = resource }

        /** Alias for calling [Builder.resource] with `resource.orElse(null)`. */
        fun resource(resource: Optional<String>) = resource(resource.getOrNull())

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
         * Returns an immutable instance of [EventListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EventListParams =
            EventListParams(
                afterCursor,
                entityId,
                eventName,
                eventTimeEnd,
                eventTimeStart,
                perPage,
                resource,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                afterCursor?.let { put("after_cursor", it) }
                entityId?.let { put("entity_id", it) }
                eventName?.let { put("event_name", it) }
                eventTimeEnd?.let {
                    put("event_time_end", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                eventTimeStart?.let {
                    put("event_time_start", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                perPage?.let { put("per_page", it.toString()) }
                resource?.let { put("resource", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EventListParams &&
            afterCursor == other.afterCursor &&
            entityId == other.entityId &&
            eventName == other.eventName &&
            eventTimeEnd == other.eventTimeEnd &&
            eventTimeStart == other.eventTimeStart &&
            perPage == other.perPage &&
            resource == other.resource &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            afterCursor,
            entityId,
            eventName,
            eventTimeEnd,
            eventTimeStart,
            perPage,
            resource,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "EventListParams{afterCursor=$afterCursor, entityId=$entityId, eventName=$eventName, eventTimeEnd=$eventTimeEnd, eventTimeStart=$eventTimeStart, perPage=$perPage, resource=$resource, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
