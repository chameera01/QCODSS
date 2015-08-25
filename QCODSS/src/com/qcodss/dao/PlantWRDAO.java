package com.qcodss.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qcodss.db.DB;
import com.qcodss.model.PlantWR;

public class PlantWRDAO {

	   /* Method to CREATE a Plant Weekly Record(PlantWR) in the database 
	    * (return boolean true or false) 
	    */
	   public static boolean addPlantWR(PlantWR plantWR) {
		   
		   Session session = DB.getSessionFactory().openSession();
		   Transaction tx = null;
		   try {
			   tx = session.beginTransaction();
			   session.save(plantWR); 
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
}
