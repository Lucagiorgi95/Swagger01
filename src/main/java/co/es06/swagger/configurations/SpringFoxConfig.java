package co.es06.swagger.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

@Configuration
public class SpringFoxConfig {

    @Bean
    public Docket api() {

        ApiInfo apiInfo = new ApiInfo(
                "Esercizio Swagger01",
                "API",
                "1.0.0",
                "https://en.wikipedia.org/wiki/MIT_License",
                new Contact("Luca", "https://luca.co", "luca@gmail.co"),
                "MIT",
                "https://en.wikipedia.org/wiki/MIT_License",
                Collections.emptyList()
        );

        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build().apiInfo(apiInfo)
                .tags(
                        new Tag("controller", "Description")
                )
                ;
    }

}
