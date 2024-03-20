package com.eb.main;

import org.springframework.context.ApplicationContext;
import com.eb.context.ContextProvider;
import com.eb.dao.StudentDao;
import com.eb.entity.Student;

public class App {

	public static void main(String[] args) {
		System.out.println( "Hello World!" );
	    
	    ApplicationContext ctx= ContextProvider.provideContext();
	    StudentDao studentDao=ctx.getBean("stDao",StudentDao.class);
	    // insert
	    Student s=new Student(101,"Devyani");
	    studentDao.insert(s);
	    studentDao.getAllStudent();
	    System.out.println(s.getName()+" "+s.getId());

	}

}
