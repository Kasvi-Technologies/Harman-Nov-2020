package com.harman.abstractclasses;

import com.harman.beans.Product;
import com.harman.exception.ProductException;

public abstract class ProductService {
	
	public abstract int addProduct(Product product)
				throws ProductException;
	public abstract boolean deleteProduct(int productId);
	public abstract void updateProduct(Product product);
	public abstract Product fetchProductById(int productId);
	
}
