package com.eb.model;


public class Course 
{
	private int id;
	private String name;


	private String duration;
	private int fees;
	public Course(int id, String name, String duration, int fees) {
		super();
		this.id = id;
		this.name = name;
		this.duration = duration;
		this.fees = fees;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", duration=" + duration + ", fees=" + fees + "]";
	}
	
}
