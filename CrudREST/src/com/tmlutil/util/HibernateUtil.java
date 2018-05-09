package com.tmlutil.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	public HibernateUtil() {
		// TODO Auto-generated constructor stub
	}
	  private static final SessionFactory sessionFactory;
	    static {
	        try {
	            sessionFactory = new Configuration().configure("/resources/hibernate.cfg.xml")
	                    .buildSessionFactory();
	        } catch (Throwable ex) {
	            System.err.println("SessionFactory creation failed" + ex);
	            throw new ExceptionInInitializerError(ex);
	        }
	    }
	 
	    public static SessionFactory getSessionFactory() {
	        return sessionFactory;
	    }
	}


