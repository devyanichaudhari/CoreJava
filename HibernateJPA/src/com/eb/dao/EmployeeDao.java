package com.eb.dao;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.eb.entity.Employee;
import com.eb.main.HibernateUtil;

public class EmployeeDao 
{
	public Integer addEmployee(String fname,String lname,int salary)
	{
		 Session session = HibernateUtil.getSessionFactory().openSession();
		 Transaction tx = session.beginTransaction();
		 Integer employeeId=null;
		 try
		 {
			 Employee e = new Employee(fname,lname,salary);
			 session.save(e);
			 tx.commit();
			 session.close();
		 }
		 catch(Exception ex)
		 {
			 ex.printStackTrace();
		 }
		return employeeId;
	}
	public List<Employee> getEmployeeList()
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		List<Employee> li = session.createCriteria(Employee.class).list();
		session.close();
		return li;
	}
	public void deleteEmployee(int id)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Employee e = session.get(Employee.class, id);
		session.delete(e);
		tx.commit();
		session.close();
	}
	public void updateEmployee(Employee e)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(e);
		tx.commit();
		session.close();
	}
	public Employee getEmployeeById(int id)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Employee e = null;
		e = session.get(Employee.class, id);
		return e;
	}
}
