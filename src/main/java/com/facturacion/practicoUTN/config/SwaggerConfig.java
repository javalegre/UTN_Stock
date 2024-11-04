package com.facturacion.practicoUTN.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springdoc.core.GroupedOpenApi;

@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi api() {
        return GroupedOpenApi.builder()
                .group("api")
                .packagesToScan("com.facturacion.practicoUTN") // Cambia el paquete base según tu estructura
                .pathsToMatch("/**")
                .build();
    }
}

