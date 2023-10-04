// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.services.blocking.LedgerEventHandlerService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport

class LedgerEventHandlerListPage
private constructor(
    private val ledgerEventHandlersService: LedgerEventHandlerService,
    private val params: LedgerEventHandlerListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun items(): List<LedgerEventHandlerListResponse> = response().items()

    fun perPage(): String = response().perPage()

    fun afterCursor(): String = response().afterCursor()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LedgerEventHandlerListPage &&
            this.ledgerEventHandlersService == other.ledgerEventHandlersService &&
            this.params == other.params &&
            this.response == other.response
    }

    override fun hashCode(): Int {
        return Objects.hash(
            ledgerEventHandlersService,
            params,
            response,
        )
    }

    override fun toString() =
        "LedgerEventHandlerListPage{ledgerEventHandlersService=$ledgerEventHandlersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        return true
    }

    fun getNextPageParams(): Optional<LedgerEventHandlerListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            LedgerEventHandlerListParams.builder().from(params).afterCursor(afterCursor()).build()
        )
    }

    fun getNextPage(): Optional<LedgerEventHandlerListPage> {
        return getNextPageParams().map { ledgerEventHandlersService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            ledgerEventHandlersService: LedgerEventHandlerService,
            params: LedgerEventHandlerListParams,
            response: Response
        ) =
            LedgerEventHandlerListPage(
                ledgerEventHandlersService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val items: JsonField<List<LedgerEventHandlerListResponse>>,
        private val perPage: String,
        private val afterCursor: String,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun items(): List<LedgerEventHandlerListResponse> = items.getNullable("items") ?: listOf()

        fun perPage(): String = perPage

        fun afterCursor(): String = afterCursor

        @JsonProperty("items")
        fun _items(): Optional<JsonField<List<LedgerEventHandlerListResponse>>> =
            Optional.ofNullable(items)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Response = apply {
            if (!validated) {
                items().map { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Response &&
                this.items == other.items &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            return Objects.hash(items, additionalProperties)
        }

        override fun toString() =
            "LedgerEventHandlerListPage.Response{items=$items, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var items: JsonField<List<LedgerEventHandlerListResponse>> = JsonMissing.of()
            private var perPage: String? = null
            private var afterCursor: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.items = page.items
                this.perPage = page.perPage
                this.afterCursor = page.afterCursor
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun items(items: List<LedgerEventHandlerListResponse>) = items(JsonField.of(items))

            @JsonProperty("items")
            fun items(items: JsonField<List<LedgerEventHandlerListResponse>>) = apply {
                this.items = items
            }

            fun perPage(perPage: String) = apply { this.perPage = perPage }

            fun afterCursor(afterCursor: String) = apply { this.afterCursor = afterCursor }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() =
                Response(
                    items,
                    perPage!!,
                    afterCursor!!,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    class AutoPager
    constructor(
        private val firstPage: LedgerEventHandlerListPage,
    ) : Iterable<LedgerEventHandlerListResponse> {

        override fun iterator(): Iterator<LedgerEventHandlerListResponse> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.items().size) {
                    yield(page.items()[index++])
                }
                page = page.getNextPage().orElse(null) ?: break
                index = 0
            }
        }

        fun stream(): Stream<LedgerEventHandlerListResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
