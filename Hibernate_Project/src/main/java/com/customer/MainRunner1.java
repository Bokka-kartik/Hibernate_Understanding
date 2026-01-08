package com.customer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainRunner1 {

	public static void main(String[] args) {

	
		Configuration config=new Configuration();
		
		config.configure("Hibernate2.cfg.xml");
		
		SessionFactory factory=config.buildSessionFactory();
		
		Session ses=factory.openSession();
		
		Customer cust=new Customer(3,"likki","phone");
		
		Customer cust1=new Customer(2,"kartik","pen");
		
		ses.persist(cust);
//		ses.merge(null);
//		ses.remove(cust);
		ses.persist(cust1);
		
		Transaction tx=ses.beginTransaction();
		
		tx.commit();;
	
	}

}
