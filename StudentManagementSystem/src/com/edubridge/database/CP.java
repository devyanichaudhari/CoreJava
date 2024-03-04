package com.edubridge.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP 
{
	static Connection con;
	public static Connection createc()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/miniproject";
			String username="root";
			String password="root";
			con=DriverManager.getConnection(url,username,password);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	return con;
	}
}
