package com.harman.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.harman.beans.Employee;

public class ListTest {

	public static List<Employee> getList(int a) {
		if (a == 1) {
			return new ArrayList<Employee>();
		} else {
			return new LinkedList<Employee>();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;
		
		List<Employee> list = getList(a);
		
		//ArrayList<Employee> arrayList1 = new ArrayList<Employee>();
		//1 
		//arrayList.add("abcd");
		list.add(new Employee(1, "sadasd1", "asdd1", 123, 'F'));
		list.add(new Employee(2, "sadasd2", "asdd2", 223, 'F'));
		list.add(new Employee(3, "sadasd3", "asdd3", 323, 'F'));
		list.add(new Employee(4, "sadasd4", "asdd4", 423, 'F'));
		list.add(new Employee(5, "sadasd5", "asdd5", 523, 'F'));
		
		System.out.println("normal for loop...");
		for (int i = 0; i< list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		list.remove(1);
		
		System.out.println("enhanced for loop..");
		for (Employee emp : list) {
			System.out.println(emp);
		}
		
		System.out.println("using iterator..");
		Iterator<Employee> empItr = list.iterator();
		while (empItr.hasNext()) {
			Employee emp = empItr.next();
			System.out.println(emp);
		}
		

	}

}
