package com.harman.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.harman.beans.Employee;

public class ObjectReadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream fin = null;
		ObjectInputStream oin = null;
		try {
			fin = new FileInputStream("C:\\anil\\employee.ser"); 
			oin = new ObjectInputStream(fin);
			Employee employee = (Employee) oin.readObject();
			System.out.println(employee);
			 System.out.println("done...");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				oin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
