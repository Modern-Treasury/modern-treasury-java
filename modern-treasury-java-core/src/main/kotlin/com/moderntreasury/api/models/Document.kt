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
    @JsonProperty("object")
    @ExcludeMissing
    private val object_: JsonField<String> = JsonMissing.of(),
    @JsonProperty("live_mode")
    @ExcludeMissing
    private val liveMode: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("discarded_at")
    @ExcludeMissing
    private val discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("document_type")
    @ExcludeMissing
    private val documentType: JsonField<String> = JsonMissing.of(),
    @JsonProperty("source")
    @ExcludeMissing
    private val source: JsonField<String> = JsonMissing.of(),
    @JsonProperty("documentable_id")
    @ExcludeMissing
    private val documentableId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("documentable_type")
    @ExcludeMissing
    private val documentableType: JsonField<DocumentableType> = JsonMissing.of(),
    @JsonProperty("document_details")
    @ExcludeMissing
    private val documentDetails: JsonField<List<DocumentDetail>> = JsonMissing.of(),
    @JsonProperty("file") @ExcludeMissing private val file: JsonField<File> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    fun object_(): String = object_.getRequired("object")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    fun discardedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(discardedAt.getNullable("discarded_at"))

    /** A category given to the document, can be `null`. */
    fun documentType(): Optional<String> =
        Optional.ofNullable(documentType.getNullable("document_type"))

    /** The source of the document. Can be `vendor`, `customer`, or `modern_treasury`. */
    fun source(): String = source.getRequired("source")

    /** The unique identifier for the associated object. */
    fun documentableId(): String = documentableId.getRequired("documentable_id")

    /**
     * The type of the associated object. Currently can be one of `payment_order`, `transaction`,
     * `paper_item`, `expected_payment`, `counterparty`, `organization`, `case`, `internal_account`,
     * `decision`, or `external_account`.
     */
    fun documentableType(): DocumentableType = documentableType.getRequired("documentable_type")

    fun documentDetails(): List<DocumentDetail> = documentDetails.getRequired("document_details")

    fun file(): File = file.getRequired("file")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("object") @ExcludeMissing fun _object_() = object_

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    @JsonProperty("discarded_at") @ExcludeMissing fun _discardedAt() = discardedAt

    /** A category given to the document, can be `null`. */
    @JsonProperty("document_type") @ExcludeMissing fun _documentType() = documentType

    /** The source of the document. Can be `vendor`, `customer`, or `modern_treasury`. */
    @JsonProperty("source") @ExcludeMissing fun _source() = source

    /** The unique identifier for the associated object. */
    @JsonProperty("documentable_id") @ExcludeMissing fun _documentableId() = documentableId

    /**
     * The type of the associated object. Currently can be one of `payment_order`, `transaction`,
     * `paper_item`, `expected_payment`, `counterparty`, `organization`, `case`, `internal_account`,
     * `decision`, or `external_account`.
     */
    @JsonProperty("documentable_type") @ExcludeMissing fun _documentableType() = documentableType

    @JsonProperty("document_details") @ExcludeMissing fun _documentDetails() = documentDetails

    @JsonProperty("file") @ExcludeMissing fun _file() = file

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Document = apply {
        if (!validated) {
            id()
            object_()
            liveMode()
            createdAt()
            updatedAt()
            discardedAt()
            documentType()
            source()
            documentableId()
            documentableType()
            documentDetails().forEach { it.validate() }
            file().validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var object_: JsonField<String> = JsonMissing.of()
        private var liveMode: JsonField<Boolean> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var discardedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var documentType: JsonField<String> = JsonMissing.of()
        private var source: JsonField<String> = JsonMissing.of()
        private var documentableId: JsonField<String> = JsonMissing.of()
        private var documentableType: JsonField<DocumentableType> = JsonMissing.of()
        private var documentDetails: JsonField<List<DocumentDetail>> = JsonMissing.of()
        private var file: JsonField<File> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(document: Document) = apply {
            id = document.id
            object_ = document.object_
            liveMode = document.liveMode
            createdAt = document.createdAt
            updatedAt = document.updatedAt
            discardedAt = document.discardedAt
            documentType = document.documentType
            source = document.source
            documentableId = document.documentableId
            documentableType = document.documentableType
            documentDetails = document.documentDetails
            file = document.file
            additionalProperties = document.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun object_(object_: String) = object_(JsonField.of(object_))

        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

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

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun discardedAt(discardedAt: OffsetDateTime) = discardedAt(JsonField.of(discardedAt))

        fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
            this.discardedAt = discardedAt
        }

        /** A category given to the document, can be `null`. */
        fun documentType(documentType: String) = documentType(JsonField.of(documentType))

        /** A category given to the document, can be `null`. */
        fun documentType(documentType: JsonField<String>) = apply {
            this.documentType = documentType
        }

        /** The source of the document. Can be `vendor`, `customer`, or `modern_treasury`. */
        fun source(source: String) = source(JsonField.of(source))

        /** The source of the document. Can be `vendor`, `customer`, or `modern_treasury`. */
        fun source(source: JsonField<String>) = apply { this.source = source }

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

        fun documentDetails(documentDetails: List<DocumentDetail>) =
            documentDetails(JsonField.of(documentDetails))

        fun documentDetails(documentDetails: JsonField<List<DocumentDetail>>) = apply {
            this.documentDetails = documentDetails
        }

        fun file(file: File) = file(JsonField.of(file))

        fun file(file: JsonField<File>) = apply { this.file = file }

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
                id,
                object_,
                liveMode,
                createdAt,
                updatedAt,
                discardedAt,
                documentType,
                source,
                documentableId,
                documentableType,
                documentDetails.map { it.toImmutable() },
                file,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class DocumentDetail
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("object")
        @ExcludeMissing
        private val object_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("live_mode")
        @ExcludeMissing
        private val liveMode: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("discarded_at")
        @ExcludeMissing
        private val discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("document_identifier_type")
        @ExcludeMissing
        private val documentIdentifierType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("document_identifier")
        @ExcludeMissing
        private val documentIdentifier: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun object_(): String = object_.getRequired("object")

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(): Boolean = liveMode.getRequired("live_mode")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

        fun discardedAt(): Optional<OffsetDateTime> =
            Optional.ofNullable(discardedAt.getNullable("discarded_at"))

        fun documentIdentifierType(): String =
            documentIdentifierType.getRequired("document_identifier_type")

        fun documentIdentifier(): String = documentIdentifier.getRequired("document_identifier")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("object") @ExcludeMissing fun _object_() = object_

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

        @JsonProperty("discarded_at") @ExcludeMissing fun _discardedAt() = discardedAt

        @JsonProperty("document_identifier_type")
        @ExcludeMissing
        fun _documentIdentifierType() = documentIdentifierType

        @JsonProperty("document_identifier")
        @ExcludeMissing
        fun _documentIdentifier() = documentIdentifier

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): DocumentDetail = apply {
            if (!validated) {
                id()
                object_()
                liveMode()
                createdAt()
                updatedAt()
                discardedAt()
                documentIdentifierType()
                documentIdentifier()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var object_: JsonField<String> = JsonMissing.of()
            private var liveMode: JsonField<Boolean> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var discardedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var documentIdentifierType: JsonField<String> = JsonMissing.of()
            private var documentIdentifier: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(documentDetail: DocumentDetail) = apply {
                id = documentDetail.id
                object_ = documentDetail.object_
                liveMode = documentDetail.liveMode
                createdAt = documentDetail.createdAt
                updatedAt = documentDetail.updatedAt
                discardedAt = documentDetail.discardedAt
                documentIdentifierType = documentDetail.documentIdentifierType
                documentIdentifier = documentDetail.documentIdentifier
                additionalProperties = documentDetail.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun object_(object_: String) = object_(JsonField.of(object_))

            fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

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

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            fun discardedAt(discardedAt: OffsetDateTime) = discardedAt(JsonField.of(discardedAt))

            fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
                this.discardedAt = discardedAt
            }

            fun documentIdentifierType(documentIdentifierType: String) =
                documentIdentifierType(JsonField.of(documentIdentifierType))

            fun documentIdentifierType(documentIdentifierType: JsonField<String>) = apply {
                this.documentIdentifierType = documentIdentifierType
            }

            fun documentIdentifier(documentIdentifier: String) =
                documentIdentifier(JsonField.of(documentIdentifier))

            fun documentIdentifier(documentIdentifier: JsonField<String>) = apply {
                this.documentIdentifier = documentIdentifier
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
                    id,
                    object_,
                    liveMode,
                    createdAt,
                    updatedAt,
                    discardedAt,
                    documentIdentifierType,
                    documentIdentifier,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DocumentDetail && id == other.id && object_ == other.object_ && liveMode == other.liveMode && createdAt == other.createdAt && updatedAt == other.updatedAt && discardedAt == other.discardedAt && documentIdentifierType == other.documentIdentifierType && documentIdentifier == other.documentIdentifier && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, object_, liveMode, createdAt, updatedAt, discardedAt, documentIdentifierType, documentIdentifier, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DocumentDetail{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, discardedAt=$discardedAt, documentIdentifierType=$documentIdentifierType, documentIdentifier=$documentIdentifier, additionalProperties=$additionalProperties}"
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
        @JsonProperty("size") @ExcludeMissing private val size: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("filename")
        @ExcludeMissing
        private val filename: JsonField<String> = JsonMissing.of(),
        @JsonProperty("content_type")
        @ExcludeMissing
        private val contentType: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The size of the document in bytes. */
        fun size(): Optional<Long> = Optional.ofNullable(size.getNullable("size"))

        /** The original filename of the document. */
        fun filename(): Optional<String> = Optional.ofNullable(filename.getNullable("filename"))

        /** The MIME content type of the document. */
        fun contentType(): Optional<String> =
            Optional.ofNullable(contentType.getNullable("content_type"))

        /** The size of the document in bytes. */
        @JsonProperty("size") @ExcludeMissing fun _size() = size

        /** The original filename of the document. */
        @JsonProperty("filename") @ExcludeMissing fun _filename() = filename

        /** The MIME content type of the document. */
        @JsonProperty("content_type") @ExcludeMissing fun _contentType() = contentType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): File = apply {
            if (!validated) {
                size()
                filename()
                contentType()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var size: JsonField<Long> = JsonMissing.of()
            private var filename: JsonField<String> = JsonMissing.of()
            private var contentType: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(file: File) = apply {
                size = file.size
                filename = file.filename
                contentType = file.contentType
                additionalProperties = file.additionalProperties.toMutableMap()
            }

            /** The size of the document in bytes. */
            fun size(size: Long) = size(JsonField.of(size))

            /** The size of the document in bytes. */
            fun size(size: JsonField<Long>) = apply { this.size = size }

            /** The original filename of the document. */
            fun filename(filename: String) = filename(JsonField.of(filename))

            /** The original filename of the document. */
            fun filename(filename: JsonField<String>) = apply { this.filename = filename }

            /** The MIME content type of the document. */
            fun contentType(contentType: String) = contentType(JsonField.of(contentType))

            /** The MIME content type of the document. */
            fun contentType(contentType: JsonField<String>) = apply {
                this.contentType = contentType
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

            fun build(): File =
                File(
                    size,
                    filename,
                    contentType,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is File && size == other.size && filename == other.filename && contentType == other.contentType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(size, filename, contentType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "File{size=$size, filename=$filename, contentType=$contentType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Document && id == other.id && object_ == other.object_ && liveMode == other.liveMode && createdAt == other.createdAt && updatedAt == other.updatedAt && discardedAt == other.discardedAt && documentType == other.documentType && source == other.source && documentableId == other.documentableId && documentableType == other.documentableType && documentDetails == other.documentDetails && file == other.file && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, object_, liveMode, createdAt, updatedAt, discardedAt, documentType, source, documentableId, documentableType, documentDetails, file, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Document{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, discardedAt=$discardedAt, documentType=$documentType, source=$source, documentableId=$documentableId, documentableType=$documentableType, documentDetails=$documentDetails, file=$file, additionalProperties=$additionalProperties}"
}
