package com.test.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static final SessionFactory SESSION_FACTORY = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {

		try {
			return new Configuration().configure().buildSessionFactory();
		} catch (Throwable t) {
			System.err.println("Error initializing hibernate Session Factory" + t);
			throw new ExceptionInInitializerError(t);
		}
	}

	public static SessionFactory getSessionFactory() {
		return SESSION_FACTORY;
	}

	public static void shutdown() {
		getSessionFactory().close();
	}
}
