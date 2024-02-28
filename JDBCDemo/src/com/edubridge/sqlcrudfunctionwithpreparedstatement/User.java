package com.edubridge.sqlcrudfunctionwithpreparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class User {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		// STEP 1 - LOAD THE JDBC DRIVER
		Class.forName("com.mysql.cj.jdbc.Driver");
		// STEP 2 - CONNECTION	
		String url = "jdbc:mysql://localhost:3306/Usermanagement";
		String user = "root";
		String password = "root";
				
		//STEP 3 - CALL DRIVER MANAGER
		Connection conn = DriverManager.getConnection(url,user,password);
		
		String sql = "insert into user(uid,uname,location) values(?,?,?)";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setInt(1, 101);
		ps.setString(2, "Devyani");
		ps.setString(3,"Dombivli");
		
		int i = ps.executeUpdate();
		
		System.out.println(i+" Rows Affected");
		System.out.println("Data inserted Successfully");
	}

}
