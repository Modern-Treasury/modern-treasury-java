# Modern Treasury Java API Library

<!-- x-release-please-start-version -->

[![Maven Central](https://img.shields.io/maven-central/v/com.moderntreasury.api/modern-treasury-java)](https://central.sonatype.com/artifact/com.moderntreasury.api/modern-treasury-java/1.4.1)

<!-- x-release-please-end -->

The Modern Treasury Java SDK provides convenient access to the Modern Treasury REST API from applications written in Java. It includes helper classes with helpful types and documentation for every request and response property.

This package is currently in beta (pre-v1.0.0). We expect some breaking changes to rarely-used areas of the SDK, and appreciate your [feedback](https://www.github.com/Modern-Treasury/modern-treasury-java/issues).

The Modern Treasury Java SDK is similar to the Modern Treasury Kotlin SDK but with minor differences that make it more ergonomic for use in Java, such as `Optional` instead of nullable values, `Stream` instead of `Sequence`, and `CompletableFuture` instead of suspend functions.

## Documentation

The API documentation can be found [here](https://docs.moderntreasury.com).

---

## Getting started

### Install dependencies

#### Gradle

<!-- x-release-please-start-version -->

```kotlin
implementation("com.moderntreasury.api:modern-treasury-java:1.4.1")
```

#### Maven

```xml
<dependency>
    <groupId>com.moderntreasury.api</groupId>
    <artifactId>modern-treasury-java</artifactId>
    <version>1.4.1</version>
</dependency>
```

<!-- x-release-please-end -->

### Configure the client

Use `ModernTreasuryOkHttpClient.builder()` to configure the client. At a minimum you need to set `.apiKey()` and `.organizationId()`:

```java
import com.moderntreasury.api.client.ModernTreasuryClient;
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient;

ModernTreasuryClient client = ModernTreasuryOkHttpClient.builder()
    .apiKey("<your API Key>")
    .organizationId("my-organization-ID")
    .build();
```

Alternately, use `ModernTreasuryOkHttpClient.fromEnv()` to read client arguments from environment variables:

```java
ModernTreasuryClient client = ModernTreasuryOkHttpClient.fromEnv();

// Note: you can also call fromEnv() from the client builder, for example if you need to set additional properties
ModernTreasuryClient client = ModernTreasuryOkHttpClient.builder()
    .fromEnv()
    // ... set properties on the builder
    .build();
```

| Property       | Environment variable              | Required | Default value |
| -------------- | --------------------------------- | -------- | ------------- |
| apiKey         | `MODERN_TREASURY_API_KEY`         | true     | —             |
| organizationId | `MODERN_TREASURY_ORGANIZATION_ID` | true     | —             |
| webhookKey     | `MODERN_TREASURY_WEBHOOK_KEY`     | false    | —             |

Read the documentation for more configuration options.

---

## Example project

There's an example project in `modern-treasury-java-example`. You can run the
example with:

```
./gradlew :modern-treasury-java-example:run
```

### Example: creating a resource

To create a new external account, first use the `ExternalAccountCreateParams` builder to specify attributes,
then pass that to the `create` method of the `externalAccounts` service.

```java
import com.moderntreasury.api.models.ExternalAccount;
import com.moderntreasury.api.models.ExternalAccountCreateParams;

ExternalAccountCreateParams params = ExternalAccountCreateParams.builder()
    .counterpartyId("9eba513a-53fd-4d6d-ad52-ccce122ab92a")
    .name("my bank")
    .build();
ExternalAccount externalAccount = client.externalAccounts().create(params);
```

### Example: listing resources

The Modern Treasury API provides a `list` method to get a paginated list of external accounts.
You can retrieve the first page by:

```java
import com.moderntreasury.api.models.ExternalAccount;
import com.moderntreasury.api.models.Page;

ExternalAccountListPage page = client.externalAccounts().list();
for (ExternalAccount externalAccount : page.items()) {
    System.out.println(externalAccount);
}
```

See [Pagination](#pagination) below for more information on transparently working with lists of objects without worrying about fetching each page.

---

## Requests

### Parameters and bodies

To make a request to the Modern Treasury API, you generally build an instance of the appropriate `Params` class.

In [Example: creating a resource](#example-creating-a-resource) above, we used the `ExternalAccountCreateParams.builder()` to pass to
the `create` method of the `externalAccounts` service.

Sometimes, the API may support other properties that are not yet supported in the Java SDK types. In that case,
you can attach them using the `putAdditionalProperty` method.

```java
ExternalAccountCreateParams params = ExternalAccountCreateParams.builder()
    // ... normal properties
    .putAdditionalProperty("secret_param", "4242")
    .build();
```

## Responses

### Response validation

When receiving a response, the Modern Treasury Java SDK will deserialize it into instances of the typed model classes. In rare cases, the API may return a response property that doesn't match the expected Java type. If you directly access the mistaken property, the SDK will throw an unchecked `ModernTreasuryInvalidDataException` at runtime. If you would prefer to check in advance that that response is completely well-typed, call `.validate()` on the returned model.

```java
ExternalAccount externalAccount = client.externalAccounts().create().validate();
```

### Response properties as JSON

In rare cases, you may want to access the underlying JSON value for a response property rather than using the typed version provided by
this SDK. Each model property has a corresponding JSON version, with an underscore before the method name, which returns a `JsonField` value.

```java
JsonField field = responseObj._field();

if (field.isMissing()) {
  // Value was not specified in the JSON response
} else if (field.isNull()) {
  // Value was provided as a literal null
} else {
  // See if value was provided as a string
  Optional<String> jsonString = field.asString();

  // If the value given by the API did not match the shape that the SDK expects
  // you can deserialise into a custom type
  MyClass myObj = responseObj._field().asUnknown().orElseThrow().convert(MyClass.class);
}
```

### Additional model properties

Sometimes, the server response may include additional properties that are not yet available in this library's types. You can access them using the model's `_additionalProperties` method:

```java
JsonValue secret = externalAccount._additionalProperties().get("secret_field");
```

---

## Pagination

For methods that return a paginated list of results, this library provides convenient ways access
the results either one page at a time, or item-by-item across all pages.

### Auto-pagination

To iterate through all results across all pages, you can use `autoPager`,
which automatically handles fetching more pages for you:

### Synchronous

```java
// As an Iterable:
ExternalAccountListPage page = client.externalAccounts().list(params);
for (ExternalAccount externalAccount : page.autoPager()) {
    System.out.println(externalAccount);
};

// As a Stream:
client.externalAccounts().list(params).autoPager().stream()
    .limit(50)
    .forEach(externalAccount -> System.out.println(externalAccount));
```

### Asynchronous

```java
// Using forEach, which returns CompletableFuture<Void>:
asyncClient.externalAccounts().list(params).autoPager()
    .forEach(externalAccount -> System.out.println(externalAccount), executor);
```

### Manual pagination

If none of the above helpers meet your needs, you can also manually request pages one-by-one.
A page of results has a `data()` method to fetch the list of objects, as well as top-level
`response` and other methods to fetch top-level data about the page. It also has methods
`hasNextPage`, `getNextPage`, and `getNextPageParams` methods to help with pagination.

```java
ExternalAccountListPage page = client.externalAccounts().list(params);
while (page != null) {
    for (ExternalAccount externalAccount : page.items()) {
        System.out.println(externalAccount);
    }

    page = page.getNextPage().orElse(null);
}
```

---

## Error handling

This library throws exceptions in a single hierarchy for easy handling:

- **`ModernTreasuryException`** - Base exception for all exceptions

  - **`ModernTreasuryServiceException`** - HTTP errors with a well-formed response body we were able to parse. The exception message and the `.debuggingRequestId()` will be set by the server.

    | 400    | BadRequestException           |
    | ------ | ----------------------------- |
    | 401    | AuthenticationException       |
    | 403    | PermissionDeniedException     |
    | 404    | NotFoundException             |
    | 422    | UnprocessableEntityException  |
    | 429    | RateLimitException            |
    | 5xx    | InternalServerException       |
    | others | UnexpectedStatusCodeException |

  - **`ModernTreasuryIoException`** - I/O networking errors
  - **`ModernTreasuryInvalidDataException`** - any other exceptions on the client side, e.g.:
    - We failed to serialize the request body
    - We failed to parse the response body (has access to response code and body)

## Network options

### Retries

Requests that experience certain errors are automatically retried 2 times by default, with a short exponential backoff. Connection errors (for example, due to a network connectivity problem), 409 Conflict, 429 Rate Limit, and >=500 Internal errors will all be retried by default.
You can provide a `maxRetries` on the client builder to configure this:

```java
ModernTreasuryClient client = ModernTreasuryOkHttpClient.builder()
    .fromEnv()
    .maxRetries(4)
    .build();
```

### Timeouts

Requests time out after 1 minute by default. You can configure this on the client builder:

```java
ModernTreasuryClient client = ModernTreasuryOkHttpClient.builder()
    .fromEnv()
    .timeout(Duration.ofSeconds(30))
    .build();
```

### Proxies

Requests can be routed through a proxy. You can configure this on the client builder:

```java
ModernTreasuryClient client = ModernTreasuryOkHttpClient.builder()
    .fromEnv()
    .proxy(new Proxy(
        Type.HTTP,
        new InetSocketAddress("proxy.com", 8080)
    ))
    .build();
```
