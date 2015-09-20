package com.qcodss.struts;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.qcodss.dao.StyleDAO;
import com.qcodss.model.Style;

public class StyleDayThreeAction implements SessionAware{
	public Double dayThreeClocked;
	public Double dayThreeProduced;
	public Double dayThreeTotalInspected;
	public Double dayThreeTotalPassed;
	public String styleNo;
	
	Style style;
	private Map<String, Object> userSession ;
	
	
	public String execute(){
		String returnVal = "error";
		
		styleNo = (String) userSession.get("styleNo");
		
		style = StyleDAO.getStyle(styleNo);
		
		
		style.setClockedHrs_3(dayThreeClocked);
		style.setProducedHrs_3(dayThreeProduced);
		style.setTotalInspected_3(dayThreeTotalInspected);
		style.setTotalFTT_3(dayThreeTotalPassed);
		
		
		
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
