package com.harman.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.harman.beans.Product;

public class ProductSerializableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product product = 
							new Product(1, "asdasd", "asd", 21, "asd");
		//ObjectInputStream
				//ObjectOutputStream
				
				//Serialization
				FileOutputStream fout1 = null;
				ObjectOutputStream oOut = null;
				try {
					 fout1 = new FileOutputStream("C:\\anil\\product.ser"); 
					 oOut = new ObjectOutputStream(fout1);
					 oOut.writeObject(product);
					 System.out.println("done...");
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally{
					try {
						oOut.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					try {
						fout1.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				
		
	}

}
