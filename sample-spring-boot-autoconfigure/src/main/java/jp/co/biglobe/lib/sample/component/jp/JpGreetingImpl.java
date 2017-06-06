package jp.co.biglobe.lib.sample.component.jp;

import jp.co.biglobe.lib.sample.plugins.Greeting;
import lombok.Data;

@Data
public class JpGreetingImpl implements Greeting {

    private final String name;

    @Override
    public String whatYourName() {
        return "こんにちは、" + name;
    }
}
