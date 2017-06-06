package jp.co.biglobe.lib.sample.configuration;


import jp.co.biglobe.lib.sample.component.en.GreetingImpl;
import jp.co.biglobe.lib.sample.component.jp.JpGreetingImpl;
import jp.co.biglobe.lib.sample.plugins.Greeting;
import jp.co.biglobe.lib.sample.properties.SampleProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
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

    /**
     * application.yml で言語（sample.lang）によって切替えるサンプル
     */
    @Configuration
    @ConditionalOnProperty(prefix = "sample", name = "lang", havingValue = "jp")
    public static class JpGreetingConfiguration {

        @Autowired
        SampleProperties  sampleProperties;

        @Bean
        public Greeting greeting() {
            return new JpGreetingImpl(sampleProperties.getName());
        }
    }

    @Configuration
    @AutoConfigureBefore(JpGreetingConfiguration.class)
    @ConditionalOnMissingBean(Greeting.class)
    public static class DefaultGreetingConfiguration {

        @Autowired
        SampleProperties  sampleProperties;

        @Bean
        public Greeting greeting() {
            return new GreetingImpl(sampleProperties.getName());
        }
    }
}
