package jp.co.biglobe.isp.sample.api;

import jp.co.biglobe.isp.sample.configuration.AppProperties;
import jp.co.biglobe.lib.sample.plugins.Greeting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingApi {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    Greeting  greeting;

    @Autowired
    AppProperties properties;

    @RequestMapping("/greeting")
    public String greeting() {
        logger.info("{}", properties);
        return greeting.whatYourName();
    }
}
