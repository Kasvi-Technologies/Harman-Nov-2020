package sample.springmvc.dao;

import sample.springmvc.model.Login;
import sample.springmvc.model.User;

public interface UserDao {

  int register(User user);

  User validateUser(Login login);
}
