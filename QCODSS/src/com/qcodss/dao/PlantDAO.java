package com.qcodss.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qcodss.db.DB;
import com.qcodss.model.Plant;
import com.qcodss.model.User;


public class PlantDAO {

	   public static Integer addPlant(Plant p){
		   
		   Session session = DB.getSessionFactory().openSession();
		   Transaction tx = null;
		   Plant plant = new Plant();
		   try{
			   tx = session.beginTransaction();
			   plant.setName(p.getName());			 
			   session.save(plant);
			   tx.commit();
		  }catch (HibernateException e) {
			  if (tx!=null) tx.rollback();
			  e.printStackTrace();
			  
			  return 0;
		  }finally {
			  session.close();
		  }
		  return 1;
	   }	
	   
	   /* Method to  GET all Plants (return list of all plants) */
	   public static List<Plant> getAllPlants( ) {
		   Session session = DB.getSessionFactory().openSession();
		   Transaction tx = null;
		   List<Plant> allPlants = null;
		   
		   try{
			   tx = session.beginTransaction();
			   allPlants = session.createQuery("FROM Plant").list();
			   tx.commit();
		   }catch (HibernateException e) {
			   if (tx!=null) tx.rollback();
			   e.printStackTrace(); 
		   }finally {
			   session.close(); 
		   }
		   
		   return allPlants;
	   }
	   
	   public static Plant getPlant(String plantName){
		   
		   Session session = DB.getSessionFactory().openSession();
		   Transaction tx = null;
		   Plant plant = new Plant();
		   List<Plant> plantList = null;
		   
		   try{
			   tx = session.beginTransaction();
			   plantList = session.createQuery("FROM Plant p WHERE p.name = '" + plantName + "'   ").list();
			   tx.commit();
			   
			   for(Plant p:plantList){
				   plant = p;
				}
			   
		   }catch(HibernateException e){
			   if (tx!=null) tx.rollback();
				e.printStackTrace(); 
		   }
		   finally {
				  session.close();
		   }
		   
		   
		   return plant;
	   }
}
