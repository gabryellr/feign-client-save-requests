package com.gabryellr.feignclientsaverequests.feign.config;

import com.gabryellr.feignclientsaverequests.feign.handler.CustomErrorDecoder;
import com.gabryellr.feignclientsaverequests.feign.handler.CustomRequestInterceptor;
import feign.Client;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {
    @Bean
    public CustomErrorDecoder errorDecoder() {
        return new CustomErrorDecoder();
    }

    @Bean
    public Client client() {
        return new CustomRequestInterceptor();
    }
}