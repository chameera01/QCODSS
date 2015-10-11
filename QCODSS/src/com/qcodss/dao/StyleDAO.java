package com.qcodss.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.qcodss.db.DB;
import com.qcodss.model.Style;

public class StyleDAO {

	   /* Method to CREATE a STYLE
	    * (return boolean true or false) 
	    */
	   public boolean addStyle(Style style) {
		   
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
   
	   /* Method to get a STYLE
	    * (return Style Object ) 
	    */
	   
	   public Style getStyle(String styleNo){
		   
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
	   
	   /* Method to get all STYLEs
	    * (return Style list Object ) 
	    */
	   
	   public List<Style> getAllStyles( ){
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
	   
	   //This method is to return number of months style has been inserted during an year
	   public int getNumofMonthes(int year){
		   List numberOfMonthes;
		   Session session = DB.getSessionFactory().openSession();
		   Transaction tx = null;
		   int number = 0 ;
		   
		   try{
			   tx = session.beginTransaction();
			   //numberOfMonthes = session.createQuery("FROM Style s WHERE year(s.startDate)= '" + year + "'  ");
			   numberOfMonthes = (session.createQuery("select count(*) from Style s WHERE year(s.startDate)= '" + year + "' group by month(s.startDate)  ")).list();
			   
			  
			  number = numberOfMonthes.size();
		
			   
			   tx.commit();
		   }catch (HibernateException e) {
			   if (tx!=null) tx.rollback();
			   e.printStackTrace(); 
		   }finally {
			   session.close(); 
		   }
		   
		   
		   return number;
	   }
	   
	   
	   public List<Style> getAllStylesByWeek(int weekNo , int plantID, int year ){
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
	   
	   public List<Style> getAllStylesByMonth(int month , int plantID, int year ){
		   Session session = DB.getSessionFactory().openSession();
		   Transaction tx = null;
		   List<Style> allStyles = null;
		   
		   try{
			   tx = session.beginTransaction();
			   allStyles = session.createQuery("FROM Style s WHERE month(s.startDate)= '" + month + "' and s.plant= '" + plantID + "'  and year(s.startDate)= '" + year + "' ").list();
			   tx.commit();
		   }catch (HibernateException e) {
			   if (tx!=null) tx.rollback();
			   e.printStackTrace(); 
		   }finally {
			   session.close(); 
		   }
		   
		   return allStyles;
	   } 
	   
	   /* Method to get STYLEs filtered by a week range, year, plantID
	    * @param : plantID -> possible value formats -> "*", "1", "1,2,3"
	    * @return : Style list Object
	    */
	   public List<Style> getStylesbyWeeksPlants(String fromWeek, String toWeek, String year, String plantID){
		   
		   // plant condition ( "1=1" indicates "all" )
		   String whereClause_1;
		   if("*".equals(plantID)){
			   whereClause_1 = " 1=1 " ;
		   } else{
			   whereClause_1 = " s.plant IN (" +plantID+ ") " ;
		   }
		   
		   // week condition
		   String whereClause_2 = " s.weekNo between " +fromWeek+ "and " +toWeek+ "";
		   
		   Session session = DB.getSessionFactory().openSession();
		   Transaction tx = null;
		   List<Style> allStyles = null;
		   
		   try{
			   tx = session.beginTransaction();
			   allStyles = session.createQuery("FROM Style s WHERE " +whereClause_1+ " and "+whereClause_2+" and year(s.startDate)= '" +year+ "' ").list();
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
