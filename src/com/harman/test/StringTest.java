package com.harman.test;

import java.util.StringTokenizer;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hi";  //0x1189
		
		String str1 = "Hi"; //0x1189
		
		//String Pool 
		
		//both str and str1 will refer same memory location
		
		System.out.println(str.equals(str1));
		
		System.out.println(str == str1); // memory location  //true
		
		
		String str2 = new String ("Hi"); // will not be created in string pool 
		//0x67896
		System.out.println(str == str2); //memory  //false
		System.out.println(str.equals(str2)); // true
		
		String var = new String("This is my string variable..");
		
		System.out.println("length:" + var.length());
		
		System.out.println("value at index 6:" + var.charAt(6));
		
		System.out.println("index of m:" + var.indexOf("m"));
		
		System.out.println("index of s:" + var.indexOf("s"));
		
		System.out.println(var.indexOf("s", 7));
		
		System.out.println(var.lastIndexOf("a")) ; 
		
		System.out.println(var.substring(2, 5));
		
		System.out.println("Example of Split...");
		String[] strArry = var.split("my");
		
		for (String str5 : strArry) {
			System.out.println(str5);
		}
		
		System.out.println("saasd");
		
		
		str2 = str2 + "new value"; // new memory location
		str2 = str2 + " again modified"; //new memory location
		//
		System.out.println(str2);
		StringBuffer stringBuffer = new StringBuffer();
		
		stringBuffer.append("Hi");
		stringBuffer.append("new value");
		stringBuffer.append("again modified");
		
		System.out.println(stringBuffer.reverse());
		
		System.out.println("reverse using string..");
		for (int i = str2.length() - 1; i>=0 ; i--) {
			System.out.print(str2.charAt(i));
		}
		
		//Thread safe object, -> It is synchronized
		StringBuffer stringBuffer1 = new StringBuffer(str2);
		
		// not thread safe -> it is not synchronized
		StringBuilder stringBuilder = new StringBuilder(str2);
		
		String var1 = new String("This is my, string, vari:able..");
		
		StringTokenizer tokenizer = new StringTokenizer(var1, ",");
		
		System.out.println("Using String tokenizer");
		while (tokenizer.hasMoreTokens()) {
			
			String token = tokenizer.nextToken();
			System.out.println(token);
			
		}	

	}

}

