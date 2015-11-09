package com.qcodss.struts;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;


import com.qcodss.dao.UserDAO;

import com.qcodss.model.User;



public class LoginAction implements SessionAware {
	public String email,password;

	private Map<String, Object> userSession ;
	
	
	public String execute(){
		String returnVal = "error";
		
		
		
		
		User receivedUser = new User();
		receivedUser.setEmail(email);
		receivedUser.setPassword(password);
		
		UserDAO userDao = new UserDAO();
		
		User authenticatedUser = userDao.login(receivedUser);
		
		
		
		
		
		if(authenticatedUser.getId() > 0){
			returnVal = "success";
			userSession.put("id", authenticatedUser.getId());
			userSession.put("name", authenticatedUser.getName());
			userSession.put("plantID", authenticatedUser.getPlantid().getId());
			userSession.put("role", authenticatedUser.getRole());
			
		}
		
		
		
		System.out.println("id : " + userSession.get("id"));
		System.out.println("name : " + userSession.get("name"));
		System.out.println("plantID : " + userSession.get("plantID"));
		System.out.println("User role :" + userSession.get("role"));
		
		
	
		
		return returnVal;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		userSession = session ; 
		
	}
}
