package com.eb.dao;

import java.sql.*;
import java.util.*;

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
			String query = "insert into product(pname,price,pquantity) values(?,?,?)";
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
	public static boolean update() 
	{
		try
		{
			boolean f = false;
			Connection conn = CP.createc();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Product Id You want to Update:");
			int id = sc.nextInt();
			System.out.println("Enter the Product Name You want to Update:");
			String  name  = sc.next();
			System.out.println("Enter the Product Price You want to Update:");
			int price = sc.nextInt();
			System.out.println("Enter the Product Quantity You want to Update:");
			int quantity = sc.nextInt();
			String sql1 = "update product set pname='"+name+"',price='"+price+"', pquantity='"+quantity+"' where pid="+id;
			PreparedStatement ps = conn.prepareStatement(sql1);
			ps.executeUpdate();
			f = true;
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
		ps.setInt(1, pid);
		ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
}
