package com.qcodss.struts;

import java.util.List;

import com.qcodss.dao.UserDAO;
import com.qcodss.model.User;


public class ViewUsersAction {
	
	String returnVal = "success";
	
	
	public List<User> allUsers = null;
	
	public String execute(){
		
		UserDAO userDao = new UserDAO();
		
		allUsers = userDao.getAllUsers();
		
		
		
		return returnVal;
	}
	
	
}
