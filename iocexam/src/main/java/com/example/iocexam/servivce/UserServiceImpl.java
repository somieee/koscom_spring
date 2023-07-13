package com.example.iocexam.servivce;

import com.example.iocexam.dao.UserDao;
import com.example.iocexam.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

  private final UserDao userDao;

  // public UserServiceImpl() {
  //   System.out.println("UserServiceImpl () 생성자");
  // }

  // @Autowired
  // public UserServiceImpl(UserDao userDao) {
  //   System.out.println("UserServiceImpl (userDao) 생성자");
  //   this.userDao = userDao;
  // }

  // public void setUserDao(UserDao userDao) {
  //   this.userDao = userDao;
  // }

  @Override
  public void joinUser(User user) {
    userDao.addUser(user);
  }
}
