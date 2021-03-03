package com.orm.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.orm.model.Member;
import com.orm.resource.HibernateUtil;

public class mainTest {
	static SessionFactory factory = HibernateUtil.getSessionFactory();
	
	public static void main(String[] args) {
		Member member = new Member("yskim", "1234");
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		session.save(member);
		session.getTransaction().commit();
		
		//crud를 만들어보자
//https://examples.javacodegeeks.com/enterprise-java/hibernate/hibernate-eclipse-postgresql-example
		
		

	}

}
