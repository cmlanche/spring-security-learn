package io.bloogle.browser;

import io.bloogle.browser.auth.AuthFailedHandler;
import io.bloogle.browser.auth.AuthSuccessHandler;
import io.bloogle.core.properties.SecurityProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Created by cmlanche on 2018/8/12.
 */
@Configuration
public class BrowserSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    SecurityProperties securityProperties;
    @Autowired
    AuthSuccessHandler authSuccessHandler;
    @Autowired
    AuthFailedHandler authFailedHandler;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override

    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin()
                .loginPage("/auth/req")
                .loginProcessingUrl("/auth/form")
                .successHandler(authSuccessHandler)
                .failureHandler(authFailedHandler)
                .and()
                .authorizeRequests()
                .antMatchers("/auth/req", securityProperties.getBrowserProperties().getLoginPage()).permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .cors().disable();
    }
}
