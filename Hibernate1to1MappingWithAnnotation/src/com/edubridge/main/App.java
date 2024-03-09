package com.edubridge.main;

import java.util.Date;


import org.hibernate.Session;
import org.hibernate.Transaction;
import com.edubridge.entity.Applicant;
import com.edubridge.entity.Passport;

public class App {

	public static void main(String[] args) {
		System.out.println("Mapping One To One Relationship");
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Passport p = new Passport();
		Applicant a = new Applicant();
		a.setName("Devyani");
		a.setCity("Dombivli");
		a.setAge(24);
		a.setPassport(p);
		p.setPassportNumber("India234");
		p.setIssuedate(new Date());
		p.setExpirydate(new Date());
		p.setApplicant(a);
		session.save(p);
		t.commit();
		session.close();
		System.out.println("Data Stored Successfully");
	}

}
