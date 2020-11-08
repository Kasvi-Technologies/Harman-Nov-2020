package com.harman.implementation;
import com.harman.abstractclasses.Calculator;
import com.harman.interfaces.SampleInterface;

// Inheritance -> obtaining properties from parent class

public class CalculatorImpl extends Calculator implements SampleInterface{	
	
		//it will involve in parent and child class 
		//same method with same signature
	
		//method overriding
		public void display () {
			super.display();
			System.out.println("display method from calculator Impl class.............");
		}
	
		//Method overloading
		@Override
		public int sum (int a, int b) {
			
			return a+b;
			
		}

		@Override
		public float sum(float a, float b, float c) {
			// TODO Auto-generated method stub
			return a+b+c;
		}

		@Override
		public void sampleMethod() {
			// TODO Auto-generated method stub
			
		}
		
}
