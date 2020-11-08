package com.harman.test;

import com.harman.abstractclasses.ProductService;
import com.harman.beans.Product;
import com.harman.exception.ProductException;
import com.harman.implementation.ProductServiceImpl;

public class ProductTest {
	
	public static void main (String[] args) {
		
		Product products[] = 
					new Product[3];
		
		for (int i = 0; i< products.length;i++) {
			products[i] = 
					new Product(i, "vehicle", "Vehicle description", (i+1) * 500
							, "car");
			
		}
		
		ProductService productService = new ProductServiceImpl();
		
		try {
			productService.addProduct(products[0]);
		} catch (ProductException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println(products[0]);
		
		
		Product p1 = new Product(1, "Vehicle", "descrip", 500, "bike");
		Product p2 = new Product(1, "Vehicle", "descrip", 500, "bike");
		
		boolean flag = (p1 == p2); //memory location
		System.out.println("products :" + flag);
		
		boolean flag1 = p1.equals(p2);
		System.out.println("products :" + flag1);
		
		
	}

}
