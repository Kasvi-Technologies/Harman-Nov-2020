package com.harman.test;
import com.harman.abstractclasses.Calculator;

import com.harman.beans.Employee;
import com.harman.implementation.CalculatorImpl;

public class SampleTest {

	//Starting executable of the java application
	
	//Data types - are used to store the information
	
	// int, long -> integer related informations
	
	//float, double - > decimal information  100.50
	
	//char -> 'M' or 'F' , 'Y' , 'N'
	
	//boolean -> true and false
	
	//String is an Object  -> store gorup of charecters or multiple charecters
	
	//int abc= 100; // object level
	
	private static final int abc = 100; //constants
	
	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub
		
		//datatype variable = value;
		int empId = 100;  // 32 bit value 
		long empIdLong = 100L; // 64 bit
		
		float salary = 500.40f;
		double salaryDouble = 500.40;
		
		char gender = 'M';
		boolean flag = true;
		
		String str = "String variable................";
		
		System.out.println("My first java appliation: empId: " + empId +" salary:" 
							+ salary + " gender:" + gender + " flag:"+ flag + " str:" 
							+ str);
		
		System.out.println("My Second line");

		//create an object -> real time entity
		//employee1 is called as an object
		Employee employee1 = new Employee();

		employee1.setEmpId(1);
		employee1.setEmpName("Employee1");
		employee1.setEmpDesignation("Software Engineer");
		employee1.setGender('M');
		employee1.setSalary(15000);
		
		Employee employee2 = new Employee(); // constructor will be invoked 
		
		employee2.setEmpId(2);
		employee2.setEmpName("Employee2");
		employee2.setEmpDesignation("Sr. Software Engineer");
		employee2.setGender('F');
		employee2.setSalary(25000);
		
		
		Employee employee3 = 
						new Employee(3, "Employee3" , "Lead Software Engineer", 500.00, 'M');
		
		System.out.println("department from class: " + Employee.department);
		System.out.println("employee1 info :" + employee1.getEmpId() + " " 
												+ employee1.getEmpName()+" "
												+ employee1.department);		
		employee1.department = "Modified Department";
		
		System.out.println("employee2 info :" + employee2.getEmpId() + " " + 
												employee2.getEmpName()+
												 "" +employee2.department);
		
		System.out.println("employee3 info :" + employee3.getEmpId() + " " 
							+ employee3.getEmpName()
							+ " " + employee3.department);
		
		System.out.println("modified using employee1: " + Employee.department);
		
		//can't create an instance or abstract classes
		Calculator calcImpl = new CalculatorImpl(); 
		//
		
		int sum = calcImpl.sum(5,6);
		float sum1 = calcImpl.sum(6.3f, 7.5f, 8.0f);
		calcImpl.display(); //run-time polymorphism
		
		System.out.println("sum:" + sum + " sum1:" + sum1);
		
		
	} //main mthod closure

} //class closure
