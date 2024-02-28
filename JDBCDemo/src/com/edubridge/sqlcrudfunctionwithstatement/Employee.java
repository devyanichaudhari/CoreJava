package com.edubridge.sqlcrudfunctionwithstatement;

import java.sql.*;

public class Employee {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// STEP 1 - LOAD THE JDBC DRIVER
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// STEP 2 - CONNECTION
		
		String url = "jdbc:mysql://localhost:3306/Management";
		String user = "root";
		String password = "root";
		
		//STEP 3 - CALL DRIVER MANAGER
		 Connection conn = DriverManager.getConnection(url,user,password);
		 
		 System.out.println("Collecting Data from Employee Table");
		 
		 //The object is used for executing the static SQL statement
		 
		 Statement stmt = conn.createStatement();
		 
		 String sql = "select * from employee";
		 
		 ResultSet res = stmt.executeQuery(sql);
		 while(res.next())
		 {
			 int empID = res.getInt("id");
			 String empName = res.getString("name");
			 int empAge = res.getInt("age");
			 
			 System.out.println(empID+"\t"+empName+"\t\t"+empAge);
		 }
	}

}
