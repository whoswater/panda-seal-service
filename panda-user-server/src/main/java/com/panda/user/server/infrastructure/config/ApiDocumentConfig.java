package com.panda.user.server.infrastructure.config;

import com.google.common.collect.Sets;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author jinli
 */
@Configuration
@EnableSwagger2
public class ApiDocumentConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.panda"))
                .paths(PathSelectors.any())
                .build()
                .produces(Sets.newHashSet("application/json"));
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("熊猫大篆科技-SEAL接口文档")
                .description("熊猫大篆科技-SEAL接口文档")
                .version("1.0.0-SNAPSHOT")
                .build();
    }

}
