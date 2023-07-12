package com.example.iocexam.config;

import com.example.iocexam.controller.UserController;
import com.example.iocexam.dao.UserCaramiDaoImpl;
import com.example.iocexam.dao.UserDao;
import com.example.iocexam.dao.UserDaoImpl;
import com.example.iocexam.servivce.UserService;
import com.example.iocexam.servivce.UserServiceImpl;
import org.springframework.context.annotation.Bean;

public class UserConfig {

  @Bean
  public UserDao userDao1() {
    return new UserCaramiDaoImpl();
  }

  @Bean
  public UserDao userDao2() {
    return new UserDaoImpl();
  }

  @Bean
  public UserService userService(UserDao userDao) {
    return new UserServiceImpl(userDao);
    // UserServiceImpl userServiceImpl = new UserServiceImpl();
    // userServiceImpl.setUserDao(userDao);
    // return userServiceImpl;
  }

  @Bean
  public UserController userController(UserService userService) {
    return new UserController(userService);
  }
}
