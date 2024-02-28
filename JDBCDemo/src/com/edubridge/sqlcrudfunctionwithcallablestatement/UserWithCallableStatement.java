package com.edubridge.sqlcrudfunctionwithcallablestatement;

import java.sql.*;

public class UserWithCallableStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{// STEP 1 - LOAD THE JDBC DRIVER
		Class.forName("com.mysql.cj.jdbc.Driver");
		// STEP 2 - CONNECTION	
		String url = "jdbc:mysql://localhost:3306/Usermanagement";
		String user = "root";
		String password = "root";
				
		//STEP 3 - CALL DRIVER MANAGER
		Connection conn = DriverManager.getConnection(url,user,password);
		
		String sql = "insert into user(uid,uname,location) values(?,?,?)";
		
		CallableStatement cs = conn.prepareCall(sql);
		cs.setInt(1, 102);
		cs.setString(2, "Yukta");
		cs.setString(3,"Delhi");
		cs.execute();
		System.out.println("Data inserted Successfully");
	}

}
