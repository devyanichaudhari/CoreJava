package com.eb.entity;

import javax.persistence.*;

@Entity
@Table(name="employeeinfo")
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "empid")
	private int id;
	@Column(name = "empName")
	private String empName;
	@Column(name = "empAge")
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Employee(String empName, int age) {
		super();
		this.empName = empName;
		this.age = age;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", age=" + age + "]";
	}

}
