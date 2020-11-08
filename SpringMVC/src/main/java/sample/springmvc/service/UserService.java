package sample.springmvc.service;

import sample.springmvc.model.Login;
import sample.springmvc.model.User;

public interface UserService {

  int register(User user);

  User validateUser(Login login);
}
