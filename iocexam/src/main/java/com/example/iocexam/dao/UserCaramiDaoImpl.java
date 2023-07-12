package com.example.iocexam.dao;

import com.example.iocexam.domain.User;
import java.util.List;

public class UserCaramiDaoImpl implements UserDao {

  @Override
  public User getUser(String email) {
    return null;
  }

  @Override
  public List<User> getUsers() {
    return null;
  }

  @Override
  public void addUser(User user) {
    System.out.println(user + "의 정보가 caramiDao를 통해 잘 저장되었습니다.");
  }
}
