package com.data.base;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test {
	
static	 String insertSQL= "insert into test.product(id,name,price,description,quantity) value(?,?,?,?,?)";
	public static void add(Product product) {
		try {
			
		Connection connection= 	DriverManager.getConnection("jdbc:mysql//localhost:3306/test", "root","Qwerty@123");
	
		PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);
		
		preparedStatement.setInt(1, product.getId());
		preparedStatement.setString(2,product.getName());
		preparedStatement.setFloat(3, product.getPrice());
		preparedStatement.setString(4,product.getDescription());
		preparedStatement.setInt(5, product.getQuantity());
		
	int	noOfrecords=preparedStatement.executeUpdate();
		
		
		
		if(noOfrecords==1) {
			System.out.println("record added");
		}
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Product product = new Product (24,"processer",500, "AMD ryzen 5",1);

add(product);
		
	}

}
