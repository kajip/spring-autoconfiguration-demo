package jp.co.biglobe.isp.sample.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("sample-app")
@Data
public class AppProperties {

    private String value;

    private String[] list;
}
