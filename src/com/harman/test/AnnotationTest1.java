package com.harman.test;

import java.lang.annotation.Annotation;

import com.harman.abstractclasses.MyAnnotation;

public class AnnotationTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Reflection
		
		//String str = "Hi";
		
		Class sampleClass = Sample.class;
		Annotation annotations[] = 
				sampleClass.getDeclaredAnnotations();
		
		for (int i = 0; i<annotations.length;i++ ) {
			Annotation annotation = annotations[i];
			
			if (annotation instanceof MyAnnotation) {
				MyAnnotation myAnnotation = (MyAnnotation) annotation;
				System.out.println(myAnnotation.age());
				System.out.println(myAnnotation.name());
				System.out.println(myAnnotation.value());
				
				for (String color : myAnnotation.colors()) {
					System.out.println(color);
				}
							
				//Business logic 
			}
		}
		
	}

}
