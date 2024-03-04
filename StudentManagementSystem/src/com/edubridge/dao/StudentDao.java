package com.edubridge.dao;
import java.sql.*;
import com.edubridge.database.CP;
import com.edubridge.pojo.Student;

public class StudentDao 
{
	public static boolean insertStudentData(Student s)
	{
		try
		{
			@SuppressWarnings("unused")
			boolean f = false;
			Connection conn = CP.createc();
			String query = "insert into student(sname,sphone,scity)values(?,?,?)";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, s.getStudentName());
			ps.setString(2, s.getStudentPhone());
			ps.setString(3, s.getStudentCity());
			ps.executeUpdate();
			f=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	public static boolean updateStudentData(int val,String toUpdate,int id,Student s)
	{
		@SuppressWarnings("unused")
		boolean f = false;
		try
		{
			Connection conn = CP.createc();
			if(val==1)
			{
				// To Update Name
				String query = "update student set sname = ? where sid = ?";
				PreparedStatement ps = conn.prepareStatement(query);
				ps.setString(1, toUpdate);
				ps.setInt(2, id);
				ps.executeUpdate();
				f=true;
			}
			else if(val==2)
			{
				// To Update Name
				String query = "update student set sphone = ? where sid = ?";
				PreparedStatement ps = conn.prepareStatement(query);
				ps.setString(1, toUpdate);
				ps.setInt(2, id);
				ps.executeUpdate();
				f=true;
			}
			if(val==3)
			{
				// To Update Name
				String query = "update student set scity = ? where sid = ?";
				PreparedStatement ps = conn.prepareStatement(query);
				ps.setString(1, toUpdate);
				ps.setInt(2, id);
				ps.executeUpdate();
				f=true;
			}
			else
			{
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	public static boolean deleteStudentData(int id)
	{
		@SuppressWarnings("unused")
		boolean f = false;
		try
		{
			Connection conn = CP.createc();
			String query = "delete from student where sid = ?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			ps.executeUpdate();
			f=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	public static void showAllStudentData()
	{
		@SuppressWarnings("unused")
		boolean f = false;
		try
		{
			Connection conn = CP.createc();
			String query = "select * from student";
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next())
			{
				int id=rs.getInt(1);
				String name = rs.getString(2);
				String phone = rs.getString(3);
				String city = rs.getString(4);
				System.out.println("Student ID\t"+"Student Name"+"\tStudent Phone"+"\tStudent City");
				System.out.println("    "+id+"\t\t"+name+"\t\t"+phone+"\t"+city);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
