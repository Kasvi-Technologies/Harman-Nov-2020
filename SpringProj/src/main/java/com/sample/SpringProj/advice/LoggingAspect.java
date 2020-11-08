package com.sample.SpringProj.advice;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    @Before("execution(* com.sample.SpringProj.Service.CustomerService.addCustomer(..))")
    public void logBefore(JoinPoint joinPoint) {

        System.out.println("logBefore() is running!");
        System.out.println("hijacked : " + joinPoint.getSignature().getName());
        System.out.println("******");
    }
    
    @After("execution(* com.sample.SpringProj.Service.CustomerService.addCustomer(..))")
    public void logAfter(JoinPoint joinPoint) {

        System.out.println("logAfter() is running!");
        System.out.println("hijacked : " + joinPoint.getSignature().getName());
        System.out.println("******");

    }
    
    @AfterReturning(
    	      pointcut = "execution(* com.sample.SpringProj.Service.CustomerService.addCustomerReturnValue(..))",
    	      returning= "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {

    	    System.out.println("logAfterReturning() is running!");
    	    System.out.println("hijacked : " + joinPoint.getSignature().getName());
    	    System.out.println("Method returned value is : " + result);
    	    System.out.println("******");

    }
    
    @AfterThrowing(
    	      pointcut = "execution(* com.sample.SpringProj.Service.CustomerService.addCustomerThrowException(..))",
    	      throwing= "error")
    	    public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {

    	    System.out.println("logAfterThrowing() is running!");
    	    System.out.println("hijacked : " + joinPoint.getSignature().getName());
    	    System.out.println("Exception : " + error);
    	    System.out.println("******");

    }
    
    @Around("execution(* com.sample.SpringProj.Service.CustomerService.addCustomerAround(..))")
    public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {

     System.out.println("logAround() is running!");
     System.out.println("hijacked method : " + joinPoint.getSignature().getName());
     System.out.println("hijacked arguments : " + Arrays.toString(joinPoint.getArgs()));
         
     System.out.println("Around before is running!");
     joinPoint.proceed(); //continue on the intercepted method
     System.out.println("Around after is running!");
         
     System.out.println("******");

    }
    
    

}