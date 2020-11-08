package com.harman.innerclass.example;

import com.harman.innerclass.example.OuterClass.MemberInnerClass;

public class OuterClass {	
	private int a =100;
	//Member inner class - a class created with in a class and out side of all methods
	public class MemberInnerClass {
		public void innerMethodd() {
			System.out.println("member inner class method..");
			display ();
			System.out.println("private var of outer:" + a);
		}
	}
	
	public void display () {
		System.out.println("outer method display..");
	}
}

//OuterClass outerClass = new OuterClass();
//OuterClass.MemberInnerClass innerClass =  outerClass.new MemberInnerClass();
//innerClass.innerMethodd();