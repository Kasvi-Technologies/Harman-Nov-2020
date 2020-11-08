package com.harman.exception;

public class EmployeeException extends Exception {
	
	private String message;
	
	public EmployeeException (){
		
	}
	
	public EmployeeException (String message){
		super(message);
		this.message = message;
	}

}
