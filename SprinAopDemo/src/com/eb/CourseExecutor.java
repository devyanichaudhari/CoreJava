package com.eb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CourseExecutor {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
		Course cc = (Course) context.getBean("c1");
		System.out.println("Calling Method...");
		cc.getCusId();
		cc.getCusName();
	}

}
