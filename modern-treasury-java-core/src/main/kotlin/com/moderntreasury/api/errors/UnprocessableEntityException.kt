// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.errors

import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class UnprocessableEntityException
private constructor(private val headers: Headers, private val body: JsonValue, cause: Throwable?) :
    ModernTreasuryServiceException("422: $body", cause) {

    override fun headers(): Headers = headers

    override fun body(): JsonValue = body

    override fun statusCode(): Int = 422

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UnprocessableEntityException].
         *
         * The following fields are required:
         * ```java
         * .headers()
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UnprocessableEntityException]. */
    class Builder internal constructor() {

        private var headers: Headers? = null
        private var body: JsonValue? = null
        private var cause: Throwable? = null

        @JvmSynthetic
        internal fun from(unprocessableEntityException: UnprocessableEntityException) = apply {
            headers = unprocessableEntityException.headers
            body = unprocessableEntityException.body
            cause = unprocessableEntityException.cause
        }

        fun headers(headers: Headers) = apply { this.headers = headers }

        fun body(body: JsonValue) = apply { this.body = body }

        fun cause(cause: Throwable?) = apply { this.cause = cause }

        /** Alias for calling [Builder.cause] with `cause.orElse(null)`. */
        fun cause(cause: Optional<Throwable>) = cause(cause.getOrNull())

        /**
         * Returns an immutable instance of [UnprocessableEntityException].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .headers()
         * .body()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UnprocessableEntityException =
            UnprocessableEntityException(
                checkRequired("headers", headers),
                checkRequired("body", body),
                cause,
            )
    }
}
