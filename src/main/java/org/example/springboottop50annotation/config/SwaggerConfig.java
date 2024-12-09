package org.example.springboottop50annotation.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("RND TOP 50 Annotation API")
                        .description("RND TOP 50 Annotation API")
                        .contact(new Contact().email("shivakantsingh900@gmail.com").name("ShivaKant Singh"))
                )
                .externalDocs(new ExternalDocumentation());
    }
}
