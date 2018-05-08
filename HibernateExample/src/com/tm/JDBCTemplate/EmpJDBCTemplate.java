package com.tm.JDBCTemplate;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.tm.model.Employee;
import com.tm.model.Dao.EmpDaoIntf;


public class EmpJDBCTemplate implements EmpDaoIntf{
	   private DataSource dataSource;
	   private JdbcTemplate jdbcTemplateObject;

	@Override
	public void setDataSource(DataSource ds) {
		// TODO Auto-generated method stub
		this.dataSource=ds;
		jdbcTemplateObject=new JdbcTemplate(ds);
		
	}

	@Override
	public void create(Employee employee) {
		// TODO Auto-generated method stub
		
		String sql="insert into employee values(?,?)";
		jdbcTemplateObject.update(sql, new Object[] { employee.getEmp_id(),
				
				                employee.getEmp_name() 
				
				        });
		// System.out.println("Created Record Name = " + name + " id = " + id);
	     return;
	}

	@Override
	public Employee getEmployee(Integer id) {
		String sql="select * from employee where emp_id=?";
		Employee emp=(Employee)jdbcTemplateObject.queryForObject(sql,  new Object[]{id},new EmployeeRowMapper());
		return emp;
	}

	@Override
	public void deleteEmployee(Integer empId) {
		// TODO Auto-generated method stub
		
		String sql="delete from employee where emp_id=?";
		int sucess=jdbcTemplateObject.update(sql, new Object[] { empId,
				
                     });
	      System.out.println("Deleted Record with ID = " + empId );
	      return;
		
	}

	@Override
	public void updateEmployee(int empid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> listEmployee() {
		String sql="select * from employee";
		List<Employee> emplist=(List<Employee>) jdbcTemplateObject.queryForObject(sql,  new EmployeeRowMapper());
		return emplist;
	}

	@Override
	public void create(String name, Integer id) {
		// TODO Auto-generated method stub
		
	}

}
