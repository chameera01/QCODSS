package com.qcodss.struts;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.qcodss.dao.StyleDAO;
import com.qcodss.model.Style;

public class StyleDayFiveAction implements SessionAware{
	
	public Double dayFiveClocked;
	public Double dayFiveProduced;
	public Double dayFiveTotalInspected;
	public Double dayFiveTotalPassed;
	public String styleNo;
	
	Style style;
	private Map<String, Object> userSession ;
	
	
	public String execute(){
		String returnVal = "error";
		styleNo = (String) userSession.get("styleNo");
		
		style = StyleDAO.getStyle(styleNo);
		
		
		style.setClockedHrs_5(dayFiveClocked);
		style.setProducedHrs_5(dayFiveProduced);
		style.setTotalInspected_5(dayFiveTotalInspected);
		style.setTotalFTT_5(dayFiveTotalPassed);
		
		
		
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
