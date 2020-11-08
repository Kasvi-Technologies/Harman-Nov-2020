package com.harman.abstractclasses;

import com.harman.beans.Employee;
import com.harman.exception.EmployeeException;

public abstract class EmployeeService {
	
	public abstract int addEmployee(Employee employee);
	public abstract void updateEmployee(Employee employee);
	public abstract boolean deleteEmployee(int empId)
							throws EmployeeException;
	public abstract Employee fetchEmployee(int empId);

}
