// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.PaymentReferenceServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** list payment_references */
class PaymentReferenceListPageAsync
private constructor(
    private val paymentReferencesService: PaymentReferenceServiceAsync,
    private val params: PaymentReferenceListParams,
    private val headers: Headers,
    private val items: List<PaymentReference>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<PaymentReference> = items

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentReferenceListPageAsync && paymentReferencesService == other.paymentReferencesService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(paymentReferencesService, params, items) /* spotless:on */

    override fun toString() =
        "PaymentReferenceListPageAsync{paymentReferencesService=$paymentReferencesService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<PaymentReferenceListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<PaymentReferenceListPageAsync>> {
        return getNextPageParams()
            .map { paymentReferencesService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            paymentReferencesService: PaymentReferenceServiceAsync,
            params: PaymentReferenceListParams,
            headers: Headers,
            items: List<PaymentReference>,
        ) = PaymentReferenceListPageAsync(paymentReferencesService, params, headers, items)
    }

    class AutoPager(private val firstPage: PaymentReferenceListPageAsync) {

        fun forEach(
            action: Predicate<PaymentReference>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<PaymentReferenceListPageAsync>>.forEach(
                action: (PaymentReference) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<PaymentReference>> {
            val values = mutableListOf<PaymentReference>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
