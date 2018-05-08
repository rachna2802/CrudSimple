package com.tm.JDBCTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tm.model.Employee;

public class EmployeeRowMapper implements RowMapper{

	
	public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
	   emp.setEmp_id(rs.getInt("emp_id"));
	   emp.setEmp_name(rs.getString("emp_name"));
	      
	      return emp;
	}

}
