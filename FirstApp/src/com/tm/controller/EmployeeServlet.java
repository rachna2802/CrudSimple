package com.tm.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tm.model.Dao.EmployeeDao;

public class EmployeeServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
	PrintWriter out = response.getWriter();
	ApplicationContext ctx=new ClassPathXmlApplicationContext("resources/applicationcontext.xml");
	EmployeeDao dao=(EmployeeDao)ctx.getBean("emp");
	List empList=dao.getEmployees();
	request.setAttribute("emplist", empList);
	RequestDispatcher rd=request.getRequestDispatcher("/listemployee.jsp");
	rd.forward(request, response);
	
	}
     
     
}
