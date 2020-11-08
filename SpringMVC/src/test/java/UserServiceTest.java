
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import sample.springmvc.model.Login;
import sample.springmvc.model.User;
import sample.springmvc.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:config/user-beans.xml" })
public class UserServiceTest {

  @Autowired
  private UserService userService;

  @Test
  public void testRegister() {
    User user = new User();
    user.setUsername("ranjith");
    user.setPassword("sekar");
    user.setFirstname("Ranjith");
    user.setLastname("Sekar");
    user.setAddress("chennai, t.nagar");
    user.setEmail("ranjith@gmail.com");
    user.setPhone(222);

    int result = userService.register(user);
    Assert.assertEquals(1, result);
  }

  @Test
  public void testValidateUser() {
    Login login = new Login();
    login.setUsername("ranjith");
    login.setPassword("sekar");

    User user = userService.validateUser(login);
    Assert.assertEquals("Ranjith", user.getFirstname());
  }

}
