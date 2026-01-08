package com.Static.crud;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class MainRunner2 {

	public static void main(String[] args) {
		
		Session ses=HibernateUtil.getfactory().openSession();
		
		Transaction tx=ses.beginTransaction();
		
		Banking b=new Banking("rani");
		
		Banking b1=new Banking("Surya");
		ses.persist(b1);
		
		b.setId(1);
		b.setName("kartik");
		ses.merge(b);
		
		tx.commit();
	
		
	}

}
