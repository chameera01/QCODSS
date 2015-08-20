package com.qcodss.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qcodss.db.DB;
import com.qcodss.model.Plant;

public class PlantDAO {

	   public Integer addPlant(Plant p){
		   
		   Session session = DB.getSession();
		   Transaction tx = null;
		   Plant plant = new Plant();
		   try{
			   tx = session.beginTransaction();
			   plant.setName(p.getName());
			 
			   //plantID = (Integer) session.save(plant); 
			   session.save(plant);
			   tx.commit();
		  }catch (HibernateException e) {
			  if (tx!=null) tx.rollback();
			  e.printStackTrace(); 
		  }finally {
			  session.close(); 
		  }
		  return 1;
	   }	
}
