package com.eb.main;

import org.hibernate.*;

import com.eb.entity.Employee;

public class App {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmpName("Devyani");
		e1.setAge(24);
		SessionFactory sessionFactory = null;
		Session session = null;
		sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(e1);
		session.getTransaction().commit();
		session.close();
	}

}
