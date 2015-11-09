package com.qcodss.struts;

import java.util.Date;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.qcodss.dao.StyleDAO;
import com.qcodss.model.Style;

public class FinishStyleAction implements SessionAware{
public String styleNo;
public Date datepicker;
	
	Style style;
	private Map<String, Object> userSession ;
	
	public String execute(){
		String returnVal = "error";
		styleNo = (String) userSession.get("styleNo");
		
		StyleDAO styleDao = new StyleDAO();
		
		style = styleDao.getStyle(styleNo);
		
		style.setFinishDate(datepicker);
		
		
		boolean value = styleDao.addStyle(style);
		
		if(value){
			returnVal = "success";
		}
		
		return returnVal;
	}	
	
	@Override
	public void setSession(Map<String, Object> session) {
		userSession = session ; 
		
	}
	
}
