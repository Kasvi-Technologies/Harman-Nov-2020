package com.harman.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.harman.beans.Product;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, Product> productMap = new HashMap<Integer, Product>();
				
		productMap.put(1, new Product(1, "asdasd1", "asdsad1", 324324, "sdsf"));
		productMap.put(2, new Product(2, "asdasd2", "asdsad2", 324324, "sdsf"));
		productMap.put(3, new Product(3, "asdasd3", "asdsad3", 324324, "sdsf"));
		productMap.put(4, new Product(4, "asdasd4", "asdsad4", 324324, "sdsf"));
		productMap.put(5, new Product(5, "asdasd5", "asdsad5", 324324, "sdsf"));
		
		System.out.println(productMap.get(3));
		
		System.out.println("Using Iterator");
		
		productMap.remove(2);
		Set<Integer> keySet = productMap.keySet();
		
		for (Integer key : keySet) {
			System.out.println(productMap.get(key));
		}
		
		//...........
				
				
				
				
	}

}
