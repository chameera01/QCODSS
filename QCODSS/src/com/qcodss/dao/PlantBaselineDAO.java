package com.qcodss.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qcodss.db.DB;
import com.qcodss.model.PlantBaseline;



public class PlantBaselineDAO {
	 public static boolean addPlantBaseline(PlantBaseline pb) {
		   
		   Session session = DB.getSessionFactory().openSession();
		   Transaction tx = null;
		   try {
			   tx = session.beginTransaction();
			   session.save(pb); 
			   tx.commit();
		  } catch (HibernateException e) {
			  if (tx!=null) tx.rollback();
			  e.printStackTrace();
			  
			  return false;
		  } finally {
			  session.close();
		  }
		   
		  return true;
	   }
	 
	 public static List<PlantBaseline> getAllPlantBaselines( ){
		   Session session = DB.getSessionFactory().openSession();
		   Transaction tx = null;
		   List<PlantBaseline> allPB = null;
		   
		   try{
			   tx = session.beginTransaction();
			   allPB = session.createQuery("FROM PlantBaseline").list();
			   tx.commit();
		   }catch (HibernateException e) {
			   if (tx!=null) tx.rollback();
			   e.printStackTrace(); 
		   }finally {
			   session.close(); 
		   }
		   
		   return allPB;
	   }
}
