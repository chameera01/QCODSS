package com.qcodss.struts;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

public class LogoutAction implements SessionAware{
	
	
	private Map<String, Object> userSession ;
	
	public String execute(){
		String returnVal = "error";
		
		if(userSession != null){
			
			userSession.remove("id");
			userSession.remove("name");
			userSession.remove("plantID");
			userSession.remove("role");
			returnVal="success";
		}
		
		
		
		return returnVal;
	}
	
	@Override
	public void setSession(Map<String, Object> session) {
		 userSession = session ;
		 
	}
	
}
