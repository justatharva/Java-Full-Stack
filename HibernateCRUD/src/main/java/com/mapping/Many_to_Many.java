package com.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Many_to_Many {
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Employes e1 = new Employes();
		e1.setEmp_name("John");
		
		Employes e2 = new Employes();
		e2.setEmp_name("Karan");
		
		Employes e3 = new Employes();
		e3.setEmp_name("Atharva");
		
		List<Employes> elist = new ArrayList<Employes>();
		elist.add(e1);
		elist.add(e2);
		elist.add(e3);
		
		Projects p1 = new Projects();
		p1.setProj_name("Banking");
		
		Projects p2 = new Projects();
		p2.setProj_name("Shopping");
		
		List<Projects> plist = new ArrayList<Projects>();
		plist.add(p1);
		plist.add(p2);
		
		e1.setProj(plist);
		e2.setProj(plist);
		e3.setProj(plist);
		
		p1.setEmp(elist);
		p2.setEmp(elist);
		
		session.persist(e1);
		session.persist(e2);
		session.persist(e3);
		session.persist(p1);
		session.persist(p2);
		
		tx.commit();
		session.close();
	}
}
