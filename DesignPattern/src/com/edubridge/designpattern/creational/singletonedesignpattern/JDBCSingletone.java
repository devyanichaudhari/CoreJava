package com.edubridge.designpattern.creational.singletonedesignpattern;

import java.sql.*;

public class JDBCSingletone {
	private  static JDBCSingletone jdbc;
	private JDBCSingletone() { }
	public static JDBCSingletone getInstance()
	{
		if(jdbc == null)
		{
			jdbc = new JDBCSingletone();
		}
		return jdbc;
	}
	private static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Connection con =  null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/singletone","root","root");
		return con;
	}
	@SuppressWarnings("static-access")
	public int insert(String name,String pass,int id) throws SQLException
	{
		Connection c=null;
		PreparedStatement ps = null;
		int recordCounter = 0;
		try
		{
			c = this.getConnection();
			String query = "insert into employee(empid,euname,epass) values(?,?,?)";
			ps = c.prepareStatement(query);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, pass);
			recordCounter = ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(ps!=null)
			{
				ps.close();
			}
			if(c!=null)
			{
				c.close();
			}
		}
		return recordCounter;
	}
	@SuppressWarnings("static-access")
	public void view() throws SQLException
	{
		Connection c=null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try
		{
			c = this.getConnection();
			String sql = "select * from employee";
			ps=c.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next())
			{
				System.out.println("Id "+rs.getInt(1)+"\tName "+rs.getString(2)+"\tPassword "+rs.getString(3));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(ps!=null)
			{
				ps.close();
			}
			if(c!=null)
			{
				c.close();
			}
		}
	}
	@SuppressWarnings("static-access")
	public int update(int id,String pass,String name) throws SQLException
	{
		Connection c=null;
		PreparedStatement ps = null;
		int recordCounter = 0;
		try
		{
			c = this.getConnection();
			String query = "update employee set euname=?,epass=? where empid=?";
			ps = c.prepareStatement(query);
			ps.setString(1, name);
			ps.setString(2, pass);
			ps.setInt(3, id);
			recordCounter = ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(ps!=null)
			{
				ps.close();
			}
			if(c!=null)
			{
				c.close();
			}
		}
		return recordCounter;
	}
	public int delete(int userid) throws SQLException
	{
		Connection c=null;
		PreparedStatement ps = null;
		int recordCounter = 0;
		try 
		{
			c = this.getConnection();
			ps = c.prepareStatement("delete from employee where empid = ?");
			ps.setInt(1, userid);
			recordCounter = ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(ps!=null)
			{
				ps.close();
			}
			if(c!=null)
			{
				c.close();
			}
		}
		return recordCounter;
	}
}
