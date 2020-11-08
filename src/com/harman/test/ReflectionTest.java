package com.harman.test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.harman.beans.Product;
import com.harman.implementation.ProductServiceImpl;

public class ReflectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Reflection - you can access class related metadata at runtime
		
		Class productServiceImpl = ProductServiceImpl.class;
		Class productServiceImpl1 = null;
		try {
			//or 
			//another way of obtaining class metadata var
			productServiceImpl1 = 
								Class.forName("com.harman.implementation.ProductServiceImpl");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 
		Method methods[] = productServiceImpl1.getMethods();
		
		for (Method method : methods) {
			System.out.println(method.getName() + " " + method.getParameterCount());
		}
		
		Field fields[] = productServiceImpl1.getFields();
		
		System.out.println(fields==null?"No vars": fields.length);
		
		//int  Integer		
		//float  Float
		//double Double
		//boolean  Boolean
		//char  Char
		//long  Long
		
		try {
			Method method1 = productServiceImpl.getMethod("addProduct", 
									new Class[] {Product.class});
			
			System.out.println("method1:" + method1);
			
			Class productServiceImpl2 = ProductServiceImpl.class; 
			//newInstance is used to create an object at runtime
			
			ProductServiceImpl productServiceImplObj = 
								(ProductServiceImpl) productServiceImpl2.newInstance();
			
			method1.invoke(new ProductServiceImpl(), new Product(1, "sadsad", "aSAS", 4324, "ASDD"));
			//or
			method1.invoke(productServiceImplObj, new Product(1, "sadsad", "aSAS", 4324, "ASDD"));
			
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
