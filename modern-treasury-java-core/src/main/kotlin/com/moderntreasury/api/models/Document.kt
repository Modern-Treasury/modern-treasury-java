// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class Document
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("discarded_at")
    @ExcludeMissing
    private val discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("document_details")
    @ExcludeMissing
    private val documentDetails: JsonField<List<DocumentDetail>> = JsonMissing.of(),
    @JsonProperty("document_type")
    @ExcludeMissing
    private val documentType: JsonField<String> = JsonMissing.of(),
    @JsonProperty("documentable_id")
    @ExcludeMissing
    private val documentableId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("documentable_type")
    @ExcludeMissing
    private val documentableType: JsonField<DocumentableType> = JsonMissing.of(),
    @JsonProperty("file") @ExcludeMissing private val file: JsonField<File> = JsonMissing.of(),
    @JsonProperty("live_mode")
    @ExcludeMissing
    private val liveMode: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("object")
    @ExcludeMissing
    private val object_: JsonField<String> = JsonMissing.of(),
    @JsonProperty("source")
    @ExcludeMissing
    private val source: JsonField<String> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun discardedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(discardedAt.getNullable("discarded_at"))

    fun documentDetails(): List<DocumentDetail> = documentDetails.getRequired("document_details")

    /** A category given to the document, can be `null`. */
    fun documentType(): Optional<String> =
        Optional.ofNullable(documentType.getNullable("document_type"))

    /** The unique identifier for the associated object. */
    fun documentableId(): String = documentableId.getRequired("documentable_id")

    /**
     * The type of the associated object. Currently can be one of `payment_order`, `transaction`,
     * `paper_item`, `expected_payment`, `counterparty`, `organization`, `case`, `internal_account`,
     * `decision`, or `external_account`.
     */
    fun documentableType(): DocumentableType = documentableType.getRequired("documentable_type")

    fun file(): File = file.getRequired("file")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    fun object_(): String = object_.getRequired("object")

    /** The source of the document. Can be `vendor`, `customer`, or `modern_treasury`. */
    fun source(): String = source.getRequired("source")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    @JsonProperty("discarded_at")
    @ExcludeMissing
    fun _discardedAt(): JsonField<OffsetDateTime> = discardedAt

    @JsonProperty("document_details")
    @ExcludeMissing
    fun _documentDetails(): JsonField<List<DocumentDetail>> = documentDetails

    /** A category given to the document, can be `null`. */
    @JsonProperty("document_type")
    @ExcludeMissing
    fun _documentType(): JsonField<String> = documentType

    /** The unique identifier for the associated object. */
    @JsonProperty("documentable_id")
    @ExcludeMissing
    fun _documentableId(): JsonField<String> = documentableId

    /**
     * The type of the associated object. Currently can be one of `payment_order`, `transaction`,
     * `paper_item`, `expected_payment`, `counterparty`, `organization`, `case`, `internal_account`,
     * `decision`, or `external_account`.
     */
    @JsonProperty("documentable_type")
    @ExcludeMissing
    fun _documentableType(): JsonField<DocumentableType> = documentableType

    @JsonProperty("file") @ExcludeMissing fun _file(): JsonField<File> = file

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

    /** The source of the document. Can be `vendor`, `customer`, or `modern_treasury`. */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Document = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        discardedAt()
        documentDetails().forEach { it.validate() }
        documentType()
        documentableId()
        documentableType()
        file().validate()
        liveMode()
        object_()
        source()
        updatedAt()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var discardedAt: JsonField<OffsetDateTime>? = null
        private var documentDetails: JsonField<MutableList<DocumentDetail>>? = null
        private var documentType: JsonField<String>? = null
        private var documentableId: JsonField<String>? = null
        private var documentableType: JsonField<DocumentableType>? = null
        private var file: JsonField<File>? = null
        private var liveMode: JsonField<Boolean>? = null
        private var object_: JsonField<String>? = null
        private var source: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(document: Document) = apply {
            id = document.id
            createdAt = document.createdAt
            discardedAt = document.discardedAt
            documentDetails = document.documentDetails.map { it.toMutableList() }
            documentType = document.documentType
            documentableId = document.documentableId
            documentableType = document.documentableType
            file = document.file
            liveMode = document.liveMode
            object_ = document.object_
            source = document.source
            updatedAt = document.updatedAt
            additionalProperties = document.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun discardedAt(discardedAt: OffsetDateTime?) =
            discardedAt(JsonField.ofNullable(discardedAt))

        fun discardedAt(discardedAt: Optional<OffsetDateTime>) =
            discardedAt(discardedAt.orElse(null))

        fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
            this.discardedAt = discardedAt
        }

        fun documentDetails(documentDetails: List<DocumentDetail>) =
            documentDetails(JsonField.of(documentDetails))

        fun documentDetails(documentDetails: JsonField<List<DocumentDetail>>) = apply {
            this.documentDetails = documentDetails.map { it.toMutableList() }
        }

        fun addDocumentDetail(documentDetail: DocumentDetail) = apply {
            documentDetails =
                (documentDetails ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(documentDetail)
                }
        }

        /** A category given to the document, can be `null`. */
        fun documentType(documentType: String?) = documentType(JsonField.ofNullable(documentType))

        /** A category given to the document, can be `null`. */
        fun documentType(documentType: Optional<String>) = documentType(documentType.orElse(null))

        /** A category given to the document, can be `null`. */
        fun documentType(documentType: JsonField<String>) = apply {
            this.documentType = documentType
        }

        /** The unique identifier for the associated object. */
        fun documentableId(documentableId: String) = documentableId(JsonField.of(documentableId))

        /** The unique identifier for the associated object. */
        fun documentableId(documentableId: JsonField<String>) = apply {
            this.documentableId = documentableId
        }

        /**
         * The type of the associated object. Currently can be one of `payment_order`,
         * `transaction`, `paper_item`, `expected_payment`, `counterparty`, `organization`, `case`,
         * `internal_account`, `decision`, or `external_account`.
         */
        fun documentableType(documentableType: DocumentableType) =
            documentableType(JsonField.of(documentableType))

        /**
         * The type of the associated object. Currently can be one of `payment_order`,
         * `transaction`, `paper_item`, `expected_payment`, `counterparty`, `organization`, `case`,
         * `internal_account`, `decision`, or `external_account`.
         */
        fun documentableType(documentableType: JsonField<DocumentableType>) = apply {
            this.documentableType = documentableType
        }

        fun file(file: File) = file(JsonField.of(file))

        fun file(file: JsonField<File>) = apply { this.file = file }

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

        fun object_(object_: String) = object_(JsonField.of(object_))

        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        /** The source of the document. Can be `vendor`, `customer`, or `modern_treasury`. */
        fun source(source: String) = source(JsonField.of(source))

        /** The source of the document. Can be `vendor`, `customer`, or `modern_treasury`. */
        fun source(source: JsonField<String>) = apply { this.source = source }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        fun build(): Document =
            Document(
                checkNotNull(id) { "`id` is required but was not set" },
                checkNotNull(createdAt) { "`createdAt` is required but was not set" },
                checkNotNull(discardedAt) { "`discardedAt` is required but was not set" },
                checkNotNull(documentDetails) { "`documentDetails` is required but was not set" }
                    .map { it.toImmutable() },
                checkNotNull(documentType) { "`documentType` is required but was not set" },
                checkNotNull(documentableId) { "`documentableId` is required but was not set" },
                checkNotNull(documentableType) { "`documentableType` is required but was not set" },
                checkNotNull(file) { "`file` is required but was not set" },
                checkNotNull(liveMode) { "`liveMode` is required but was not set" },
                checkNotNull(object_) { "`object_` is required but was not set" },
                checkNotNull(source) { "`source` is required but was not set" },
                checkNotNull(updatedAt) { "`updatedAt` is required but was not set" },
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class DocumentDetail
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("discarded_at")
        @ExcludeMissing
        private val discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("document_identifier")
        @ExcludeMissing
        private val documentIdentifier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("document_identifier_type")
        @ExcludeMissing
        private val documentIdentifierType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("live_mode")
        @ExcludeMissing
        private val liveMode: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("object")
        @ExcludeMissing
        private val object_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun discardedAt(): Optional<OffsetDateTime> =
            Optional.ofNullable(discardedAt.getNullable("discarded_at"))

        fun documentIdentifier(): String = documentIdentifier.getRequired("document_identifier")

        fun documentIdentifierType(): String =
            documentIdentifierType.getRequired("document_identifier_type")

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(): Boolean = liveMode.getRequired("live_mode")

        fun object_(): String = object_.getRequired("object")

        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        @JsonProperty("discarded_at")
        @ExcludeMissing
        fun _discardedAt(): JsonField<OffsetDateTime> = discardedAt

        @JsonProperty("document_identifier")
        @ExcludeMissing
        fun _documentIdentifier(): JsonField<String> = documentIdentifier

        @JsonProperty("document_identifier_type")
        @ExcludeMissing
        fun _documentIdentifierType(): JsonField<String> = documentIdentifierType

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

        @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): DocumentDetail = apply {
            if (validated) {
                return@apply
            }

            id()
            createdAt()
            discardedAt()
            documentIdentifier()
            documentIdentifierType()
            liveMode()
            object_()
            updatedAt()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var discardedAt: JsonField<OffsetDateTime>? = null
            private var documentIdentifier: JsonField<String>? = null
            private var documentIdentifierType: JsonField<String>? = null
            private var liveMode: JsonField<Boolean>? = null
            private var object_: JsonField<String>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(documentDetail: DocumentDetail) = apply {
                id = documentDetail.id
                createdAt = documentDetail.createdAt
                discardedAt = documentDetail.discardedAt
                documentIdentifier = documentDetail.documentIdentifier
                documentIdentifierType = documentDetail.documentIdentifierType
                liveMode = documentDetail.liveMode
                object_ = documentDetail.object_
                updatedAt = documentDetail.updatedAt
                additionalProperties = documentDetail.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun discardedAt(discardedAt: OffsetDateTime?) =
                discardedAt(JsonField.ofNullable(discardedAt))

            fun discardedAt(discardedAt: Optional<OffsetDateTime>) =
                discardedAt(discardedAt.orElse(null))

            fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
                this.discardedAt = discardedAt
            }

            fun documentIdentifier(documentIdentifier: String) =
                documentIdentifier(JsonField.of(documentIdentifier))

            fun documentIdentifier(documentIdentifier: JsonField<String>) = apply {
                this.documentIdentifier = documentIdentifier
            }

            fun documentIdentifierType(documentIdentifierType: String) =
                documentIdentifierType(JsonField.of(documentIdentifierType))

            fun documentIdentifierType(documentIdentifierType: JsonField<String>) = apply {
                this.documentIdentifierType = documentIdentifierType
            }

            /**
             * This field will be true if this object exists in the live environment or false if it
             * exists in the test environment.
             */
            fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

            /**
             * This field will be true if this object exists in the live environment or false if it
             * exists in the test environment.
             */
            fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

            fun object_(object_: String) = object_(JsonField.of(object_))

            fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): DocumentDetail =
                DocumentDetail(
                    checkNotNull(id) { "`id` is required but was not set" },
                    checkNotNull(createdAt) { "`createdAt` is required but was not set" },
                    checkNotNull(discardedAt) { "`discardedAt` is required but was not set" },
                    checkNotNull(documentIdentifier) {
                        "`documentIdentifier` is required but was not set"
                    },
                    checkNotNull(documentIdentifierType) {
                        "`documentIdentifierType` is required but was not set"
                    },
                    checkNotNull(liveMode) { "`liveMode` is required but was not set" },
                    checkNotNull(object_) { "`object_` is required but was not set" },
                    checkNotNull(updatedAt) { "`updatedAt` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DocumentDetail && id == other.id && createdAt == other.createdAt && discardedAt == other.discardedAt && documentIdentifier == other.documentIdentifier && documentIdentifierType == other.documentIdentifierType && liveMode == other.liveMode && object_ == other.object_ && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, createdAt, discardedAt, documentIdentifier, documentIdentifierType, liveMode, object_, updatedAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DocumentDetail{id=$id, createdAt=$createdAt, discardedAt=$discardedAt, documentIdentifier=$documentIdentifier, documentIdentifierType=$documentIdentifierType, liveMode=$liveMode, object_=$object_, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    class DocumentableType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val CASE = of("case")

            @JvmField val COUNTERPARTY = of("counterparty")

            @JvmField val EXPECTED_PAYMENT = of("expected_payment")

            @JvmField val EXTERNAL_ACCOUNT = of("external_account")

            @JvmField val INCOMING_PAYMENT_DETAIL = of("incoming_payment_detail")

            @JvmField val INTERNAL_ACCOUNT = of("internal_account")

            @JvmField val ORGANIZATION = of("organization")

            @JvmField val PAPER_ITEM = of("paper_item")

            @JvmField val PAYMENT_ORDER = of("payment_order")

            @JvmField val TRANSACTION = of("transaction")

            @JvmField val DECISION = of("decision")

            @JvmField val CONNECTION = of("connection")

            @JvmStatic fun of(value: String) = DocumentableType(JsonField.of(value))
        }

        enum class Known {
            CASE,
            COUNTERPARTY,
            EXPECTED_PAYMENT,
            EXTERNAL_ACCOUNT,
            INCOMING_PAYMENT_DETAIL,
            INTERNAL_ACCOUNT,
            ORGANIZATION,
            PAPER_ITEM,
            PAYMENT_ORDER,
            TRANSACTION,
            DECISION,
            CONNECTION,
        }

        enum class Value {
            CASE,
            COUNTERPARTY,
            EXPECTED_PAYMENT,
            EXTERNAL_ACCOUNT,
            INCOMING_PAYMENT_DETAIL,
            INTERNAL_ACCOUNT,
            ORGANIZATION,
            PAPER_ITEM,
            PAYMENT_ORDER,
            TRANSACTION,
            DECISION,
            CONNECTION,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CASE -> Value.CASE
                COUNTERPARTY -> Value.COUNTERPARTY
                EXPECTED_PAYMENT -> Value.EXPECTED_PAYMENT
                EXTERNAL_ACCOUNT -> Value.EXTERNAL_ACCOUNT
                INCOMING_PAYMENT_DETAIL -> Value.INCOMING_PAYMENT_DETAIL
                INTERNAL_ACCOUNT -> Value.INTERNAL_ACCOUNT
                ORGANIZATION -> Value.ORGANIZATION
                PAPER_ITEM -> Value.PAPER_ITEM
                PAYMENT_ORDER -> Value.PAYMENT_ORDER
                TRANSACTION -> Value.TRANSACTION
                DECISION -> Value.DECISION
                CONNECTION -> Value.CONNECTION
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CASE -> Known.CASE
                COUNTERPARTY -> Known.COUNTERPARTY
                EXPECTED_PAYMENT -> Known.EXPECTED_PAYMENT
                EXTERNAL_ACCOUNT -> Known.EXTERNAL_ACCOUNT
                INCOMING_PAYMENT_DETAIL -> Known.INCOMING_PAYMENT_DETAIL
                INTERNAL_ACCOUNT -> Known.INTERNAL_ACCOUNT
                ORGANIZATION -> Known.ORGANIZATION
                PAPER_ITEM -> Known.PAPER_ITEM
                PAYMENT_ORDER -> Known.PAYMENT_ORDER
                TRANSACTION -> Known.TRANSACTION
                DECISION -> Known.DECISION
                CONNECTION -> Known.CONNECTION
                else -> throw ModernTreasuryInvalidDataException("Unknown DocumentableType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DocumentableType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class File
    @JsonCreator
    private constructor(
        @JsonProperty("content_type")
        @ExcludeMissing
        private val contentType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("filename")
        @ExcludeMissing
        private val filename: JsonField<String> = JsonMissing.of(),
        @JsonProperty("size") @ExcludeMissing private val size: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The MIME content type of the document. */
        fun contentType(): Optional<String> =
            Optional.ofNullable(contentType.getNullable("content_type"))

        /** The original filename of the document. */
        fun filename(): Optional<String> = Optional.ofNullable(filename.getNullable("filename"))

        /** The size of the document in bytes. */
        fun size(): Optional<Long> = Optional.ofNullable(size.getNullable("size"))

        /** The MIME content type of the document. */
        @JsonProperty("content_type")
        @ExcludeMissing
        fun _contentType(): JsonField<String> = contentType

        /** The original filename of the document. */
        @JsonProperty("filename") @ExcludeMissing fun _filename(): JsonField<String> = filename

        /** The size of the document in bytes. */
        @JsonProperty("size") @ExcludeMissing fun _size(): JsonField<Long> = size

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): File = apply {
            if (validated) {
                return@apply
            }

            contentType()
            filename()
            size()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var contentType: JsonField<String> = JsonMissing.of()
            private var filename: JsonField<String> = JsonMissing.of()
            private var size: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(file: File) = apply {
                contentType = file.contentType
                filename = file.filename
                size = file.size
                additionalProperties = file.additionalProperties.toMutableMap()
            }

            /** The MIME content type of the document. */
            fun contentType(contentType: String) = contentType(JsonField.of(contentType))

            /** The MIME content type of the document. */
            fun contentType(contentType: JsonField<String>) = apply {
                this.contentType = contentType
            }

            /** The original filename of the document. */
            fun filename(filename: String) = filename(JsonField.of(filename))

            /** The original filename of the document. */
            fun filename(filename: JsonField<String>) = apply { this.filename = filename }

            /** The size of the document in bytes. */
            fun size(size: Long) = size(JsonField.of(size))

            /** The size of the document in bytes. */
            fun size(size: JsonField<Long>) = apply { this.size = size }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): File =
                File(
                    contentType,
                    filename,
                    size,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is File && contentType == other.contentType && filename == other.filename && size == other.size && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(contentType, filename, size, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "File{contentType=$contentType, filename=$filename, size=$size, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Document && id == other.id && createdAt == other.createdAt && discardedAt == other.discardedAt && documentDetails == other.documentDetails && documentType == other.documentType && documentableId == other.documentableId && documentableType == other.documentableType && file == other.file && liveMode == other.liveMode && object_ == other.object_ && source == other.source && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, createdAt, discardedAt, documentDetails, documentType, documentableId, documentableType, file, liveMode, object_, source, updatedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Document{id=$id, createdAt=$createdAt, discardedAt=$discardedAt, documentDetails=$documentDetails, documentType=$documentType, documentableId=$documentableId, documentableType=$documentableType, file=$file, liveMode=$liveMode, object_=$object_, source=$source, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
