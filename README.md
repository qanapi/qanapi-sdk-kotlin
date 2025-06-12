# Qanapi Kotlin API Library

[![Maven Central](https://img.shields.io/maven-central/v/com.qanapi.api/qanapi-kotlin)](https://central.sonatype.com/artifact/com.qanapi.api/qanapi-kotlin/0.0.1-alpha.0)
[![javadoc](https://javadoc.io/badge2/com.qanapi.api/qanapi-kotlin/0.0.1-alpha.0/javadoc.svg)](https://javadoc.io/doc/com.qanapi.api/qanapi-kotlin/0.0.1-alpha.0)

The Qanapi Kotlin SDK provides convenient access to the Qanapi REST API from applications written in Kotlin.

It is generated with [Stainless](https://www.stainless.com/).

KDocs are available on [javadoc.io](https://javadoc.io/doc/com.qanapi.api/qanapi-kotlin/0.0.1-alpha.0).

## Installation

### Gradle

```kotlin
implementation("com.qanapi.api:qanapi-kotlin:0.0.1-alpha.0")
```

### Maven

```xml
<dependency>
  <groupId>com.qanapi.api</groupId>
  <artifactId>qanapi-kotlin</artifactId>
  <version>0.0.1-alpha.0</version>
</dependency>
```

## Requirements

This library requires Java 8 or later.

## Usage

```kotlin
import com.qanapi.api.client.QanapiClient
import com.qanapi.api.client.okhttp.QanapiOkHttpClient
import com.qanapi.api.models.auth.AuthLoginParams
import com.qanapi.api.models.auth.AuthLoginResponse

// Configures using the `QANAPI_API_KEY`, `QANAPI_SUBDOMAIN` and `QANAPI_BASE_URL` environment variables
val client: QanapiClient = QanapiOkHttpClient.fromEnv()

val params: AuthLoginParams = AuthLoginParams.builder()
    .email("valid@email.com")
    .password("secret1234")
    .build()
val response: AuthLoginResponse = client.auth().login(params)
```

## Client configuration

Configure the client using environment variables:

```kotlin
import com.qanapi.api.client.QanapiClient
import com.qanapi.api.client.okhttp.QanapiOkHttpClient

// Configures using the `QANAPI_API_KEY`, `QANAPI_SUBDOMAIN` and `QANAPI_BASE_URL` environment variables
val client: QanapiClient = QanapiOkHttpClient.fromEnv()
```

Or manually:

```kotlin
import com.qanapi.api.client.QanapiClient
import com.qanapi.api.client.okhttp.QanapiOkHttpClient

val client: QanapiClient = QanapiOkHttpClient.builder()
    .apiKey("My API Key")
    .subdomain("My-Subdomain")
    .build()
```

Or using a combination of the two approaches:

```kotlin
import com.qanapi.api.client.QanapiClient
import com.qanapi.api.client.okhttp.QanapiOkHttpClient

val client: QanapiClient = QanapiOkHttpClient.builder()
    // Configures using the `QANAPI_API_KEY`, `QANAPI_SUBDOMAIN` and `QANAPI_BASE_URL` environment variables
    .fromEnv()
    .bearerToken("My Bearer Token")
    .build()
```

See this table for the available options:

| Setter      | Environment variable | Required | Default value                               |
| ----------- | -------------------- | -------- | ------------------------------------------- |
| `apiKey`    | `QANAPI_API_KEY`     | true     | -                                           |
| `subdomain` | `QANAPI_SUBDOMAIN`   | true     | -                                           |
| `baseUrl`   | `QANAPI_BASE_URL`    | true     | `"https://{subdomain}.qanapi.cloud/api/v2"` |

> [!TIP]
> Don't create more than one client in the same application. Each client has a connection pool and
> thread pools, which are more efficient to share between requests.

## Requests and responses

To send a request to the Qanapi API, build an instance of some `Params` class and pass it to the corresponding client method. When the response is received, it will be deserialized into an instance of a Kotlin class.

For example, `client.auth().login(...)` should be called with an instance of `AuthLoginParams`, and it will return an instance of `AuthLoginResponse`.

## Immutability

Each class in the SDK has an associated [builder](https://blogs.oracle.com/javamagazine/post/exploring-joshua-blochs-builder-design-pattern-in-java) or factory method for constructing it.

Each class is [immutable](https://docs.oracle.com/javase/tutorial/essential/concurrency/immutable.html) once constructed. If the class has an associated builder, then it has a `toBuilder()` method, which can be used to convert it back to a builder for making a modified copy.

Because each class is immutable, builder modification will _never_ affect already built class instances.

## Asynchronous execution

The default client is synchronous. To switch to asynchronous execution, call the `async()` method:

```kotlin
import com.qanapi.api.client.QanapiClient
import com.qanapi.api.client.okhttp.QanapiOkHttpClient
import com.qanapi.api.models.auth.AuthLoginParams
import com.qanapi.api.models.auth.AuthLoginResponse

// Configures using the `QANAPI_API_KEY`, `QANAPI_SUBDOMAIN` and `QANAPI_BASE_URL` environment variables
val client: QanapiClient = QanapiOkHttpClient.fromEnv()

val params: AuthLoginParams = AuthLoginParams.builder()
    .email("valid@email.com")
    .password("secret1234")
    .build()
val response: AuthLoginResponse = client.async().auth().login(params)
```

Or create an asynchronous client from the beginning:

```kotlin
import com.qanapi.api.client.QanapiClientAsync
import com.qanapi.api.client.okhttp.QanapiOkHttpClientAsync
import com.qanapi.api.models.auth.AuthLoginParams
import com.qanapi.api.models.auth.AuthLoginResponse

// Configures using the `QANAPI_API_KEY`, `QANAPI_SUBDOMAIN` and `QANAPI_BASE_URL` environment variables
val client: QanapiClientAsync = QanapiOkHttpClientAsync.fromEnv()

val params: AuthLoginParams = AuthLoginParams.builder()
    .email("valid@email.com")
    .password("secret1234")
    .build()
val response: AuthLoginResponse = client.auth().login(params)
```

The asynchronous client supports the same options as the synchronous one, except most methods are [suspending](https://kotlinlang.org/docs/coroutines-guide.html).

## Raw responses

The SDK defines methods that deserialize responses into instances of Kotlin classes. However, these methods don't provide access to the response headers, status code, or the raw response body.

To access this data, prefix any HTTP method call on a client or service with `withRawResponse()`:

```kotlin
import com.qanapi.api.core.http.Headers
import com.qanapi.api.core.http.HttpResponseFor
import com.qanapi.api.models.auth.AuthLoginParams
import com.qanapi.api.models.auth.AuthLoginResponse

val params: AuthLoginParams = AuthLoginParams.builder()
    .email("valid@email.com")
    .password("secret1234")
    .build()
val response: HttpResponseFor<AuthLoginResponse> = client.auth().withRawResponse().login(params)

val statusCode: Int = response.statusCode()
val headers: Headers = response.headers()
```

You can still deserialize the response into an instance of a Kotlin class if needed:

```kotlin
import com.qanapi.api.models.auth.AuthLoginResponse

val parsedResponse: AuthLoginResponse = response.parse()
```

## Error handling

The SDK throws custom unchecked exception types:

- [`QanapiServiceException`](qanapi-kotlin-core/src/main/kotlin/com/qanapi/api/errors/QanapiServiceException.kt): Base class for HTTP errors. See this table for which exception subclass is thrown for each HTTP status code:

  | Status | Exception                                                                                                                    |
  | ------ | ---------------------------------------------------------------------------------------------------------------------------- |
  | 400    | [`BadRequestException`](qanapi-kotlin-core/src/main/kotlin/com/qanapi/api/errors/BadRequestException.kt)                     |
  | 401    | [`UnauthorizedException`](qanapi-kotlin-core/src/main/kotlin/com/qanapi/api/errors/UnauthorizedException.kt)                 |
  | 403    | [`PermissionDeniedException`](qanapi-kotlin-core/src/main/kotlin/com/qanapi/api/errors/PermissionDeniedException.kt)         |
  | 404    | [`NotFoundException`](qanapi-kotlin-core/src/main/kotlin/com/qanapi/api/errors/NotFoundException.kt)                         |
  | 422    | [`UnprocessableEntityException`](qanapi-kotlin-core/src/main/kotlin/com/qanapi/api/errors/UnprocessableEntityException.kt)   |
  | 429    | [`RateLimitException`](qanapi-kotlin-core/src/main/kotlin/com/qanapi/api/errors/RateLimitException.kt)                       |
  | 5xx    | [`InternalServerException`](qanapi-kotlin-core/src/main/kotlin/com/qanapi/api/errors/InternalServerException.kt)             |
  | others | [`UnexpectedStatusCodeException`](qanapi-kotlin-core/src/main/kotlin/com/qanapi/api/errors/UnexpectedStatusCodeException.kt) |

- [`QanapiIoException`](qanapi-kotlin-core/src/main/kotlin/com/qanapi/api/errors/QanapiIoException.kt): I/O networking errors.

- [`QanapiInvalidDataException`](qanapi-kotlin-core/src/main/kotlin/com/qanapi/api/errors/QanapiInvalidDataException.kt): Failure to interpret successfully parsed data. For example, when accessing a property that's supposed to be required, but the API unexpectedly omitted it from the response.

- [`QanapiException`](qanapi-kotlin-core/src/main/kotlin/com/qanapi/api/errors/QanapiException.kt): Base class for all exceptions. Most errors will result in one of the previously mentioned ones, but completely generic errors may be thrown using the base class.

## Logging

The SDK uses the standard [OkHttp logging interceptor](https://github.com/square/okhttp/tree/master/okhttp-logging-interceptor).

Enable logging by setting the `QANAPI_LOG` environment variable to `info`:

```sh
$ export QANAPI_LOG=info
```

Or to `debug` for more verbose logging:

```sh
$ export QANAPI_LOG=debug
```

## Jackson

The SDK depends on [Jackson](https://github.com/FasterXML/jackson) for JSON serialization/deserialization. It is compatible with version 2.13.4 or higher, but depends on version 2.18.2 by default.

The SDK throws an exception if it detects an incompatible Jackson version at runtime (e.g. if the default version was overridden in your Maven or Gradle config).

If the SDK threw an exception, but you're _certain_ the version is compatible, then disable the version check using the `checkJacksonVersionCompatibility` on [`QanapiOkHttpClient`](qanapi-kotlin-client-okhttp/src/main/kotlin/com/qanapi/api/client/okhttp/QanapiOkHttpClient.kt) or [`QanapiOkHttpClientAsync`](qanapi-kotlin-client-okhttp/src/main/kotlin/com/qanapi/api/client/okhttp/QanapiOkHttpClientAsync.kt).

> [!CAUTION]
> We make no guarantee that the SDK works correctly when the Jackson version check is disabled.

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

```kotlin
import com.qanapi.api.client.QanapiClient
import com.qanapi.api.client.okhttp.QanapiOkHttpClient

val client: QanapiClient = QanapiOkHttpClient.builder()
    .fromEnv()
    .maxRetries(4)
    .build()
```

### Timeouts

Requests time out after 1 minute by default.

To set a custom timeout, configure the method call using the `timeout` method:

```kotlin
import com.qanapi.api.models.auth.AuthLoginResponse

val response: AuthLoginResponse = client.auth().login(
  params, RequestOptions.builder().timeout(Duration.ofSeconds(30)).build()
)
```

Or configure the default for all method calls at the client level:

```kotlin
import com.qanapi.api.client.QanapiClient
import com.qanapi.api.client.okhttp.QanapiOkHttpClient
import java.time.Duration

val client: QanapiClient = QanapiOkHttpClient.builder()
    .fromEnv()
    .timeout(Duration.ofSeconds(30))
    .build()
```

### Proxies

To route requests through a proxy, configure the client using the `proxy` method:

```kotlin
import com.qanapi.api.client.QanapiClient
import com.qanapi.api.client.okhttp.QanapiOkHttpClient
import java.net.InetSocketAddress
import java.net.Proxy

val client: QanapiClient = QanapiOkHttpClient.builder()
    .fromEnv()
    .proxy(Proxy(
      Proxy.Type.HTTP, InetSocketAddress(
        "https://example.com", 8080
      )
    ))
    .build()
```

### Custom HTTP client

The SDK consists of three artifacts:

- `qanapi-kotlin-core`
  - Contains core SDK logic
  - Does not depend on [OkHttp](https://square.github.io/okhttp)
  - Exposes [`QanapiClient`](qanapi-kotlin-core/src/main/kotlin/com/qanapi/api/client/QanapiClient.kt), [`QanapiClientAsync`](qanapi-kotlin-core/src/main/kotlin/com/qanapi/api/client/QanapiClientAsync.kt), [`QanapiClientImpl`](qanapi-kotlin-core/src/main/kotlin/com/qanapi/api/client/QanapiClientImpl.kt), and [`QanapiClientAsyncImpl`](qanapi-kotlin-core/src/main/kotlin/com/qanapi/api/client/QanapiClientAsyncImpl.kt), all of which can work with any HTTP client
- `qanapi-kotlin-client-okhttp`
  - Depends on [OkHttp](https://square.github.io/okhttp)
  - Exposes [`QanapiOkHttpClient`](qanapi-kotlin-client-okhttp/src/main/kotlin/com/qanapi/api/client/okhttp/QanapiOkHttpClient.kt) and [`QanapiOkHttpClientAsync`](qanapi-kotlin-client-okhttp/src/main/kotlin/com/qanapi/api/client/okhttp/QanapiOkHttpClientAsync.kt), which provide a way to construct [`QanapiClientImpl`](qanapi-kotlin-core/src/main/kotlin/com/qanapi/api/client/QanapiClientImpl.kt) and [`QanapiClientAsyncImpl`](qanapi-kotlin-core/src/main/kotlin/com/qanapi/api/client/QanapiClientAsyncImpl.kt), respectively, using OkHttp
- `qanapi-kotlin`
  - Depends on and exposes the APIs of both `qanapi-kotlin-core` and `qanapi-kotlin-client-okhttp`
  - Does not have its own logic

This structure allows replacing the SDK's default HTTP client without pulling in unnecessary dependencies.

#### Customized [`OkHttpClient`](https://square.github.io/okhttp/3.x/okhttp/okhttp3/OkHttpClient.html)

> [!TIP]
> Try the available [network options](#network-options) before replacing the default client.

To use a customized `OkHttpClient`:

1. Replace your [`qanapi-kotlin` dependency](#installation) with `qanapi-kotlin-core`
2. Copy `qanapi-kotlin-client-okhttp`'s [`OkHttpClient`](qanapi-kotlin-client-okhttp/src/main/kotlin/com/qanapi/api/client/okhttp/OkHttpClient.kt) class into your code and customize it
3. Construct [`QanapiClientImpl`](qanapi-kotlin-core/src/main/kotlin/com/qanapi/api/client/QanapiClientImpl.kt) or [`QanapiClientAsyncImpl`](qanapi-kotlin-core/src/main/kotlin/com/qanapi/api/client/QanapiClientAsyncImpl.kt), similarly to [`QanapiOkHttpClient`](qanapi-kotlin-client-okhttp/src/main/kotlin/com/qanapi/api/client/okhttp/QanapiOkHttpClient.kt) or [`QanapiOkHttpClientAsync`](qanapi-kotlin-client-okhttp/src/main/kotlin/com/qanapi/api/client/okhttp/QanapiOkHttpClientAsync.kt), using your customized client

### Completely custom HTTP client

To use a completely custom HTTP client:

1. Replace your [`qanapi-kotlin` dependency](#installation) with `qanapi-kotlin-core`
2. Write a class that implements the [`HttpClient`](qanapi-kotlin-core/src/main/kotlin/com/qanapi/api/core/http/HttpClient.kt) interface
3. Construct [`QanapiClientImpl`](qanapi-kotlin-core/src/main/kotlin/com/qanapi/api/client/QanapiClientImpl.kt) or [`QanapiClientAsyncImpl`](qanapi-kotlin-core/src/main/kotlin/com/qanapi/api/client/QanapiClientAsyncImpl.kt), similarly to [`QanapiOkHttpClient`](qanapi-kotlin-client-okhttp/src/main/kotlin/com/qanapi/api/client/okhttp/QanapiOkHttpClient.kt) or [`QanapiOkHttpClientAsync`](qanapi-kotlin-client-okhttp/src/main/kotlin/com/qanapi/api/client/okhttp/QanapiOkHttpClientAsync.kt), using your new client class

## Undocumented API functionality

The SDK is typed for convenient usage of the documented API. However, it also supports working with undocumented or not yet supported parts of the API.

### Parameters

To set undocumented parameters, call the `putAdditionalHeader`, `putAdditionalQueryParam`, or `putAdditionalBodyProperty` methods on any `Params` class:

```kotlin
import com.qanapi.api.core.JsonValue
import com.qanapi.api.models.auth.AuthLoginParams

val params: AuthLoginParams = AuthLoginParams.builder()
    .putAdditionalHeader("Secret-Header", "42")
    .putAdditionalQueryParam("secret_query_param", "42")
    .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
    .build()
```

These can be accessed on the built object later using the `_additionalHeaders()`, `_additionalQueryParams()`, and `_additionalBodyProperties()` methods.

To set undocumented parameters on _nested_ headers, query params, or body classes, call the `putAdditionalProperty` method on the nested class:

```kotlin
import com.qanapi.api.core.JsonValue
import com.qanapi.api.models.encrypt.EncryptEncryptDataParams

val params: EncryptEncryptDataParams = EncryptEncryptDataParams.builder()
    .access(EncryptEncryptDataParams.Access.builder()
        .putAdditionalProperty("secretProperty", JsonValue.from("42"))
        .build())
    .build()
```

These properties can be accessed on the nested built object later using the `_additionalProperties()` method.

To set a documented parameter or property to an undocumented or not yet supported _value_, pass a [`JsonValue`](qanapi-kotlin-core/src/main/kotlin/com/qanapi/api/core/Values.kt) object to its setter:

```kotlin
import com.qanapi.api.core.JsonValue
import com.qanapi.api.models.auth.AuthLoginParams

val params: AuthLoginParams = AuthLoginParams.builder()
    .email(JsonValue.from(42))
    .password("secret1234")
    .build()
```

The most straightforward way to create a [`JsonValue`](qanapi-kotlin-core/src/main/kotlin/com/qanapi/api/core/Values.kt) is using its `from(...)` method:

```kotlin
import com.qanapi.api.core.JsonValue

// Create primitive JSON values
val nullValue: JsonValue = JsonValue.from(null)
val booleanValue: JsonValue = JsonValue.from(true)
val numberValue: JsonValue = JsonValue.from(42)
val stringValue: JsonValue = JsonValue.from("Hello World!")

// Create a JSON array value equivalent to `["Hello", "World"]`
val arrayValue: JsonValue = JsonValue.from(listOf(
  "Hello", "World"
))

// Create a JSON object value equivalent to `{ "a": 1, "b": 2 }`
val objectValue: JsonValue = JsonValue.from(mapOf(
  "a" to 1, "b" to 2
))

// Create an arbitrarily nested JSON equivalent to:
// {
//   "a": [1, 2],
//   "b": [3, 4]
// }
val complexValue: JsonValue = JsonValue.from(mapOf(
  "a" to listOf(
    1, 2
  ), "b" to listOf(
    3, 4
  )
))
```

Normally a `Builder` class's `build` method will throw [`IllegalStateException`](https://docs.oracle.com/javase/8/docs/api/java/lang/IllegalStateException.html) if any required parameter or property is unset.

To forcibly omit a required parameter or property, pass [`JsonMissing`](qanapi-kotlin-core/src/main/kotlin/com/qanapi/api/core/Values.kt):

```kotlin
import com.qanapi.api.core.JsonMissing
import com.qanapi.api.models.auth.AuthLoginParams

val params: AuthLoginParams = AuthLoginParams.builder()
    .password("secret1234")
    .email(JsonMissing.of())
    .build()
```

### Response properties

To access undocumented response properties, call the `_additionalProperties()` method:

```kotlin
import com.qanapi.api.core.JsonBoolean
import com.qanapi.api.core.JsonNull
import com.qanapi.api.core.JsonNumber
import com.qanapi.api.core.JsonValue

val additionalProperties: Map<String, JsonValue> = client.auth().login(params)._additionalProperties()
val secretPropertyValue: JsonValue = additionalProperties.get("secretProperty")

val result = when (secretPropertyValue) {
    is JsonNull -> "It's null!"
    is JsonBoolean -> "It's a boolean!"
    is JsonNumber -> "It's a number!"
    // Other types include `JsonMissing`, `JsonString`, `JsonArray`, and `JsonObject`
    else -> "It's something else!"
}
```

To access a property's raw JSON value, which may be undocumented, call its `_` prefixed method:

```kotlin
import com.qanapi.api.core.JsonField

val email: JsonField<String> = client.auth().login(params)._email()

if (email.isMissing()) {
  // The property is absent from the JSON response
} else if (email.isNull()) {
  // The property was set to literal null
} else {
  // Check if value was provided as a string
  // Other methods include `asNumber()`, `asBoolean()`, etc.
  val jsonString: String? = email.asString();

  // Try to deserialize into a custom type
  val myObject: MyClass = email.asUnknown()!!.convert(MyClass::class.java)
}
```

### Response validation

In rare cases, the API may return a response that doesn't match the expected type. For example, the SDK may expect a property to contain a `String`, but the API could return something else.

By default, the SDK will not throw an exception in this case. It will throw [`QanapiInvalidDataException`](qanapi-kotlin-core/src/main/kotlin/com/qanapi/api/errors/QanapiInvalidDataException.kt) only if you directly access the property.

If you would prefer to check that the response is completely well-typed upfront, then either call `validate()`:

```kotlin
import com.qanapi.api.models.auth.AuthLoginResponse

val response: AuthLoginResponse = client.auth().login(params).validate()
```

Or configure the method call to validate the response using the `responseValidation` method:

```kotlin
import com.qanapi.api.models.auth.AuthLoginResponse

val response: AuthLoginResponse = client.auth().login(
  params, RequestOptions.builder().responseValidation(true).build()
)
```

Or configure the default for all method calls at the client level:

```kotlin
import com.qanapi.api.client.QanapiClient
import com.qanapi.api.client.okhttp.QanapiOkHttpClient

val client: QanapiClient = QanapiOkHttpClient.builder()
    .fromEnv()
    .responseValidation(true)
    .build()
```

## FAQ

### Why don't you use plain `enum` classes?

Kotlin `enum` classes are not trivially [forwards compatible](https://www.stainless.com/blog/making-java-enums-forwards-compatible). Using them in the SDK could cause runtime exceptions if the API is updated to respond with a new enum value.

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

We are keen for your feedback; please open an [issue](https://www.github.com/stainless-sdks/qanapi-kotlin/issues) with questions, bugs, or suggestions.
