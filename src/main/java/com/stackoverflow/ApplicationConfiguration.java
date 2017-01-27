package com.stackoverflow;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author daniel.bubenheim@gmail.com
 */
@Configuration
public class ApplicationConfiguration extends WebMvcConfigurerAdapter {

    @Bean
    public MyRequestInterceptor requestHandler() {
        return new MyRequestInterceptor();
    }

    @Override
    public void addInterceptors(final InterceptorRegistry registry) {
        registry.addInterceptor(requestHandler());
    }
}