package com.pajehyk.generated.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SpringDocConfiguration {

    @Bean(name = "com.pajehyk.generated.configuration.SpringDocConfiguration.apiInfo")
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("OpenAPI cf-rating-service")
                                .description("cf-rating-service API.")
                                .license(
                                        new License()
                                                .name("Apache-2.0")
                                                .url("https://www.apache.org/licenses/LICENSE-2.0.html")
                                )
                                .version("1.0.0")
                )
        ;
    }
}