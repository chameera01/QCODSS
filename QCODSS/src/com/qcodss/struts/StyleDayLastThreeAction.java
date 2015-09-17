package com.qcodss.struts;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.qcodss.dao.StyleDAO;
import com.qcodss.model.Style;

public class StyleDayLastThreeAction implements SessionAware{
	public Double dayLastThreeClocked;
	public Double dayLastThreeProduced;
	public Double dayLastThreeTotalInspected;
	public Double dayLastThreeTotalPassed;
	
	public String styleNo;
	
	Style style;
	private Map<String, Object> userSession ;
	
	public String execute(){
		String returnVal = "error";
		styleNo = (String) userSession.get("styleNo");
		
		style = StyleDAO.getStyle(styleNo);
		
		
		style.setClockedHrs_3d(dayLastThreeClocked);
		style.setProducedHrs_3d(dayLastThreeProduced);
		style.setTotalInspected_3d(dayLastThreeTotalInspected);
		style.setTotalFTT_3d(dayLastThreeTotalPassed);
		
		
		
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
