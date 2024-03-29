package com.qcodss.dao;


import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


import com.qcodss.db.DB;
import com.qcodss.model.User;


public class UserDAO {
	   
	   /* Method to CREATE an User in the database 
	    * (return boolean true or false)
	    */
	   public boolean addUser(User user) {
		   
		   Session session = DB.getSessionFactory().openSession();
		   Transaction tx = null;
		   try {
			   tx = session.beginTransaction();
			   session.save(user); 
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
	   
	   
	   public boolean deleteUser(User user) {
		   
		   Session session = DB.getSessionFactory().openSession();
		   Transaction tx = null;
		   try {
			   tx = session.beginTransaction();
			   session.delete(user); 
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
	   
	   
	   /* Method to  GET all the Users (return list of all users) */
	   public List<User> getAllUsers( ){
		   Session session = DB.getSessionFactory().openSession();
		   Transaction tx = null;
		   List<User> allUsers = null;
		   
		   try{
			   tx = session.beginTransaction();
			   allUsers = session.createQuery("FROM User").list();
			   tx.commit();
		   }catch (HibernateException e) {
			   if (tx!=null) tx.rollback();
			   e.printStackTrace(); 
		   }finally {
			   session.close(); 
		   }
		   
		   return allUsers;
	   }
	   
	   public User findUserByID(int id){
		   Session session = DB.getSessionFactory().openSession();
		   Transaction tx = null;
		   List<User> userList = null;
		   User user = null;
		   
		   try{
			   tx = session.beginTransaction();
			   userList = session.createQuery("FROM User u WHERE u.id = " + id + "  ").list();
			   tx.commit();
			   
			   for(User u:userList){
				   if(u != null) {
					   user = u;
				   }
				}
			   
		   }catch (HibernateException e) {
			   if (tx!=null) tx.rollback();
			   e.printStackTrace(); 
		   }finally {
			   session.close(); 
		   }
		   
		   return user;
	   }
	   
	   
	   public User login (User receivedUser){
		   
		   User returnUser = new User();
		   
		   Session session = DB.getSessionFactory().openSession();
		   Transaction tx = null;
		   List<User> list = null;
		   
		   try{
			   tx = session.beginTransaction();
			   list = session.createQuery("from User u Where u.email='" + receivedUser.getEmail() + "' AND u.password= '"+ receivedUser.getPassword()+"' ").list();	 
			   
			   tx.commit();
		  }catch (HibernateException e) {
			  if (tx!=null) {
				  try {
					  tx.rollback();					  
				  } catch(Exception re) {
					  System.err.println("Error when trying to rollback transaction: ");
					  re.printStackTrace();
				  }
				  
			  }
			  e.printStackTrace();
			  
			  
		  }finally {
			  session.close();
		  }
		   
		   if(list.isEmpty()==false){
			   for(User usr:list){
					returnUser.setId(usr.getId());	
					returnUser.setName(usr.getName());
					returnUser.setEmail(usr.getEmail());
					returnUser.setPlantid(usr.getPlantid());
					returnUser.setRole(usr.getRole());
				}
		   }
		   
		   
		   return returnUser;
	   }
	   
}
