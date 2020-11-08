package com.harman.implementation;

import com.harman.abstractclasses.ProductService;
import com.harman.beans.Product;
import com.harman.exception.ProductException;

public class ProductServiceImpl extends ProductService{

	@Override
	public int addProduct(Product product) 
					throws ProductException{
		// TODO Auto-generated method stub
		System.out.println("in add product.." + product.getProductId());
		
		if (product.getProductId() <=0) {
			throw new ProductException("Product id is invalid..");
		}
			
		return 0;
	}

	@Override
	public boolean deleteProduct(int productId) {
		// TODO Auto-generated method stub
		System.out.println("in delete product..");
		return false;
	}

	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		
		System.out.println("in update product..");
		
	}

	@Override
	public Product fetchProductById(int productId) {
		
		System.out.println("in fetch product.." + productId);
		// TODO Auto-generated method stub
		return null;
	}

}
