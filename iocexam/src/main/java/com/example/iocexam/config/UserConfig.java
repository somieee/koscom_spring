package com.example.iocexam.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.example.iocexam" })
public class UserConfig {
  // @Bean
  // public UserDao userDao() {
  //   return new UserCaramiDaoImpl();
  // }

  // @Bean
  // public UserDao userDao2() {
  //   return new UserDaoImpl();
  // }

  // @Bean
  // public UserService userService(UserDao userDao) {
  //   return new UserServiceImpl(userDao);
  //   // UserServiceImpl userServiceImpl = new UserServiceImpl();
  //   // userServiceImpl.setUserDao(userDao);
  //   // return userServiceImpl;
  // }

  // @Bean
  // public UserController userController(UserService userService) {
  //   return new UserController(userService);
  // }
}
