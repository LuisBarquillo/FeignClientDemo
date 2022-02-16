package com.cognizant.client.configuration;

import feign.RequestInterceptor;
import feign.auth.BasicAuthRequestInterceptor;
import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignClientConfig {

    @Bean
    public ErrorDecoder errorDecoder() {
        return new FeignClientErrorDecoder();
    }

    @Bean
    public RequestInterceptor addHeaders() {
        return requestTemplate -> {
            requestTemplate.header("token","myToken");
            requestTemplate.header("Accept", "application/json" );
        };
    }

    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor("user","pass");
    }
}
