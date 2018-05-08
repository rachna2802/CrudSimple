package com.tm.model.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tm.model.Employee;
import com.tm.model.Dao.EmployeeDao;

public class InsertTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
EmployeeDao dao=(EmployeeDao)ctx.getBean("d");  

Employee e=new Employee();  
e.setEmp_id(114);  
e.setEmp_name("varun");  
//e.setSalary(50000);  
  
dao.saveEmployee(e);  
  
	}

}
