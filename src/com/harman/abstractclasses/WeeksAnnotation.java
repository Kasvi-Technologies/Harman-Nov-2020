package com.harman.abstractclasses;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface WeeksAnnotation {
	String dayOfWeek() default "sunday";	
}
