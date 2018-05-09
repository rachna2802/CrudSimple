package com.tm.service;

import java.io.IOException;
import java.util.List;


import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.map.ObjectMapper;

import com.tm.model.Student;
import com.tm.model.Dao.StudentDao;

@Path("students")
public class StudentRsService {

public StudentRsService() {

}
@GET
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,MediaType.TEXT_PLAIN})
public List<Student> getStudents(@QueryParam("from") int from,
		@QueryParam("to") int to,
		@QueryParam("orderBy") List<String> orderBy ){
	if(from>=0 && to>=0){
	
	}
	List<Student> studentList=StudentDao.getStudents();
	return studentList;
	
}
@GET
@Path("/{id}")
@Produces({MediaType.APPLICATION_JSON,MediaType.TEXT_PLAIN}) 
public Student getStudent(@PathParam("id")int id){
	Student student=StudentDao.getById(id);
	return student;
	
}
@POST
@Produces({MediaType.TEXT_PLAIN,MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
public void addStudent(Student stud){
	//ObjectMapper objectMapper = new ObjectMapper();
	Student student;
	try {
		//student = objectMapper.readValue(stud, Student.class);
		 StudentDao.saveStudent(stud);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  
	
	 
}

@DELETE
@Produces({MediaType.TEXT_PLAIN,MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
public void deleteStudent(Student student){
	 StudentDao.deleteStudent(student);
}
@DELETE
@Path("/{id}")
@Produces({MediaType.TEXT_PLAIN,MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
public void deleteStudent(@PathParam("id")int id){
	 StudentDao.deleteStudentbyId(id);
}
}
