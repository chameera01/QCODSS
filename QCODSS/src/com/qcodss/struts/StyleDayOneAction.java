package com.qcodss.struts;


import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.qcodss.dao.StyleDAO;
import com.qcodss.model.Style;

public class StyleDayOneAction implements SessionAware {
	
	public Double dayOneClocked;
	public Double dayOneProduced;
	public Double dayOneTotalInspected;
	public Double dayOneTotalPassed;
	public String styleNo;
	
	
	Style style;
	private Map<String, Object> userSession ;
	
	public String execute(){
		String returnVal = "error";
		
		styleNo = (String) userSession.get("styleNo");
		
		style = StyleDAO.getStyle(styleNo);
		
		
		style.setClockedHrs_1(dayOneClocked);
		style.setProducedHrs_1(dayOneProduced);
		style.setTotalInspected_1(dayOneTotalInspected);
		style.setTotalFTT_1(dayOneTotalPassed);
		
		
		
		boolean success = StyleDAO.addStyle(style);
		
		if(success){
			returnVal = "success";
		}
		
		
		
		
		return returnVal;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		userSession = session ; 
		
	}
	
}
