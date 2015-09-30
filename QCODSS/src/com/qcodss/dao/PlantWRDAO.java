package com.qcodss.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qcodss.db.DB;
import com.qcodss.model.PlantWR;
import com.qcodss.model.Style;

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
	   
	   
	   //Get Old week reports by weekno
	   public static List<PlantWR> getOldRecordsByWeek(int weekNo , int plantID, int year ){
		   Session session = DB.getSessionFactory().openSession();
		   Transaction tx = null;
		   List<PlantWR> plantWR = null;
		   
		   try{
			   tx = session.beginTransaction();
			   plantWR = session.createQuery("FROM PlantWR pw WHERE pw.week = '" + weekNo + "' and pw.plant= '" + plantID + "'  and pw.year= '" + year + "' ").list();
			   tx.commit();
		   }catch (HibernateException e) {
			   if (tx!=null) tx.rollback();
			   e.printStackTrace(); 
		   }finally {
			   session.close(); 
		   }
		   
		   return plantWR;
	   } 
}
