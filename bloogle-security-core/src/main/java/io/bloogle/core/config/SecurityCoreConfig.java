package io.bloogle.core.config;

import io.bloogle.core.properties.SecurityProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by cmlanche on 2018/8/12.
 */
@Configuration
@EnableConfigurationProperties(value = SecurityProperties.class)
public class SecurityCoreConfig {
}
