package com.harman.test;

import com.harman.abstractclasses.Database;
import com.harman.abstractclasses.Vehicle;
import com.harman.innerclass.example.LocalInnerEx;
import com.harman.innerclass.example.OuterClass;


public class InnerclassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Example of Member Inner class
		OuterClass outerClass = new OuterClass();
		OuterClass.MemberInnerClass innerClass = 
				outerClass.new MemberInnerClass();
		
		innerClass.innerMethodd();
		
		//Example of Local Inner class
		System.out.println("Local inner class example....");
		LocalInnerEx localInnerEx= new LocalInnerEx();
		localInnerEx.display();
		
		//Anonymous inner class
		System.out.println("Example of anonymous inner classes..");
		Vehicle bike = new Vehicle() {
			@Override
			public void drive() {
				// TODO Auto-generated method stub
				System.out.println("Bike related drive method...");
			}
		};
		
		Vehicle car = new Vehicle() {
			@Override
			public void drive() {
				// TODO Auto-generated method stub
				System.out.println("Car related drive method...");
			}			
		};
		
		bike.drive();
		car.drive();
		
		//Static inner classes test program
		System.out.println("Example of static inner class program");
		StaticOuter.StaticInner staticInner = new StaticOuter.StaticInner();
		staticInner.staticInnerClasmethod();
		
		//Database anonymous class
		
		Database database = new Database() {

			@Override
			public int insertMethod() {
				// TODO Auto-generated method stub
				System.out.println("Data abse insert method....");
				return 1;
			}
			
			
		};
	}
}

class StaticOuter {
	private static int data = 1000;
	static void display () {
		System.out.println("outer class display method..");
	}
	static class StaticInner {
		void staticInnerClasmethod () {
			System.out.println("inside static inner class.." + data);
			display();
		}
	}
}



