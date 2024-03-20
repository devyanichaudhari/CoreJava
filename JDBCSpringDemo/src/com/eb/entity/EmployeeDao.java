package com.eb.entity;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao 
{
	private JdbcTemplate jdbcTemplate;
	public void setJdbctemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int saveEmployee(Employee e)
	{
		String query = "insert into employee values("+e.getEmpId()+","+e.getEmpName()+","+e.getSalary()+")";
		return jdbcTemplate.update(query);
	}
	public List<Employee> employee()
	{
		String query1 = "select * from employee";
		List<Employee> employee = jdbcTemplate.query(query1, new EmployeeMapper());
		return employee;
	}
}
