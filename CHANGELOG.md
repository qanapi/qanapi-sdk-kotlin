# Changelog

## 1.3.0 (2025-08-15)

Full Changelog: [v1.2.0...v1.3.0](https://github.com/qanapi/qanapi-sdk-kotlin/compare/v1.2.0...v1.3.0)

### Features

* add retryable exception ([db68744](https://github.com/qanapi/qanapi-sdk-kotlin/commit/db687444c1961bb0c7115937f27f397e092be541))
* **client:** ensure compat with proguard ([a807834](https://github.com/qanapi/qanapi-sdk-kotlin/commit/a8078344cb59c13e495f99927e121748c80111c2))


### Bug Fixes

* **client:** r8 support ([4f7ae13](https://github.com/qanapi/qanapi-sdk-kotlin/commit/4f7ae13f81f2f7ef44204b7886d1aecea0debdb3))


### Performance Improvements

* **internal:** make formatting faster ([8894da5](https://github.com/qanapi/qanapi-sdk-kotlin/commit/8894da5ce359fe7e7bc242a9c86e0722c107aad7))


### Chores

* **ci:** add build job ([0f2a1c1](https://github.com/qanapi/qanapi-sdk-kotlin/commit/0f2a1c13de8538a65ee86dce974389801ff9d7d5))
* **example:** fix run example comment ([49f5f6e](https://github.com/qanapi/qanapi-sdk-kotlin/commit/49f5f6edd401eddde5d21545fea635b17cd32716))
* increase max gradle JVM heap to 8GB ([0d76f3f](https://github.com/qanapi/qanapi-sdk-kotlin/commit/0d76f3f7acea5940ea73006b09026ba4aa769b17))
* **internal:** add lock helper ([7911405](https://github.com/qanapi/qanapi-sdk-kotlin/commit/7911405be96b2c1012bffb54b0bea2791d8ef207))
* **internal:** bump ci test timeout ([08cd772](https://github.com/qanapi/qanapi-sdk-kotlin/commit/08cd77237a39bb34416d994b9e2ee7d1622df839))
* **internal:** codegen related update ([9ff2dad](https://github.com/qanapi/qanapi-sdk-kotlin/commit/9ff2dad58f3adcb721435df5b55438c8d3dc47b2))
* **internal:** codegen related update ([b0bf8db](https://github.com/qanapi/qanapi-sdk-kotlin/commit/b0bf8db3a7f782c35d4c225090bd138d0e103a0c))
* **internal:** dynamically determine included projects ([321f4cb](https://github.com/qanapi/qanapi-sdk-kotlin/commit/321f4cb7c6ec7dce8dcf43859a5c4426c9805280))
* **internal:** reduce proguard ci logging ([94559e0](https://github.com/qanapi/qanapi-sdk-kotlin/commit/94559e0da46bd298e7876ffda38532a2839e5305))
* **internal:** support passing arguments to test script ([11d1377](https://github.com/qanapi/qanapi-sdk-kotlin/commit/11d1377dc4775b18b68a3c3356cfb5351b6903f6))
* **internal:** unskip some tests ([c2712e7](https://github.com/qanapi/qanapi-sdk-kotlin/commit/c2712e71e9af381b6877ae95427d9d73e1bbf8e4))
* **internal:** update comment in script ([9c7ea53](https://github.com/qanapi/qanapi-sdk-kotlin/commit/9c7ea5350b016a1776613e36439daa5fcd677745))
* update @stainless-api/prism-cli to v5.15.0 ([7c7867a](https://github.com/qanapi/qanapi-sdk-kotlin/commit/7c7867a12972065b5e5e239a16bf389ad371f94e))

## 1.2.0 (2025-07-25)

Full Changelog: [v1.1.5...v1.2.0](https://github.com/qanapi/qanapi-sdk-kotlin/compare/v1.1.5...v1.2.0)

### Features

* **client:** add `{QueryParams,Headers}#put(String, JsonValue)` methods ([209954a](https://github.com/qanapi/qanapi-sdk-kotlin/commit/209954afa595d2c103d3551e2dc84a7db3edb7f9))
* **client:** add https config options ([527ca81](https://github.com/qanapi/qanapi-sdk-kotlin/commit/527ca81d892d623ff57a51d9e50374a39b6ada52))
* **client:** allow configuring env via system properties ([27dc783](https://github.com/qanapi/qanapi-sdk-kotlin/commit/27dc783919123293fb20818f7df7e126eea5c8b6))


### Bug Fixes

* **client:** accidental mutability of some classes ([4099123](https://github.com/qanapi/qanapi-sdk-kotlin/commit/4099123ff4d5fd96937a77d5132623840b55db9c))


### Chores

* **internal:** refactor delegating from client to options ([11430d7](https://github.com/qanapi/qanapi-sdk-kotlin/commit/11430d79d157f96750a9d0daa9bde37e64befbcd))
* **internal:** remove unnecessary `[...]` in `[@see](https://github.com/see)` ([28a9bfb](https://github.com/qanapi/qanapi-sdk-kotlin/commit/28a9bfbbb68fdf118f887b3184075691c80219dc))


### Documentation

* fix missing readme comment ([3ed3edd](https://github.com/qanapi/qanapi-sdk-kotlin/commit/3ed3edd0d0d4fe200989802971e7a0f731d114d5))
* more code comments ([496c3f5](https://github.com/qanapi/qanapi-sdk-kotlin/commit/496c3f5aadbd0a1898cefeba884f93523ebb9923))

## 1.1.5 (2025-07-18)

Full Changelog: [v1.1.4...v1.1.5](https://github.com/qanapi/qanapi-sdk-kotlin/compare/v1.1.4...v1.1.5)

### Bug Fixes

* **client:** ensure error handling always occurs ([6dcdda0](https://github.com/qanapi/qanapi-sdk-kotlin/commit/6dcdda03356b98ab7ba7081d7a896d9bc1e6dfb3))


### Chores

* **ci:** bump `actions/setup-java` to v4 ([2e895de](https://github.com/qanapi/qanapi-sdk-kotlin/commit/2e895de7d5dbb02ce2a18b5b0f82cfbd20a11c65))
* **ci:** ensure docs generation always succeeds ([dbc796a](https://github.com/qanapi/qanapi-sdk-kotlin/commit/dbc796aed809f9a1d9ae34c7f5a8f64fb58a1645))
* **internal:** allow running specific example from cli ([630e895](https://github.com/qanapi/qanapi-sdk-kotlin/commit/630e895425b7ae49ae59f38a3f2b289e2d37621f))

## 1.1.4 (2025-07-01)

Full Changelog: [v1.1.3...v1.1.4](https://github.com/qanapi/qanapi-sdk-kotlin/compare/v1.1.3...v1.1.4)

### Refactors

* **internal:** minor `ClientOptionsTest` change ([4040cae](https://github.com/qanapi/qanapi-sdk-kotlin/commit/4040cae6c0b29fc9a8098c623947890c7b5ec854))

## 1.1.3 (2025-06-30)

Full Changelog: [v1.1.2...v1.1.3](https://github.com/qanapi/qanapi-sdk-kotlin/compare/v1.1.2...v1.1.3)

### Bug Fixes

* **client:** don't close client on `withOptions` usage when original is gc'd ([8ee9a47](https://github.com/qanapi/qanapi-sdk-kotlin/commit/8ee9a47757448043144a0d37e0f9faf2b5893f34))


### Chores

* **ci:** only run for pushes and fork pull requests ([85b3244](https://github.com/qanapi/qanapi-sdk-kotlin/commit/85b3244e35cc88849867c33bcf349b2159c3eec4))

## 1.1.2 (2025-06-27)

Full Changelog: [v1.1.1...v1.1.2](https://github.com/qanapi/qanapi-sdk-kotlin/compare/v1.1.1...v1.1.2)

### Bug Fixes

* **ci:** release-doctor — report correct token name ([ddbeb28](https://github.com/qanapi/qanapi-sdk-kotlin/commit/ddbeb282db00f3f06011baeb1bfe56e426e4c5bd))

## 1.1.1 (2025-06-24)

Full Changelog: [v1.1.0...v1.1.1](https://github.com/qanapi/qanapi-sdk-kotlin/compare/v1.1.0...v1.1.1)

### Bug Fixes

* **client:** bump max requests per host to max requests (5 -&gt; 64) ([c28616f](https://github.com/qanapi/qanapi-sdk-kotlin/commit/c28616f670c73248a917101d11670b09867bef12))

## 1.1.0 (2025-06-18)

Full Changelog: [v1.0.1...v1.1.0](https://github.com/qanapi/qanapi-sdk-kotlin/compare/v1.0.1...v1.1.0)

### Features

* **api:** update via SDK Studio ([a2a919f](https://github.com/qanapi/qanapi-sdk-kotlin/commit/a2a919fd69db67b8b7f0c0923d6fcf69c8eb2fb8))

## 1.0.1 (2025-06-18)

Full Changelog: [v1.0.0...v1.0.1](https://github.com/qanapi/qanapi-sdk-kotlin/compare/v1.0.0...v1.0.1)

## 1.0.0 (2025-06-18)

Full Changelog: [v0.1.0-alpha.4...v1.0.0](https://github.com/qanapi/qanapi-sdk-kotlin/compare/v0.1.0-alpha.4...v1.0.0)

## 0.1.0-alpha.4 (2025-06-17)

Full Changelog: [v0.1.0-alpha.3...v0.1.0-alpha.4](https://github.com/qanapi/qanapi-sdk-kotlin/compare/v0.1.0-alpha.3...v0.1.0-alpha.4)

### Features

* **api:** update via SDK Studio ([6afde4b](https://github.com/qanapi/qanapi-sdk-kotlin/commit/6afde4b55fc3c05ee498f43b434b8718393460d3))

## 0.1.0-alpha.3 (2025-06-17)

Full Changelog: [v0.1.0-alpha.2...v0.1.0-alpha.3](https://github.com/qanapi/qanapi-sdk-kotlin/compare/v0.1.0-alpha.2...v0.1.0-alpha.3)

### Features

* **api:** update via SDK Studio ([e525eb8](https://github.com/qanapi/qanapi-sdk-kotlin/commit/e525eb885f3978dba1b471bdaf15b58cb8dfb451))

## 0.1.0-alpha.2 (2025-06-17)

Full Changelog: [v0.1.0-alpha.1...v0.1.0-alpha.2](https://github.com/qanapi/qanapi-sdk-kotlin/compare/v0.1.0-alpha.1...v0.1.0-alpha.2)

### Features

* **api:** update via SDK Studio ([ca9a723](https://github.com/qanapi/qanapi-sdk-kotlin/commit/ca9a7234d0aabc3b374d20e7de6c58be4b3c25a2))
* **api:** update via SDK Studio ([f03e5be](https://github.com/qanapi/qanapi-sdk-kotlin/commit/f03e5bed5abca7fbe8e7c1ccc44cdd3690ae1d41))

## 0.1.0-alpha.1 (2025-06-17)

Full Changelog: [v0.0.1-alpha.0...v0.1.0-alpha.1](https://github.com/qanapi/qanapi-sdk-kotlin/compare/v0.0.1-alpha.0...v0.1.0-alpha.1)

### Features

* **api:** update via SDK Studio ([5f66fb8](https://github.com/qanapi/qanapi-sdk-kotlin/commit/5f66fb885715e6cf3b2a6155c5b361452380f390))
* **api:** update via SDK Studio ([47a4b99](https://github.com/qanapi/qanapi-sdk-kotlin/commit/47a4b99ea3035149fe5c9cc69c45d6412efca26d))
* **client:** add a `withOptions` method ([8438748](https://github.com/qanapi/qanapi-sdk-kotlin/commit/84387489668b31bb75f7e6c5bef69a49197d97c9))


### Chores

* **ci:** enable for pull requests ([2810809](https://github.com/qanapi/qanapi-sdk-kotlin/commit/2810809eb1d045400ad79f74386209c19da1b42b))
* configure new SDK language ([6040355](https://github.com/qanapi/qanapi-sdk-kotlin/commit/60403555ca19cb395bdbaff48218a71759bf5c12))
* update SDK settings ([bf36346](https://github.com/qanapi/qanapi-sdk-kotlin/commit/bf363461b4111d8bd2e090083e126a8d132e1c89))
