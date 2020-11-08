package com.harman.abstractclasses;

//This class provides only abstract features 

//This will provide only essential information with out informing inner implementation
// This is called Abstraction

public abstract class Calculator {
	
	//non-abstract method
	public void display () {
		System.out.println("display method from calculator class.............");
	}
	
	//Method overloading
	public abstract int sum (int a, int b) ;
	public abstract float sum (float a, float b, float c);
}


//Inheritance
//public class CalculatorImpl extends Calculator {


//In test program..

//Calculator calcImpl = new CalculatorImpl();
//
//int sum = calcImpl.sum(5,6);
//float sum1 = calcImpl.sum(6.3f, 7.5f, 8.0f);
//calcImpl.display();