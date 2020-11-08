package com.harman.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.harman.beans.Employee;

//all file related classes available from java.io package
public class FilesExTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File ("C:\\anil\\sample1.txt");
		
		System.out.println("exists:" + file.exists());
		
		FileInputStream fin =  null;
		FileOutputStream fout =  null;
		try {
			file.createNewFile();
			
			System.out.println(file.exists());
			System.out.println(file.isDirectory());
			
			File f1 = new File("C:\\anil");
			String f1List[] = f1.list();
			
			for (String f : f1List) {
				System.out.println(f);
			}
			
			//read and write into file
			
			//InputStreams -> read   -> read()
			//OutputStreams  -> writting  -> write()
			//A-Z 65 - 90
			//a-z 97 - 122
			System.out.println("Reading from file..");
			fin = new FileInputStream("C:\\anil\\sample.txt");
			fout = new FileOutputStream("C:\\anil\\sample1.txt");
			
			int a ;
			while ((a= fin.read())!= -1) {
				System.out.print((char)a);
				fout.write((char)a);
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//Serialization and deserialization
		//Serialization -writing the state of the an object into file system
		//Desrialization - > reading an object from filesystem 
		Employee emp = new Employee(1, "ADadAD", "adAD", 3434, 'f');
		
		//ObjectInputStream
		//ObjectOutputStream
		FileOutputStream fout1 = null;
		ObjectOutputStream oOut = null;
		try {
			 fout1 = new FileOutputStream("C:\\anil\\employee.ser"); 
			 oOut = new ObjectOutputStream(fout1);
			 oOut.writeObject(emp);
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
		
		
	//	file.
	} // 

}
