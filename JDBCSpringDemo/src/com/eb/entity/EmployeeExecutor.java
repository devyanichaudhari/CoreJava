package com.eb.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeExecutor {

	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("bean.xml");
		EmployeeDao emp = (EmployeeDao) app.getBean("edao");
		int status = emp.saveEmployee(new Employee(101,"Devyai",56000.0f));
		System.out.println(status);
	}

}
