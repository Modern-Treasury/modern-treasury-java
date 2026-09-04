// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.Identification
import com.moderntreasury.api.models.IdentificationCreateParams
import com.moderntreasury.api.models.IdentificationRetrieveParams
import com.moderntreasury.api.models.IdentificationUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface IdentificationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IdentificationServiceAsync

    /** Create an Identification for a Legal Entity. */
    fun create(params: IdentificationCreateParams): CompletableFuture<Identification> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: IdentificationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Identification>

    /** Get an existing Identification. */
    fun retrieve(id: String): CompletableFuture<Identification> =
        retrieve(id, IdentificationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: IdentificationRetrieveParams = IdentificationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Identification> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: IdentificationRetrieveParams = IdentificationRetrieveParams.none(),
    ): CompletableFuture<Identification> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: IdentificationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Identification>

    /** @see retrieve */
    fun retrieve(params: IdentificationRetrieveParams): CompletableFuture<Identification> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Identification> =
        retrieve(id, IdentificationRetrieveParams.none(), requestOptions)

    /** Update an existing Identification. */
    fun update(id: String): CompletableFuture<Identification> =
        update(id, IdentificationUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: IdentificationUpdateParams = IdentificationUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Identification> = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: IdentificationUpdateParams = IdentificationUpdateParams.none(),
    ): CompletableFuture<Identification> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: IdentificationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Identification>

    /** @see update */
    fun update(params: IdentificationUpdateParams): CompletableFuture<Identification> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): CompletableFuture<Identification> =
        update(id, IdentificationUpdateParams.none(), requestOptions)

    /**
     * A view of [IdentificationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IdentificationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/identifications`, but is otherwise the same as
         * [IdentificationServiceAsync.create].
         */
        fun create(
            params: IdentificationCreateParams
        ): CompletableFuture<HttpResponseFor<Identification>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: IdentificationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Identification>>

        /**
         * Returns a raw HTTP response for `get /api/identifications/{id}`, but is otherwise the
         * same as [IdentificationServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<Identification>> =
            retrieve(id, IdentificationRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: IdentificationRetrieveParams = IdentificationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Identification>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: IdentificationRetrieveParams = IdentificationRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Identification>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: IdentificationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Identification>>

        /** @see retrieve */
        fun retrieve(
            params: IdentificationRetrieveParams
        ): CompletableFuture<HttpResponseFor<Identification>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Identification>> =
            retrieve(id, IdentificationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/identifications/{id}`, but is otherwise the
         * same as [IdentificationServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<Identification>> =
            update(id, IdentificationUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: IdentificationUpdateParams = IdentificationUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Identification>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: IdentificationUpdateParams = IdentificationUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<Identification>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: IdentificationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Identification>>

        /** @see update */
        fun update(
            params: IdentificationUpdateParams
        ): CompletableFuture<HttpResponseFor<Identification>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Identification>> =
            update(id, IdentificationUpdateParams.none(), requestOptions)
    }
}
