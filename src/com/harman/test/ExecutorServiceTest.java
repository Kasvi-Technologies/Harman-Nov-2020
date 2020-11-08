package com.harman.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.harman.beans.Employee;


class SendMailCallable implements Callable {

	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("calling callble interface...");
		//perform send mail operation..
		
		//100000 lines...
		
		//return
		//return
		return "success";
	}
	
}

class EmployeeCallable implements Callable<Employee> {

	@Override
	public Employee call() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("calling callble interface...");
		//perform send mail operation..
		
		Employee emp = new Employee(1, "asdasd", "asdasd", 324324, 'F');
		return emp;
	}
	
}




class SampleRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i< 10; i++){
			System.out.println("Sampl runnable interface example..." +i );
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
}
public class ExecutorServiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
		ExecutorService service = Executors.newFixedThreadPool(5);
		
		
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				for (int i =0; i<10; i++) {
					System.out.println("running runnable interfaces using anonymous "
							+ "inner classes." + i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		};
		
		service.execute(runnable);
		service.execute(new SampleRunnable());
		
		Future future = service.submit(runnable);
		
		try {
			System.out.println("return value of runnable interface run method:" 
								+ future.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Future callableReturnFuture = service.submit(new SendMailCallable());
		try {
			System.out.println("callableReturnValue:" + callableReturnFuture.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
				
		Future<Employee> employeeReturnFuture = service.submit(new EmployeeCallable());
		try {
			System.out.println("employee return Val:" + employeeReturnFuture.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		service.shutdown();

	}

}
