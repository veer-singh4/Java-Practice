package com.sa.main;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sa.entity.User;

public class TestMain {
	public static void main(String[] args) {
		User u1=new User();
		u1.setUserName("Sandhya");
		u1.setAge(26);
		
		//get Configuration
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		//get sessionfactory
		SessionFactory sf=cfg.buildSessionFactory();
		
		//get session
		Session session=sf.openSession();
		
		//get transaction
		Transaction tx=session.beginTransaction();
		
		session.save(u1); //insert the data in db
		System.out.println("User is saved");
		tx.commit();
		session.close();
		sf.close();
	}

}
