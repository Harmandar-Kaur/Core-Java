package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectivity {
	public static void main(String[] args) {
		
		String jdbcURL = "jdbc:mysql://localhost:3306/demoDB?useSSL=false";
		String username = "root";
		String password = "123456";
		Connection con = null;
		try {
			System.out.println("Connecting to DB.....");
			con = DriverManager.getConnection(jdbcURL,username,password);
			System.out.println("Connection is successfull");
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
