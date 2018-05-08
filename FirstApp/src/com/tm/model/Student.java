package com.tm.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="student")
public class Student {
	private int emp_id;
	public Student(int emp_id, String emp_name, int age) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.age = age;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private String emp_name;
	private int age;
	public Student() {
		// TODO Auto-generated constructor stub
	}

}
