package com.example.iocexam.controller;

import com.example.iocexam.domain.User;
import com.example.iocexam.servivce.UserService;

public class UserController {

  private UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  public void joinUser() {
    //클라이언트로부터 받은 값을 이용..

    User user = new User();
    user.setName("kang");
    user.setEmail("carami@nate.com");
    user.setPassword("1234");

    userService.joinUser(user);
  }
}
