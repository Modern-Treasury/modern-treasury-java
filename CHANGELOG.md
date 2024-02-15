# Changelog

## 0.0.1 (2024-02-15)

Full Changelog: [...abc-v0.0.1](https://github.com/Modern-Treasury/modern-treasury-java/compare/...abc-v0.0.1)

### ⚠ BREAKING CHANGES

* **types:** consolidate direction enums into a shared TransactionDirection type ([#74](https://github.com/Modern-Treasury/modern-treasury-java/issues/74))
* **types:** rename account connection flow to account collection flow
* **api:** update parameters for virtual account create request ([#6](https://github.com/Modern-Treasury/modern-treasury-java/issues/6))

### Features

* **api:** add `ledger_transactions` to expected payment request ([#102](https://github.com/Modern-Treasury/modern-treasury-java/issues/102)) ([d818421](https://github.com/Modern-Treasury/modern-treasury-java/commit/d81842170e8470d444ec08bbc253609f0f8cdd57))
* **api:** add `metadata` in several places it was missing; add `description` ([#34](https://github.com/Modern-Treasury/modern-treasury-java/issues/34)) ([e3b4fd9](https://github.com/Modern-Treasury/modern-treasury-java/commit/e3b4fd9539d48a42083bb87789cf0e1a1df621b3))
* **api:** add create and delete operations for internal accounts balance reports ([#106](https://github.com/Modern-Treasury/modern-treasury-java/issues/106)) ([63c3d6d](https://github.com/Modern-Treasury/modern-treasury-java/commit/63c3d6da9b29a6ce0772324504d686e071b3453b))
* **api:** add dk_interbank_clearing_code and dk_nets enum members ([#90](https://github.com/Modern-Treasury/modern-treasury-java/issues/90)) ([45bfc09](https://github.com/Modern-Treasury/modern-treasury-java/commit/45bfc09e84fb5ee7cbb629804f8fea16a5edb261))
* **api:** remove reversed and reversing ledger account status type ([#100](https://github.com/Modern-Treasury/modern-treasury-java/issues/100)) ([141f3ca](https://github.com/Modern-Treasury/modern-treasury-java/commit/141f3ca05fb8b0952bcf694d7b6048045191109b))
* **api:** support multiple `id`s in `ledger` `retrieve`/`list` endpoints ([#45](https://github.com/Modern-Treasury/modern-treasury-java/issues/45)) ([f397b5d](https://github.com/Modern-Treasury/modern-treasury-java/commit/f397b5dfb18aae18d84d0e3ae9f7f0c2d6429e99))
* **api:** update parameters for virtual account create request ([#6](https://github.com/Modern-Treasury/modern-treasury-java/issues/6)) ([3980968](https://github.com/Modern-Treasury/modern-treasury-java/commit/3980968e9af5e9b27ea9ecb859018cd1361284dd))
* **api:** updates ([#116](https://github.com/Modern-Treasury/modern-treasury-java/issues/116)) ([561bf34](https://github.com/Modern-Treasury/modern-treasury-java/commit/561bf34b3257d0155ba14147415005965281fe37))
* **api:** updates ([#25](https://github.com/Modern-Treasury/modern-treasury-java/issues/25)) ([07feb05](https://github.com/Modern-Treasury/modern-treasury-java/commit/07feb05e82a4c9b1d1582ed500ae53342c5b9f44))
* **api:** updates ([#27](https://github.com/Modern-Treasury/modern-treasury-java/issues/27)) ([80e252c](https://github.com/Modern-Treasury/modern-treasury-java/commit/80e252ccdd782a3634c66e2fd3ceae4d9b8c2ae5))
* **api:** updates ([#39](https://github.com/Modern-Treasury/modern-treasury-java/issues/39)) ([1f5ce52](https://github.com/Modern-Treasury/modern-treasury-java/commit/1f5ce5299e9ec462ce6e25a2c4c2a7b51aa31b71))
* **api:** updates ([#62](https://github.com/Modern-Treasury/modern-treasury-java/issues/62)) ([832067a](https://github.com/Modern-Treasury/modern-treasury-java/commit/832067a3d9100c4eb5dada921507544dfd6d42ca))
* **api:** updates ([#78](https://github.com/Modern-Treasury/modern-treasury-java/issues/78)) ([8763627](https://github.com/Modern-Treasury/modern-treasury-java/commit/8763627b74f8137539f08ac7965589cfb2670a42))
* **api:** updates ([#82](https://github.com/Modern-Treasury/modern-treasury-java/issues/82)) ([66aaceb](https://github.com/Modern-Treasury/modern-treasury-java/commit/66aaceb8d83017378e6ea41c5e6f3b16cb8a21b8))
* **api:** updates ([#88](https://github.com/Modern-Treasury/modern-treasury-java/issues/88)) ([5182244](https://github.com/Modern-Treasury/modern-treasury-java/commit/51822444862af5720441bce0900d8af0996ca429))
* **api:** updates ([#92](https://github.com/Modern-Treasury/modern-treasury-java/issues/92)) ([495fb76](https://github.com/Modern-Treasury/modern-treasury-java/commit/495fb768d7826b0c2fbc0a13042f5f4e3bb82dee))
* **api:** updates ([#98](https://github.com/Modern-Treasury/modern-treasury-java/issues/98)) ([5aae4a6](https://github.com/Modern-Treasury/modern-treasury-java/commit/5aae4a63d3ecaf62ccb367b993dbaa30916c8b2a))
* **api:** updates parameters, error codes ([#113](https://github.com/Modern-Treasury/modern-treasury-java/issues/113)) ([a0e9d5d](https://github.com/Modern-Treasury/modern-treasury-java/commit/a0e9d5d87d4dee49d8798f4d161a9bc22ddd6cd3))
* **ci:** add a publish-sonatype workflow for manual running ([#26](https://github.com/Modern-Treasury/modern-treasury-java/issues/26)) ([1d96ffc](https://github.com/Modern-Treasury/modern-treasury-java/commit/1d96ffc2716d89111cd11eb44febfefdc20c5663))
* **client:** adjust retry behavior ([#79](https://github.com/Modern-Treasury/modern-treasury-java/issues/79)) ([73c033e](https://github.com/Modern-Treasury/modern-treasury-java/commit/73c033e9b4c4092821e7b69ddf3478e60283d2bc))
* **client:** allow binary returns ([#85](https://github.com/Modern-Treasury/modern-treasury-java/issues/85)) ([fbc9be2](https://github.com/Modern-Treasury/modern-treasury-java/commit/fbc9be29ae9d493a2fe21fc24631624e1e55f27f))
* **client:** retry on 408 Request Timeout ([#58](https://github.com/Modern-Treasury/modern-treasury-java/issues/58)) ([57b6355](https://github.com/Modern-Treasury/modern-treasury-java/commit/57b635532b296e586ac3ce28d5c6d51920c34a47))
* default timeout is set for java clients ([#46](https://github.com/Modern-Treasury/modern-treasury-java/issues/46)) ([a1763d5](https://github.com/Modern-Treasury/modern-treasury-java/commit/a1763d5e2ebe66ca1a87a0185fc67431516aaab8))
* generate addXxx methods for array types ([#48](https://github.com/Modern-Treasury/modern-treasury-java/issues/48)) ([a29d02b](https://github.com/Modern-Treasury/modern-treasury-java/commit/a29d02b4d6609b2f3b4edf7475907cee9bdd8943))
* **github:** include a devcontainer setup ([#84](https://github.com/Modern-Treasury/modern-treasury-java/issues/84)) ([d96ac93](https://github.com/Modern-Treasury/modern-treasury-java/commit/d96ac930e3b0a5cc0061ac3d785ca2b9492708e7))
* make webhook headers case insensitive ([#73](https://github.com/Modern-Treasury/modern-treasury-java/issues/73)) ([4ad3dfc](https://github.com/Modern-Treasury/modern-treasury-java/commit/4ad3dfc87ca5393515ea54b7d28da2bb725c89b0))
* **test:** unskip file uploads tests ([#31](https://github.com/Modern-Treasury/modern-treasury-java/issues/31)) ([60a9300](https://github.com/Modern-Treasury/modern-treasury-java/commit/60a9300b340ed4f5cd5b0c6c9d74bfdec04198a3))
* **types:** consolidate direction enums into a shared TransactionDirection type ([#74](https://github.com/Modern-Treasury/modern-treasury-java/issues/74)) ([acce616](https://github.com/Modern-Treasury/modern-treasury-java/commit/acce616703676cb67cbea6c19f71fa438f937598))


### Bug Fixes

* **api:** add response body to `get /api/virtual_accounts` and update resources ([#3](https://github.com/Modern-Treasury/modern-treasury-java/issues/3)) ([88111f8](https://github.com/Modern-Treasury/modern-treasury-java/commit/88111f85fb6ba4f7a0c0274268d55c7a2839ff5d))
* **api:** use date-time for effective_at ([#77](https://github.com/Modern-Treasury/modern-treasury-java/issues/77)) ([3d08f9c](https://github.com/Modern-Treasury/modern-treasury-java/commit/3d08f9c31e059ac27910a992ebe30eb15bd2fc86))
* auto-close responses even if an exception is thrown during deserialization ([3bf86f7](https://github.com/Modern-Treasury/modern-treasury-java/commit/3bf86f7bc17eb556942365d37a533c9fa03bcb57))
* **ci:** ignore stainless-app edits to release PR title ([#110](https://github.com/Modern-Treasury/modern-treasury-java/issues/110)) ([5b0696c](https://github.com/Modern-Treasury/modern-treasury-java/commit/5b0696c49e921a42d8ffd129b93a782182a9f234))
* **docs:** wrong client import in readme usage example ([#117](https://github.com/Modern-Treasury/modern-treasury-java/issues/117)) ([8b9f3ae](https://github.com/Modern-Treasury/modern-treasury-java/commit/8b9f3ae1e55a299b552e5e90524ca4d5e2d6b0dc))
* **pagination:** correct hasNextPage check ([#114](https://github.com/Modern-Treasury/modern-treasury-java/issues/114)) ([5b711a2](https://github.com/Modern-Treasury/modern-treasury-java/commit/5b711a2d9fd784ab9434a18d3e7a9bdb12438a6b))
* set correct timeouts on okhttp client ([#49](https://github.com/Modern-Treasury/modern-treasury-java/issues/49)) ([f011aa5](https://github.com/Modern-Treasury/modern-treasury-java/commit/f011aa599773e05544f994481ca8ff73aa885c57))
* update maven group id in README ([#71](https://github.com/Modern-Treasury/modern-treasury-java/issues/71)) ([8df492c](https://github.com/Modern-Treasury/modern-treasury-java/commit/8df492ca2f5d73eb872f4de6319ffad00e5e9778))


### Code Refactoring

* **types:** rename account connection flow to account collection flow ([6e9bcc3](https://github.com/Modern-Treasury/modern-treasury-java/commit/6e9bcc386069b783e4428b8a22de122c31ac2227))

## 2.7.0 (2024-02-13)

Full Changelog: [v2.6.1...v2.7.0](https://github.com/Modern-Treasury/modern-treasury-java/compare/v2.6.1...v2.7.0)

### Features

* **api:** updates ([#116](https://github.com/Modern-Treasury/modern-treasury-java/issues/116)) ([f4f553f](https://github.com/Modern-Treasury/modern-treasury-java/commit/f4f553fdba77865f161c2ae7a75045ece19e9e85))
* **api:** updates parameters, error codes ([#113](https://github.com/Modern-Treasury/modern-treasury-java/issues/113)) ([43d7974](https://github.com/Modern-Treasury/modern-treasury-java/commit/43d7974eca0e33bebfb01f52a94a743b6b0998f1))


### Bug Fixes

* **docs:** wrong client import in readme usage example ([#117](https://github.com/Modern-Treasury/modern-treasury-java/issues/117)) ([1f8695a](https://github.com/Modern-Treasury/modern-treasury-java/commit/1f8695aef8d3803defea9abac4f7a9760b6dd588))
* **pagination:** correct hasNextPage check ([#114](https://github.com/Modern-Treasury/modern-treasury-java/issues/114)) ([7f97334](https://github.com/Modern-Treasury/modern-treasury-java/commit/7f97334b10cb4d7fd8ad5941bb018a5a81d76ad4))


### Chores

* **interal:** make link to api.md relative ([#115](https://github.com/Modern-Treasury/modern-treasury-java/issues/115)) ([0111dcc](https://github.com/Modern-Treasury/modern-treasury-java/commit/0111dccffa308f6cab145570752d1f90fba38c35))
* **internal:** support pre-release versioning ([#111](https://github.com/Modern-Treasury/modern-treasury-java/issues/111)) ([6eb780e](https://github.com/Modern-Treasury/modern-treasury-java/commit/6eb780ea4c2323329ad9d02d2bbbae82ae181655))

## 2.6.1 (2024-01-30)

Full Changelog: [v2.6.0...v2.6.1](https://github.com/Modern-Treasury/modern-treasury-java/compare/v2.6.0...v2.6.1)

### Bug Fixes

* **ci:** ignore stainless-app edits to release PR title ([#110](https://github.com/Modern-Treasury/modern-treasury-java/issues/110)) ([717eac6](https://github.com/Modern-Treasury/modern-treasury-java/commit/717eac65e03c696c9a8418800d9f73b6eb701ace))


### Chores

* **internal:** speculative retry-after-ms support ([#108](https://github.com/Modern-Treasury/modern-treasury-java/issues/108)) ([c6b393e](https://github.com/Modern-Treasury/modern-treasury-java/commit/c6b393eab1e075af3ad673c968c4db5ca9eb766e))

## 2.6.0 (2024-01-16)

Full Changelog: [v2.5.0...v2.6.0](https://github.com/Modern-Treasury/modern-treasury-java/compare/v2.5.0...v2.6.0)

### Features

* **api:** add `ledger_transactions` to expected payment request ([#102](https://github.com/Modern-Treasury/modern-treasury-java/issues/102)) ([2b419a8](https://github.com/Modern-Treasury/modern-treasury-java/commit/2b419a8402eaab4cd37e59c382f4df3a33cfb0e3))
* **api:** add create and delete operations for internal accounts balance reports ([#106](https://github.com/Modern-Treasury/modern-treasury-java/issues/106)) ([d5997e0](https://github.com/Modern-Treasury/modern-treasury-java/commit/d5997e07f0bd3f7482f24b69b50d01ffd8a68280))


### Chores

* add .keep files for examples and custom code directories ([#104](https://github.com/Modern-Treasury/modern-treasury-java/issues/104)) ([c6759ef](https://github.com/Modern-Treasury/modern-treasury-java/commit/c6759ef6c296e19b95f74e94f87c629e0caa6214))
* **internal:** minor improvements to auth code ([#105](https://github.com/Modern-Treasury/modern-treasury-java/issues/105)) ([7642412](https://github.com/Modern-Treasury/modern-treasury-java/commit/7642412d3d6cf768afdd3195259efddc4c6995dc))


### Documentation

* **readme:** improve api reference ([#107](https://github.com/Modern-Treasury/modern-treasury-java/issues/107)) ([1079356](https://github.com/Modern-Treasury/modern-treasury-java/commit/10793565733219b1a5d4336b32255fdfeddda410))

## 2.5.0 (2024-01-02)

Full Changelog: [v2.4.1...v2.5.0](https://github.com/Modern-Treasury/modern-treasury-java/compare/v2.4.1...v2.5.0)

### Features

* **api:** remove reversed and reversing ledger account status type ([#100](https://github.com/Modern-Treasury/modern-treasury-java/issues/100)) ([a2f1741](https://github.com/Modern-Treasury/modern-treasury-java/commit/a2f17417def36960ca1fe764548bfd8735793be4))
* **api:** updates ([#98](https://github.com/Modern-Treasury/modern-treasury-java/issues/98)) ([73a5e98](https://github.com/Modern-Treasury/modern-treasury-java/commit/73a5e984d8f0aa2b49a1d82b1ac5fe83488ccd38))


### Chores

* **ci:** run release workflow once per day ([#99](https://github.com/Modern-Treasury/modern-treasury-java/issues/99)) ([b28ec42](https://github.com/Modern-Treasury/modern-treasury-java/commit/b28ec42120cc2b11c2827e34226cb36c45211ca5))
* **internal:** bump license ([#101](https://github.com/Modern-Treasury/modern-treasury-java/issues/101)) ([9b3ad31](https://github.com/Modern-Treasury/modern-treasury-java/commit/9b3ad3139042c09c85898e4d6b4504e0f269e151))

## 2.4.1 (2023-12-04)

Full Changelog: [v2.4.0...v2.4.1](https://github.com/Modern-Treasury/modern-treasury-java/compare/v2.4.0...v2.4.1)

## 2.4.0 (2023-11-21)

Full Changelog: [v2.3.0...v2.4.0](https://github.com/Modern-Treasury/modern-treasury-java/compare/v2.3.0...v2.4.0)

### Features

* **api:** updates ([#92](https://github.com/Modern-Treasury/modern-treasury-java/issues/92)) ([fae01e1](https://github.com/Modern-Treasury/modern-treasury-java/commit/fae01e1de35294fb8fadae3b0694b528d7415ed4))

## 2.3.0 (2023-11-10)

Full Changelog: [v2.2.0...v2.3.0](https://github.com/Modern-Treasury/modern-treasury-java/compare/v2.2.0...v2.3.0)

### Features

* **api:** add dk_interbank_clearing_code and dk_nets enum members ([#90](https://github.com/Modern-Treasury/modern-treasury-java/issues/90)) ([173b9b7](https://github.com/Modern-Treasury/modern-treasury-java/commit/173b9b7d244c80942448dca09871ff7b0f910d4a))
* **api:** updates ([#88](https://github.com/Modern-Treasury/modern-treasury-java/issues/88)) ([182f78c](https://github.com/Modern-Treasury/modern-treasury-java/commit/182f78c8f84bc46f9d5226832638ccab70363706))


### Chores

* **internal:** skip bulk requests tests ([#91](https://github.com/Modern-Treasury/modern-treasury-java/issues/91)) ([c55ffca](https://github.com/Modern-Treasury/modern-treasury-java/commit/c55ffcae3b008ccedfc0687d87b8c5272ed94b50))

## 2.2.0 (2023-11-05)

Full Changelog: [v2.1.0...v2.2.0](https://github.com/Modern-Treasury/modern-treasury-java/compare/v2.1.0...v2.2.0)

### Features

* **client:** allow binary returns ([#85](https://github.com/Modern-Treasury/modern-treasury-java/issues/85)) ([07465e2](https://github.com/Modern-Treasury/modern-treasury-java/commit/07465e24a3a3b077b1fef76e40be1c439fbb8d88))


### Chores

* remove bad tests ([#87](https://github.com/Modern-Treasury/modern-treasury-java/issues/87)) ([c1e20bd](https://github.com/Modern-Treasury/modern-treasury-java/commit/c1e20bd75bbd16afcc929b52761669e12293a3fb))

## 2.1.0 (2023-10-31)

Full Changelog: [v2.0.0...v2.1.0](https://github.com/Modern-Treasury/modern-treasury-java/compare/v2.0.0...v2.1.0)

### Features

* **api:** updates ([#82](https://github.com/Modern-Treasury/modern-treasury-java/issues/82)) ([70acb16](https://github.com/Modern-Treasury/modern-treasury-java/commit/70acb16ca2245bfea7cb047c6f38b1080cd484e2))
* **github:** include a devcontainer setup ([#84](https://github.com/Modern-Treasury/modern-treasury-java/issues/84)) ([4dcfc0c](https://github.com/Modern-Treasury/modern-treasury-java/commit/4dcfc0c46569012f7bc6557e3f1b45d0f0637233))

## 2.0.0 (2023-10-24)

Full Changelog: [v1.5.1...v2.0.0](https://github.com/Modern-Treasury/modern-treasury-java/compare/v1.5.1...v2.0.0)

### ⚠ BREAKING CHANGES

* **types:** consolidate direction enums into a shared TransactionDirection type ([#74](https://github.com/Modern-Treasury/modern-treasury-java/issues/74))

### Features

* **api:** updates ([#78](https://github.com/Modern-Treasury/modern-treasury-java/issues/78)) ([3aa932b](https://github.com/Modern-Treasury/modern-treasury-java/commit/3aa932b4edf4c4a7e18fae55e77e12ad213e39b4))
* **client:** adjust retry behavior ([#79](https://github.com/Modern-Treasury/modern-treasury-java/issues/79)) ([c862814](https://github.com/Modern-Treasury/modern-treasury-java/commit/c8628148adf14978f5e2de5d8d73b8ecdb4e919b))
* make webhook headers case insensitive ([#73](https://github.com/Modern-Treasury/modern-treasury-java/issues/73)) ([0f646f6](https://github.com/Modern-Treasury/modern-treasury-java/commit/0f646f64d3e46cbf9bdc89e8a564d3cbd476e4ef))
* **types:** consolidate direction enums into a shared TransactionDirection type ([#74](https://github.com/Modern-Treasury/modern-treasury-java/issues/74)) ([e5e0bdc](https://github.com/Modern-Treasury/modern-treasury-java/commit/e5e0bdc1d0b32ae5401943d374992c2ebf4181dc))


### Bug Fixes

* **api:** use date-time for effective_at ([#77](https://github.com/Modern-Treasury/modern-treasury-java/issues/77)) ([477ae84](https://github.com/Modern-Treasury/modern-treasury-java/commit/477ae84d38e72159cf7dee36799b8b480677c652))
* update maven group id in README ([#71](https://github.com/Modern-Treasury/modern-treasury-java/issues/71)) ([66779c8](https://github.com/Modern-Treasury/modern-treasury-java/commit/66779c8bfff7bd703117bad1546d80c7c8dea4e5))


### Chores

* **internal:** minor reformatting ([#70](https://github.com/Modern-Treasury/modern-treasury-java/issues/70)) ([ce8ded5](https://github.com/Modern-Treasury/modern-treasury-java/commit/ce8ded557777059ebb8b4bb814d3c7ed706057cc))
* **internal:** rearrange client arguments ([#68](https://github.com/Modern-Treasury/modern-treasury-java/issues/68)) ([9089d98](https://github.com/Modern-Treasury/modern-treasury-java/commit/9089d9849c25a112b7fb725725bd2582e02b937a))
* update README ([#67](https://github.com/Modern-Treasury/modern-treasury-java/issues/67)) ([bc21677](https://github.com/Modern-Treasury/modern-treasury-java/commit/bc21677ce9f472ead109501e1b680fd126325e02))


### Documentation

* organisation -&gt; organization (UK to US English) ([#75](https://github.com/Modern-Treasury/modern-treasury-java/issues/75)) ([d8778e6](https://github.com/Modern-Treasury/modern-treasury-java/commit/d8778e6854490fde0af0bb354a6083d7bfe034d0))

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
