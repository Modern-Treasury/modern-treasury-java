# Changelog

## 1.5.1 (2023-10-04)

Full Changelog: [v1.5.0...v1.5.1](https://github.com/Modern-Treasury/modern-treasury-java/compare/v1.5.0...v1.5.1)

### Chores

* **internal:** add a top-level generated comment to each file ([#66](https://github.com/Modern-Treasury/modern-treasury-java/issues/66)) ([983130b](https://github.com/Modern-Treasury/modern-treasury-java/commit/983130be9ecb6388064648a25dacb3e69ee91965))

## 1.5.0 (2023-10-02)

Full Changelog: [v1.4.2...v1.5.0](https://github.com/Modern-Treasury/modern-treasury-java/compare/v1.4.2...v1.5.0)

### Features

* **api:** updates ([#62](https://github.com/Modern-Treasury/modern-treasury-java/issues/62)) ([7ec7c02](https://github.com/Modern-Treasury/modern-treasury-java/commit/7ec7c02b524dffdc121930bba349414143f819e2))
* **client:** retry on 408 Request Timeout ([#58](https://github.com/Modern-Treasury/modern-treasury-java/issues/58)) ([f8af153](https://github.com/Modern-Treasury/modern-treasury-java/commit/f8af153f2f17c8cf7a898c357c0dea50d1b95566))

## 1.4.2 (2023-08-31)

Full Changelog: [v1.4.1...v1.4.2](https://github.com/Modern-Treasury/modern-treasury-java/compare/v1.4.1...v1.4.2)

## 1.4.1 (2023-08-28)

Full Changelog: [v1.4.0...v1.4.1](https://github.com/Modern-Treasury/modern-treasury-java/compare/v1.4.0...v1.4.1)

### Bug Fixes

* set correct timeouts on okhttp client ([#49](https://github.com/Modern-Treasury/modern-treasury-java/issues/49)) ([32b52b1](https://github.com/Modern-Treasury/modern-treasury-java/commit/32b52b13d36fbda828f38e506cc410621da79e9f))


### Chores

* **ci:** setup workflows to create releases and release PRs ([#53](https://github.com/Modern-Treasury/modern-treasury-java/issues/53)) ([f49b05d](https://github.com/Modern-Treasury/modern-treasury-java/commit/f49b05decf6e66001ddb0e3244159fca3da4c85b))
* **internal:** minor code re-ordering ([#52](https://github.com/Modern-Treasury/modern-treasury-java/issues/52)) ([e54fc17](https://github.com/Modern-Treasury/modern-treasury-java/commit/e54fc1767a3f70a234e0e0a393a9f696de65b9a2))

## [1.4.0](https://github.com/Modern-Treasury/modern-treasury-java/compare/v1.3.0...v1.4.0) (2023-08-15)


### Features

* **api:** add `metadata` in several places it was missing; add `description` ([#34](https://github.com/Modern-Treasury/modern-treasury-java/issues/34)) ([e3b4fd9](https://github.com/Modern-Treasury/modern-treasury-java/commit/e3b4fd9539d48a42083bb87789cf0e1a1df621b3))
* **api:** support multiple `id`s in `ledger` `retrieve`/`list` endpoints ([#45](https://github.com/Modern-Treasury/modern-treasury-java/issues/45)) ([f397b5d](https://github.com/Modern-Treasury/modern-treasury-java/commit/f397b5dfb18aae18d84d0e3ae9f7f0c2d6429e99))
* **api:** updates ([#39](https://github.com/Modern-Treasury/modern-treasury-java/issues/39)) ([1f5ce52](https://github.com/Modern-Treasury/modern-treasury-java/commit/1f5ce5299e9ec462ce6e25a2c4c2a7b51aa31b71))
* default timeout is set for java clients ([#46](https://github.com/Modern-Treasury/modern-treasury-java/issues/46)) ([a1763d5](https://github.com/Modern-Treasury/modern-treasury-java/commit/a1763d5e2ebe66ca1a87a0185fc67431516aaab8))
* generate addXxx methods for array types ([#48](https://github.com/Modern-Treasury/modern-treasury-java/issues/48)) ([a29d02b](https://github.com/Modern-Treasury/modern-treasury-java/commit/a29d02b4d6609b2f3b4edf7475907cee9bdd8943))


### Chores

* assign default reviewers to release PRs ([#47](https://github.com/Modern-Treasury/modern-treasury-java/issues/47)) ([f3529d5](https://github.com/Modern-Treasury/modern-treasury-java/commit/f3529d55d59b284a0dcfe83c8c12d99c261325ac))
* **ci:** allow release to proceed without signing key id secret ([#40](https://github.com/Modern-Treasury/modern-treasury-java/issues/40)) ([1dcf4ba](https://github.com/Modern-Treasury/modern-treasury-java/commit/1dcf4ba3e1feecf8fd366b5b2594c6f326c3507b))
* **internal:** publish with --stacktrace for more helpful error information ([#37](https://github.com/Modern-Treasury/modern-treasury-java/issues/37)) ([d630e01](https://github.com/Modern-Treasury/modern-treasury-java/commit/d630e01e3df16f75d6a5f1dea48e95e6750049ef))
* **internal:** reorganize types ([#42](https://github.com/Modern-Treasury/modern-treasury-java/issues/42)) ([44718f0](https://github.com/Modern-Treasury/modern-treasury-java/commit/44718f04b233dc5aad201241488f45cca26c973a))
* **internal:** set maven group id to com.moderntreasury ([#36](https://github.com/Modern-Treasury/modern-treasury-java/issues/36)) ([fd2559e](https://github.com/Modern-Treasury/modern-treasury-java/commit/fd2559e7497dd2835c34f8d72d3450900545e4cb))
* **internal:** support passing GPG_SIGNING_KEY_ID from secrets ([#38](https://github.com/Modern-Treasury/modern-treasury-java/issues/38)) ([5f7cdee](https://github.com/Modern-Treasury/modern-treasury-java/commit/5f7cdee45443cea741526593fb564d02f456c13a))

## [1.3.0](https://github.com/Modern-Treasury/modern-treasury-java/compare/v1.2.0...v1.3.0) (2023-08-01)


### Features

* **test:** unskip file uploads tests ([#31](https://github.com/Modern-Treasury/modern-treasury-java/issues/31)) ([60a9300](https://github.com/Modern-Treasury/modern-treasury-java/commit/60a9300b340ed4f5cd5b0c6c9d74bfdec04198a3))


### Chores

* **internal:** change Sonatype host to oss.sonatype.org ([#29](https://github.com/Modern-Treasury/modern-treasury-java/issues/29)) ([5206c21](https://github.com/Modern-Treasury/modern-treasury-java/commit/5206c21b19a6af82815a3768325c856a5af1806d))

## [1.2.0](https://github.com/Modern-Treasury/modern-treasury-java/compare/v1.1.0...v1.2.0) (2023-07-28)


### Features

* **api:** updates ([#25](https://github.com/Modern-Treasury/modern-treasury-java/issues/25)) ([07feb05](https://github.com/Modern-Treasury/modern-treasury-java/commit/07feb05e82a4c9b1d1582ed500ae53342c5b9f44))
* **api:** updates ([#27](https://github.com/Modern-Treasury/modern-treasury-java/issues/27)) ([80e252c](https://github.com/Modern-Treasury/modern-treasury-java/commit/80e252ccdd782a3634c66e2fd3ceae4d9b8c2ae5))
* **ci:** add a publish-sonatype workflow for manual running ([#26](https://github.com/Modern-Treasury/modern-treasury-java/issues/26)) ([1d96ffc](https://github.com/Modern-Treasury/modern-treasury-java/commit/1d96ffc2716d89111cd11eb44febfefdc20c5663))


### Chores

* formatting ([#23](https://github.com/Modern-Treasury/modern-treasury-java/issues/23)) ([eae8b46](https://github.com/Modern-Treasury/modern-treasury-java/commit/eae8b46d5c7888eac1cc21209802fd5bb8860d40))

## [1.1.0](https://github.com/Modern-Treasury/modern-treasury-java/compare/v1.0.1...v1.1.0) (2023-07-24)

### ⚠ BREAKING CHANGES

- **types:** rename account connection flow to account collection flow

### Bug Fixes

- auto-close responses even if an exception is thrown during deserialization ([3bf86f7](https://github.com/Modern-Treasury/modern-treasury-java/commit/3bf86f7bc17eb556942365d37a533c9fa03bcb57))

### Chores

- **internal:** add `codegen.log` to `.gitignore` ([daf6e97](https://github.com/Modern-Treasury/modern-treasury-java/commit/daf6e97b64360a7871898c0feb3997cfa3f5c7cc))

### Refactors

- **types:** rename account connection flow to account collection flow ([6e9bcc3](https://github.com/Modern-Treasury/modern-treasury-java/commit/6e9bcc386069b783e4428b8a22de122c31ac2227))

## [1.0.1](https://github.com/Modern-Treasury/modern-treasury-java/compare/v1.0.0...v1.0.1) (2023-07-19)

### Chores

- **main:** release 1.0.0 ([060030d](https://github.com/Modern-Treasury/modern-treasury-java/commit/060030dd7765847d62d2bd1b96e31d9df167d29f))

## [1.0.0](https://github.com/Modern-Treasury/modern-treasury-java/compare/v0.1.0...v1.0.0) (2023-07-19)

### ⚠ BREAKING CHANGES

- **api:** update parameters for virtual account create request ([#6](https://github.com/Modern-Treasury/modern-treasury-java/issues/6))

### Features

- **api:** update parameters for virtual account create request ([#6](https://github.com/Modern-Treasury/modern-treasury-java/issues/6)) ([3980968](https://github.com/Modern-Treasury/modern-treasury-java/commit/3980968e9af5e9b27ea9ecb859018cd1361284dd))

### Bug Fixes

- **api:** add response body to `get /api/virtual_accounts` and update resources ([#3](https://github.com/Modern-Treasury/modern-treasury-java/issues/3)) ([88111f8](https://github.com/Modern-Treasury/modern-treasury-java/commit/88111f85fb6ba4f7a0c0274268d55c7a2839ff5d))

### Chores

- **internal:** minor reformatting ([#5](https://github.com/Modern-Treasury/modern-treasury-java/issues/5)) ([03e697a](https://github.com/Modern-Treasury/modern-treasury-java/commit/03e697a6e3fe7e467ffabcbd9aca6d34d43d87c9))
- **internal:** minor reformatting + remove internal examples classes ([#1](https://github.com/Modern-Treasury/modern-treasury-java/issues/1)) ([#2](https://github.com/Modern-Treasury/modern-treasury-java/issues/2)) ([5084e83](https://github.com/Modern-Treasury/modern-treasury-java/commit/5084e839ab85f93b279274088b2be7912f7067ea))
- **main:** release 0.1.0 ([b67379a](https://github.com/Modern-Treasury/modern-treasury-java/commit/b67379a69fdf102d0a1d15dc20b0beb19922eee2))
- unreleased changes ([#4](https://github.com/Modern-Treasury/modern-treasury-java/issues/4)) ([051e0bb](https://github.com/Modern-Treasury/modern-treasury-java/commit/051e0bb17ca98b45e1b50ff4efb4eebf0768ecf7))

## [1.0.0](https://github.com/Modern-Treasury/modern-treasury-java/compare/v0.0.3...v1.0.0) (2023-07-19)

### ⚠ BREAKING CHANGES

- **api:** update parameters for virtual account create request ([#6](https://github.com/Modern-Treasury/modern-treasury-java/issues/6))

### Features

- **api:** update parameters for virtual account create request ([#6](https://github.com/Modern-Treasury/modern-treasury-java/issues/6)) ([3980968](https://github.com/Modern-Treasury/modern-treasury-java/commit/3980968e9af5e9b27ea9ecb859018cd1361284dd))

### Bug Fixes

- **api:** add response body to `get /api/virtual_accounts` and update resources ([#3](https://github.com/Modern-Treasury/modern-treasury-java/issues/3)) ([88111f8](https://github.com/Modern-Treasury/modern-treasury-java/commit/88111f85fb6ba4f7a0c0274268d55c7a2839ff5d))

### Chores

- **internal:** minor reformatting ([#5](https://github.com/Modern-Treasury/modern-treasury-java/issues/5)) ([03e697a](https://github.com/Modern-Treasury/modern-treasury-java/commit/03e697a6e3fe7e467ffabcbd9aca6d34d43d87c9))
- **internal:** minor reformatting + remove internal examples classes ([#1](https://github.com/Modern-Treasury/modern-treasury-java/issues/1)) ([#2](https://github.com/Modern-Treasury/modern-treasury-java/issues/2)) ([5084e83](https://github.com/Modern-Treasury/modern-treasury-java/commit/5084e839ab85f93b279274088b2be7912f7067ea))
- unreleased changes ([#4](https://github.com/Modern-Treasury/modern-treasury-java/issues/4)) ([051e0bb](https://github.com/Modern-Treasury/modern-treasury-java/commit/051e0bb17ca98b45e1b50ff4efb4eebf0768ecf7))
