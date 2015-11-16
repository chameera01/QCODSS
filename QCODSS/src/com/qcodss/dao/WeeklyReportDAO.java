package com.qcodss.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qcodss.db.DB;
import com.qcodss.reportmodels.WeeklyReport;

public class WeeklyReportDAO {
	 public Integer addWeeklyReport(WeeklyReport wr){
		   
		   Session session = DB.getSessionFactory().openSession();
		   Transaction tx = null;
		   
		   try{
			   tx = session.beginTransaction();
			   session.saveOrUpdate(wr);
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
	 
	
	 
	 public Integer getReportID(int year, int plantID, int weekNo){
		 int reportID = 0;
		 
		 Session session = DB.getSessionFactory().openSession();
		 Transaction tx = null;
		 List<Integer> idList = null;
		 
		 
		 try{
			   tx = session.beginTransaction();
			   idList = session.createQuery("SELECT w.id FROM  WeeklyReport w WHERE w.year = '" + year + "' and  w.weekNo = '" + weekNo + "' and  w.plantID = '" + plantID + "'  ").list();
			   tx.commit();
			   if(idList.equals(null)==false){
				   for(Integer id:idList){
					   reportID = id;
					   System.out.println("rpt id :" + reportID);
					}
			   }
		   }catch(HibernateException e){
			   if (tx!=null) tx.rollback();
				e.printStackTrace(); 
		   }
		   finally {
				  session.close();
		   }
		 
		 return reportID;
	 }
	 
	 public WeeklyReport getWeeklyReport(int id){
		 WeeklyReport wr = new WeeklyReport();
		 Session session = DB.getSessionFactory().openSession();
		 Transaction tx = null;
		 List<WeeklyReport> reportList = null;
		 
		  try{
			   tx = session.beginTransaction();
			   reportList = session.createQuery("FROM  WeeklyReport w WHERE w.id = '" + id + "' ").list();
			   tx.commit();
			   
			   for(WeeklyReport weekReport:reportList){
				   wr = weekReport;
				}
			   
		   }catch(HibernateException e){
			   if (tx!=null) tx.rollback();
				e.printStackTrace(); 
		   }
		   finally {
				  session.close();
		   }
		 
		 return wr;
	 }
}
