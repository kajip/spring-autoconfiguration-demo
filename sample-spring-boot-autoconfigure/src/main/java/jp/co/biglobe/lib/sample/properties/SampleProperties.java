package jp.co.biglobe.lib.sample.properties;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * application.yml で設定するプロパティ項目の定義
 */
@ConfigurationProperties(prefix="sample")
@Data
public class SampleProperties {

    private String name;

    // プロパティにenumが利用し、入力できる値に制限を掛けることができる
    private Lang lang;
}
