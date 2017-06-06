# spring-autoconfiguration-demo

Spring BootのAutoConfiguration機能でプロジェクト側にXML等を作らなくても勝手に初期化するライブラリのサンプル

## サブプロジェクト

* sample-spring-boot-autoconfigure ... AutoConfigurationされるライブラリ本体
* sample-spring-boot-starter ... Spring Boot の流儀に則ったライブラリ。ある機能を実現するために必要なライブラリをまとめて依存性定義する。アプリから直接ライブラリを呼んでも問題ない
* sample-spring-boot-app ... ライブラリを使ったアプリケーション定義

## 使い方

* 下記コマンドで Spring Boot を起動し、ブラウザで　http://localhost:8080/greeting にアクセスする

    ```% ./gradle clean bootRun```

* sample-spring-boot-app の resources/application.yml をつかってライブラリが返す文字列を変更できる
