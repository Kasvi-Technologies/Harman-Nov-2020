
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.SpringProj.Service.HelloWorldService;
 
 
public class TestHello {
 
	
	public static void main(String[] args) {
 
		// loading the definitions from the given XML file
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");
 
		HelloWorldService service = (HelloWorldService) context
				.getBean("helloWorldService");
		String message = service.sayHello();
		System.out.println(message);
 
		//set a new name
		service.setName("Spring");
		message = service.sayHello();
		System.out.println(message);
	}
}
