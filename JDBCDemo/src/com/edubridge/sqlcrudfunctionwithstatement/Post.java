package com.edubridge.sqlcrudfunctionwithstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Post {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// STEP 1 - LOAD THE JDBC DRIVER
		Class.forName("com.mysql.cj.jdbc.Driver");
				
		// STEP 2 - CONNECTION
				
		String url = "jdbc:mysql://localhost:3306/Management";
		String user = "root";
		String password = "root";
				
		//STEP 3 - CALL DRIVER MANAGER
		Connection conn = DriverManager.getConnection(url,user,password);
		//The object is used for executing the static SQL statement
		 
		Statement stmt = conn.createStatement();
		/*		 
		System.out.println("Inserting Data In Post Table");
		
		String sql = "insert into post values(106,'CSRD','Comment CSRD')";
		
		stmt.execute(sql);
		
		System.out.println("Record Inserted Successfully!!");*/
		
		/*System.out.println("Updating Data In Post Table");
		
		String sql = "update post set postname = 'DRSD' where pid = 106";
		
		stmt.execute(sql);
		
		System.out.println("Record Updated Successfully!!");*/
		
		System.out.println("Deleting Data From Post Table");
		
		String sql = "delete from post where pid = 106";
		
		stmt.execute(sql);
		
		System.out.println("Record Deleted Successfully!!");
		
		System.out.println("Collecting Data from Post Table");
				 
		String sql1 = "select * from post";
				 
		ResultSet res = stmt.executeQuery(sql1);
		while(res.next())
		{
			int postId = res.getInt("pid");
			String postName = res.getString("postname");
			String postComment = res.getString("comments");
					
			System.out.println(postId+"\t"+postName+"\t"+postComment);
		}

	}

}
