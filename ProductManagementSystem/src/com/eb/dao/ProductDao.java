package com.eb.dao;

import java.sql.*;

import com.eb.database.CP;
import com.eb.pojo.Product;

public class ProductDao 
{
	public static boolean insert(Product p)
	{
		boolean f = false;
		try
		{
			Connection conn = CP.createc();
			String query = "insert into product(pname,price,pquantity) into(?,?,?)";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, p.getProductName());
			ps.setInt(2, p.getProductPrice());
			ps.setInt(3, p.getProductQuantity());
			ps.executeUpdate();
			f=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	public static void display() 
	{
		try 
		{
		Connection conn = CP.createc();
		String sql = "select * from product";
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		System.out.println("Product ID\t"+"Product Name"+"\tProduct Price "+"\tProduct Quantity");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+rs.getString(2)+rs.getInt(3)+rs.getInt(4));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static boolean update(Product p) 
	{
		try
		{
			Connection conn = CP.createc();
			String sql1 = "update product set pname=?,price,pquantity where pid=?";
			PreparedStatement ps = conn.prepareStatement(sql1);
			ps.setString(1, p.getProductName());
			ps.setInt(2, p.getProductPrice());
			ps.setInt(3, p.getProductQuantity());
			ps.setInt(4, p.getProductId());
			ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	public static boolean delete(int pid)
	{
		try
		{
		Connection conn = CP.createc();
		String sql2 = "delete from product where pid = ? ";
		PreparedStatement ps = conn.prepareStatement(sql2);
		ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
}
