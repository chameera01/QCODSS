package com.qcodss.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qcodss.db.DB;
import com.qcodss.model.Style;
import com.qcodss.model.User;

public class StyleDAO {

	   /* Method to CREATE a STYLE in the database 
	    * (return boolean true or false) 
	    */
	   public static boolean addStyle(Style style) {
		   
		   Session session = DB.getSessionFactory().openSession();
		   Transaction tx = null;
		   try {
			   tx = session.beginTransaction();
			   session.saveOrUpdate(style); 
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

	   public static Style findStyleByID(String id){
		   Session session = DB.getSessionFactory().openSession();
		   Transaction tx = null;
		   List<Style> styleList = null;
		   Style style = null;
		   
		   try{
			   tx = session.beginTransaction();
			   styleList = session.createQuery("FROM Style s WHERE s.id = " + id + "  ").list();
			   tx.commit();
			   
			   for(Style s:styleList){
				   if(s != null) {
					   style = s;
				   }
				}	
			   
		   }catch (HibernateException e) {
			   if (tx!=null) tx.rollback();
			   e.printStackTrace(); 
		   }finally {
			   session.close(); 
		   }
		   
		   return style;
		}
	   
	   /* Method to get a STYLE from the database 
	    * (return Style Object ) 
	    */
	   
	   public static Style getStyle(String styleNo){
		   
		   Session session = DB.getSessionFactory().openSession();
		   Transaction tx = null;
		   Style style = new Style();
		   List<Style> styleList = null;
		   
		   try{
			   tx = session.beginTransaction();
			   styleList = session.createQuery("FROM Style s WHERE s.style_no = '" + styleNo + "'   ").list();
			   tx.commit();
			   
			   for(Style s:styleList){
				   style = s;
				}
			   
		   }catch(HibernateException e){
			   if (tx!=null) tx.rollback();
				e.printStackTrace(); 
		   }
		   finally {
				  session.close();
		   }
		   
		   
		   return style;
	   }
	   
	   
}
