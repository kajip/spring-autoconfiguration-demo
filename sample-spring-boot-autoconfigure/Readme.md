# sample-spring-autoconfigure

ライブラリ本体

## AutoConfigurationライブラリを作るために最低限用意しなければならないもの

* src/main/resources/META-INF/spring.factories ... このライブラリをロードしたとき、自動的に読み込まれるConfiguration Bean のクラス名リスト
* src/main/java/**/configuration/SampleAutoConfiguration.java ... 自動的に読み込まれるConfiguration Bean
* src/main/java/**/properties/SampleProperties.java ... application.yml に新しいプロパティ項目を追加するためのPOJOクラス（オプション）
