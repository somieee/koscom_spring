package sample.config;

import org.springframework.context.annotation.ComponentScan;
@ComponentScan(basePackages = {"sample"})
public class MyBeanConfig {
    // @Bean
    // @Scope("prototype")
    // public MyBean myBean(){
    //     return new MyBean();
    // }

    // @Bean
    // public MyBean myBean2(){
    //     return new MyBean();
    // }
}
