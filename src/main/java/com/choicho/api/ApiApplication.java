package com.choicho.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableWebMvc   // Failed to start bean 'documentationPluginsBootstrapper' nullpoint exception 을 위해서 어노테이션 추가
// 또는 spring.mvc.pathmatch.matching-strategy = ANT_PATH_MATCHER 를 properties에 넣어도 된다.
@SpringBootApplication
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

}
