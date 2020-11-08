package com.harman.test;

import com.harman.abstractclasses.EmployeeService;
import com.harman.beans.Employee;
import com.harman.implementation.EmployeeServiceImpl;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[5]; //arrays are always fixed
		//a[0], a[1], a[2]..a[4]
		a[0] =100;
		a[1] = 500;
		a[2] =300;
		a[3] = 400;
		a[4] = 500;
		
		String str [] = new String[10];
		
		Employee emp[] = new Employee[3];
		//emp[0], emp[1], emp[2],
		
		EmployeeService employeeService = 
				new EmployeeServiceImpl();

		
		for (int i = 0; i<emp.length;i++) {
			emp[i] = new Employee(i+1, "Employee name of " + (i+1), "SW Engr",
								500*(i+1), 'M');
			
			employeeService.addEmployee(emp[i]);
			
		}
		
		
		
		Employee employee = 
				new Employee(1, "Harman Employee", "Sr. SW ENGR", 1000, 'M');
				
		int pk = employeeService.addEmployee(employee);
		
		employeeService.updateEmployee(employee);
		
		//boolean flag = employeeService.deleteEmployee(1);
		
		Employee returnEmployee = employeeService.fetchEmployee(1);		

	}

}
