package com.harman.test;

import java.lang.annotation.Annotation;

import com.harman.abstractclasses.SampleWeeks;
import com.harman.abstractclasses.WeeksAnnotation;

public class WeeksAnnotationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class sampleWeekClass = SampleWeeks.class;
		
		Annotation[] annotations =  sampleWeekClass.getDeclaredAnnotations();
		
		for (Annotation annotation : annotations) {
			
			if (annotation instanceof WeeksAnnotation) {
				
				WeeksAnnotation weeksAnnotation =  (WeeksAnnotation) annotation;
				
				System.out.println(weeksAnnotation.dayOfWeek());
				
				
			}
			
		}
		
		
	}

}
