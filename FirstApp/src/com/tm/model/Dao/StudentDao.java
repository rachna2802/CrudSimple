package com.tm.model.Dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


import com.tm.model.Student;
import com.tmlutil.util.HibernateUtil;

public class StudentDao {
	//static HibernateTemplate template;
	public StudentDao() {
	}		// TODO Auto-generated constructor stub


	
		
		public static void saveStudent(Student emp){
			Session session=HibernateUtil.getSessionFactory().openSession();
			Transaction tx=null;
			try{
			tx=session.beginTransaction();
			
			session.save(emp);
			tx.commit();
			}catch(HibernateException e){
				tx.rollback();
				e.printStackTrace();
			}
			finally {
				session.close();
			}
			
		}
		public static void updateStudent(Student e){  
			Session session=HibernateUtil.getSessionFactory().openSession();
			Transaction tx=null;
			try{
			tx=session.beginTransaction();
		    session.update(e);  
		    tx.commit();
			}catch(HibernateException he){
				tx.rollback();
				he.printStackTrace();
			}
			finally {
				session.close();
			}
		    
		}  
		//method to delete Student  
		public static void deleteStudent(Student e){  
			Session session=HibernateUtil.getSessionFactory().openSession();
			Transaction tx=null;
			try{
			tx=session.beginTransaction();
		    session.delete(e);  
		    tx.commit();
			}catch(HibernateException he){
				tx.rollback();
				he.printStackTrace();
			}
			finally {
				session.close();
			}  
		}  
		public static void deleteStudentbyId(int  id){  
			Session session=HibernateUtil.getSessionFactory().openSession();
			Transaction tx=null;
			Student stud=null;
			try{
			tx=session.beginTransaction();
			stud=(Student)session.get(Student.class,id);  
		    session.delete(stud);  
		    tx.commit();
			}catch(HibernateException he){
				tx.rollback();
				he.printStackTrace();
			}
			finally {
				session.close();
			}  
		}  
		//method to return one Student of given id  
		public static Student getById(int id){ 
			Session session=HibernateUtil.getSessionFactory().openSession();
			Transaction tx=null;
			Student stud=null;
			try{
			tx=session.beginTransaction();
			 stud=(Student)session.get(Student.class,id);  
		   // return e;    
		    //tx.commit();
			}catch(HibernateException he){
				tx.rollback();
				he.printStackTrace();
			}
			finally {
				session.close();
			}
			return stud;
		    
		}  
		//method to return all Students  
		public  static List<Student> getStudents(){  
		    List<Student> list=new ArrayList<Student>(); 
		    Session session=HibernateUtil.getSessionFactory().openSession();
			Transaction tx=null;
			Student stud=null;
			try{
			tx=session.beginTransaction();
			list=session.createQuery("from Student").list();  
		   // return e;    
		    //tx.commit();
			}catch(HibernateException he){
				tx.rollback();
				he.printStackTrace();
			}
			finally {
				session.close();
			}
			return list;
		     
		   // return list;  
		}  
	

}
