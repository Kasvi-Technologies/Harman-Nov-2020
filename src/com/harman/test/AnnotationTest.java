package com.harman.test;

public class AnnotationTest {

	@Deprecated
	public void display () {
		System.out.println("disply method");
	}
	//@SuppressWarnings
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationTest annotationTest = 
									new AnnotationTest();
		
		annotationTest.display();
	}

}
