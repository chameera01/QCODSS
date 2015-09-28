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
	
	public static List<ActiveBaseline> getActiveBaseline(int year){
		
		List<ActiveBaseline> AB = null;
		Session session = DB.getSessionFactory().openSession();
		Transaction tx = null;
		
		try {
			tx = session.beginTransaction();
			AB = session.createQuery("FROM ActiveBaseline Where year= '" +year+ "' ").list();
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		
		
		return AB;
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

	/*	method return list of years for which active baseline records were setup
	 *  @return -> list(String) of year
	 */
	public static List<Integer> getAllABYears() {
		Session session = DB.getSessionFactory().openSession();
		Transaction tx = null;
		List<Integer> allABYears = null;

		try {
			tx = session.beginTransaction();
			allABYears = session.createQuery("SELECT ab.year FROM ActiveBaseline ab GROUP BY ab.year").list();
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

		return allABYears;
	}

}
