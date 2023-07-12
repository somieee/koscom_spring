package sample.config;

import org.springframework.context.annotation.Bean;

import sample.MyBean;

public class MyBeanConfig {
    @Bean
    public MyBean myBean(){
        return new MyBean();
    }

    @Bean
    public MyBean myBean2(){
        return new MyBean();
    }
}
