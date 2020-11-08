package com.harman.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.harman.beans.Product;

//Lamba expressions will reduce the java code

@FunctionalInterface
interface VehicleInterface {
	public String drive(String type, String type1);
}

public class LamdaExpressionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable run = new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("in run method..");
			}
		};
		
		new Thread(run).start();		
		
		//Using Lamda expressions
		
		Runnable run1 = () -> {
			System.out.println("Using Lamba expression");
		};
		new Thread(run1).start();
		
		//Functional interface + Anonymous inner classes = Lamda expressions.
		
		VehicleInterface vehicleInterface = ( str,  str1) -> {
			System.out.println("Using Lamba expression of drive method " + str + " " + str1);
			return str +" " + str1;
		};
		
		String result = vehicleInterface.drive("Bike", "Car");
		System.out.println("result:" + result);
		
		
		List<Product> productList = new ArrayList<Product>();
		
		productList.add(new Product(1, "ABC", "fsasf", 500, "vehicle"));
		productList.add(new Product(2, "ABC", "fsasf", 1000, "mobile"));
		productList.add(new Product(3, "DEF", "fsasf", 50, "laptop"));
		productList.add(new Product(4, "SDF", "fsasf", 200, "laptop"));
		productList.add(new Product(5, "JHK", "fsasf", 700, "mobile"));
		
		Stream<Product> productStream = productList.stream(); 
		productStream.forEach(p -> System.out.println(p));
		
		System.out.println("product count:" + productList.stream().count());
		List<Product> filteredList = productList.stream().filter(p -> p.getType().equals("laptop"))
												.collect(Collectors.toList());
		System.out.println("After filer with laptop");
		filteredList.stream().forEach(p ->  {
			System.out.println(p);
		});		
		
		Stream<Product> pStream = productList.stream();
		productList.stream().filter(p -> p.getProductId() > 3).collect(Collectors.toList());
		
		Set<Integer> keySet = productList.stream().map(p -> p.getProductId()).collect(Collectors.toSet());
		
		keySet.stream().forEach(a -> System.out.println(a));
		
		List<String> abcList = Arrays.asList("Hi", "Hi", "Sample");
		
		abcList.stream().distinct().forEach(a -> System.out.println(a));
		
		List<Integer> intList = Arrays.asList(1, 10, 5, 100, 200, 30);
		
		//Integer class
		//compare method static
		//Static method reference
		System.out.println(intList.stream().max(Integer::compare).get());
		
	}

}
