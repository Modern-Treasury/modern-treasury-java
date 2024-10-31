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
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.services.blocking.ForeignExchangeQuoteService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport

class ForeignExchangeQuoteListPage
private constructor(
    private val foreignExchangeQuotesService: ForeignExchangeQuoteService,
    private val params: ForeignExchangeQuoteListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun items(): List<ForeignExchangeQuote> = response().items()

    fun perPage(): String = response().perPage()

    fun afterCursor(): String = response().afterCursor()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ForeignExchangeQuoteListPage && this.foreignExchangeQuotesService == other.foreignExchangeQuotesService && this.params == other.params && this.response == other.response /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(foreignExchangeQuotesService, params, response) /* spotless:on */
    }

    override fun toString() =
        "ForeignExchangeQuoteListPage{foreignExchangeQuotesService=$foreignExchangeQuotesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        return !items().isEmpty()
    }

    fun getNextPageParams(): Optional<ForeignExchangeQuoteListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            ForeignExchangeQuoteListParams.builder().from(params).afterCursor(afterCursor()).build()
        )
    }

    fun getNextPage(): Optional<ForeignExchangeQuoteListPage> {
        return getNextPageParams().map { foreignExchangeQuotesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            foreignExchangeQuotesService: ForeignExchangeQuoteService,
            params: ForeignExchangeQuoteListParams,
            response: Response
        ) =
            ForeignExchangeQuoteListPage(
                foreignExchangeQuotesService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val items: JsonField<List<ForeignExchangeQuote>>,
        private val perPage: String,
        private val afterCursor: String,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun items(): List<ForeignExchangeQuote> = items.getNullable("items") ?: listOf()

        fun perPage(): String = perPage

        fun afterCursor(): String = afterCursor

        @JsonProperty("items")
        fun _items(): Optional<JsonField<List<ForeignExchangeQuote>>> = Optional.ofNullable(items)

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

            return /* spotless:off */ other is Response && this.items == other.items && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(items, additionalProperties) /* spotless:on */
        }

        override fun toString() =
            "ForeignExchangeQuoteListPage.Response{items=$items, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var items: JsonField<List<ForeignExchangeQuote>> = JsonMissing.of()
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

            fun items(items: List<ForeignExchangeQuote>) = items(JsonField.of(items))

            @JsonProperty("items")
            fun items(items: JsonField<List<ForeignExchangeQuote>>) = apply { this.items = items }

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
                    additionalProperties.toImmutable(),
                )
        }
    }

    class AutoPager
    constructor(
        private val firstPage: ForeignExchangeQuoteListPage,
    ) : Iterable<ForeignExchangeQuote> {

        override fun iterator(): Iterator<ForeignExchangeQuote> = iterator {
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

        fun stream(): Stream<ForeignExchangeQuote> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
