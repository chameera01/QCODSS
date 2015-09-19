package com.qcodss.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qcodss.db.DB;
import com.qcodss.model.ActiveBaseline;


public class ActiveBaselineDAO {

	public static boolean addActiveBaseline(ActiveBaseline ab) {

		Session session = DB.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(ab);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();

			return false;
		} finally {
			session.close();
		}

		return true;
	}

	public static List<ActiveBaseline> getAllActiveBaselines() {
		Session session = DB.getSessionFactory().openSession();
		Transaction tx = null;
		List<ActiveBaseline> allAB = null;

		try {
			tx = session.beginTransaction();
			allAB = session.createQuery("FROM ActiveBaseline").list();
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

		return allAB;
	}
}
