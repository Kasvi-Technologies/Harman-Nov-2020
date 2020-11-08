package com.harman.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.harman.beans.Employee;

public class SetExample {
	
	public static Set<String> getSet(int a) {
		if (a == 1) {
			return new HashSet<String>();
		} if (a == 2) {
			return new TreeSet<String>(); // sorting 
		} if (a == 3) {
			return new TreeSet<String>(Collections.reverseOrder()); // sorting 
		}
		else {
			return new LinkedHashSet<String>();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set = getSet(3);
		
		set.add("KKKKKK");
		set.add("Hi");
		set.add("Hello");
		set.add("World");
		boolean flag1 = set.add("World1");
		System.out.println("flag1:" + flag1);
		boolean flag = set.add("Hi");
		System.out.println("flag:" + flag);
		set.add("Asdfsdf");
		set.add("World3");
		
		System.out.println("size of set:" + set.size());
		
		System.out.println("enhanced for loop..");
		for (String str : set) {
			System.out.println(str);
		}
		
		System.out.println("using iterator..");
		Iterator<String> strItr = set.iterator();
		while (strItr.hasNext()) {
			String str = strItr.next();
			System.out.println(str);
		}
		

	}

}
