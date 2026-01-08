package com.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainRunner1 {

	public static void main(String[] args) {
		
		
	Configuration config=new Configuration();
	config.configure("hibernate.cfg.xml");
	
	SessionFactory ses=config.buildSessionFactory();
	Session se=ses.openSession();
	Transaction tx=se.beginTransaction();
	
	
	}

}
