package com.eb.entity;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee e1 = new Employee();
		e1.setEmpId(rs.getInt("id"));
		e1.setEmpName(rs.getString("name"));
		e1.setSalary(rs.getFloat("salary"));
		return e1;
	}

}
