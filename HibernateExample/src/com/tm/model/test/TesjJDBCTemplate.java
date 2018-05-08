package com.tm.model.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tm.JDBCTemplate.EmpJDBCTemplate;
import com.tm.model.Employee;

public class TesjJDBCTemplate {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");

		EmpJDBCTemplate  EmployeeJDBCTemplate=(EmpJDBCTemplate)context.getBean("empJDBCTemplate");
	      
	      System.out.println("------Records Creation--------" );
	      EmployeeJDBCTemplate.create("Zara", 11);
	      EmployeeJDBCTemplate.create("Nuha", 2);
	      EmployeeJDBCTemplate.create("Ayan", 15);

	      System.out.println("------Listing Multiple Records--------" );
	      List<Employee> Employees = EmployeeJDBCTemplate.listEmployee();
	      
	     /* for (Employee record : Employees) {
	         System.out.print("ID : " + record.getEmp_id());
	         System.out.print(", Name : " + record.getEmp_name());
	       //  System.out.println(", Age : " + record.getAge());
	      }*/

	      System.out.println("----Updating Record with ID = 2 -----" );
	     // EmployeeJDBCTemplate.updateEmployee(empid);

	      System.out.println("----Listing Record with ID = 106 -----" );
	      Employee Employee = EmployeeJDBCTemplate.getEmployee(106);
	      System.out.print("ID : " + Employee.getEmp_id() );
	      System.out.print(", Name : " + Employee.getEmp_name() );
	      //System.out.println(", Age : " + Employee.getAge());
	   
	}	// TODO Auto-generated method stub

	

}
