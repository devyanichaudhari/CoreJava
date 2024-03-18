package com.eb.model;

public class Student {
	private int id;
	private String sname;
	private Course course;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String sname, Course course) {
		super();
		this.id = id;
		this.sname = sname;
		this.course = course;
	}
	public void disp()
	{
		System.out.println("id"+" "+sname);
		System.out.println(course.toString());
	}
}
