// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.LegalEntityServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** @see [LegalEntityServiceAsync.list] */
class LegalEntityListPageAsync
private constructor(
    private val service: LegalEntityServiceAsync,
    private val params: LegalEntityListParams,
    private val headers: Headers,
    private val items: List<LegalEntity>,
) {

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<LegalEntityListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<LegalEntityListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): LegalEntityListParams = params

    /** The response that this page was parsed from. */
    fun items(): List<LegalEntity> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LegalEntityListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .headers()
         * .items()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LegalEntityListPageAsync]. */
    class Builder internal constructor() {

        private var service: LegalEntityServiceAsync? = null
        private var params: LegalEntityListParams? = null
        private var headers: Headers? = null
        private var items: List<LegalEntity>? = null

        @JvmSynthetic
        internal fun from(legalEntityListPageAsync: LegalEntityListPageAsync) = apply {
            service = legalEntityListPageAsync.service
            params = legalEntityListPageAsync.params
            headers = legalEntityListPageAsync.headers
            items = legalEntityListPageAsync.items
        }

        fun service(service: LegalEntityServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LegalEntityListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<LegalEntity>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [LegalEntityListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .headers()
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LegalEntityListPageAsync =
            LegalEntityListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("headers", headers),
                checkRequired("items", items),
            )
    }

    class AutoPager(private val firstPage: LegalEntityListPageAsync) {

        fun forEach(action: Predicate<LegalEntity>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<LegalEntityListPageAsync>>.forEach(
                action: (LegalEntity) -> Boolean,
                executor: Executor,
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.items().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor,
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<LegalEntity>> {
            val values = mutableListOf<LegalEntity>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LegalEntityListPageAsync && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "LegalEntityListPageAsync{service=$service, params=$params, headers=$headers, items=$items}"
}
