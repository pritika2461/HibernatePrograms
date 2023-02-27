package com.assignments;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppTest 
{
	public static void main(String[] args)
	{
		
		// Creating the Configration object
	    Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	
    	
    	// Build the session factory
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	
    	// create object of student class
    	Student s1=new Student();
    	s1.setId(1);
    	s1.setName("Pritika");
    	
    	
    	// create object of laptop class
    	Laptop l = new Laptop();
    	l.setLID(101);
    	l.setLname("Lenovo");
    	
    	
    	s1.setLaptop(l);
    	l.setStudent(s1);
    	
    	// Open the session
    	Session session = factory.openSession();
    	
    	// Begin the transaction
    	Transaction tx = session.beginTransaction();
    	
    	// save the session s1
    	session.save(s1);
    	
    	// save the session l
    	session.save(l);
    	
    	tx.commit();
    	
    	// closing session and factory transation
    	session.close();
    	factory.close();
    	
    	
	}

}
