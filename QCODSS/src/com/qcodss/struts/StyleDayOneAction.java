package com.qcodss.struts;


import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.qcodss.model.Style;

public class StyleDayOneAction implements SessionAware {
	
	public String dayOneClocked;
	public String dayOneProduced;
	public String dayOneTotalInspected;
	public String dayOneTotalPassed;
	public String styleNo;
	
	Style style;
	private Map<String, Object> userSession ;
	
	public String execute(){
		String returnVal = "success";
		
		
		//System.out.println(userSession.get("id"));
		
		
		return returnVal;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		userSession = session ; 
		
	}
	
}
