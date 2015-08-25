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
		
		User authenticatedUser = UserDAO.login(receivedUser);
		
		
		
		
		
		if(authenticatedUser.getId() > 0){
			returnVal = "success";
			userSession.put("id", authenticatedUser.getId());
			userSession.put("name", authenticatedUser.getName());
			userSession.put("plantID", authenticatedUser.getPlantid());
			userSession.put("role", authenticatedUser.getRole());
			
		}
		
		
		
		System.out.println(userSession.get("id"));
		System.out.println(userSession.get("name"));
		
		
		
	
		
		return returnVal;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		userSession = session ; 
		
	}
}
