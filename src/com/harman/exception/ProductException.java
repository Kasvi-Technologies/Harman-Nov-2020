package com.harman.exception;

public class ProductException extends Exception {
	
	private String message;
	
	public ProductException (){
		
	}
	
	public ProductException (String message){
		super(message);
		this.message = message;
	}

}
