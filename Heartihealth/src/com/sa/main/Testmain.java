package com.sa.main;

import org.hibernate.Session;
//import org.hibernate.SessionFactory;

import com.sa.heartihealth.HibernateUtil;
import com.sa.heartihealth.MemberInfo;
import com.sa.heartihealth.addressinfo;


public class Testmain {
	public static void main(String[] args) {
		
	
			Session session = HibernateUtil.getSessionFactory().openSession();
			
			session.beginTransaction();
			
			//session.persist();
			session.getTransaction().commit();

			session.close();
	}

}
