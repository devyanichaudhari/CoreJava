package com.eb.annotationclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Executor {

	public static void main(String[] args) {
		ApplicationContext app= new AnnotationConfigApplicationContext("com.eb.annotationclass");
		Info i = app.getBean(Info.class);
		i.disp("Devyani");
	}

}
