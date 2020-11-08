import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.SpringProj.Service.CustomerService;


public class SpringAdviceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

	      CustomerService customerService = 
	         (CustomerService)context.getBean("customerService");
	     
	      customerService.addCustomer();
	      customerService.addCustomerReturnValue();
	      customerService.addCustomerAround("Sample");
	      try {
			customerService.addCustomerThrowException();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      

	}

}
