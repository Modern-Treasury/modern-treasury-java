// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import java.time.LocalDate
import java.util.Objects
import java.util.Optional

class PaperItemListParams
constructor(
    private val afterCursor: String?,
    private val depositDateEnd: LocalDate?,
    private val depositDateStart: LocalDate?,
    private val lockboxNumber: String?,
    private val perPage: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun afterCursor(): Optional<String> = Optional.ofNullable(afterCursor)

    /** Specify an inclusive end date (YYYY-MM-DD) when filtering by deposit_date */
    fun depositDateEnd(): Optional<LocalDate> = Optional.ofNullable(depositDateEnd)

    /** Specify an inclusive start date (YYYY-MM-DD) when filtering by deposit_date */
    fun depositDateStart(): Optional<LocalDate> = Optional.ofNullable(depositDateStart)

    /**
     * Specify `lockbox_number` if you wish to see paper items that are associated with a specific
     * lockbox number.
     */
    fun lockboxNumber(): Optional<String> = Optional.ofNullable(lockboxNumber)

    fun perPage(): Optional<Long> = Optional.ofNullable(perPage)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.afterCursor?.let { queryParams.put("after_cursor", listOf(it.toString())) }
        this.depositDateEnd?.let { queryParams.put("deposit_date_end", listOf(it.toString())) }
        this.depositDateStart?.let { queryParams.put("deposit_date_start", listOf(it.toString())) }
        this.lockboxNumber?.let { queryParams.put("lockbox_number", listOf(it.toString())) }
        this.perPage?.let { queryParams.put("per_page", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var afterCursor: String? = null
        private var depositDateEnd: LocalDate? = null
        private var depositDateStart: LocalDate? = null
        private var lockboxNumber: String? = null
        private var perPage: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(paperItemListParams: PaperItemListParams) = apply {
            afterCursor = paperItemListParams.afterCursor
            depositDateEnd = paperItemListParams.depositDateEnd
            depositDateStart = paperItemListParams.depositDateStart
            lockboxNumber = paperItemListParams.lockboxNumber
            perPage = paperItemListParams.perPage
            additionalHeaders = paperItemListParams.additionalHeaders.toBuilder()
            additionalQueryParams = paperItemListParams.additionalQueryParams.toBuilder()
        }

        fun afterCursor(afterCursor: String?) = apply { this.afterCursor = afterCursor }

        fun afterCursor(afterCursor: Optional<String>) = afterCursor(afterCursor.orElse(null))

        /** Specify an inclusive end date (YYYY-MM-DD) when filtering by deposit_date */
        fun depositDateEnd(depositDateEnd: LocalDate?) = apply {
            this.depositDateEnd = depositDateEnd
        }

        /** Specify an inclusive end date (YYYY-MM-DD) when filtering by deposit_date */
        fun depositDateEnd(depositDateEnd: Optional<LocalDate>) =
            depositDateEnd(depositDateEnd.orElse(null))

        /** Specify an inclusive start date (YYYY-MM-DD) when filtering by deposit_date */
        fun depositDateStart(depositDateStart: LocalDate?) = apply {
            this.depositDateStart = depositDateStart
        }

        /** Specify an inclusive start date (YYYY-MM-DD) when filtering by deposit_date */
        fun depositDateStart(depositDateStart: Optional<LocalDate>) =
            depositDateStart(depositDateStart.orElse(null))

        /**
         * Specify `lockbox_number` if you wish to see paper items that are associated with a
         * specific lockbox number.
         */
        fun lockboxNumber(lockboxNumber: String?) = apply { this.lockboxNumber = lockboxNumber }

        /**
         * Specify `lockbox_number` if you wish to see paper items that are associated with a
         * specific lockbox number.
         */
        fun lockboxNumber(lockboxNumber: Optional<String>) =
            lockboxNumber(lockboxNumber.orElse(null))

        fun perPage(perPage: Long?) = apply { this.perPage = perPage }

        fun perPage(perPage: Long) = perPage(perPage as Long?)

        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun perPage(perPage: Optional<Long>) = perPage(perPage.orElse(null) as Long?)

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

        fun build(): PaperItemListParams =
            PaperItemListParams(
                afterCursor,
                depositDateEnd,
                depositDateStart,
                lockboxNumber,
                perPage,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaperItemListParams && afterCursor == other.afterCursor && depositDateEnd == other.depositDateEnd && depositDateStart == other.depositDateStart && lockboxNumber == other.lockboxNumber && perPage == other.perPage && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(afterCursor, depositDateEnd, depositDateStart, lockboxNumber, perPage, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "PaperItemListParams{afterCursor=$afterCursor, depositDateEnd=$depositDateEnd, depositDateStart=$depositDateStart, lockboxNumber=$lockboxNumber, perPage=$perPage, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
