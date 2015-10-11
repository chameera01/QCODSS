package com.qcodss.struts;

import java.util.Date;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.qcodss.dao.StyleDAO;
import com.qcodss.model.Style;

public class FinishStyleAction implements SessionAware{
public String styleNo;
	
	Style style;
	private Map<String, Object> userSession ;
	
	public String execute(){
		String returnVal = "success";
		styleNo = (String) userSession.get("styleNo");
		
		StyleDAO styleDao = new StyleDAO();
		
		style = styleDao.getStyle(styleNo);
		
		Date date = new Date();
		System.out.println(date);
		
		return returnVal;
	}	
	
	@Override
	public void setSession(Map<String, Object> session) {
		userSession = session ; 
		
	}
	
}
