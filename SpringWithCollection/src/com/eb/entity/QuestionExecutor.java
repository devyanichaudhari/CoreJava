package com.eb.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuestionExecutor {

	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("bean2.xml");
		Question q = (Question) app.getBean("q1");
		q.disp();

	}

}
