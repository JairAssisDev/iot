package com.ifpe.iot.config;

import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocOpenApiConfig {
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("REST API - iot")
                                .description("API para  gestão de salas")
                                .contact(new Contact().name("JairAssisDev").email("jvla2@discente.ifpe.edu.br"))
                );
    }
}
