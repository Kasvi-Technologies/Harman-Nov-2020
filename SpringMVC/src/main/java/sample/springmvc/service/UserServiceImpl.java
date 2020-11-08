package sample.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;

import sample.springmvc.dao.UserDao;
import sample.springmvc.model.Login;
import sample.springmvc.model.User;

public class UserServiceImpl implements UserService {

  @Autowired
  public UserDao userDao;

  public int register(User user) {
    return userDao.register(user);
  }

  public User validateUser(Login login) {
    return userDao.validateUser(login);
  }

}
