package com.harman.implementation;

import com.harman.abstractclasses.EmployeeService;
import com.harman.beans.Employee;
import com.harman.exception.EmployeeException;

public class EmployeeServiceImpl extends EmployeeService{

	@Override
	public int addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("adding employee of id:" + employee.getEmpId());
		
		System.out.println(employee);
		return 0;
	}

	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		System.out.println("updating employee :");
		
	}

	//throws is the keyword to used to specify in the method signature,
	// that specify that your method might throw the exception
	// 
	@Override
	public boolean deleteEmployee(int empId) throws EmployeeException{
		// TODO Auto-generated method stub
		System.out.println("deleting employee :");
		
		if (empId <=0) {
			//throw is the keyword which will be used to thorw manual exceptions..
			
			throw new EmployeeException ("Employee id not valid");
		}
		return false;
	}

	@Override
	public Employee fetchEmployee(int empId) {
		// TODO Auto-generated method stub
		System.out.println("fetching employee :");
		return null;
	}

}
