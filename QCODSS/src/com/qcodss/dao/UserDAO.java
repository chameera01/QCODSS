package com.qcodss.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qcodss.db.DB;
import com.qcodss.model.User;

public class UserDAO {
	   
	   /* Method to CREATE an User in the database (return the generated user id) */
	   public Integer addUser(User u){
		   
		   Session session = DB.getSession();
		   Transaction tx = null;
		   try{
			   tx = session.beginTransaction();
			   User user = new User();
			   
			   user.setName(u.getName());
			   user.setEmail(u.getEmail());
			   user.setPassword(u.getPassword());
			   user.setProfile_pic(u.getProfile_pic());
			   user.setRole(u.getRole());
			   user.setPlantid(u.getPlantid());
			 
			   session.save(user); 
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
	   
	   /* Method to  GET all the Users (return list of all users) */
	   public List<User> getAllUsers( ){
		   Session session = DB.getSession();
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
	   
	   /* Method to  FIND an User by id (return list of all users) */
	   public User findUserByID(int id){
		   Session session = DB.getSession();
		   Transaction tx = null;
		   List<User> userList = null;
		   User user = null;
		   
		   try{
			   tx = session.beginTransaction();
			   userList = session.createQuery("FROM User u WHERE u.id = " + id + "  ").list();
			   tx.commit();
			   
			   for(User u:userList){
				   user = u;
				}
			   
		   }catch (HibernateException e) {
			   if (tx!=null) tx.rollback();
			   e.printStackTrace(); 
		   }finally {
			   session.close(); 
		   }
		   
		   return user;
	   }
	   
}
