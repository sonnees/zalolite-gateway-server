package com.zalolite.gatewayservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

@Configuration
public class CorsConfig {
    @Bean
    @Primary
    public CorsWebFilter corsWebFilter() {
        return new CorsWebFilter(new UrlBasedCorsConfigurationSource());
    }
}
