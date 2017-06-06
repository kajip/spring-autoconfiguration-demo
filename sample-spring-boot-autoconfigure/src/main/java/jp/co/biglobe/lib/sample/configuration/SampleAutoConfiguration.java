package jp.co.biglobe.lib.sample.configuration;


import jp.co.biglobe.lib.sample.component.GreetingImpl;
import jp.co.biglobe.lib.sample.plugins.Greeting;
import jp.co.biglobe.lib.sample.properties.SampleProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自動的に有効化されるConfigurationBean。
 * META-INF/spring.factories から有効化される
 */
@Configuration
//@AutoConfigureBefore({SamplePrevConfiguration.class})  // このBeanを有効化する前に有効化するコンフィグ
@EnableConfigurationProperties({SampleProperties.class}) // sampleプロパティの有効化
public class SampleAutoConfiguration {

    @Autowired
    SampleProperties  sampleProperties;

    @Bean
    public Greeting greeting() {
        return new GreetingImpl(sampleProperties.getName());
    }
}
