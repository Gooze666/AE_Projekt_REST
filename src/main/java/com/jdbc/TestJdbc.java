package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://db.tillschreiber.de:3306/Formular";
		String user = "Formular";
		String pass ="Formular!";
		
		
		try {
			System.out.println("Connecting to database: " + jdbcUrl);
			
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
			
			System.out.println("Connection successful.");
		}
		catch (Exception ex) {
			
		}
		
	}

}
