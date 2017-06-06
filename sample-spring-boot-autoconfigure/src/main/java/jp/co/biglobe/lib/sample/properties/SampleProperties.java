package jp.co.biglobe.lib.sample.properties;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * application.yml で設定するプロパティ項目の定義
 */
@ConfigurationProperties("sample")
@Data
public class SampleProperties {

    private String name;

}
