// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.services.blocking.ReturnService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** Get a list of returns. */
class ReturnListPage
private constructor(
    private val returnsService: ReturnService,
    private val params: ReturnListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun items(): List<ReturnObject> = response().items()

    fun perPage(): String = response().perPage()

    fun afterCursor(): String = response().afterCursor()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ReturnListPage && returnsService == other.returnsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(returnsService, params, response) /* spotless:on */

    override fun toString() =
        "ReturnListPage{returnsService=$returnsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        return !items().isEmpty()
    }

    fun getNextPageParams(): Optional<ReturnListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            ReturnListParams.builder().from(params).afterCursor(afterCursor()).build()
        )
    }

    fun getNextPage(): Optional<ReturnListPage> {
        return getNextPageParams().map { returnsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(returnsService: ReturnService, params: ReturnListParams, response: Response) =
            ReturnListPage(returnsService, params, response)
    }

    @NoAutoDetect
    class Response
    @JsonCreator
    constructor(
        @JsonProperty("items") private val items: JsonField<List<ReturnObject>> = JsonMissing.of(),
        private val perPage: String,
        private val afterCursor: String,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun items(): List<ReturnObject> = items.getNullable("items") ?: listOf()

        fun perPage(): String = perPage

        fun afterCursor(): String = afterCursor

        @JsonProperty("items")
        fun _items(): Optional<JsonField<List<ReturnObject>>> = Optional.ofNullable(items)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Response = apply {
            if (validated) {
                return@apply
            }

            items().map { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Response && items == other.items && perPage == other.perPage && afterCursor == other.afterCursor && additionalProperties == other.additionalProperties /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(items, perPage, afterCursor, additionalProperties) /* spotless:on */

        override fun toString() =
            "Response{items=$items, perPage=$perPage, afterCursor=$afterCursor, additionalProperties=$additionalProperties}"

        companion object {

            /** Returns a mutable builder for constructing an instance of [ReturnListPage]. */
            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var items: JsonField<List<ReturnObject>> = JsonMissing.of()
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

            fun items(items: List<ReturnObject>) = items(JsonField.of(items))

            fun items(items: JsonField<List<ReturnObject>>) = apply { this.items = items }

            fun perPage(perPage: String) = apply { this.perPage = perPage }

            fun afterCursor(afterCursor: String) = apply { this.afterCursor = afterCursor }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() =
                Response(items, perPage!!, afterCursor!!, additionalProperties.toImmutable())
        }
    }

    class AutoPager(private val firstPage: ReturnListPage) : Iterable<ReturnObject> {

        override fun iterator(): Iterator<ReturnObject> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.items().size) {
                    yield(page.items()[index++])
                }
                page = page.getNextPage().getOrNull() ?: break
                index = 0
            }
        }

        fun stream(): Stream<ReturnObject> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
