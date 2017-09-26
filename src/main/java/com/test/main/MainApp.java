package com.test.main;

import java.util.Date;

import org.hibernate.Session;

import com.test.entity.DBUser;
import com.test.hibernate.util.HibernateUtil;

public class MainApp {

	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		DBUser user = new DBUser(123, "MK USER", "SYSTEM", new Date());
		session.save(user);
		session.getTransaction().commit();
	
	}
}
