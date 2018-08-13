package io.bloogle.core.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by cmlanche on 2018/8/12.
 */
@Component
@ConfigurationProperties(prefix = "io.bloogle.security")
public class SecurityProperties {

    private String test;

    private BrowserProperties browserProperties;

    public BrowserProperties getBrowserProperties() {
        return browserProperties;
    }

    public void setBrowserProperties(BrowserProperties browserProperties) {
        this.browserProperties = browserProperties;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
