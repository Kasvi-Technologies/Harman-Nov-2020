package com.harman.test;

import com.harman.abstractclasses.EmployeeService;
import com.harman.exception.EmployeeException;
import com.harman.implementation.EmployeeServiceImpl;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("before exception..");
		//try with resources
		
		try {
			// block where you need to keep the business logic
			//which can throw the exception
			String str = "";
			System.out.println(str.length());
			//skips these lines
			int a = 5/2; //
//			String stringVal [] = new String[3];
//			System.out.println(stringVal[5]); //ArrayIndexOutOfBoundsexception
			
			EmployeeService empservice = new EmployeeServiceImpl();
			empservice.deleteEmployee(-1);
			
		} catch(ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException |
				EmployeeException ex) {
			System.out.println("exception:" + ex.getMessage());
		} finally {
			//it will always executed, whether exception occurs or not
			//clean up 
			//closing database connections
			//closing the streams.
			System.out.println("finally block to clean up..");
			
		}
		
		System.out.println("remaing business logic");
	}

}
