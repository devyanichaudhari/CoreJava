package com.eb.model;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) 
	{
		ApplicationContext app = new ClassPathXmlApplicationContext("bean.xml");
		Student s = (Student) app.getBean("s1");
		s.disp();
	}

}
