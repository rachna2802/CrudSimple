package com.tm.model.Dao;

import java.util.List;

import javax.sql.DataSource;

import com.tm.model.Employee;

public interface EmpDaoIntf {
	public void setDataSource(DataSource ds);
	   
	   /** 
	      * This is the method to be used to create
	      * a record in the Student table.
	   */
	   public void create(String name, Integer id);
	   
	   /** 
	      * This is the method to be used to list down
	      * a record from the Student table corresponding
	      * to a passed student id.
	   */
	   public Employee getEmployee(Integer id);
	   
	  
	   
	   public void updateEmployee(int empid);
	   
	   public List<Employee> listEmployee();

	void deleteEmployee(Integer empId);

	void create(Employee employee);
	   
}
