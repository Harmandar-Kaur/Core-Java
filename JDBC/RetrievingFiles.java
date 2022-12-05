package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//import com.mysql.cj.xdevapi.Statement;

public class RetrievingFiles {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demoDB","root","123456");
			Statement statement;
			statement = conn.createStatement();
			ResultSet rs;
			rs = statement.executeQuery("select * from users");
			int id;
			String email;
			String password;
			while(rs.next()) {
				id = rs.getInt("id");
				email = rs.getString("email");
				password = rs.getString("password");
				System.out.println(id + " " + email + " " + password);
			}
			rs.close();
			statement.close();
			conn.close();
		} catch(Exception ex) {
			ex.printStackTrace();
			
		}
	}
}
