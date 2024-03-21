package com.eb;

import org.springframework.context.ApplicationContext;

import com.eb.beans.Student;
import com.eb.context.ContextProvider;
import com.eb.dao.StudentDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    
    ApplicationContext ctx= ContextProvider.provideContext();
    StudentDao studentDao=ctx.getBean("stDao",StudentDao.class);
    // insert
    Student s=new Student(104,"priya");
    studentDao.insert(s);
    studentDao.getAllStudents();
    System.out.println(s.getName()+" "+s.getId());
    
    
    }
    
}
