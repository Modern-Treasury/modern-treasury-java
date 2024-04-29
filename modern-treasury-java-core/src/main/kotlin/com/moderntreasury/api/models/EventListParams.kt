// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.models.*
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional

class EventListParams
constructor(
    private val afterCursor: String?,
    private val entityId: String?,
    private val eventName: String?,
    private val eventTimeEnd: OffsetDateTime?,
    private val eventTimeStart: OffsetDateTime?,
    private val perPage: Long?,
    private val resource: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun afterCursor(): Optional<String> = Optional.ofNullable(afterCursor)

    fun entityId(): Optional<String> = Optional.ofNullable(entityId)

    fun eventName(): Optional<String> = Optional.ofNullable(eventName)

    fun eventTimeEnd(): Optional<OffsetDateTime> = Optional.ofNullable(eventTimeEnd)

    fun eventTimeStart(): Optional<OffsetDateTime> = Optional.ofNullable(eventTimeStart)

    fun perPage(): Optional<Long> = Optional.ofNullable(perPage)

    fun resource(): Optional<String> = Optional.ofNullable(resource)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.afterCursor?.let { params.put("after_cursor", listOf(it.toString())) }
        this.entityId?.let { params.put("entity_id", listOf(it.toString())) }
        this.eventName?.let { params.put("event_name", listOf(it.toString())) }
        this.eventTimeEnd?.let {
            params.put("event_time_end", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        this.eventTimeStart?.let {
            params.put(
                "event_time_start",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
            )
        }
        this.perPage?.let { params.put("per_page", listOf(it.toString())) }
        this.resource?.let { params.put("resource", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EventListParams &&
            this.afterCursor == other.afterCursor &&
            this.entityId == other.entityId &&
            this.eventName == other.eventName &&
            this.eventTimeEnd == other.eventTimeEnd &&
            this.eventTimeStart == other.eventTimeStart &&
            this.perPage == other.perPage &&
            this.resource == other.resource &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            afterCursor,
            entityId,
            eventName,
            eventTimeEnd,
            eventTimeStart,
            perPage,
            resource,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "EventListParams{afterCursor=$afterCursor, entityId=$entityId, eventName=$eventName, eventTimeEnd=$eventTimeEnd, eventTimeStart=$eventTimeStart, perPage=$perPage, resource=$resource, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var afterCursor: String? = null
        private var entityId: String? = null
        private var eventName: String? = null
        private var eventTimeEnd: OffsetDateTime? = null
        private var eventTimeStart: OffsetDateTime? = null
        private var perPage: Long? = null
        private var resource: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(eventListParams: EventListParams) = apply {
            this.afterCursor = eventListParams.afterCursor
            this.entityId = eventListParams.entityId
            this.eventName = eventListParams.eventName
            this.eventTimeEnd = eventListParams.eventTimeEnd
            this.eventTimeStart = eventListParams.eventTimeStart
            this.perPage = eventListParams.perPage
            this.resource = eventListParams.resource
            additionalQueryParams(eventListParams.additionalQueryParams)
            additionalHeaders(eventListParams.additionalHeaders)
            additionalBodyProperties(eventListParams.additionalBodyProperties)
        }

        fun afterCursor(afterCursor: String) = apply { this.afterCursor = afterCursor }

        fun entityId(entityId: String) = apply { this.entityId = entityId }

        fun eventName(eventName: String) = apply { this.eventName = eventName }

        /** An inclusive upper bound for when the event occurred */
        fun eventTimeEnd(eventTimeEnd: OffsetDateTime) = apply { this.eventTimeEnd = eventTimeEnd }

        /** An inclusive lower bound for when the event occurred */
        fun eventTimeStart(eventTimeStart: OffsetDateTime) = apply {
            this.eventTimeStart = eventTimeStart
        }

        fun perPage(perPage: Long) = apply { this.perPage = perPage }

        fun resource(resource: String) = apply { this.resource = resource }

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

        fun build(): EventListParams =
            EventListParams(
                afterCursor,
                entityId,
                eventName,
                eventTimeEnd,
                eventTimeStart,
                perPage,
                resource,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
