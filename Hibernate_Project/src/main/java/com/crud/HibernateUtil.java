package com.Static.crud;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static SessionFactory factory;
	static {
		factory= new Configuration().configure("Hibernate4.cfg.xml").buildSessionFactory();
	}
	
	public static SessionFactory getfactory()
	{
		return factory;
	}

}
