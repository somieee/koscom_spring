package com.example.todo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.example.todo.repository")
public class ApplicationConfig {
  //   @Bean
  //   public DataSource dataSource() {
  //     DriverManagerDataSource dataSource = new DriverManagerDataSource();
  //     dataSource.setDriverClassName("org.h2.Driver");
  //     dataSource.setUrl("jdbc:h2:tcp://localhost/~/test;MODE=MySQL");
  //     dataSource.setUsername("sa");
  //     dataSource.setPassword("");
  //     return dataSource;
  //   }

  //   // SpringBoot에서는 설정하지 않는다. 자동으로 설정한다.
  //   @Bean
  //   public SqlSessionFactory sqlSessionFactory() throws Exception {
  //     SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
  //     factoryBean.setDataSource(dataSource());
  //     factoryBean.setConfigLocation(
  //       new PathMatchingResourcePatternResolver()
  //         .getResource("classpath:mybatis-spring/mybatis-config.xml")
  //     );

  //     return factoryBean.getObject();
  //   }
}
