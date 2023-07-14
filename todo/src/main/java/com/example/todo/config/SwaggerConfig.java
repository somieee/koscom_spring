package com.example.todo.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

  @Bean
  public GroupedOpenApi publicApi() {
    return GroupedOpenApi
      .builder()
      .group("v1-definition")
      .pathsToMatch("/api/**")
      .build();
  }

  @Bean
  public OpenAPI springTodoOpenApi() {
    return new OpenAPI()
      .info(
        new Info()
          .title("ToDo API")
          .description("ToDo 프로젝트 API 명세서 입니다. ")
          .version("v0.0.1")
      );
  }
}
