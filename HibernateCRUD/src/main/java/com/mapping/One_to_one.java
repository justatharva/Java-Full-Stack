package com.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class One_to_one {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Questions q1 = new Questions();
		q1.setQuestion("What is JAVA ?");
		
		Questions q2 = new Questions();
		q2.setQuestion("What is HTML ?");
		
		Questions q3 = new Questions();
		q3.setQuestion("What is CSS ?");
		
		Answers answer1 = new Answers();
		answer1.setAnswer("Java is High level Programming language");
		
		Answers answer2 = new Answers();
		answer2.setAnswer("HTML is HyperText Markup Language");
		
		Answers answer3 = new Answers();
		answer3.setAnswer("CSS is Cascading Style Sheet");
		
		q1.setAnswer(answer1);
		q2.setAnswer(answer2);
		q3.setAnswer(answer3);
		
		answer1.setQuestion(q1);
		answer2.setQuestion(q2);
		answer3.setQuestion(q3);
		
		session.persist(q1);
		session.persist(q2);
		session.persist(q3);
//		session.persist(answer1);
//		session.persist(answer2);
//		session.persist(answer3);
		
		
		tx.commit();
		session.close();
	}
}
