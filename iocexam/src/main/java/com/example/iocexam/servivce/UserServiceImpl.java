package com.example.iocexam.servivce;

import com.example.iocexam.dao.UserDao;
import com.example.iocexam.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class UserServiceImpl implements UserService {

  private UserDao userDao;

  public UserServiceImpl(UserDao userDao) {
    this.userDao = userDao;
  }

  @Autowired
  @Qualifier("userDao2")
  public void setUserDao(UserDao userDao) {
    this.userDao = userDao;
  }

  @Override
  public void joinUser(User user) {
    userDao.addUser(user);
  }
}
