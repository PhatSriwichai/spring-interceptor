package com.aiwine.simple.interceptor.configuration;

import com.aiwine.simple.interceptor.interceptor.HomeInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class ApiConfigurationAdapter extends WebMvcConfigurerAdapter {

    @Autowired
    private HomeInterceptor homeInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(homeInterceptor);
        registry.addInterceptor(homeInterceptor)
                .addPathPatterns("/home*");
    }

}
