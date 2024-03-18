package com.eb.entity;
import javax.persistence.*;

@Entity
@Table(name = "Employee")
public class Employee 
{
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int id;
	@Column(name = "FirstName")
	private String firstName;
	@Column(name = "LastName")
	private String lastName;
	@Column(name = "Salary")
	private int salary;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(String firstName, String lastName, int salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
}
