package com.qcodss.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qcodss.db.DB;
import com.qcodss.model.Plant;

public class PlantDAO {

	   public Integer addPlant(String name){
		   
		   Session session = DB.getSession();
		   Transaction tx = null;
		   Integer plantID = null;
		   try{
			   tx = session.beginTransaction();
			   Plant plant = new Plant();
			   
			   plant.setName(name);
			 
			   plantID = (Integer) session.save(plant); 
			   tx.commit();
		  }catch (HibernateException e) {
			  if (tx!=null) tx.rollback();
			  e.printStackTrace(); 
		  }finally {
			  session.close(); 
		  }
		  return plantID;
	   }	
}
