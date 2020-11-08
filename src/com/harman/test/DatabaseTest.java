package com.harman.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class DatabaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// it is sued to load the Driver class in JVM		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/harmandb" ;
			String username="root";
			String password="root"; //mysql password
			
			Connection connection = 
					DriverManager.getConnection(url, username, password);
			
			System.out.println("connection..." + connection);
			
			Statement st = connection.createStatement();
			
			String str = "create table product (id int primary key, "
					+ "name varchar(100), description varchar(300),"
					+ "price double, type varchar(50))";
			
			//st.execute(str);
			
			System.out.println("Table created!!!!!!!!!!!!");
			
			String str1 = "insert into product values (2, 'HP Laptop', "
					+ "'HP Laptop Desc', 3444, 'laptop')";
			
			
			int val = st.executeUpdate(str1);
			System.out.println("record inserted................");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
