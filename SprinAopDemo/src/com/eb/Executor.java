package com.eb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Executor {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
		Swiggy ts=(Swiggy)context.getBean("sw");
		System.out.println("Calling Methods");
		ts.welcome();
		ts.vegMenu();
		ts.starterMenu();
		ts.nonVegMenu();
	}
}