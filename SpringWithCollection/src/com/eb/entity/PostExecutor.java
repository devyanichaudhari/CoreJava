package com.eb.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PostExecutor 
{
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("bean.xml");
		Post p = (Post) app.getBean("p1");
		p.show();
	}
}
