package com.qcodss.struts;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.qcodss.dao.StyleDAO;
import com.qcodss.model.Style;

public class StyleLoadAction implements SessionAware{
	
	String styleNo; 
	
	private Map<String, Object> userSession ;
	
	public String execute(){
		
			String returnVal ="error";
			
			StyleDAO styleDao = new StyleDAO();
			Style style = styleDao.getStyle(styleNo);
			
			if(style != null){
				userSession.put("styleNo", style.getStyle_no());
				returnVal = "success";
			}
			
		
		return returnVal;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		userSession = session ; 
		
	}
	
	
}
