# Modern Treasury Java API Library

<!-- x-release-please-start-version -->

[![Maven Central](https://img.shields.io/maven-central/v/com.moderntreasury.api/modern-treasury-java)](https://central.sonatype.com/artifact/com.moderntreasury.api/modern-treasury-java/5.0.0)

<!-- x-release-please-end -->

The Modern Treasury Java SDK provides convenient access to the Modern Treasury REST API from applications written in Java.

The Modern Treasury Java SDK is similar to the Modern Treasury Kotlin SDK but with minor differences that make it more ergonomic for use in Java, such as `Optional` instead of nullable values, `Stream` instead of `Sequence`, and `CompletableFuture` instead of suspend functions.

The REST API documentation can be found on [docs.moderntreasury.com](https://docs.moderntreasury.com).

## Installation

<!-- x-release-please-start-version -->

### Gradle

```kotlin
implementation("com.moderntreasury:modern-treasury-java:5.0.0")
```

### Maven

```xml
<dependency>
    <groupId>com.moderntreasury</groupId>
    <artifactId>modern-treasury-java</artifactId>
    <version>5.0.0</version>
</dependency>
```

<!-- x-release-please-end -->

## Requirements

This library requires Java 8 or later.

## Usage

```java
import com.moderntreasury.api.client.ModernTreasuryClient;
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient;
import com.moderntreasury.api.models.Counterparty;
import com.moderntreasury.api.models.CounterpartyCreateParams;

// Configures using the `MODERN_TREASURY_API_KEY`, `MODERN_TREASURY_ORGANIZATION_ID` and `MODERN_TREASURY_WEBHOOK_KEY` environment variables
ModernTreasuryClient client = ModernTreasuryOkHttpClient.fromEnv();

CounterpartyCreateParams params = CounterpartyCreateParams.builder()
    .name("my first counterparty")
    .build();
Counterparty counterparty = client.counterparties().create(params);
```

## Client configuration

Configure the client using environment variables:

```java
import com.moderntreasury.api.client.ModernTreasuryClient;
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient;

// Configures using the `MODERN_TREASURY_API_KEY`, `MODERN_TREASURY_ORGANIZATION_ID` and `MODERN_TREASURY_WEBHOOK_KEY` environment variables
ModernTreasuryClient client = ModernTreasuryOkHttpClient.fromEnv();
```

Or manually:

```java
import com.moderntreasury.api.client.ModernTreasuryClient;
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient;

ModernTreasuryClient client = ModernTreasuryOkHttpClient.builder()
    .apiKey("My API Key")
    .organizationId("my-organization-ID")
    .build();
```

Or using a combination of the two approaches:

```java
import com.moderntreasury.api.client.ModernTreasuryClient;
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient;

ModernTreasuryClient client = ModernTreasuryOkHttpClient.builder()
    // Configures using the `MODERN_TREASURY_API_KEY`, `MODERN_TREASURY_ORGANIZATION_ID` and `MODERN_TREASURY_WEBHOOK_KEY` environment variables
    .fromEnv()
    .apiKey("My API Key")
    .build();
```

See this table for the available options:

| Setter           | Environment variable              | Required | Default value |
| ---------------- | --------------------------------- | -------- | ------------- |
| `apiKey`         | `MODERN_TREASURY_API_KEY`         | true     | -             |
| `organizationId` | `MODERN_TREASURY_ORGANIZATION_ID` | true     | -             |
| `webhookKey`     | `MODERN_TREASURY_WEBHOOK_KEY`     | false    | -             |

> [!TIP]
> Don't create more than one client in the same application. Each client has a connection pool and
> thread pools, which are more efficient to share between requests.

## Requests and responses

To send a request to the Modern Treasury API, build an instance of some `Params` class and pass it to the corresponding client method. When the response is received, it will be deserialized into an instance of a Java class.

For example, `client.counterparties().create(...)` should be called with an instance of `CounterpartyCreateParams`, and it will return an instance of `Counterparty`.

## Asynchronous execution

The default client is synchronous. To switch to asynchronous execution, call the `async()` method:

```java
import com.moderntreasury.api.client.ModernTreasuryClient;
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient;
import com.moderntreasury.api.models.Counterparty;
import com.moderntreasury.api.models.CounterpartyCreateParams;
import java.util.concurrent.CompletableFuture;

// Configures using the `MODERN_TREASURY_API_KEY`, `MODERN_TREASURY_ORGANIZATION_ID` and `MODERN_TREASURY_WEBHOOK_KEY` environment variables
ModernTreasuryClient client = ModernTreasuryOkHttpClient.fromEnv();

CounterpartyCreateParams params = CounterpartyCreateParams.builder()
    .name("my first counterparty")
    .build();
CompletableFuture<Counterparty> counterparty = client.async().counterparties().create(params);
```

Or create an asynchronous client from the beginning:

```java
import com.moderntreasury.api.client.ModernTreasuryClientAsync;
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClientAsync;
import com.moderntreasury.api.models.Counterparty;
import com.moderntreasury.api.models.CounterpartyCreateParams;
import java.util.concurrent.CompletableFuture;

// Configures using the `MODERN_TREASURY_API_KEY`, `MODERN_TREASURY_ORGANIZATION_ID` and `MODERN_TREASURY_WEBHOOK_KEY` environment variables
ModernTreasuryClientAsync client = ModernTreasuryOkHttpClientAsync.fromEnv();

CounterpartyCreateParams params = CounterpartyCreateParams.builder()
    .name("my first counterparty")
    .build();
CompletableFuture<Counterparty> counterparty = client.counterparties().create(params);
```

The asynchronous client supports the same options as the synchronous one, except most methods return `CompletableFuture`s.

## Error handling

The SDK throws custom unchecked exception types:

- `ModernTreasuryServiceException`: Base class for HTTP errors. See this table for which exception subclass is thrown for each HTTP status code:

  | Status | Exception                       |
  | ------ | ------------------------------- |
  | 400    | `BadRequestException`           |
  | 401    | `AuthenticationException`       |
  | 403    | `PermissionDeniedException`     |
  | 404    | `NotFoundException`             |
  | 422    | `UnprocessableEntityException`  |
  | 429    | `RateLimitException`            |
  | 5xx    | `InternalServerException`       |
  | others | `UnexpectedStatusCodeException` |

- `ModernTreasuryIoException`: I/O networking errors.

- `ModernTreasuryInvalidDataException`: Failure to interpret successfully parsed data. For example, when accessing a property that's supposed to be required, but the API unexpectedly omitted it from the response.

- `ModernTreasuryException`: Base class for all exceptions. Most errors will result in one of the previously mentioned ones, but completely generic errors may be thrown using the base class.

## Pagination

For methods that return a paginated list of results, this library provides convenient ways access the results either one page at a time, or item-by-item across all pages.

### Auto-pagination

To iterate through all results across all pages, you can use `autoPager`, which automatically handles fetching more pages for you:

### Synchronous

```java
import com.moderntreasury.api.models.Counterparty;
import com.moderntreasury.api.models.CounterpartyListPage;

// As an Iterable:
CounterpartyListPage page = client.counterparties().list(params);
for (Counterparty counterparty : page.autoPager()) {
    System.out.println(counterparty);
};

// As a Stream:
client.counterparties().list(params).autoPager().stream()
    .limit(50)
    .forEach(counterparty -> System.out.println(counterparty));
```

### Asynchronous

```java
// Using forEach, which returns CompletableFuture<Void>:
asyncClient.counterparties().list(params).autoPager()
    .forEach(counterparty -> System.out.println(counterparty), executor);
```

### Manual pagination

If none of the above helpers meet your needs, you can also manually request pages one-by-one. A page of results has a `data()` method to fetch the list of objects, as well as top-level `response` and other methods to fetch top-level data about the page. It also has methods `hasNextPage`, `getNextPage`, and `getNextPageParams` methods to help with pagination.

```java
import com.moderntreasury.api.models.Counterparty;
import com.moderntreasury.api.models.CounterpartyListPage;

CounterpartyListPage page = client.counterparties().list(params);
while (page != null) {
    for (Counterparty counterparty : page.items()) {
        System.out.println(counterparty);
    }

    page = page.getNextPage().orElse(null);
}
```

## Logging

The SDK uses the standard [OkHttp logging interceptor](https://github.com/square/okhttp/tree/master/okhttp-logging-interceptor).

Enable logging by setting the `MODERN_TREASURY_LOG` environment variable to `info`:

```sh
$ export MODERN_TREASURY_LOG=info
```

Or to `debug` for more verbose logging:

```sh
$ export MODERN_TREASURY_LOG=debug
```

## Network options

### Retries

The SDK automatically retries 2 times by default, with a short exponential backoff.

Only the following error types are retried:

- Connection errors (for example, due to a network connectivity problem)
- 408 Request Timeout
- 409 Conflict
- 429 Rate Limit
- 5xx Internal

The API may also explicitly instruct the SDK to retry or not retry a response.

To set a custom number of retries, configure the client using the `maxRetries` method:

```java
import com.moderntreasury.api.client.ModernTreasuryClient;
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient;

ModernTreasuryClient client = ModernTreasuryOkHttpClient.builder()
    .fromEnv()
    .maxRetries(4)
    .build();
```

### Timeouts

Requests time out after 1 minute by default.

To set a custom timeout, configure the method call using the `timeout` method:

```java
import com.moderntreasury.api.models.Counterparty;
import com.moderntreasury.api.models.CounterpartyCreateParams;

Counterparty counterparty = client.counterparties().create(
  params, RequestOptions.builder().timeout(Duration.ofSeconds(30)).build()
);
```

Or configure the default for all method calls at the client level:

```java
import com.moderntreasury.api.client.ModernTreasuryClient;
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient;
import java.time.Duration;

ModernTreasuryClient client = ModernTreasuryOkHttpClient.builder()
    .fromEnv()
    .timeout(Duration.ofSeconds(30))
    .build();
```

### Proxies

To route requests through a proxy, configure the client using the `proxy` method:

```java
import com.moderntreasury.api.client.ModernTreasuryClient;
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient;
import java.net.InetSocketAddress;
import java.net.Proxy;

ModernTreasuryClient client = ModernTreasuryOkHttpClient.builder()
    .fromEnv()
    .proxy(new Proxy(
      Proxy.Type.HTTP, new InetSocketAddress(
        "https://example.com", 8080
      )
    ))
    .build();
```

## Undocumented API functionality

The SDK is typed for convenient usage of the documented API. However, it also supports working with undocumented or not yet supported parts of the API.

### Parameters

To set undocumented parameters, call the `putAdditionalHeader`, `putAdditionalQueryParam`, or `putAdditionalBodyProperty` methods on any `Params` class:

```java
import com.moderntreasury.api.core.JsonValue;
import com.moderntreasury.api.models.CounterpartyCreateParams;

CounterpartyCreateParams params = CounterpartyCreateParams.builder()
    .putAdditionalHeader("Secret-Header", "42")
    .putAdditionalQueryParam("secret_query_param", "42")
    .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
    .build();
```

These can be accessed on the built object later using the `_additionalHeaders()`, `_additionalQueryParams()`, and `_additionalBodyProperties()` methods. You can also set undocumented parameters on nested headers, query params, or body classes using the `putAdditionalProperty` method. These properties can be accessed on the built object later using the `_additionalProperties()` method.

To set a documented parameter or property to an undocumented or not yet supported _value_, pass a `JsonValue` object to its setter:

```java
import com.moderntreasury.api.core.JsonValue;
import com.moderntreasury.api.models.CounterpartyCreateParams;

CounterpartyCreateParams params = CounterpartyCreateParams.builder()
    .name(JsonValue.from(42))
    .build();
```

### Response properties

To access undocumented response properties, call the `_additionalProperties()` method:

```java
import com.moderntreasury.api.core.JsonValue;
import java.util.Map;

Map<String, JsonValue> additionalProperties = client.counterparties().create(params)._additionalProperties();
JsonValue secretPropertyValue = additionalProperties.get("secretProperty");

String result = secretPropertyValue.accept(new JsonValue.Visitor<>() {
    @Override
    public String visitNull() {
        return "It's null!";
    }

    @Override
    public String visitBoolean(boolean value) {
        return "It's a boolean!";
    }

    @Override
    public String visitNumber(Number value) {
        return "It's a number!";
    }

    // Other methods include `visitMissing`, `visitString`, `visitArray`, and `visitObject`
    // The default implementation of each unimplemented method delegates to `visitDefault`, which throws by default, but can also be overridden
});
```

To access a property's raw JSON value, which may be undocumented, call its `_` prefixed method:

```java
import com.moderntreasury.api.core.JsonField;
import java.util.Optional;

JsonField<String> name = client.counterparties().create(params)._name();

if (name.isMissing()) {
  // The property is absent from the JSON response
} else if (name.isNull()) {
  // The property was set to literal null
} else {
  // Check if value was provided as a string
  // Other methods include `asNumber()`, `asBoolean()`, etc.
  Optional<String> jsonString = name.asString();

  // Try to deserialize into a custom type
  MyClass myObject = name.asUnknown().orElseThrow().convert(MyClass.class);
}
```

### Response validation

In rare cases, the API may return a response that doesn't match the expected type. For example, the SDK may expect a property to contain a `String`, but the API could return something else.

By default, the SDK will not throw an exception in this case. It will throw `ModernTreasuryInvalidDataException` only if you directly access the property.

If you would prefer to check that the response is completely well-typed upfront, then either call `validate()`:

```java
import com.moderntreasury.api.models.Counterparty;

Counterparty counterparty = client.counterparties().create(params).validate();
```

Or configure the method call to validate the response using the `responseValidation` method:

```java
import com.moderntreasury.api.models.Counterparty;
import com.moderntreasury.api.models.CounterpartyCreateParams;

Counterparty counterparty = client.counterparties().create(
  params, RequestOptions.builder().responseValidation(true).build()
);
```

Or configure the default for all method calls at the client level:

```java
import com.moderntreasury.api.client.ModernTreasuryClient;
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient;

ModernTreasuryClient client = ModernTreasuryOkHttpClient.builder()
    .fromEnv()
    .responseValidation(true)
    .build();
```

## FAQ

### Why don't you use plain `enum` classes?

Java `enum` classes are not trivially [forwards compatible](https://www.stainless.com/blog/making-java-enums-forwards-compatible). Using them in the SDK could cause runtime exceptions if the API is updated to respond with a new enum value.

### Why do you represent fields using `JsonField<T>` instead of just plain `T`?

Using `JsonField<T>` enables a few features:

- Allowing usage of [undocumented API functionality](#undocumented-api-functionality)
- Lazily [validating the API response against the expected shape](#response-validation)
- Representing absent vs explicitly null values

### Why don't you use [`data` classes](https://kotlinlang.org/docs/data-classes.html)?

It is not [backwards compatible to add new fields to a data class](https://kotlinlang.org/docs/api-guidelines-backward-compatibility.html#avoid-using-data-classes-in-your-api) and we don't want to introduce a breaking change every time we add a field to a class.

### Why don't you use checked exceptions?

Checked exceptions are widely considered a mistake in the Java programming language. In fact, they were omitted from Kotlin for this reason.

Checked exceptions:

- Are verbose to handle
- Encourage error handling at the wrong level of abstraction, where nothing can be done about the error
- Are tedious to propagate due to the [function coloring problem](https://journal.stuffwithstuff.com/2015/02/01/what-color-is-your-function)
- Don't play well with lambdas (also due to the function coloring problem)

## Semantic versioning

This package generally follows [SemVer](https://semver.org/spec/v2.0.0.html) conventions, though certain backwards-incompatible changes may be released as minor versions:

1. Changes to library internals which are technically public but not intended or documented for external use. _(Please open a GitHub issue to let us know if you are relying on such internals.)_
2. Changes that we do not expect to impact the vast majority of users in practice.

We take backwards-compatibility seriously and work hard to ensure you can rely on a smooth upgrade experience.

We are keen for your feedback; please open an [issue](https://www.github.com/Modern-Treasury/modern-treasury-java/issues) with questions, bugs, or suggestions.
