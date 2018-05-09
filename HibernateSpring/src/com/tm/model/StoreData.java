package com.tm.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Configuration cfg=new Configuration();  
		    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
		      
		    //creating seession factory object  
		    SessionFactory factory=cfg.buildSessionFactory();  
		      
		    //creating session object  
		    Session session=factory.openSession();  
		      
		    //creating transaction object  
		    Transaction t=session.beginTransaction();  
		          
		    Employee e1=new Employee();  
		    //e1.setId(101);  
		    e1.setEmp_id(105);  
		    e1.setEmp_name("jaiswal");  
		      
		    session.save(e1);//persisting the object  
		      
		    t.commit();//transaction is committed  
		    session.close();  
		      
		    System.out.println("successfully saved");  
		      
	}

}
