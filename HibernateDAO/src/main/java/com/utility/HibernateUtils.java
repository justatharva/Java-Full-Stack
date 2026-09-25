package com.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	public static SessionFactory factory;
	static {
		factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	}
	public static SessionFactory getsSessionFactory() {
		return factory;
	}
}
