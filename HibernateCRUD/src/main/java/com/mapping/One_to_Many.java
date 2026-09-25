package com.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class One_to_Many {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Teacher t1 = new Teacher();
		t1.setTname("Pramod");
		
		Students s1 = new Students();
		s1.setSname("Atharva");
		
		Students s2 = new Students();
		s2.setSname("Rushi");
		
		Students s3 = new Students();
		s3.setSname("Karan");
		
		List<Students> slist = new ArrayList<Students>();
		slist.add(s1);
		slist.add(s2);
		slist.add(s3);
		
		t1.setList(slist);
		
		s1.setTeacher(t1);
		s2.setTeacher(t1);
		s3.setTeacher(t1);
		
		session.persist(t1);
		session.persist(s1);
		session.persist(s2);
		session.persist(s3);
		
		tx.commit();
		session.close();
	}
}
