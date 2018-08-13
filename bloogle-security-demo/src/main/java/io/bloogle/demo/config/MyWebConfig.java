package io.bloogle.demo.config;

import io.bloogle.demo.interceptors.MyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by cmlanche on 2018/8/12.
 */
@Configuration
public class MyWebConfig extends WebMvcConfigurerAdapter {

    @Autowired
    MyInterceptor interceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        super.addInterceptors(registry);
        registry.addInterceptor(interceptor);
    }
}
