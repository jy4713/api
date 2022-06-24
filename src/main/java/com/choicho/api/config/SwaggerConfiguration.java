package com.choicho.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
//@EnableSwagger2
@EnableWebMvc   // Failed to start bean 'documentationPluginsBootstrapper' nullpoint exception 을 위해서 어노테이션 추가
                // 또는 spring.mvc.pathmatch.matching-strategy = ANT_PATH_MATCHER 를 properties에 넣어도 된다.
public class SwaggerConfiguration {
    @Bean
    public Docket swaggerApi() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(swaggerInfo()).select().apis(RequestHandlerSelectors.basePackage("com.choicho.api")).paths(PathSelectors.any()).build().useDefaultResponseMessages(true); // 기본으로 세팅되는 200,401,403,404 메시지를 표시 하지 않음
    }

    private ApiInfo swaggerInfo() {
        return new ApiInfoBuilder().title("Spring API Documentation").description("앱 개발시 사용되는 서버 API에 대한 연동 문서입니다").license("chiocho").licenseUrl("http://choicho.net").version("1").build();
    }
}

