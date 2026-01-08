package com.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainRunner2 {

	public static void main(String[] args) {

		//Create the configuration
		Configuration config=new Configuration();
		//load the xml file 
		config.configure("Hibernate1.cfg.xml");
		
		//create the sessionFactory
		SessionFactory Factory=config.buildSessionFactory();
		
		
		//create the session to communicate with the data base
		Session ses=Factory.openSession();
		
		Transaction tx=ses.beginTransaction();
		Student s=new Student(1,"kartik",23);
		
//		ses.persist(s);
		s.setAge(29);
//		ses.merge(s);
		ses.remove(s);
		
		tx.commit();
		tx.rollback();
	}
	

}
