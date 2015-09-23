package com.qcodss.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qcodss.db.DB;
import com.qcodss.model.Style;

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
			   
			   
			   if(styleList.isEmpty()){
				   

				   style=null;
				   return style;
			   }
			   
			   for(Style s:styleList){
				   style = s;
				   System.out.println("style : "+style);
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
	   
	   public static List<Style> getAllStyles( ){
		   Session session = DB.getSessionFactory().openSession();
		   Transaction tx = null;
		   List<Style> allStyles = null;
		   
		   try{
			   tx = session.beginTransaction();
			   allStyles = session.createQuery("FROM Style").list();
			   tx.commit();
		   }catch (HibernateException e) {
			   if (tx!=null) tx.rollback();
			   e.printStackTrace(); 
		   }finally {
			   session.close(); 
		   }
		   
		   return allStyles;
	   }  
	   
	   public static List<Style> getAllStylesByWeek(int weekNo , int plantID, int year ){
		   Session session = DB.getSessionFactory().openSession();
		   Transaction tx = null;
		   List<Style> allStyles = null;
		   
		   try{
			   tx = session.beginTransaction();
			   allStyles = session.createQuery("FROM Style s WHERE s.weekNo = '" + weekNo + "' and s.plant= '" + plantID + "'  and year(s.startDate)= '" + year + "' ").list();
			   tx.commit();
		   }catch (HibernateException e) {
			   if (tx!=null) tx.rollback();
			   e.printStackTrace(); 
		   }finally {
			   session.close(); 
		   }
		   
		   return allStyles;
	   }  
	   
	   
}
