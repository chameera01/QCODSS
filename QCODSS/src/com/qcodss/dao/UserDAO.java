package com.qcodss.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qcodss.db.DB;
import com.qcodss.model.User;
import com.qcodss.model.Plant;

public class UserDAO {
	   
	   /* Method to CREATE an User in the database (return the generated user id) */
	   public Integer addUser(String name, String email, String password, String profile_pic, String role, Plant plantid){
		   
		   Session session = DB.getSession();
		   Transaction tx = null;
		   Integer userID = null;
		   try{
			   tx = session.beginTransaction();
			   User user = new User();
			   
			   user.setName(name);
			   user.setEmail(email);
			   user.setPassword(password);
			   user.setProfile_pic(profile_pic);
			   user.setRole(role);
			   user.setPlantid(plantid);
			 
			   userID = (Integer) session.save(user); 
			   tx.commit();
		  }catch (HibernateException e) {
			  if (tx!=null) tx.rollback();
			  e.printStackTrace(); 
		  }finally {
			  session.close(); 
		  }
		  return userID;
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
