package com.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Entity.Employe;
import com.utility.HibernateUtils;

public class EmpDao implements EmpInterface{

	@Override
	public void insertData(Employe employe) {
		Session session = HibernateUtils.factory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(employe);
		tx.commit();
		session.close();
	}

	public List<Employe> getEmployes() {
		Session session = HibernateUtils.factory.openSession();
		Transaction tx = session.beginTransaction();
		List<Employe> list = session.createQuery("from Employe").list();
		return list;
	}

	public Employe getEmploye(int id) {
		Session session = HibernateUtils.factory.openSession();
		Transaction tx = session.beginTransaction();
		Employe employe = session.get(Employe.class, id);
		tx.commit();
		session.close();
		return employe;		
		
	}

	public void updateData(Employe employe) {
		Session session = HibernateUtils.factory.openSession();
		Transaction tx = session.beginTransaction();
		session.merge(employe);
		tx.commit();
		session.close();		
	}

	public void deleteData(int id) {
		Session session = HibernateUtils.factory.openSession();
		Transaction tx = session.beginTransaction();
		Employe employe = session.get(Employe.class, id);
		
		if(employe != null) {
			session.remove(employe);
		}
		tx.commit();
		session.close();		
	}

}
